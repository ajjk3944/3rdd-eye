package m0;

import android.graphics.Rect;
import android.graphics.RectF;
import l0.C6533i;

/* loaded from: classes.dex */
public abstract class b1 {
    public static final Rect a(Y0.p pVar) {
        return new Rect(pVar.f(), pVar.h(), pVar.g(), pVar.d());
    }

    public static final Rect b(C6533i c6533i) {
        return new Rect((int) c6533i.k(), (int) c6533i.n(), (int) c6533i.l(), (int) c6533i.e());
    }

    public static final RectF c(C6533i c6533i) {
        return new RectF(c6533i.k(), c6533i.n(), c6533i.l(), c6533i.e());
    }

    public static final Y0.p d(Rect rect) {
        return new Y0.p(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final C6533i e(Rect rect) {
        return new C6533i(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final C6533i f(RectF rectF) {
        return new C6533i(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
