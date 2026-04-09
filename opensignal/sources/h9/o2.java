package h9;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class o2 extends se.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10438c;

    /* renamed from: d, reason: collision with root package name */
    public float f10439d;

    /* renamed from: e, reason: collision with root package name */
    public final float f10440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r2 f10441f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f10442g;

    public o2(r2 r2Var, float f10, float f11) {
        this.f10438c = 1;
        this.f10441f = r2Var;
        this.f10442g = new RectF();
        this.f10439d = f10;
        this.f10440e = f11;
    }

    @Override // se.b
    public final void N(String str) {
        String str2;
        switch (this.f10438c) {
            case 0:
                r2 r2Var = this.f10441f;
                if (r2Var.y1()) {
                    Path path = new Path();
                    str2 = str;
                    ((p2) r2Var.f10472g).f10452d.getTextPath(str2, 0, str.length(), this.f10439d, this.f10440e, path);
                    ((Path) this.f10442g).addPath(path);
                } else {
                    str2 = str;
                }
                this.f10439d = ((p2) r2Var.f10472g).f10452d.measureText(str2) + this.f10439d;
                break;
            default:
                r2 r2Var2 = this.f10441f;
                if (r2Var2.y1()) {
                    Rect rect = new Rect();
                    ((p2) r2Var2.f10472g).f10452d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.f10439d, this.f10440e);
                    ((RectF) this.f10442g).union(rectF);
                }
                this.f10439d = ((p2) r2Var2.f10472g).f10452d.measureText(str) + this.f10439d;
                break;
        }
    }

    @Override // se.b
    public final boolean s(b2 b2Var) {
        switch (this.f10438c) {
            case 0:
                if (!(b2Var instanceof c2)) {
                    return true;
                }
                io.sentry.android.core.e0.p("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
                return false;
            default:
                if (!(b2Var instanceof c2)) {
                    return true;
                }
                c2 c2Var = (c2) b2Var;
                o1 o1VarN = b2Var.f10461a.N(c2Var.f10314n);
                if (o1VarN == null) {
                    r2.T("TextPath path reference '%s' not found", c2Var.f10314n);
                } else {
                    r0 r0Var = (r0) o1VarN;
                    l2 l2Var = new l2(r0Var.f10469o);
                    Matrix matrix = r0Var.f10351n;
                    Path path = l2Var.f10404a;
                    if (matrix != null) {
                        path.transform(matrix);
                    }
                    RectF rectF = new RectF();
                    path.computeBounds(rectF, true);
                    ((RectF) this.f10442g).union(rectF);
                }
                return false;
        }
    }

    public o2(r2 r2Var, float f10, float f11, Path path) {
        this.f10438c = 0;
        this.f10441f = r2Var;
        this.f10439d = f10;
        this.f10440e = f11;
        this.f10442g = path;
    }
}
