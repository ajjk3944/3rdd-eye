package je;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import p.q0;

/* loaded from: classes.dex */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f13653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13654c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f13655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f13656e;

    public o(q qVar, int i10, TextView textView, int i11, TextView textView2) {
        this.f13656e = qVar;
        this.f13652a = i10;
        this.f13653b = textView;
        this.f13654c = i11;
        this.f13655d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q0 q0Var;
        int i10 = this.f13652a;
        q qVar = this.f13656e;
        qVar.f13669n = i10;
        qVar.f13667l = null;
        TextView textView = this.f13653b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f13654c == 1 && (q0Var = qVar.f13673r) != null) {
                q0Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f13655d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f13655d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
