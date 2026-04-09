package be;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.TypedValue;
import android.util.Xml;
import ba.m;
import h.j;
import j3.k;
import xu.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f2680a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2681b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2682c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2683d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2684e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2685f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2686g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2687h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2688i;
    public final float j;
    public final ColorStateList k;

    /* renamed from: l, reason: collision with root package name */
    public float f2689l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2690m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2691n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2692o = false;

    /* renamed from: p, reason: collision with root package name */
    public Typeface f2693p;

    public d(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, j.TextAppearance);
        this.f2689l = typedArrayObtainStyledAttributes.getDimension(j.TextAppearance_android_textSize, 0.0f);
        this.k = l.q(context, typedArrayObtainStyledAttributes, j.TextAppearance_android_textColor);
        l.q(context, typedArrayObtainStyledAttributes, j.TextAppearance_android_textColorHint);
        l.q(context, typedArrayObtainStyledAttributes, j.TextAppearance_android_textColorLink);
        this.f2683d = typedArrayObtainStyledAttributes.getInt(j.TextAppearance_android_textStyle, 0);
        this.f2684e = typedArrayObtainStyledAttributes.getInt(j.TextAppearance_android_typeface, 1);
        int i11 = j.TextAppearance_fontFamily;
        i11 = typedArrayObtainStyledAttributes.hasValue(i11) ? i11 : j.TextAppearance_android_fontFamily;
        this.f2690m = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
        this.f2681b = typedArrayObtainStyledAttributes.getString(i11);
        typedArrayObtainStyledAttributes.getBoolean(j.TextAppearance_textAllCaps, false);
        this.f2680a = l.q(context, typedArrayObtainStyledAttributes, j.TextAppearance_android_shadowColor);
        this.f2685f = typedArrayObtainStyledAttributes.getFloat(j.TextAppearance_android_shadowDx, 0.0f);
        this.f2686g = typedArrayObtainStyledAttributes.getFloat(j.TextAppearance_android_shadowDy, 0.0f);
        this.f2687h = typedArrayObtainStyledAttributes.getFloat(j.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, ed.l.MaterialTextAppearance);
        this.f2688i = typedArrayObtainStyledAttributes2.hasValue(ed.l.MaterialTextAppearance_android_letterSpacing);
        this.j = typedArrayObtainStyledAttributes2.getFloat(ed.l.MaterialTextAppearance_android_letterSpacing, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            int i12 = ed.l.MaterialTextAppearance_fontVariationSettings;
            this.f2682c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(i12) ? i12 : ed.l.MaterialTextAppearance_android_fontVariationSettings);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f2693p;
        int i10 = this.f2683d;
        if (typeface == null && (str = this.f2681b) != null) {
            this.f2693p = Typeface.create(str, i10);
        }
        if (this.f2693p == null) {
            int i11 = this.f2684e;
            if (i11 == 1) {
                this.f2693p = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                this.f2693p = Typeface.SERIF;
            } else if (i11 != 3) {
                this.f2693p = Typeface.DEFAULT;
            } else {
                this.f2693p = Typeface.MONOSPACE;
            }
            this.f2693p = Typeface.create(this.f2693p, i10);
        }
    }

    public final void b(Context context, a.a aVar) {
        if (!c(context)) {
            a();
        }
        int i10 = this.f2690m;
        if (i10 == 0) {
            this.f2691n = true;
        }
        if (this.f2691n) {
            aVar.z(this.f2693p, true);
            return;
        }
        try {
            b bVar = new b(this, aVar);
            ThreadLocal threadLocal = k.f13193a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                k.b(context, i10, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f2691n = true;
            aVar.y(1);
        } catch (Exception unused2) {
            this.f2691n = true;
            aVar.y(-3);
        }
    }

    public final boolean c(Context context) throws InterruptedException, Resources.NotFoundException {
        Context context2;
        Typeface typefaceB;
        String string;
        Typeface typefaceCreate;
        if (this.f2691n) {
            return true;
        }
        int i10 = this.f2690m;
        if (i10 != 0) {
            ThreadLocal threadLocal = k.f13193a;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceB = null;
            } else {
                context2 = context;
                typefaceB = k.b(context2, i10, new TypedValue(), 0, null, false, true);
            }
            if (typefaceB != null) {
                this.f2693p = typefaceB;
                this.f2691n = true;
                return true;
            }
            if (!this.f2692o) {
                this.f2692o = true;
                Resources resources = context2.getResources();
                int i11 = this.f2690m;
                if (i11 == 0 || !resources.getResourceTypeName(i11).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f2683d);
                    }
                } else {
                    try {
                        XmlResourceParser xml = resources.getXml(i11);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), f3.d.FontFamily);
                                string = typedArrayObtainAttributes.getString(f3.d.FontFamily_fontProviderSystemFontFamily);
                                typedArrayObtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f2683d);
                    }
                }
            }
            if (typefaceCreate2 != null) {
                this.f2693p = typefaceCreate2;
                this.f2691n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, a.a aVar) {
        e(context, textPaint, aVar);
        ColorStateList colorStateList = this.k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f2680a;
        textPaint.setShadowLayer(this.f2687h, this.f2685f, this.f2686g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, a.a aVar) {
        Typeface typeface;
        if (c(context) && this.f2691n && (typeface = this.f2693p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f2693p);
        b(context, new c(this, context, textPaint, aVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceE = m.E(context.getResources().getConfiguration(), typeface);
        if (typefaceE != null) {
            typeface = typefaceE;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f2683d;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f2689l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f2682c);
        }
        if (this.f2688i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
