package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xd extends xd0 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;
    public ee0 B;
    public ViewTreeObserver C;
    public PopupWindow.OnDismissListener D;
    public boolean E;
    public final Context g;
    public final int h;
    public final int i;
    public final boolean j;
    public final Handler k;
    public View s;
    public View t;
    public int u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final y6 n = new y6(2, this);
    public final ud o = new ud(0, this);
    public final ug0 p = new ug0(3, this);
    public int q = 0;
    public int r = 0;
    public boolean z = false;

    public xd(Context context, View view, int i, boolean z) {
        this.g = context;
        this.s = view;
        this.i = i;
        this.j = z;
        this.u = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.k = new Handler();
    }

    @Override // defpackage.uv0
    public final boolean a() {
        ArrayList arrayList = this.m;
        return arrayList.size() > 0 && ((wd) arrayList.get(0)).a.E.isShowing();
    }

    @Override // defpackage.uv0
    public final void c() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((od0) obj);
        }
        arrayList.clear();
        View view = this.s;
        this.t = view;
        if (view != null) {
            boolean z = this.C == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.C = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.n);
            }
            this.t.addOnAttachStateChangeListener(this.o);
        }
    }

    @Override // defpackage.fe0
    public final void d(ee0 ee0Var) {
        this.B = ee0Var;
    }

    @Override // defpackage.uv0
    public final void dismiss() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        if (size > 0) {
            wd[] wdVarArr = (wd[]) arrayList.toArray(new wd[size]);
            for (int i = size - 1; i >= 0; i--) {
                wd wdVar = wdVarArr[i];
                if (wdVar.a.E.isShowing()) {
                    wdVar.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.fe0
    public final void f(od0 od0Var, boolean z) {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (od0Var == ((wd) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((wd) arrayList.get(i2)).b.c(false);
        }
        wd wdVar = (wd) arrayList.remove(i);
        od0 od0Var2 = wdVar.b;
        de0 de0Var = wdVar.a;
        r6 r6Var = de0Var.E;
        od0Var2.r(this);
        if (this.E) {
            ae0.b(r6Var, null);
            r6Var.setAnimationStyle(0);
        }
        de0Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.u = ((wd) arrayList.get(size2 - 1)).c;
        } else {
            this.u = this.s.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((wd) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        ee0 ee0Var = this.B;
        if (ee0Var != null) {
            ee0Var.f(od0Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.C;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.C.removeGlobalOnLayoutListener(this.n);
            }
            this.C = null;
        }
        this.t.removeOnAttachStateChangeListener(this.o);
        this.D.onDismiss();
    }

    @Override // defpackage.fe0
    public final void g() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((wd) obj).a.h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((ld0) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.uv0
    public final kq h() {
        ArrayList arrayList = this.m;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((wd) arrayList.get(arrayList.size() - 1)).a.h;
    }

    @Override // defpackage.fe0
    public final boolean j(uy0 uy0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wd wdVar = (wd) obj;
            if (uy0Var == wdVar.b) {
                wdVar.a.h.requestFocus();
                return true;
            }
        }
        if (!uy0Var.hasVisibleItems()) {
            return false;
        }
        l(uy0Var);
        ee0 ee0Var = this.B;
        if (ee0Var != null) {
            ee0Var.r(uy0Var);
        }
        return true;
    }

    @Override // defpackage.fe0
    public final boolean k() {
        return false;
    }

    @Override // defpackage.xd0
    public final void l(od0 od0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        od0Var.b(this, this.g);
        if (a()) {
            u(od0Var);
        } else {
            this.l.add(od0Var);
        }
    }

    @Override // defpackage.xd0
    public final void n(View view) {
        if (this.s != view) {
            this.s = view;
            this.r = Gravity.getAbsoluteGravity(this.q, view.getLayoutDirection());
        }
    }

    @Override // defpackage.xd0
    public final void o(boolean z) {
        this.z = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        wd wdVar;
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                wdVar = null;
                break;
            }
            wdVar = (wd) arrayList.get(i);
            if (!wdVar.a.E.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (wdVar != null) {
            wdVar.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.xd0
    public final void p(int i) {
        if (this.q != i) {
            this.q = i;
            this.r = Gravity.getAbsoluteGravity(i, this.s.getLayoutDirection());
        }
    }

    @Override // defpackage.xd0
    public final void q(int i) {
        this.v = true;
        this.x = i;
    }

    @Override // defpackage.xd0
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    @Override // defpackage.xd0
    public final void s(boolean z) {
        this.A = z;
    }

    @Override // defpackage.xd0
    public final void t(int i) {
        this.w = true;
        this.y = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(defpackage.od0 r18) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd.u(od0):void");
    }
}
