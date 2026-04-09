package p4;

import J8.C0693h;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import f4.C4334b;

/* compiled from: ClearTextEndIconDelegate.java */
/* renamed from: p4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5452b extends AbstractC5458h {

    /* renamed from: e, reason: collision with root package name */
    public final int f45122e;

    /* renamed from: f, reason: collision with root package name */
    public final int f45123f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f45124g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f45125h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final D8.f f45126j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC5451a f45127k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f45128l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f45129m;

    /* JADX WARN: Type inference failed for: r0v1, types: [p4.a] */
    public C5452b(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f45126j = new D8.f(this, 8);
        this.f45127k = new View.OnFocusChangeListener() { // from class: p4.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5452b c5452b = this.f45121a;
                c5452b.t(c5452b.u());
            }
        };
        this.f45122e = C4334b.c(aVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f45123f = C4334b.c(aVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f45124g = C4334b.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, L3.a.f4034a);
        this.f45125h = C4334b.d(aVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, L3.a.f4037d);
    }

    @Override // p4.AbstractC5458h
    public final void a() {
        if (this.f45149b.f23144q != null) {
            return;
        }
        t(u());
    }

    @Override // p4.AbstractC5458h
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p4.AbstractC5458h
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p4.AbstractC5458h
    public final View.OnFocusChangeListener e() {
        return this.f45127k;
    }

    @Override // p4.AbstractC5458h
    public final View.OnClickListener f() {
        return this.f45126j;
    }

    @Override // p4.AbstractC5458h
    public final View.OnFocusChangeListener g() {
        return this.f45127k;
    }

    @Override // p4.AbstractC5458h
    public final void m(EditText editText) {
        this.i = editText;
        this.f45148a.setEndIconVisible(u());
    }

    @Override // p4.AbstractC5458h
    public final void p(boolean z10) {
        if (this.f45149b.f23144q == null) {
            return;
        }
        t(z10);
    }

    @Override // p4.AbstractC5458h
    public final void r() {
        int i = 3;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f45125h);
        valueAnimatorOfFloat.setDuration(this.f45123f);
        valueAnimatorOfFloat.addUpdateListener(new k3.b(this, 1));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f45124g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i10 = this.f45122e;
        valueAnimatorOfFloat2.setDuration(i10);
        valueAnimatorOfFloat2.addUpdateListener(new C0693h(this, i));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f45128l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f45128l.addListener(new L1.e(this, 2));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i10);
        valueAnimatorOfFloat3.addUpdateListener(new C0693h(this, i));
        this.f45129m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new O3.d(this, 1));
    }

    @Override // p4.AbstractC5458h
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new C8.a(this, 23));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = this.f45149b.d() == z10;
        if (z10 && !this.f45128l.isRunning()) {
            this.f45129m.cancel();
            this.f45128l.start();
            if (z11) {
                this.f45128l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f45128l.cancel();
        this.f45129m.start();
        if (z11) {
            this.f45129m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.f45151d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
