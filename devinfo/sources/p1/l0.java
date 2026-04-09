package p1;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l0 extends z {

    /* renamed from: f, reason: collision with root package name */
    public final long f31002f;

    public l0(long j) {
        this.f31002f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            return s.c(this.f31002f, ((l0) obj).f31002f);
        }
        return false;
    }

    @Override // p1.z
    public final void g(float f10, long j, l7.d dVar) {
        dVar.a(1.0f);
        long jB = this.f31002f;
        if (f10 != 1.0f) {
            jB = s.b(jB, s.d(jB) * f10);
        }
        dVar.c(jB);
        if (((Shader) dVar.f28605c) != null) {
            dVar.f28605c = null;
            ((Paint) dVar.f28604b).setShader(null);
        }
    }

    public final int hashCode() {
        int i4 = s.f31019i;
        return yj.q.a(this.f31002f);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) s.i(this.f31002f)) + ')';
    }
}
