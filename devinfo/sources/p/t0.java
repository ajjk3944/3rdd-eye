package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public int f30864a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30865b;

    /* renamed from: c, reason: collision with root package name */
    public int f30866c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f30867d;

    /* renamed from: e, reason: collision with root package name */
    public Object f30868e;

    /* renamed from: f, reason: collision with root package name */
    public Object f30869f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f30870h;

    /* renamed from: i, reason: collision with root package name */
    public Object f30871i;
    public Object j;

    /* renamed from: k, reason: collision with root package name */
    public Object f30872k;

    /* renamed from: l, reason: collision with root package name */
    public Object f30873l;

    /* renamed from: m, reason: collision with root package name */
    public Object f30874m;

    public t0() {
        this.f30867d = new HashSet();
        this.f30868e = new Bundle();
        this.f30869f = new HashMap();
        this.g = new HashSet();
        this.f30870h = new Bundle();
        this.f30871i = new HashSet();
        this.f30872k = new ArrayList();
        this.f30864a = -1;
        this.f30866c = 60000;
    }

    public static ah.f c(Context context, s sVar, int i4) {
        ColorStateList colorStateListI;
        synchronized (sVar) {
            colorStateListI = sVar.f30852a.i(i4, context);
        }
        if (colorStateListI == null) {
            return null;
        }
        ah.f fVar = new ah.f();
        fVar.f381b = true;
        fVar.f382c = colorStateListI;
        return fVar;
    }

    public void a(Drawable drawable, ah.f fVar) {
        if (drawable == null || fVar == null) {
            return;
        }
        s.e(drawable, fVar, ((TextView) this.f30867d).getDrawableState());
    }

    public void b() {
        TextView textView = (TextView) this.f30867d;
        if (((ah.f) this.f30868e) != null || ((ah.f) this.f30869f) != null || ((ah.f) this.g) != null || ((ah.f) this.f30870h) != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], (ah.f) this.f30868e);
            a(compoundDrawables[1], (ah.f) this.f30869f);
            a(compoundDrawables[2], (ah.f) this.g);
            a(compoundDrawables[3], (ah.f) this.f30870h);
        }
        if (((ah.f) this.f30871i) == null && ((ah.f) this.j) == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], (ah.f) this.f30871i);
        a(compoundDrawablesRelative[2], (ah.f) this.j);
    }

    public ColorStateList d() {
        ah.f fVar = (ah.f) this.f30872k;
        if (fVar != null) {
            return (ColorStateList) fVar.f382c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        ah.f fVar = (ah.f) this.f30872k;
        if (fVar != null) {
            return (PorterDuff.Mode) fVar.f383d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(android.util.AttributeSet r27, int r28) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.t0.f(android.util.AttributeSet, int):void");
    }

    public void g(int i4, Context context) throws Resources.NotFoundException {
        String string;
        TextView textView = (TextView) this.f30867d;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i4, h.a.f24797x);
        i0.f fVar = new i0.f(context, typedArrayObtainStyledAttributes);
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, fVar);
        if (i10 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            r0.d(textView, string);
        }
        fVar.M();
        Typeface typeface = (Typeface) this.f30874m;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f30864a);
        }
    }

    public void h(int i4, int i10, int i11, int i12) {
        b1 b1Var = (b1) this.f30873l;
        if (b1Var.j()) {
            DisplayMetrics displayMetrics = b1Var.j.getResources().getDisplayMetrics();
            b1Var.k(TypedValue.applyDimension(i12, i4, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (b1Var.h()) {
                b1Var.a();
            }
        }
    }

    public void i(int[] iArr, int i4) {
        b1 b1Var = (b1) this.f30873l;
        if (b1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i4 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = b1Var.j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArrCopyOf[i10] = Math.round(TypedValue.applyDimension(i4, iArr[i10], displayMetrics));
                    }
                }
                b1Var.f30627f = b1.b(iArrCopyOf);
                if (!b1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                b1Var.g = false;
            }
            if (b1Var.h()) {
                b1Var.a();
            }
        }
    }

    public void j(int i4) {
        b1 b1Var = (b1) this.f30873l;
        if (b1Var.j()) {
            if (i4 == 0) {
                b1Var.f30622a = 0;
                b1Var.f30625d = -1.0f;
                b1Var.f30626e = -1.0f;
                b1Var.f30624c = -1.0f;
                b1Var.f30627f = new int[0];
                b1Var.f30623b = false;
                return;
            }
            if (i4 != 1) {
                throw new IllegalArgumentException(je.u.r(i4, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = b1Var.j.getResources().getDisplayMetrics();
            b1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (b1Var.h()) {
                b1Var.a();
            }
        }
    }

    public void k(ColorStateList colorStateList) {
        if (((ah.f) this.f30872k) == null) {
            this.f30872k = new ah.f();
        }
        ah.f fVar = (ah.f) this.f30872k;
        fVar.f382c = colorStateList;
        fVar.f381b = colorStateList != null;
        this.f30868e = fVar;
        this.f30869f = fVar;
        this.g = fVar;
        this.f30870h = fVar;
        this.f30871i = fVar;
        this.j = fVar;
    }

    public void l(PorterDuff.Mode mode) {
        if (((ah.f) this.f30872k) == null) {
            this.f30872k = new ah.f();
        }
        ah.f fVar = (ah.f) this.f30872k;
        fVar.f383d = mode;
        fVar.f380a = mode != null;
        this.f30868e = fVar;
        this.f30869f = fVar;
        this.g = fVar;
        this.f30870h = fVar;
        this.f30871i = fVar;
        this.j = fVar;
    }

    public void m(Context context, i0.f fVar) {
        String string;
        int i4 = this.f30864a;
        TypedArray typedArray = (TypedArray) fVar.f25417c;
        this.f30864a = typedArray.getInt(2, i4);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.f30866c = i11;
            if (i11 != -1) {
                this.f30864a &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f30865b = false;
                int i12 = typedArray.getInt(1, 1);
                if (i12 == 1) {
                    this.f30874m = Typeface.SANS_SERIF;
                    return;
                } else if (i12 == 2) {
                    this.f30874m = Typeface.SERIF;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f30874m = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f30874m = null;
        int i13 = typedArray.hasValue(12) ? 12 : 10;
        int i14 = this.f30866c;
        int i15 = this.f30864a;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceC = fVar.C(i13, this.f30864a, new o0(this, i14, i15, new WeakReference((TextView) this.f30867d)));
                if (typefaceC != null) {
                    if (i10 < 28 || this.f30866c == -1) {
                        this.f30874m = typefaceC;
                    } else {
                        this.f30874m = s0.a(Typeface.create(typefaceC, 0), this.f30866c, (this.f30864a & 2) != 0);
                    }
                }
                this.f30865b = ((Typeface) this.f30874m) == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (((Typeface) this.f30874m) != null || (string = typedArray.getString(i13)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f30866c == -1) {
            this.f30874m = Typeface.create(string, this.f30864a);
        } else {
            this.f30874m = s0.a(Typeface.create(string, 0), this.f30866c, (this.f30864a & 2) != 0);
        }
    }

    public t0(TextView textView) {
        this.f30864a = 0;
        this.f30866c = -1;
        this.f30867d = textView;
        this.f30873l = new b1(textView);
    }
}
