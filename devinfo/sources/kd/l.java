package kd;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f28161e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28162f;
    public final TimeInterpolator g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f28163h;

    /* renamed from: i, reason: collision with root package name */
    public final com.applovin.mediation.nativeAds.a f28164i;
    public final a j;

    /* renamed from: k, reason: collision with root package name */
    public final k f28165k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f28166l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f28167m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f28168n;

    /* renamed from: o, reason: collision with root package name */
    public long f28169o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f28170p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f28171q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f28172r;

    /* JADX WARN: Type inference failed for: r0v2, types: [kd.k] */
    public l(o oVar) {
        super(oVar);
        this.f28164i = new com.applovin.mediation.nativeAds.a(15, this);
        this.j = new a(this, 1);
        this.f28165k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: kd.k
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z3) {
                l lVar = this.f28160a;
                AutoCompleteTextView autoCompleteTextView = lVar.f28163h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                lVar.f28198d.setImportantForAccessibility(z3 ? 2 : 1);
            }
        };
        this.f28169o = Long.MAX_VALUE;
        this.f28162f = nh.a.v(oVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f28161e = nh.a.v(oVar.getContext(), R.attr.motionDurationShort3, 50);
        this.g = nh.a.w(oVar.getContext(), R.attr.motionEasingLinearInterpolator, jc.a.f27482a);
    }

    @Override // kd.p
    public final void a() {
        if (this.f28170p.isTouchExplorationEnabled() && this.f28163h.getInputType() != 0 && !this.f28198d.hasFocus()) {
            this.f28163h.dismissDropDown();
        }
        this.f28163h.post(new ig.l(7, this));
    }

    @Override // kd.p
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // kd.p
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // kd.p
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // kd.p
    public final View.OnClickListener f() {
        return this.f28164i;
    }

    @Override // kd.p
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f28165k;
    }

    @Override // kd.p
    public final boolean i(int i4) {
        return i4 != 0;
    }

    @Override // kd.p
    public final boolean k() {
        return this.f28168n;
    }

    @Override // kd.p
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f28163h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: kd.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    l lVar = this.f28158a;
                    long j = jUptimeMillis - lVar.f28169o;
                    if (j < 0 || j > 300) {
                        lVar.f28167m = false;
                    }
                    lVar.t();
                    lVar.f28167m = true;
                    lVar.f28169o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.f28163h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: kd.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = this.f28159a;
                lVar.f28167m = true;
                lVar.f28169o = SystemClock.uptimeMillis();
                lVar.s(false);
            }
        });
        this.f28163h.setThreshold(0);
        TextInputLayout textInputLayout = this.f28195a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f28170p.isTouchExplorationEnabled()) {
            this.f28198d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // kd.p
    public final void m(f4.f fVar) {
        if (this.f28163h.getInputType() == 0) {
            fVar.k(Spinner.class.getName());
        }
        if (fVar.h()) {
            fVar.p(null);
        }
    }

    @Override // kd.p
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.f28170p.isEnabled() && this.f28163h.getInputType() == 0) {
            boolean z3 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f28168n && !this.f28163h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z3) {
                t();
                this.f28167m = true;
                this.f28169o = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // kd.p
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f28162f);
        int i4 = 4;
        valueAnimatorOfFloat.addUpdateListener(new eh.a(i4, this));
        this.f28172r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f28161e);
        valueAnimatorOfFloat2.addUpdateListener(new eh.a(i4, this));
        this.f28171q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new ad.g(6, this));
        this.f28170p = (AccessibilityManager) this.f28197c.getSystemService("accessibility");
    }

    @Override // kd.p
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f28163h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f28163h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z3) {
        if (this.f28168n != z3) {
            this.f28168n = z3;
            this.f28172r.cancel();
            this.f28171q.start();
        }
    }

    public final void t() {
        if (this.f28163h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f28169o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.f28167m = false;
        }
        if (this.f28167m) {
            this.f28167m = false;
            return;
        }
        s(!this.f28168n);
        if (!this.f28168n) {
            this.f28163h.dismissDropDown();
        } else {
            this.f28163h.requestFocus();
            this.f28163h.showDropDown();
        }
    }
}
