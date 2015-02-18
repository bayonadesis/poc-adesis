package adesisPoc.commons.utils;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 * @author Manuel Bayona
 *
 */
@Component
public class ManageMongoDB {

	@Value("{adesis.poc.connection.host}")
	private String host;

	@Value("{adesis.poc.connection.port}")
	private int port;

	@Value("{adesis.poc.connection.database}")
	private int database;

	public DB simpleConnect() {

		try {
			MongoClient client = new MongoClient(host, port);
			return client.getDB(host);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return null;
	}

}
