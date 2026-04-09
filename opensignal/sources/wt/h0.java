package wt;

/* loaded from: classes.dex */
public abstract class h0 implements Runnable, Comparable, e0 {
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    public long f24622a;

    /* renamed from: d, reason: collision with root package name */
    public int f24623d;

    @Override // wt.e0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                bu.t tVar = w.f24663b;
                if (obj == tVar) {
                    return;
                }
                i0 i0Var = obj instanceof i0 ? (i0) obj : null;
                if (i0Var != null) {
                    synchronized (i0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof bu.v ? (bu.v) obj2 : null) != null) {
                            i0Var.b(this.f24623d);
                        }
                    }
                }
                this._heap = tVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int b(long j, i0 i0Var, j0 j0Var) {
        synchronized (this) {
            if (this._heap == w.f24663b) {
                return 2;
            }
            synchronized (i0Var) {
                try {
                    h0[] h0VarArr = i0Var.f2993a;
                    h0 h0Var = h0VarArr != null ? h0VarArr[0] : null;
                    if (j0.E.get(j0Var) != 0) {
                        return 1;
                    }
                    if (h0Var == null) {
                        i0Var.f24626c = j;
                    } else {
                        long j7 = h0Var.f24622a;
                        if (j7 - j < 0) {
                            j = j7;
                        }
                        if (j - i0Var.f24626c > 0) {
                            i0Var.f24626c = j;
                        }
                    }
                    long j10 = this.f24622a;
                    long j11 = i0Var.f24626c;
                    if (j10 - j11 < 0) {
                        this.f24622a = j11;
                    }
                    i0Var.a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f24622a - ((h0) obj).f24622a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(i0 i0Var) {
        if (this._heap == w.f24663b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = i0Var;
    }

    public String toString() {
        return w.g.h(new StringBuilder("Delayed[nanos="), this.f24622a, ']');
    }
}
