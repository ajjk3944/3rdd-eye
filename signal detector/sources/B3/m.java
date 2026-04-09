package B3;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import h.H;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f618b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f619c;

    public /* synthetic */ m(Object obj, int i, Object obj2) {
        this.f617a = i;
        this.f618b = obj;
        this.f619c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f617a;
        Object obj = this.f619c;
        Object obj2 = this.f618b;
        switch (i) {
            case 0:
                o oVar = (o) obj2;
                e eVar = (e) obj;
                oVar.getClass();
                if (eVar.b(true) && eVar.f570m != 0 && oVar.isVisible()) {
                    oVar.invalidateSelf();
                    return;
                }
                return;
            case 1:
                ((View) ((H) ((A0.e) obj2).f73b).f20286e.getParent()).invalidate();
                return;
            default:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i3 = AppBarLayout.f18004P;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((G3.j) obj).p(fFloatValue);
                Drawable drawable = appBarLayout.f18014L;
                if (drawable instanceof G3.j) {
                    ((G3.j) drawable).p(fFloatValue);
                }
                Iterator it = appBarLayout.f18008F.iterator();
                if (it.hasNext()) {
                    throw A.f.f(it);
                }
                Iterator it2 = appBarLayout.f18009G.iterator();
                if (it2.hasNext()) {
                    throw A.f.f(it2);
                }
                return;
        }
    }
}
