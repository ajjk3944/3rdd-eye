package o;

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
import b5.a1;
import com.liuzh.deviceinfo.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import p.d2;
import p.g2;
import p.p1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f30200b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30201c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30202d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30203e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f30204f;

    /* renamed from: n, reason: collision with root package name */
    public View f30210n;

    /* renamed from: o, reason: collision with root package name */
    public View f30211o;

    /* renamed from: p, reason: collision with root package name */
    public int f30212p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f30213q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f30214r;

    /* renamed from: s, reason: collision with root package name */
    public int f30215s;

    /* renamed from: t, reason: collision with root package name */
    public int f30216t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f30218v;

    /* renamed from: w, reason: collision with root package name */
    public x f30219w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f30220x;

    /* renamed from: y, reason: collision with root package name */
    public PopupWindow.OnDismissListener f30221y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f30222z;
    public final ArrayList g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f30205h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final d f30206i = new d(0, this);
    public final a1 j = new a1(6, this);

    /* renamed from: k, reason: collision with root package name */
    public final e f30207k = new e(0, this);

    /* renamed from: l, reason: collision with root package name */
    public int f30208l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f30209m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f30217u = false;

    public g(Context context, View view, int i4, boolean z3) {
        this.f30200b = context;
        this.f30210n = view;
        this.f30202d = i4;
        this.f30203e = z3;
        this.f30212p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f30201c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f30204f = new Handler();
    }

    @Override // o.c0
    public final boolean a() {
        ArrayList arrayList = this.f30205h;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f30197a.f30654z.isShowing();
    }

    @Override // o.y
    public final boolean c() {
        return false;
    }

    @Override // o.y
    public final boolean d(e0 e0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = this.f30205h;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            f fVar = (f) obj;
            if (e0Var == fVar.f30198b) {
                fVar.f30197a.f30633c.requestFocus();
                return true;
            }
        }
        if (!e0Var.hasVisibleItems()) {
            return false;
        }
        k(e0Var);
        x xVar = this.f30219w;
        if (xVar != null) {
            xVar.v(e0Var);
        }
        return true;
    }

    @Override // o.c0
    public final void dismiss() {
        ArrayList arrayList = this.f30205h;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                f fVar = fVarArr[i4];
                if (fVar.f30197a.f30654z.isShowing()) {
                    fVar.f30197a.dismiss();
                }
            }
        }
    }

    @Override // o.y
    public final void e(m mVar, boolean z3) {
        ArrayList arrayList = this.f30205h;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (mVar == ((f) arrayList.get(i4)).f30198b) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 < 0) {
            return;
        }
        int i10 = i4 + 1;
        if (i10 < arrayList.size()) {
            ((f) arrayList.get(i10)).f30198b.c(false);
        }
        f fVar = (f) arrayList.remove(i4);
        m mVar2 = fVar.f30198b;
        g2 g2Var = fVar.f30197a;
        p.y yVar = g2Var.f30654z;
        mVar2.r(this);
        if (this.f30222z) {
            d2.b(yVar, null);
            yVar.setAnimationStyle(0);
        }
        g2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f30212p = ((f) arrayList.get(size2 - 1)).f30199c;
        } else {
            this.f30212p = this.f30210n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z3) {
                ((f) arrayList.get(0)).f30198b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.f30219w;
        if (xVar != null) {
            xVar.e(mVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f30220x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f30220x.removeGlobalOnLayoutListener(this.f30206i);
            }
            this.f30220x = null;
        }
        this.f30211o.removeOnAttachStateChangeListener(this.j);
        this.f30221y.onDismiss();
    }

    @Override // o.y
    public final void f() {
        ArrayList arrayList = this.f30205h;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ListAdapter adapter = ((f) obj).f30197a.f30633c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }

    @Override // o.c0
    public final p1 h() {
        ArrayList arrayList = this.f30205h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) je.u.p(1, arrayList)).f30197a.f30633c;
    }

    @Override // o.y
    public final void i(x xVar) {
        this.f30219w = xVar;
    }

    @Override // o.u
    public final void k(m mVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        mVar.b(this, this.f30200b);
        if (a()) {
            t(mVar);
        } else {
            this.g.add(mVar);
        }
    }

    @Override // o.u
    public final void m(View view) {
        if (this.f30210n != view) {
            this.f30210n = view;
            this.f30209m = Gravity.getAbsoluteGravity(this.f30208l, view.getLayoutDirection());
        }
    }

    @Override // o.u
    public final void n(boolean z3) {
        this.f30217u = z3;
    }

    @Override // o.u
    public final void o(int i4) {
        if (this.f30208l != i4) {
            this.f30208l = i4;
            this.f30209m = Gravity.getAbsoluteGravity(i4, this.f30210n.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.f30205h;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i4);
            if (!fVar.f30197a.f30654z.isShowing()) {
                break;
            } else {
                i4++;
            }
        }
        if (fVar != null) {
            fVar.f30198b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // o.u
    public final void p(int i4) {
        this.f30213q = true;
        this.f30215s = i4;
    }

    @Override // o.u
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f30221y = onDismissListener;
    }

    @Override // o.u
    public final void r(boolean z3) {
        this.f30218v = z3;
    }

    @Override // o.u
    public final void s(int i4) {
        this.f30214r = true;
        this.f30216t = i4;
    }

    @Override // o.c0
    public final void show() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            t((m) obj);
        }
        arrayList.clear();
        View view = this.f30210n;
        this.f30211o = view;
        if (view != null) {
            boolean z3 = this.f30220x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f30220x = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f30206i);
            }
            this.f30211o.addOnAttachStateChangeListener(this.j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c8  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(o.m r20) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.t(o.m):void");
    }
}
