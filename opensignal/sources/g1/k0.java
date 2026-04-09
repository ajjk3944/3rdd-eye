package g1;

import android.graphics.Paint;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class k0 extends f0 {

    /* renamed from: e, reason: collision with root package name */
    public final long f9254e;

    public k0(long j) {
        this.f9254e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            return r.c(this.f9254e, ((k0) obj).f9254e);
        }
        return false;
    }

    @Override // g1.f0
    public final void f(float f10, long j, yb.k kVar) {
        kVar.b(1.0f);
        long jB = this.f9254e;
        if (f10 != 1.0f) {
            jB = r.b(jB, r.d(jB) * f10);
        }
        kVar.d(jB);
        if (((Shader) kVar.f26242c) != null) {
            kVar.f26242c = null;
            ((Paint) kVar.f26241b).setShader(null);
        }
    }

    public final int hashCode() {
        int i10 = r.f9270h;
        return Long.hashCode(this.f9254e);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) r.i(this.f9254e)) + ')';
    }
}
