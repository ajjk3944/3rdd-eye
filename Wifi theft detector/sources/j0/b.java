package j0;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f21685e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f21686a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21687b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21688c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21689d;

    public static class a {
        @DoNotInline
        public static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public b(int i10, int i11, int i12, int i13) {
        this.f21686a = i10;
        this.f21687b = i11;
        this.f21688c = i12;
        this.f21689d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f21686a, bVar2.f21686a), Math.max(bVar.f21687b, bVar2.f21687b), Math.max(bVar.f21688c, bVar2.f21688c), Math.max(bVar.f21689d, bVar2.f21689d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f21685e : new b(i10, i11, i12, i13);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f21686a, this.f21687b, this.f21688c, this.f21689d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21689d == bVar.f21689d && this.f21686a == bVar.f21686a && this.f21688c == bVar.f21688c && this.f21687b == bVar.f21687b;
    }

    public int hashCode() {
        return (((((this.f21686a * 31) + this.f21687b) * 31) + this.f21688c) * 31) + this.f21689d;
    }

    public String toString() {
        return "Insets{left=" + this.f21686a + ", top=" + this.f21687b + ", right=" + this.f21688c + ", bottom=" + this.f21689d + '}';
    }
}
