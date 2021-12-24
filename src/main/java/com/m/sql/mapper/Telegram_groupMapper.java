package com.m.sql.mapper;

import com.m.sql.entity.Telegram_group;
import com.m.sql.entity.Telegram_groupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Telegram_groupMapper {
    long countByExample(Telegram_groupExample example);

    int deleteByExample(Telegram_groupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Telegram_group record);

    int insertSelective(Telegram_group record);

    List<Telegram_group> selectByExample(Telegram_groupExample example);

    Telegram_group selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Telegram_group record, @Param("example") Telegram_groupExample example);

    int updateByExample(@Param("record") Telegram_group record, @Param("example") Telegram_groupExample example);

    int updateByPrimaryKeySelective(Telegram_group record);

    int updateByPrimaryKey(Telegram_group record);
    List<Telegram_group> selectAll();
    Telegram_group selectByGroupId(@Param("groupId") String groupId);
    int updateLanguage(@Param("groupId") String groupId,@Param("language") String language);
    int newChatMember(@Param("groupId") String groupId);
    int leftChatMember(@Param("groupId") String groupId);
    int upFinisgGame(@Param("groupId") String groupId);
    int upMaxOfPeople(@Param("groupId") String groupId,@Param("people") Integer people);
    int updateGroupData(Telegram_group record);
}