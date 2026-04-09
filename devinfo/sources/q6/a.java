package q6;

import a0.g;
import android.graphics.Rect;
import nk.k;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f32195a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32196b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32197c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32198d;

    static {
        new a(0, 0, 0, 0);
    }

    public a(int i4, int i10, int i11, int i12) {
        this.f32195a = i4;
        this.f32196b = i10;
        this.f32197c = i11;
        this.f32198d = i12;
        if (i4 > i11) {
            throw new IllegalArgumentException(g.i(i4, i11, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i10 > i12) {
            throw new IllegalArgumentException(g.i(i10, i12, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        a aVar = (a) obj;
        return this.f32195a == aVar.f32195a && this.f32196b == aVar.f32196b && this.f32197c == aVar.f32197c && this.f32198d == aVar.f32198d;
    }

    public final int hashCode() {
        return (((((this.f32195a * 31) + this.f32196b) * 31) + this.f32197c) * 31) + this.f32198d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a.class.getSimpleName());
        sb2.append(" { [");
        sb2.append(this.f32195a);
        sb2.append(',');
        sb2.append(this.f32196b);
        sb2.append(',');
        sb2.append(this.f32197c);
        sb2.append(',');
        return c.j(this.f32198d, "] }", sb2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        k.e(rect, "rect");
    }
}
