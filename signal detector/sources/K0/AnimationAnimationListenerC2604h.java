package k0;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

/* renamed from: k0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC2604h implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f21632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2605i f21633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f21634c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2601e f21635d;

    public AnimationAnimationListenerC2604h(View view, C2601e c2601e, C2605i c2605i, U u6) {
        this.f21632a = u6;
        this.f21633b = c2605i;
        this.f21634c = view;
        this.f21635d = c2601e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        q5.i.e(animation, "animation");
        C2605i c2605i = this.f21633b;
        c2605i.f21636a.post(new f0.l(c2605i, this.f21634c, this.f21635d, 1));
        if (K.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f21632a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        q5.i.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        q5.i.e(animation, "animation");
        if (K.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f21632a + " has reached onAnimationStart.");
        }
    }
}
