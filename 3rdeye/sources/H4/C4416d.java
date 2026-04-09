package h4;

import B0.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* compiled from: TextAppearance.java */
/* renamed from: h4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4416d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f38224a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38225b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38226c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38227d;

    /* renamed from: e, reason: collision with root package name */
    public final float f38228e;

    /* renamed from: f, reason: collision with root package name */
    public final float f38229f;

    /* renamed from: g, reason: collision with root package name */
    public final float f38230g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f38231h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f38232j;

    /* renamed from: k, reason: collision with root package name */
    public float f38233k;

    /* renamed from: l, reason: collision with root package name */
    public final int f38234l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f38235m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f38236n;

    /* compiled from: TextAppearance.java */
    /* renamed from: h4.d$a */
    public class a extends g.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ I9.g f38237a;

        public a(I9.g gVar) {
            this.f38237a = gVar;
        }

        @Override // B0.g.e
        /* renamed from: onFontRetrievalFailed */
        public final void lambda$callbackFailAsync$1(int i) {
            C4416d.this.f38235m = true;
            this.f38237a.Y(i);
        }

        @Override // B0.g.e
        /* renamed from: onFontRetrieved */
        public final void lambda$callbackSuccessAsync$0(Typeface typeface) {
            C4416d c4416d = C4416d.this;
            c4416d.f38236n = Typeface.create(typeface, c4416d.f38226c);
            c4416d.f38235m = true;
            this.f38237a.Z(c4416d.f38236n, false);
        }
    }

    public C4416d(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, K3.a.f3110A);
        this.f38233k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f38232j = C4415c.a(context, typedArrayObtainStyledAttributes, 3);
        C4415c.a(context, typedArrayObtainStyledAttributes, 4);
        C4415c.a(context, typedArrayObtainStyledAttributes, 5);
        this.f38226c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f38227d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i10 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f38234l = typedArrayObtainStyledAttributes.getResourceId(i10, 0);
        this.f38225b = typedArrayObtainStyledAttributes.getString(i10);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f38224a = C4415c.a(context, typedArrayObtainStyledAttributes, 6);
        this.f38228e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f38229f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f38230g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, K3.a.f3131s);
        this.f38231h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f38236n;
        int i = this.f38226c;
        if (typeface == null && (str = this.f38225b) != null) {
            this.f38236n = Typeface.create(str, i);
        }
        if (this.f38236n == null) {
            int i10 = this.f38227d;
            if (i10 == 1) {
                this.f38236n = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f38236n = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f38236n = Typeface.DEFAULT;
            } else {
                this.f38236n = Typeface.MONOSPACE;
            }
            this.f38236n = Typeface.create(this.f38236n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f38235m) {
            return this.f38236n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceB = g.b(context, this.f38234l);
                this.f38236n = typefaceB;
                if (typefaceB != null) {
                    this.f38236n = Typeface.create(typefaceB, this.f38226c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e4) {
                Log.d("TextAppearance", "Error loading font " + this.f38225b, e4);
            }
        }
        a();
        this.f38235m = true;
        return this.f38236n;
    }

    public final void c(Context context, I9.g gVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f38234l;
        if (i == 0) {
            this.f38235m = true;
        }
        if (this.f38235m) {
            gVar.Z(this.f38236n, true);
            return;
        }
        try {
            a aVar = new a(gVar);
            ThreadLocal<TypedValue> threadLocal = g.f359a;
            if (context.isRestricted()) {
                aVar.callbackFailAsync(-4, null);
            } else {
                g.c(context, i, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f38235m = true;
            gVar.Y(1);
        } catch (Exception e4) {
            Log.d("TextAppearance", "Error loading font " + this.f38225b, e4);
            this.f38235m = true;
            gVar.Y(-3);
        }
    }

    public final boolean d(Context context) throws Resources.NotFoundException {
        Typeface typefaceC = null;
        int i = this.f38234l;
        if (i != 0) {
            ThreadLocal<TypedValue> threadLocal = g.f359a;
            if (!context.isRestricted()) {
                typefaceC = g.c(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceC != null;
    }

    public final void e(Context context, TextPaint textPaint, I9.g gVar) {
        f(context, textPaint, gVar);
        ColorStateList colorStateList = this.f38232j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f38224a;
        textPaint.setShadowLayer(this.f38230g, this.f38228e, this.f38229f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, I9.g gVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f38236n);
        c(context, new e(this, context, textPaint, gVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = f.a(context.getResources().getConfiguration(), typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f38226c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f38233k);
        if (this.f38231h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
