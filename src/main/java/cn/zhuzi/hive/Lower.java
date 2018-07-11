package cn.zhuzi.hive;

import org.apache.hadoop.hive.ql.exec.UDF;

/**
 * @author 作者 grq 
 * @version 创建时间：2018年7月11日 下午9:55:16
 *
 */
public class Lower extends UDF {
	public String evaluate(final String s) {
		if (s == null) {
			return null;
		}
		
		return s.toString().toLowerCase();
	}

}
