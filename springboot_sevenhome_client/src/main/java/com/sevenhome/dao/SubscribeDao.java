package com.sevenhome.dao;

import static com.sevenhome.dao.SubscribeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.sevenhome.bean.po.Subscribe;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface SubscribeDao {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, subscribeName, subscribePhone, subscribeIntime, subscribeLeavetime, subscribeOrigin, subscribeDeposit, subscribeRoomrate, vipId, roomtypeId, employeeId, subscribePaytype, subscribeStatus);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Subscribe> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SubscribeResult")
    Optional<Subscribe> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SubscribeResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="subscribe_name", property="subscribeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="subscribe_phone", property="subscribePhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="subscribe_intime", property="subscribeIntime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="subscribe_leavetime", property="subscribeLeavetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="subscribe_origin", property="subscribeOrigin", jdbcType=JdbcType.INTEGER),
        @Result(column="subscribe_deposit", property="subscribeDeposit", jdbcType=JdbcType.DECIMAL),
        @Result(column="subscribe_roomrate", property="subscribeRoomrate", jdbcType=JdbcType.DECIMAL),
        @Result(column="vip_id", property="vipId", jdbcType=JdbcType.INTEGER),
        @Result(column="roomtype_id", property="roomtypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="employee_id", property="employeeId", jdbcType=JdbcType.INTEGER),
        @Result(column="subscribe_paytype", property="subscribePaytype", jdbcType=JdbcType.INTEGER),
        @Result(column="subscribe_status", property="subscribeStatus", jdbcType=JdbcType.INTEGER)
    })
    List<Subscribe> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, subscribe, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, subscribe, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Subscribe record) {
        return MyBatis3Utils.insert(this::insert, record, subscribe, c ->
            c.map(subscribeName).toProperty("subscribeName")
            .map(subscribePhone).toProperty("subscribePhone")
            .map(subscribeIntime).toProperty("subscribeIntime")
            .map(subscribeLeavetime).toProperty("subscribeLeavetime")
            .map(subscribeOrigin).toProperty("subscribeOrigin")
            .map(subscribeDeposit).toProperty("subscribeDeposit")
            .map(subscribeRoomrate).toProperty("subscribeRoomrate")
            .map(vipId).toProperty("vipId")
            .map(roomtypeId).toProperty("roomtypeId")
            .map(employeeId).toProperty("employeeId")
            .map(subscribePaytype).toProperty("subscribePaytype")
            .map(subscribeStatus).toProperty("subscribeStatus")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Subscribe record) {
        return MyBatis3Utils.insert(this::insert, record, subscribe, c ->
            c.map(subscribeName).toPropertyWhenPresent("subscribeName", record::getSubscribeName)
            .map(subscribePhone).toPropertyWhenPresent("subscribePhone", record::getSubscribePhone)
            .map(subscribeIntime).toPropertyWhenPresent("subscribeIntime", record::getSubscribeIntime)
            .map(subscribeLeavetime).toPropertyWhenPresent("subscribeLeavetime", record::getSubscribeLeavetime)
            .map(subscribeOrigin).toPropertyWhenPresent("subscribeOrigin", record::getSubscribeOrigin)
            .map(subscribeDeposit).toPropertyWhenPresent("subscribeDeposit", record::getSubscribeDeposit)
            .map(subscribeRoomrate).toPropertyWhenPresent("subscribeRoomrate", record::getSubscribeRoomrate)
            .map(vipId).toPropertyWhenPresent("vipId", record::getVipId)
            .map(roomtypeId).toPropertyWhenPresent("roomtypeId", record::getRoomtypeId)
            .map(employeeId).toPropertyWhenPresent("employeeId", record::getEmployeeId)
            .map(subscribePaytype).toPropertyWhenPresent("subscribePaytype", record::getSubscribePaytype)
            .map(subscribeStatus).toPropertyWhenPresent("subscribeStatus", record::getSubscribeStatus)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Subscribe> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, subscribe, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Subscribe> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, subscribe, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Subscribe> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, subscribe, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Subscribe> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, subscribe, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Subscribe record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(subscribeName).equalTo(record::getSubscribeName)
                .set(subscribePhone).equalTo(record::getSubscribePhone)
                .set(subscribeIntime).equalTo(record::getSubscribeIntime)
                .set(subscribeLeavetime).equalTo(record::getSubscribeLeavetime)
                .set(subscribeOrigin).equalTo(record::getSubscribeOrigin)
                .set(subscribeDeposit).equalTo(record::getSubscribeDeposit)
                .set(subscribeRoomrate).equalTo(record::getSubscribeRoomrate)
                .set(vipId).equalTo(record::getVipId)
                .set(roomtypeId).equalTo(record::getRoomtypeId)
                .set(employeeId).equalTo(record::getEmployeeId)
                .set(subscribePaytype).equalTo(record::getSubscribePaytype)
                .set(subscribeStatus).equalTo(record::getSubscribeStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Subscribe record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(subscribeName).equalToWhenPresent(record::getSubscribeName)
                .set(subscribePhone).equalToWhenPresent(record::getSubscribePhone)
                .set(subscribeIntime).equalToWhenPresent(record::getSubscribeIntime)
                .set(subscribeLeavetime).equalToWhenPresent(record::getSubscribeLeavetime)
                .set(subscribeOrigin).equalToWhenPresent(record::getSubscribeOrigin)
                .set(subscribeDeposit).equalToWhenPresent(record::getSubscribeDeposit)
                .set(subscribeRoomrate).equalToWhenPresent(record::getSubscribeRoomrate)
                .set(vipId).equalToWhenPresent(record::getVipId)
                .set(roomtypeId).equalToWhenPresent(record::getRoomtypeId)
                .set(employeeId).equalToWhenPresent(record::getEmployeeId)
                .set(subscribePaytype).equalToWhenPresent(record::getSubscribePaytype)
                .set(subscribeStatus).equalToWhenPresent(record::getSubscribeStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Subscribe record) {
        return update(c ->
            c.set(subscribeName).equalTo(record::getSubscribeName)
            .set(subscribePhone).equalTo(record::getSubscribePhone)
            .set(subscribeIntime).equalTo(record::getSubscribeIntime)
            .set(subscribeLeavetime).equalTo(record::getSubscribeLeavetime)
            .set(subscribeOrigin).equalTo(record::getSubscribeOrigin)
            .set(subscribeDeposit).equalTo(record::getSubscribeDeposit)
            .set(subscribeRoomrate).equalTo(record::getSubscribeRoomrate)
            .set(vipId).equalTo(record::getVipId)
            .set(roomtypeId).equalTo(record::getRoomtypeId)
            .set(employeeId).equalTo(record::getEmployeeId)
            .set(subscribePaytype).equalTo(record::getSubscribePaytype)
            .set(subscribeStatus).equalTo(record::getSubscribeStatus)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Subscribe record) {
        return update(c ->
            c.set(subscribeName).equalToWhenPresent(record::getSubscribeName)
            .set(subscribePhone).equalToWhenPresent(record::getSubscribePhone)
            .set(subscribeIntime).equalToWhenPresent(record::getSubscribeIntime)
            .set(subscribeLeavetime).equalToWhenPresent(record::getSubscribeLeavetime)
            .set(subscribeOrigin).equalToWhenPresent(record::getSubscribeOrigin)
            .set(subscribeDeposit).equalToWhenPresent(record::getSubscribeDeposit)
            .set(subscribeRoomrate).equalToWhenPresent(record::getSubscribeRoomrate)
            .set(vipId).equalToWhenPresent(record::getVipId)
            .set(roomtypeId).equalToWhenPresent(record::getRoomtypeId)
            .set(employeeId).equalToWhenPresent(record::getEmployeeId)
            .set(subscribePaytype).equalToWhenPresent(record::getSubscribePaytype)
            .set(subscribeStatus).equalToWhenPresent(record::getSubscribeStatus)
            .where(id, isEqualTo(record::getId))
        );
    }

    //根据预定人姓名查询预订表字段信息
    @Select("select subscribe_deposit,subscribe_roomrate from subscribe where subscribe_name=#{subscribeName} and id=#{id}")
    Subscribe getSubscribeByName(String subscribeName,Integer id);
}