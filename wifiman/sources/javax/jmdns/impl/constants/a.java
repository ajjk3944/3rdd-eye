package javax.jmdns.impl.constants;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f50176a = System.getProperty("net.mdns.ipv4", "224.0.0.251");

    /* renamed from: b, reason: collision with root package name */
    public static final String f50177b = System.getProperty("net.mdns.ipv6", "FF02::FB");

    /* renamed from: c, reason: collision with root package name */
    public static final int f50178c = Integer.getInteger("net.mdns.port", 5353).intValue();

    /* renamed from: d, reason: collision with root package name */
    public static final int f50179d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f50180e;

    static {
        int iIntValue = Integer.getInteger("net.dns.ttl", 3600).intValue();
        f50179d = iIntValue;
        f50180e = iIntValue * 500;
    }
}
