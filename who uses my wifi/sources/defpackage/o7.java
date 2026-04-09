package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o7 {
    public int a;
    public boolean b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;

    public o7() {
        this.d = new HashSet();
        this.e = new Bundle();
        this.f = new HashMap();
        this.g = new HashSet();
        this.h = new Bundle();
        this.i = new HashSet();
        this.k = new ArrayList();
        this.a = -1;
        this.c = 60000;
    }

    public static gc3 c(Context context, l6 l6Var, int i) {
        ColorStateList colorStateListF;
        synchronized (l6Var) {
            colorStateListF = l6Var.a.f(context, i);
        }
        if (colorStateListF == null) {
            return null;
        }
        gc3 gc3Var = new gc3();
        gc3Var.b = true;
        gc3Var.c = colorStateListF;
        return gc3Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            ir.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            ir.a(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            ob1.r(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            ob1.r(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            ob1.r(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        ob1.r(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public void a(Drawable drawable, gc3 gc3Var) {
        if (drawable == null || gc3Var == null) {
            return;
        }
        l6.e(drawable, gc3Var, ((TextView) this.d).getDrawableState());
    }

    public void b() {
        TextView textView = (TextView) this.d;
        if (((gc3) this.e) != null || ((gc3) this.f) != null || ((gc3) this.g) != null || ((gc3) this.h) != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], (gc3) this.e);
            a(compoundDrawables[1], (gc3) this.f);
            a(compoundDrawables[2], (gc3) this.g);
            a(compoundDrawables[3], (gc3) this.h);
        }
        if (((gc3) this.i) == null && ((gc3) this.j) == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], (gc3) this.i);
        a(compoundDrawablesRelative[2], (gc3) this.j);
    }

    public ColorStateList d() {
        gc3 gc3Var = (gc3) this.k;
        if (gc3Var != null) {
            return (ColorStateList) gc3Var.c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        gc3 gc3Var = (gc3) this.k;
        if (gc3Var != null) {
            return (PorterDuff.Mode) gc3Var.d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:226:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(android.util.AttributeSet r26, int r27) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 977
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7.f(android.util.AttributeSet, int):void");
    }

    public void g(Context context, int i) throws Resources.NotFoundException {
        String string;
        TextView textView = (TextView) this.d;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, hn0.x);
        xb4 xb4Var = new xb4(context, typedArrayObtainStyledAttributes, 10);
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, xb4Var);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            m7.d(textView, string);
        }
        xb4Var.z();
        Typeface typeface = (Typeface) this.m;
        if (typeface != null) {
            textView.setTypeface(typeface, this.a);
        }
    }

    public void i(int i, int i2, int i3, int i4) {
        x7 x7Var = (x7) this.l;
        if (x7Var.i()) {
            DisplayMetrics displayMetrics = x7Var.j.getResources().getDisplayMetrics();
            x7Var.j(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (x7Var.g()) {
                x7Var.a();
            }
        }
    }

    public void j(int[] iArr, int i) {
        x7 x7Var = (x7) this.l;
        if (x7Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = x7Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                x7Var.f = x7.b(iArrCopyOf);
                if (!x7Var.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                x7Var.g = false;
            }
            if (x7Var.g()) {
                x7Var.a();
            }
        }
    }

    public void k(int i) {
        x7 x7Var = (x7) this.l;
        if (x7Var.i()) {
            if (i == 0) {
                x7Var.a = 0;
                x7Var.d = -1.0f;
                x7Var.e = -1.0f;
                x7Var.c = -1.0f;
                x7Var.f = new int[0];
                x7Var.b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(ex0.f("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = x7Var.j.getResources().getDisplayMetrics();
            x7Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (x7Var.g()) {
                x7Var.a();
            }
        }
    }

    public void l(ColorStateList colorStateList) {
        if (((gc3) this.k) == null) {
            this.k = new gc3();
        }
        gc3 gc3Var = (gc3) this.k;
        gc3Var.c = colorStateList;
        gc3Var.b = colorStateList != null;
        this.e = gc3Var;
        this.f = gc3Var;
        this.g = gc3Var;
        this.h = gc3Var;
        this.i = gc3Var;
        this.j = gc3Var;
    }

    public void m(PorterDuff.Mode mode) {
        if (((gc3) this.k) == null) {
            this.k = new gc3();
        }
        gc3 gc3Var = (gc3) this.k;
        gc3Var.d = mode;
        gc3Var.a = mode != null;
        this.e = gc3Var;
        this.f = gc3Var;
        this.g = gc3Var;
        this.h = gc3Var;
        this.i = gc3Var;
        this.j = gc3Var;
    }

    public void n(Context context, xb4 xb4Var) {
        String string;
        int i = this.a;
        TypedArray typedArray = (TypedArray) xb4Var.h;
        this.a = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.c = i3;
            if (i3 != -1) {
                this.a &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.b = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.m = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.m = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.m = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.m = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.c;
        int i7 = this.a;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceO = xb4Var.o(i5, this.a, new j7(this, i6, i7, new WeakReference((TextView) this.d)));
                if (typefaceO != null) {
                    if (i2 < 28 || this.c == -1) {
                        this.m = typefaceO;
                    } else {
                        this.m = n7.a(Typeface.create(typefaceO, 0), this.c, (this.a & 2) != 0);
                    }
                }
                this.b = ((Typeface) this.m) == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (((Typeface) this.m) != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.c == -1) {
            this.m = Typeface.create(string, this.a);
        } else {
            this.m = n7.a(Typeface.create(string, 0), this.c, (this.a & 2) != 0);
        }
    }

    public o7(TextView textView) {
        this.a = 0;
        this.c = -1;
        this.d = textView;
        this.l = new x7(textView);
    }
}
