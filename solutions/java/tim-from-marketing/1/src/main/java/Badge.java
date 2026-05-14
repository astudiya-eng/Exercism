class Badge {
    public String print(Integer id, String name, String department) {
        String deptFormatted = (department == null) ? "OWNER" : department.toUpperCase();

        if (id == null) {
            return String.format("%s - %s", name, deptFormatted);
        }
        
        return String.format("[%d] - %s - %s", id, name, deptFormatted);
    }
}
