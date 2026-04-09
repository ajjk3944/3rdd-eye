package w1;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f64335e = new f(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f64336a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64337b;

    /* renamed from: c, reason: collision with root package name */
    public final int f64338c;

    /* renamed from: d, reason: collision with root package name */
    public final int f64339d;

    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private f(int i10, int i11, int i12, int i13) {
        this.f64336a = i10;
        this.f64337b = i11;
        this.f64338c = i12;
        this.f64339d = i13;
    }

    public static f a(f fVar, f fVar2) {
        return b(Math.max(fVar.f64336a, fVar2.f64336a), Math.max(fVar.f64337b, fVar2.f64337b), Math.max(fVar.f64338c, fVar2.f64338c), Math.max(fVar.f64339d, fVar2.f64339d));
    }

    public static f b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f64335e : new f(i10, i11, i12, i13);
    }

    public static f c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static f d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f64336a, this.f64337b, this.f64338c, this.f64339d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f64339d == fVar.f64339d && this.f64336a == fVar.f64336a && this.f64338c == fVar.f64338c && this.f64337b == fVar.f64337b;
    }

    public int hashCode() {
        return (((((this.f64336a * 31) + this.f64337b) * 31) + this.f64338c) * 31) + this.f64339d;
    }

    public String toString() {
        return "Insets{left=" + this.f64336a + ", top=" + this.f64337b + ", right=" + this.f64338c + ", bottom=" + this.f64339d + '}';
    }
}
