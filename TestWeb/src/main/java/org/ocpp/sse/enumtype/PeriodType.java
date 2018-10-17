package org.ocpp.sse.enumtype;

/**
 * 时段类型。
 * 在华北地区，尖、峰、平、谷时段具体的时间划分是：
 * 7、8、9三个月(每日)：
 * 尖峰时段：18:00-21:00
 * 高峰时段：8:00-11:00 ; 21:00-23:00
 * 非峰谷(平)时段：7:00-8:00 ; 11:00-18:00
 * 低谷时段：23:00-7:00
 * 
 */
public enum PeriodType {
    Sharp,          //尖
    Peak,           //峰
    Flat,           //平
    Valley,         //谷
}