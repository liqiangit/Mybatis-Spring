package tk.mybatis.mapper.entity;

import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Clob;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.type.JdbcType;

/**
 * https://www.cnblogs.com/tongxuping/p/7134113.html
 *  JdbcType类型和Java类型的对应关系 
 * @author 李强
JDBC Type           Java Type  
CHAR                String  
VARCHAR             String  
LONGVARCHAR         String  
NUMERIC             java.math.BigDecimal  
DECIMAL             java.math.BigDecimal  
BIT                 boolean  
BOOLEAN             boolean  
TINYINT             byte  
SMALLINT            short  
INTEGER             INTEGER  
BIGINT              long  
REAL                float  
FLOAT               double  
DOUBLE              double  
BINARY              byte[]  
VARBINARY           byte[]  
LONGVARBINARY       byte[]  
DATE                java.sql.Date  
TIME                java.sql.Time  
TIMESTAMP           java.sql.Timestamp  
CLOB                Clob  
BLOB                Blob  
ARRAY               Array  
DISTINCT            mapping of underlying type  
STRUCT              Struct  
REF                 Ref  
DATALINK            java.net.URL[color=red][/color]
 */
public class TypeUtils {
	public static Map<Class<?>, JdbcType> types = new HashMap<>();
    static{
    	types.put(String.class, JdbcType.VARCHAR);
    	types.put(BigDecimal.class, JdbcType.DECIMAL);
    	types.put(Byte.class, JdbcType.TINYINT);
    	types.put(Boolean.class, JdbcType.BIT);
    	types.put(Short.class, JdbcType.SMALLINT);
    	types.put(Integer.class, JdbcType.INTEGER);
    	types.put(Long.class, JdbcType.BIGINT);
    	types.put(Float.class, JdbcType.REAL);
    	types.put(Double.class, JdbcType.DOUBLE);
    	types.put(java.sql.Date.class, JdbcType.DATE);
    	types.put(java.sql.Time.class, JdbcType.TIME);
    	types.put(java.sql.Timestamp.class, JdbcType.TIMESTAMP);
    	types.put(Clob.class, JdbcType.CLOB);
    	types.put(Blob.class, JdbcType.BLOB);
    }
	public static JdbcType getJdbcTypeByClass(Class<?> clazz) {
		return types.get(clazz);
	}
	public static void main(String[] args) {
		JdbcType jdbcType=getJdbcTypeByClass(String.class);
		System.out.println(jdbcType.name());
	}
}
