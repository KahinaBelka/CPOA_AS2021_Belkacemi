package com.iut.as2021.dao;

public abstract class DaoFactory {
	
	public static DaoFactory getDAOFactory(ETypeDao cible) {
		 DaoFactory daoF;
		switch (cible) {
		case MYSQL:
			daoF = new MySqlDaoFactory();
			break;
		case XML:
			daoF = null;
			break;
		}
		return daoF;
	}

	public abstract IDaoMathResult getDaoMathResult();

}
