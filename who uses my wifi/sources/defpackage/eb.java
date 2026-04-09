package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class eb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomAppBar b;

    public /* synthetic */ eb(BottomAppBar bottomAppBar, int i) {
        this.a = i;
        this.b = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        BottomAppBar bottomAppBar = this.b;
        switch (i) {
            case 1:
                int i2 = BottomAppBar.z0;
                bottomAppBar.e0 = null;
                break;
            case 2:
                int i3 = BottomAppBar.z0;
                bottomAppBar.r0 = false;
                bottomAppBar.f0 = null;
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        BottomAppBar bottomAppBar = this.b;
        switch (i) {
            case 0:
                if (!bottomAppBar.r0) {
                    bottomAppBar.F(bottomAppBar.g0, bottomAppBar.s0);
                    break;
                }
                break;
            case 1:
                int i2 = BottomAppBar.z0;
                break;
            case 2:
                int i3 = BottomAppBar.z0;
                break;
            default:
                bottomAppBar.x0.onAnimationStart(animator);
                View viewB = bottomAppBar.B();
                FloatingActionButton floatingActionButton = viewB != null ? (FloatingActionButton) viewB : null;
                if (floatingActionButton != null) {
                    floatingActionButton.setTranslationX(bottomAppBar.getFabTranslationX());
                    break;
                }
                break;
        }
    }
}
