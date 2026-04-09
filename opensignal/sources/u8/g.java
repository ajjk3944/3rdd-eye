package u8;

import android.graphics.Color;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final a9.b f23457a;

    /* renamed from: b, reason: collision with root package name */
    public final a9.b f23458b;

    /* renamed from: c, reason: collision with root package name */
    public final e f23459c;

    /* renamed from: d, reason: collision with root package name */
    public final h f23460d;

    /* renamed from: e, reason: collision with root package name */
    public final h f23461e;

    /* renamed from: f, reason: collision with root package name */
    public final h f23462f;

    /* renamed from: g, reason: collision with root package name */
    public final h f23463g;

    /* renamed from: h, reason: collision with root package name */
    public Matrix f23464h;

    public g(a9.b bVar, a9.b bVar2, cj.a aVar) {
        this.f23458b = bVar;
        this.f23457a = bVar2;
        d dVarE0 = ((y8.a) aVar.f3974d).E0();
        this.f23459c = (e) dVarE0;
        dVarE0.a(this);
        bVar2.e(dVarE0);
        h hVarE0 = ((y8.b) aVar.f3975g).E0();
        this.f23460d = hVarE0;
        hVarE0.a(this);
        bVar2.e(hVarE0);
        h hVarE02 = ((y8.b) aVar.f3976r).E0();
        this.f23461e = hVarE02;
        hVarE02.a(this);
        bVar2.e(hVarE02);
        h hVarE03 = ((y8.b) aVar.f3977x).E0();
        this.f23462f = hVarE03;
        hVarE03.a(this);
        bVar2.e(hVarE03);
        h hVarE04 = ((y8.b) aVar.f3978y).E0();
        this.f23463g = hVarE04;
        hVarE04.a(this);
        bVar2.e(hVarE04);
    }

    @Override // u8.a
    public final void a() {
        this.f23458b.a();
    }

    public final e9.a b(Matrix matrix, int i10) {
        float fM = this.f23461e.m() * 0.017453292f;
        float fFloatValue = ((Float) this.f23462f.f()).floatValue();
        double d6 = fM;
        float fSin = ((float) Math.sin(d6)) * fFloatValue;
        float fCos = ((float) Math.cos(d6 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.f23463g.f()).floatValue();
        int iIntValue = ((Integer) this.f23459c.f()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.f23460d.f()).floatValue() * i10) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        e9.a aVar = new e9.a();
        aVar.f7976a = fFloatValue2 * 0.33f;
        aVar.f7977b = fSin;
        aVar.f7978c = fCos;
        aVar.f7979d = iArgb;
        aVar.f7980e = null;
        aVar.c(matrix);
        if (this.f23464h == null) {
            this.f23464h = new Matrix();
        }
        this.f23457a.f243w.e().invert(this.f23464h);
        aVar.c(this.f23464h);
        return aVar;
    }

    public final void c(bm.e eVar) {
        this.f23460d.k(new f(eVar));
    }
}
