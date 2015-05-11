package com.dongduk.movit.service;

import java.util.List;

import com.dongduk.movit.domain.Member;
import com.dongduk.movit.domain.StorageMv;
import com.dongduk.movit.domain.TasteGenre;
import com.dongduk.movit.domain.WishMv;

public interface MovitFacade {

	//from mvselectdao
	void insertStorage(StorageMv s_mv);
	
	void updateUser(Member mem);
	
	void insertWish(WishMv w_mv);

	void updateTasteGenre(TasteGenre t_genre);

	WishMv getWish(int memberIdx);

	List<StorageMv> getStorageList(int memberIdx);
	
	//from mypagedao
	List<String> getPreferDirector(int memberIdx);
	List<String> getPreferNation(int memberIdx);
	List<String> getPreferGenre(int memberIdx);

	int getTotalTime(int memberIdx);

	List<Double> getRateInfo(int memberIdx);
	
	//from service...
}
