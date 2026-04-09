package o;

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
import com.google.android.gms.internal.ads.AbstractC1135f5;
import g.AbstractC2327a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f22429a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22430b;

    /* renamed from: c, reason: collision with root package name */
    public int f22431c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22432d;

    /* renamed from: e, reason: collision with root package name */
    public Object f22433e;

    /* renamed from: f, reason: collision with root package name */
    public Object f22434f;

    /* renamed from: g, reason: collision with root package name */
    public Object f22435g;

    /* renamed from: h, reason: collision with root package name */
    public Object f22436h;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public Object f22437j;

    /* renamed from: k, reason: collision with root package name */
    public Object f22438k;

    /* renamed from: l, reason: collision with root package name */
    public Object f22439l;

    /* renamed from: m, reason: collision with root package name */
    public Object f22440m;

    public U() {
        this.f22432d = new HashSet();
        this.f22433e = new Bundle();
        this.f22434f = new HashMap();
        this.f22435g = new HashSet();
        this.f22436h = new Bundle();
        this.i = new HashSet();
        this.f22438k = new ArrayList();
        this.f22429a = -1;
        this.f22431c = 60000;
    }

    public static Y0 c(Context context, r rVar, int i) {
        ColorStateList colorStateListI;
        synchronized (rVar) {
            colorStateListI = rVar.f22623a.i(context, i);
        }
        if (colorStateListI == null) {
            return null;
        }
        Y0 y02 = new Y0();
        y02.f22474d = true;
        y02.f22471a = colorStateListI;
        return y02;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            T.b.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            T.b.a(editorInfo, text);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i6 = editorInfo.initialSelEnd;
        int i7 = i3 > i6 ? i6 : i3;
        if (i3 <= i6) {
            i3 = i6;
        }
        int length = text.length();
        if (i7 < 0 || i3 > length) {
            T.c.a(editorInfo, null, 0, 0);
            return;
        }
        int i8 = editorInfo.inputType & 4095;
        if (i8 == 129 || i8 == 225 || i8 == 18) {
            T.c.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            T.c.a(editorInfo, text, i7, i3);
            return;
        }
        int i9 = i3 - i7;
        int i10 = i9 > 1024 ? 0 : i9;
        int i11 = 2048 - i10;
        int iMin = Math.min(text.length() - i3, i11 - Math.min(i7, (int) (i11 * 0.8d)));
        int iMin2 = Math.min(i7, i11 - iMin);
        int i12 = i7 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i12))) {
            i12++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i3 + iMin) - 1))) {
            iMin--;
        }
        int i13 = iMin2 + i10;
        T.c.a(editorInfo, i10 != i9 ? TextUtils.concat(text.subSequence(i12, i12 + iMin2), text.subSequence(i3, iMin + i3)) : text.subSequence(i12, i13 + iMin + i12), iMin2, i13);
    }

    public void a(Drawable drawable, Y0 y02) {
        if (drawable == null || y02 == null) {
            return;
        }
        r.e(drawable, y02, ((TextView) this.f22432d).getDrawableState());
    }

    public void b() {
        TextView textView = (TextView) this.f22432d;
        if (((Y0) this.f22433e) != null || ((Y0) this.f22434f) != null || ((Y0) this.f22435g) != null || ((Y0) this.f22436h) != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], (Y0) this.f22433e);
            a(compoundDrawables[1], (Y0) this.f22434f);
            a(compoundDrawables[2], (Y0) this.f22435g);
            a(compoundDrawables[3], (Y0) this.f22436h);
        }
        if (((Y0) this.i) == null && ((Y0) this.f22437j) == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], (Y0) this.i);
        a(compoundDrawablesRelative[2], (Y0) this.f22437j);
    }

    public ColorStateList d() {
        Y0 y02 = (Y0) this.f22438k;
        if (y02 != null) {
            return y02.f22471a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        Y0 y02 = (Y0) this.f22438k;
        if (y02 != null) {
            return y02.f22472b;
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
        throw new UnsupportedOperationException("Method not decompiled: o.U.f(android.util.AttributeSet, int):void");
    }

    public void g(Context context, int i) throws Resources.NotFoundException {
        String string;
        TextView textView = (TextView) this.f22432d;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC2327a.f20137y);
        a1 a1Var = new a1(context, typedArrayObtainStyledAttributes);
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, a1Var);
        if (i3 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            S.d(textView, string);
        }
        a1Var.j();
        Typeface typeface = (Typeface) this.f22440m;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f22429a);
        }
    }

    public void i(int i, int i3, int i6, int i7) {
        C2706c0 c2706c0 = (C2706c0) this.f22439l;
        if (c2706c0.j()) {
            DisplayMetrics displayMetrics = c2706c0.f22497j.getResources().getDisplayMetrics();
            c2706c0.k(TypedValue.applyDimension(i7, i, displayMetrics), TypedValue.applyDimension(i7, i3, displayMetrics), TypedValue.applyDimension(i7, i6, displayMetrics));
            if (c2706c0.h()) {
                c2706c0.a();
            }
        }
    }

    public void j(int[] iArr, int i) {
        C2706c0 c2706c0 = (C2706c0) this.f22439l;
        if (c2706c0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c2706c0.f22497j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i, iArr[i3], displayMetrics));
                    }
                }
                c2706c0.f22494f = C2706c0.b(iArrCopyOf);
                if (!c2706c0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c2706c0.f22495g = false;
            }
            if (c2706c0.h()) {
                c2706c0.a();
            }
        }
    }

    public void k(int i) {
        C2706c0 c2706c0 = (C2706c0) this.f22439l;
        if (c2706c0.j()) {
            if (i == 0) {
                c2706c0.f22489a = 0;
                c2706c0.f22492d = -1.0f;
                c2706c0.f22493e = -1.0f;
                c2706c0.f22491c = -1.0f;
                c2706c0.f22494f = new int[0];
                c2706c0.f22490b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(AbstractC1135f5.l(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c2706c0.f22497j.getResources().getDisplayMetrics();
            c2706c0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c2706c0.h()) {
                c2706c0.a();
            }
        }
    }

    public void l(ColorStateList colorStateList) {
        if (((Y0) this.f22438k) == null) {
            this.f22438k = new Y0();
        }
        Y0 y02 = (Y0) this.f22438k;
        y02.f22471a = colorStateList;
        y02.f22474d = colorStateList != null;
        this.f22433e = y02;
        this.f22434f = y02;
        this.f22435g = y02;
        this.f22436h = y02;
        this.i = y02;
        this.f22437j = y02;
    }

    public void m(PorterDuff.Mode mode) {
        if (((Y0) this.f22438k) == null) {
            this.f22438k = new Y0();
        }
        Y0 y02 = (Y0) this.f22438k;
        y02.f22472b = mode;
        y02.f22473c = mode != null;
        this.f22433e = y02;
        this.f22434f = y02;
        this.f22435g = y02;
        this.f22436h = y02;
        this.i = y02;
        this.f22437j = y02;
    }

    public void n(Context context, a1 a1Var) {
        String string;
        int i = this.f22429a;
        TypedArray typedArray = (TypedArray) a1Var.f22480c;
        this.f22429a = typedArray.getInt(2, i);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i6 = typedArray.getInt(11, -1);
            this.f22431c = i6;
            if (i6 != -1) {
                this.f22429a &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f22430b = false;
                int i7 = typedArray.getInt(1, 1);
                if (i7 == 1) {
                    this.f22440m = Typeface.SANS_SERIF;
                    return;
                } else if (i7 == 2) {
                    this.f22440m = Typeface.SERIF;
                    return;
                } else {
                    if (i7 != 3) {
                        return;
                    }
                    this.f22440m = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f22440m = null;
        int i8 = typedArray.hasValue(12) ? 12 : 10;
        int i9 = this.f22431c;
        int i10 = this.f22429a;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceF = a1Var.f(i8, this.f22429a, new O(this, i9, i10, new WeakReference((TextView) this.f22432d)));
                if (typefaceF != null) {
                    if (i3 < 28 || this.f22431c == -1) {
                        this.f22440m = typefaceF;
                    } else {
                        this.f22440m = T.a(Typeface.create(typefaceF, 0), this.f22431c, (this.f22429a & 2) != 0);
                    }
                }
                this.f22430b = ((Typeface) this.f22440m) == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (((Typeface) this.f22440m) != null || (string = typedArray.getString(i8)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f22431c == -1) {
            this.f22440m = Typeface.create(string, this.f22429a);
        } else {
            this.f22440m = T.a(Typeface.create(string, 0), this.f22431c, (this.f22429a & 2) != 0);
        }
    }

    public U(TextView textView) {
        this.f22429a = 0;
        this.f22431c = -1;
        this.f22432d = textView;
        this.f22439l = new C2706c0(textView);
    }
}
