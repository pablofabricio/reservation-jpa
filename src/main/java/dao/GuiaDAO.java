package dao;

import domain.TourGuide;

public class GuiaDAO extends DAO<TourGuide> {

    @Override
    protected String getSqlString() {
        return "select m from Guia g";
    }

    @Override
    protected Class getClassName() {
        return TourGuide.class;
    }
}
