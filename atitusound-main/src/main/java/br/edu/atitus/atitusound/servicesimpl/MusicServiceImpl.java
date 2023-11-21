package br.edu.atitus.atitusound.servicesimpl;

import br.edu.atitus.atitusound.entities.MusicEntity;
import br.edu.atitus.atitusound.repositories.GenericRepository;
import br.edu.atitus.atitusound.repositories.MusicRepository;
import br.edu.atitus.atitusound.services.MusicService;

public class MusicServiceImpl implements MusicService{

	private final MusicRepository musicRepository;
	
	public MusicServiceImpl(MusicRepository musicRepository) {
		super();
		this.musicRepository = musicRepository;
	}

	@Override
	public GenericRepository<MusicEntity> getRepository() {
		return musicRepository;
	}


}
