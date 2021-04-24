package com.iut.as2021.dao;

public class MySqlDaoFactory extends MySqlDao {
	
	@Override
	public IDaoMathResult getDaoMathResult() {
		return new MySqlDao();
	}

}
