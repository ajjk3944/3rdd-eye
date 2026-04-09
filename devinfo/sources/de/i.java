package de;

import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final q f22210a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22211b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22212c;

    public i(int i4, int i10, Class cls) {
        this(q.a(cls), i4, i10);
    }

    public static i a(q qVar) {
        return new i(qVar, 1, 0);
    }

    public static i b(Class cls) {
        return new i(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f22210a.equals(iVar.f22210a) && this.f22211b == iVar.f22211b && this.f22212c == iVar.f22212c;
    }

    public final int hashCode() {
        return ((((this.f22210a.hashCode() ^ 1000003) * 1000003) ^ this.f22211b) * 1000003) ^ this.f22212c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f22210a);
        sb2.append(", type=");
        int i4 = this.f22211b;
        sb2.append(i4 == 1 ? "required" : i4 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i10 = this.f22212c;
        if (i10 == 0) {
            str = "direct";
        } else if (i10 == 1) {
            str = "provider";
        } else {
            if (i10 != 2) {
                throw new AssertionError(u.r(i10, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return d.h.w(sb2, str, "}");
    }

    public i(q qVar, int i4, int i10) {
        wb.e.f(qVar, "Null dependency anInterface.");
        this.f22210a = qVar;
        this.f22211b = i4;
        this.f22212c = i10;
    }
}
