package com.google.android.material.textfield;

import F1.W;
import G1.c;
import a4.AbstractC3764d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;

/* loaded from: classes3.dex */
class p extends s {

    /* renamed from: s, reason: collision with root package name */
    private static final boolean f37792s = true;

    /* renamed from: e, reason: collision with root package name */
    private final int f37793e;

    /* renamed from: f, reason: collision with root package name */
    private final int f37794f;

    /* renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f37795g;

    /* renamed from: h, reason: collision with root package name */
    private AutoCompleteTextView f37796h;

    /* renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f37797i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnFocusChangeListener f37798j;

    /* renamed from: k, reason: collision with root package name */
    private final c.a f37799k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f37800l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f37801m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f37802n;

    /* renamed from: o, reason: collision with root package name */
    private long f37803o;

    /* renamed from: p, reason: collision with root package name */
    private AccessibilityManager f37804p;

    /* renamed from: q, reason: collision with root package name */
    private ValueAnimator f37805q;

    /* renamed from: r, reason: collision with root package name */
    private ValueAnimator f37806r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f37806r.start();
        }
    }

    p(r rVar) {
        super(rVar);
        this.f37797i = new View.OnClickListener() { // from class: com.google.android.material.textfield.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37788a.J(view);
            }
        };
        this.f37798j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                this.f37789a.K(view, z10);
            }
        };
        this.f37799k = new c.a() { // from class: com.google.android.material.textfield.n
            @Override // G1.c.a
            public final void onTouchExplorationStateChanged(boolean z10) {
                this.f37790a.L(z10);
            }
        };
        this.f37803o = Long.MAX_VALUE;
        Context context = rVar.getContext();
        int i10 = O3.a.f16947A;
        this.f37794f = AbstractC3764d.f(context, i10, 67);
        this.f37793e = AbstractC3764d.f(rVar.getContext(), i10, 50);
        this.f37795g = AbstractC3764d.g(rVar.getContext(), O3.a.f16951E, P3.a.f18021a);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f37795g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f37785a.I(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void F() {
        this.f37806r = E(this.f37794f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f37793e, 1.0f, 0.0f);
        this.f37805q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    private boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f37803o;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        boolean zIsPopupShowing = this.f37796h.isPopupShowing();
        O(zIsPopupShowing);
        this.f37801m = zIsPopupShowing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(ValueAnimator valueAnimator) {
        this.f37841d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(View view, boolean z10) {
        this.f37800l = z10;
        r();
        if (z10) {
            return;
        }
        O(false);
        this.f37801m = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(boolean z10) {
        AutoCompleteTextView autoCompleteTextView = this.f37796h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        W.u0(this.f37841d, z10 ? 2 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (G()) {
                this.f37801m = false;
            }
            Q();
            R();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        R();
        O(false);
    }

    private void O(boolean z10) {
        if (this.f37802n != z10) {
            this.f37802n = z10;
            this.f37806r.cancel();
            this.f37805q.start();
        }
    }

    private void P() {
        this.f37796h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f37786a.M(view, motionEvent);
            }
        });
        if (f37792s) {
            this.f37796h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.k
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    this.f37787a.N();
                }
            });
        }
        this.f37796h.setThreshold(0);
    }

    private void Q() {
        if (this.f37796h == null) {
            return;
        }
        if (G()) {
            this.f37801m = false;
        }
        if (this.f37801m) {
            this.f37801m = false;
            return;
        }
        if (f37792s) {
            O(!this.f37802n);
        } else {
            this.f37802n = !this.f37802n;
            r();
        }
        if (!this.f37802n) {
            this.f37796h.dismissDropDown();
        } else {
            this.f37796h.requestFocus();
            this.f37796h.showDropDown();
        }
    }

    private void R() {
        this.f37801m = true;
        this.f37803o = System.currentTimeMillis();
    }

    @Override // com.google.android.material.textfield.s
    public void a(Editable editable) {
        if (this.f37804p.isTouchExplorationEnabled() && q.a(this.f37796h) && !this.f37841d.hasFocus()) {
            this.f37796h.dismissDropDown();
        }
        this.f37796h.post(new Runnable() { // from class: com.google.android.material.textfield.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f37791a.H();
            }
        });
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return O3.h.f17122g;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return f37792s ? O3.d.f17051g : O3.d.f17052h;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f37798j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f37797i;
    }

    @Override // com.google.android.material.textfield.s
    public c.a h() {
        return this.f37799k;
    }

    @Override // com.google.android.material.textfield.s
    boolean i(int i10) {
        return i10 != 0;
    }

    @Override // com.google.android.material.textfield.s
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean k() {
        return this.f37800l;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return this.f37802n;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f37796h = D(editText);
        P();
        this.f37838a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f37804p.isTouchExplorationEnabled()) {
            W.u0(this.f37841d, 2);
        }
        this.f37838a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.s
    public void o(View view, G1.t tVar) {
        if (!q.a(this.f37796h)) {
            tVar.g0(Spinner.class.getName());
        }
        if (tVar.R()) {
            tVar.s0(null);
        }
    }

    @Override // com.google.android.material.textfield.s
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f37804p.isEnabled() || q.a(this.f37796h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f37802n && !this.f37796h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            Q();
            R();
        }
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        F();
        this.f37804p = (AccessibilityManager) this.f37840c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.s
    boolean t() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.f37796h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f37792s) {
                this.f37796h.setOnDismissListener(null);
            }
        }
    }
}
