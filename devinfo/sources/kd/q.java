package kd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f28200b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28201c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f28202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f28203e;

    public q(s sVar, int i4, TextView textView, int i10, TextView textView2) {
        this.f28203e = sVar;
        this.f28199a = i4;
        this.f28200b = textView;
        this.f28201c = i10;
        this.f28202d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i4 = this.f28199a;
        s sVar = this.f28203e;
        sVar.f28216n = i4;
        sVar.f28214l = null;
        TextView textView = this.f28200b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f28201c == 1 && (appCompatTextView = sVar.f28220r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f28202d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f28202d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
