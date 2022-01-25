package com.sevenhome.dao;

import static com.sevenhome.dao.OrdersDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.sevenhome.bean.po.Orders;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
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
public interface OrdersDao {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, orderno, subscribeId, checkinId, orderTotalprice, orderStatus, orderGeneratetime, roomId);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Orders> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OrdersResult")
    Optional<Orders> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OrdersResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="orderno", property="orderno", jdbcType=JdbcType.VARCHAR),
        @Result(column="subscribe_id", property="subscribeId", jdbcType=JdbcType.INTEGER),
        @Result(column="checkin_id", property="checkinId", jdbcType=JdbcType.INTEGER),
        @Result(column="order_totalprice", property="orderTotalprice", jdbcType=JdbcType.DECIMAL),
        @Result(column="order_status", property="orderStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_generatetime", property="orderGeneratetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="room_id", property="roomId", jdbcType=JdbcType.INTEGER)
    })
    List<Orders> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, orders, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, orders, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Orders record) {
        return MyBatis3Utils.insert(this::insert, record, orders, c ->
            c.map(orderno).toProperty("orderno")
            .map(subscribeId).toProperty("subscribeId")
            .map(checkinId).toProperty("checkinId")
            .map(orderTotalprice).toProperty("orderTotalprice")
            .map(orderStatus).toProperty("orderStatus")
            .map(orderGeneratetime).toProperty("orderGeneratetime")
            .map(roomId).toProperty("roomId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Orders record) {
        return MyBatis3Utils.insert(this::insert, record, orders, c ->
            c.map(orderno).toPropertyWhenPresent("orderno", record::getOrderno)
            .map(subscribeId).toPropertyWhenPresent("subscribeId", record::getSubscribeId)
            .map(checkinId).toPropertyWhenPresent("checkinId", record::getCheckinId)
            .map(orderTotalprice).toPropertyWhenPresent("orderTotalprice", record::getOrderTotalprice)
            .map(orderStatus).toPropertyWhenPresent("orderStatus", record::getOrderStatus)
            .map(orderGeneratetime).toPropertyWhenPresent("orderGeneratetime", record::getOrderGeneratetime)
            .map(roomId).toPropertyWhenPresent("roomId", record::getRoomId)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Orders> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, orders, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Orders> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, orders, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Orders> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, orders, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Orders> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, orders, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Orders record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(orderno).equalTo(record::getOrderno)
                .set(subscribeId).equalTo(record::getSubscribeId)
                .set(checkinId).equalTo(record::getCheckinId)
                .set(orderTotalprice).equalTo(record::getOrderTotalprice)
                .set(orderStatus).equalTo(record::getOrderStatus)
                .set(orderGeneratetime).equalTo(record::getOrderGeneratetime)
                .set(roomId).equalTo(record::getRoomId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Orders record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(orderno).equalToWhenPresent(record::getOrderno)
                .set(subscribeId).equalToWhenPresent(record::getSubscribeId)
                .set(checkinId).equalToWhenPresent(record::getCheckinId)
                .set(orderTotalprice).equalToWhenPresent(record::getOrderTotalprice)
                .set(orderStatus).equalToWhenPresent(record::getOrderStatus)
                .set(orderGeneratetime).equalToWhenPresent(record::getOrderGeneratetime)
                .set(roomId).equalToWhenPresent(record::getRoomId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Orders record) {
        return update(c ->
            c.set(orderno).equalTo(record::getOrderno)
            .set(subscribeId).equalTo(record::getSubscribeId)
            .set(checkinId).equalTo(record::getCheckinId)
            .set(orderTotalprice).equalTo(record::getOrderTotalprice)
            .set(orderStatus).equalTo(record::getOrderStatus)
            .set(orderGeneratetime).equalTo(record::getOrderGeneratetime)
            .set(roomId).equalTo(record::getRoomId)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Orders record) {
        return update(c ->
            c.set(orderno).equalToWhenPresent(record::getOrderno)
            .set(subscribeId).equalToWhenPresent(record::getSubscribeId)
            .set(checkinId).equalToWhenPresent(record::getCheckinId)
            .set(orderTotalprice).equalToWhenPresent(record::getOrderTotalprice)
            .set(orderStatus).equalToWhenPresent(record::getOrderStatus)
            .set(orderGeneratetime).equalToWhenPresent(record::getOrderGeneratetime)
            .set(roomId).equalToWhenPresent(record::getRoomId)
            .where(id, isEqualTo(record::getId))
        );
    }
}