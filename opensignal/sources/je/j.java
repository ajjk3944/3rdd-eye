package je;

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
import com.google.android.material.textfield.TextInputLayout;
import ir.f0;

/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: e, reason: collision with root package name */
    public final int f13628e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13629f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f13630g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f13631h;

    /* renamed from: i, reason: collision with root package name */
    public final am.b f13632i;
    public final bq.h j;
    public final i k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13633l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13634m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13635n;

    /* renamed from: o, reason: collision with root package name */
    public long f13636o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f13637p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f13638q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f13639r;

    public j(m mVar) {
        super(mVar);
        this.f13632i = new am.b(12, this);
        this.j = new bq.h(3, this);
        this.k = new i(0, this);
        this.f13636o = Long.MAX_VALUE;
        this.f13629f = f0.U(mVar.getContext(), ed.b.motionDurationShort3, 67);
        this.f13628e = f0.U(mVar.getContext(), ed.b.motionDurationShort3, 50);
        this.f13630g = f0.V(mVar.getContext(), ed.b.motionEasingLinearInterpolator, fd.a.f8822a);
    }

    @Override // je.n
    public final void a() {
        if (this.f13637p.isTouchExplorationEnabled() && this.f13631h.getInputType() != 0 && !this.f13651d.hasFocus()) {
            this.f13631h.dismissDropDown();
        }
        this.f13631h.post(new j4.o(3, this));
    }

    @Override // je.n
    public final int c() {
        return ed.j.exposed_dropdown_menu_content_description;
    }

    @Override // je.n
    public final int d() {
        return ed.e.mtrl_dropdown_arrow;
    }

    @Override // je.n
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // je.n
    public final View.OnClickListener f() {
        return this.f13632i;
    }

    @Override // je.n
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // je.n
    public final boolean i(int i10) {
        return i10 != 0;
    }

    @Override // je.n
    public final boolean k() {
        return this.f13635n;
    }

    @Override // je.n
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f13631h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new g(0, this));
        this.f13631h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: je.h
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                j jVar = this.f13625a;
                jVar.f13634m = true;
                jVar.f13636o = SystemClock.uptimeMillis();
                jVar.s(false);
            }
        });
        this.f13631h.setThreshold(0);
        TextInputLayout textInputLayout = this.f13648a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f13637p.isTouchExplorationEnabled()) {
            this.f13651d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // je.n
    public final void m(v3.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f23838a;
        if (this.f13631h.getInputType() == 0) {
            cVar.i(Spinner.class.getName());
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 ? accessibilityNodeInfo.isShowingHintText() : cVar.e(4)) {
            if (i10 >= 26) {
                accessibilityNodeInfo.setHintText(null);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", null);
            }
        }
    }

    @Override // je.n
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.f13637p.isEnabled() && this.f13631h.getInputType() == 0) {
            boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f13635n && !this.f13631h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z10) {
                t();
                this.f13634m = true;
                this.f13636o = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // je.n
    public final void q() {
        int i10 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f13630g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f13629f);
        valueAnimatorOfFloat.addUpdateListener(new bq.b(i10, this));
        this.f13639r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f13628e);
        valueAnimatorOfFloat2.addUpdateListener(new bq.b(i10, this));
        this.f13638q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new id.b(2, this));
        this.f13637p = (AccessibilityManager) this.f13650c.getSystemService("accessibility");
    }

    @Override // je.n
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f13631h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f13631h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z10) {
        if (this.f13635n != z10) {
            this.f13635n = z10;
            this.f13639r.cancel();
            this.f13638q.start();
        }
    }

    public final void t() {
        if (this.f13631h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f13636o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.f13634m = false;
        }
        if (this.f13634m) {
            this.f13634m = false;
            return;
        }
        s(!this.f13635n);
        if (!this.f13635n) {
            this.f13631h.dismissDropDown();
        } else {
            this.f13631h.requestFocus();
            this.f13631h.showDropDown();
        }
    }
}
