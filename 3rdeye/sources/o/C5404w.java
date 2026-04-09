package o;

import B0.g;
import Q0.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import g.C4353a;
import g0.C4356c;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: AppCompatTextHelper.java */
/* renamed from: o.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5404w {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f44741a;

    /* renamed from: b, reason: collision with root package name */
    public V f44742b;

    /* renamed from: c, reason: collision with root package name */
    public V f44743c;

    /* renamed from: d, reason: collision with root package name */
    public V f44744d;

    /* renamed from: e, reason: collision with root package name */
    public V f44745e;

    /* renamed from: f, reason: collision with root package name */
    public V f44746f;

    /* renamed from: g, reason: collision with root package name */
    public V f44747g;

    /* renamed from: h, reason: collision with root package name */
    public V f44748h;
    public final C5406y i;

    /* renamed from: j, reason: collision with root package name */
    public int f44749j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f44750k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f44751l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f44752m;

    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: o.w$b */
    public static class b {
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: o.w$c */
    public static class c {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: o.w$d */
    public static class d {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i, int i10, int i11, int i12) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i10, i11, i12);
        }

        public static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: o.w$e */
    public static class e {
        public static Typeface a(Typeface typeface, int i, boolean z10) {
            return Typeface.create(typeface, i, z10);
        }
    }

    public C5404w(TextView textView) {
        this.f44741a = textView;
        this.i = new C5406y(textView);
    }

    public static V c(Context context, C5390h c5390h, int i) {
        ColorStateList colorStateListI;
        synchronized (c5390h) {
            colorStateListI = c5390h.f44676a.i(context, i);
        }
        if (colorStateListI == null) {
            return null;
        }
        V v10 = new V();
        v10.f44606d = true;
        v10.f44603a = colorStateListI;
        return v10;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            c.a.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            c.a.a(editorInfo, text);
            return;
        }
        int i10 = editorInfo.initialSelStart;
        int i11 = editorInfo.initialSelEnd;
        int i12 = i10 > i11 ? i11 : i10;
        if (i10 <= i11) {
            i10 = i11;
        }
        int length = text.length();
        if (i12 < 0 || i10 > length) {
            Q0.c.a(editorInfo, null, 0, 0);
            return;
        }
        int i13 = editorInfo.inputType & 4095;
        if (i13 == 129 || i13 == 225 || i13 == 18) {
            Q0.c.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            Q0.c.a(editorInfo, text, i12, i10);
            return;
        }
        int i14 = i10 - i12;
        int i15 = i14 > 1024 ? 0 : i14;
        int i16 = 2048 - i15;
        int iMin = Math.min(text.length() - i10, i16 - Math.min(i12, (int) (i16 * 0.8d)));
        int iMin2 = Math.min(i12, i16 - iMin);
        int i17 = i12 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i17))) {
            i17++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i10 + iMin) - 1))) {
            iMin--;
        }
        int i18 = iMin2 + i15;
        Q0.c.a(editorInfo, i15 != i14 ? TextUtils.concat(text.subSequence(i17, i17 + iMin2), text.subSequence(i10, iMin + i10)) : text.subSequence(i17, i18 + iMin + i17), iMin2, i18);
    }

    public final void a(Drawable drawable, V v10) {
        if (drawable == null || v10 == null) {
            return;
        }
        C5390h.e(drawable, v10, this.f44741a.getDrawableState());
    }

    public final void b() {
        V v10 = this.f44742b;
        TextView textView = this.f44741a;
        if (v10 != null || this.f44743c != null || this.f44744d != null || this.f44745e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f44742b);
            a(compoundDrawables[1], this.f44743c);
            a(compoundDrawables[2], this.f44744d);
            a(compoundDrawables[3], this.f44745e);
        }
        if (this.f44746f == null && this.f44747g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f44746f);
        a(compoundDrawablesRelative[2], this.f44747g);
    }

    public final ColorStateList d() {
        V v10 = this.f44748h;
        if (v10 != null) {
            return v10.f44603a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        V v10 = this.f44748h;
        if (v10 != null) {
            return v10.f44604b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.util.AttributeSet r25, int r26) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5404w.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C4353a.f37897w);
        X x10 = new X(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f44741a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, x10);
        if (i10 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            d.d(textView, string);
        }
        x10.f();
        Typeface typeface = this.f44751l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f44749j);
        }
    }

    public final void i(int i, int i10, int i11, int i12) throws IllegalArgumentException {
        C5406y c5406y = this.i;
        if (c5406y.j()) {
            DisplayMetrics displayMetrics = c5406y.f44770j.getResources().getDisplayMetrics();
            c5406y.k(TypedValue.applyDimension(i12, i, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (c5406y.h()) {
                c5406y.a();
            }
        }
    }

    public final void j(int[] iArr, int i) throws IllegalArgumentException {
        C5406y c5406y = this.i;
        if (c5406y.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c5406y.f44770j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArrCopyOf[i10] = Math.round(TypedValue.applyDimension(i, iArr[i10], displayMetrics));
                    }
                }
                c5406y.f44767f = C5406y.b(iArrCopyOf);
                if (!c5406y.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c5406y.f44768g = false;
            }
            if (c5406y.h()) {
                c5406y.a();
            }
        }
    }

    public final void k(int i) {
        C5406y c5406y = this.i;
        if (c5406y.j()) {
            if (i == 0) {
                c5406y.f44762a = 0;
                c5406y.f44765d = -1.0f;
                c5406y.f44766e = -1.0f;
                c5406y.f44764c = -1.0f;
                c5406y.f44767f = new int[0];
                c5406y.f44763b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(C4356c.h(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c5406y.f44770j.getResources().getDisplayMetrics();
            c5406y.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c5406y.h()) {
                c5406y.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f44748h == null) {
            this.f44748h = new V();
        }
        V v10 = this.f44748h;
        v10.f44603a = colorStateList;
        v10.f44606d = colorStateList != null;
        this.f44742b = v10;
        this.f44743c = v10;
        this.f44744d = v10;
        this.f44745e = v10;
        this.f44746f = v10;
        this.f44747g = v10;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f44748h == null) {
            this.f44748h = new V();
        }
        V v10 = this.f44748h;
        v10.f44604b = mode;
        v10.f44605c = mode != null;
        this.f44742b = v10;
        this.f44743c = v10;
        this.f44744d = v10;
        this.f44745e = v10;
        this.f44746f = v10;
        this.f44747g = v10;
    }

    public final void n(Context context, X x10) {
        String string;
        int i = this.f44749j;
        TypedArray typedArray = x10.f44608b;
        this.f44749j = typedArray.getInt(2, i);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.f44750k = i11;
            if (i11 != -1) {
                this.f44749j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f44752m = false;
                int i12 = typedArray.getInt(1, 1);
                if (i12 == 1) {
                    this.f44751l = Typeface.SANS_SERIF;
                    return;
                } else if (i12 == 2) {
                    this.f44751l = Typeface.SERIF;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f44751l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f44751l = null;
        int i13 = typedArray.hasValue(12) ? 12 : 10;
        int i14 = this.f44750k;
        int i15 = this.f44749j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceD = x10.d(i13, this.f44749j, new a(i14, i15, new WeakReference(this.f44741a)));
                if (typefaceD != null) {
                    if (i10 < 28 || this.f44750k == -1) {
                        this.f44751l = typefaceD;
                    } else {
                        this.f44751l = e.a(Typeface.create(typefaceD, 0), this.f44750k, (this.f44749j & 2) != 0);
                    }
                }
                this.f44752m = this.f44751l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f44751l != null || (string = typedArray.getString(i13)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f44750k == -1) {
            this.f44751l = Typeface.create(string, this.f44749j);
        } else {
            this.f44751l = e.a(Typeface.create(string, 0), this.f44750k, (this.f44749j & 2) != 0);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: o.w$a */
    public class a extends g.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f44753a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f44754b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f44755c;

        public a(int i, int i10, WeakReference weakReference) {
            this.f44753a = i;
            this.f44754b = i10;
            this.f44755c = weakReference;
        }

        @Override // B0.g.e
        /* renamed from: onFontRetrieved */
        public final void lambda$callbackSuccessAsync$0(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f44753a) != -1) {
                typeface = e.a(typeface, i, (this.f44754b & 2) != 0);
            }
            C5404w c5404w = C5404w.this;
            if (c5404w.f44752m) {
                c5404w.f44751l = typeface;
                TextView textView = (TextView) this.f44755c.get();
                if (textView != null) {
                    if (textView.isAttachedToWindow()) {
                        textView.post(new RunnableC5405x(textView, typeface, c5404w.f44749j));
                    } else {
                        textView.setTypeface(typeface, c5404w.f44749j);
                    }
                }
            }
        }

        @Override // B0.g.e
        /* renamed from: onFontRetrievalFailed */
        public final void lambda$callbackFailAsync$1(int i) {
        }
    }
}
