package b5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1817c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f1818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f1819e;

    public i(ViewGroup viewGroup, View view, boolean z3, g1 g1Var, j jVar) {
        this.f1815a = viewGroup;
        this.f1816b = view;
        this.f1817c = z3;
        this.f1818d = g1Var;
        this.f1819e = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nk.k.e(animator, "anim");
        ViewGroup viewGroup = this.f1815a;
        View view = this.f1816b;
        viewGroup.endViewTransition(view);
        boolean z3 = this.f1817c;
        g1 g1Var = this.f1818d;
        if (z3 || g1Var.f1799a == 3) {
            int i4 = g1Var.f1799a;
            nk.k.d(view, "viewToAnimate");
            a0.g.d(i4, view, viewGroup);
        }
        j jVar = this.f1819e;
        ((g1) jVar.f1824c.f218b).c(jVar);
        if (u0.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + g1Var + " has ended.");
        }
    }
}
