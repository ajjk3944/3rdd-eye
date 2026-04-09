package v3;

import a4.l;
import android.graphics.Insets;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f35792e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f35793a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35794b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35795c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35796d;

    public b(int i4, int i10, int i11, int i12) {
        this.f35793a = i4;
        this.f35794b = i10;
        this.f35795c = i11;
        this.f35796d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return c(Math.max(bVar.f35793a, bVar2.f35793a), Math.max(bVar.f35794b, bVar2.f35794b), Math.max(bVar.f35795c, bVar2.f35795c), Math.max(bVar.f35796d, bVar2.f35796d));
    }

    public static b b(b bVar, b bVar2) {
        return c(Math.min(bVar.f35793a, bVar2.f35793a), Math.min(bVar.f35794b, bVar2.f35794b), Math.min(bVar.f35795c, bVar2.f35795c), Math.min(bVar.f35796d, bVar2.f35796d));
    }

    public static b c(int i4, int i10, int i11, int i12) {
        return (i4 == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? f35792e : new b(i4, i10, i11, i12);
    }

    public static b d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return l.f(this.f35793a, this.f35794b, this.f35795c, this.f35796d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f35796d == bVar.f35796d && this.f35793a == bVar.f35793a && this.f35795c == bVar.f35795c && this.f35794b == bVar.f35794b;
    }

    public final int hashCode() {
        return (((((this.f35793a * 31) + this.f35794b) * 31) + this.f35795c) * 31) + this.f35796d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f35793a);
        sb2.append(", top=");
        sb2.append(this.f35794b);
        sb2.append(", right=");
        sb2.append(this.f35795c);
        sb2.append(", bottom=");
        return d.h.u(sb2, this.f35796d, '}');
    }
}
