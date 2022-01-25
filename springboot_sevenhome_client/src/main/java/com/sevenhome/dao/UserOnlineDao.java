package com.sevenhome.dao;

import static com.sevenhome.dao.UserOnlineDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.sevenhome.bean.po.UserOnline;
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
public interface UserOnlineDao {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, username, password, useronlinePhone, useronlineAvatar, useronlineTotalpay, useronlineSex, useronlineIdcard);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<UserOnline> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserOnlineResult")
    Optional<UserOnline> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserOnlineResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="useronline_phone", property="useronlinePhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="useronline_avatar", property="useronlineAvatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="useronline_totalpay", property="useronlineTotalpay", jdbcType=JdbcType.DECIMAL),
        @Result(column="useronline_sex", property="useronlineSex", jdbcType=JdbcType.VARCHAR),
        @Result(column="useronline_idcard", property="useronlineIdcard", jdbcType=JdbcType.VARCHAR)
    })
    List<UserOnline> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, userOnline, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, userOnline, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UserOnline record) {
        return MyBatis3Utils.insert(this::insert, record, userOnline, c ->
            c.map(username).toProperty("username")
            .map(password).toProperty("password")
            .map(useronlinePhone).toProperty("useronlinePhone")
            .map(useronlineAvatar).toProperty("useronlineAvatar")
            .map(useronlineTotalpay).toProperty("useronlineTotalpay")
            .map(useronlineSex).toProperty("useronlineSex")
            .map(useronlineIdcard).toProperty("useronlineIdcard")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UserOnline record) {
        return MyBatis3Utils.insert(this::insert, record, userOnline, c ->
            c.map(username).toPropertyWhenPresent("username", record::getUsername)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(useronlinePhone).toPropertyWhenPresent("useronlinePhone", record::getUseronlinePhone)
            .map(useronlineAvatar).toPropertyWhenPresent("useronlineAvatar", record::getUseronlineAvatar)
            .map(useronlineTotalpay).toPropertyWhenPresent("useronlineTotalpay", record::getUseronlineTotalpay)
            .map(useronlineSex).toPropertyWhenPresent("useronlineSex", record::getUseronlineSex)
            .map(useronlineIdcard).toPropertyWhenPresent("useronlineIdcard", record::getUseronlineIdcard)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UserOnline> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, userOnline, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UserOnline> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, userOnline, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UserOnline> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, userOnline, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UserOnline> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, userOnline, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UserOnline record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(username).equalTo(record::getUsername)
                .set(password).equalTo(record::getPassword)
                .set(useronlinePhone).equalTo(record::getUseronlinePhone)
                .set(useronlineAvatar).equalTo(record::getUseronlineAvatar)
                .set(useronlineTotalpay).equalTo(record::getUseronlineTotalpay)
                .set(useronlineSex).equalTo(record::getUseronlineSex)
                .set(useronlineIdcard).equalTo(record::getUseronlineIdcard);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UserOnline record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(username).equalToWhenPresent(record::getUsername)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(useronlinePhone).equalToWhenPresent(record::getUseronlinePhone)
                .set(useronlineAvatar).equalToWhenPresent(record::getUseronlineAvatar)
                .set(useronlineTotalpay).equalToWhenPresent(record::getUseronlineTotalpay)
                .set(useronlineSex).equalToWhenPresent(record::getUseronlineSex)
                .set(useronlineIdcard).equalToWhenPresent(record::getUseronlineIdcard);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UserOnline record) {
        return update(c ->
            c.set(username).equalTo(record::getUsername)
            .set(password).equalTo(record::getPassword)
            .set(useronlinePhone).equalTo(record::getUseronlinePhone)
            .set(useronlineAvatar).equalTo(record::getUseronlineAvatar)
            .set(useronlineTotalpay).equalTo(record::getUseronlineTotalpay)
            .set(useronlineSex).equalTo(record::getUseronlineSex)
            .set(useronlineIdcard).equalTo(record::getUseronlineIdcard)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UserOnline record) {
        return update(c ->
            c.set(username).equalToWhenPresent(record::getUsername)
            .set(password).equalToWhenPresent(record::getPassword)
            .set(useronlinePhone).equalToWhenPresent(record::getUseronlinePhone)
            .set(useronlineAvatar).equalToWhenPresent(record::getUseronlineAvatar)
            .set(useronlineTotalpay).equalToWhenPresent(record::getUseronlineTotalpay)
            .set(useronlineSex).equalToWhenPresent(record::getUseronlineSex)
            .set(useronlineIdcard).equalToWhenPresent(record::getUseronlineIdcard)
            .where(id, isEqualTo(record::getId))
        );
    }

    /**
     * 登录查询
     */
   default UserOnline getLogin(String username,String password){
        SelectStatementProvider provider = SqlBuilder
                .select(UserOnlineDao.selectList)
                .from(userOnline)
                .where(UserOnlineDynamicSqlSupport.username, isEqualTo(username))
                .and(UserOnlineDynamicSqlSupport.password, isEqualTo(password))
                .build().render(RenderingStrategies.MYBATIS3);
       List<UserOnline> userOnlineList = this.selectMany(provider);
       if (userOnlineList.size() > 0){
           return userOnlineList.get(0);
       }else {
           return null;
       }
    }
}