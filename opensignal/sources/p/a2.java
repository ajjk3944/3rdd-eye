package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: g, reason: collision with root package name */
    public static a2 f20021g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f20023a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f20024b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f20025c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20026d;

    /* renamed from: e, reason: collision with root package name */
    public h9.r2 f20027e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f20020f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final z1 f20022h = new z1(6);

    public static synchronized a2 b() {
        try {
            if (f20021g == null) {
                f20021g = new a2();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f20021g;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        z1 z1Var = f20022h;
        z1Var.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) z1Var.h(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i10) throws Resources.NotFoundException {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f20025c == null) {
            this.f20025c = new TypedValue();
        }
        TypedValue typedValue = this.f20025c;
        context.getResources().getValue(i10, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            u.o oVar = (u.o) this.f20024b.get(context);
            drawableNewDrawable = null;
            if (oVar != null && (weakReference = (WeakReference) oVar.b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    oVar.f(j);
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableP0 = null;
        if (this.f20027e != null) {
            if (i10 == h.e.abc_cab_background_top_material) {
                layerDrawableP0 = new LayerDrawable(new Drawable[]{c(context, h.e.abc_cab_background_internal_bg), c(context, h.e.abc_cab_background_top_mtrl_alpha)});
            } else if (i10 == h.e.abc_ratingbar_material) {
                layerDrawableP0 = h9.r2.p0(this, context, h.d.abc_star_big);
            } else if (i10 == h.e.abc_ratingbar_indicator_material) {
                layerDrawableP0 = h9.r2.p0(this, context, h.d.abc_star_medium);
            } else if (i10 == h.e.abc_ratingbar_small_material) {
                layerDrawableP0 = h9.r2.p0(this, context, h.d.abc_star_small);
            }
        }
        if (layerDrawableP0 == null) {
            return layerDrawableP0;
        }
        layerDrawableP0.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableP0.getConstantState();
                if (constantState2 != null) {
                    u.o oVar2 = (u.o) this.f20024b.get(context);
                    if (oVar2 == null) {
                        oVar2 = new u.o((Object) null);
                        this.f20024b.put(context, oVar2);
                    }
                    oVar2.e(new WeakReference(constantState2), j);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return layerDrawableP0;
    }

    public final synchronized Drawable c(Context context, int i10) {
        return d(context, i10, false);
    }

    public final synchronized Drawable d(Context context, int i10, boolean z10) {
        Drawable drawableA;
        try {
            if (!this.f20026d) {
                this.f20026d = true;
                Drawable drawableC = c(context, l.a.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof u7.p) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f20026d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i10);
            if (drawableA == null) {
                drawableA = context.getDrawable(i10);
            }
            if (drawableA != null) {
                drawableA = g(context, i10, z10, drawableA);
            }
            if (drawableA != null) {
                c1.a(drawableA);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i10) {
        ColorStateList colorStateList;
        u.j0 j0Var;
        WeakHashMap weakHashMap = this.f20023a;
        ColorStateList colorStateListX0 = null;
        colorStateList = (weakHashMap == null || (j0Var = (u.j0) weakHashMap.get(context)) == null) ? null : (ColorStateList) j0Var.c(i10);
        if (colorStateList == null) {
            h9.r2 r2Var = this.f20027e;
            if (r2Var != null) {
                colorStateListX0 = r2Var.x0(context, i10);
            }
            if (colorStateListX0 != null) {
                if (this.f20023a == null) {
                    this.f20023a = new WeakHashMap();
                }
                u.j0 j0Var2 = (u.j0) this.f20023a.get(context);
                if (j0Var2 == null) {
                    j0Var2 = new u.j0(0);
                    this.f20023a.put(context, j0Var2);
                }
                j0Var2.a(i10, colorStateListX0);
            }
            colorStateList = colorStateListX0;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a2.g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
