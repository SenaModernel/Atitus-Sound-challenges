package br.edu.atitus.atitusound.controllers;

import br.edu.atitus.atitusound.dtos.PlaylistDTO;
import br.edu.atitus.atitusound.entities.PlaylistEntity;
import br.edu.atitus.atitusound.services.GenericService;
import br.edu.atitus.atitusound.services.PlaylistService;

public class PlaylistController extends GenericController<PlaylistEntity, PlaylistDTO>{

	private final PlaylistService playlistService;
	
	public PlaylistController(PlaylistService playlistService) {
		super();
		this.playlistService = playlistService;
	}

	@Override
	public GenericService<PlaylistEntity> getService() {
		return playlistService;
	}

	@Override
	protected PlaylistEntity convertDTO2Entity(PlaylistDTO dto) {
		PlaylistEntity playlist = new PlaylistEntity();
		playlist.setName(dto.getName());
		playlist.setPublic_share(dto.getPublic_share());
		return playlist;
	}
	

}
