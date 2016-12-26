package cn.edu.ntu.cjcx.security;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class LoginUserDetailsService extends JdbcDaoSupport implements UserDetailsService {

	private JdbcTemplate jdbcTemplate;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<UserDetails> users = loadUsersByUsername(username);
		return null;
	}

	private static final String SQL_QUERY_USERS_BY_USERNAME = " SELECT username,password,enadblefrom user where username = ? ";

	protected List<UserDetails> loadUsersByUsername(String username) {
		List<UserDetails> result = getJdbcTemplate().query(SQL_QUERY_USERS_BY_USERNAME, new String[] { username },
				new RowMapper<UserDetails>() {
					public UserDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
						String username = rs.getString(1);
						String password = rs.getString(2);
						boolean enabled = rs.getBoolean(3);
						return new User(username, password, enabled, true, true, true, AuthorityUtils.NO_AUTHORITIES);
					}
				});
		return result;
	}

	public LoginUserDetailsService() {
		jdbcTemplate = getJdbcTemplate();
	}

}
