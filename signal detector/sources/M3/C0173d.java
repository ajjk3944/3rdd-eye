package M3;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.apm.insight.R;
import com.google.android.material.internal.CheckableImageButton;
import e3.AbstractC2303a;

/* renamed from: M3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173d extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f2837e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2838f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f2839g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f2840h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final B4.g f2841j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0170a f2842k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f2843l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f2844m;

    public C0173d(p pVar) {
        super(pVar);
        this.f2841j = new B4.g(6, this);
        this.f2842k = new ViewOnFocusChangeListenerC0170a(this, 0);
        this.f2837e = com.bumptech.glide.d.O(pVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f2838f = com.bumptech.glide.d.O(pVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f2839g = com.bumptech.glide.d.P(pVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC2303a.f19927a);
        this.f2840h = com.bumptech.glide.d.P(pVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC2303a.f19930d);
    }

    @Override // M3.q
    public final void a() {
        if (this.f2896b.f2875D != null) {
            return;
        }
        t(u());
    }

    @Override // M3.q
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // M3.q
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // M3.q
    public final View.OnFocusChangeListener e() {
        return this.f2842k;
    }

    @Override // M3.q
    public final View.OnClickListener f() {
        return this.f2841j;
    }

    @Override // M3.q
    public final View.OnFocusChangeListener g() {
        return this.f2842k;
    }

    @Override // M3.q
    public final void m(EditText editText) {
        this.i = editText;
        this.f2895a.setEndIconVisible(u());
    }

    @Override // M3.q
    public final void p(boolean z6) {
        if (this.f2896b.f2875D == null) {
            return;
        }
        t(z6);
    }

    @Override // M3.q
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f2840h);
        valueAnimatorOfFloat.setDuration(this.f2838f);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: M3.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0173d f2834b;

            {
                this.f2834b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0173d c0173d = this.f2834b;
                        c0173d.getClass();
                        c0173d.f2898d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0173d c0173d2 = this.f2834b;
                        c0173d2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0173d2.f2898d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2839g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f2837e;
        valueAnimatorOfFloat2.setDuration(i3);
        final int i6 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: M3.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0173d f2834b;

            {
                this.f2834b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i6) {
                    case 0:
                        C0173d c0173d = this.f2834b;
                        c0173d.getClass();
                        c0173d.f2898d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0173d c0173d2 = this.f2834b;
                        c0173d2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0173d2.f2898d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2843l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f2843l.addListener(new C0172c(this, i6));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i3);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: M3.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0173d f2834b;

            {
                this.f2834b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i6) {
                    case 0:
                        C0173d c0173d = this.f2834b;
                        c0173d.getClass();
                        c0173d.f2898d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0173d c0173d2 = this.f2834b;
                        c0173d2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0173d2.f2898d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f2844m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C0172c(this, i));
    }

    @Override // M3.q
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new A3.z(5, this));
        }
    }

    public final void t(boolean z6) {
        boolean z7 = this.f2896b.d() == z6;
        if (z6 && !this.f2843l.isRunning()) {
            this.f2844m.cancel();
            this.f2843l.start();
            if (z7) {
                this.f2843l.end();
                return;
            }
            return;
        }
        if (z6) {
            return;
        }
        this.f2843l.cancel();
        this.f2844m.start();
        if (z7) {
            this.f2844m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.f2898d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
