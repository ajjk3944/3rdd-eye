package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes2.dex */
public class f extends t {

    /* renamed from: e, reason: collision with root package name */
    public final int f11327e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11328f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f11329g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f11330h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f11331i;

    /* renamed from: j, reason: collision with root package name */
    public final View.OnClickListener f11332j;

    /* renamed from: k, reason: collision with root package name */
    public final View.OnFocusChangeListener f11333k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f11334l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f11335m;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.f11394b.a0(true);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f11394b.a0(false);
        }
    }

    public f(s sVar) {
        super(sVar);
        this.f11332j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.v(this.f11312a, view);
            }
        };
        this.f11333k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                f fVar = this.f11323a;
                fVar.A(fVar.E());
            }
        };
        Context context = sVar.getContext();
        int i10 = j4.b.motionDurationShort3;
        this.f11327e = b5.k.f(context, i10, 100);
        this.f11328f = b5.k.f(sVar.getContext(), i10, 150);
        this.f11329g = b5.k.g(sVar.getContext(), j4.b.motionEasingLinearInterpolator, k4.a.f21834a);
        this.f11330h = b5.k.g(sVar.getContext(), j4.b.motionEasingEmphasizedInterpolator, k4.a.f21837d);
    }

    public static /* synthetic */ void v(f fVar, View view) {
        EditText editText = fVar.f11331i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        fVar.r();
    }

    public static /* synthetic */ void x(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        fVar.f11396d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.f11396d.setScaleX(fFloatValue);
        fVar.f11396d.setScaleY(fFloatValue);
    }

    public final void A(boolean z10) {
        boolean z11 = this.f11394b.F() == z10;
        if (z10 && !this.f11334l.isRunning()) {
            this.f11335m.cancel();
            this.f11334l.start();
            if (z11) {
                this.f11334l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f11334l.cancel();
        this.f11335m.start();
        if (z11) {
            this.f11335m.end();
        }
    }

    public final ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f11329g);
        valueAnimatorOfFloat.setDuration(this.f11327e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.x(this.f11324a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f11330h);
        valueAnimatorOfFloat.setDuration(this.f11328f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.y(this.f11326a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f11334l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f11334l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f11335m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    public final boolean E() {
        EditText editText = this.f11331i;
        if (editText != null) {
            return (editText.hasFocus() || this.f11396d.hasFocus()) && this.f11331i.getText().length() > 0;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.t
    public void a(Editable editable) {
        if (this.f11394b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // com.google.android.material.textfield.t
    public int c() {
        return j4.j.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.t
    public int d() {
        return j4.e.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.t
    public View.OnFocusChangeListener e() {
        return this.f11333k;
    }

    @Override // com.google.android.material.textfield.t
    public View.OnClickListener f() {
        return this.f11332j;
    }

    @Override // com.google.android.material.textfield.t
    public View.OnFocusChangeListener g() {
        return this.f11333k;
    }

    @Override // com.google.android.material.textfield.t
    public void n(EditText editText) {
        this.f11331i = editText;
        this.f11393a.setEndIconVisible(E());
    }

    @Override // com.google.android.material.textfield.t
    public void q(boolean z10) {
        if (this.f11394b.w() == null) {
            return;
        }
        A(z10);
    }

    @Override // com.google.android.material.textfield.t
    public void s() {
        D();
    }

    @Override // com.google.android.material.textfield.t
    public void u() {
        EditText editText = this.f11331i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11325a.A(true);
                }
            });
        }
    }
}
