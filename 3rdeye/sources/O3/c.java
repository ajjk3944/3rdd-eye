package O3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar.java */
/* loaded from: classes2.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f10215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10216c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f10217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f10218e;

    public c(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z10) {
        this.f10218e = bottomAppBar;
        this.f10215b = actionMenuView;
        this.f10216c = i;
        this.f10217d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f10214a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f10214a) {
            return;
        }
        this.f10218e.F(this.f10215b, this.f10216c, this.f10217d, false);
    }
}
