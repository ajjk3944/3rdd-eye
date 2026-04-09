package androidx.appcompat.view.menu;

import a0.s;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f651a;

    /* renamed from: b, reason: collision with root package name */
    private final e f652b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f653c;

    /* renamed from: d, reason: collision with root package name */
    private final int f654d;

    /* renamed from: e, reason: collision with root package name */
    private final int f655e;

    /* renamed from: f, reason: collision with root package name */
    private View f656f;

    /* renamed from: g, reason: collision with root package name */
    private int f657g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f658h;

    /* renamed from: i, reason: collision with root package name */
    private j.a f659i;

    /* renamed from: j, reason: collision with root package name */
    private h f660j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f661k;

    /* renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f662l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z2, int i2) {
        this(context, eVar, view, z2, i2, 0);
    }

    public i(Context context, e eVar, View view, boolean z2, int i2, int i3) {
        this.f657g = 8388611;
        this.f662l = new a();
        this.f651a = context;
        this.f652b = eVar;
        this.f656f = view;
        this.f653c = z2;
        this.f654d = i2;
        this.f655e = i3;
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f651a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        h bVar = Math.min(point.x, point.y) >= this.f651a.getResources().getDimensionPixelSize(a.d.f36c) ? new b(this.f651a, this.f656f, this.f654d, this.f655e, this.f653c) : new l(this.f651a, this.f652b, this.f656f, this.f654d, this.f655e, this.f653c);
        bVar.l(this.f652b);
        bVar.u(this.f662l);
        bVar.p(this.f656f);
        bVar.d(this.f659i);
        bVar.r(this.f658h);
        bVar.s(this.f657g);
        return bVar;
    }

    private void l(int i2, int i3, boolean z2, boolean z3) {
        h hVarC = c();
        hVarC.v(z3);
        if (z2) {
            if ((a0.d.b(this.f657g, s.t(this.f656f)) & 7) == 5) {
                i2 -= this.f656f.getWidth();
            }
            hVarC.t(i2);
            hVarC.w(i3);
            int i4 = (int) ((this.f651a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            hVarC.q(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        hVarC.i();
    }

    public void b() {
        if (d()) {
            this.f660j.dismiss();
        }
    }

    public h c() {
        if (this.f660j == null) {
            this.f660j = a();
        }
        return this.f660j;
    }

    public boolean d() {
        h hVar = this.f660j;
        return hVar != null && hVar.a();
    }

    protected void e() {
        this.f660j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f661k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f656f = view;
    }

    public void g(boolean z2) {
        this.f658h = z2;
        h hVar = this.f660j;
        if (hVar != null) {
            hVar.r(z2);
        }
    }

    public void h(int i2) {
        this.f657g = i2;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f661k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f659i = aVar;
        h hVar = this.f660j;
        if (hVar != null) {
            hVar.d(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f656f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i2, int i3) {
        if (d()) {
            return true;
        }
        if (this.f656f == null) {
            return false;
        }
        l(i2, i3, true, true);
        return true;
    }
}
