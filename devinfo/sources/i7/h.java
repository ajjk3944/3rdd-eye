package i7;

import android.graphics.Color;
import android.graphics.Matrix;
import androidx.lifecycle.f1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    public final n7.a f25881a;

    /* renamed from: b, reason: collision with root package name */
    public final n7.a f25882b;

    /* renamed from: c, reason: collision with root package name */
    public final f f25883c;

    /* renamed from: d, reason: collision with root package name */
    public final i f25884d;

    /* renamed from: e, reason: collision with root package name */
    public final i f25885e;

    /* renamed from: f, reason: collision with root package name */
    public final i f25886f;
    public final i g;

    /* renamed from: h, reason: collision with root package name */
    public Matrix f25887h;

    public h(n7.a aVar, n7.a aVar2, f1 f1Var) {
        this.f25882b = aVar;
        this.f25881a = aVar2;
        e eVarG = ((l7.a) f1Var.f1134b).g();
        this.f25883c = (f) eVarG;
        eVarG.a(this);
        aVar2.e(eVarG);
        i iVarG = ((l7.b) f1Var.f1135c).g();
        this.f25884d = iVarG;
        iVarG.a(this);
        aVar2.e(iVarG);
        i iVarG2 = ((l7.b) f1Var.f1136d).g();
        this.f25885e = iVarG2;
        iVarG2.a(this);
        aVar2.e(iVarG2);
        i iVarG3 = ((l7.b) f1Var.f1137e).g();
        this.f25886f = iVarG3;
        iVarG3.a(this);
        aVar2.e(iVarG3);
        i iVarG4 = ((l7.b) f1Var.f1138f).g();
        this.g = iVarG4;
        iVarG4.a(this);
        aVar2.e(iVarG4);
    }

    @Override // i7.a
    public final void a() {
        this.f25882b.a();
    }

    public final r7.b b(Matrix matrix, int i4) {
        float fL = this.f25885e.l() * 0.017453292f;
        float fFloatValue = ((Float) this.f25886f.e()).floatValue();
        double d10 = fL;
        float fSin = ((float) Math.sin(d10)) * fFloatValue;
        float fCos = ((float) Math.cos(d10 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.g.e()).floatValue();
        int iIntValue = ((Integer) this.f25883c.e()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.f25884d.e()).floatValue() * i4) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        r7.b bVar = new r7.b();
        bVar.f32846a = fFloatValue2 * 0.33f;
        bVar.f32847b = fSin;
        bVar.f32848c = fCos;
        bVar.f32849d = iArgb;
        bVar.f32850e = null;
        bVar.c(matrix);
        if (this.f25887h == null) {
            this.f25887h = new Matrix();
        }
        this.f25881a.f29799w.e().invert(this.f25887h);
        bVar.c(this.f25887h);
        return bVar;
    }

    public final void c(km.o oVar) {
        this.f25884d.j(new g(oVar));
    }
}
