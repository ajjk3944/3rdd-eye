package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ct implements Runnable, Comparable, jp {
    private volatile Object _heap;
    public long f;
    public int g;

    public final int a(long j, dt dtVar, et etVar) {
        synchronized (this) {
            if (this._heap == bd2.g) {
                return 2;
            }
            synchronized (dtVar) {
                try {
                    ct[] ctVarArr = dtVar.a;
                    ct ctVar = ctVarArr != null ? ctVarArr[0] : null;
                    if (et.m.get(etVar) != 0) {
                        return 1;
                    }
                    if (ctVar == null) {
                        dtVar.c = j;
                    } else {
                        long j2 = ctVar.f;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - dtVar.c > 0) {
                            dtVar.c = j;
                        }
                    }
                    long j3 = this.f;
                    long j4 = dtVar.c;
                    if (j3 - j4 < 0) {
                        this.f = j4;
                    }
                    dtVar.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.jp
    public final void b() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                gs3 gs3Var = bd2.g;
                if (obj == gs3Var) {
                    return;
                }
                dt dtVar = obj instanceof dt ? (dt) obj : null;
                if (dtVar != null) {
                    synchronized (dtVar) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof q11 ? (q11) obj2 : null) != null) {
                            dtVar.b(this.g);
                        }
                    }
                }
                this._heap = gs3Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f - ((ct) obj).f;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(dt dtVar) {
        if (this._heap == bd2.g) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = dtVar;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f + ']';
    }
}
