package A9;

/* compiled from: DefaultExecutor.kt */
/* loaded from: classes3.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final N f197a;

    static {
        String property;
        B9.g gVar;
        int i = F9.z.f1790a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            I9.c cVar = U.f211a;
            B9.g gVar2 = F9.q.f1782a;
            gVar2.getClass();
            gVar = !(gVar2 instanceof N) ? J.f192j : gVar2;
        } else {
            gVar = J.f192j;
        }
        f197a = gVar;
    }
}
