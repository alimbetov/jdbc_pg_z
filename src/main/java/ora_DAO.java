
public interface ora_DAO {
    public static final String DB_URL =
            "jdbc:oracle:thin:@"+" (DESCRIPTION =\n" +
                    "    (ADDRESS_LIST =\n" +
                    "      (ADDRESS = (PROTOCOL = TCP)(Host = dm01-scan.brud.kz)(Port = 1521))\n" +
                    "    )\n" +
                    "    (CONNECT_DATA =\n" +
                    "      (SERVICE_NAME = acrm)\n" +
                    "    )\n" +
                    "  )";
    public static final String DRIVER ="oracle.jdbc.driver.OracleDriver";
    public static final String USER = "user";
    public static final String PASS = "pw";

}
