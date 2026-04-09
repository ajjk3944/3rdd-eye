package D3;

import I.l;
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
import d3.AbstractC2266a;
import g.AbstractC2327a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f1267a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1268b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1269c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1270d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1271e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1272f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1273g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1274h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1275j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1276k;

    /* renamed from: l, reason: collision with root package name */
    public float f1277l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1278m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1279n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1280o = false;

    /* renamed from: p, reason: collision with root package name */
    public Typeface f1281p;

    public e(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC2327a.f20137y);
        this.f1277l = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f1276k = com.bumptech.glide.c.n(context, typedArrayObtainStyledAttributes, 3);
        com.bumptech.glide.c.n(context, typedArrayObtainStyledAttributes, 4);
        com.bumptech.glide.c.n(context, typedArrayObtainStyledAttributes, 5);
        this.f1270d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f1271e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i3 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f1278m = typedArrayObtainStyledAttributes.getResourceId(i3, 0);
        this.f1268b = typedArrayObtainStyledAttributes.getString(i3);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f1267a = com.bumptech.glide.c.n(context, typedArrayObtainStyledAttributes, 6);
        this.f1272f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f1273g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f1274h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC2266a.f19727E);
        this.i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f1275j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1269c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f1281p;
        int i = this.f1270d;
        if (typeface == null && (str = this.f1268b) != null) {
            this.f1281p = Typeface.create(str, i);
        }
        if (this.f1281p == null) {
            int i3 = this.f1271e;
            if (i3 == 1) {
                this.f1281p = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                this.f1281p = Typeface.SERIF;
            } else if (i3 != 3) {
                this.f1281p = Typeface.DEFAULT;
            } else {
                this.f1281p = Typeface.MONOSPACE;
            }
            this.f1281p = Typeface.create(this.f1281p, i);
        }
    }

    public final void b(Context context, com.bumptech.glide.d dVar) {
        if (!c(context)) {
            a();
        }
        int i = this.f1278m;
        if (i == 0) {
            this.f1279n = true;
        }
        if (this.f1279n) {
            dVar.J(this.f1281p, true);
            return;
        }
        try {
            c cVar = new c(this, dVar);
            ThreadLocal threadLocal = l.f1870a;
            if (context.isRestricted()) {
                cVar.a(-4);
            } else {
                l.b(context, i, new TypedValue(), 0, cVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f1279n = true;
            dVar.I(1);
        } catch (Exception e6) {
            Log.d("TextAppearance", "Error loading font " + this.f1268b, e6);
            this.f1279n = true;
            dVar.I(-3);
        }
    }

    public final boolean c(Context context) throws Resources.NotFoundException {
        Context context2;
        Typeface typefaceB;
        String string;
        Typeface typefaceCreate;
        if (this.f1279n) {
            return true;
        }
        int i = this.f1278m;
        if (i != 0) {
            ThreadLocal threadLocal = l.f1870a;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceB = null;
            } else {
                context2 = context;
                typefaceB = l.b(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (typefaceB != null) {
                this.f1281p = typefaceB;
                this.f1279n = true;
                return true;
            }
            if (!this.f1280o) {
                this.f1280o = true;
                Resources resources = context2.getResources();
                int i3 = this.f1278m;
                if (i3 == 0 || !resources.getResourceTypeName(i3).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f1270d);
                    }
                } else {
                    try {
                        XmlResourceParser xml = resources.getXml(i3);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), F.a.f1425b);
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
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f1270d);
                    }
                }
            }
            if (typefaceCreate2 != null) {
                this.f1281p = typefaceCreate2;
                this.f1279n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, com.bumptech.glide.d dVar) {
        e(context, textPaint, dVar);
        ColorStateList colorStateList = this.f1276k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f1267a;
        textPaint.setShadowLayer(this.f1274h, this.f1272f, this.f1273g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, com.bumptech.glide.d dVar) {
        Typeface typeface;
        if (c(context) && this.f1279n && (typeface = this.f1281p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f1281p);
        b(context, new d(this, context, textPaint, dVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceU = com.bumptech.glide.e.u(context.getResources().getConfiguration(), typeface);
        if (typefaceU != null) {
            typeface = typefaceU;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f1270d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1277l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f1269c);
        }
        if (this.i) {
            textPaint.setLetterSpacing(this.f1275j);
        }
    }
}
