package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import n.AbstractC5342d;
import o.C5376D;
import o.C5382J;

/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
public final class l extends AbstractC5342d implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: c, reason: collision with root package name */
    public final Context f14497c;

    /* renamed from: d, reason: collision with root package name */
    public final f f14498d;

    /* renamed from: e, reason: collision with root package name */
    public final e f14499e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14500f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14501g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14502h;
    public final C5382J i;

    /* renamed from: l, reason: collision with root package name */
    public i.a f14505l;

    /* renamed from: m, reason: collision with root package name */
    public View f14506m;

    /* renamed from: n, reason: collision with root package name */
    public View f14507n;

    /* renamed from: o, reason: collision with root package name */
    public j.a f14508o;

    /* renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f14509p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14510q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14511r;

    /* renamed from: s, reason: collision with root package name */
    public int f14512s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14514u;

    /* renamed from: j, reason: collision with root package name */
    public final a f14503j = new a();

    /* renamed from: k, reason: collision with root package name */
    public final b f14504k = new b();

    /* renamed from: t, reason: collision with root package name */
    public int f14513t = 0;

    /* compiled from: StandardMenuPopup.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            l lVar = l.this;
            if (lVar.a()) {
                C5382J c5382j = lVar.i;
                if (c5382j.f44555z) {
                    return;
                }
                View view = lVar.f14507n;
                if (view == null || !view.isShown()) {
                    lVar.dismiss();
                } else {
                    c5382j.show();
                }
            }
        }
    }

    public l(int i, Context context, View view, f fVar, boolean z10) {
        this.f14497c = context;
        this.f14498d = fVar;
        this.f14500f = z10;
        this.f14499e = new e(fVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f14502h = i;
        Resources resources = context.getResources();
        this.f14501g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f14506m = view;
        this.i = new C5382J(context, null, i);
        fVar.b(this, context);
    }

    @Override // n.InterfaceC5344f
    public final boolean a() {
        return !this.f14510q && this.i.f44531A.isShowing();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void b(f fVar, boolean z10) {
        if (fVar != this.f14498d) {
            return;
        }
        dismiss();
        j.a aVar = this.f14508o;
        if (aVar != null) {
            aVar.b(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(j.a aVar) {
        this.f14508o = aVar;
    }

    @Override // n.InterfaceC5344f
    public final void dismiss() {
        if (a()) {
            this.i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void g() {
        this.f14511r = false;
        e eVar = this.f14499e;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // n.InterfaceC5344f
    public final C5376D h() {
        return this.i.f44534d;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean i(m mVar) {
        if (mVar.hasVisibleItems()) {
            View view = this.f14507n;
            i iVar = new i(this.f14502h, this.f14497c, view, mVar, this.f14500f);
            j.a aVar = this.f14508o;
            iVar.f14493h = aVar;
            AbstractC5342d abstractC5342d = iVar.i;
            if (abstractC5342d != null) {
                abstractC5342d.d(aVar);
            }
            boolean zT = AbstractC5342d.t(mVar);
            iVar.f14492g = zT;
            AbstractC5342d abstractC5342d2 = iVar.i;
            if (abstractC5342d2 != null) {
                abstractC5342d2.n(zT);
            }
            iVar.f14494j = this.f14505l;
            this.f14505l = null;
            this.f14498d.c(false);
            C5382J c5382j = this.i;
            int width = c5382j.f44537g;
            int iM = c5382j.m();
            if ((Gravity.getAbsoluteGravity(this.f14513t, this.f14506m.getLayoutDirection()) & 7) == 5) {
                width += this.f14506m.getWidth();
            }
            if (!iVar.b()) {
                if (iVar.f14490e != null) {
                    iVar.e(width, iM, true, true);
                }
            }
            j.a aVar2 = this.f14508o;
            if (aVar2 != null) {
                aVar2.c(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // n.AbstractC5342d
    public final void m(View view) {
        this.f14506m = view;
    }

    @Override // n.AbstractC5342d
    public final void n(boolean z10) {
        this.f14499e.f14426d = z10;
    }

    @Override // n.AbstractC5342d
    public final void o(int i) {
        this.f14513t = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f14510q = true;
        this.f14498d.c(true);
        ViewTreeObserver viewTreeObserver = this.f14509p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f14509p = this.f14507n.getViewTreeObserver();
            }
            this.f14509p.removeGlobalOnLayoutListener(this.f14503j);
            this.f14509p = null;
        }
        this.f14507n.removeOnAttachStateChangeListener(this.f14504k);
        i.a aVar = this.f14505l;
        if (aVar != null) {
            aVar.onDismiss();
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

    @Override // n.AbstractC5342d
    public final void p(int i) {
        this.i.f44537g = i;
    }

    @Override // n.AbstractC5342d
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f14505l = (i.a) onDismissListener;
    }

    @Override // n.AbstractC5342d
    public final void r(boolean z10) {
        this.f14514u = z10;
    }

    @Override // n.AbstractC5342d
    public final void s(int i) {
        this.i.j(i);
    }

    @Override // n.InterfaceC5344f
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.f14510q || (view = this.f14506m) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f14507n = view;
        C5382J c5382j = this.i;
        c5382j.f44531A.setOnDismissListener(this);
        c5382j.f44546q = this;
        c5382j.f44555z = true;
        c5382j.f44531A.setFocusable(true);
        View view2 = this.f14507n;
        boolean z10 = this.f14509p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f14509p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f14503j);
        }
        view2.addOnAttachStateChangeListener(this.f14504k);
        c5382j.f44545p = view2;
        c5382j.f44542m = this.f14513t;
        boolean z11 = this.f14511r;
        Context context = this.f14497c;
        e eVar = this.f14499e;
        if (!z11) {
            this.f14512s = AbstractC5342d.l(eVar, context, this.f14501g);
            this.f14511r = true;
        }
        c5382j.q(this.f14512s);
        c5382j.f44531A.setInputMethodMode(2);
        Rect rect = this.f44187b;
        c5382j.f44554y = rect != null ? new Rect(rect) : null;
        c5382j.show();
        C5376D c5376d = c5382j.f44534d;
        c5376d.setOnKeyListener(this);
        if (this.f14514u) {
            f fVar = this.f14498d;
            if (fVar.f14442m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c5376d, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(fVar.f14442m);
                }
                frameLayout.setEnabled(false);
                c5376d.addHeaderView(frameLayout, null, false);
            }
        }
        c5382j.o(eVar);
        c5382j.show();
    }

    /* compiled from: StandardMenuPopup.java */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            l lVar = l.this;
            ViewTreeObserver viewTreeObserver = lVar.f14509p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    lVar.f14509p = view.getViewTreeObserver();
                }
                lVar.f14509p.removeGlobalOnLayoutListener(lVar.f14503j);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // n.AbstractC5342d
    public final void k(f fVar) {
    }
}
