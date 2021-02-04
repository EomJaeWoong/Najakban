package com.web.blog.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.blog.dao.BandDao;
import com.web.blog.dto.Band;
import com.web.blog.dto.BandOpened;
import com.web.blog.dto.Crew;

@Service
public class BandServiceImpl implements BandService{
	@Autowired
	BandDao dao;
	
	@Override
	public Band getBandByName(String name) {
		return dao.getBandByName(name);
	}

	@Override
	public void opened(BandOpened req) {
		dao.opened(req);
	}

	@Override
	public void addcrew(String memberId, String bandId) {
		dao.addcrew(memberId, bandId);
	}

	@Override
	public HashMap<String, String> bandinfo(String bandId) {
		return dao.bandinfo(bandId);
	}

	@Override
	public List<HashMap<String, String>> bandmember(String bandId) {
		return dao.bandmember(bandId);
	}

	@Override
	public Crew getCrewById(String crewId) {
		return dao.getCrewById(crewId);
	}

	@Override
	public Crew getCrewBymemberId(String memberId) {
		return dao.getCrewBymemberId(memberId);
	}

	@Override
	public void mandatechief(String crewId) {
		dao.mandatechief(crewId);
	}

	@Override
	public void receivechief(String crewId) {
		dao.receivechief(crewId);
	}

	@Override
	public void withdrawband(String crewId) {
		dao.withdrawband(crewId);
	}

	@Override
	public void changesession(String crewId, String session) {
		dao.changesession(crewId, session);
	}

}
