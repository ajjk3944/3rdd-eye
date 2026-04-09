package ec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f22600f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f22601a;

    /* renamed from: b, reason: collision with root package name */
    public final v f22602b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22603c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22604d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f22605e = null;

    public /* synthetic */ c0(String str, Object obj, v vVar) {
        this.f22601a = str;
        this.f22603c = obj;
        this.f22602b = vVar;
    }

    public final Object a(Object obj) {
        synchronized (this.f22604d) {
        }
        if (obj != null) {
            return obj;
        }
        if (b2.f22586k == null) {
            return this.f22603c;
        }
        synchronized (f22600f) {
            try {
                if (b7.h.e()) {
                    return this.f22605e == null ? this.f22603c : this.f22605e;
                }
                try {
                    for (c0 c0Var : d0.f22616a) {
                        if (b7.h.e()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objB = null;
                        try {
                            v vVar = c0Var.f22602b;
                            if (vVar != null) {
                                objB = vVar.b();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f22600f) {
                            c0Var.f22605e = objB;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                v vVar2 = this.f22602b;
                if (vVar2 != null) {
                    try {
                        return vVar2.b();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f22603c;
            } finally {
            }
        }
    }
}
