package k3;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f14013e = new d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f14014a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14015b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14016c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14017d;

    public d(int i10, int i11, int i12, int i13) {
        this.f14014a = i10;
        this.f14015b = i11;
        this.f14016c = i12;
        this.f14017d = i13;
    }

    public static d a(d dVar, d dVar2) {
        return b(Math.max(dVar.f14014a, dVar2.f14014a), Math.max(dVar.f14015b, dVar2.f14015b), Math.max(dVar.f14016c, dVar2.f14016c), Math.max(dVar.f14017d, dVar2.f14017d));
    }

    public static d b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f14013e : new d(i10, i11, i12, i13);
    }

    public static d c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return a2.c.j(this.f14014a, this.f14015b, this.f14016c, this.f14017d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f14017d == dVar.f14017d && this.f14014a == dVar.f14014a && this.f14016c == dVar.f14016c && this.f14015b == dVar.f14015b;
    }

    public final int hashCode() {
        return (((((this.f14014a * 31) + this.f14015b) * 31) + this.f14016c) * 31) + this.f14017d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f14014a);
        sb2.append(", top=");
        sb2.append(this.f14015b);
        sb2.append(", right=");
        sb2.append(this.f14016c);
        sb2.append(", bottom=");
        return c7.a.q(sb2, this.f14017d, '}');
    }
}
