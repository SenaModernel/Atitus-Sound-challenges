package br.edu.atitus.atitusound.configs;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import br.edu.atitus.atitusound.entities.UserEntity;
import br.edu.atitus.atitusound.services.UserService;
import br.edu.atitus.atitusound.utils.JwtUtils;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class AuthTokenFilter extends OncePerRequestFilter{
	
	private final UserService userService;
	
	public AuthTokenFilter(UserService userService) {
		super();
		this.userService = userService;
	}


	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String jwt = JwtUtils.getJwtFromRequest(request);
		if (jwt != null && JwtUtils.validaJwtToken(jwt)) {
			String username = JwtUtils.getUserNameFromJwtToken(jwt);
			UserEntity user = (UserEntity) userService.loadUserByUsername(username);
			
			UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(user, null, null);
			
			auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
			
			SecurityContextHolder.getContext().setAuthentication(auth);
		}
		
		filterChain.doFilter(request, response);
		
	}

}
