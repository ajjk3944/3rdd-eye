package p1;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p extends z {

    /* renamed from: f, reason: collision with root package name */
    public km.y f31010f;
    public long g = 9205357640488583168L;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Shader f31011h;

    public p(Shader shader) {
        this.f31011h = shader;
    }

    @Override // p1.z
    public final void g(float f10, long j, l7.d dVar) {
        Paint paint = (Paint) dVar.f28604b;
        km.y yVar = this.f31010f;
        if (yVar == null || !o1.e.a(this.g, j)) {
            if (o1.e.c(j)) {
                this.f31010f = null;
                this.g = 9205357640488583168L;
                yVar = null;
            } else {
                yVar = this.f31010f;
                if (yVar == null) {
                    yVar = new km.y(7, false);
                    this.f31010f = yVar;
                }
                yVar.f28522b = this.f31011h;
                this.f31010f = yVar;
                this.g = j;
            }
        }
        long jB = z.b(paint.getColor());
        long j8 = s.f31013b;
        if (!s.c(jB, j8)) {
            dVar.c(j8);
        }
        if (!nk.k.a((Shader) dVar.f28605c, yVar != null ? (Shader) yVar.f28522b : null)) {
            Shader shader = yVar != null ? (Shader) yVar.f28522b : null;
            dVar.f28605c = shader;
            paint.setShader(shader);
        }
        if (paint.getAlpha() / 255.0f == f10) {
            return;
        }
        dVar.a(f10);
    }
}
