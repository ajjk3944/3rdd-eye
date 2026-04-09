package bf;

import com.google.android.gms.internal.measurement.b4;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final u f2727a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2728b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2729c;

    public l(int i10, int i11, Class cls) {
        this(u.a(cls), i10, i11);
    }

    public static l a(u uVar) {
        return new l(uVar, 1, 0);
    }

    public static l b(Class cls) {
        return new l(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f2727a.equals(lVar.f2727a) && this.f2728b == lVar.f2728b && this.f2729c == lVar.f2729c;
    }

    public final int hashCode() {
        return ((((this.f2727a.hashCode() ^ 1000003) * 1000003) ^ this.f2728b) * 1000003) ^ this.f2729c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f2727a);
        sb2.append(", type=");
        int i10 = this.f2728b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i11 = this.f2729c;
        if (i11 == 0) {
            str = "direct";
        } else if (i11 == 1) {
            str = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(h0.b.h(i11, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return w.g.j(sb2, str, "}");
    }

    public l(u uVar, int i10, int i11) {
        b4.f(uVar, "Null dependency anInterface.");
        this.f2727a = uVar;
        this.f2728b = i10;
        this.f2729c = i11;
    }
}
