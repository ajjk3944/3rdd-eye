package n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.apm.insight.R;
import o.C2732p0;
import o.F0;

/* renamed from: n.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC2665B extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: C, reason: collision with root package name */
    public ViewTreeObserver f21989C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f21990D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f21991E;

    /* renamed from: F, reason: collision with root package name */
    public int f21992F;

    /* renamed from: H, reason: collision with root package name */
    public boolean f21994H;

    /* renamed from: b, reason: collision with root package name */
    public final Context f21995b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC2677k f21996c;

    /* renamed from: d, reason: collision with root package name */
    public final C2674h f21997d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21998e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21999f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22000g;

    /* renamed from: h, reason: collision with root package name */
    public final F0 f22001h;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f22003k;

    /* renamed from: l, reason: collision with root package name */
    public View f22004l;

    /* renamed from: m, reason: collision with root package name */
    public View f22005m;

    /* renamed from: n, reason: collision with root package name */
    public v f22006n;
    public final A3.C i = new A3.C(2, this);

    /* renamed from: j, reason: collision with root package name */
    public final M3.n f22002j = new M3.n(5, this);

    /* renamed from: G, reason: collision with root package name */
    public int f21993G = 0;

    public ViewOnKeyListenerC2665B(Context context, MenuC2677k menuC2677k, View view, int i, boolean z6) {
        this.f21995b = context;
        this.f21996c = menuC2677k;
        this.f21998e = z6;
        this.f21997d = new C2674h(menuC2677k, LayoutInflater.from(context), z6, R.layout.abc_popup_menu_item_layout);
        this.f22000g = i;
        Resources resources = context.getResources();
        this.f21999f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f22004l = view;
        this.f22001h = new F0(context, null, i, 0);
        menuC2677k.b(this, context);
    }

    @Override // n.InterfaceC2664A
    public final boolean a() {
        return !this.f21990D && this.f22001h.f22347N.isShowing();
    }

    @Override // n.w
    public final void b(boolean z6) {
        this.f21991E = false;
        C2674h c2674h = this.f21997d;
        if (c2674h != null) {
            c2674h.notifyDataSetChanged();
        }
    }

    @Override // n.w
    public final void c(MenuC2677k menuC2677k, boolean z6) {
        if (menuC2677k != this.f21996c) {
            return;
        }
        dismiss();
        v vVar = this.f22006n;
        if (vVar != null) {
            vVar.c(menuC2677k, z6);
        }
    }

    @Override // n.InterfaceC2664A
    public final void dismiss() {
        if (a()) {
            this.f22001h.dismiss();
        }
    }

    @Override // n.w
    public final boolean e(SubMenuC2666C subMenuC2666C) {
        boolean z6;
        if (subMenuC2666C.hasVisibleItems()) {
            u uVar = new u(this.f21995b, subMenuC2666C, this.f22005m, this.f21998e, this.f22000g, 0);
            v vVar = this.f22006n;
            uVar.f22138h = vVar;
            s sVar = uVar.i;
            if (sVar != null) {
                sVar.l(vVar);
            }
            int size = subMenuC2666C.f22081f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z6 = false;
                    break;
                }
                MenuItem item = subMenuC2666C.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z6 = true;
                    break;
                }
                i++;
            }
            uVar.f22137g = z6;
            s sVar2 = uVar.i;
            if (sVar2 != null) {
                sVar2.q(z6);
            }
            uVar.f22139j = this.f22003k;
            this.f22003k = null;
            this.f21996c.c(false);
            F0 f02 = this.f22001h;
            int width = f02.f22353f;
            int iN = f02.n();
            if ((Gravity.getAbsoluteGravity(this.f21993G, this.f22004l.getLayoutDirection()) & 7) == 5) {
                width += this.f22004l.getWidth();
            }
            if (!uVar.b()) {
                if (uVar.f22135e != null) {
                    uVar.d(width, iN, true, true);
                }
            }
            v vVar2 = this.f22006n;
            if (vVar2 != null) {
                vVar2.g(subMenuC2666C);
            }
            return true;
        }
        return false;
    }

    @Override // n.w
    public final boolean f() {
        return false;
    }

    @Override // n.InterfaceC2664A
    public final void g() {
        View view;
        if (a()) {
            return;
        }
        if (this.f21990D || (view = this.f22004l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f22005m = view;
        F0 f02 = this.f22001h;
        f02.f22347N.setOnDismissListener(this);
        f02.f22338D = this;
        f02.M = true;
        f02.f22347N.setFocusable(true);
        View view2 = this.f22005m;
        boolean z6 = this.f21989C == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f21989C = viewTreeObserver;
        if (z6) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f22002j);
        f02.f22337C = view2;
        f02.f22358l = this.f21993G;
        boolean z7 = this.f21991E;
        Context context = this.f21995b;
        C2674h c2674h = this.f21997d;
        if (!z7) {
            this.f21992F = s.o(c2674h, context, this.f21999f);
            this.f21991E = true;
        }
        f02.r(this.f21992F);
        f02.f22347N.setInputMethodMode(2);
        Rect rect = this.f22129a;
        f02.f22346L = rect != null ? new Rect(rect) : null;
        f02.g();
        C2732p0 c2732p0 = f02.f22350c;
        c2732p0.setOnKeyListener(this);
        if (this.f21994H) {
            MenuC2677k menuC2677k = this.f21996c;
            if (menuC2677k.f22087m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c2732p0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC2677k.f22087m);
                }
                frameLayout.setEnabled(false);
                c2732p0.addHeaderView(frameLayout, null, false);
            }
        }
        f02.o(c2674h);
        f02.g();
    }

    @Override // n.InterfaceC2664A
    public final C2732p0 i() {
        return this.f22001h.f22350c;
    }

    @Override // n.w
    public final Parcelable k() {
        return null;
    }

    @Override // n.w
    public final void l(v vVar) {
        this.f22006n = vVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f21990D = true;
        this.f21996c.c(true);
        ViewTreeObserver viewTreeObserver = this.f21989C;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f21989C = this.f22005m.getViewTreeObserver();
            }
            this.f21989C.removeGlobalOnLayoutListener(this.i);
            this.f21989C = null;
        }
        this.f22005m.removeOnAttachStateChangeListener(this.f22002j);
        PopupWindow.OnDismissListener onDismissListener = this.f22003k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f22004l = view;
    }

    @Override // n.s
    public final void q(boolean z6) {
        this.f21997d.f22062c = z6;
    }

    @Override // n.s
    public final void r(int i) {
        this.f21993G = i;
    }

    @Override // n.s
    public final void s(int i) {
        this.f22001h.f22353f = i;
    }

    @Override // n.s
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f22003k = onDismissListener;
    }

    @Override // n.s
    public final void u(boolean z6) {
        this.f21994H = z6;
    }

    @Override // n.s
    public final void v(int i) {
        this.f22001h.k(i);
    }

    @Override // n.w
    public final void h(Parcelable parcelable) {
    }

    @Override // n.s
    public final void n(MenuC2677k menuC2677k) {
    }
}
