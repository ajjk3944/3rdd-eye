package androidx.appcompat.view.menu;

import a0.s;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
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
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.l0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class b extends h implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int C = a.g.f102e;
    private PopupWindow.OnDismissListener A;
    boolean B;

    /* renamed from: c, reason: collision with root package name */
    private final Context f542c;

    /* renamed from: d, reason: collision with root package name */
    private final int f543d;

    /* renamed from: e, reason: collision with root package name */
    private final int f544e;

    /* renamed from: f, reason: collision with root package name */
    private final int f545f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f546g;

    /* renamed from: h, reason: collision with root package name */
    final Handler f547h;

    /* renamed from: p, reason: collision with root package name */
    private View f555p;

    /* renamed from: q, reason: collision with root package name */
    View f556q;

    /* renamed from: s, reason: collision with root package name */
    private boolean f558s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f559t;

    /* renamed from: u, reason: collision with root package name */
    private int f560u;

    /* renamed from: v, reason: collision with root package name */
    private int f561v;

    /* renamed from: x, reason: collision with root package name */
    private boolean f563x;

    /* renamed from: y, reason: collision with root package name */
    private j.a f564y;

    /* renamed from: z, reason: collision with root package name */
    ViewTreeObserver f565z;

    /* renamed from: i, reason: collision with root package name */
    private final List<e> f548i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    final List<d> f549j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f550k = new a();

    /* renamed from: l, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f551l = new ViewOnAttachStateChangeListenerC0004b();

    /* renamed from: m, reason: collision with root package name */
    private final k0 f552m = new c();

    /* renamed from: n, reason: collision with root package name */
    private int f553n = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f554o = 0;

    /* renamed from: w, reason: collision with root package name */
    private boolean f562w = false;

    /* renamed from: r, reason: collision with root package name */
    private int f557r = D();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f549j.size() <= 0 || b.this.f549j.get(0).f573a.x()) {
                return;
            }
            View view = b.this.f556q;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator<d> it = b.this.f549j.iterator();
            while (it.hasNext()) {
                it.next().f573a.i();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0004b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0004b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f565z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f565z = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f565z.removeGlobalOnLayoutListener(bVar.f550k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements k0 {

        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f569b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ MenuItem f570c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ e f571d;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f569b = dVar;
                this.f570c = menuItem;
                this.f571d = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f569b;
                if (dVar != null) {
                    b.this.B = true;
                    dVar.f574b.e(false);
                    b.this.B = false;
                }
                if (this.f570c.isEnabled() && this.f570c.hasSubMenu()) {
                    this.f571d.L(this.f570c, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.k0
        public void g(e eVar, MenuItem menuItem) {
            b.this.f547h.removeCallbacksAndMessages(null);
            int size = b.this.f549j.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (eVar == b.this.f549j.get(i2).f574b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return;
            }
            int i3 = i2 + 1;
            b.this.f547h.postAtTime(new a(i3 < b.this.f549j.size() ? b.this.f549j.get(i3) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.k0
        public void k(e eVar, MenuItem menuItem) {
            b.this.f547h.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        public final l0 f573a;

        /* renamed from: b, reason: collision with root package name */
        public final e f574b;

        /* renamed from: c, reason: collision with root package name */
        public final int f575c;

        public d(l0 l0Var, e eVar, int i2) {
            this.f573a = l0Var;
            this.f574b = eVar;
            this.f575c = i2;
        }

        public ListView a() {
            return this.f573a.e();
        }
    }

    public b(Context context, View view, int i2, int i3, boolean z2) {
        this.f542c = context;
        this.f555p = view;
        this.f544e = i2;
        this.f545f = i3;
        this.f546g = z2;
        Resources resources = context.getResources();
        this.f543d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.d.f37d));
        this.f547h = new Handler();
    }

    private int A(e eVar) {
        int size = this.f549j.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (eVar == this.f549j.get(i2).f574b) {
                return i2;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = eVar.getItem(i2);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemB = B(dVar.f574b, eVar);
        if (menuItemB == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (menuItemB == dVar2.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return s.t(this.f555p) == 1 ? 0 : 1;
    }

    private int E(int i2) {
        List<d> list = this.f549j;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f556q.getWindowVisibleDisplayFrame(rect);
        return this.f557r == 1 ? (iArr[0] + listViewA.getWidth()) + i2 > rect.right ? 0 : 1 : iArr[0] - i2 < 0 ? 1 : 0;
    }

    private void F(e eVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        d dVar;
        View viewC;
        int i2;
        int i3;
        int i4;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f542c);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f546g, C);
        if (!a() && this.f562w) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(h.x(eVar));
        }
        int iO = h.o(dVar2, null, this.f542c, this.f543d);
        l0 l0VarZ = z();
        l0VarZ.o(dVar2);
        l0VarZ.B(iO);
        l0VarZ.C(this.f554o);
        if (this.f549j.size() > 0) {
            List<d> list = this.f549j;
            dVar = list.get(list.size() - 1);
            viewC = C(dVar, eVar);
        } else {
            dVar = null;
            viewC = null;
        }
        if (viewC != null) {
            l0VarZ.Q(false);
            l0VarZ.N(null);
            int iE = E(iO);
            boolean z2 = iE == 1;
            this.f557r = iE;
            if (Build.VERSION.SDK_INT >= 26) {
                l0VarZ.z(viewC);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.f555p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewC.getLocationOnScreen(iArr2);
                if ((this.f554o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f555p.getWidth();
                    iArr2[0] = iArr2[0] + viewC.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.f554o & 5) == 5) {
                if (!z2) {
                    iO = viewC.getWidth();
                    i4 = i2 - iO;
                }
                i4 = i2 + iO;
            } else {
                if (z2) {
                    iO = viewC.getWidth();
                    i4 = i2 + iO;
                }
                i4 = i2 - iO;
            }
            l0VarZ.c(i4);
            l0VarZ.I(true);
            l0VarZ.m(i3);
        } else {
            if (this.f558s) {
                l0VarZ.c(this.f560u);
            }
            if (this.f559t) {
                l0VarZ.m(this.f561v);
            }
            l0VarZ.D(n());
        }
        this.f549j.add(new d(l0VarZ, eVar, this.f557r));
        l0VarZ.i();
        ListView listViewE = l0VarZ.e();
        listViewE.setOnKeyListener(this);
        if (dVar == null && this.f563x && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(a.g.f109l, (ViewGroup) listViewE, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            listViewE.addHeaderView(frameLayout, null, false);
            l0VarZ.i();
        }
    }

    private l0 z() {
        l0 l0Var = new l0(this.f542c, null, this.f544e, this.f545f);
        l0Var.P(this.f552m);
        l0Var.H(this);
        l0Var.G(this);
        l0Var.z(this.f555p);
        l0Var.C(this.f554o);
        l0Var.F(true);
        l0Var.E(2);
        return l0Var;
    }

    @Override // g.e
    public boolean a() {
        return this.f549j.size() > 0 && this.f549j.get(0).f573a.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z2) {
        int iA = A(eVar);
        if (iA < 0) {
            return;
        }
        int i2 = iA + 1;
        if (i2 < this.f549j.size()) {
            this.f549j.get(i2).f574b.e(false);
        }
        d dVarRemove = this.f549j.remove(iA);
        dVarRemove.f574b.O(this);
        if (this.B) {
            dVarRemove.f573a.O(null);
            dVarRemove.f573a.A(0);
        }
        dVarRemove.f573a.dismiss();
        int size = this.f549j.size();
        this.f557r = size > 0 ? this.f549j.get(size - 1).f575c : D();
        if (size != 0) {
            if (z2) {
                this.f549j.get(0).f574b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f564y;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f565z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f565z.removeGlobalOnLayoutListener(this.f550k);
            }
            this.f565z = null;
        }
        this.f556q.removeOnAttachStateChangeListener(this.f551l);
        this.A.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f564y = aVar;
    }

    @Override // g.e
    public void dismiss() {
        int size = this.f549j.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f549j.toArray(new d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                d dVar = dVarArr[i2];
                if (dVar.f573a.a()) {
                    dVar.f573a.dismiss();
                }
            }
        }
    }

    @Override // g.e
    public ListView e() {
        if (this.f549j.isEmpty()) {
            return null;
        }
        return this.f549j.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (d dVar : this.f549j) {
            if (mVar == dVar.f574b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        l(mVar);
        j.a aVar = this.f564y;
        if (aVar != null) {
            aVar.c(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(boolean z2) {
        Iterator<d> it = this.f549j.iterator();
        while (it.hasNext()) {
            h.y(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // g.e
    public void i() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (a()) {
            return;
        }
        Iterator<e> it = this.f548i.iterator();
        while (it.hasNext()) {
            F(it.next());
        }
        this.f548i.clear();
        View view = this.f555p;
        this.f556q = view;
        if (view != null) {
            boolean z2 = this.f565z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f565z = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f550k);
            }
            this.f556q.addOnAttachStateChangeListener(this.f551l);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        eVar.c(this, this.f542c);
        if (a()) {
            F(eVar);
        } else {
            this.f548i.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f549j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f549j.get(i2);
            if (!dVar.f573a.a()) {
                break;
            } else {
                i2++;
            }
        }
        if (dVar != null) {
            dVar.f574b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void p(View view) {
        if (this.f555p != view) {
            this.f555p = view;
            this.f554o = a0.d.b(this.f553n, s.t(view));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z2) {
        this.f562w = z2;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i2) {
        if (this.f553n != i2) {
            this.f553n = i2;
            this.f554o = a0.d.b(i2, s.t(this.f555p));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i2) {
        this.f558s = true;
        this.f560u = i2;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z2) {
        this.f563x = z2;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i2) {
        this.f559t = true;
        this.f561v = i2;
    }
}
