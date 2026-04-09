package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zp0 {
    public static zp0 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public bu1 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final yp0 h = new yp0(6);

    public static synchronized zp0 b() {
        try {
            if (g == null) {
                g = new zp0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        yp0 yp0Var = h;
        yp0Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) yp0Var.h(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) throws Resources.NotFoundException {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            l80 l80Var = (l80) this.b.get(context);
            drawableNewDrawable = null;
            if (l80Var != null && (weakReference = (WeakReference) l80Var.b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iB = ob1.b(l80Var.g, l80Var.i, j);
                    if (iB >= 0) {
                        Object[] objArr = l80Var.h;
                        Object obj = objArr[iB];
                        Object obj2 = yb.l;
                        if (obj != obj2) {
                            objArr[iB] = obj2;
                            l80Var.f = true;
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableE = null;
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableE = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131230777)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableE = bu1.e(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableE = bu1.e(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableE = bu1.e(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableE == null) {
            return layerDrawableE;
        }
        layerDrawableE.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableE.getConstantState();
                if (constantState2 != null) {
                    l80 l80Var2 = (l80) this.b.get(context);
                    if (l80Var2 == null) {
                        l80Var2 = new l80();
                        this.b.put(context, l80Var2);
                    }
                    l80Var2.e(j, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableE;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z) {
        Drawable drawableA;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof y41) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i);
            if (drawableA == null) {
                drawableA = jj.b(context, i);
            }
            if (drawableA != null) {
                drawableA = g(context, i, z, drawableA);
            }
            if (drawableA != null) {
                yp.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        jx0 jx0Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListF = null;
        colorStateList = (weakHashMap == null || (jx0Var = (jx0) weakHashMap.get(context)) == null) ? null : (ColorStateList) jx0Var.b(i);
        if (colorStateList == null) {
            bu1 bu1Var = this.e;
            if (bu1Var != null) {
                colorStateListF = bu1Var.f(context, i);
            }
            if (colorStateListF != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                jx0 jx0Var2 = (jx0) this.a.get(context);
                if (jx0Var2 == null) {
                    jx0Var2 = new jx0();
                    this.a.put(context, jx0Var2);
                }
                jx0Var2.a(i, colorStateListF);
            }
            colorStateList = colorStateListF;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zp0.g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
