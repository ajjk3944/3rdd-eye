package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.S;
import h.AbstractC5930d;
import h.AbstractC5933g;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {

    /* renamed from: v, reason: collision with root package name */
    private static final int f26918v = AbstractC5933g.f48066m;

    /* renamed from: b, reason: collision with root package name */
    private final Context f26919b;

    /* renamed from: c, reason: collision with root package name */
    private final e f26920c;

    /* renamed from: d, reason: collision with root package name */
    private final d f26921d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f26922e;

    /* renamed from: f, reason: collision with root package name */
    private final int f26923f;

    /* renamed from: g, reason: collision with root package name */
    private final int f26924g;

    /* renamed from: h, reason: collision with root package name */
    private final int f26925h;

    /* renamed from: i, reason: collision with root package name */
    final S f26926i;

    /* renamed from: l, reason: collision with root package name */
    private PopupWindow.OnDismissListener f26929l;

    /* renamed from: m, reason: collision with root package name */
    private View f26930m;

    /* renamed from: n, reason: collision with root package name */
    View f26931n;

    /* renamed from: o, reason: collision with root package name */
    private j.a f26932o;

    /* renamed from: p, reason: collision with root package name */
    ViewTreeObserver f26933p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f26934q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f26935r;

    /* renamed from: s, reason: collision with root package name */
    private int f26936s;

    /* renamed from: u, reason: collision with root package name */
    private boolean f26938u;

    /* renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f26927j = new a();

    /* renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f26928k = new b();

    /* renamed from: t, reason: collision with root package name */
    private int f26937t = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (!l.this.a() || l.this.f26926i.B()) {
                return;
            }
            View view = l.this.f26931n;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f26926i.b();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f26933p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f26933p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f26933p.removeGlobalOnLayoutListener(lVar.f26927j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f26919b = context;
        this.f26920c = eVar;
        this.f26922e = z10;
        this.f26921d = new d(eVar, LayoutInflater.from(context), z10, f26918v);
        this.f26924g = i10;
        this.f26925h = i11;
        Resources resources = context.getResources();
        this.f26923f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC5930d.f47974b));
        this.f26930m = view;
        this.f26926i = new S(context, null, i10, i11);
        eVar.c(this, context);
    }

    private boolean z() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        View view;
        if (a()) {
            return true;
        }
        if (this.f26934q || (view = this.f26930m) == null) {
            return false;
        }
        this.f26931n = view;
        this.f26926i.K(this);
        this.f26926i.L(this);
        this.f26926i.J(true);
        View view2 = this.f26931n;
        boolean z10 = this.f26933p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f26933p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f26927j);
        }
        view2.addOnAttachStateChangeListener(this.f26928k);
        this.f26926i.D(view2);
        this.f26926i.G(this.f26937t);
        if (!this.f26935r) {
            this.f26936s = h.o(this.f26921d, null, this.f26919b, this.f26923f);
            this.f26935r = true;
        }
        this.f26926i.F(this.f26936s);
        this.f26926i.I(2);
        this.f26926i.H(n());
        this.f26926i.b();
        ListView listViewJ = this.f26926i.j();
        listViewJ.setOnKeyListener(this);
        if (this.f26938u && this.f26920c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f26919b).inflate(AbstractC5933g.f48065l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f26920c.x());
            }
            frameLayout.setEnabled(false);
            listViewJ.addHeaderView(frameLayout, null, false);
        }
        this.f26926i.p(this.f26921d);
        this.f26926i.b();
        return true;
    }

    @Override // l.InterfaceC6524e
    public boolean a() {
        return !this.f26934q && this.f26926i.a();
    }

    @Override // l.InterfaceC6524e
    public void b() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z10) {
        if (eVar != this.f26920c) {
            return;
        }
        dismiss();
        j.a aVar = this.f26932o;
        if (aVar != null) {
            aVar.c(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z10) {
        this.f26935r = false;
        d dVar = this.f26921d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC6524e
    public void dismiss() {
        if (a()) {
            this.f26926i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f26932o = aVar;
    }

    @Override // l.InterfaceC6524e
    public ListView j() {
        return this.f26926i.j();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f26919b, mVar, this.f26931n, this.f26922e, this.f26924g, this.f26925h);
            iVar.j(this.f26932o);
            iVar.g(h.x(mVar));
            iVar.i(this.f26929l);
            this.f26929l = null;
            this.f26920c.e(false);
            int iC = this.f26926i.c();
            int iO = this.f26926i.o();
            if ((Gravity.getAbsoluteGravity(this.f26937t, this.f26930m.getLayoutDirection()) & 7) == 5) {
                iC += this.f26930m.getWidth();
            }
            if (iVar.n(iC, iO)) {
                j.a aVar = this.f26932o;
                if (aVar == null) {
                    return true;
                }
                aVar.d(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f26934q = true;
        this.f26920c.close();
        ViewTreeObserver viewTreeObserver = this.f26933p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f26933p = this.f26931n.getViewTreeObserver();
            }
            this.f26933p.removeGlobalOnLayoutListener(this.f26927j);
            this.f26933p = null;
        }
        this.f26931n.removeOnAttachStateChangeListener(this.f26928k);
        PopupWindow.OnDismissListener onDismissListener = this.f26929l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f26930m = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z10) {
        this.f26921d.d(z10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        this.f26937t = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        this.f26926i.e(i10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f26929l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z10) {
        this.f26938u = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.f26926i.l(i10);
    }
}
