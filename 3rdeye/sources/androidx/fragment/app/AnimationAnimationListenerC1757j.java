package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import androidx.fragment.app.C1754g;
import androidx.fragment.app.S;

/* compiled from: DefaultSpecialEffectsController.kt */
/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC1757j implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S.b f15892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1754g f15893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f15894c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1754g.a f15895d;

    public AnimationAnimationListenerC1757j(S.b bVar, C1754g c1754g, View view, C1754g.a aVar) {
        this.f15892a = bVar;
        this.f15893b = c1754g;
        this.f15894c = view;
        this.f15895d = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.l.f(animation, "animation");
        C1754g c1754g = this.f15893b;
        c1754g.f15833a.post(new J4.h(c1754g, this.f15894c, this.f15895d, 3));
        if (x.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f15892a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.l.f(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.l.f(animation, "animation");
        if (x.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f15892a + " has reached onAnimationStart.");
        }
    }
}
