package com.m.sql.mapper;

import com.m.sql.entity.Telegram_user;
import com.m.sql.entity.Telegram_userExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Telegram_userMapper {
    long countByExample(Telegram_userExample example);

    int deleteByExample(Telegram_userExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Telegram_user record);

    int insertSelective(Telegram_user record);

    List<Telegram_user> selectByExample(Telegram_userExample example);

    Telegram_user selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Telegram_user record, @Param("example") Telegram_userExample example);

    int updateByExample(@Param("record") Telegram_user record, @Param("example") Telegram_userExample example);

    int updateByPrimaryKeySelective(Telegram_user record);

    int updateByPrimaryKey(Telegram_user record);
    int upFraction(@Param("telegram_id") String telegram_id,@Param("fraction") Integer fraction );
    int newCompleteGame(String[] telegram_id);
    int newExitGame(String telegram_id);
    int newWord_people(String[] telegram_id);
    int newWord_spy(String[] telegram_id);
    int newWord_people_victory(String[] telegram_id);
    int newWord_spy_victory(String[] telegram_id);

    int newJoinGame(String telegram_id);
    int updateUserData(Telegram_user user);
    List<Telegram_user> selectAll();
    int updateLanguage(@Param("telegram_id") String telegram_id,@Param("language") String language);
    Telegram_user selectByUserId(String userId);
}