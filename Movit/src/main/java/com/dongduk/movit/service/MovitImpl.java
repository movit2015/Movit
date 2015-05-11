package com.dongduk.movit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dongduk.movit.domain.Member;
import com.dongduk.movit.domain.StorageMv;
import com.dongduk.movit.domain.TasteGenre;
import com.dongduk.movit.domain.WishMv;
import com.dongduk.movit.jdbc.JdbcMvSelectDao;
import com.dongduk.movit.jdbc.JdbcMypageDao;


@Service

public class MovitImpl implements MovitFacade{
	@Autowired
	private JdbcMvSelectDao mvSelectDao;
	
	@Autowired
	private JdbcMypageDao mypageDao;

	@Override
	public void insertStorage(StorageMv s_mv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(Member mem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertWish(WishMv w_mv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTasteGenre(TasteGenre t_genre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WishMv getWish(int memberIdx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StorageMv> getStorageList(int memberIdx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getPreferDirector(int memberIdx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getPreferNation(int memberIdx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getPreferGenre(int memberIdx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalTime(int memberIdx) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Double> getRateInfo(int memberIdx) {
		// TODO Auto-generated method stub
		return null;
	}



}
