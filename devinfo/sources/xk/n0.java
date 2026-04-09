package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class n0 implements Runnable, Comparable, i0 {
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    public long f37208a;

    /* renamed from: b, reason: collision with root package name */
    public int f37209b = -1;

    public n0(long j) {
        this.f37208a = j;
    }

    @Override // xk.i0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                cl.u uVar = x.f37251b;
                if (obj == uVar) {
                    return;
                }
                o0 o0Var = obj instanceof o0 ? (o0) obj : null;
                if (o0Var != null) {
                    o0Var.b(this);
                }
                this._heap = uVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final cl.y c() {
        Object obj = this._heap;
        if (obj instanceof cl.y) {
            return (cl.y) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f37208a - ((n0) obj).f37208a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final int d(long j, o0 o0Var, p0 p0Var) {
        synchronized (this) {
            if (this._heap == x.f37251b) {
                return 2;
            }
            synchronized (o0Var) {
                try {
                    n0[] n0VarArr = o0Var.f2949a;
                    n0 n0Var = n0VarArr != null ? n0VarArr[0] : null;
                    if (p0.f37221i.get(p0Var) == 1) {
                        return 1;
                    }
                    if (n0Var == null) {
                        o0Var.f37216c = j;
                    } else {
                        long j8 = n0Var.f37208a;
                        if (j8 - j < 0) {
                            j = j8;
                        }
                        if (j - o0Var.f37216c > 0) {
                            o0Var.f37216c = j;
                        }
                    }
                    long j9 = this.f37208a;
                    long j10 = o0Var.f37216c;
                    if (j9 - j10 < 0) {
                        this.f37208a = j10;
                    }
                    o0Var.a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void e(o0 o0Var) {
        if (this._heap == x.f37251b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = o0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f37208a + ']';
    }
}
