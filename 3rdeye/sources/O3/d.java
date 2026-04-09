package O3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import p4.C5452b;

/* compiled from: BottomAppBar.java */
/* loaded from: classes2.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10220b;

    public /* synthetic */ d(Object obj, int i) {
        this.f10219a = i;
        this.f10220b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f10219a) {
            case 1:
                ((C5452b) this.f10220b).f45149b.h(false);
                break;
            case 2:
                ((ExpandableTransformationBehavior) this.f10220b).f23203b = null;
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f10219a) {
            case 0:
                ((BottomAppBar) this.f10220b).getClass();
                throw null;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
