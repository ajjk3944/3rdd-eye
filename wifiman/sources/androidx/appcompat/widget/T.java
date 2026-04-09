package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import k.AbstractC6352a;
import o.C7028t;
import o.C7030v;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t1.AbstractC8021a;
import x1.AbstractC8416a;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: i, reason: collision with root package name */
    private static T f27217i;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap f27219a;

    /* renamed from: b, reason: collision with root package name */
    private o.V f27220b;

    /* renamed from: c, reason: collision with root package name */
    private o.W f27221c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap f27222d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f27223e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f27224f;

    /* renamed from: g, reason: collision with root package name */
    private c f27225g;

    /* renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f27216h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    private static final a f27218j = new a(6);

    private static class a extends C7030v {
        public a(int i10) {
            super(i10);
        }

        private static int j(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(j(i10, mode)));
        }

        PorterDuffColorFilter l(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(j(i10, mode)), porterDuffColorFilter);
        }
    }

    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        boolean a(Context context, int i10, Drawable drawable);

        PorterDuff.Mode b(int i10);

        Drawable c(T t10, Context context, int i10);

        ColorStateList d(Context context, int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C7028t c7028t = (C7028t) this.f27222d.get(context);
            if (c7028t == null) {
                c7028t = new C7028t();
                this.f27222d.put(context, c7028t);
            }
            c7028t.k(j10, new WeakReference(constantState));
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void b(Context context, int i10, ColorStateList colorStateList) {
        if (this.f27219a == null) {
            this.f27219a = new WeakHashMap();
        }
        o.W w10 = (o.W) this.f27219a.get(context);
        if (w10 == null) {
            w10 = new o.W();
            this.f27219a.put(context, w10);
        }
        w10.b(i10, colorStateList);
    }

    private void c(Context context) {
        if (this.f27224f) {
            return;
        }
        this.f27224f = true;
        Drawable drawableI = i(context, AbstractC6352a.f51003a);
        if (drawableI == null || !p(drawableI)) {
            this.f27224f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable e(Context context, int i10) throws Resources.NotFoundException {
        if (this.f27223e == null) {
            this.f27223e = new TypedValue();
        }
        TypedValue typedValue = this.f27223e;
        context.getResources().getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.f27225g;
        Drawable drawableC = cVar == null ? null : cVar.c(this, context, i10);
        if (drawableC != null) {
            drawableC.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableC);
        }
        return drawableC;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized T g() {
        try {
            if (f27217i == null) {
                T t10 = new T();
                f27217i = t10;
                o(t10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f27217i;
    }

    private synchronized Drawable h(Context context, long j10) {
        C7028t c7028t = (C7028t) this.f27222d.get(context);
        if (c7028t == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c7028t.e(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c7028t.m(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterK;
        a aVar = f27218j;
        porterDuffColorFilterK = aVar.k(i10, mode);
        if (porterDuffColorFilterK == null) {
            porterDuffColorFilterK = new PorterDuffColorFilter(i10, mode);
            aVar.l(i10, mode, porterDuffColorFilterK);
        }
        return porterDuffColorFilterK;
    }

    private ColorStateList m(Context context, int i10) {
        o.W w10;
        WeakHashMap weakHashMap = this.f27219a;
        if (weakHashMap == null || (w10 = (o.W) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) w10.f(i10);
    }

    private static void o(T t10) {
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.f) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable q(Context context, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        o.V v10 = this.f27220b;
        if (v10 == null || v10.isEmpty()) {
            return null;
        }
        o.W w10 = this.f27221c;
        if (w10 != null) {
            String str = (String) w10.f(i10);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f27220b.get(str) == null)) {
                return null;
            }
        } else {
            this.f27221c = new o.W();
        }
        if (this.f27223e == null) {
            this.f27223e = new TypedValue();
        }
        TypedValue typedValue = this.f27223e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
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
                this.f27221c.b(i10, name);
                b bVar = (b) this.f27220b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (drawableH == null) {
            this.f27221c.b(i10, "appcompat_skip_skip");
        }
        return drawableH;
    }

    private Drawable u(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i10);
        if (colorStateListL != null) {
            Drawable drawableR = AbstractC8416a.r(drawable.mutate());
            AbstractC8416a.o(drawableR, colorStateListL);
            PorterDuff.Mode modeN = n(i10);
            if (modeN == null) {
                return drawableR;
            }
            AbstractC8416a.p(drawableR, modeN);
            return drawableR;
        }
        c cVar = this.f27225g;
        if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    static void v(Drawable drawable, Z z10, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z11 = z10.f27311d;
        if (z11 || z10.f27310c) {
            drawable.setColorFilter(f(z11 ? z10.f27308a : null, z10.f27310c ? z10.f27309b : f27216h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public synchronized Drawable i(Context context, int i10) {
        return j(context, i10, false);
    }

    synchronized Drawable j(Context context, int i10, boolean z10) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = e(context, i10);
            }
            if (drawableQ == null) {
                drawableQ = AbstractC8021a.e(context, i10);
            }
            if (drawableQ != null) {
                drawableQ = u(context, i10, z10, drawableQ);
            }
            if (drawableQ != null) {
                K.b(drawableQ);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableQ;
    }

    synchronized ColorStateList l(Context context, int i10) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i10);
        if (colorStateListM == null) {
            c cVar = this.f27225g;
            colorStateListM = cVar == null ? null : cVar.d(context, i10);
            if (colorStateListM != null) {
                b(context, i10, colorStateListM);
            }
        }
        return colorStateListM;
    }

    PorterDuff.Mode n(int i10) {
        c cVar = this.f27225g;
        if (cVar == null) {
            return null;
        }
        return cVar.b(i10);
    }

    public synchronized void r(Context context) {
        C7028t c7028t = (C7028t) this.f27222d.get(context);
        if (c7028t != null) {
            c7028t.b();
        }
    }

    synchronized Drawable s(Context context, h0 h0Var, int i10) {
        try {
            Drawable drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = h0Var.a(i10);
            }
            if (drawableQ == null) {
                return null;
            }
            return u(context, i10, false, drawableQ);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void t(c cVar) {
        this.f27225g = cVar;
    }

    boolean w(Context context, int i10, Drawable drawable) {
        c cVar = this.f27225g;
        return cVar != null && cVar.a(context, i10, drawable);
    }
}
