package e4;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22304c;

    public /* synthetic */ a1(int i4, Object obj, Object obj2) {
        this.f22302a = i4;
        this.f22303b = obj;
        this.f22304c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i4 = this.f22302a;
        Object obj = this.f22303b;
        switch (i4) {
            case 0:
                ((View) ((i.i0) ((p6.i) obj).f31385a).f25309f.getParent()).invalidate();
                return;
            default:
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                ed.j jVar = (ed.j) this.f22304c;
                int i10 = AppBarLayout.A;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar.n(fFloatValue);
                Drawable drawable = appBarLayout.f20305w;
                if (drawable instanceof ed.j) {
                    ((ed.j) drawable).n(fFloatValue);
                }
                Iterator it = appBarLayout.f20299q.iterator();
                if (it.hasNext()) {
                    throw je.u.o(it);
                }
                Iterator it2 = appBarLayout.f20300r.iterator();
                if (it2.hasNext()) {
                    throw je.u.o(it2);
                }
                return;
        }
    }
}
