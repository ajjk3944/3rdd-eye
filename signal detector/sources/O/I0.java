package o;

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
import com.apm.insight.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import q2.C2834o;
import u.C2938g;
import u.C2940i;
import u.C2941j;

/* loaded from: classes.dex */
public final class I0 {
    public static I0 i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f22386a;

    /* renamed from: b, reason: collision with root package name */
    public C2940i f22387b;

    /* renamed from: c, reason: collision with root package name */
    public C2941j f22388c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f22389d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f22390e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22391f;

    /* renamed from: g, reason: collision with root package name */
    public C2834o f22392g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f22384h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    public static final G0 f22385j = new G0(6);

    public static synchronized I0 d() {
        try {
            if (i == null) {
                I0 i02 = new I0();
                i = i02;
                j(i02);
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public static synchronized PorterDuffColorFilter h(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        G0 g02 = f22385j;
        g02.getClass();
        int i6 = (31 + i3) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) g02.h(Integer.valueOf(mode.hashCode() + i6));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(I0 i02) {
        if (Build.VERSION.SDK_INT < 24) {
            i02.a("vector", new H0(3));
            i02.a("animated-vector", new H0(2));
            i02.a("animated-selector", new H0(1));
            i02.a("drawable", new H0(0));
        }
    }

    public final void a(String str, H0 h02) {
        if (this.f22387b == null) {
            this.f22387b = new C2940i(0);
        }
        this.f22387b.put(str, h02);
    }

    public final synchronized void b(Context context, long j6, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C2938g c2938g = (C2938g) this.f22389d.get(context);
                if (c2938g == null) {
                    c2938g = new C2938g();
                    this.f22389d.put(context, c2938g);
                }
                c2938g.h(j6, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i3) throws Resources.NotFoundException {
        if (this.f22390e == null) {
            this.f22390e = new TypedValue();
        }
        TypedValue typedValue = this.f22390e;
        context.getResources().getValue(i3, typedValue, true);
        long j6 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableE = e(context, j6);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableD = null;
        if (this.f22392g != null) {
            if (i3 == R.drawable.abc_cab_background_top_material) {
                layerDrawableD = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, 2131230777)});
            } else if (i3 == R.drawable.abc_ratingbar_material) {
                layerDrawableD = C2834o.d(this, context, R.dimen.abc_star_big);
            } else if (i3 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableD = C2834o.d(this, context, R.dimen.abc_star_medium);
            } else if (i3 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableD = C2834o.d(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableD != null) {
            layerDrawableD.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j6, layerDrawableD);
        }
        return layerDrawableD;
    }

    public final synchronized Drawable e(Context context, long j6) {
        C2938g c2938g = (C2938g) this.f22389d.get(context);
        if (c2938g == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c2938g.d(j6);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c2938g.i(j6);
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i3) {
        return g(context, i3, false);
    }

    public final synchronized Drawable g(Context context, int i3, boolean z6) {
        Drawable drawableK;
        try {
            if (!this.f22391f) {
                this.f22391f = true;
                Drawable drawableF = f(context, R.drawable.abc_vector_test);
                if (drawableF == null || (!(drawableF instanceof M0.r) && !"android.graphics.drawable.VectorDrawable".equals(drawableF.getClass().getName()))) {
                    this.f22391f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableK = k(context, i3);
            if (drawableK == null) {
                drawableK = c(context, i3);
            }
            if (drawableK == null) {
                drawableK = context.getDrawable(i3);
            }
            if (drawableK != null) {
                drawableK = n(context, i3, z6, drawableK);
            }
            if (drawableK != null) {
                AbstractC2720j0.a(drawableK);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableK;
    }

    public final synchronized ColorStateList i(Context context, int i3) {
        ColorStateList colorStateList;
        C2941j c2941j;
        WeakHashMap weakHashMap = this.f22386a;
        ColorStateList colorStateListE = null;
        colorStateList = (weakHashMap == null || (c2941j = (C2941j) weakHashMap.get(context)) == null) ? null : (ColorStateList) c2941j.d(i3);
        if (colorStateList == null) {
            C2834o c2834o = this.f22392g;
            if (c2834o != null) {
                colorStateListE = c2834o.e(context, i3);
            }
            if (colorStateListE != null) {
                if (this.f22386a == null) {
                    this.f22386a = new WeakHashMap();
                }
                C2941j c2941j2 = (C2941j) this.f22386a.get(context);
                if (c2941j2 == null) {
                    c2941j2 = new C2941j();
                    this.f22386a.put(context, c2941j2);
                }
                c2941j2.a(i3, colorStateListE);
            }
            colorStateList = colorStateListE;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i3) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        C2940i c2940i = this.f22387b;
        if (c2940i == null || c2940i.isEmpty()) {
            return null;
        }
        C2941j c2941j = this.f22388c;
        if (c2941j != null) {
            String str = (String) c2941j.d(i3);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.f22387b.get(str) == null) {
                return null;
            }
        } else {
            this.f22388c = new C2941j();
        }
        if (this.f22390e == null) {
            this.f22390e = new TypedValue();
        }
        TypedValue typedValue = this.f22390e;
        Resources resources = context.getResources();
        resources.getValue(i3, typedValue, true);
        long j6 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableE = e(context, j6);
        if (drawableE != null) {
            return drawableE;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i3);
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
                this.f22388c.a(i3, name);
                H0 h02 = (H0) this.f22387b.get(name);
                if (h02 != null) {
                    drawableE = h02.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableE != null) {
                    drawableE.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j6, drawableE);
                }
            } catch (Exception e6) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e6);
            }
        }
        if (drawableE == null) {
            this.f22388c.a(i3, "appcompat_skip_skip");
        }
        return drawableE;
    }

    public final synchronized void l(Context context) {
        C2938g c2938g = (C2938g) this.f22389d.get(context);
        if (c2938g != null) {
            c2938g.b();
        }
    }

    public final synchronized void m(C2834o c2834o) {
        this.f22392g = c2834o;
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
        throw new UnsupportedOperationException("Method not decompiled: o.I0.n(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
