package gd;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import ee.i;
import h7.r1;
import i.m0;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9501c;

    public /* synthetic */ b(Object obj, int i10, Object obj2) {
        this.f9499a = i10;
        this.f9500b = obj;
        this.f9501c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f9499a;
        Object obj = this.f9500b;
        switch (i10) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                i iVar = (i) this.f9501c;
                int i11 = AppBarLayout.W;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.p(fFloatValue);
                Drawable drawable = appBarLayout.S;
                if (drawable instanceof i) {
                    ((i) drawable).p(fFloatValue);
                }
                Iterator it = appBarLayout.M.iterator();
                if (it.hasNext()) {
                    throw w.g.d(it);
                }
                Iterator it2 = appBarLayout.N.iterator();
                if (it2.hasNext()) {
                    throw w.g.d(it2);
                }
                return;
            default:
                ((View) ((m0) ((r1) obj).f10199d).f11076f.getParent()).invalidate();
                return;
        }
    }
}
