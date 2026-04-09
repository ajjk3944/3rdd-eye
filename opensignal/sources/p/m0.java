package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f20105a;

    /* renamed from: b, reason: collision with root package name */
    public d5.z0 f20106b;

    /* renamed from: c, reason: collision with root package name */
    public d5.z0 f20107c;

    /* renamed from: d, reason: collision with root package name */
    public d5.z0 f20108d;

    /* renamed from: e, reason: collision with root package name */
    public d5.z0 f20109e;

    /* renamed from: f, reason: collision with root package name */
    public d5.z0 f20110f;

    /* renamed from: g, reason: collision with root package name */
    public d5.z0 f20111g;

    /* renamed from: h, reason: collision with root package name */
    public d5.z0 f20112h;

    /* renamed from: i, reason: collision with root package name */
    public final v0 f20113i;
    public int j = 0;
    public int k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f20114l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20115m;

    public m0(TextView textView) {
        this.f20105a = textView;
        this.f20113i = new v0(textView);
    }

    public static d5.z0 c(Context context, p pVar, int i10) {
        ColorStateList colorStateListF;
        synchronized (pVar) {
            colorStateListF = pVar.f20132a.f(context, i10);
        }
        if (colorStateListF == null) {
            return null;
        }
        d5.z0 z0Var = new d5.z0(3);
        z0Var.f7143c = true;
        z0Var.f7144d = colorStateListF;
        return z0Var;
    }

    public final void a(Drawable drawable, d5.z0 z0Var) {
        if (drawable == null || z0Var == null) {
            return;
        }
        p.e(drawable, z0Var, this.f20105a.getDrawableState());
    }

    public final void b() {
        d5.z0 z0Var = this.f20106b;
        TextView textView = this.f20105a;
        if (z0Var != null || this.f20107c != null || this.f20108d != null || this.f20109e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f20106b);
            a(compoundDrawables[1], this.f20107c);
            a(compoundDrawables[2], this.f20108d);
            a(compoundDrawables[3], this.f20109e);
        }
        if (this.f20110f == null && this.f20111g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f20110f);
        a(compoundDrawablesRelative[2], this.f20111g);
    }

    public final ColorStateList d() {
        d5.z0 z0Var = this.f20112h;
        if (z0Var != null) {
            return (ColorStateList) z0Var.f7144d;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        d5.z0 z0Var = this.f20112h;
        if (z0Var != null) {
            return (PorterDuff.Mode) z0Var.f7145e;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:227:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m0.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, h.j.TextAppearance);
        io.sentry.k kVar = new io.sentry.k(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(h.j.TextAppearance_textAllCaps);
        TextView textView = this.f20105a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(h.j.TextAppearance_textAllCaps, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(h.j.TextAppearance_android_textSize) && typedArrayObtainStyledAttributes.getDimensionPixelSize(h.j.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, kVar);
        if (i11 >= 26 && typedArrayObtainStyledAttributes.hasValue(h.j.TextAppearance_fontVariationSettings) && (string = typedArrayObtainStyledAttributes.getString(h.j.TextAppearance_fontVariationSettings)) != null) {
            k0.d(textView, string);
        }
        kVar.l0();
        Typeface typeface = this.f20114l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        v0 v0Var = this.f20113i;
        if (v0Var.j()) {
            DisplayMetrics displayMetrics = v0Var.j.getResources().getDisplayMetrics();
            v0Var.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (v0Var.h()) {
                v0Var.a();
            }
        }
    }

    public final void i(int[] iArr, int i10) {
        v0 v0Var = this.f20113i;
        if (v0Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = v0Var.j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                v0Var.f20196f = v0.b(iArrCopyOf);
                if (!v0Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                v0Var.f20197g = false;
            }
            if (v0Var.h()) {
                v0Var.a();
            }
        }
    }

    public final void j(int i10) {
        v0 v0Var = this.f20113i;
        if (v0Var.j()) {
            if (i10 == 0) {
                v0Var.f20191a = 0;
                v0Var.f20194d = -1.0f;
                v0Var.f20195e = -1.0f;
                v0Var.f20193c = -1.0f;
                v0Var.f20196f = new int[0];
                v0Var.f20192b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(h0.b.h(i10, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = v0Var.j.getResources().getDisplayMetrics();
            v0Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (v0Var.h()) {
                v0Var.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f20112h == null) {
            this.f20112h = new d5.z0(3);
        }
        d5.z0 z0Var = this.f20112h;
        z0Var.f7144d = colorStateList;
        z0Var.f7143c = colorStateList != null;
        this.f20106b = z0Var;
        this.f20107c = z0Var;
        this.f20108d = z0Var;
        this.f20109e = z0Var;
        this.f20110f = z0Var;
        this.f20111g = z0Var;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.f20112h == null) {
            this.f20112h = new d5.z0(3);
        }
        d5.z0 z0Var = this.f20112h;
        z0Var.f7145e = mode;
        z0Var.f7142b = mode != null;
        this.f20106b = z0Var;
        this.f20107c = z0Var;
        this.f20108d = z0Var;
        this.f20109e = z0Var;
        this.f20110f = z0Var;
        this.f20111g = z0Var;
    }

    public final void m(Context context, io.sentry.k kVar) {
        String string;
        int i10 = h.j.TextAppearance_android_textStyle;
        int i11 = this.j;
        TypedArray typedArray = (TypedArray) kVar.f12398g;
        this.j = typedArray.getInt(i10, i11);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            int i13 = typedArray.getInt(h.j.TextAppearance_android_textFontWeight, -1);
            this.k = i13;
            if (i13 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(h.j.TextAppearance_android_fontFamily) && !typedArray.hasValue(h.j.TextAppearance_fontFamily)) {
            if (typedArray.hasValue(h.j.TextAppearance_android_typeface)) {
                this.f20115m = false;
                int i14 = typedArray.getInt(h.j.TextAppearance_android_typeface, 1);
                if (i14 == 1) {
                    this.f20114l = Typeface.SANS_SERIF;
                    return;
                } else if (i14 == 2) {
                    this.f20114l = Typeface.SERIF;
                    return;
                } else {
                    if (i14 != 3) {
                        return;
                    }
                    this.f20114l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f20114l = null;
        int i15 = typedArray.hasValue(h.j.TextAppearance_fontFamily) ? h.j.TextAppearance_fontFamily : h.j.TextAppearance_android_fontFamily;
        int i16 = this.k;
        int i17 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceX = kVar.X(i15, this.j, new i0(this, i16, i17, new WeakReference(this.f20105a)));
                if (typefaceX != null) {
                    if (i12 < 28 || this.k == -1) {
                        this.f20114l = typefaceX;
                    } else {
                        this.f20114l = l0.a(Typeface.create(typefaceX, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.f20115m = this.f20114l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f20114l != null || (string = typedArray.getString(i15)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.f20114l = Typeface.create(string, this.j);
        } else {
            this.f20114l = l0.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
