package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class r2 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f20152a;

    /* renamed from: b, reason: collision with root package name */
    public int f20153b;

    /* renamed from: c, reason: collision with root package name */
    public final View f20154c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f20155d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f20156e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f20157f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20158g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f20159h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f20160i;
    public final CharSequence j;
    public Window.Callback k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20161l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.appcompat.widget.b f20162m;

    /* renamed from: n, reason: collision with root package name */
    public final int f20163n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f20164o;

    public r2(Toolbar toolbar, boolean z10) {
        int i10;
        Drawable drawable;
        int i11 = h.h.abc_action_bar_up_description;
        this.f20163n = 0;
        this.f20152a = toolbar;
        this.f20159h = toolbar.getTitle();
        this.f20160i = toolbar.getSubtitle();
        this.f20158g = this.f20159h != null;
        this.f20157f = toolbar.getNavigationIcon();
        io.sentry.k kVarH0 = io.sentry.k.h0(toolbar.getContext(), null, h.j.ActionBar, h.a.actionBarStyle);
        TypedArray typedArray = (TypedArray) kVarH0.f12398g;
        this.f20164o = kVarH0.U(h.j.ActionBar_homeAsUpIndicator);
        if (z10) {
            CharSequence text = typedArray.getText(h.j.ActionBar_title);
            if (!TextUtils.isEmpty(text)) {
                this.f20158g = true;
                this.f20159h = text;
                if ((this.f20153b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.f20158g) {
                        u3.i0.o(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(h.j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(text2)) {
                this.f20160i = text2;
                if ((this.f20153b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableU = kVarH0.U(h.j.ActionBar_logo);
            if (drawableU != null) {
                this.f20156e = drawableU;
                c();
            }
            Drawable drawableU2 = kVarH0.U(h.j.ActionBar_icon);
            if (drawableU2 != null) {
                this.f20155d = drawableU2;
                c();
            }
            if (this.f20157f == null && (drawable = this.f20164o) != null) {
                this.f20157f = drawable;
                if ((this.f20153b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(h.j.ActionBar_displayOptions, 0));
            int resourceId = typedArray.getResourceId(h.j.ActionBar_customNavigationLayout, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f20154c;
                if (view != null && (this.f20153b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f20154c = viewInflate;
                if (viewInflate != null && (this.f20153b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                a(this.f20153b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(h.j.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(h.j.ActionBar_contentInsetStart, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(h.j.ActionBar_contentInsetEnd, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.P.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(h.j.ActionBar_titleTextStyle, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.H = resourceId2;
                q0 q0Var = toolbar.f1015d;
                if (q0Var != null) {
                    q0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(h.j.ActionBar_subtitleTextStyle, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.I = resourceId3;
                q0 q0Var2 = toolbar.f1019g;
                if (q0Var2 != null) {
                    q0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(h.j.ActionBar_popupTheme, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f20164o = toolbar.getNavigationIcon();
                i10 = 15;
            } else {
                i10 = 11;
            }
            this.f20153b = i10;
        }
        kVarH0.l0();
        if (i11 != this.f20163n) {
            this.f20163n = i11;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i12 = this.f20163n;
                this.j = i12 != 0 ? toolbar.getContext().getString(i12) : null;
                b();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new q2(this));
    }

    public final void a(int i10) {
        View view;
        int i11 = this.f20153b ^ i10;
        this.f20153b = i10;
        if (i11 != 0) {
            int i12 = i11 & 4;
            Toolbar toolbar = this.f20152a;
            if (i12 != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f20153b & 4) != 0) {
                    Drawable drawable = this.f20157f;
                    if (drawable == null) {
                        drawable = this.f20164o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                c();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    toolbar.setTitle(this.f20159h);
                    toolbar.setSubtitle(this.f20160i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f20154c) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f20153b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.f20152a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f20163n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f20153b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f20156e) == null) {
            drawable = this.f20155d;
        }
        this.f20152a.setLogo(drawable);
    }
}
