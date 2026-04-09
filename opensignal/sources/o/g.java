package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import i.g0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import p.i1;
import p.v1;
import p.y1;

/* loaded from: classes.dex */
public final class g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int W = h.g.abc_cascading_menu_item_layout;
    public View J;
    public View K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public boolean R;
    public x S;
    public ViewTreeObserver T;
    public PopupWindow.OnDismissListener U;
    public boolean V;

    /* renamed from: d, reason: collision with root package name */
    public final Context f18593d;

    /* renamed from: g, reason: collision with root package name */
    public final int f18594g;

    /* renamed from: r, reason: collision with root package name */
    public final int f18595r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f18596x;

    /* renamed from: y, reason: collision with root package name */
    public final Handler f18597y;
    public final ArrayList B = new ArrayList();
    public final ArrayList D = new ArrayList();
    public final d E = new d(0, this);
    public final g1.e F = new g1.e(5, this);
    public final g0 G = new g0(this);
    public int H = 0;
    public int I = 0;
    public boolean Q = false;

    public g(Context context, View view, int i10, boolean z10) {
        this.f18593d = context;
        this.J = view;
        this.f18595r = i10;
        this.f18596x = z10;
        this.L = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f18594g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(h.d.abc_config_prefDialogWidth));
        this.f18597y = new Handler();
    }

    @Override // o.c0
    public final boolean a() {
        ArrayList arrayList = this.D;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f18590a.V.isShowing();
    }

    @Override // o.y
    public final void b(boolean z10) {
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((f) it.next()).f18590a.f20173g.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }

    @Override // o.y
    public final void c(m mVar, boolean z10) {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (mVar == ((f) arrayList.get(i10)).f18591b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((f) arrayList.get(i11)).f18591b.c(false);
        }
        f fVar = (f) arrayList.remove(i10);
        m mVar2 = fVar.f18591b;
        y1 y1Var = fVar.f18590a;
        p.v vVar = y1Var.V;
        mVar2.r(this);
        if (this.V) {
            v1.b(vVar, null);
            vVar.setAnimationStyle(0);
        }
        y1Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.L = ((f) arrayList.get(size2 - 1)).f18592c;
        } else {
            this.L = this.J.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((f) arrayList.get(0)).f18591b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.S;
        if (xVar != null) {
            xVar.c(mVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.T;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.T.removeGlobalOnLayoutListener(this.E);
            }
            this.T = null;
        }
        this.K.removeOnAttachStateChangeListener(this.F);
        this.U.onDismiss();
    }

    @Override // o.c0
    public final void dismiss() {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                f fVar = fVarArr[i10];
                if (fVar.f18590a.V.isShowing()) {
                    fVar.f18590a.dismiss();
                }
            }
        }
    }

    @Override // o.y
    public final boolean e() {
        return false;
    }

    @Override // o.y
    public final boolean f(e0 e0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (e0Var == fVar.f18591b) {
                fVar.f18590a.f20173g.requestFocus();
                return true;
            }
        }
        if (!e0Var.hasVisibleItems()) {
            return false;
        }
        n(e0Var);
        x xVar = this.S;
        if (xVar != null) {
            xVar.Q(e0Var);
        }
        return true;
    }

    @Override // o.c0
    public final void g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.B;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w((m) it.next());
        }
        arrayList.clear();
        View view = this.J;
        this.K = view;
        if (view != null) {
            boolean z10 = this.T == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.T = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.E);
            }
            this.K.addOnAttachStateChangeListener(this.F);
        }
    }

    @Override // o.c0
    public final i1 j() {
        ArrayList arrayList = this.D;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) h0.b.f(1, arrayList)).f18590a.f20173g;
    }

    @Override // o.y
    public final void k(x xVar) {
        this.S = xVar;
    }

    @Override // o.y
    public final Parcelable l() {
        return null;
    }

    @Override // o.u
    public final void n(m mVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        mVar.b(this, this.f18593d);
        if (a()) {
            w(mVar);
        } else {
            this.B.add(mVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i10);
            if (!fVar.f18590a.V.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (fVar != null) {
            fVar.f18591b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // o.u
    public final void p(View view) {
        if (this.J != view) {
            this.J = view;
            this.I = Gravity.getAbsoluteGravity(this.H, view.getLayoutDirection());
        }
    }

    @Override // o.u
    public final void q(boolean z10) {
        this.Q = z10;
    }

    @Override // o.u
    public final void r(int i10) {
        if (this.H != i10) {
            this.H = i10;
            this.I = Gravity.getAbsoluteGravity(i10, this.J.getLayoutDirection());
        }
    }

    @Override // o.u
    public final void s(int i10) {
        this.M = true;
        this.O = i10;
    }

    @Override // o.u
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.U = onDismissListener;
    }

    @Override // o.u
    public final void u(boolean z10) {
        this.R = z10;
    }

    @Override // o.u
    public final void v(int i10) {
        this.N = true;
        this.P = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(o.m r18) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.w(o.m):void");
    }

    @Override // o.y
    public final void h(Parcelable parcelable) {
    }
}
