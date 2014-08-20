package mvc_data;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface IWorldMapper 
{
@Select("SELECT DISTINCT Continent FROM Country ORDER BY 1")
List<String> getContinents();
}
 