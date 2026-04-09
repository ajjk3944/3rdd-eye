package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: i, reason: collision with root package name */
    private static m0 f1042i;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, k.h<ColorStateList>> f1044a;

    /* renamed from: b, reason: collision with root package name */
    private k.a<String, d> f1045b;

    /* renamed from: c, reason: collision with root package name */
    private k.h<String> f1046c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Context, k.d<WeakReference<Drawable.ConstantState>>> f1047d = new WeakHashMap<>(0);

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f1048e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1049f;

    /* renamed from: g, reason: collision with root package name */
    private e f1050g;

    /* renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f1041h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    private static final c f1043j = new c(6);

    static class a implements d {
        a() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return d.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    private static class b implements d {
        b() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    private static class c extends k.e<Integer, PorterDuffColorFilter> {
        public c(int i2) {
            super(i2);
        }

        private static int h(int i2, PorterDuff.Mode mode) {
            return ((i2 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter i(int i2, PorterDuff.Mode mode) {
            return c(Integer.valueOf(h(i2, mode)));
        }

        PorterDuffColorFilter j(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return d(Integer.valueOf(h(i2, mode)), porterDuffColorFilter);
        }
    }

    private interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    interface e {
        Drawable a(m0 m0Var, Context context, int i2);

        ColorStateList b(Context context, int i2);

        boolean c(Context context, int i2, Drawable drawable);

        boolean d(Context context, int i2, Drawable drawable);

        PorterDuff.Mode e(int i2);
    }

    private static class f implements d {
        f() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.h.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    private void a(String str, d dVar) {
        if (this.f1045b == null) {
            this.f1045b = new k.a<>();
        }
        this.f1045b.put(str, dVar);
    }

    private synchronized boolean b(Context context, long j2, Drawable drawable) {
        boolean z2;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            k.d<WeakReference<Drawable.ConstantState>> dVar = this.f1047d.get(context);
            if (dVar == null) {
                dVar = new k.d<>();
                this.f1047d.put(context, dVar);
            }
            dVar.i(j2, new WeakReference<>(constantState));
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    private void c(Context context, int i2, ColorStateList colorStateList) {
        if (this.f1044a == null) {
            this.f1044a = new WeakHashMap<>();
        }
        k.h<ColorStateList> hVar = this.f1044a.get(context);
        if (hVar == null) {
            hVar = new k.h<>();
            this.f1044a.put(context, hVar);
        }
        hVar.a(i2, colorStateList);
    }

    private void d(Context context) {
        if (this.f1049f) {
            return;
        }
        this.f1049f = true;
        Drawable drawableJ = j(context, e.a.f2522a);
        if (drawableJ == null || !q(drawableJ)) {
            this.f1049f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i2) throws Resources.NotFoundException {
        if (this.f1048e == null) {
            this.f1048e = new TypedValue();
        }
        TypedValue typedValue = this.f1048e;
        context.getResources().getValue(i2, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        e eVar = this.f1050g;
        Drawable drawableA = eVar == null ? null : eVar.a(this, context, i2);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, jE, drawableA);
        }
        return drawableA;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized m0 h() {
        if (f1042i == null) {
            m0 m0Var = new m0();
            f1042i = m0Var;
            p(m0Var);
        }
        return f1042i;
    }

    private synchronized Drawable i(Context context, long j2) {
        k.d<WeakReference<Drawable.ConstantState>> dVar = this.f1047d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceF = dVar.f(j2);
        if (weakReferenceF != null) {
            Drawable.ConstantState constantState = weakReferenceF.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.d(j2);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterI;
        c cVar = f1043j;
        porterDuffColorFilterI = cVar.i(i2, mode);
        if (porterDuffColorFilterI == null) {
            porterDuffColorFilterI = new PorterDuffColorFilter(i2, mode);
            cVar.j(i2, mode, porterDuffColorFilterI);
        }
        return porterDuffColorFilterI;
    }

    private ColorStateList n(Context context, int i2) {
        k.h<ColorStateList> hVar;
        WeakHashMap<Context, k.h<ColorStateList>> weakHashMap = this.f1044a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return hVar.e(i2);
    }

    private static void p(m0 m0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            m0Var.a("vector", new f());
            m0Var.a("animated-vector", new b());
            m0Var.a("animated-selector", new a());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        k.a<String, d> aVar = this.f1045b;
        if (aVar == null || aVar.isEmpty()) {
            return null;
        }
        k.h<String> hVar = this.f1046c;
        if (hVar != null) {
            String strE = hVar.e(i2);
            if ("appcompat_skip_skip".equals(strE) || (strE != null && this.f1045b.get(strE) == null)) {
                return null;
            }
        } else {
            this.f1046c = new k.h<>();
        }
        if (this.f1048e == null) {
            this.f1048e = new TypedValue();
        }
        TypedValue typedValue = this.f1048e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
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
                this.f1046c.a(i2, name);
                d dVar = this.f1045b.get(name);
                if (dVar != null) {
                    drawableI = dVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, jE, drawableI);
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (drawableI == null) {
            this.f1046c.a(i2, "appcompat_skip_skip");
        }
        return drawableI;
    }

    private Drawable v(Context context, int i2, boolean z2, Drawable drawable) {
        ColorStateList colorStateListM = m(context, i2);
        if (colorStateListM == null) {
            e eVar = this.f1050g;
            if ((eVar == null || !eVar.d(context, i2, drawable)) && !x(context, i2, drawable) && z2) {
                return null;
            }
            return drawable;
        }
        if (e0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableP = u.a.p(drawable);
        u.a.n(drawableP, colorStateListM);
        PorterDuff.Mode modeO = o(i2);
        if (modeO == null) {
            return drawableP;
        }
        u.a.o(drawableP, modeO);
        return drawableP;
    }

    static void w(Drawable drawable, u0 u0Var, int[] iArr) {
        if (e0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z2 = u0Var.f1135d;
        if (z2 || u0Var.f1134c) {
            drawable.setColorFilter(g(z2 ? u0Var.f1132a : null, u0Var.f1134c ? u0Var.f1133b : f1041h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i2) {
        return k(context, i2, false);
    }

    synchronized Drawable k(Context context, int i2, boolean z2) {
        Drawable drawableR;
        d(context);
        drawableR = r(context, i2);
        if (drawableR == null) {
            drawableR = f(context, i2);
        }
        if (drawableR == null) {
            drawableR = r.a.c(context, i2);
        }
        if (drawableR != null) {
            drawableR = v(context, i2, z2, drawableR);
        }
        if (drawableR != null) {
            e0.b(drawableR);
        }
        return drawableR;
    }

    synchronized ColorStateList m(Context context, int i2) {
        ColorStateList colorStateListN;
        colorStateListN = n(context, i2);
        if (colorStateListN == null) {
            e eVar = this.f1050g;
            colorStateListN = eVar == null ? null : eVar.b(context, i2);
            if (colorStateListN != null) {
                c(context, i2, colorStateListN);
            }
        }
        return colorStateListN;
    }

    PorterDuff.Mode o(int i2) {
        e eVar = this.f1050g;
        if (eVar == null) {
            return null;
        }
        return eVar.e(i2);
    }

    public synchronized void s(Context context) {
        k.d<WeakReference<Drawable.ConstantState>> dVar = this.f1047d.get(context);
        if (dVar != null) {
            dVar.b();
        }
    }

    synchronized Drawable t(Context context, b1 b1Var, int i2) {
        Drawable drawableR = r(context, i2);
        if (drawableR == null) {
            drawableR = b1Var.c(i2);
        }
        if (drawableR == null) {
            return null;
        }
        return v(context, i2, false, drawableR);
    }

    public synchronized void u(e eVar) {
        this.f1050g = eVar;
    }

    boolean x(Context context, int i2, Drawable drawable) {
        e eVar = this.f1050g;
        return eVar != null && eVar.c(context, i2, drawable);
    }
}
