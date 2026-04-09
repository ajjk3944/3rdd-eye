package M3;

import A3.C0133b;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.apm.insight.R;
import com.google.android.material.textfield.TextInputLayout;
import e3.AbstractC2303a;

/* loaded from: classes.dex */
public final class k extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f2853e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2854f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f2855g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f2856h;
    public final B4.g i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0170a f2857j;

    /* renamed from: k, reason: collision with root package name */
    public final j f2858k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2859l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2860m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2861n;

    /* renamed from: o, reason: collision with root package name */
    public long f2862o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f2863p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f2864q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f2865r;

    /* JADX WARN: Type inference failed for: r0v2, types: [M3.j] */
    public k(p pVar) {
        super(pVar);
        this.i = new B4.g(7, this);
        this.f2857j = new ViewOnFocusChangeListenerC0170a(this, 1);
        this.f2858k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: M3.j
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z6) {
                k kVar = this.f2852a;
                AutoCompleteTextView autoCompleteTextView = kVar.f2856h;
                if (autoCompleteTextView == null || com.bumptech.glide.c.C(autoCompleteTextView)) {
                    return;
                }
                kVar.f2898d.setImportantForAccessibility(z6 ? 2 : 1);
            }
        };
        this.f2862o = Long.MAX_VALUE;
        this.f2854f = com.bumptech.glide.d.O(pVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f2853e = com.bumptech.glide.d.O(pVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f2855g = com.bumptech.glide.d.P(pVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC2303a.f19927a);
    }

    @Override // M3.q
    public final void a() {
        if (this.f2863p.isTouchExplorationEnabled() && com.bumptech.glide.c.C(this.f2856h) && !this.f2898d.hasFocus()) {
            this.f2856h.dismissDropDown();
        }
        this.f2856h.post(new A3.z(6, this));
    }

    @Override // M3.q
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // M3.q
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // M3.q
    public final View.OnFocusChangeListener e() {
        return this.f2857j;
    }

    @Override // M3.q
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // M3.q
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f2858k;
    }

    @Override // M3.q
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // M3.q
    public final boolean j() {
        return this.f2859l;
    }

    @Override // M3.q
    public final boolean l() {
        return this.f2861n;
    }

    @Override // M3.q
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f2856h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new h(0, this));
        this.f2856h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: M3.i
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = this.f2851a;
                kVar.f2860m = true;
                kVar.f2862o = SystemClock.uptimeMillis();
                kVar.t(false);
            }
        });
        this.f2856h.setThreshold(0);
        TextInputLayout textInputLayout = this.f2895a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!com.bumptech.glide.c.C(editText) && this.f2863p.isTouchExplorationEnabled()) {
            this.f2898d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // M3.q
    public final void n(S.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f3446a;
        if (!com.bumptech.glide.c.C(this.f2856h)) {
            dVar.i(Spinner.class.getName());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 ? accessibilityNodeInfo.isShowingHintText() : dVar.e(4)) {
            if (i >= 26) {
                accessibilityNodeInfo.setHintText(null);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", null);
            }
        }
    }

    @Override // M3.q
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f2863p.isEnabled() || com.bumptech.glide.c.C(this.f2856h)) {
            return;
        }
        boolean z6 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f2861n && !this.f2856h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z6) {
            u();
            this.f2860m = true;
            this.f2862o = SystemClock.uptimeMillis();
        }
    }

    @Override // M3.q
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2855g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f2854f);
        int i = 4;
        valueAnimatorOfFloat.addUpdateListener(new C0133b(i, this));
        this.f2865r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f2853e);
        valueAnimatorOfFloat2.addUpdateListener(new C0133b(i, this));
        this.f2864q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new B3.x(5, this));
        this.f2863p = (AccessibilityManager) this.f2897c.getSystemService("accessibility");
    }

    @Override // M3.q
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f2856h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f2856h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z6) {
        if (this.f2861n != z6) {
            this.f2861n = z6;
            this.f2865r.cancel();
            this.f2864q.start();
        }
    }

    public final void u() {
        if (this.f2856h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f2862o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.f2860m = false;
        }
        if (this.f2860m) {
            this.f2860m = false;
            return;
        }
        t(!this.f2861n);
        if (!this.f2861n) {
            this.f2856h.dismissDropDown();
        } else {
            this.f2856h.requestFocus();
            this.f2856h.showDropDown();
        }
    }
}
