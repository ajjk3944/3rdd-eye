package N3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: HideBottomViewOnScrollBehavior.java */
/* loaded from: classes2.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4667b;

    public /* synthetic */ a(Object obj, int i) {
        this.f4666a = i;
        this.f4667b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Object obj = this.f4667b;
        switch (this.f4666a) {
            case 0:
                ((HideBottomViewOnScrollBehavior) obj).f22497h = null;
                break;
            default:
                int i = BottomAppBar.f22512j0;
                ((BottomAppBar) obj).f22515a0 = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f4666a) {
            case 1:
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
