package n;

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
import com.apm.insight.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import o.C0;
import o.C2732p0;
import o.F0;

/* renamed from: n.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC2671e extends s implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: C, reason: collision with root package name */
    public View f22029C;

    /* renamed from: D, reason: collision with root package name */
    public int f22030D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f22031E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f22032F;

    /* renamed from: G, reason: collision with root package name */
    public int f22033G;

    /* renamed from: H, reason: collision with root package name */
    public int f22034H;

    /* renamed from: J, reason: collision with root package name */
    public boolean f22036J;

    /* renamed from: K, reason: collision with root package name */
    public v f22037K;

    /* renamed from: L, reason: collision with root package name */
    public ViewTreeObserver f22038L;
    public PopupWindow.OnDismissListener M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f22039N;

    /* renamed from: b, reason: collision with root package name */
    public final Context f22040b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22041c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22042d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22043e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f22044f;

    /* renamed from: n, reason: collision with root package name */
    public View f22051n;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f22045g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f22046h = new ArrayList();
    public final A3.C i = new A3.C(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final M3.n f22047j = new M3.n(4, this);

    /* renamed from: k, reason: collision with root package name */
    public final d4.h f22048k = new d4.h(8, this);

    /* renamed from: l, reason: collision with root package name */
    public int f22049l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f22050m = 0;

    /* renamed from: I, reason: collision with root package name */
    public boolean f22035I = false;

    public ViewOnKeyListenerC2671e(Context context, View view, int i, boolean z6) {
        this.f22040b = context;
        this.f22051n = view;
        this.f22042d = i;
        this.f22043e = z6;
        this.f22030D = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f22041c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f22044f = new Handler();
    }

    @Override // n.InterfaceC2664A
    public final boolean a() {
        ArrayList arrayList = this.f22046h;
        return arrayList.size() > 0 && ((C2670d) arrayList.get(0)).f22026a.f22347N.isShowing();
    }

    @Override // n.w
    public final void b(boolean z6) {
        ArrayList arrayList = this.f22046h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((C2670d) obj).f22026a.f22350c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C2674h) adapter).notifyDataSetChanged();
        }
    }

    @Override // n.w
    public final void c(MenuC2677k menuC2677k, boolean z6) {
        ArrayList arrayList = this.f22046h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC2677k == ((C2670d) arrayList.get(i)).f22027b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i3 = i + 1;
        if (i3 < arrayList.size()) {
            ((C2670d) arrayList.get(i3)).f22027b.c(false);
        }
        C2670d c2670d = (C2670d) arrayList.remove(i);
        MenuC2677k menuC2677k2 = c2670d.f22027b;
        F0 f02 = c2670d.f22026a;
        menuC2677k2.r(this);
        if (this.f22039N) {
            C0.b(f02.f22347N, null);
            f02.f22347N.setAnimationStyle(0);
        }
        f02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f22030D = ((C2670d) arrayList.get(size2 - 1)).f22028c;
        } else {
            this.f22030D = this.f22051n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z6) {
                ((C2670d) arrayList.get(0)).f22027b.c(false);
                return;
            }
            return;
        }
        dismiss();
        v vVar = this.f22037K;
        if (vVar != null) {
            vVar.c(menuC2677k, true);
        }
        ViewTreeObserver viewTreeObserver = this.f22038L;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f22038L.removeGlobalOnLayoutListener(this.i);
            }
            this.f22038L = null;
        }
        this.f22029C.removeOnAttachStateChangeListener(this.f22047j);
        this.M.onDismiss();
    }

    @Override // n.InterfaceC2664A
    public final void dismiss() {
        ArrayList arrayList = this.f22046h;
        int size = arrayList.size();
        if (size > 0) {
            C2670d[] c2670dArr = (C2670d[]) arrayList.toArray(new C2670d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C2670d c2670d = c2670dArr[i];
                if (c2670d.f22026a.f22347N.isShowing()) {
                    c2670d.f22026a.dismiss();
                }
            }
        }
    }

    @Override // n.w
    public final boolean e(SubMenuC2666C subMenuC2666C) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = this.f22046h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C2670d c2670d = (C2670d) obj;
            if (subMenuC2666C == c2670d.f22027b) {
                c2670d.f22026a.f22350c.requestFocus();
                return true;
            }
        }
        if (!subMenuC2666C.hasVisibleItems()) {
            return false;
        }
        n(subMenuC2666C);
        v vVar = this.f22037K;
        if (vVar != null) {
            vVar.g(subMenuC2666C);
        }
        return true;
    }

    @Override // n.w
    public final boolean f() {
        return false;
    }

    @Override // n.InterfaceC2664A
    public final void g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f22045g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            w((MenuC2677k) obj);
        }
        arrayList.clear();
        View view = this.f22051n;
        this.f22029C = view;
        if (view != null) {
            boolean z6 = this.f22038L == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f22038L = viewTreeObserver;
            if (z6) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f22029C.addOnAttachStateChangeListener(this.f22047j);
        }
    }

    @Override // n.InterfaceC2664A
    public final C2732p0 i() {
        ArrayList arrayList = this.f22046h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C2670d) arrayList.get(arrayList.size() - 1)).f22026a.f22350c;
    }

    @Override // n.w
    public final Parcelable k() {
        return null;
    }

    @Override // n.w
    public final void l(v vVar) {
        this.f22037K = vVar;
    }

    @Override // n.s
    public final void n(MenuC2677k menuC2677k) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        menuC2677k.b(this, this.f22040b);
        if (a()) {
            w(menuC2677k);
        } else {
            this.f22045g.add(menuC2677k);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C2670d c2670d;
        ArrayList arrayList = this.f22046h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c2670d = null;
                break;
            }
            c2670d = (C2670d) arrayList.get(i);
            if (!c2670d.f22026a.f22347N.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c2670d != null) {
            c2670d.f22027b.c(false);
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

    @Override // n.s
    public final void p(View view) {
        if (this.f22051n != view) {
            this.f22051n = view;
            this.f22050m = Gravity.getAbsoluteGravity(this.f22049l, view.getLayoutDirection());
        }
    }

    @Override // n.s
    public final void q(boolean z6) {
        this.f22035I = z6;
    }

    @Override // n.s
    public final void r(int i) {
        if (this.f22049l != i) {
            this.f22049l = i;
            this.f22050m = Gravity.getAbsoluteGravity(i, this.f22051n.getLayoutDirection());
        }
    }

    @Override // n.s
    public final void s(int i) {
        this.f22031E = true;
        this.f22033G = i;
    }

    @Override // n.s
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.M = onDismissListener;
    }

    @Override // n.s
    public final void u(boolean z6) {
        this.f22036J = z6;
    }

    @Override // n.s
    public final void v(int i) {
        this.f22032F = true;
        this.f22034H = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cd  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(n.MenuC2677k r20) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n.ViewOnKeyListenerC2671e.w(n.k):void");
    }

    @Override // n.w
    public final void h(Parcelable parcelable) {
    }
}
