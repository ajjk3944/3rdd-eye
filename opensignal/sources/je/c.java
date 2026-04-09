package je;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import ir.f0;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: e, reason: collision with root package name */
    public final int f13612e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13613f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f13614g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f13615h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f13616i;
    public final am.b j;
    public final bq.h k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f13617l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f13618m;

    public c(m mVar) {
        super(mVar);
        this.j = new am.b(11, this);
        this.k = new bq.h(2, this);
        this.f13612e = f0.U(mVar.getContext(), ed.b.motionDurationShort3, 100);
        this.f13613f = f0.U(mVar.getContext(), ed.b.motionDurationShort3, 150);
        this.f13614g = f0.V(mVar.getContext(), ed.b.motionEasingLinearInterpolator, fd.a.f8822a);
        this.f13615h = f0.V(mVar.getContext(), ed.b.motionEasingEmphasizedInterpolator, fd.a.f8825d);
    }

    @Override // je.n
    public final void a() {
        if (this.f13649b.L != null) {
            return;
        }
        s(t());
    }

    @Override // je.n
    public final int c() {
        return ed.j.clear_text_end_icon_content_description;
    }

    @Override // je.n
    public final int d() {
        return ed.e.mtrl_ic_cancel;
    }

    @Override // je.n
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // je.n
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // je.n
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // je.n
    public final void l(EditText editText) {
        this.f13616i = editText;
        this.f13648a.setEndIconVisible(t());
    }

    @Override // je.n
    public final void o(boolean z10) {
        if (this.f13649b.L == null) {
            return;
        }
        s(z10);
    }

    @Override // je.n
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f13615h);
        valueAnimatorOfFloat.setDuration(this.f13613f);
        final int i10 = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: je.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f13609b;

            {
                this.f13609b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        c cVar = this.f13609b;
                        cVar.getClass();
                        cVar.f13651d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        c cVar2 = this.f13609b;
                        cVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.f13651d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f13614g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i11 = this.f13612e;
        valueAnimatorOfFloat2.setDuration(i11);
        final int i12 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: je.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f13609b;

            {
                this.f13609b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        c cVar = this.f13609b;
                        cVar.getClass();
                        cVar.f13651d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        c cVar2 = this.f13609b;
                        cVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.f13651d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f13617l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f13617l.addListener(new b(this, i12));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i11);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: je.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f13609b;

            {
                this.f13609b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        c cVar = this.f13609b;
                        cVar.getClass();
                        cVar.f13651d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        c cVar2 = this.f13609b;
                        cVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.f13651d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f13618m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new b(this, i10));
    }

    @Override // je.n
    public final void r() {
        EditText editText = this.f13616i;
        if (editText != null) {
            editText.post(new j4.o(2, this));
        }
    }

    public final void s(boolean z10) {
        boolean z11 = this.f13649b.d() == z10;
        if (z10 && !this.f13617l.isRunning()) {
            this.f13618m.cancel();
            this.f13617l.start();
            if (z11) {
                this.f13617l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f13617l.cancel();
        this.f13618m.start();
        if (z11) {
            this.f13618m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.f13616i;
        if (editText != null) {
            return (editText.hasFocus() || this.f13651d.hasFocus()) && this.f13616i.getText().length() > 0;
        }
        return false;
    }
}
