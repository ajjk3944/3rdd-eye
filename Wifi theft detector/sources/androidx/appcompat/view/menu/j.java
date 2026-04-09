package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
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
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.p0;

/* loaded from: classes.dex */
public final class j extends i.d implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, h, View.OnKeyListener {

    /* renamed from: v, reason: collision with root package name */
    public static final int f782v = c.g.abc_popup_menu_item_layout;

    /* renamed from: b, reason: collision with root package name */
    public final Context f783b;

    /* renamed from: c, reason: collision with root package name */
    public final d f784c;

    /* renamed from: d, reason: collision with root package name */
    public final c f785d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f786e;

    /* renamed from: f, reason: collision with root package name */
    public final int f787f;

    /* renamed from: g, reason: collision with root package name */
    public final int f788g;

    /* renamed from: h, reason: collision with root package name */
    public final int f789h;

    /* renamed from: i, reason: collision with root package name */
    public final p0 f790i;

    /* renamed from: l, reason: collision with root package name */
    public PopupWindow.OnDismissListener f793l;

    /* renamed from: m, reason: collision with root package name */
    public View f794m;

    /* renamed from: n, reason: collision with root package name */
    public View f795n;

    /* renamed from: o, reason: collision with root package name */
    public h.a f796o;

    /* renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f797p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f798q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f799r;

    /* renamed from: s, reason: collision with root package name */
    public int f800s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f802u;

    /* renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f791j = new a();

    /* renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f792k = new b();

    /* renamed from: t, reason: collision with root package name */
    public int f801t = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!j.this.a() || j.this.f790i.A()) {
                return;
            }
            View view = j.this.f795n;
            if (view == null || !view.isShown()) {
                j.this.dismiss();
            } else {
                j.this.f790i.show();
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
            ViewTreeObserver viewTreeObserver = j.this.f797p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    j.this.f797p = view.getViewTreeObserver();
                }
                j jVar = j.this;
                jVar.f797p.removeGlobalOnLayoutListener(jVar.f791j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public j(Context context, d dVar, View view, int i10, int i11, boolean z10) {
        this.f783b = context;
        this.f784c = dVar;
        this.f786e = z10;
        this.f785d = new c(dVar, LayoutInflater.from(context), z10, f782v);
        this.f788g = i10;
        this.f789h = i11;
        Resources resources = context.getResources();
        this.f787f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(c.d.abc_config_prefDialogWidth));
        this.f794m = view;
        this.f790i = new p0(context, null, i10, i11);
        dVar.c(this, context);
    }

    public final boolean A() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f798q || (view = this.f794m) == null) {
            return false;
        }
        this.f795n = view;
        this.f790i.J(this);
        this.f790i.K(this);
        this.f790i.I(true);
        View view2 = this.f795n;
        boolean z10 = this.f797p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f797p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f791j);
        }
        view2.addOnAttachStateChangeListener(this.f792k);
        this.f790i.C(view2);
        this.f790i.F(this.f801t);
        if (!this.f799r) {
            this.f800s = i.d.p(this.f785d, null, this.f783b, this.f787f);
            this.f799r = true;
        }
        this.f790i.E(this.f800s);
        this.f790i.H(2);
        this.f790i.G(n());
        this.f790i.show();
        ListView listViewO = this.f790i.o();
        listViewO.setOnKeyListener(this);
        if (this.f802u && this.f784c.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f783b).inflate(c.g.abc_popup_menu_header_item_layout, (ViewGroup) listViewO, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f784c.z());
            }
            frameLayout.setEnabled(false);
            listViewO.addHeaderView(frameLayout, null, false);
        }
        this.f790i.m(this.f785d);
        this.f790i.show();
        return true;
    }

    @Override // i.f
    public boolean a() {
        return !this.f798q && this.f790i.a();
    }

    @Override // androidx.appcompat.view.menu.h
    public void b(d dVar, boolean z10) {
        if (dVar != this.f784c) {
            return;
        }
        dismiss();
        h.a aVar = this.f796o;
        if (aVar != null) {
            aVar.b(dVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void d(h.a aVar) {
        this.f796o = aVar;
    }

    @Override // i.f
    public void dismiss() {
        if (a()) {
            this.f790i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void e(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean f(k kVar) {
        if (kVar.hasVisibleItems()) {
            g gVar = new g(this.f783b, kVar, this.f795n, this.f786e, this.f788g, this.f789h);
            gVar.j(this.f796o);
            gVar.g(i.d.y(kVar));
            gVar.i(this.f793l);
            this.f793l = null;
            this.f784c.e(false);
            int iC = this.f790i.c();
            int iL = this.f790i.l();
            if ((Gravity.getAbsoluteGravity(this.f801t, this.f794m.getLayoutDirection()) & 7) == 5) {
                iC += this.f794m.getWidth();
            }
            if (gVar.n(iC, iL)) {
                h.a aVar = this.f796o;
                if (aVar == null) {
                    return true;
                }
                aVar.c(kVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public Parcelable g() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.h
    public void h(boolean z10) {
        this.f799r = false;
        c cVar = this.f785d;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean i() {
        return false;
    }

    @Override // i.d
    public void l(d dVar) {
    }

    @Override // i.f
    public ListView o() {
        return this.f790i.o();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f798q = true;
        this.f784c.close();
        ViewTreeObserver viewTreeObserver = this.f797p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f797p = this.f795n.getViewTreeObserver();
            }
            this.f797p.removeGlobalOnLayoutListener(this.f791j);
            this.f797p = null;
        }
        this.f795n.removeOnAttachStateChangeListener(this.f792k);
        PopupWindow.OnDismissListener onDismissListener = this.f793l;
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

    @Override // i.d
    public void q(View view) {
        this.f794m = view;
    }

    @Override // i.d
    public void s(boolean z10) {
        this.f785d.d(z10);
    }

    @Override // i.f
    public void show() {
        if (!A()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // i.d
    public void t(int i10) {
        this.f801t = i10;
    }

    @Override // i.d
    public void u(int i10) {
        this.f790i.e(i10);
    }

    @Override // i.d
    public void v(PopupWindow.OnDismissListener onDismissListener) {
        this.f793l = onDismissListener;
    }

    @Override // i.d
    public void w(boolean z10) {
        this.f802u = z10;
    }

    @Override // i.d
    public void x(int i10) {
        this.f790i.i(i10);
    }
}
