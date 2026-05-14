class Badge {
    public String print(Integer id, String name, String department) {
        String deptFormatted = (department == null) ? "OWNER" : department.toUpperCase();

        if (id == null) {
            return name + " - " + deptFormatted;
        }
        
        return "[" + id + "] - " + name + " - " + deptFormatted;
    }
}
