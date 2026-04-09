package H6;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f7631b = new a("CONNECTION_STATE");

    /* renamed from: c, reason: collision with root package name */
    public static final a f7632c = new a("SERVICE_DISCOVERY");

    /* renamed from: d, reason: collision with root package name */
    public static final a f7633d = new a("CHARACTERISTIC_READ");

    /* renamed from: e, reason: collision with root package name */
    public static final a f7634e = new a("CHARACTERISTIC_WRITE");

    /* renamed from: f, reason: collision with root package name */
    public static final a f7635f = new a("CHARACTERISTIC_LONG_WRITE");

    /* renamed from: g, reason: collision with root package name */
    public static final a f7636g = new a("CHARACTERISTIC_CHANGED");

    /* renamed from: h, reason: collision with root package name */
    public static final a f7637h = new a("DESCRIPTOR_READ");

    /* renamed from: i, reason: collision with root package name */
    public static final a f7638i = new a("DESCRIPTOR_WRITE");

    /* renamed from: j, reason: collision with root package name */
    public static final a f7639j = new a("RELIABLE_WRITE_COMPLETED");

    /* renamed from: k, reason: collision with root package name */
    public static final a f7640k = new a("READ_RSSI");

    /* renamed from: l, reason: collision with root package name */
    public static final a f7641l = new a("ON_MTU_CHANGED");

    /* renamed from: m, reason: collision with root package name */
    public static final a f7642m = new a("PHY_READ");

    /* renamed from: n, reason: collision with root package name */
    public static final a f7643n = new a("PHY_UPDATE");

    /* renamed from: o, reason: collision with root package name */
    public static final a f7644o = new a("CONNECTION_PRIORITY_CHANGE");

    /* renamed from: a, reason: collision with root package name */
    private final String f7645a;

    private a(String str) {
        this.f7645a = str;
    }

    public String toString() {
        return "BleGattOperation{description='" + this.f7645a + "'}";
    }
}
