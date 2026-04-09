package I4;

import A9.I;
import g0.C4356c;

/* compiled from: Dependency.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final s<?> f2465a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2466b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2467c;

    public i(int i, int i10, Class cls) {
        this((s<?>) s.a(cls), i, i10);
    }

    public static i a(s<?> sVar) {
        return new i(sVar, 1, 0);
    }

    public static i b(Class<?> cls) {
        return new i(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f2465a.equals(iVar.f2465a) && this.f2466b == iVar.f2466b && this.f2467c == iVar.f2467c;
    }

    public final int hashCode() {
        return ((((this.f2465a.hashCode() ^ 1000003) * 1000003) ^ this.f2466b) * 1000003) ^ this.f2467c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f2465a);
        sb.append(", type=");
        int i = this.f2466b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i10 = this.f2467c;
        if (i10 == 0) {
            str = "direct";
        } else if (i10 == 1) {
            str = "provider";
        } else {
            if (i10 != 2) {
                throw new AssertionError(C4356c.h(i10, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return B4.f.c(sb, str, "}");
    }

    public i(s<?> sVar, int i, int i10) {
        I.l(sVar, "Null dependency anInterface.");
        this.f2465a = sVar;
        this.f2466b = i;
        this.f2467c = i10;
    }
}
