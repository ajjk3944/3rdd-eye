package nb;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class u {

    /* renamed from: d, reason: collision with root package name */
    public static final u f29935d = new u(true, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29936a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29937b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f29938c;

    public u(boolean z3, String str, Exception exc) {
        this.f29936a = z3;
        this.f29937b = str;
        this.f29938c = exc;
    }

    public static u b(String str) {
        return new u(false, str, null);
    }

    public static u c(String str, Exception exc) {
        return new u(false, str, exc);
    }

    public String a() {
        return this.f29937b;
    }
}
