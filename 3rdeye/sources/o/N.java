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
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.github.appintro.AppIntroBaseFragmentKt;
import j.C5160a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import k.C5204a;
import m0.C5313f;
import m0.C5314g;
import m0.C5315h;
import m0.C5316i;
import n0.C5346a;
import o.C5390h;
import org.xmlpull.v1.XmlPullParserException;
import z0.C5848a;

/* compiled from: ResourceManagerInternal.java */
/* loaded from: classes.dex */
public final class N {
    public static N i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap<Context, m0.j<ColorStateList>> f44574a;

    /* renamed from: b, reason: collision with root package name */
    public C5316i<String, e> f44575b;

    /* renamed from: c, reason: collision with root package name */
    public m0.j<String> f44576c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap<Context, C5313f<WeakReference<Drawable.ConstantState>>> f44577d = new WeakHashMap<>(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f44578e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f44579f;

    /* renamed from: g, reason: collision with root package name */
    public C5390h.a f44580g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f44572h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    public static final c f44573j = new c(6);

    /* compiled from: ResourceManagerInternal.java */
    public static class a implements e {
        @Override // o.N.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C5160a.g(context, context.getResources(), xmlResourceParser, attributeSet, theme);
            } catch (Exception e4) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e4);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    public static class b implements e {
        @Override // o.N.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                L1.d dVar = new L1.d(context);
                dVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                return dVar;
            } catch (Exception e4) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e4);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    public static class c extends C5315h<Integer, PorterDuffColorFilter> {
    }

    /* compiled from: ResourceManagerInternal.java */
    public static class d implements e {
        @Override // o.N.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    C5204a.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e4) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e4);
                }
            }
            return null;
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    public interface e {
        Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal.java */
    public static class f implements e {
        @Override // o.N.e
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                L1.i iVar = new L1.i();
                iVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                return iVar;
            } catch (Exception e4) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e4);
                return null;
            }
        }
    }

    public static synchronized N d() {
        try {
            if (i == null) {
                N n9 = new N();
                i = n9;
                j(n9);
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        c cVar = f44573j;
        cVar.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilter = cVar.get(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
            cVar.put(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    public static void j(N n9) {
        if (Build.VERSION.SDK_INT < 24) {
            n9.a("vector", new f());
            n9.a("animated-vector", new b());
            n9.a("animated-selector", new a());
            n9.a(AppIntroBaseFragmentKt.ARG_DRAWABLE, new d());
        }
    }

    public final void a(String str, e eVar) {
        if (this.f44575b == null) {
            this.f44575b = new C5316i<>();
        }
        this.f44575b.put(str, eVar);
    }

    public final synchronized void b(Context context, long j4, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C5313f<WeakReference<Drawable.ConstantState>> c5313f = this.f44577d.get(context);
                if (c5313f == null) {
                    c5313f = new C5313f<>();
                    this.f44577d.put(context, c5313f);
                }
                c5313f.i(j4, new WeakReference<>(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i10) throws Resources.NotFoundException {
        if (this.f44578e == null) {
            this.f44578e = new TypedValue();
        }
        TypedValue typedValue = this.f44578e;
        context.getResources().getValue(i10, typedValue, true);
        long j4 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableE = e(context, j4);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableC = null;
        if (this.f44580g != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawableC = new LayerDrawable(new Drawable[]{g(context, R.drawable.abc_cab_background_internal_bg), g(context, com.github.appintro.R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawableC = C5390h.a.c(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableC = C5390h.a.c(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableC = C5390h.a.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableC != null) {
            layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j4, layerDrawableC);
        }
        return layerDrawableC;
    }

    public final synchronized Drawable e(Context context, long j4) {
        C5313f<WeakReference<Drawable.ConstantState>> c5313f = this.f44577d.get(context);
        if (c5313f == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceE = c5313f.e(j4);
        if (weakReferenceE != null) {
            Drawable.ConstantState constantState = weakReferenceE.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB = C5346a.b(c5313f.f44024c, c5313f.f44026e, j4);
            if (iB >= 0) {
                Object[] objArr = c5313f.f44025d;
                Object obj = objArr[iB];
                Object obj2 = C5314g.f44027a;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    c5313f.f44023b = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(int i10, Context context, boolean z10) {
        Drawable drawableK;
        try {
            if (!this.f44579f) {
                this.f44579f = true;
                Drawable drawableG = g(context, R.drawable.abc_vector_test);
                if (drawableG == null || (!(drawableG instanceof L1.i) && !"android.graphics.drawable.VectorDrawable".equals(drawableG.getClass().getName()))) {
                    this.f44579f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableK = k(context, i10);
            if (drawableK == null) {
                drawableK = c(context, i10);
            }
            if (drawableK == null) {
                drawableK = C5848a.getDrawable(context, i10);
            }
            if (drawableK != null) {
                drawableK = n(context, i10, z10, drawableK);
            }
            if (drawableK != null) {
                C5375C.a(drawableK);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableK;
    }

    public final synchronized Drawable g(Context context, int i10) {
        return f(i10, context, false);
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList colorStateListD;
        m0.j<ColorStateList> jVar;
        WeakHashMap<Context, m0.j<ColorStateList>> weakHashMap = this.f44574a;
        ColorStateList colorStateListD2 = null;
        colorStateListD = (weakHashMap == null || (jVar = weakHashMap.get(context)) == null) ? null : jVar.d(i10);
        if (colorStateListD == null) {
            C5390h.a aVar = this.f44580g;
            if (aVar != null) {
                colorStateListD2 = aVar.d(context, i10);
            }
            if (colorStateListD2 != null) {
                if (this.f44574a == null) {
                    this.f44574a = new WeakHashMap<>();
                }
                m0.j<ColorStateList> jVar2 = this.f44574a.get(context);
                if (jVar2 == null) {
                    jVar2 = new m0.j<>();
                    this.f44574a.put(context, jVar2);
                }
                jVar2.a(i10, colorStateListD2);
            }
            colorStateListD = colorStateListD2;
        }
        return colorStateListD;
    }

    public final Drawable k(Context context, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        C5316i<String, e> c5316i = this.f44575b;
        if (c5316i == null || c5316i.isEmpty()) {
            return null;
        }
        m0.j<String> jVar = this.f44576c;
        if (jVar != null) {
            String strD = jVar.d(i10);
            if ("appcompat_skip_skip".equals(strD)) {
                return null;
            }
            if (strD != null && this.f44575b.get(strD) == null) {
                return null;
            }
        } else {
            this.f44576c = new m0.j<>();
        }
        if (this.f44578e == null) {
            this.f44578e = new TypedValue();
        }
        TypedValue typedValue = this.f44578e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long j4 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableE = e(context, j4);
        if (drawableE != null) {
            return drawableE;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
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
                this.f44576c.a(i10, name);
                e eVar = this.f44575b.get(name);
                if (eVar != null) {
                    drawableE = eVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableE != null) {
                    drawableE.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j4, drawableE);
                }
            } catch (Exception e4) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e4);
            }
        }
        if (drawableE == null) {
            this.f44576c.a(i10, "appcompat_skip_skip");
        }
        return drawableE;
    }

    public final synchronized void l(Context context) {
        C5313f<WeakReference<Drawable.ConstantState>> c5313f = this.f44577d.get(context);
        if (c5313f != null) {
            c5313f.b();
        }
    }

    public final synchronized void m(C5390h.a aVar) {
        this.f44580g = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable n(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.N.n(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
