package zc;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f27148f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f27149a;

    /* renamed from: b, reason: collision with root package name */
    public final q f27150b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27151c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f27152d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f27153e = null;

    public /* synthetic */ t(String str, Object obj, q qVar) {
        this.f27149a = str;
        this.f27151c = obj;
        this.f27150b = qVar;
    }

    public final Object a(Object obj) {
        synchronized (this.f27152d) {
        }
        if (obj != null) {
            return obj;
        }
        if (p1.k == null) {
            return this.f27151c;
        }
        synchronized (f27148f) {
            try {
                if (d.d()) {
                    return this.f27153e == null ? this.f27151c : this.f27153e;
                }
                try {
                    for (t tVar : u.f27161a) {
                        if (d.d()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            q qVar = tVar.f27150b;
                            if (qVar != null) {
                                objZza = qVar.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f27148f) {
                            tVar.f27153e = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                q qVar2 = this.f27150b;
                if (qVar2 != null) {
                    try {
                        return qVar2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f27151c;
            } finally {
            }
        }
    }
}
