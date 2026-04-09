package androidx.appcompat.widget;

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
import androidx.core.content.ContextCompat;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: i, reason: collision with root package name */
    public static q0 f1293i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f1295a;

    /* renamed from: b, reason: collision with root package name */
    public r.k f1296b;

    /* renamed from: c, reason: collision with root package name */
    public r.l f1297c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f1298d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f1299e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1300f;

    /* renamed from: g, reason: collision with root package name */
    public f f1301g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f1292h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    public static final c f1294j = new c(6);

    public static class a implements e {
        @Override // androidx.appcompat.widget.q0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return e.a.l(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    public static class b implements e {
        @Override // androidx.appcompat.widget.q0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return z1.c.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    public static class c extends r.j {
        public c(int i10) {
            super(i10);
        }

        public static int b(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(b(i10, mode)));
        }

        public PorterDuffColorFilter d(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(b(i10, mode)), porterDuffColorFilter);
        }
    }

    public static class d implements e {
        @Override // androidx.appcompat.widget.q0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    f.a.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                }
            }
            return null;
        }
    }

    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface f {
        Drawable a(q0 q0Var, Context context, int i10);

        ColorStateList b(Context context, int i10);

        boolean c(Context context, int i10, Drawable drawable);

        PorterDuff.Mode d(int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    public static class g implements e {
        @Override // androidx.appcompat.widget.q0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return z1.h.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    public static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    public static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized q0 h() {
        try {
            if (f1293i == null) {
                q0 q0Var = new q0();
                f1293i = q0Var;
                p(q0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1293i;
    }

    public static synchronized PorterDuffColorFilter l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterC;
        c cVar = f1294j;
        porterDuffColorFilterC = cVar.c(i10, mode);
        if (porterDuffColorFilterC == null) {
            porterDuffColorFilterC = new PorterDuffColorFilter(i10, mode);
            cVar.d(i10, mode, porterDuffColorFilterC);
        }
        return porterDuffColorFilterC;
    }

    public static void p(q0 q0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            q0Var.a("vector", new g());
            q0Var.a("animated-vector", new b());
            q0Var.a("animated-selector", new a());
            q0Var.a("drawable", new d());
        }
    }

    public static boolean q(Drawable drawable) {
        return (drawable instanceof z1.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void w(Drawable drawable, x0 x0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = x0Var.f1385d;
        if (z10 || x0Var.f1384c) {
            drawable.setColorFilter(g(z10 ? x0Var.f1382a : null, x0Var.f1384c ? x0Var.f1383b : f1292h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final void a(String str, e eVar) {
        if (this.f1296b == null) {
            this.f1296b = new r.k();
        }
        this.f1296b.put(str, eVar);
    }

    public final synchronized boolean b(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            r.h hVar = (r.h) this.f1298d.get(context);
            if (hVar == null) {
                hVar = new r.h();
                this.f1298d.put(context, hVar);
            }
            hVar.h(j10, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Context context, int i10, ColorStateList colorStateList) {
        if (this.f1295a == null) {
            this.f1295a = new WeakHashMap();
        }
        r.l lVar = (r.l) this.f1295a.get(context);
        if (lVar == null) {
            lVar = new r.l();
            this.f1295a.put(context, lVar);
        }
        lVar.a(i10, colorStateList);
    }

    public final void d(Context context) {
        if (this.f1300f) {
            return;
        }
        this.f1300f = true;
        Drawable drawableJ = j(context, f.b.abc_vector_test);
        if (drawableJ == null || !q(drawableJ)) {
            this.f1300f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable f(Context context, int i10) throws Resources.NotFoundException {
        if (this.f1299e == null) {
            this.f1299e = new TypedValue();
        }
        TypedValue typedValue = this.f1299e;
        context.getResources().getValue(i10, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        f fVar = this.f1301g;
        Drawable drawableA = fVar == null ? null : fVar.a(this, context, i10);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, jE, drawableA);
        }
        return drawableA;
    }

    public final synchronized Drawable i(Context context, long j10) {
        r.h hVar = (r.h) this.f1298d.get(context);
        if (hVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) hVar.d(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            hVar.i(j10);
        }
        return null;
    }

    public synchronized Drawable j(Context context, int i10) {
        return k(context, i10, false);
    }

    public synchronized Drawable k(Context context, int i10, boolean z10) {
        Drawable drawableR;
        try {
            d(context);
            drawableR = r(context, i10);
            if (drawableR == null) {
                drawableR = f(context, i10);
            }
            if (drawableR == null) {
                drawableR = ContextCompat.getDrawable(context, i10);
            }
            if (drawableR != null) {
                drawableR = v(context, i10, z10, drawableR);
            }
            if (drawableR != null) {
                j0.b(drawableR);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableR;
    }

    public synchronized ColorStateList m(Context context, int i10) {
        ColorStateList colorStateListN;
        colorStateListN = n(context, i10);
        if (colorStateListN == null) {
            f fVar = this.f1301g;
            colorStateListN = fVar == null ? null : fVar.b(context, i10);
            if (colorStateListN != null) {
                c(context, i10, colorStateListN);
            }
        }
        return colorStateListN;
    }

    public final ColorStateList n(Context context, int i10) {
        r.l lVar;
        WeakHashMap weakHashMap = this.f1295a;
        if (weakHashMap == null || (lVar = (r.l) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) lVar.d(i10);
    }

    public PorterDuff.Mode o(int i10) {
        f fVar = this.f1301g;
        if (fVar == null) {
            return null;
        }
        return fVar.d(i10);
    }

    public final Drawable r(Context context, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        r.k kVar = this.f1296b;
        if (kVar == null || kVar.isEmpty()) {
            return null;
        }
        r.l lVar = this.f1297c;
        if (lVar != null) {
            String str = (String) lVar.d(i10);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f1296b.get(str) == null)) {
                return null;
            }
        } else {
            this.f1297c = new r.l();
        }
        if (this.f1299e == null) {
            this.f1299e = new TypedValue();
        }
        TypedValue typedValue = this.f1299e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
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
                this.f1297c.a(i10, name);
                e eVar = (e) this.f1296b.get(name);
                if (eVar != null) {
                    drawableI = eVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, jE, drawableI);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (drawableI == null) {
            this.f1297c.a(i10, "appcompat_skip_skip");
        }
        return drawableI;
    }

    public synchronized void s(Context context) {
        r.h hVar = (r.h) this.f1298d.get(context);
        if (hVar != null) {
            hVar.b();
        }
    }

    public synchronized Drawable t(Context context, j1 j1Var, int i10) {
        try {
            Drawable drawableR = r(context, i10);
            if (drawableR == null) {
                drawableR = j1Var.a(i10);
            }
            if (drawableR == null) {
                return null;
            }
            return v(context, i10, false, drawableR);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void u(f fVar) {
        this.f1301g = fVar;
    }

    public final Drawable v(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList colorStateListM = m(context, i10);
        if (colorStateListM != null) {
            Drawable drawableR = k0.a.r(drawable.mutate());
            k0.a.o(drawableR, colorStateListM);
            PorterDuff.Mode modeO = o(i10);
            if (modeO != null) {
                k0.a.p(drawableR, modeO);
            }
            return drawableR;
        }
        f fVar = this.f1301g;
        if ((fVar == null || !fVar.e(context, i10, drawable)) && !x(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    public boolean x(Context context, int i10, Drawable drawable) {
        f fVar = this.f1301g;
        return fVar != null && fVar.c(context, i10, drawable);
    }
}
