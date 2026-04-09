package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1754g;
import androidx.fragment.app.S;

/* compiled from: DefaultSpecialEffectsController.kt */
/* renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1756i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1754g f15887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f15888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15889c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S.b f15890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1754g.a f15891e;

    public C1756i(C1754g c1754g, View view, boolean z10, S.b bVar, C1754g.a aVar) {
        this.f15887a = c1754g;
        this.f15888b = view;
        this.f15889c = z10;
        this.f15890d = bVar;
        this.f15891e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        kotlin.jvm.internal.l.f(anim, "anim");
        ViewGroup viewGroup = this.f15887a.f15833a;
        View viewToAnimate = this.f15888b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z10 = this.f15889c;
        S.b bVar = this.f15890d;
        if (z10) {
            S.b.EnumC0238b enumC0238b = bVar.f15839a;
            kotlin.jvm.internal.l.e(viewToAnimate, "viewToAnimate");
            enumC0238b.applyState(viewToAnimate);
        }
        this.f15891e.a();
        if (x.G(2)) {
            Log.v("FragmentManager", "Animator from operation " + bVar + " has ended.");
        }
    }
}
