package com.cacheserverdeploy.deploy;

import com.cacheserverdeploy.deploy.graph.EdgeWeightedDigraph;

public class Deploy
{
    /**
     * 你需要完成的入口
     * <功能详细描述>
     * @param graphContent 用例信息文件
     * @return [参数说明] 输出结果信息
     * @see [类、类#方法、类#成员]
     */
    public static String[] deployServer(String[] graphContent)
    {
        /**do your work here**/
    	EdgeWeightedDigraph digraph=new EdgeWeightedDigraph(graphContent);
    	return new String[]{graphContent[0]};
        //return new String[]{"17","\r\n","0 8 0 20"};
    }

}
