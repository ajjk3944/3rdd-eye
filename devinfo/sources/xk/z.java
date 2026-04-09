package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f37261a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [yk.d] */
    /* JADX WARN: Type inference failed for: r0v7, types: [xk.y] */
    /* JADX WARN: Type inference failed for: r0v8, types: [xk.b0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [xk.y] */
    static {
        String property;
        ?? r02;
        int i4 = cl.v.f2943a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            el.e eVar = g0.f37189a;
            r02 = cl.o.f2935a;
            yk.d dVar = r02.f37658f;
            if (!(r02 != 0)) {
                r02 = y.j;
            }
        } else {
            r02 = y.j;
        }
        f37261a = r02;
    }
}
