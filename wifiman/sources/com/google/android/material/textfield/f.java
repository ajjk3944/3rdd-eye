package com.google.android.material.textfield;

import a4.AbstractC3764d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes3.dex */
class f extends s {

    /* renamed from: e, reason: collision with root package name */
    private final int f37772e;

    /* renamed from: f, reason: collision with root package name */
    private final int f37773f;

    /* renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f37774g;

    /* renamed from: h, reason: collision with root package name */
    private final TimeInterpolator f37775h;

    /* renamed from: i, reason: collision with root package name */
    private EditText f37776i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f37777j;

    /* renamed from: k, reason: collision with root package name */
    private final View.OnFocusChangeListener f37778k;

    /* renamed from: l, reason: collision with root package name */
    private AnimatorSet f37779l;

    /* renamed from: m, reason: collision with root package name */
    private ValueAnimator f37780m;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.f37839b.a0(true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f37839b.a0(false);
        }
    }

    f(r rVar) {
        super(rVar);
        this.f37777j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37767a.G(view);
            }
        };
        this.f37778k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                this.f37768a.H(view, z10);
            }
        };
        Context context = rVar.getContext();
        int i10 = O3.a.f16947A;
        this.f37772e = AbstractC3764d.f(context, i10, 100);
        this.f37773f = AbstractC3764d.f(rVar.getContext(), i10, 150);
        this.f37774g = AbstractC3764d.g(rVar.getContext(), O3.a.f16951E, P3.a.f18021a);
        this.f37775h = AbstractC3764d.g(rVar.getContext(), O3.a.f16950D, P3.a.f18024d);
    }

    private void A(boolean z10) {
        boolean z11 = this.f37839b.F() == z10;
        if (z10 && !this.f37779l.isRunning()) {
            this.f37780m.cancel();
            this.f37779l.start();
            if (z11) {
                this.f37779l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f37779l.cancel();
        this.f37780m.start();
        if (z11) {
            this.f37780m.end();
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f37774g);
        valueAnimatorOfFloat.setDuration(this.f37772e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f37769a.E(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f37775h);
        valueAnimatorOfFloat.setDuration(this.f37773f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f37771a.F(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f37779l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f37779l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f37780m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(ValueAnimator valueAnimator) {
        this.f37841d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f37841d.setScaleX(fFloatValue);
        this.f37841d.setScaleY(fFloatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(View view) {
        EditText editText = this.f37776i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(View view, boolean z10) {
        A(J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        A(true);
    }

    private boolean J() {
        EditText editText = this.f37776i;
        return editText != null && (editText.hasFocus() || this.f37841d.hasFocus()) && this.f37776i.getText().length() > 0;
    }

    @Override // com.google.android.material.textfield.s
    void a(Editable editable) {
        if (this.f37839b.w() != null) {
            return;
        }
        A(J());
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return O3.h.f17120e;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return O3.d.f17053i;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f37778k;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f37777j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener g() {
        return this.f37778k;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f37776i = editText;
        this.f37838a.setEndIconVisible(J());
    }

    @Override // com.google.android.material.textfield.s
    void q(boolean z10) {
        if (this.f37839b.w() == null) {
            return;
        }
        A(z10);
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        D();
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        EditText editText = this.f37776i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37770a.I();
                }
            });
        }
    }
}
