package com.parser.program.pasha.dao;

import com.parser.program.pasha.mapper.AutoriaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class ParserAutoriaDaoImplements implements ParserAutoriaDao {

    @Autowired @Qualifier("autoriaSource")
    private DataSource dataSourceForAutoria;

    @Autowired @Qualifier("rstSource")
    private DataSource dataSourceForRst;



    @Bean(name ="autoriaConn")
    public JdbcTemplate getJdbcTemplateForAutoria() {
         return new JdbcTemplate(dataSourceForAutoria);
    }

    @Bean(name ="rstConn")
    public JdbcTemplate getJdbcTemplateForRst() {
        return new JdbcTemplate(dataSourceForAutoria);
    }

    @Override
    public void getData() {
          JdbcTemplate j1 = getJdbcTemplateForAutoria();
          JdbcTemplate j2 = getJdbcTemplateForRst();
        j1.query("select * from autoriadb.data", new AutoriaMapper());
        j2.query("select * from rstdb.data", new AutoriaMapper());

    }

    @Override
    public void setData() {

        JdbcTemplate j1 = getJdbcTemplateForAutoria();
        JdbcTemplate j2 = getJdbcTemplateForRst();
        j1.query("select * from autoriadb.data", new AutoriaMapper());
        j2.query("select * from rstdb.data", new AutoriaMapper());

    }
}
