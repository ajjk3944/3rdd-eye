package mi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final n Companion;
    public static final o UPDATE_CONFIG = new o("UPDATE_CONFIG", 0);
    public static final o CORE = new o("CORE", 1);
    public static final o DAILY = new o("DAILY", 2);
    public static final o DOWNLOAD_SPEED = new o("DOWNLOAD_SPEED", 3);
    public static final o UPLOAD_SPEED = new o("UPLOAD_SPEED", 4);
    public static final o LATENCY = new o("LATENCY", 5);
    public static final o SEND_RESULTS = new o("SEND_RESULTS", 6);
    public static final o SEND_DAILY_RESULTS = new o("SEND_DAILY_RESULTS", 7);
    public static final o SEND_SINGLE_TASK_RESULT = new o("SEND_SINGLE_TASK_RESULT", 8);
    public static final o VALID_LOCATION = new o("VALID_LOCATION", 9);
    public static final o OPTIONAL_LOCATION = new o("OPTIONAL_LOCATION", 10);
    public static final o MANDATORY_LOCATION = new o("MANDATORY_LOCATION", 11);
    public static final o UDP = new o("UDP", 12);
    public static final o UDP_VERIFICATION = new o("UDP_VERIFICATION", 13);
    public static final o THROUGHPUT_DOWNLOAD = new o("THROUGHPUT_DOWNLOAD", 14);
    public static final o THROUGHPUT_UPLOAD = new o("THROUGHPUT_UPLOAD", 15);
    public static final o THROUGHPUT_SERVER_RESPONSE = new o("THROUGHPUT_SERVER_RESPONSE", 16);
    public static final o THROUGHPUT_ICMP = new o("THROUGHPUT_ICMP", 17);
    public static final o THROUGHPUT_ICMP_PING = new o("THROUGHPUT_ICMP_PING", 18);
    public static final o THROUGHPUT_ICMP_TRACEROUTE = new o("THROUGHPUT_ICMP_TRACEROUTE", 19);
    public static final o VIDEO = new o("VIDEO", 20);
    public static final o PUBLIC_IP = new o("PUBLIC_IP", 21);
    public static final o TRACEROUTE = new o("TRACEROUTE", 22);
    public static final o FRESH_LOCATION_OR_WIFI_IP = new o("FRESH_LOCATION_OR_WIFI_IP", 23);
    public static final o FRESH_LOCATION_OR_KNOWN_WIFI_IP = new o("FRESH_LOCATION_OR_KNOWN_WIFI_IP", 24);
    public static final o TRIM_DATABASE_TABLES = new o("TRIM_DATABASE_TABLES", 25);
    public static final o LOW_DATA_TRANSFER = new o("LOW_DATA_TRANSFER", 26);
    public static final o SCHEDULER_INFO = new o("SCHEDULER_INFO", 27);
    public static final o FLUSH_CONNECTION_INFO = new o("FLUSH_CONNECTION_INFO", 28);
    public static final o WIFI_SCAN = new o("WIFI_SCAN", 29);
    public static final o CONNECTIVITY_ASSISTANT = new o("CONNECTIVITY_ASSISTANT", 30);
    public static final o WIFI_INFORMATION_ELEMENTS = new o("WIFI_INFORMATION_ELEMENTS", 31);
    public static final o SEND_MLVIS_LOGS = new o("SEND_MLVIS_LOGS", 32);
    public static final o HTTP_HEAD_LATENCY = new o("HTTP_HEAD_LATENCY", 33);
    public static final o END_CORE = new o("END_CORE", 34);
    public static final o CHECK_BACKGROUND_NETWORK_RESTRICTIONS = new o("CHECK_BACKGROUND_NETWORK_RESTRICTIONS", 35);
    public static final o SDK_TASK_LOGGER = new o("SDK_TASK_LOGGER", 36);

    private static final /* synthetic */ o[] $values() {
        return new o[]{UPDATE_CONFIG, CORE, DAILY, DOWNLOAD_SPEED, UPLOAD_SPEED, LATENCY, SEND_RESULTS, SEND_DAILY_RESULTS, SEND_SINGLE_TASK_RESULT, VALID_LOCATION, OPTIONAL_LOCATION, MANDATORY_LOCATION, UDP, UDP_VERIFICATION, THROUGHPUT_DOWNLOAD, THROUGHPUT_UPLOAD, THROUGHPUT_SERVER_RESPONSE, THROUGHPUT_ICMP, THROUGHPUT_ICMP_PING, THROUGHPUT_ICMP_TRACEROUTE, VIDEO, PUBLIC_IP, TRACEROUTE, FRESH_LOCATION_OR_WIFI_IP, FRESH_LOCATION_OR_KNOWN_WIFI_IP, TRIM_DATABASE_TABLES, LOW_DATA_TRANSFER, SCHEDULER_INFO, FLUSH_CONNECTION_INFO, WIFI_SCAN, CONNECTIVITY_ASSISTANT, WIFI_INFORMATION_ELEMENTS, SEND_MLVIS_LOGS, HTTP_HEAD_LATENCY, END_CORE, CHECK_BACKGROUND_NETWORK_RESTRICTIONS, SDK_TASK_LOGGER};
    }

    static {
        o[] oVarArr$values = $values();
        $VALUES = oVarArr$values;
        $ENTRIES = a.a.j(oVarArr$values);
        Companion = new n();
    }

    private o(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
