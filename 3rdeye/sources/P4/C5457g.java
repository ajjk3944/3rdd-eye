package p4;

import C.g0;
import K6.ViewOnTouchListenerC0710b;
import L0.I;
import L0.S;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.textfield.TextInputLayout;
import f4.C4334b;
import java.util.WeakHashMap;
import k3.C5215a;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* renamed from: p4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5457g extends AbstractC5458h {

    /* renamed from: e, reason: collision with root package name */
    public final int f45135e;

    /* renamed from: f, reason: collision with root package name */
    public final int f45136f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f45137g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f45138h;
    public final F8.c i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC5456f f45139j;

    /* renamed from: k, reason: collision with root package name */
    public final D7.c f45140k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f45141l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f45142m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f45143n;

    /* renamed from: o, reason: collision with root package name */
    public long f45144o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f45145p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f45146q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f45147r;

    /* JADX WARN: Type inference failed for: r0v1, types: [p4.f] */
    public C5457g(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.i = new F8.c(this, 9);
        this.f45139j = new View.OnFocusChangeListener() { // from class: p4.f
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5457g c5457g = this.f45134a;
                c5457g.f45141l = z10;
                c5457g.q();
                if (z10) {
                    return;
                }
                c5457g.t(false);
                c5457g.f45142m = false;
            }
        };
        this.f45140k = new D7.c(this, 18);
        this.f45144o = Long.MAX_VALUE;
        this.f45136f = C4334b.c(aVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f45135e = C4334b.c(aVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f45137g = C4334b.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, L3.a.f4034a);
    }

    @Override // p4.AbstractC5458h
    public final void a() {
        if (this.f45145p.isTouchExplorationEnabled() && B7.d.r(this.f45138h) && !this.f45151d.hasFocus()) {
            this.f45138h.dismissDropDown();
        }
        this.f45138h.post(new g0(this, 24));
    }

    @Override // p4.AbstractC5458h
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p4.AbstractC5458h
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p4.AbstractC5458h
    public final View.OnFocusChangeListener e() {
        return this.f45139j;
    }

    @Override // p4.AbstractC5458h
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // p4.AbstractC5458h
    public final D7.c h() {
        return this.f45140k;
    }

    @Override // p4.AbstractC5458h
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // p4.AbstractC5458h
    public final boolean j() {
        return this.f45141l;
    }

    @Override // p4.AbstractC5458h
    public final boolean l() {
        return this.f45143n;
    }

    @Override // p4.AbstractC5458h
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f45138h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new ViewOnTouchListenerC0710b(this, 2));
        this.f45138h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: p4.e
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C5457g c5457g = this.f45133a;
                c5457g.f45142m = true;
                c5457g.f45144o = System.currentTimeMillis();
                c5457g.t(false);
            }
        });
        this.f45138h.setThreshold(0);
        TextInputLayout textInputLayout = this.f45148a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!B7.d.r(editText) && this.f45145p.isTouchExplorationEnabled()) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            this.f45151d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p4.AbstractC5458h
    public final void n(M0.g gVar) {
        if (!B7.d.r(this.f45138h)) {
            gVar.j(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? gVar.f4122a.isShowingHintText() : gVar.e(4)) {
            gVar.l(null);
        }
    }

    @Override // p4.AbstractC5458h
    @SuppressLint({"WrongConstant"})
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f45145p.isEnabled() || B7.d.r(this.f45138h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f45143n && !this.f45138h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            u();
            this.f45142m = true;
            this.f45144o = System.currentTimeMillis();
        }
    }

    @Override // p4.AbstractC5458h
    public final void r() {
        int i = 1;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f45137g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f45136f);
        valueAnimatorOfFloat.addUpdateListener(new C5215a(this, i));
        this.f45147r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f45135e);
        valueAnimatorOfFloat2.addUpdateListener(new C5215a(this, i));
        this.f45146q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new L1.e(this, 3));
        this.f45145p = (AccessibilityManager) this.f45150c.getSystemService("accessibility");
    }

    @Override // p4.AbstractC5458h
    @SuppressLint({"ClickableViewAccessibility"})
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f45138h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f45138h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z10) {
        if (this.f45143n != z10) {
            this.f45143n = z10;
            this.f45147r.cancel();
            this.f45146q.start();
        }
    }

    public final void u() {
        if (this.f45138h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f45144o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f45142m = false;
        }
        if (this.f45142m) {
            this.f45142m = false;
            return;
        }
        t(!this.f45143n);
        if (!this.f45143n) {
            this.f45138h.dismissDropDown();
        } else {
            this.f45138h.requestFocus();
            this.f45138h.showDropDown();
        }
    }
}
