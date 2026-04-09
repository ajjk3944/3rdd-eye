package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.AbstractC1135f5;

/* renamed from: k0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2603g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2605i f21627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f21628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f21629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U f21630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2601e f21631e;

    public C2603g(C2605i c2605i, View view, boolean z6, U u6, C2601e c2601e) {
        this.f21627a = c2605i;
        this.f21628b = view;
        this.f21629c = z6;
        this.f21630d = u6;
        this.f21631e = c2601e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q5.i.e(animator, "anim");
        ViewGroup viewGroup = this.f21627a.f21636a;
        View view = this.f21628b;
        viewGroup.endViewTransition(view);
        boolean z6 = this.f21629c;
        U u6 = this.f21630d;
        if (z6) {
            int i = u6.f21577a;
            q5.i.d(view, "viewToAnimate");
            AbstractC1135f5.c(i, view);
        }
        this.f21631e.f();
        if (K.H(2)) {
            Log.v("FragmentManager", "Animator from operation " + u6 + " has ended.");
        }
    }
}
