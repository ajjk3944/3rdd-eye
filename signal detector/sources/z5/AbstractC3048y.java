package z5;

/* renamed from: z5.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3048y {

    /* renamed from: a, reason: collision with root package name */
    public static final A f24568a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [A5.d] */
    /* JADX WARN: Type inference failed for: r0v7, types: [z5.x] */
    /* JADX WARN: Type inference failed for: r0v8, types: [z5.A] */
    /* JADX WARN: Type inference failed for: r0v9, types: [z5.x] */
    static {
        String property;
        ?? r02;
        int i = E5.v.f1415a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            G5.e eVar = D.f24485a;
            r02 = E5.o.f1409a;
            A5.d dVar = r02.f516e;
            if (!(r02 != 0)) {
                r02 = RunnableC3047x.i;
            }
        } else {
            r02 = RunnableC3047x.i;
        }
        f24568a = r02;
    }
}
