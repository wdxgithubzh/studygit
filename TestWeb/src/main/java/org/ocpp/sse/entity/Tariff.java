package org.ocpp.sse.entity;

import org.ocpp.sse.enumtype.PeriodType;
import java.sql.Time;

//分时电价收费表
public class Tariff {

    private int id;
    private int chargeStationId;
    private Time startTime;
    private Time endTime;
    private float fee;
    private PeriodType periodType;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChargeStationId() {
        return this.chargeStationId;
    }

    public void setChargeStationId(int chargeStationId) {
        this.chargeStationId = chargeStationId;
    }

    public Time getStarTime() {
        return this.startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public float getFee() {
        return this.fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public PeriodType getPeriodType() {
        return this.periodType;
    }

    public void setPeriodType(PeriodType periodType) {
        this.periodType = periodType;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", chargeStationId='" + getChargeStationId() + "'" +
            ", startTime='" + getStarTime() + "'" +
            ", endTime='" + getEndTime() + "'" +
            ", fee='" + getFee() + "'" +
            ", periodType='" + getPeriodType() + "'" +
            "}"; 
    }

}