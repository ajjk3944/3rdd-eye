package J;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f2006e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2007a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2008b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2009c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2010d;

    public c(int i, int i3, int i6, int i7) {
        this.f2007a = i;
        this.f2008b = i3;
        this.f2009c = i6;
        this.f2010d = i7;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f2007a, cVar2.f2007a), Math.max(cVar.f2008b, cVar2.f2008b), Math.max(cVar.f2009c, cVar2.f2009c), Math.max(cVar.f2010d, cVar2.f2010d));
    }

    public static c b(int i, int i3, int i6, int i7) {
        return (i == 0 && i3 == 0 && i6 == 0 && i7 == 0) ? f2006e : new c(i, i3, i6, i7);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b.a(this.f2007a, this.f2008b, this.f2009c, this.f2010d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2010d == cVar.f2010d && this.f2007a == cVar.f2007a && this.f2009c == cVar.f2009c && this.f2008b == cVar.f2008b;
    }

    public final int hashCode() {
        return (((((this.f2007a * 31) + this.f2008b) * 31) + this.f2009c) * 31) + this.f2010d;
    }

    public final String toString() {
        return "Insets{left=" + this.f2007a + ", top=" + this.f2008b + ", right=" + this.f2009c + ", bottom=" + this.f2010d + '}';
    }
}
