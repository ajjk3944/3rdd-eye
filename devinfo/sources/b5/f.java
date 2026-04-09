package b5;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f1788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1790c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f1791d;

    public f(g1 g1Var, ViewGroup viewGroup, View view, g gVar) {
        this.f1788a = g1Var;
        this.f1789b = viewGroup;
        this.f1790c = view;
        this.f1791d = gVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        nk.k.e(animation, "animation");
        ViewGroup viewGroup = this.f1789b;
        viewGroup.post(new e(viewGroup, this.f1790c, this.f1791d, 0));
        if (u0.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1788a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        nk.k.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        nk.k.e(animation, "animation");
        if (u0.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1788a + " has reached onAnimationStart.");
        }
    }
}
