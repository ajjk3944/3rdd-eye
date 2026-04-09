package ka;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f28114a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f28115b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f28116c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f28117d;

    static {
        c cVar = new c("NETWORK_UNMETERED", 0);
        f28114a = cVar;
        c cVar2 = new c("DEVICE_IDLE", 1);
        f28115b = cVar2;
        c cVar3 = new c("DEVICE_CHARGING", 2);
        f28116c = cVar3;
        f28117d = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f28117d.clone();
    }
}
