package br.edu.atitus.atitusound.servicesimpl;

import br.edu.atitus.atitusound.entities.PlaylistEntity;
import br.edu.atitus.atitusound.repositories.GenericRepository;
import br.edu.atitus.atitusound.repositories.PlaylistRepository;
import br.edu.atitus.atitusound.services.PlaylistService;

public class PlaylistServiceImpl implements PlaylistService {

	private final PlaylistRepository playlistRepository;
	
	public PlaylistServiceImpl(PlaylistRepository playlistRepository) {
		super();
		this.playlistRepository = playlistRepository;
	}

	@Override
	public GenericRepository<PlaylistEntity> getRepository() {
		return playlistRepository;
	}

}
