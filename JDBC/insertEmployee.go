public static void insertEmployee(int id, String name, double salary) {
    try {
        Connection con = DBConnection.getConnection();
        String query = "INSERT INTO employee VALUES (?, ?, ?)";
        
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setDouble(3, salary);

        ps.executeUpdate();
        System.out.println("Employee added!");

    } catch(Exception e) {
        e.printStackTrace();
    }
}