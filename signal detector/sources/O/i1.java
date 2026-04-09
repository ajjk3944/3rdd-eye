package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import com.apm.insight.R;
import g.AbstractC2327a;

/* loaded from: classes.dex */
public final class i1 implements InterfaceC2714g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f22522a;

    /* renamed from: b, reason: collision with root package name */
    public int f22523b;

    /* renamed from: c, reason: collision with root package name */
    public final View f22524c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f22525d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f22526e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f22527f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22528g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f22529h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f22530j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f22531k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22532l;

    /* renamed from: m, reason: collision with root package name */
    public C2723l f22533m;

    /* renamed from: n, reason: collision with root package name */
    public final int f22534n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f22535o;

    public i1(Toolbar toolbar, boolean z6) {
        Drawable drawable;
        this.f22534n = 0;
        this.f22522a = toolbar;
        this.f22529h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.f22528g = this.f22529h != null;
        this.f22527f = toolbar.getNavigationIcon();
        a1 a1VarI = a1.i(toolbar.getContext(), null, AbstractC2327a.f20114a, R.attr.actionBarStyle);
        TypedArray typedArray = (TypedArray) a1VarI.f22480c;
        int i = 15;
        this.f22535o = a1VarI.d(15);
        if (z6) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f22528g = true;
                Toolbar toolbar2 = this.f22522a;
                this.f22529h = text;
                if ((this.f22523b & 8) != 0) {
                    toolbar2.setTitle(text);
                    if (this.f22528g) {
                        R.O.n(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.f22523b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableD = a1VarI.d(20);
            if (drawableD != null) {
                this.f22526e = drawableD;
                d();
            }
            Drawable drawableD2 = a1VarI.d(17);
            if (drawableD2 != null) {
                this.f22525d = drawableD2;
                d();
            }
            if (this.f22527f == null && (drawable = this.f22535o) != null) {
                this.f22527f = drawable;
                Toolbar toolbar3 = this.f22522a;
                if ((this.f22523b & 4) != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f22524c;
                if (view != null && (this.f22523b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f22524c = viewInflate;
                if (viewInflate != null && (this.f22523b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                a(this.f22523b | 16);
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
                toolbar.f4990H.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f5025l = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.f5007b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f5026m = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.f5008c;
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
                this.f22535o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f22523b = i;
        }
        a1VarI.j();
        if (R.string.abc_action_bar_up_description != this.f22534n) {
            this.f22534n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                b(this.f22534n);
            }
        }
        this.f22530j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new h1(this));
    }

    public final void a(int i) {
        View view;
        int i3 = this.f22523b ^ i;
        this.f22523b = i;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i & 4) != 0) {
                    c();
                }
                int i6 = this.f22523b & 4;
                Toolbar toolbar = this.f22522a;
                if (i6 != 0) {
                    Drawable drawable = this.f22527f;
                    if (drawable == null) {
                        drawable = this.f22535o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                d();
            }
            int i7 = i3 & 8;
            Toolbar toolbar2 = this.f22522a;
            if (i7 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.f22529h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f22524c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b(int i) {
        this.f22530j = i == 0 ? null : this.f22522a.getContext().getString(i);
        c();
    }

    public final void c() {
        if ((this.f22523b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f22530j);
            Toolbar toolbar = this.f22522a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f22534n);
            } else {
                toolbar.setNavigationContentDescription(this.f22530j);
            }
        }
    }

    public final void d() {
        Drawable drawable;
        int i = this.f22523b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f22526e) == null) {
            drawable = this.f22525d;
        }
        this.f22522a.setLogo(drawable);
    }
}
