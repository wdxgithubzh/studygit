package org.ocpp.sse.dao;

import java.util.List;

import org.ocpp.sse.entity.Tariff;

public interface TariffDao extends BaseDao {
    /**
     * 获取单条数据
     * @param charging_station_id
     * @return
     */
    public List<Tariff> get(String charging_station_id);
}