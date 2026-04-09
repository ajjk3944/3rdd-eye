package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;

/* loaded from: classes2.dex */
public class q extends t {

    /* renamed from: e, reason: collision with root package name */
    public final int f11348e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11349f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f11350g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f11351h;

    /* renamed from: i, reason: collision with root package name */
    public final View.OnClickListener f11352i;

    /* renamed from: j, reason: collision with root package name */
    public final View.OnFocusChangeListener f11353j;

    /* renamed from: k, reason: collision with root package name */
    public final AccessibilityManager.TouchExplorationStateChangeListener f11354k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11355l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11356m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11357n;

    /* renamed from: o, reason: collision with root package name */
    public long f11358o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f11359p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f11360q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f11361r;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            q.this.r();
            q.this.f11361r.start();
        }
    }

    public q(s sVar) {
        super(sVar);
        this.f11352i = new View.OnClickListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11344a.J();
            }
        };
        this.f11353j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.n
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                q.y(this.f11345a, view, z10);
            }
        };
        this.f11354k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.o
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                q.w(this.f11346a, z10);
            }
        };
        this.f11358o = Long.MAX_VALUE;
        Context context = sVar.getContext();
        int i10 = j4.b.motionDurationShort3;
        this.f11349f = b5.k.f(context, i10, 67);
        this.f11348e = b5.k.f(sVar.getContext(), i10, 50);
        this.f11350g = b5.k.g(sVar.getContext(), j4.b.motionEasingLinearInterpolator, k4.a.f21834a);
    }

    public static /* synthetic */ void A(q qVar) {
        qVar.K();
        qVar.H(false);
    }

    public static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private void F() {
        this.f11361r = E(this.f11349f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f11348e, 1.0f, 0.0f);
        this.f11360q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    public static /* synthetic */ void v(q qVar) {
        boolean zIsPopupShowing = qVar.f11351h.isPopupShowing();
        qVar.H(zIsPopupShowing);
        qVar.f11356m = zIsPopupShowing;
    }

    public static /* synthetic */ void w(q qVar, boolean z10) {
        AutoCompleteTextView autoCompleteTextView = qVar.f11351h;
        if (autoCompleteTextView == null || r.a(autoCompleteTextView)) {
            return;
        }
        qVar.f11396d.setImportantForAccessibility(z10 ? 2 : 1);
    }

    public static /* synthetic */ void x(q qVar, ValueAnimator valueAnimator) {
        qVar.getClass();
        qVar.f11396d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(q qVar, View view, boolean z10) {
        qVar.f11355l = z10;
        qVar.r();
        if (z10) {
            return;
        }
        qVar.H(false);
        qVar.f11356m = false;
    }

    public static /* synthetic */ boolean z(q qVar, View view, MotionEvent motionEvent) {
        qVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (qVar.G()) {
                qVar.f11356m = false;
            }
            qVar.J();
            qVar.K();
        }
        return false;
    }

    public final ValueAnimator E(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f11350g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                q.x(this.f11340a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final boolean G() {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f11358o;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    public final void H(boolean z10) {
        if (this.f11357n != z10) {
            this.f11357n = z10;
            this.f11361r.cancel();
            this.f11360q.start();
        }
    }

    public final void I() {
        this.f11351h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return q.z(this.f11341a, view, motionEvent);
            }
        });
        this.f11351h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.l
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                q.A(this.f11343a);
            }
        });
        this.f11351h.setThreshold(0);
    }

    public final void J() {
        if (this.f11351h == null) {
            return;
        }
        if (G()) {
            this.f11356m = false;
        }
        if (this.f11356m) {
            this.f11356m = false;
            return;
        }
        H(!this.f11357n);
        if (!this.f11357n) {
            this.f11351h.dismissDropDown();
        } else {
            this.f11351h.requestFocus();
            this.f11351h.showDropDown();
        }
    }

    public final void K() {
        this.f11356m = true;
        this.f11358o = SystemClock.uptimeMillis();
    }

    @Override // com.google.android.material.textfield.t
    public void a(Editable editable) {
        if (this.f11359p.isTouchExplorationEnabled() && r.a(this.f11351h) && !this.f11396d.hasFocus()) {
            this.f11351h.dismissDropDown();
        }
        this.f11351h.post(new Runnable() { // from class: com.google.android.material.textfield.p
            @Override // java.lang.Runnable
            public final void run() {
                q.v(this.f11347a);
            }
        });
    }

    @Override // com.google.android.material.textfield.t
    public int c() {
        return j4.j.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.t
    public int d() {
        return j4.e.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.t
    public View.OnFocusChangeListener e() {
        return this.f11353j;
    }

    @Override // com.google.android.material.textfield.t
    public View.OnClickListener f() {
        return this.f11352i;
    }

    @Override // com.google.android.material.textfield.t
    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f11354k;
    }

    @Override // com.google.android.material.textfield.t
    public boolean i(int i10) {
        return i10 != 0;
    }

    @Override // com.google.android.material.textfield.t
    public boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    public boolean k() {
        return this.f11355l;
    }

    @Override // com.google.android.material.textfield.t
    public boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    public boolean m() {
        return this.f11357n;
    }

    @Override // com.google.android.material.textfield.t
    public void n(EditText editText) {
        this.f11351h = D(editText);
        I();
        this.f11393a.setErrorIconDrawable((Drawable) null);
        if (!r.a(editText) && this.f11359p.isTouchExplorationEnabled()) {
            this.f11396d.setImportantForAccessibility(2);
        }
        this.f11393a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.t
    public void o(View view, s0.x xVar) {
        if (!r.a(this.f11351h)) {
            xVar.m0(Spinner.class.getName());
        }
        if (xVar.W()) {
            xVar.y0(null);
        }
    }

    @Override // com.google.android.material.textfield.t
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f11359p.isEnabled() || r.a(this.f11351h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f11357n && !this.f11351h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            J();
            K();
        }
    }

    @Override // com.google.android.material.textfield.t
    public void s() {
        F();
        this.f11359p = (AccessibilityManager) this.f11395c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.t
    public boolean t() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.f11351h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f11351h.setOnDismissListener(null);
        }
    }
}
