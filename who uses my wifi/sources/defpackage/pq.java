package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pq implements x9 {
    public final da a;
    public final da b;
    public final fg c;
    public final pu d;
    public final pu e;
    public final pu f;
    public final pu g;
    public Matrix h;

    public pq(da daVar, da daVar2, g4 g4Var) {
        this.b = daVar;
        this.a = daVar2;
        ba baVarQ0 = ((b4) g4Var.g).Q0();
        this.c = (fg) baVarQ0;
        baVarQ0.a(this);
        daVar2.e(baVarQ0);
        pu puVarQ0 = ((c4) g4Var.h).Q0();
        this.d = puVarQ0;
        puVarQ0.a(this);
        daVar2.e(puVarQ0);
        pu puVarQ02 = ((c4) g4Var.i).Q0();
        this.e = puVarQ02;
        puVarQ02.a(this);
        daVar2.e(puVarQ02);
        pu puVarQ03 = ((c4) g4Var.j).Q0();
        this.f = puVarQ03;
        puVarQ03.a(this);
        daVar2.e(puVarQ03);
        pu puVarQ04 = ((c4) g4Var.k).Q0();
        this.g = puVarQ04;
        puVarQ04.a(this);
        daVar2.e(puVarQ04);
    }

    public final mq a(Matrix matrix, int i) {
        float fL = this.e.l() * 0.017453292f;
        float fFloatValue = ((Float) this.f.e()).floatValue();
        double d = fL;
        float fSin = ((float) Math.sin(d)) * fFloatValue;
        float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.g.e()).floatValue();
        int iIntValue = ((Integer) this.c.e()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.d.e()).floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        mq mqVar = new mq();
        mqVar.a = fFloatValue2 * 0.33f;
        mqVar.b = fSin;
        mqVar.c = fCos;
        mqVar.d = iArgb;
        mqVar.e = null;
        mqVar.c(matrix);
        if (this.h == null) {
            this.h = new Matrix();
        }
        this.a.w.e().invert(this.h);
        mqVar.c(this.h);
        return mqVar;
    }

    public final void b(vq2 vq2Var) {
        this.d.j(new oq(vq2Var));
    }

    @Override // defpackage.x9
    public final void c() {
        this.b.c();
    }
}
