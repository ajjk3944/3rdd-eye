package androidx.appcompat.view.menu;

import F1.AbstractC2771s;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import h.AbstractC5930d;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26905a;

    /* renamed from: b, reason: collision with root package name */
    private final e f26906b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26907c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26908d;

    /* renamed from: e, reason: collision with root package name */
    private final int f26909e;

    /* renamed from: f, reason: collision with root package name */
    private View f26910f;

    /* renamed from: g, reason: collision with root package name */
    private int f26911g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26912h;

    /* renamed from: i, reason: collision with root package name */
    private j.a f26913i;

    /* renamed from: j, reason: collision with root package name */
    private h f26914j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f26915k;

    /* renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f26916l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f26905a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f26905a.getResources().getDimensionPixelSize(AbstractC5930d.f47973a) ? new b(this.f26905a, this.f26910f, this.f26908d, this.f26909e, this.f26907c) : new l(this.f26905a, this.f26906b, this.f26910f, this.f26908d, this.f26909e, this.f26907c);
        bVar.l(this.f26906b);
        bVar.u(this.f26916l);
        bVar.p(this.f26910f);
        bVar.h(this.f26913i);
        bVar.r(this.f26912h);
        bVar.s(this.f26911g);
        return bVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        h hVarC = c();
        hVarC.v(z11);
        if (z10) {
            if ((AbstractC2771s.b(this.f26911g, this.f26910f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f26910f.getWidth();
            }
            hVarC.t(i10);
            hVarC.w(i11);
            int i12 = (int) ((this.f26905a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            hVarC.q(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        hVarC.b();
    }

    public void b() {
        if (d()) {
            this.f26914j.dismiss();
        }
    }

    public h c() {
        if (this.f26914j == null) {
            this.f26914j = a();
        }
        return this.f26914j;
    }

    public boolean d() {
        h hVar = this.f26914j;
        return hVar != null && hVar.a();
    }

    protected void e() {
        this.f26914j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f26915k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f26910f = view;
    }

    public void g(boolean z10) {
        this.f26912h = z10;
        h hVar = this.f26914j;
        if (hVar != null) {
            hVar.r(z10);
        }
    }

    public void h(int i10) {
        this.f26911g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f26915k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f26913i = aVar;
        h hVar = this.f26914j;
        if (hVar != null) {
            hVar.h(aVar);
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
        if (this.f26910f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f26910f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f26911g = 8388611;
        this.f26916l = new a();
        this.f26905a = context;
        this.f26906b = eVar;
        this.f26910f = view;
        this.f26907c = z10;
        this.f26908d = i10;
        this.f26909e = i11;
    }
}
