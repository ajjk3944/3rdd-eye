package z5;

/* loaded from: classes3.dex */
public abstract class H implements Runnable, Comparable, E {
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    public long f24490a;

    /* renamed from: b, reason: collision with root package name */
    public int f24491b;

    public final E5.x a() {
        Object obj = this._heap;
        if (obj instanceof E5.x) {
            return (E5.x) obj;
        }
        return null;
    }

    public final int b(long j6, I i, J j7) {
        synchronized (this) {
            if (this._heap == AbstractC3046w.f24559b) {
                return 2;
            }
            synchronized (i) {
                try {
                    H[] hArr = i.f1421a;
                    H h6 = hArr != null ? hArr[0] : null;
                    if (J.f24495h.get(j7) != 0) {
                        return 1;
                    }
                    if (h6 == null) {
                        i.f24492c = j6;
                    } else {
                        long j8 = h6.f24490a;
                        if (j8 - j6 < 0) {
                            j6 = j8;
                        }
                        if (j6 - i.f24492c > 0) {
                            i.f24492c = j6;
                        }
                    }
                    long j9 = this.f24490a;
                    long j10 = i.f24492c;
                    if (j9 - j10 < 0) {
                        this.f24490a = j10;
                    }
                    i.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(I i) {
        if (this._heap == AbstractC3046w.f24559b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j6 = this.f24490a - ((H) obj).f24490a;
        if (j6 > 0) {
            return 1;
        }
        return j6 < 0 ? -1 : 0;
    }

    @Override // z5.E
    public final void g() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                B2.a aVar = AbstractC3046w.f24559b;
                if (obj == aVar) {
                    return;
                }
                I i = obj instanceof I ? (I) obj : null;
                if (i != null) {
                    i.c(this);
                }
                this._heap = aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f24490a + ']';
    }
}
