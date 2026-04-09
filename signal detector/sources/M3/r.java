package M3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f2900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2901c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f2902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f2903e;

    public r(t tVar, int i, TextView textView, int i3, TextView textView2) {
        this.f2903e = tVar;
        this.f2899a = i;
        this.f2900b = textView;
        this.f2901c = i3;
        this.f2902d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i = this.f2899a;
        t tVar = this.f2903e;
        tVar.f2919n = i;
        tVar.f2917l = null;
        TextView textView = this.f2900b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f2901c == 1 && (appCompatTextView = tVar.f2923r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f2902d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f2902d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
