package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public List f2879a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public long f2880b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long[] f2881c;

    /* renamed from: d, reason: collision with root package name */
    public int f2882d;

    /* renamed from: e, reason: collision with root package name */
    public final a f2883e;

    public static abstract class a {
        public abstract void a(Object obj, Object obj2, int i10, Object obj3);
    }

    public c(a aVar) {
        this.f2883e = aVar;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized c clone() {
        c cVar;
        CloneNotSupportedException e10;
        try {
            cVar = (c) super.clone();
            try {
                cVar.f2880b = 0L;
                cVar.f2881c = null;
                cVar.f2882d = 0;
                cVar.f2879a = new ArrayList();
                int size = this.f2879a.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (!b(i10)) {
                        cVar.f2879a.add(this.f2879a.get(i10));
                    }
                }
            } catch (CloneNotSupportedException e11) {
                e10 = e11;
                e10.printStackTrace();
                return cVar;
            }
        } catch (CloneNotSupportedException e12) {
            cVar = null;
            e10 = e12;
        }
        return cVar;
    }

    public final boolean b(int i10) {
        int i11;
        if (i10 < 64) {
            return ((1 << i10) & this.f2880b) != 0;
        }
        long[] jArr = this.f2881c;
        if (jArr != null && (i11 = (i10 / 64) - 1) < jArr.length) {
            return ((1 << (i10 % 64)) & jArr[i11]) != 0;
        }
        return false;
    }

    public synchronized void c(Object obj, int i10, Object obj2) {
        try {
            this.f2882d++;
            f(obj, i10, obj2);
            int i11 = this.f2882d - 1;
            this.f2882d = i11;
            if (i11 == 0) {
                long[] jArr = this.f2881c;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j10 = this.f2881c[length];
                        if (j10 != 0) {
                            h((length + 1) * 64, j10);
                            this.f2881c[length] = 0;
                        }
                    }
                }
                long j11 = this.f2880b;
                if (j11 != 0) {
                    h(0, j11);
                    this.f2880b = 0L;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d(Object obj, int i10, Object obj2, int i11, int i12, long j10) {
        long j11 = 1;
        while (i11 < i12) {
            if ((j10 & j11) == 0) {
                this.f2883e.a(this.f2879a.get(i11), obj, i10, obj2);
            }
            j11 <<= 1;
            i11++;
        }
    }

    public final void e(Object obj, int i10, Object obj2) {
        d(obj, i10, obj2, 0, Math.min(64, this.f2879a.size()), this.f2880b);
    }

    public final void f(Object obj, int i10, Object obj2) {
        int size = this.f2879a.size();
        int length = this.f2881c == null ? -1 : r0.length - 1;
        g(obj, i10, obj2, length);
        d(obj, i10, obj2, (length + 2) * 64, size, 0L);
    }

    public final void g(Object obj, int i10, Object obj2, int i11) {
        if (i11 < 0) {
            e(obj, i10, obj2);
            return;
        }
        long j10 = this.f2881c[i11];
        int i12 = (i11 + 1) * 64;
        int iMin = Math.min(this.f2879a.size(), i12 + 64);
        g(obj, i10, obj2, i11 - 1);
        d(obj, i10, obj2, i12, iMin, j10);
    }

    public final void h(int i10, long j10) {
        long j11 = Long.MIN_VALUE;
        for (int i11 = i10 + 63; i11 >= i10; i11--) {
            if ((j10 & j11) != 0) {
                this.f2879a.remove(i11);
            }
            j11 >>>= 1;
        }
    }
}
