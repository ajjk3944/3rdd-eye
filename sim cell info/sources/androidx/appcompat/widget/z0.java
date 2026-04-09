package androidx.appcompat.widget;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
class z0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    private static z0 f1217k;

    /* renamed from: l, reason: collision with root package name */
    private static z0 f1218l;

    /* renamed from: b, reason: collision with root package name */
    private final View f1219b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence f1220c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1221d;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f1222e = new a();

    /* renamed from: f, reason: collision with root package name */
    private final Runnable f1223f = new b();

    /* renamed from: g, reason: collision with root package name */
    private int f1224g;

    /* renamed from: h, reason: collision with root package name */
    private int f1225h;

    /* renamed from: i, reason: collision with root package name */
    private a1 f1226i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1227j;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            z0.this.g(false);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z0.this.c();
        }
    }

    private z0(View view, CharSequence charSequence) {
        this.f1219b = view;
        this.f1220c = charSequence;
        this.f1221d = a0.t.c(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f1219b.removeCallbacks(this.f1222e);
    }

    private void b() {
        this.f1224g = Integer.MAX_VALUE;
        this.f1225h = Integer.MAX_VALUE;
    }

    private void d() {
        this.f1219b.postDelayed(this.f1222e, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(z0 z0Var) {
        z0 z0Var2 = f1217k;
        if (z0Var2 != null) {
            z0Var2.a();
        }
        f1217k = z0Var;
        if (z0Var != null) {
            z0Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        z0 z0Var = f1217k;
        if (z0Var != null && z0Var.f1219b == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new z0(view, charSequence);
            return;
        }
        z0 z0Var2 = f1218l;
        if (z0Var2 != null && z0Var2.f1219b == view) {
            z0Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean h(MotionEvent motionEvent) {
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        if (Math.abs(x2 - this.f1224g) <= this.f1221d && Math.abs(y2 - this.f1225h) <= this.f1221d) {
            return false;
        }
        this.f1224g = x2;
        this.f1225h = y2;
        return true;
    }

    void c() {
        if (f1218l == this) {
            f1218l = null;
            a1 a1Var = this.f1226i;
            if (a1Var != null) {
                a1Var.c();
                this.f1226i = null;
                b();
                this.f1219b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1217k == this) {
            e(null);
        }
        this.f1219b.removeCallbacks(this.f1223f);
    }

    void g(boolean z2) throws Resources.NotFoundException {
        long longPressTimeout;
        if (a0.s.C(this.f1219b)) {
            e(null);
            z0 z0Var = f1218l;
            if (z0Var != null) {
                z0Var.c();
            }
            f1218l = this;
            this.f1227j = z2;
            a1 a1Var = new a1(this.f1219b.getContext());
            this.f1226i = a1Var;
            a1Var.e(this.f1219b, this.f1224g, this.f1225h, this.f1227j, this.f1220c);
            this.f1219b.addOnAttachStateChangeListener(this);
            if (this.f1227j) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((a0.s.x(this.f1219b) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f1219b.removeCallbacks(this.f1223f);
            this.f1219b.postDelayed(this.f1223f, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1226i != null && this.f1227j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1219b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f1219b.isEnabled() && this.f1226i == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f1224g = view.getWidth() / 2;
        this.f1225h = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
