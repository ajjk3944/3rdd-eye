package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class e5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e5(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i2 = AppBarLayout.F;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((nc0) obj).p(fFloatValue);
                Drawable drawable = appBarLayout.B;
                if (drawable instanceof nc0) {
                    ((nc0) drawable).p(fFloatValue);
                }
                Iterator it = appBarLayout.v.iterator();
                if (it.hasNext()) {
                    throw ex0.e(it);
                }
                Iterator it2 = appBarLayout.w.iterator();
                if (it2.hasNext()) {
                    throw ex0.e(it2);
                }
                return;
            case 1:
                oo ooVar = (oo) obj2;
                v60 v60Var = (v60) obj;
                ooVar.getClass();
                if (v60Var.c(true) && v60Var.m != 0 && ooVar.isVisible()) {
                    ooVar.invalidateSelf();
                    return;
                }
                return;
            default:
                ((View) ((t81) ((f20) obj2).g).j.getParent()).invalidate();
                return;
        }
    }
}
