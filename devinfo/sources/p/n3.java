package p;

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
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n3 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f30779a;

    /* renamed from: b, reason: collision with root package name */
    public int f30780b;

    /* renamed from: c, reason: collision with root package name */
    public final View f30781c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f30782d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f30783e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f30784f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f30785h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f30786i;
    public final CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f30787k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f30788l;

    /* renamed from: m, reason: collision with root package name */
    public k f30789m;

    /* renamed from: n, reason: collision with root package name */
    public final int f30790n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f30791o;

    public n3(Toolbar toolbar, boolean z3) {
        Drawable drawable;
        this.f30790n = 0;
        this.f30779a = toolbar;
        this.f30785h = toolbar.getTitle();
        this.f30786i = toolbar.getSubtitle();
        this.g = this.f30785h != null;
        this.f30784f = toolbar.getNavigationIcon();
        i0.f fVarJ = i0.f.J(toolbar.getContext(), null, h.a.f24776a, R.attr.actionBarStyle);
        TypedArray typedArray = (TypedArray) fVarJ.f25417c;
        int i4 = 15;
        this.f30791o = fVarJ.A(15);
        if (z3) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.g = true;
                this.f30785h = text;
                if ((this.f30780b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.g) {
                        e4.v0.p(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f30786i = text2;
                if ((this.f30780b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableA = fVarJ.A(20);
            if (drawableA != null) {
                this.f30783e = drawableA;
                c();
            }
            Drawable drawableA2 = fVarJ.A(17);
            if (drawableA2 != null) {
                this.f30782d = drawableA2;
                c();
            }
            if (this.f30784f == null && (drawable = this.f30791o) != null) {
                this.f30784f = drawable;
                if ((this.f30780b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f30781c;
                if (view != null && (this.f30780b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f30781c = viewInflate;
                if (viewInflate != null && (this.f30780b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                a(this.f30780b | 16);
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
                toolbar.f835t.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f827l = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.f819b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f828m = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.f820c;
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
                this.f30791o = toolbar.getNavigationIcon();
            } else {
                i4 = 11;
            }
            this.f30780b = i4;
        }
        fVarJ.M();
        if (R.string.abc_action_bar_up_description != this.f30790n) {
            this.f30790n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i10 = this.f30790n;
                this.j = i10 != 0 ? toolbar.getContext().getString(i10) : null;
                b();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new m3(this));
    }

    public final void a(int i4) {
        View view;
        int i10 = this.f30780b ^ i4;
        this.f30780b = i4;
        if (i10 != 0) {
            int i11 = i10 & 4;
            Toolbar toolbar = this.f30779a;
            if (i11 != 0) {
                if ((i4 & 4) != 0) {
                    b();
                }
                if ((this.f30780b & 4) != 0) {
                    Drawable drawable = this.f30784f;
                    if (drawable == null) {
                        drawable = this.f30791o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                c();
            }
            if ((i10 & 8) != 0) {
                if ((i4 & 8) != 0) {
                    toolbar.setTitle(this.f30785h);
                    toolbar.setSubtitle(this.f30786i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) == 0 || (view = this.f30781c) == null) {
                return;
            }
            if ((i4 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f30780b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.f30779a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f30790n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i4 = this.f30780b;
        if ((i4 & 2) == 0) {
            drawable = null;
        } else if ((i4 & 1) == 0 || (drawable = this.f30783e) == null) {
            drawable = this.f30782d;
        }
        this.f30779a.setLogo(drawable);
    }
}
