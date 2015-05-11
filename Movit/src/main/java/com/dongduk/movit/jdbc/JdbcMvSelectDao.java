package com.dongduk.movit.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.dongduk.movit.dao.MvSelectDao;
import com.dongduk.movit.domain.Member;
import com.dongduk.movit.domain.StorageMv;
import com.dongduk.movit.domain.TasteGenre;
import com.dongduk.movit.domain.WishMv;

public class JdbcMvSelectDao extends JdbcDaoSupport implements MvSelectDao{

	private JdbcTemplate jdbcTemplate;
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	} 
	
	static final String INSERT_SQL = 
			"insert into GUESTBOOK_MESSAGE (GUEST_NAME, CONTENT) values (?, ?)";
	public void insertStorage(StorageMv s_mv) {
		getJdbcTemplate().update(INSERT_SQL,
		new Object[] { category.getCategoryId(), category.getName(), category.getDescription() });
	}

	void updateUser(Member mem);
	
	void insertWish(WishMv w_mv);

	void updateTasteGenre(TasteGenre t_genre);

	WishMv getWish(int memberIdx);

	List<StorageMv> getStorageList(int memberIdx);

}
