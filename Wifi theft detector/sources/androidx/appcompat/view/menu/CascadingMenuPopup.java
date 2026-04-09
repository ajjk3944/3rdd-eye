package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.p0;
import androidx.core.view.r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class CascadingMenuPopup extends i.d implements h, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int B = c.g.abc_cascading_menu_item_layout;
    public boolean A;

    /* renamed from: b, reason: collision with root package name */
    public final Context f629b;

    /* renamed from: c, reason: collision with root package name */
    public final int f630c;

    /* renamed from: d, reason: collision with root package name */
    public final int f631d;

    /* renamed from: e, reason: collision with root package name */
    public final int f632e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f633f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f634g;

    /* renamed from: o, reason: collision with root package name */
    public View f642o;

    /* renamed from: p, reason: collision with root package name */
    public View f643p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f645r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f646s;

    /* renamed from: t, reason: collision with root package name */
    public int f647t;

    /* renamed from: u, reason: collision with root package name */
    public int f648u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f650w;

    /* renamed from: x, reason: collision with root package name */
    public h.a f651x;

    /* renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f652y;

    /* renamed from: z, reason: collision with root package name */
    public PopupWindow.OnDismissListener f653z;

    /* renamed from: h, reason: collision with root package name */
    public final List f635h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final List f636i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f637j = new a();

    /* renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f638k = new b();

    /* renamed from: l, reason: collision with root package name */
    public final o0 f639l = new c();

    /* renamed from: m, reason: collision with root package name */
    public int f640m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f641n = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f649v = false;

    /* renamed from: q, reason: collision with root package name */
    public int f644q = E();

    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!CascadingMenuPopup.this.a() || CascadingMenuPopup.this.f636i.size() <= 0 || ((d) CascadingMenuPopup.this.f636i.get(0)).f661a.A()) {
                return;
            }
            View view = CascadingMenuPopup.this.f643p;
            if (view == null || !view.isShown()) {
                CascadingMenuPopup.this.dismiss();
                return;
            }
            Iterator it = CascadingMenuPopup.this.f636i.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f661a.show();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = CascadingMenuPopup.this.f652y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    CascadingMenuPopup.this.f652y = view.getViewTreeObserver();
                }
                CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
                cascadingMenuPopup.f652y.removeGlobalOnLayoutListener(cascadingMenuPopup.f637j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements o0 {

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f657a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MenuItem f658b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ androidx.appcompat.view.menu.d f659c;

            public a(d dVar, MenuItem menuItem, androidx.appcompat.view.menu.d dVar2) {
                this.f657a = dVar;
                this.f658b = menuItem;
                this.f659c = dVar2;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f657a;
                if (dVar != null) {
                    CascadingMenuPopup.this.A = true;
                    dVar.f662b.e(false);
                    CascadingMenuPopup.this.A = false;
                }
                if (this.f658b.isEnabled() && this.f658b.hasSubMenu()) {
                    this.f659c.O(this.f658b, 4);
                }
            }
        }

        public c() {
        }

        @Override // androidx.appcompat.widget.o0
        public void d(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            CascadingMenuPopup.this.f634g.removeCallbacksAndMessages(null);
            int size = CascadingMenuPopup.this.f636i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (dVar == ((d) CascadingMenuPopup.this.f636i.get(i10)).f662b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            CascadingMenuPopup.this.f634g.postAtTime(new a(i11 < CascadingMenuPopup.this.f636i.size() ? (d) CascadingMenuPopup.this.f636i.get(i11) : null, menuItem, dVar), dVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.o0
        public void n(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            CascadingMenuPopup.this.f634g.removeCallbacksAndMessages(dVar);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final p0 f661a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.appcompat.view.menu.d f662b;

        /* renamed from: c, reason: collision with root package name */
        public final int f663c;

        public d(p0 p0Var, androidx.appcompat.view.menu.d dVar, int i10) {
            this.f661a = p0Var;
            this.f662b = dVar;
            this.f663c = i10;
        }

        public ListView a() {
            return this.f661a.o();
        }
    }

    public CascadingMenuPopup(Context context, View view, int i10, int i11, boolean z10) {
        this.f629b = context;
        this.f642o = view;
        this.f631d = i10;
        this.f632e = i11;
        this.f633f = z10;
        Resources resources = context.getResources();
        this.f630c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(c.d.abc_config_prefDialogWidth));
        this.f634g = new Handler();
    }

    public final p0 A() {
        p0 p0Var = new p0(this.f629b, null, this.f631d, this.f632e);
        p0Var.T(this.f639l);
        p0Var.K(this);
        p0Var.J(this);
        p0Var.C(this.f642o);
        p0Var.F(this.f641n);
        p0Var.I(true);
        p0Var.H(2);
        return p0Var;
    }

    public final int B(androidx.appcompat.view.menu.d dVar) {
        int size = this.f636i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (dVar == ((d) this.f636i.get(i10)).f662b) {
                return i10;
            }
        }
        return -1;
    }

    public final MenuItem C(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.d dVar2) {
        int size = dVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = dVar.getItem(i10);
            if (item.hasSubMenu() && dVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View D(d dVar, androidx.appcompat.view.menu.d dVar2) {
        androidx.appcompat.view.menu.c cVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemC = C(dVar.f662b, dVar2);
        if (menuItemC == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            cVar = (androidx.appcompat.view.menu.c) headerViewListAdapter.getWrappedAdapter();
        } else {
            cVar = (androidx.appcompat.view.menu.c) adapter;
            headersCount = 0;
        }
        int count = cVar.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemC == cVar.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int E() {
        return this.f642o.getLayoutDirection() == 1 ? 0 : 1;
    }

    public final int F(int i10) {
        List list = this.f636i;
        ListView listViewA = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f643p.getWindowVisibleDisplayFrame(rect);
        return this.f644q == 1 ? (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    public final void G(androidx.appcompat.view.menu.d dVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        d dVar2;
        View viewD;
        int i10;
        int i11;
        int i12;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f629b);
        androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(dVar, layoutInflaterFrom, this.f633f, B);
        if (!a() && this.f649v) {
            cVar.d(true);
        } else if (a()) {
            cVar.d(i.d.y(dVar));
        }
        int iP = i.d.p(cVar, null, this.f629b, this.f630c);
        p0 p0VarA = A();
        p0VarA.m(cVar);
        p0VarA.E(iP);
        p0VarA.F(this.f641n);
        if (this.f636i.size() > 0) {
            List list = this.f636i;
            dVar2 = (d) list.get(list.size() - 1);
            viewD = D(dVar2, dVar);
        } else {
            dVar2 = null;
            viewD = null;
        }
        if (viewD != null) {
            p0VarA.U(false);
            p0VarA.R(null);
            int iF = F(iP);
            boolean z10 = iF == 1;
            this.f644q = iF;
            if (Build.VERSION.SDK_INT >= 26) {
                p0VarA.C(viewD);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f642o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewD.getLocationOnScreen(iArr2);
                if ((this.f641n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f642o.getWidth();
                    iArr2[0] = iArr2[0] + viewD.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f641n & 5) == 5) {
                if (!z10) {
                    iP = viewD.getWidth();
                    i12 = i10 - iP;
                }
                i12 = i10 + iP;
            } else {
                if (z10) {
                    iP = viewD.getWidth();
                    i12 = i10 + iP;
                }
                i12 = i10 - iP;
            }
            p0VarA.e(i12);
            p0VarA.M(true);
            p0VarA.i(i11);
        } else {
            if (this.f645r) {
                p0VarA.e(this.f647t);
            }
            if (this.f646s) {
                p0VarA.i(this.f648u);
            }
            p0VarA.G(n());
        }
        this.f636i.add(new d(p0VarA, dVar, this.f644q));
        p0VarA.show();
        ListView listViewO = p0VarA.o();
        listViewO.setOnKeyListener(this);
        if (dVar2 == null && this.f650w && dVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(c.g.abc_popup_menu_header_item_layout, (ViewGroup) listViewO, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(dVar.z());
            listViewO.addHeaderView(frameLayout, null, false);
            p0VarA.show();
        }
    }

    @Override // i.f
    public boolean a() {
        return this.f636i.size() > 0 && ((d) this.f636i.get(0)).f661a.a();
    }

    @Override // androidx.appcompat.view.menu.h
    public void b(androidx.appcompat.view.menu.d dVar, boolean z10) {
        int iB = B(dVar);
        if (iB < 0) {
            return;
        }
        int i10 = iB + 1;
        if (i10 < this.f636i.size()) {
            ((d) this.f636i.get(i10)).f662b.e(false);
        }
        d dVar2 = (d) this.f636i.remove(iB);
        dVar2.f662b.R(this);
        if (this.A) {
            dVar2.f661a.S(null);
            dVar2.f661a.D(0);
        }
        dVar2.f661a.dismiss();
        int size = this.f636i.size();
        if (size > 0) {
            this.f644q = ((d) this.f636i.get(size - 1)).f663c;
        } else {
            this.f644q = E();
        }
        if (size != 0) {
            if (z10) {
                ((d) this.f636i.get(0)).f662b.e(false);
                return;
            }
            return;
        }
        dismiss();
        h.a aVar = this.f651x;
        if (aVar != null) {
            aVar.b(dVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f652y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f652y.removeGlobalOnLayoutListener(this.f637j);
            }
            this.f652y = null;
        }
        this.f643p.removeOnAttachStateChangeListener(this.f638k);
        this.f653z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.h
    public void d(h.a aVar) {
        this.f651x = aVar;
    }

    @Override // i.f
    public void dismiss() {
        int size = this.f636i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f636i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f661a.a()) {
                    dVar.f661a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void e(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean f(k kVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (d dVar : this.f636i) {
            if (kVar == dVar.f662b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!kVar.hasVisibleItems()) {
            return false;
        }
        l(kVar);
        h.a aVar = this.f651x;
        if (aVar != null) {
            aVar.c(kVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public Parcelable g() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.h
    public void h(boolean z10) {
        Iterator it = this.f636i.iterator();
        while (it.hasNext()) {
            i.d.z(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean i() {
        return false;
    }

    @Override // i.d
    public void l(androidx.appcompat.view.menu.d dVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        dVar.c(this, this.f629b);
        if (a()) {
            G(dVar);
        } else {
            this.f635h.add(dVar);
        }
    }

    @Override // i.d
    public boolean m() {
        return false;
    }

    @Override // i.f
    public ListView o() {
        if (this.f636i.isEmpty()) {
            return null;
        }
        return ((d) this.f636i.get(r0.size() - 1)).a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f636i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f636i.get(i10);
            if (!dVar.f661a.a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f662b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // i.d
    public void q(View view) {
        if (this.f642o != view) {
            this.f642o = view;
            this.f641n = r.b(this.f640m, view.getLayoutDirection());
        }
    }

    @Override // i.d
    public void s(boolean z10) {
        this.f649v = z10;
    }

    @Override // i.f
    public void show() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (a()) {
            return;
        }
        Iterator it = this.f635h.iterator();
        while (it.hasNext()) {
            G((androidx.appcompat.view.menu.d) it.next());
        }
        this.f635h.clear();
        View view = this.f642o;
        this.f643p = view;
        if (view != null) {
            boolean z10 = this.f652y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f652y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f637j);
            }
            this.f643p.addOnAttachStateChangeListener(this.f638k);
        }
    }

    @Override // i.d
    public void t(int i10) {
        if (this.f640m != i10) {
            this.f640m = i10;
            this.f641n = r.b(i10, this.f642o.getLayoutDirection());
        }
    }

    @Override // i.d
    public void u(int i10) {
        this.f645r = true;
        this.f647t = i10;
    }

    @Override // i.d
    public void v(PopupWindow.OnDismissListener onDismissListener) {
        this.f653z = onDismissListener;
    }

    @Override // i.d
    public void w(boolean z10) {
        this.f650w = z10;
    }

    @Override // i.d
    public void x(int i10) {
        this.f646s = true;
        this.f648u = i10;
    }
}
