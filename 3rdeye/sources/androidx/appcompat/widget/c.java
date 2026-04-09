package androidx.appcompat.widget;

import A2.l;
import A9.I;
import L0.S;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.f;
import androidx.appcompat.widget.a;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import g.C4353a;
import o.InterfaceC5374B;
import o.X;
import o.Z;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public final class c implements InterfaceC5374B {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f14783a;

    /* renamed from: b, reason: collision with root package name */
    public int f14784b;

    /* renamed from: c, reason: collision with root package name */
    public final View f14785c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f14786d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f14787e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f14788f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14789g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f14790h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f14791j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f14792k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14793l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.appcompat.widget.a f14794m;

    /* renamed from: n, reason: collision with root package name */
    public final int f14795n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f14796o;

    /* compiled from: ToolbarWidgetWrapper.java */
    public class a extends l {

        /* renamed from: c, reason: collision with root package name */
        public boolean f14797c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f14798d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f14799e;

        public a(c cVar, int i) {
            super(13);
            this.f14799e = cVar;
            this.f14798d = i;
            this.f14797c = false;
        }

        @Override // A2.l, L0.T
        public final void a() {
            this.f14797c = true;
        }

        @Override // A2.l, L0.T
        public final void d() {
            this.f14799e.f14783a.setVisibility(0);
        }

        @Override // L0.T
        public final void e() {
            if (this.f14797c) {
                return;
            }
            this.f14799e.f14783a.setVisibility(this.f14798d);
        }
    }

    public c(Toolbar toolbar, boolean z10) {
        Drawable drawable;
        this.f14795n = 0;
        this.f14783a = toolbar;
        this.f14790h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.f14789g = this.f14790h != null;
        this.f14788f = toolbar.getNavigationIcon();
        X xE = X.e(toolbar.getContext(), null, C4353a.f37876a, R.attr.actionBarStyle);
        int i = 15;
        this.f14796o = xE.b(15);
        if (z10) {
            TypedArray typedArray = xE.f44608b;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.f14784b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableB = xE.b(20);
            if (drawableB != null) {
                this.f14787e = drawableB;
                t();
            }
            Drawable drawableB2 = xE.b(17);
            if (drawableB2 != null) {
                setIcon(drawableB2);
            }
            if (this.f14788f == null && (drawable = this.f14796o) != null) {
                this.f14788f = drawable;
                int i10 = this.f14784b & 4;
                Toolbar toolbar2 = this.f14783a;
                if (i10 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            j(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f14785c;
                if (view != null && (this.f14784b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f14785c = viewInflate;
                if (viewInflate != null && (this.f14784b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                j(this.f14784b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.f14740u.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f14732m = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.f14723c;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f14733n = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.f14724d;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f14796o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f14784b = i;
        }
        xE.f();
        if (R.string.abc_action_bar_up_description != this.f14795n) {
            this.f14795n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i11 = this.f14795n;
                this.f14791j = i11 != 0 ? toolbar.getContext().getString(i11) : null;
                s();
            }
        }
        this.f14791j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new Z(this));
    }

    @Override // o.InterfaceC5374B
    public final boolean a() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.f14783a.f14722b;
        return (actionMenuView == null || (aVar = actionMenuView.f14580u) == null || !aVar.k()) ? false : true;
    }

    @Override // o.InterfaceC5374B
    public final void b() {
        this.f14793l = true;
    }

    @Override // o.InterfaceC5374B
    public final boolean c() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f14783a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f14722b) != null && actionMenuView.f14579t;
    }

    @Override // o.InterfaceC5374B
    public final void collapseActionView() {
        Toolbar.f fVar = this.f14783a.f14714N;
        h hVar = fVar == null ? null : fVar.f14751c;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    @Override // o.InterfaceC5374B
    public final void d(f fVar, j.a aVar) {
        androidx.appcompat.widget.a aVar2 = this.f14794m;
        Toolbar toolbar = this.f14783a;
        if (aVar2 == null) {
            this.f14794m = new androidx.appcompat.widget.a(toolbar.getContext());
        }
        androidx.appcompat.widget.a aVar3 = this.f14794m;
        aVar3.f14379f = aVar;
        if (fVar == null && toolbar.f14722b == null) {
            return;
        }
        toolbar.f();
        f fVar2 = toolbar.f14722b.f14576q;
        if (fVar2 == fVar) {
            return;
        }
        if (fVar2 != null) {
            fVar2.r(toolbar.f14713M);
            fVar2.r(toolbar.f14714N);
        }
        if (toolbar.f14714N == null) {
            toolbar.f14714N = toolbar.new f();
        }
        aVar3.f14768r = true;
        if (fVar != null) {
            fVar.b(aVar3, toolbar.f14730k);
            fVar.b(toolbar.f14714N, toolbar.f14730k);
        } else {
            aVar3.f(toolbar.f14730k, null);
            toolbar.f14714N.f(toolbar.f14730k, null);
            aVar3.g();
            toolbar.f14714N.g();
        }
        toolbar.f14722b.setPopupTheme(toolbar.f14731l);
        toolbar.f14722b.setPresenter(aVar3);
        toolbar.f14713M = aVar3;
        toolbar.v();
    }

    @Override // o.InterfaceC5374B
    public final boolean e() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.f14783a.f14722b;
        if (actionMenuView == null || (aVar = actionMenuView.f14580u) == null) {
            return false;
        }
        return aVar.f14772v != null || aVar.k();
    }

    @Override // o.InterfaceC5374B
    public final boolean f() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.f14783a.f14722b;
        return (actionMenuView == null || (aVar = actionMenuView.f14580u) == null || !aVar.h()) ? false : true;
    }

    @Override // o.InterfaceC5374B
    public final boolean g() {
        return this.f14783a.u();
    }

    @Override // o.InterfaceC5374B
    public final Context getContext() {
        return this.f14783a.getContext();
    }

    @Override // o.InterfaceC5374B
    public final CharSequence getTitle() {
        return this.f14783a.getTitle();
    }

    @Override // o.InterfaceC5374B
    public final void h() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.f14783a.f14722b;
        if (actionMenuView == null || (aVar = actionMenuView.f14580u) == null) {
            return;
        }
        aVar.h();
        a.C0228a c0228a = aVar.f14771u;
        if (c0228a == null || !c0228a.b()) {
            return;
        }
        c0228a.i.dismiss();
    }

    @Override // o.InterfaceC5374B
    public final boolean i() {
        Toolbar.f fVar = this.f14783a.f14714N;
        return (fVar == null || fVar.f14751c == null) ? false : true;
    }

    @Override // o.InterfaceC5374B
    public final void j(int i) {
        View view;
        int i10 = this.f14784b ^ i;
        this.f14784b = i;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i & 4) != 0) {
                    s();
                }
                int i11 = this.f14784b & 4;
                Toolbar toolbar = this.f14783a;
                if (i11 != 0) {
                    Drawable drawable = this.f14788f;
                    if (drawable == null) {
                        drawable = this.f14796o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                t();
            }
            int i12 = i10 & 8;
            Toolbar toolbar2 = this.f14783a;
            if (i12 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.f14790h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) == 0 || (view = this.f14785c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    @Override // o.InterfaceC5374B
    public final void l(int i) {
        this.f14787e = i != 0 ? I.w(this.f14783a.getContext(), i) : null;
        t();
    }

    @Override // o.InterfaceC5374B
    public final S m(int i, long j4) {
        S sA = L0.I.a(this.f14783a);
        sA.a(i == 0 ? 1.0f : 0.0f);
        sA.c(j4);
        sA.d(new a(this, i));
        return sA;
    }

    @Override // o.InterfaceC5374B
    public final void n(int i) {
        this.f14783a.setVisibility(i);
    }

    @Override // o.InterfaceC5374B
    public final int o() {
        return this.f14784b;
    }

    @Override // o.InterfaceC5374B
    public final void p() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // o.InterfaceC5374B
    public final void q() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // o.InterfaceC5374B
    public final void r(boolean z10) {
        this.f14783a.setCollapsible(z10);
    }

    public final void s() {
        if ((this.f14784b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f14791j);
            Toolbar toolbar = this.f14783a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f14795n);
            } else {
                toolbar.setNavigationContentDescription(this.f14791j);
            }
        }
    }

    @Override // o.InterfaceC5374B
    public final void setIcon(int i) {
        setIcon(i != 0 ? I.w(this.f14783a.getContext(), i) : null);
    }

    @Override // o.InterfaceC5374B
    public final void setTitle(CharSequence charSequence) {
        this.f14789g = true;
        this.f14790h = charSequence;
        if ((this.f14784b & 8) != 0) {
            Toolbar toolbar = this.f14783a;
            toolbar.setTitle(charSequence);
            if (this.f14789g) {
                L0.I.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // o.InterfaceC5374B
    public final void setWindowCallback(Window.Callback callback) {
        this.f14792k = callback;
    }

    @Override // o.InterfaceC5374B
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.f14789g) {
            return;
        }
        this.f14790h = charSequence;
        if ((this.f14784b & 8) != 0) {
            Toolbar toolbar = this.f14783a;
            toolbar.setTitle(charSequence);
            if (this.f14789g) {
                L0.I.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final void t() {
        Drawable drawable;
        int i = this.f14784b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f14787e) == null) {
            drawable = this.f14786d;
        }
        this.f14783a.setLogo(drawable);
    }

    @Override // o.InterfaceC5374B
    public final void setIcon(Drawable drawable) {
        this.f14786d = drawable;
        t();
    }

    @Override // o.InterfaceC5374B
    public final void k() {
    }
}
