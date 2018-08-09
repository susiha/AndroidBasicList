package yirendai.com.androidbasiclist.patternDesign.proxyPattern.staticProxy;

/**
 * author:  sunshihai
 * createTime:  2018/8/8
 * desc: 静态代理模式的桥梁 通过实现IUserDao接口,连接代理类和目标类
 */

public interface IUserDao {
    void print();
}
