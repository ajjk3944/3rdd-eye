package bd;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import me.t1;
import u3.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f2126a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2127b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2128c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2129d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2130e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2131f;
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2132h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2133i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f2134k;

    /* renamed from: l, reason: collision with root package name */
    public float f2135l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2136m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2137n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2138o = false;

    /* renamed from: p, reason: collision with root package name */
    public Typeface f2139p;

    public d(Context context, int i4) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i4, h.a.f24797x);
        this.f2135l = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f2134k = jm.a.j(context, typedArrayObtainStyledAttributes, 3);
        jm.a.j(context, typedArrayObtainStyledAttributes, 4);
        jm.a.j(context, typedArrayObtainStyledAttributes, 5);
        this.f2129d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f2130e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i10 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f2136m = typedArrayObtainStyledAttributes.getResourceId(i10, 0);
        this.f2127b = typedArrayObtainStyledAttributes.getString(i10);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f2126a = jm.a.j(context, typedArrayObtainStyledAttributes, 6);
        this.f2131f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f2132h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i4, ic.a.f25965z);
        this.f2133i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2128c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f2139p;
        int i4 = this.f2129d;
        if (typeface == null && (str = this.f2127b) != null) {
            this.f2139p = Typeface.create(str, i4);
        }
        if (this.f2139p == null) {
            int i10 = this.f2130e;
            if (i10 == 1) {
                this.f2139p = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f2139p = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f2139p = Typeface.DEFAULT;
            } else {
                this.f2139p = Typeface.MONOSPACE;
            }
            this.f2139p = Typeface.create(this.f2139p, i4);
        }
    }

    public final void b(Context context, t1 t1Var) {
        if (!c(context)) {
            a();
        }
        int i4 = this.f2136m;
        if (i4 == 0) {
            this.f2137n = true;
        }
        if (this.f2137n) {
            t1Var.x(this.f2139p, true);
            return;
        }
        try {
            b bVar = new b(this, t1Var);
            ThreadLocal threadLocal = k.f35091a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                k.b(context, i4, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f2137n = true;
            t1Var.w(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f2127b, e2);
            this.f2137n = true;
            t1Var.w(-3);
        }
    }

    public final boolean c(Context context) throws Exception {
        Context context2;
        Typeface typefaceB;
        String string;
        Typeface typefaceCreate;
        if (this.f2137n) {
            return true;
        }
        int i4 = this.f2136m;
        if (i4 != 0) {
            ThreadLocal threadLocal = k.f35091a;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceB = null;
            } else {
                context2 = context;
                typefaceB = k.b(context2, i4, new TypedValue(), 0, null, false, true);
            }
            if (typefaceB != null) {
                this.f2139p = typefaceB;
                this.f2137n = true;
                return true;
            }
            if (!this.f2138o) {
                this.f2138o = true;
                Resources resources = context2.getResources();
                int i10 = this.f2136m;
                if (i10 == 0 || !resources.getResourceTypeName(i10).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f2129d);
                    }
                } else {
                    try {
                        XmlResourceParser xml = resources.getXml(i10);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), q3.a.f32175b);
                                string = typedArrayObtainAttributes.getString(7);
                                typedArrayObtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f2129d);
                    }
                }
            }
            if (typefaceCreate2 != null) {
                this.f2139p = typefaceCreate2;
                this.f2137n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, t1 t1Var) {
        e(context, textPaint, t1Var);
        ColorStateList colorStateList = this.f2134k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f2126a;
        textPaint.setShadowLayer(this.f2132h, this.f2131f, this.g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, t1 t1Var) {
        Typeface typeface;
        if (c(context) && this.f2137n && (typeface = this.f2139p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f2139p);
        b(context, new c(this, context, textPaint, t1Var));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceC = e.c(context.getResources().getConfiguration(), typeface);
        if (typefaceC != null) {
            typeface = typefaceC;
        }
        textPaint.setTypeface(typeface);
        int i4 = (~typeface.getStyle()) & this.f2129d;
        textPaint.setFakeBoldText((i4 & 1) != 0);
        textPaint.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f2135l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f2128c);
        }
        if (this.f2133i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
