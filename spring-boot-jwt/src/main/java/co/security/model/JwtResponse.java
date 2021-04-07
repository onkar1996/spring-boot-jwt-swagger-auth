package co.security.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private final String jwttoken;

	private final String timestamp;
	private final LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
		this.timestamp = formatter.format(now);
	}

	public String getToken() {
		return this.jwttoken;
	}

	public String getTimestamp() {
		return timestamp;
	}
}
