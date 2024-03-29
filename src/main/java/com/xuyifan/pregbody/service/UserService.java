package com.xuyifan.pregbody.service;
import java.util.List;
import com.xuyifan.pregbody.mapper.UserMapper;
import com.xuyifan.pregbody.bean.UserBean;

/**
 * @author Xu yifan
 * @Ddecription 服务
 * @date 2019-10-25 15:31:55
 * @Version 1.0
 */
public interface UserService {
    /**
     * 功能描述:通过id删除记录
     * @Param: [id]
     * @Return: int
     * @Author: Xu yifan
     * @Date: 2019-10-25 15:31:55
     */
    public int deleteByPrimaryKey(Integer id);
    /**
     * 功能描述:插入全部数据
     * @Param: [UserBean]
     * @Return: int
     * @Author: Xu yifan
     * @Date: 2019-10-25 15:31:55
     */
    public int insert(UserBean record);
    /**
     * 功能描述:插入非空数据
     * @Param: [UserBean]
     * @Return: int
     * @Author: Xu yifan
     * @Date: 2019-10-25 15:31:55
     */
    public int insertSelective(UserBean record);
    /**
     * 功能描述:通过id查询记录
     * @Param: [id]
     * @Return: UserBean
     * @Author: Xu yifan
     * @Date: 2019-10-25 15:31:55
     */
    public UserBean selectByPrimaryKey(Integer id);
    /**
     * 功能描述:通过非空参数搜索list
     * @Param: [UserBean]
     * @Return: List<UserBean>
     * @Author: Xu yifan
     * @Date: 2019-10-25 15:31:55
     */
    public List<UserBean> selectListBySelective(UserBean record);
     /**
      * 功能描述:通过id更新非空参数
      * @Param: [UserBean]
      * @Return: int
      * @Author: Xu yifan
      * @Date: 2019-10-25 15:31:55
      */
    public int updateByPrimaryKeySelective(UserBean record);
    /**
     * 功能描述:通过id更新记录
     * @Param: [UserBean]
     * @Return: int
     * @Author: Xu yifan
     * @Date: 2019-10-25 15:31:55
     */
    public int updateByPrimaryKey(UserBean record);
}
