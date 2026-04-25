public static void getHighSalaryEmployees() {
    try {
        Connection con = DBConnection.getConnection();
        String query = "SELECT * FROM employee WHERE salary > 30000";

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next()) {
            System.out.println(
                rs.getInt("id") + " " +
                rs.getString("name") + " " +
                rs.getDouble("salary")
            );
        }

    } catch(Exception e) {
        e.printStackTrace();
    }
}