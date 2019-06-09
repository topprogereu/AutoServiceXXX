package com.parser.program.pasha.mapper;

import com.parser.program.pasha.model.AutoModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AutoriaMapper implements RowMapper {

    @Override
    public List<AutoModel> mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
