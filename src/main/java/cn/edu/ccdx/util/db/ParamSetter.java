package cn.edu.ccdx.util.db;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface ParamSetter {
	
	public void setParams(PreparedStatement ps) throws SQLException;

}
