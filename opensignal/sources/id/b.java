package id;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.util.ArrayList;
import je.j;
import t7.q;
import u7.f;

/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11330b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f11329a = i10;
        this.f11330b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f11329a) {
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f11330b;
                actionBarOverlayLayout.S = null;
                actionBarOverlayLayout.F = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11329a) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.f11330b).k = null;
                break;
            case 1:
                ((HideViewOnScrollBehavior) this.f11330b).k = null;
                break;
            case 2:
                j jVar = (j) this.f11330b;
                jVar.p();
                jVar.f13639r.start();
                break;
            case 3:
                ((ExpandableTransformationBehavior) this.f11330b).f5798b = null;
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f11330b;
                actionBarOverlayLayout.S = null;
                actionBarOverlayLayout.F = false;
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                ((q) this.f11330b).m();
                animator.removeListener(this);
                break;
            default:
                f fVar = (f) this.f11330b;
                ArrayList arrayList = new ArrayList(fVar.f23389x);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((pd.a) arrayList.get(i10)).a(fVar);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f11329a) {
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                f fVar = (f) this.f11330b;
                ArrayList arrayList = new ArrayList(fVar.f23389x);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((pd.a) arrayList.get(i10)).b(fVar);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
