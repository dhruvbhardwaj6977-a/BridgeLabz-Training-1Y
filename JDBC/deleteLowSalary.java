public static void deleteLowSalary() {
    try {
        Connection con = DBConnection.getConnection();
        String query = "DELETE FROM employee WHERE salary < 15000";

        Statement st = con.createStatement();
        st.executeUpdate(query);

        System.out.println("Low salary employees removed!");

    } catch(Exception e) {
        e.printStackTrace();
    }
}