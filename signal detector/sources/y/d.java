package Y;

import K4.q;
import S4.r;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public static final r f4196f = new r(9);

    /* renamed from: c, reason: collision with root package name */
    public long[] f4199c;

    /* renamed from: d, reason: collision with root package name */
    public int f4200d;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f4197a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public long f4198b = 0;

    /* renamed from: e, reason: collision with root package name */
    public final r f4201e = f4196f;

    public final synchronized void a(g gVar) {
        try {
            int iLastIndexOf = this.f4197a.lastIndexOf(gVar);
            if (iLastIndexOf < 0 || b(iLastIndexOf)) {
                this.f4197a.add(gVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b(int i) {
        int i3;
        if (i < 64) {
            return ((1 << i) & this.f4198b) != 0;
        }
        long[] jArr = this.f4199c;
        if (jArr != null && (i3 = (i / 64) - 1) < jArr.length) {
            return ((1 << (i % 64)) & jArr[i3]) != 0;
        }
        return false;
    }

    public final synchronized void c(a aVar, int i) throws Throwable {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f4200d++;
            int size = this.f4197a.size();
            int length = this.f4199c == null ? -1 : r0.length - 1;
            e(aVar, i, length);
            d(aVar, i, (length + 2) * 64, size, 0L);
            int i3 = this.f4200d - 1;
            this.f4200d = i3;
            if (i3 == 0) {
                long[] jArr = this.f4199c;
                if (jArr != null) {
                    for (int length2 = jArr.length - 1; length2 >= 0; length2--) {
                        long j6 = this.f4199c[length2];
                        if (j6 != 0) {
                            g((length2 + 1) * 64, j6);
                            this.f4199c[length2] = 0;
                        }
                    }
                }
                long j7 = this.f4198b;
                if (j7 != 0) {
                    g(0, j7);
                    this.f4198b = 0L;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final Object clone() {
        d dVar;
        CloneNotSupportedException e6;
        synchronized (this) {
            try {
                dVar = (d) super.clone();
                try {
                    dVar.f4198b = 0L;
                    dVar.f4199c = null;
                    dVar.f4200d = 0;
                    dVar.f4197a = new ArrayList();
                    int size = this.f4197a.size();
                    for (int i = 0; i < size; i++) {
                        if (!b(i)) {
                            dVar.f4197a.add(this.f4197a.get(i));
                        }
                    }
                } catch (CloneNotSupportedException e7) {
                    e6 = e7;
                    e6.printStackTrace();
                    return dVar;
                }
            } catch (CloneNotSupportedException e8) {
                dVar = null;
                e6 = e8;
            }
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(a aVar, int i, int i3, int i6, long j6) {
        long j7 = 1;
        while (i3 < i6) {
            if ((j6 & j7) == 0) {
                r rVar = this.f4201e;
                Object obj = this.f4197a.get(i3);
                rVar.getClass();
                i iVar = ((g) obj).f4204a;
                h hVar = (h) iVar.get();
                if (hVar == null) {
                    iVar.a();
                }
                if (hVar != null && ((a) iVar.f4217b) == aVar) {
                    hVar.getClass();
                    q qVar = (q) hVar;
                    if (i == 0) {
                        synchronized (qVar) {
                            qVar.f2396E |= 1;
                        }
                    } else if (i == 2) {
                        synchronized (qVar) {
                            qVar.f2396E |= 2;
                        }
                    } else {
                        continue;
                    }
                    hVar.f();
                }
            }
            j7 <<= 1;
            i3++;
        }
    }

    public final void e(a aVar, int i, int i3) {
        if (i3 < 0) {
            d(aVar, i, 0, Math.min(64, this.f4197a.size()), this.f4198b);
            return;
        }
        long j6 = this.f4199c[i3];
        int i6 = (i3 + 1) * 64;
        int iMin = Math.min(this.f4197a.size(), i6 + 64);
        e(aVar, i, i3 - 1);
        d(aVar, i, i6, iMin, j6);
    }

    public final synchronized void f(g gVar) {
        try {
            if (this.f4200d == 0) {
                this.f4197a.remove(gVar);
            } else {
                int iLastIndexOf = this.f4197a.lastIndexOf(gVar);
                if (iLastIndexOf >= 0) {
                    h(iLastIndexOf);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void g(int i, long j6) {
        long j7 = Long.MIN_VALUE;
        for (int i3 = i + 63; i3 >= i; i3--) {
            if ((j6 & j7) != 0) {
                this.f4197a.remove(i3);
            }
            j7 >>>= 1;
        }
    }

    public final void h(int i) {
        if (i < 64) {
            this.f4198b = (1 << i) | this.f4198b;
            return;
        }
        int i3 = (i / 64) - 1;
        long[] jArr = this.f4199c;
        if (jArr == null) {
            this.f4199c = new long[this.f4197a.size() / 64];
        } else if (jArr.length <= i3) {
            long[] jArr2 = new long[this.f4197a.size() / 64];
            long[] jArr3 = this.f4199c;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f4199c = jArr2;
        }
        long j6 = 1 << (i % 64);
        long[] jArr4 = this.f4199c;
        jArr4[i3] = j6 | jArr4[i3];
    }
}
