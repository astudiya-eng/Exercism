public class LogLine {
    private String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String shortCode = logLine.substring(1, 4);
            return switch (shortCode) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default    -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
    // 1. Получаем уровень лога (используя метод из предыдущего задания)
    LogLevel level = getLogLevel();
    
    // 2. Получаем число, привязанное к этому уровню
    int levelNumber = level.getEncodedLevel();
    
    // 3. Вырезаем само сообщение. 
    // В строке "[INF]: File deleted" сообщение начинается после ": " (индекс 7)
    String message = logLine.substring(logLine.indexOf(":") + 2);
    
    // 4. Собираем всё в новый формат
    return levelNumber + ":" + message;
    }
}
