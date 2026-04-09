package androidx.appcompat.view.menu;

import F1.AbstractC2771s;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
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
import androidx.appcompat.widget.Q;
import androidx.appcompat.widget.S;
import h.AbstractC5930d;
import h.AbstractC5933g;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B, reason: collision with root package name */
    private static final int f26787B = AbstractC5933g.f48058e;

    /* renamed from: A, reason: collision with root package name */
    boolean f26788A;

    /* renamed from: b, reason: collision with root package name */
    private final Context f26789b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26790c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26791d;

    /* renamed from: e, reason: collision with root package name */
    private final int f26792e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f26793f;

    /* renamed from: g, reason: collision with root package name */
    final Handler f26794g;

    /* renamed from: o, reason: collision with root package name */
    private View f26802o;

    /* renamed from: p, reason: collision with root package name */
    View f26803p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f26805r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f26806s;

    /* renamed from: t, reason: collision with root package name */
    private int f26807t;

    /* renamed from: u, reason: collision with root package name */
    private int f26808u;

    /* renamed from: w, reason: collision with root package name */
    private boolean f26810w;

    /* renamed from: x, reason: collision with root package name */
    private j.a f26811x;

    /* renamed from: y, reason: collision with root package name */
    ViewTreeObserver f26812y;

    /* renamed from: z, reason: collision with root package name */
    private PopupWindow.OnDismissListener f26813z;

    /* renamed from: h, reason: collision with root package name */
    private final List f26795h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    final List f26796i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f26797j = new a();

    /* renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f26798k = new ViewOnAttachStateChangeListenerC1021b();

    /* renamed from: l, reason: collision with root package name */
    private final Q f26799l = new c();

    /* renamed from: m, reason: collision with root package name */
    private int f26800m = 0;

    /* renamed from: n, reason: collision with root package name */
    private int f26801n = 0;

    /* renamed from: v, reason: collision with root package name */
    private boolean f26809v = false;

    /* renamed from: q, reason: collision with root package name */
    private int f26804q = D();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (!b.this.a() || b.this.f26796i.size() <= 0 || ((d) b.this.f26796i.get(0)).f26821a.B()) {
                return;
            }
            View view = b.this.f26803p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f26796i.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f26821a.b();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC1021b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC1021b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f26812y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f26812y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f26812y.removeGlobalOnLayoutListener(bVar.f26797j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements Q {

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f26817a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MenuItem f26818b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f26819c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f26817a = dVar;
                this.f26818b = menuItem;
                this.f26819c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f26817a;
                if (dVar != null) {
                    b.this.f26788A = true;
                    dVar.f26822b.e(false);
                    b.this.f26788A = false;
                }
                if (this.f26818b.isEnabled() && this.f26818b.hasSubMenu()) {
                    this.f26819c.M(this.f26818b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.Q
        public void d(e eVar, MenuItem menuItem) {
            b.this.f26794g.removeCallbacksAndMessages(null);
            int size = b.this.f26796i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == ((d) b.this.f26796i.get(i10)).f26822b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f26794g.postAtTime(new a(i11 < b.this.f26796i.size() ? (d) b.this.f26796i.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.Q
        public void g(e eVar, MenuItem menuItem) {
            b.this.f26794g.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        public final S f26821a;

        /* renamed from: b, reason: collision with root package name */
        public final e f26822b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26823c;

        public d(S s10, e eVar, int i10) {
            this.f26821a = s10;
            this.f26822b = eVar;
            this.f26823c = i10;
        }

        public ListView a() {
            return this.f26821a.j();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f26789b = context;
        this.f26802o = view;
        this.f26791d = i10;
        this.f26792e = i11;
        this.f26793f = z10;
        Resources resources = context.getResources();
        this.f26790c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC5930d.f47974b));
        this.f26794g = new Handler();
    }

    private int A(e eVar) {
        int size = this.f26796i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == ((d) this.f26796i.get(i10)).f26822b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
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
        MenuItem menuItemB = B(dVar.f26822b, eVar);
        if (menuItemB == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
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
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemB == dVar2.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return this.f26802o.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int E(int i10) {
        List list = this.f26796i;
        ListView listViewA = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f26803p.getWindowVisibleDisplayFrame(rect);
        return this.f26804q == 1 ? (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void F(e eVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        d dVar;
        View viewC;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f26789b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f26793f, f26787B);
        if (!a() && this.f26809v) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(h.x(eVar));
        }
        int iO = h.o(dVar2, null, this.f26789b, this.f26790c);
        S sZ = z();
        sZ.p(dVar2);
        sZ.F(iO);
        sZ.G(this.f26801n);
        if (this.f26796i.size() > 0) {
            List list = this.f26796i;
            dVar = (d) list.get(list.size() - 1);
            viewC = C(dVar, eVar);
        } else {
            dVar = null;
            viewC = null;
        }
        if (viewC != null) {
            sZ.V(false);
            sZ.S(null);
            int iE = E(iO);
            boolean z10 = iE == 1;
            this.f26804q = iE;
            sZ.D(viewC);
            if ((this.f26801n & 5) != 5) {
                iO = z10 ? viewC.getWidth() : 0 - iO;
            } else if (!z10) {
                iO = 0 - viewC.getWidth();
            }
            sZ.e(iO);
            sZ.N(true);
            sZ.l(0);
        } else {
            if (this.f26805r) {
                sZ.e(this.f26807t);
            }
            if (this.f26806s) {
                sZ.l(this.f26808u);
            }
            sZ.H(n());
        }
        this.f26796i.add(new d(sZ, eVar, this.f26804q));
        sZ.b();
        ListView listViewJ = sZ.j();
        listViewJ.setOnKeyListener(this);
        if (dVar == null && this.f26810w && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(AbstractC5933g.f48065l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            listViewJ.addHeaderView(frameLayout, null, false);
            sZ.b();
        }
    }

    private S z() {
        S s10 = new S(this.f26789b, null, this.f26791d, this.f26792e);
        s10.U(this.f26799l);
        s10.L(this);
        s10.K(this);
        s10.D(this.f26802o);
        s10.G(this.f26801n);
        s10.J(true);
        s10.I(2);
        return s10;
    }

    @Override // l.InterfaceC6524e
    public boolean a() {
        return this.f26796i.size() > 0 && ((d) this.f26796i.get(0)).f26821a.a();
    }

    @Override // l.InterfaceC6524e
    public void b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (a()) {
            return;
        }
        Iterator it = this.f26795h.iterator();
        while (it.hasNext()) {
            F((e) it.next());
        }
        this.f26795h.clear();
        View view = this.f26802o;
        this.f26803p = view;
        if (view != null) {
            boolean z10 = this.f26812y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f26812y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f26797j);
            }
            this.f26803p.addOnAttachStateChangeListener(this.f26798k);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z10) {
        int iA = A(eVar);
        if (iA < 0) {
            return;
        }
        int i10 = iA + 1;
        if (i10 < this.f26796i.size()) {
            ((d) this.f26796i.get(i10)).f26822b.e(false);
        }
        d dVar = (d) this.f26796i.remove(iA);
        dVar.f26822b.P(this);
        if (this.f26788A) {
            dVar.f26821a.T(null);
            dVar.f26821a.E(0);
        }
        dVar.f26821a.dismiss();
        int size = this.f26796i.size();
        if (size > 0) {
            this.f26804q = ((d) this.f26796i.get(size - 1)).f26823c;
        } else {
            this.f26804q = D();
        }
        if (size != 0) {
            if (z10) {
                ((d) this.f26796i.get(0)).f26822b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f26811x;
        if (aVar != null) {
            aVar.c(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f26812y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f26812y.removeGlobalOnLayoutListener(this.f26797j);
            }
            this.f26812y = null;
        }
        this.f26803p.removeOnAttachStateChangeListener(this.f26798k);
        this.f26813z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z10) {
        Iterator it = this.f26796i.iterator();
        while (it.hasNext()) {
            h.y(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC6524e
    public void dismiss() {
        int size = this.f26796i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f26796i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f26821a.a()) {
                    dVar.f26821a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f26811x = aVar;
    }

    @Override // l.InterfaceC6524e
    public ListView j() {
        if (this.f26796i.isEmpty()) {
            return null;
        }
        return ((d) this.f26796i.get(r0.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (d dVar : this.f26796i) {
            if (mVar == dVar.f26822b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        l(mVar);
        j.a aVar = this.f26811x;
        if (aVar != null) {
            aVar.d(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        eVar.c(this, this.f26789b);
        if (a()) {
            F(eVar);
        } else {
            this.f26795h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f26796i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f26796i.get(i10);
            if (!dVar.f26821a.a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f26822b.e(false);
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

    @Override // androidx.appcompat.view.menu.h
    public void p(View view) {
        if (this.f26802o != view) {
            this.f26802o = view;
            this.f26801n = AbstractC2771s.b(this.f26800m, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z10) {
        this.f26809v = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        if (this.f26800m != i10) {
            this.f26800m = i10;
            this.f26801n = AbstractC2771s.b(i10, this.f26802o.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        this.f26805r = true;
        this.f26807t = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f26813z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z10) {
        this.f26810w = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.f26806s = true;
        this.f26808u = i10;
    }
}
