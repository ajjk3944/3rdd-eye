package c4;

import O3.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import v1.h;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f33837a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f33838b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f33839c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33840d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33841e;

    /* renamed from: f, reason: collision with root package name */
    public final int f33842f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f33843g;

    /* renamed from: h, reason: collision with root package name */
    public final float f33844h;

    /* renamed from: i, reason: collision with root package name */
    public final float f33845i;

    /* renamed from: j, reason: collision with root package name */
    public final float f33846j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f33847k;

    /* renamed from: l, reason: collision with root package name */
    public final float f33848l;

    /* renamed from: m, reason: collision with root package name */
    private ColorStateList f33849m;

    /* renamed from: n, reason: collision with root package name */
    private float f33850n;

    /* renamed from: o, reason: collision with root package name */
    private final int f33851o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f33852p = false;

    /* renamed from: q, reason: collision with root package name */
    private Typeface f33853q;

    class a extends h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f33854a;

        a(f fVar) {
            this.f33854a = fVar;
        }

        @Override // v1.h.e
        /* renamed from: h */
        public void f(int i10) {
            d.this.f33852p = true;
            this.f33854a.a(i10);
        }

        @Override // v1.h.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            d dVar = d.this;
            dVar.f33853q = Typeface.create(typeface, dVar.f33841e);
            d.this.f33852p = true;
            this.f33854a.b(d.this.f33853q, false);
        }
    }

    class b extends f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f33856a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f33857b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f33858c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f33856a = context;
            this.f33857b = textPaint;
            this.f33858c = fVar;
        }

        @Override // c4.f
        public void a(int i10) {
            this.f33858c.a(i10);
        }

        @Override // c4.f
        public void b(Typeface typeface, boolean z10) {
            d.this.p(this.f33856a, this.f33857b, typeface);
            this.f33858c.b(typeface, z10);
        }
    }

    public d(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, j.f17333W4);
        l(typedArrayObtainStyledAttributes.getDimension(j.f17340X4, 0.0f));
        k(c.a(context, typedArrayObtainStyledAttributes, j.f17362a5));
        this.f33837a = c.a(context, typedArrayObtainStyledAttributes, j.f17370b5);
        this.f33838b = c.a(context, typedArrayObtainStyledAttributes, j.f17378c5);
        this.f33841e = typedArrayObtainStyledAttributes.getInt(j.f17354Z4, 0);
        this.f33842f = typedArrayObtainStyledAttributes.getInt(j.f17347Y4, 1);
        int iE = c.e(typedArrayObtainStyledAttributes, j.f17426i5, j.f17418h5);
        this.f33851o = typedArrayObtainStyledAttributes.getResourceId(iE, 0);
        this.f33840d = typedArrayObtainStyledAttributes.getString(iE);
        this.f33843g = typedArrayObtainStyledAttributes.getBoolean(j.f17434j5, false);
        this.f33839c = c.a(context, typedArrayObtainStyledAttributes, j.f17386d5);
        this.f33844h = typedArrayObtainStyledAttributes.getFloat(j.f17394e5, 0.0f);
        this.f33845i = typedArrayObtainStyledAttributes.getFloat(j.f17402f5, 0.0f);
        this.f33846j = typedArrayObtainStyledAttributes.getFloat(j.f17410g5, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, j.f17488q3);
        int i11 = j.f17496r3;
        this.f33847k = typedArrayObtainStyledAttributes2.hasValue(i11);
        this.f33848l = typedArrayObtainStyledAttributes2.getFloat(i11, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f33853q == null && (str = this.f33840d) != null) {
            this.f33853q = Typeface.create(str, this.f33841e);
        }
        if (this.f33853q == null) {
            int i10 = this.f33842f;
            if (i10 == 1) {
                this.f33853q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f33853q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f33853q = Typeface.DEFAULT;
            } else {
                this.f33853q = Typeface.MONOSPACE;
            }
            this.f33853q = Typeface.create(this.f33853q, this.f33841e);
        }
    }

    private boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i10 = this.f33851o;
        return (i10 != 0 ? v1.h.c(context, i10) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f33853q;
    }

    public Typeface f(Context context) {
        if (this.f33852p) {
            return this.f33853q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceG = v1.h.g(context, this.f33851o);
                this.f33853q = typefaceG;
                if (typefaceG != null) {
                    this.f33853q = Typeface.create(typefaceG, this.f33841e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f33840d, e10);
            }
        }
        d();
        this.f33852p = true;
        return this.f33853q;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f33851o;
        if (i10 == 0) {
            this.f33852p = true;
        }
        if (this.f33852p) {
            fVar.b(this.f33853q, true);
            return;
        }
        try {
            v1.h.i(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f33852p = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f33840d, e10);
            this.f33852p = true;
            fVar.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f33849m;
    }

    public float j() {
        return this.f33850n;
    }

    public void k(ColorStateList colorStateList) {
        this.f33849m = colorStateList;
    }

    public void l(float f10) {
        this.f33850n = f10;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f33849m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f33846j;
        float f11 = this.f33844h;
        float f12 = this.f33845i;
        ColorStateList colorStateList2 = this.f33839c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = h.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f33841e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f33850n);
        if (this.f33847k) {
            textPaint.setLetterSpacing(this.f33848l);
        }
    }
}
