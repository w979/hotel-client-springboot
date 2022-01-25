package com.sevenhome.dao;

import static com.sevenhome.dao.DepositDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.sevenhome.bean.po.Deposit;
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
public interface DepositDao {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, depositTotal, roomgoodsTotal, depositReturnmoney, orderId, status);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Deposit> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DepositResult")
    Optional<Deposit> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DepositResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="deposit_total", property="depositTotal", jdbcType=JdbcType.DECIMAL),
        @Result(column="roomgoods_total", property="roomgoodsTotal", jdbcType=JdbcType.DECIMAL),
        @Result(column="deposit_returnmoney", property="depositReturnmoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR)
    })
    List<Deposit> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, deposit, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, deposit, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Deposit record) {
        return MyBatis3Utils.insert(this::insert, record, deposit, c ->
            c.map(depositTotal).toProperty("depositTotal")
            .map(roomgoodsTotal).toProperty("roomgoodsTotal")
            .map(depositReturnmoney).toProperty("depositReturnmoney")
            .map(orderId).toProperty("orderId")
            .map(status).toProperty("status")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Deposit record) {
        return MyBatis3Utils.insert(this::insert, record, deposit, c ->
            c.map(depositTotal).toPropertyWhenPresent("depositTotal", record::getDepositTotal)
            .map(roomgoodsTotal).toPropertyWhenPresent("roomgoodsTotal", record::getRoomgoodsTotal)
            .map(depositReturnmoney).toPropertyWhenPresent("depositReturnmoney", record::getDepositReturnmoney)
            .map(orderId).toPropertyWhenPresent("orderId", record::getOrderId)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Deposit> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, deposit, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Deposit> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, deposit, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Deposit> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, deposit, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Deposit> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, deposit, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Deposit record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(depositTotal).equalTo(record::getDepositTotal)
                .set(roomgoodsTotal).equalTo(record::getRoomgoodsTotal)
                .set(depositReturnmoney).equalTo(record::getDepositReturnmoney)
                .set(orderId).equalTo(record::getOrderId)
                .set(status).equalTo(record::getStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Deposit record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(depositTotal).equalToWhenPresent(record::getDepositTotal)
                .set(roomgoodsTotal).equalToWhenPresent(record::getRoomgoodsTotal)
                .set(depositReturnmoney).equalToWhenPresent(record::getDepositReturnmoney)
                .set(orderId).equalToWhenPresent(record::getOrderId)
                .set(status).equalToWhenPresent(record::getStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Deposit record) {
        return update(c ->
            c.set(depositTotal).equalTo(record::getDepositTotal)
            .set(roomgoodsTotal).equalTo(record::getRoomgoodsTotal)
            .set(depositReturnmoney).equalTo(record::getDepositReturnmoney)
            .set(orderId).equalTo(record::getOrderId)
            .set(status).equalTo(record::getStatus)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Deposit record) {
        return update(c ->
            c.set(depositTotal).equalToWhenPresent(record::getDepositTotal)
            .set(roomgoodsTotal).equalToWhenPresent(record::getRoomgoodsTotal)
            .set(depositReturnmoney).equalToWhenPresent(record::getDepositReturnmoney)
            .set(orderId).equalToWhenPresent(record::getOrderId)
            .set(status).equalToWhenPresent(record::getStatus)
            .where(id, isEqualTo(record::getId))
        );
    }

    /**
     * 押金表插入数据
     * @param deposit
     * @return
     */
    default int insertDeposit(Deposit deposit){
        return this.insertSelective(deposit);
    }
}