package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h20 extends da {
    public final d50 D;
    public final Rect E;
    public final Rect F;
    public final RectF G;
    public final l90 H;
    public m41 I;
    public m41 J;
    public final pq K;
    public pi0 L;
    public t3 M;

    public h20(i90 i90Var, f50 f50Var) {
        super(i90Var, f50Var);
        this.D = new d50(3, 0);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        String str = f50Var.g;
        u80 u80Var = i90Var.f;
        this.H = u80Var == null ? null : (l90) ((HashMap) u80Var.c()).get(str);
        g4 g4Var = this.p.x;
        if (g4Var != null) {
            this.K = new pq(this, this, g4Var);
        }
    }

    @Override // defpackage.da, defpackage.u40
    public final void a(Object obj, vq2 vq2Var) {
        super.a(obj, vq2Var);
        if (obj == n90.F) {
            this.I = new m41(null, vq2Var);
            return;
        }
        if (obj == n90.I) {
            this.J = new m41(null, vq2Var);
            return;
        }
        pq pqVar = this.K;
        if (obj == 5 && pqVar != null) {
            pqVar.c.j(vq2Var);
            return;
        }
        if (obj == n90.B && pqVar != null) {
            pqVar.b(vq2Var);
            return;
        }
        if (obj == n90.C && pqVar != null) {
            pqVar.e.j(vq2Var);
            return;
        }
        if (obj == n90.D && pqVar != null) {
            pqVar.f.j(vq2Var);
        } else {
            if (obj != n90.E || pqVar == null) {
                return;
            }
            pqVar.g.j(vq2Var);
        }
    }

    @Override // defpackage.da, defpackage.bq
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        Bitmap bitmapS;
        super.b(rectF, matrix, z);
        l90 l90Var = this.H;
        if (l90Var != null) {
            int i = l90Var.b;
            int i2 = l90Var.a;
            float fC = l41.c();
            if (this.o.r || (bitmapS = s()) == null) {
                rectF.set(0.0f, 0.0f, i2 * fC, i * fC);
            } else {
                rectF.set(0.0f, 0.0f, bitmapS.getWidth() * fC, bitmapS.getHeight() * fC);
            }
            this.n.mapRect(rectF);
        }
    }

    @Override // defpackage.da
    public final void k(Canvas canvas, Matrix matrix, int i, mq mqVar) {
        l90 l90Var;
        Bitmap bitmapS = s();
        if (bitmapS == null || bitmapS.isRecycled() || (l90Var = this.H) == null) {
            return;
        }
        float fC = l41.c();
        d50 d50Var = this.D;
        d50Var.setAlpha(i);
        m41 m41Var = this.I;
        if (m41Var != null) {
            d50Var.setColorFilter((ColorFilter) m41Var.e());
        }
        pq pqVar = this.K;
        if (pqVar != null) {
            mqVar = pqVar.a(matrix, i);
        }
        int width = bitmapS.getWidth();
        int height = bitmapS.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        boolean z = this.o.r;
        Rect rect2 = this.F;
        if (z) {
            rect2.set(0, 0, (int) (l90Var.a * fC), (int) (l90Var.b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmapS.getWidth() * fC), (int) (bitmapS.getHeight() * fC));
        }
        boolean z2 = mqVar != null;
        if (z2) {
            if (this.L == null) {
                this.L = new pi0();
            }
            if (this.M == null) {
                this.M = new t3(4, (byte) 0);
            }
            t3 t3Var = this.M;
            t3Var.g = 255;
            t3Var.h = null;
            mqVar.getClass();
            mq mqVar2 = new mq(mqVar);
            t3Var.h = mqVar2;
            mqVar2.b(i);
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            RectF rectF = this.G;
            rectF.set(f, f2, f3, f4);
            matrix.mapRect(rectF);
            canvas = this.L.e(canvas, rectF, this.M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapS, rect, rect2, d50Var);
        if (z2) {
            this.L.c();
            if (this.L.c == 4) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap s() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h20.s():android.graphics.Bitmap");
    }
}
