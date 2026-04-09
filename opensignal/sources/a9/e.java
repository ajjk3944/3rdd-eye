package a9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.HashMap;
import r8.v;
import r8.x;
import r8.z;
import u8.r;

/* loaded from: classes.dex */
public final class e extends b {
    public final l D;
    public final Rect E;
    public final Rect F;
    public final RectF G;
    public final x H;
    public r I;
    public r J;
    public final u8.g K;
    public e9.i L;
    public ag.b M;

    public e(v vVar, h hVar) {
        super(vVar, hVar);
        this.D = new l(3, 2);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        String str = hVar.f254g;
        r8.h hVar2 = vVar.f21375a;
        this.H = hVar2 == null ? null : (x) ((HashMap) hVar2.c()).get(str);
        cj.a aVar = this.f236p.f269x;
        if (aVar != null) {
            this.K = new u8.g(this, this, aVar);
        }
    }

    @Override // a9.b, t8.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        Bitmap bitmapS;
        super.d(rectF, matrix, z10);
        x xVar = this.H;
        if (xVar != null) {
            int i10 = xVar.f21396b;
            int i11 = xVar.f21395a;
            float fC = e9.j.c();
            if (this.f235o.J || (bitmapS = s()) == null) {
                rectF.set(0.0f, 0.0f, i11 * fC, i10 * fC);
            } else {
                rectF.set(0.0f, 0.0f, bitmapS.getWidth() * fC, bitmapS.getHeight() * fC);
            }
            this.f234n.mapRect(rectF);
        }
    }

    @Override // a9.b, x8.g
    public final void f(bm.e eVar, Object obj) {
        super.f(eVar, obj);
        if (obj == z.I) {
            this.I = new r(eVar, null);
            return;
        }
        if (obj == z.L) {
            this.J = new r(eVar, null);
            return;
        }
        u8.g gVar = this.K;
        if (obj == 5 && gVar != null) {
            gVar.f23459c.k(eVar);
            return;
        }
        if (obj == z.E && gVar != null) {
            gVar.c(eVar);
            return;
        }
        if (obj == z.F && gVar != null) {
            gVar.f23461e.k(eVar);
            return;
        }
        if (obj == z.G && gVar != null) {
            gVar.f23462f.k(eVar);
        } else {
            if (obj != z.H || gVar == null) {
                return;
            }
            gVar.f23463g.k(eVar);
        }
    }

    @Override // a9.b
    public final void k(Canvas canvas, Matrix matrix, int i10, e9.a aVar) {
        x xVar;
        Bitmap bitmapS = s();
        if (bitmapS == null || bitmapS.isRecycled() || (xVar = this.H) == null) {
            return;
        }
        float fC = e9.j.c();
        l lVar = this.D;
        lVar.setAlpha(i10);
        r rVar = this.I;
        if (rVar != null) {
            lVar.setColorFilter((ColorFilter) rVar.f());
        }
        u8.g gVar = this.K;
        if (gVar != null) {
            aVar = gVar.b(matrix, i10);
        }
        int width = bitmapS.getWidth();
        int height = bitmapS.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        boolean z10 = this.f235o.J;
        Rect rect2 = this.F;
        if (z10) {
            rect2.set(0, 0, (int) (xVar.f21395a * fC), (int) (xVar.f21396b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmapS.getWidth() * fC), (int) (bitmapS.getHeight() * fC));
        }
        boolean z11 = aVar != null;
        if (z11) {
            if (this.L == null) {
                this.L = new e9.i();
            }
            if (this.M == null) {
                this.M = new ag.b(1, (byte) 0);
            }
            ag.b bVar = this.M;
            bVar.f345d = 255;
            bVar.f346g = null;
            aVar.getClass();
            e9.a aVar2 = new e9.a(aVar);
            bVar.f346g = aVar2;
            aVar2.b(i10);
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
        canvas.drawBitmap(bitmapS, rect, rect2, lVar);
        if (z11) {
            this.L.c();
            if (this.L.f7997c == e9.h.RENDER_NODE) {
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
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.e.s():android.graphics.Bitmap");
    }
}
