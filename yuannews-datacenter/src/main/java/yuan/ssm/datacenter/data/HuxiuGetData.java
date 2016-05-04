package yuan.ssm.datacenter.data;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import yuan.ssm.common.util.LoggerUtil;
import yuan.ssm.datacenter.base.GetDataBase;
import yuan.ssm.datacenter.base.ParserBase;

import java.io.IOException;
import java.io.InputStream;

/**
 * ==================================================
 * <p/>
 * 版权：　软件工程.net12-1 原明卓
 * <p/>
 * 项目：　基于用户兴趣标签的新闻推荐系统
 * <p/>
 * 作者：　原明卓
 * <p/>
 * 版本：　1.0
 * <p/>
 * 创建日期：　16-5-4 下午1:49
 * <p/>
 * 功能描述： 虎嗅网数据获取类，返回虎嗅网详情页内容
 * <p>
 * <p/>
 * 功能更新历史：
 * <p>
 * ==================================================
 */
public class HuxiuGetData extends GetDataBase{

    public HuxiuGetData(HttpClient httpClient, HttpGet httpget,ParserBase parserBase) {
        super(httpClient, httpget,parserBase);
    }

    protected void parserDetailToDb(InputStream stream, String url, ParserBase parserBase) {
        try {
            Document doc = Jsoup.parse(stream, ENCODE_CODE, url);
        } catch (IOException e) {
            LoggerUtil.printJSON("HuxiuGetData parserDetailData IOException");
            e.printStackTrace();
        }
    }
}
