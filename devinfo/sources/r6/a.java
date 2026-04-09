package r6;

import android.graphics.Rect;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final q6.a f32837a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32838b;

    public a(q6.a aVar, float f10) {
        this.f32837a = aVar;
        this.f32838b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        a aVar = (a) obj;
        return k.a(this.f32837a, aVar.f32837a) && this.f32838b == aVar.f32838b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f32838b) + (this.f32837a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WindowMetrics(_bounds=");
        sb2.append(this.f32837a);
        sb2.append(", density=");
        return r5.c.k(sb2, this.f32838b, ')');
    }

    public a(Rect rect, float f10) {
        this.f32837a = new q6.a(rect);
        this.f32838b = f10;
    }
}
