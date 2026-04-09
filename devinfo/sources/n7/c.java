package n7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.lifecycle.f1;
import f7.b0;
import f7.j;
import f7.x;
import f7.z;
import i7.s;
import java.util.HashMap;
import km.o;
import t7.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends a {
    public final g7.a D;
    public final Rect E;
    public final Rect F;
    public final RectF G;
    public final z H;
    public s I;
    public s J;
    public final i7.h K;
    public r7.i L;
    public m M;

    public c(x xVar, d dVar) {
        super(xVar, dVar);
        this.D = new g7.a(3, 0);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        String str = dVar.g;
        j jVar = xVar.f23801a;
        this.H = jVar == null ? null : (z) ((HashMap) jVar.c()).get(str);
        f1 f1Var = this.f29792p.f29824x;
        if (f1Var != null) {
            this.K = new i7.h(this, this, f1Var);
        }
    }

    @Override // n7.a, h7.f
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        Bitmap bitmapS;
        super.d(rectF, matrix, z3);
        z zVar = this.H;
        if (zVar != null) {
            int i4 = zVar.f23828b;
            int i10 = zVar.f23827a;
            float fC = r7.j.c();
            if (this.f29791o.f23811m || (bitmapS = s()) == null) {
                rectF.set(0.0f, 0.0f, i10 * fC, i4 * fC);
            } else {
                rectF.set(0.0f, 0.0f, bitmapS.getWidth() * fC, bitmapS.getHeight() * fC);
            }
            this.f29790n.mapRect(rectF);
        }
    }

    @Override // n7.a, k7.f
    public final void f(Object obj, o oVar) {
        super.f(obj, oVar);
        if (obj == b0.I) {
            this.I = new s(null, oVar);
            return;
        }
        if (obj == b0.L) {
            this.J = new s(null, oVar);
            return;
        }
        i7.h hVar = this.K;
        if (obj == 5 && hVar != null) {
            hVar.f25883c.j(oVar);
            return;
        }
        if (obj == b0.E && hVar != null) {
            hVar.c(oVar);
            return;
        }
        if (obj == b0.F && hVar != null) {
            hVar.f25885e.j(oVar);
            return;
        }
        if (obj == b0.G && hVar != null) {
            hVar.f25886f.j(oVar);
        } else {
            if (obj != b0.H || hVar == null) {
                return;
            }
            hVar.g.j(oVar);
        }
    }

    @Override // n7.a
    public final void k(Canvas canvas, Matrix matrix, int i4, r7.b bVar) {
        z zVar;
        Bitmap bitmapS = s();
        if (bitmapS == null || bitmapS.isRecycled() || (zVar = this.H) == null) {
            return;
        }
        float fC = r7.j.c();
        g7.a aVar = this.D;
        aVar.setAlpha(i4);
        s sVar = this.I;
        if (sVar != null) {
            aVar.setColorFilter((ColorFilter) sVar.e());
        }
        i7.h hVar = this.K;
        if (hVar != null) {
            bVar = hVar.b(matrix, i4);
        }
        int width = bitmapS.getWidth();
        int height = bitmapS.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        boolean z3 = this.f29791o.f23811m;
        Rect rect2 = this.F;
        if (z3) {
            rect2.set(0, 0, (int) (zVar.f23827a * fC), (int) (zVar.f23828b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmapS.getWidth() * fC), (int) (bitmapS.getHeight() * fC));
        }
        boolean z10 = bVar != null;
        if (z10) {
            if (this.L == null) {
                this.L = new r7.i();
            }
            if (this.M == null) {
                this.M = new m((byte) 0, 19);
            }
            m mVar = this.M;
            mVar.f34473b = 255;
            mVar.f34474c = null;
            bVar.getClass();
            r7.b bVar2 = new r7.b(bVar);
            mVar.f34474c = bVar2;
            bVar2.b(i4);
            float f10 = rect2.left;
            float f11 = rect2.top;
            float f12 = rect2.right;
            float f13 = rect2.bottom;
            RectF rectF = this.G;
            rectF.set(f10, f11, f12, f13);
            matrix.mapRect(rectF);
            canvas = this.L.e(canvas, rectF, this.M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapS, rect, rect2, aVar);
        if (z10) {
            this.L.c();
            if (this.L.f32870c == 4) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap s() {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.c.s():android.graphics.Bitmap");
    }
}
