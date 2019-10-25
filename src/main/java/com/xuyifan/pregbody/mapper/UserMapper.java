package com.xuyifan.pregbody.mapper;
import java.util.List;
import com.xuyifan.pregbody.bean.UserBean;
/**
 * @author Xu yifan
 * @Ddecription mapper
 * @date 2019-10-25 15:31:55
 * @Version 1.0
 */
public interface UserMapper {
    //通过id删除记录
    int deleteByPrimaryKey(Integer id);
    //插入全部数据
    int insert(UserBean record);
    //插入非空数据
    int insertSelective(UserBean record);
    //通过id查询记录
    UserBean selectByPrimaryKey(Integer id);
    //通过非空参数搜索list
    List<UserBean> selectListBySelective(UserBean record);
    //通过id更新非空参数
    int updateByPrimaryKeySelective(UserBean record);
    //通过id更新记录
    int updateByPrimaryKey(UserBean record);
}
