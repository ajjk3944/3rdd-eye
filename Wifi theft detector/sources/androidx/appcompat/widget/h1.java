package androidx.appcompat.widget;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;

/* loaded from: classes.dex */
public class h1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public static h1 f1157k;

    /* renamed from: l, reason: collision with root package name */
    public static h1 f1158l;

    /* renamed from: a, reason: collision with root package name */
    public final View f1159a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f1160b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1161c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f1162d = new Runnable() { // from class: androidx.appcompat.widget.f1
        @Override // java.lang.Runnable
        public final void run() throws Resources.NotFoundException {
            this.f1143a.h(false);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f1163e = new Runnable() { // from class: androidx.appcompat.widget.g1
        @Override // java.lang.Runnable
        public final void run() {
            this.f1150a.d();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public int f1164f;

    /* renamed from: g, reason: collision with root package name */
    public int f1165g;

    /* renamed from: h, reason: collision with root package name */
    public i1 f1166h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1167i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1168j;

    public h1(View view, CharSequence charSequence) {
        this.f1159a = view;
        this.f1160b = charSequence;
        this.f1161c = androidx.core.view.c1.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void f(h1 h1Var) {
        h1 h1Var2 = f1157k;
        if (h1Var2 != null) {
            h1Var2.b();
        }
        f1157k = h1Var;
        if (h1Var != null) {
            h1Var.e();
        }
    }

    public static void g(View view, CharSequence charSequence) {
        h1 h1Var = f1157k;
        if (h1Var != null && h1Var.f1159a == view) {
            f(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new h1(view, charSequence);
            return;
        }
        h1 h1Var2 = f1158l;
        if (h1Var2 != null && h1Var2.f1159a == view) {
            h1Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public final void b() {
        this.f1159a.removeCallbacks(this.f1162d);
    }

    public final void c() {
        this.f1168j = true;
    }

    public void d() {
        if (f1158l == this) {
            f1158l = null;
            i1 i1Var = this.f1166h;
            if (i1Var != null) {
                i1Var.c();
                this.f1166h = null;
                c();
                this.f1159a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1157k == this) {
            f(null);
        }
        this.f1159a.removeCallbacks(this.f1163e);
    }

    public final void e() {
        this.f1159a.postDelayed(this.f1162d, ViewConfiguration.getLongPressTimeout());
    }

    public void h(boolean z10) throws Resources.NotFoundException {
        long longPressTimeout;
        long j10;
        long j11;
        if (this.f1159a.isAttachedToWindow()) {
            f(null);
            h1 h1Var = f1158l;
            if (h1Var != null) {
                h1Var.d();
            }
            f1158l = this;
            this.f1167i = z10;
            i1 i1Var = new i1(this.f1159a.getContext());
            this.f1166h = i1Var;
            i1Var.e(this.f1159a, this.f1164f, this.f1165g, this.f1167i, this.f1160b);
            this.f1159a.addOnAttachStateChangeListener(this);
            if (this.f1167i) {
                j11 = 2500;
            } else {
                if ((ViewCompat.K(this.f1159a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = MBInterstitialActivity.WEB_LOAD_TIME;
                }
                j11 = j10 - longPressTimeout;
            }
            this.f1159a.removeCallbacks(this.f1163e);
            this.f1159a.postDelayed(this.f1163e, j11);
        }
    }

    public final boolean i(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f1168j && Math.abs(x10 - this.f1164f) <= this.f1161c && Math.abs(y10 - this.f1165g) <= this.f1161c) {
            return false;
        }
        this.f1164f = x10;
        this.f1165g = y10;
        this.f1168j = false;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1166h != null && this.f1167i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1159a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f1159a.isEnabled() && this.f1166h == null && i(motionEvent)) {
            f(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f1164f = view.getWidth() / 2;
        this.f1165g = view.getHeight() / 2;
        h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
