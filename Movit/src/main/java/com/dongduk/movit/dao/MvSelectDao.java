package com.dongduk.movit.dao;

import java.util.List;

import com.dongduk.movit.domain.Member;
import com.dongduk.movit.domain.StorageMv;
import com.dongduk.movit.domain.TasteGenre;
import com.dongduk.movit.domain.WishMv;

public interface MvSelectDao {

	void insertStorage(StorageMv s_mv);
	
	void updateUser(Member mem);
	
	void insertWish(WishMv w_mv);

	void updateTasteGenre(TasteGenre t_genre);

	WishMv getWish(int memberIdx);

	List<StorageMv> getStorageList(int memberIdx);

}
