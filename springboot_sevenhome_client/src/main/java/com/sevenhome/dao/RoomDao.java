package com.sevenhome.dao;

import static com.sevenhome.dao.RoomDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.sevenhome.bean.po.Room;
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
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
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
public interface RoomDao {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, rommno, roomtypeId, roomFloor, roomStatus, hotelId);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Room> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RoomResult")
    Optional<Room> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RoomResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="rommno", property="rommno", jdbcType=JdbcType.VARCHAR),
        @Result(column="roomtype_id", property="roomtypeId", jdbcType=JdbcType.INTEGER),
        @Result(column="room_floor", property="roomFloor", jdbcType=JdbcType.VARCHAR),
        @Result(column="room_status", property="roomStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="hotel_id", property="hotelId", jdbcType=JdbcType.INTEGER)
    })
    List<Room> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, room, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, room, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Room record) {
        return MyBatis3Utils.insert(this::insert, record, room, c ->
            c.map(rommno).toProperty("rommno")
            .map(roomtypeId).toProperty("roomtypeId")
            .map(roomFloor).toProperty("roomFloor")
            .map(roomStatus).toProperty("roomStatus")
            .map(hotelId).toProperty("hotelId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Room record) {
        return MyBatis3Utils.insert(this::insert, record, room, c ->
            c.map(rommno).toPropertyWhenPresent("rommno", record::getRommno)
            .map(roomtypeId).toPropertyWhenPresent("roomtypeId", record::getRoomtypeId)
            .map(roomFloor).toPropertyWhenPresent("roomFloor", record::getRoomFloor)
            .map(roomStatus).toPropertyWhenPresent("roomStatus", record::getRoomStatus)
            .map(hotelId).toPropertyWhenPresent("hotelId", record::getHotelId)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Room> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, room, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Room> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, room, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Room> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, room, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Room> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, room, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Room record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(rommno).equalTo(record::getRommno)
                .set(roomtypeId).equalTo(record::getRoomtypeId)
                .set(roomFloor).equalTo(record::getRoomFloor)
                .set(roomStatus).equalTo(record::getRoomStatus)
                .set(hotelId).equalTo(record::getHotelId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Room record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(rommno).equalToWhenPresent(record::getRommno)
                .set(roomtypeId).equalToWhenPresent(record::getRoomtypeId)
                .set(roomFloor).equalToWhenPresent(record::getRoomFloor)
                .set(roomStatus).equalToWhenPresent(record::getRoomStatus)
                .set(hotelId).equalToWhenPresent(record::getHotelId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Room record) {
        return update(c ->
            c.set(rommno).equalTo(record::getRommno)
            .set(roomtypeId).equalTo(record::getRoomtypeId)
            .set(roomFloor).equalTo(record::getRoomFloor)
            .set(roomStatus).equalTo(record::getRoomStatus)
            .set(hotelId).equalTo(record::getHotelId)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Room record) {
        return update(c ->
            c.set(rommno).equalToWhenPresent(record::getRommno)
            .set(roomtypeId).equalToWhenPresent(record::getRoomtypeId)
            .set(roomFloor).equalToWhenPresent(record::getRoomFloor)
            .set(roomStatus).equalToWhenPresent(record::getRoomStatus)
            .set(hotelId).equalToWhenPresent(record::getHotelId)
            .where(id, isEqualTo(record::getId))
        );
    }

    //查询房态表 不为空的房间
    //根据条件查询同时指向一条子查询(roomStatusDao)
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    Room getRoomType(SelectStatementProvider selectStatement);

    default Room getRoomGroupBy(Integer hotelId,Integer roomTypeId,List<Integer> ids){
        SelectStatementProvider provider = SqlBuilder.select(roomtypeId,SqlBuilder.count())
                .from(room)
                .where(RoomDynamicSqlSupport.id,isIn(ids))
                .and(RoomDynamicSqlSupport.hotelId,isEqualTo(hotelId))
                .and(roomtypeId, isEqualTo(roomTypeId))
                .groupBy(roomtypeId)
                .build().render(RenderingStrategies.MYBATIS3);

        return this.getRoomType(provider);
    }

    //获得一个指定房型可用房间id
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    Room getOneRoom(SelectStatementProvider selectStatement);

    default Room getOneRoomId(Integer roomtypeId,List<Integer> ids){
        SelectStatementProvider provider = SqlBuilder.select(id)
                .from(room)
                .where(RoomDynamicSqlSupport.id,isIn(ids))
                .and(RoomDynamicSqlSupport.roomtypeId,isEqualTo(roomtypeId))
                .limit(1)
                .build().render(RenderingStrategies.MYBATIS3);

        return this.getOneRoom(provider);
    }
}