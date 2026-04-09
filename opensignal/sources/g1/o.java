package g1;

import android.graphics.Paint;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class o extends f0 {

    /* renamed from: e, reason: collision with root package name */
    public b9.c f9260e;

    /* renamed from: f, reason: collision with root package name */
    public long f9261f = 9205357640488583168L;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Shader f9262g;

    public o(Shader shader) {
        this.f9262g = shader;
    }

    @Override // g1.f0
    public final void f(float f10, long j, yb.k kVar) {
        Paint paint = (Paint) kVar.f26241b;
        b9.c cVar = this.f9260e;
        if (cVar == null || !f1.e.a(this.f9261f, j)) {
            if (f1.e.c(j)) {
                this.f9260e = null;
                this.f9261f = 9205357640488583168L;
                cVar = null;
            } else {
                cVar = this.f9260e;
                if (cVar == null) {
                    cVar = new b9.c(22, false);
                    this.f9260e = cVar;
                }
                cVar.f2478d = this.f9262g;
                this.f9260e = cVar;
                this.f9261f = j;
            }
        }
        long jB = f0.b(paint.getColor());
        long j7 = r.f9264b;
        if (!r.c(jB, j7)) {
            kVar.d(j7);
        }
        if (!br.l.a((Shader) kVar.f26242c, cVar != null ? (Shader) cVar.f2478d : null)) {
            Shader shader = cVar != null ? (Shader) cVar.f2478d : null;
            kVar.f26242c = shader;
            paint.setShader(shader);
        }
        if (paint.getAlpha() / 255.0f == f10) {
            return;
        }
        kVar.b(f10);
    }
}
