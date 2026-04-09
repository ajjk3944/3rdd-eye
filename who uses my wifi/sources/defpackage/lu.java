package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lu implements bq, x9, v40 {
    public final Path a;
    public final d50 b;
    public final da c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final fg g;
    public final fg h;
    public m41 i;
    public final i90 j;
    public ba k;
    public float l;

    public lu(i90 i90Var, da daVar, yu0 yu0Var) {
        Path path = new Path();
        this.a = path;
        this.b = new d50(1, 0);
        this.f = new ArrayList();
        this.c = daVar;
        String str = yu0Var.c;
        b4 b4Var = yu0Var.e;
        b4 b4Var2 = yu0Var.d;
        this.d = str;
        this.e = yu0Var.f;
        this.j = i90Var;
        if (daVar.l() != null) {
            pu puVarQ0 = ((c4) daVar.l().g).Q0();
            this.k = puVarQ0;
            puVarQ0.a(this);
            daVar.e(this.k);
        }
        if (b4Var2 == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(yu0Var.b);
        ba baVarQ0 = b4Var2.Q0();
        this.g = (fg) baVarQ0;
        baVarQ0.a(this);
        daVar.e(baVarQ0);
        ba baVarQ02 = b4Var.Q0();
        this.h = (fg) baVarQ02;
        baVarQ02.a(this);
        daVar.e(baVarQ02);
    }

    @Override // defpackage.u40
    public final void a(Object obj, vq2 vq2Var) {
        PointF pointF = n90.a;
        if (obj == 1) {
            this.g.j(vq2Var);
            return;
        }
        if (obj == 4) {
            this.h.j(vq2Var);
            return;
        }
        ColorFilter colorFilter = n90.F;
        da daVar = this.c;
        if (obj == colorFilter) {
            m41 m41Var = this.i;
            if (m41Var != null) {
                daVar.o(m41Var);
            }
            m41 m41Var2 = new m41(null, vq2Var);
            this.i = m41Var2;
            m41Var2.a(this);
            daVar.e(this.i);
            return;
        }
        if (obj == n90.e) {
            ba baVar = this.k;
            if (baVar != null) {
                baVar.j(vq2Var);
                return;
            }
            m41 m41Var3 = new m41(null, vq2Var);
            this.k = m41Var3;
            m41Var3.a(this);
            daVar.e(this.k);
        }
    }

    @Override // defpackage.bq
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((kk0) arrayList.get(i)).f(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.x9
    public final void c() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.vi
    public final void d(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            vi viVar = (vi) list2.get(i);
            if (viVar instanceof kk0) {
                this.f.add((kk0) viVar);
            }
        }
    }

    @Override // defpackage.bq
    public final void g(Canvas canvas, Matrix matrix, int i, mq mqVar) {
        BlurMaskFilter blurMaskFilter;
        if (this.e) {
            return;
        }
        fg fgVar = this.g;
        float fIntValue = ((Integer) this.h.e()).intValue() / 100.0f;
        int iC = (te0.c((int) (i * fIntValue)) << 24) | (fgVar.l(fgVar.c.e(), fgVar.c()) & 16777215);
        d50 d50Var = this.b;
        d50Var.setColor(iC);
        m41 m41Var = this.i;
        if (m41Var != null) {
            d50Var.setColorFilter((ColorFilter) m41Var.e());
        }
        ba baVar = this.k;
        if (baVar != null) {
            float fFloatValue = ((Float) baVar.e()).floatValue();
            if (fFloatValue == 0.0f) {
                d50Var.setMaskFilter(null);
            } else if (fFloatValue != this.l) {
                da daVar = this.c;
                if (daVar.A == fFloatValue) {
                    blurMaskFilter = daVar.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    daVar.B = blurMaskFilter2;
                    daVar.A = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                d50Var.setMaskFilter(blurMaskFilter);
            }
            this.l = fFloatValue;
        }
        if (mqVar != null) {
            mqVar.a((int) (fIntValue * 255.0f), d50Var);
        } else {
            d50Var.clearShadowLayer();
        }
        Path path = this.a;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, d50Var);
                return;
            } else {
                path.addPath(((kk0) arrayList.get(i2)).f(), matrix);
                i2++;
            }
        }
    }

    @Override // defpackage.vi
    public final String getName() {
        return this.d;
    }

    @Override // defpackage.u40
    public final void h(t40 t40Var, int i, ArrayList arrayList, t40 t40Var2) {
        te0.g(t40Var, i, arrayList, t40Var2, this);
    }
}
