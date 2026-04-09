package kd;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f28149e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28150f;
    public final TimeInterpolator g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f28151h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f28152i;
    public final com.applovin.mediation.nativeAds.a j;

    /* renamed from: k, reason: collision with root package name */
    public final a f28153k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f28154l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f28155m;

    public d(o oVar) {
        super(oVar);
        this.j = new com.applovin.mediation.nativeAds.a(14, this);
        this.f28153k = new a(this, 0);
        this.f28149e = nh.a.v(oVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f28150f = nh.a.v(oVar.getContext(), R.attr.motionDurationShort3, 150);
        this.g = nh.a.w(oVar.getContext(), R.attr.motionEasingLinearInterpolator, jc.a.f27482a);
        this.f28151h = nh.a.w(oVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, jc.a.f27485d);
    }

    @Override // kd.p
    public final void a() {
        if (this.f28196b.f28188p != null) {
            return;
        }
        s(t());
    }

    @Override // kd.p
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // kd.p
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // kd.p
    public final View.OnFocusChangeListener e() {
        return this.f28153k;
    }

    @Override // kd.p
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // kd.p
    public final View.OnFocusChangeListener g() {
        return this.f28153k;
    }

    @Override // kd.p
    public final void l(EditText editText) {
        this.f28152i = editText;
        this.f28195a.setEndIconVisible(t());
    }

    @Override // kd.p
    public final void o(boolean z3) {
        if (this.f28196b.f28188p == null) {
            return;
        }
        s(z3);
    }

    @Override // kd.p
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f28151h);
        valueAnimatorOfFloat.setDuration(this.f28150f);
        final int i4 = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: kd.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f28144b;

            {
                this.f28144b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        d dVar = this.f28144b;
                        dVar.getClass();
                        dVar.f28198d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f28144b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f28198d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i10 = this.f28149e;
        valueAnimatorOfFloat2.setDuration(i10);
        final int i11 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: kd.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f28144b;

            {
                this.f28144b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        d dVar = this.f28144b;
                        dVar.getClass();
                        dVar.f28198d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f28144b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f28198d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f28154l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f28154l.addListener(new c(this, i11));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i10);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: kd.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f28144b;

            {
                this.f28144b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        d dVar = this.f28144b;
                        dVar.getClass();
                        dVar.f28198d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f28144b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f28198d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f28155m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new c(this, i4));
    }

    @Override // kd.p
    public final void r() {
        EditText editText = this.f28152i;
        if (editText != null) {
            editText.post(new ig.l(6, this));
        }
    }

    public final void s(boolean z3) {
        boolean z10 = this.f28196b.d() == z3;
        if (z3 && !this.f28154l.isRunning()) {
            this.f28155m.cancel();
            this.f28154l.start();
            if (z10) {
                this.f28154l.end();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f28154l.cancel();
        this.f28155m.start();
        if (z10) {
            this.f28155m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.f28152i;
        if (editText != null) {
            return (editText.hasFocus() || this.f28198d.hasFocus()) && this.f28152i.getText().length() > 0;
        }
        return false;
    }
}
