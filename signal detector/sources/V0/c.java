package V0;

import android.os.Build;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class c {
    public static final c i;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3809b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3810c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3811d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3812e;

    /* renamed from: a, reason: collision with root package name */
    public int f3808a = 1;

    /* renamed from: f, reason: collision with root package name */
    public long f3813f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f3814g = -1;

    /* renamed from: h, reason: collision with root package name */
    public e f3815h = new e();

    static {
        e eVar = new e();
        c cVar = new c();
        cVar.f3808a = 1;
        cVar.f3813f = -1L;
        cVar.f3814g = -1L;
        cVar.f3815h = new e();
        cVar.f3809b = false;
        int i3 = Build.VERSION.SDK_INT;
        cVar.f3810c = false;
        cVar.f3808a = 1;
        cVar.f3811d = false;
        cVar.f3812e = false;
        if (i3 >= 24) {
            cVar.f3815h = eVar;
            cVar.f3813f = -1L;
            cVar.f3814g = -1L;
        }
        i = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3809b == cVar.f3809b && this.f3810c == cVar.f3810c && this.f3811d == cVar.f3811d && this.f3812e == cVar.f3812e && this.f3813f == cVar.f3813f && this.f3814g == cVar.f3814g && this.f3808a == cVar.f3808a) {
            return this.f3815h.equals(cVar.f3815h);
        }
        return false;
    }

    public final int hashCode() {
        int iC = ((((((((AbstractC2984e.c(this.f3808a) * 31) + (this.f3809b ? 1 : 0)) * 31) + (this.f3810c ? 1 : 0)) * 31) + (this.f3811d ? 1 : 0)) * 31) + (this.f3812e ? 1 : 0)) * 31;
        long j6 = this.f3813f;
        int i3 = (iC + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f3814g;
        return this.f3815h.f3818a.hashCode() + ((i3 + ((int) (j7 ^ (j7 >>> 32)))) * 31);
    }
}
