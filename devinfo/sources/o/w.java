package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30300a;

    /* renamed from: b, reason: collision with root package name */
    public final m f30301b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30302c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30303d;

    /* renamed from: e, reason: collision with root package name */
    public View f30304e;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public x f30306h;

    /* renamed from: i, reason: collision with root package name */
    public u f30307i;
    public PopupWindow.OnDismissListener j;

    /* renamed from: f, reason: collision with root package name */
    public int f30305f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final v f30308k = new v(0, this);

    public w(Context context, m mVar, View view, boolean z3, int i4, int i10) {
        this.f30300a = context;
        this.f30301b = mVar;
        this.f30304e = view;
        this.f30302c = z3;
        this.f30303d = i4;
    }

    public final u a() {
        u d0Var;
        if (this.f30307i == null) {
            Context context = this.f30300a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                d0Var = new g(context, this.f30304e, this.f30303d, this.f30302c);
            } else {
                d0Var = new d0(this.f30300a, this.f30301b, this.f30304e, this.f30303d, this.f30302c);
            }
            d0Var.k(this.f30301b);
            d0Var.q(this.f30308k);
            d0Var.m(this.f30304e);
            d0Var.i(this.f30306h);
            d0Var.n(this.g);
            d0Var.o(this.f30305f);
            this.f30307i = d0Var;
        }
        return this.f30307i;
    }

    public final boolean b() {
        u uVar = this.f30307i;
        return uVar != null && uVar.a();
    }

    public void c() {
        this.f30307i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i4, int i10, boolean z3, boolean z10) {
        u uVarA = a();
        uVarA.r(z10);
        if (z3) {
            if ((Gravity.getAbsoluteGravity(this.f30305f, this.f30304e.getLayoutDirection()) & 7) == 5) {
                i4 -= this.f30304e.getWidth();
            }
            uVarA.p(i4);
            uVarA.s(i10);
            int i11 = (int) ((this.f30300a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            uVarA.f30297a = new Rect(i4 - i11, i10 - i11, i4 + i11, i10 + i11);
        }
        uVarA.show();
    }
}
