package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.liuzh.deviceinfo.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: i, reason: collision with root package name */
    public static k2 f30751i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f30752a;

    /* renamed from: b, reason: collision with root package name */
    public x.n0 f30753b;

    /* renamed from: c, reason: collision with root package name */
    public x.o0 f30754c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f30755d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f30756e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30757f;
    public va.o g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f30750h = PorterDuff.Mode.SRC_IN;
    public static final i2 j = new i2(6);

    public static synchronized k2 d() {
        try {
            if (f30751i == null) {
                k2 k2Var = new k2();
                f30751i = k2Var;
                j(k2Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f30751i;
    }

    public static synchronized PorterDuffColorFilter h(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        i2 i2Var = j;
        i2Var.getClass();
        int i10 = (31 + i4) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) i2Var.g(Integer.valueOf(mode.hashCode() + i10));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i4, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(k2 k2Var) {
        if (Build.VERSION.SDK_INT < 24) {
            k2Var.a("vector", new j2(3));
            k2Var.a("animated-vector", new j2(2));
            k2Var.a("animated-selector", new j2(1));
            k2Var.a("drawable", new j2(0));
        }
    }

    public final void a(String str, j2 j2Var) {
        if (this.f30753b == null) {
            this.f30753b = new x.n0(0);
        }
        this.f30753b.put(str, j2Var);
    }

    public final synchronized void b(Context context, long j8, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                x.o oVar = (x.o) this.f30755d.get(context);
                if (oVar == null) {
                    oVar = new x.o((Object) null);
                    this.f30755d.put(context, oVar);
                }
                oVar.i(new WeakReference(constantState), j8);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Drawable c(int i4, Context context) throws Resources.NotFoundException {
        if (this.f30756e == null) {
            this.f30756e = new TypedValue();
        }
        TypedValue typedValue = this.f30756e;
        context.getResources().getValue(i4, typedValue, true);
        long j8 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableE = e(context, j8);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableJ = null;
        if (this.g != null) {
            if (i4 == R.drawable.abc_cab_background_top_material) {
                layerDrawableJ = new LayerDrawable(new Drawable[]{f(R.drawable.abc_cab_background_internal_bg, context), f(2131230787, context)});
            } else if (i4 == R.drawable.abc_ratingbar_material) {
                layerDrawableJ = va.o.j(this, context, R.dimen.abc_star_big);
            } else if (i4 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableJ = va.o.j(this, context, R.dimen.abc_star_medium);
            } else if (i4 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableJ = va.o.j(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableJ != null) {
            layerDrawableJ.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j8, layerDrawableJ);
        }
        return layerDrawableJ;
    }

    public final synchronized Drawable e(Context context, long j8) {
        x.o oVar = (x.o) this.f30755d.get(context);
        if (oVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) oVar.e(j8);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            oVar.j(j8);
        }
        return null;
    }

    public final synchronized Drawable f(int i4, Context context) {
        return g(context, i4, false);
    }

    public final synchronized Drawable g(Context context, int i4, boolean z3) {
        Drawable drawableK;
        try {
            if (!this.f30757f) {
                this.f30757f = true;
                Drawable drawableF = f(R.drawable.abc_vector_test, context);
                if (drawableF == null || (!(drawableF instanceof k6.q) && !"android.graphics.drawable.VectorDrawable".equals(drawableF.getClass().getName()))) {
                    this.f30757f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableK = k(i4, context);
            if (drawableK == null) {
                drawableK = c(i4, context);
            }
            if (drawableK == null) {
                drawableK = context.getDrawable(i4);
            }
            if (drawableK != null) {
                drawableK = n(context, i4, z3, drawableK);
            }
            if (drawableK != null) {
                i1.a(drawableK);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableK;
    }

    public final synchronized ColorStateList i(int i4, Context context) {
        ColorStateList colorStateList;
        x.o0 o0Var;
        WeakHashMap weakHashMap = this.f30752a;
        ColorStateList colorStateListK = null;
        colorStateList = (weakHashMap == null || (o0Var = (x.o0) weakHashMap.get(context)) == null) ? null : (ColorStateList) o0Var.d(i4);
        if (colorStateList == null) {
            va.o oVar = this.g;
            if (oVar != null) {
                colorStateListK = oVar.k(i4, context);
            }
            if (colorStateListK != null) {
                if (this.f30752a == null) {
                    this.f30752a = new WeakHashMap();
                }
                x.o0 o0Var2 = (x.o0) this.f30752a.get(context);
                if (o0Var2 == null) {
                    o0Var2 = new x.o0(0);
                    this.f30752a.put(context, o0Var2);
                }
                o0Var2.a(i4, colorStateListK);
            }
            colorStateList = colorStateListK;
        }
        return colorStateList;
    }

    public final Drawable k(int i4, Context context) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        x.n0 n0Var = this.f30753b;
        if (n0Var == null || n0Var.isEmpty()) {
            return null;
        }
        x.o0 o0Var = this.f30754c;
        if (o0Var != null) {
            String str = (String) o0Var.d(i4);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.f30753b.get(str) == null) {
                return null;
            }
        } else {
            this.f30754c = new x.o0(0);
        }
        if (this.f30756e == null) {
            this.f30756e = new TypedValue();
        }
        TypedValue typedValue = this.f30756e;
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        long j8 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableE = e(context, j8);
        if (drawableE != null) {
            return drawableE;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i4);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f30754c.a(i4, name);
                j2 j2Var = (j2) this.f30753b.get(name);
                if (j2Var != null) {
                    drawableE = j2Var.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableE != null) {
                    drawableE.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j8, drawableE);
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (drawableE == null) {
            this.f30754c.a(i4, "appcompat_skip_skip");
        }
        return drawableE;
    }

    public final synchronized void l(Context context) {
        x.o oVar = (x.o) this.f30755d.get(context);
        if (oVar != null) {
            oVar.b();
        }
    }

    public final synchronized void m(va.o oVar) {
        this.g = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable n(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k2.n(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
