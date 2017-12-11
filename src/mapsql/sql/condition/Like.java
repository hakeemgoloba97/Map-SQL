package mapsql.sql.condition;

import java.util.Map;

import mapsql.sql.core.SQLException;
import mapsql.sql.core.TableDescription;

public class Like extends AbstractCondition {
	private String column;
	private String value;

	public Like(String column, String value) {
		this.column = column;
		this.value = value;
	}

	@Override
	public boolean evaluate(TableDescription description, Map<String, String> data) throws SQLException {
		char a = '%';
		String check = data.get(column);
		if(value.charAt(0)==a){
			if(check.startsWith(value.substring(1,value.length()))){
				return true;
			}
		}
		if(value.charAt(value.length()-1)==a){
			if(check.endsWith(value.substring(0,value.length()-1))){
				return true;
			}
		}
		if(value.charAt(0)==a && value.charAt(value.length()-1)==a){
			if(check.contains(value.substring(1,value.length()-1))){
				return true;
			}
		}
		
		return false;
	}
}