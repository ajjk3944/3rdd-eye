package d5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.a;
import j4.l;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f20764a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f20765b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f20766c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20767d;

    /* renamed from: e, reason: collision with root package name */
    public String f20768e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20769f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20770g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20771h;

    /* renamed from: i, reason: collision with root package name */
    public final float f20772i;

    /* renamed from: j, reason: collision with root package name */
    public final float f20773j;

    /* renamed from: k, reason: collision with root package name */
    public final float f20774k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f20775l;

    /* renamed from: m, reason: collision with root package name */
    public final float f20776m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f20777n;

    /* renamed from: o, reason: collision with root package name */
    public float f20778o;

    /* renamed from: p, reason: collision with root package name */
    public final int f20779p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20780q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20781r = false;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f20782s;

    public class a extends a.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f20783a;

        public a(g gVar) {
            this.f20783a = gVar;
        }

        @Override // androidx.core.content.res.a.e
        public void f(int i10) {
            e.this.f20780q = true;
            this.f20783a.a(i10);
        }

        @Override // androidx.core.content.res.a.e
        public void g(Typeface typeface) {
            e eVar = e.this;
            eVar.f20782s = Typeface.create(typeface, eVar.f20769f);
            e.this.f20780q = true;
            this.f20783a.b(e.this.f20782s, false);
        }
    }

    public class b extends g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f20785a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextPaint f20786b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f20787c;

        public b(Context context, TextPaint textPaint, g gVar) {
            this.f20785a = context;
            this.f20786b = textPaint;
            this.f20787c = gVar;
        }

        @Override // d5.g
        public void a(int i10) {
            this.f20787c.a(i10);
        }

        @Override // d5.g
        public void b(Typeface typeface, boolean z10) {
            e.this.r(this.f20785a, this.f20786b, typeface);
            this.f20787c.b(typeface, z10);
        }
    }

    public e(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, c.j.TextAppearance);
        o(typedArrayObtainStyledAttributes.getDimension(c.j.TextAppearance_android_textSize, 0.0f));
        n(c.a(context, typedArrayObtainStyledAttributes, c.j.TextAppearance_android_textColor));
        this.f20764a = c.a(context, typedArrayObtainStyledAttributes, c.j.TextAppearance_android_textColorHint);
        this.f20765b = c.a(context, typedArrayObtainStyledAttributes, c.j.TextAppearance_android_textColorLink);
        this.f20769f = typedArrayObtainStyledAttributes.getInt(c.j.TextAppearance_android_textStyle, 0);
        this.f20770g = typedArrayObtainStyledAttributes.getInt(c.j.TextAppearance_android_typeface, 1);
        int iF = c.f(typedArrayObtainStyledAttributes, c.j.TextAppearance_fontFamily, c.j.TextAppearance_android_fontFamily);
        this.f20779p = typedArrayObtainStyledAttributes.getResourceId(iF, 0);
        this.f20767d = typedArrayObtainStyledAttributes.getString(iF);
        this.f20771h = typedArrayObtainStyledAttributes.getBoolean(c.j.TextAppearance_textAllCaps, false);
        this.f20766c = c.a(context, typedArrayObtainStyledAttributes, c.j.TextAppearance_android_shadowColor);
        this.f20772i = typedArrayObtainStyledAttributes.getFloat(c.j.TextAppearance_android_shadowDx, 0.0f);
        this.f20773j = typedArrayObtainStyledAttributes.getFloat(c.j.TextAppearance_android_shadowDy, 0.0f);
        this.f20774k = typedArrayObtainStyledAttributes.getFloat(c.j.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, l.MaterialTextAppearance);
        int i11 = l.MaterialTextAppearance_android_letterSpacing;
        this.f20775l = typedArrayObtainStyledAttributes2.hasValue(i11);
        this.f20776m = typedArrayObtainStyledAttributes2.getFloat(i11, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f20768e = typedArrayObtainStyledAttributes2.getString(c.f(typedArrayObtainStyledAttributes2, l.MaterialTextAppearance_fontVariationSettings, l.MaterialTextAppearance_android_fontVariationSettings));
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public static String m(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 != 0 && resources.getResourceTypeName(i10).equals("font")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                while (xml.getEventType() != 1) {
                    if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), e0.d.FontFamily);
                        String string = typedArrayObtainAttributes.getString(e0.d.FontFamily_fontProviderSystemFontFamily);
                        typedArrayObtainAttributes.recycle();
                        return string;
                    }
                    xml.next();
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public final void d() {
        String str;
        if (this.f20782s == null && (str = this.f20767d) != null) {
            this.f20782s = Typeface.create(str, this.f20769f);
        }
        if (this.f20782s == null) {
            int i10 = this.f20770g;
            if (i10 == 1) {
                this.f20782s = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f20782s = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f20782s = Typeface.DEFAULT;
            } else {
                this.f20782s = Typeface.MONOSPACE;
            }
            this.f20782s = Typeface.create(this.f20782s, this.f20769f);
        }
    }

    public Typeface e() {
        d();
        return this.f20782s;
    }

    public Typeface f(Context context) {
        if (this.f20780q) {
            return this.f20782s;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceG = androidx.core.content.res.a.g(context, this.f20779p);
                this.f20782s = typefaceG;
                if (typefaceG != null) {
                    this.f20782s = Typeface.create(typefaceG, this.f20769f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f20767d, e10);
            }
        }
        d();
        this.f20780q = true;
        return this.f20782s;
    }

    public void g(Context context, TextPaint textPaint, g gVar) {
        r(context, textPaint, e());
        h(context, new b(context, textPaint, gVar));
    }

    public void h(Context context, g gVar) {
        if (!l(context)) {
            d();
        }
        int i10 = this.f20779p;
        if (i10 == 0) {
            this.f20780q = true;
        }
        if (this.f20780q) {
            gVar.b(this.f20782s, true);
            return;
        }
        try {
            androidx.core.content.res.a.i(context, i10, new a(gVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f20780q = true;
            gVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f20767d, e10);
            this.f20780q = true;
            gVar.a(-3);
        }
    }

    public final Typeface i(Context context) {
        Typeface typefaceCreate;
        if (this.f20781r) {
            return null;
        }
        this.f20781r = true;
        String strM = m(context, this.f20779p);
        if (strM == null || (typefaceCreate = Typeface.create(strM, 0)) == Typeface.DEFAULT) {
            return null;
        }
        return Typeface.create(typefaceCreate, this.f20769f);
    }

    public ColorStateList j() {
        return this.f20777n;
    }

    public float k() {
        return this.f20778o;
    }

    public final boolean l(Context context) {
        if (f.a()) {
            f(context);
            return true;
        }
        if (this.f20780q) {
            return true;
        }
        int i10 = this.f20779p;
        if (i10 == 0) {
            return false;
        }
        Typeface typefaceC = androidx.core.content.res.a.c(context, i10);
        if (typefaceC != null) {
            this.f20782s = typefaceC;
            this.f20780q = true;
            return true;
        }
        Typeface typefaceI = i(context);
        if (typefaceI == null) {
            return false;
        }
        this.f20782s = typefaceI;
        this.f20780q = true;
        return true;
    }

    public void n(ColorStateList colorStateList) {
        this.f20777n = colorStateList;
    }

    public void o(float f10) {
        this.f20778o = f10;
    }

    public void p(Context context, TextPaint textPaint, g gVar) {
        q(context, textPaint, gVar);
        ColorStateList colorStateList = this.f20777n;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f20774k;
        float f11 = this.f20772i;
        float f12 = this.f20773j;
        ColorStateList colorStateList2 = this.f20766c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void q(Context context, TextPaint textPaint, g gVar) {
        Typeface typeface;
        if (l(context) && this.f20780q && (typeface = this.f20782s) != null) {
            r(context, textPaint, typeface);
        } else {
            g(context, textPaint, gVar);
        }
    }

    public void r(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = j.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f20769f & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f20778o);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f20768e);
        }
        if (this.f20775l) {
            textPaint.setLetterSpacing(this.f20776m);
        }
    }
}
