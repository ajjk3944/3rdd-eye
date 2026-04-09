package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.core.content.res.a;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f1386a;

    /* renamed from: b, reason: collision with root package name */
    public x0 f1387b;

    /* renamed from: c, reason: collision with root package name */
    public x0 f1388c;

    /* renamed from: d, reason: collision with root package name */
    public x0 f1389d;

    /* renamed from: e, reason: collision with root package name */
    public x0 f1390e;

    /* renamed from: f, reason: collision with root package name */
    public x0 f1391f;

    /* renamed from: g, reason: collision with root package name */
    public x0 f1392g;

    /* renamed from: h, reason: collision with root package name */
    public x0 f1393h;

    /* renamed from: i, reason: collision with root package name */
    public final z f1394i;

    /* renamed from: j, reason: collision with root package name */
    public int f1395j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f1396k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f1397l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1398m;

    public class a extends a.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f1399a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1400b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f1401c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f1399a = i10;
            this.f1400b = i11;
            this.f1401c = weakReference;
        }

        @Override // androidx.core.content.res.a.e
        public void f(int i10) {
        }

        @Override // androidx.core.content.res.a.e
        public void g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1399a) != -1) {
                typeface = f.a(typeface, i10, (this.f1400b & 2) != 0);
            }
            y.this.n(this.f1401c, typeface);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f1403a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Typeface f1404b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f1405c;

        public b(TextView textView, Typeface typeface, int i10) {
            this.f1403a = textView;
            this.f1404b = typeface;
            this.f1405c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1403a.setTypeface(this.f1404b, this.f1405c);
        }
    }

    public static class c {
        @DoNotInline
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    public static class d {
        @DoNotInline
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @DoNotInline
        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    public static class e {
        @DoNotInline
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @DoNotInline
        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @DoNotInline
        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public static class f {
        @DoNotInline
        public static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    public y(TextView textView) {
        this.f1386a = textView;
        this.f1394i = new z(textView);
    }

    public static x0 d(Context context, i iVar, int i10) {
        ColorStateList colorStateListF = iVar.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        x0 x0Var = new x0();
        x0Var.f1385d = true;
        x0Var.f1382a = colorStateListF;
        return x0Var;
    }

    public void A(int i10, float f10) {
        if (k1.f1227c || l()) {
            return;
        }
        B(i10, f10);
    }

    public final void B(int i10, float f10) {
        this.f1394i.t(i10, f10);
    }

    public final void C(Context context, z0 z0Var) {
        String strO;
        this.f1395j = z0Var.k(c.j.TextAppearance_android_textStyle, this.f1395j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iK = z0Var.k(c.j.TextAppearance_android_textFontWeight, -1);
            this.f1396k = iK;
            if (iK != -1) {
                this.f1395j &= 2;
            }
        }
        int i11 = c.j.TextAppearance_android_fontFamily;
        if (!z0Var.s(i11) && !z0Var.s(c.j.TextAppearance_fontFamily)) {
            int i12 = c.j.TextAppearance_android_typeface;
            if (z0Var.s(i12)) {
                this.f1398m = false;
                int iK2 = z0Var.k(i12, 1);
                if (iK2 == 1) {
                    this.f1397l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f1397l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f1397l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1397l = null;
        int i13 = c.j.TextAppearance_fontFamily;
        if (z0Var.s(i13)) {
            i11 = i13;
        }
        int i14 = this.f1396k;
        int i15 = this.f1395j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = z0Var.j(i11, this.f1395j, new a(i14, i15, new WeakReference(this.f1386a)));
                if (typefaceJ != null) {
                    if (i10 < 28 || this.f1396k == -1) {
                        this.f1397l = typefaceJ;
                    } else {
                        this.f1397l = f.a(Typeface.create(typefaceJ, 0), this.f1396k, (this.f1395j & 2) != 0);
                    }
                }
                this.f1398m = this.f1397l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1397l != null || (strO = z0Var.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1396k == -1) {
            this.f1397l = Typeface.create(strO, this.f1395j);
        } else {
            this.f1397l = f.a(Typeface.create(strO, 0), this.f1396k, (this.f1395j & 2) != 0);
        }
    }

    public final void a(Drawable drawable, x0 x0Var) {
        if (drawable == null || x0Var == null) {
            return;
        }
        i.i(drawable, x0Var, this.f1386a.getDrawableState());
    }

    public void b() {
        if (this.f1387b != null || this.f1388c != null || this.f1389d != null || this.f1390e != null) {
            Drawable[] compoundDrawables = this.f1386a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1387b);
            a(compoundDrawables[1], this.f1388c);
            a(compoundDrawables[2], this.f1389d);
            a(compoundDrawables[3], this.f1390e);
        }
        if (this.f1391f == null && this.f1392g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f1386a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f1391f);
        a(compoundDrawablesRelative[2], this.f1392g);
    }

    public void c() {
        this.f1394i.a();
    }

    public int e() {
        return this.f1394i.f();
    }

    public int f() {
        return this.f1394i.g();
    }

    public int g() {
        return this.f1394i.h();
    }

    public int[] h() {
        return this.f1394i.i();
    }

    public int i() {
        return this.f1394i.j();
    }

    public ColorStateList j() {
        x0 x0Var = this.f1393h;
        if (x0Var != null) {
            return x0Var.f1382a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        x0 x0Var = this.f1393h;
        if (x0Var != null) {
            return x0Var.f1383b;
        }
        return null;
    }

    public boolean l() {
        return this.f1394i.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.m(android.util.AttributeSet, int):void");
    }

    public void n(WeakReference weakReference, Typeface typeface) {
        if (this.f1398m) {
            this.f1397l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f1395j));
                } else {
                    textView.setTypeface(typeface, this.f1395j);
                }
            }
        }
    }

    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (k1.f1227c) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i10) {
        String strO;
        z0 z0VarT = z0.t(context, i10, c.j.TextAppearance);
        int i11 = c.j.TextAppearance_textAllCaps;
        if (z0VarT.s(i11)) {
            s(z0VarT.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        int i13 = c.j.TextAppearance_android_textSize;
        if (z0VarT.s(i13) && z0VarT.f(i13, -1) == 0) {
            this.f1386a.setTextSize(0, 0.0f);
        }
        C(context, z0VarT);
        if (i12 >= 26) {
            int i14 = c.j.TextAppearance_fontVariationSettings;
            if (z0VarT.s(i14) && (strO = z0VarT.o(i14)) != null) {
                e.d(this.f1386a, strO);
            }
        }
        z0VarT.x();
        Typeface typeface = this.f1397l;
        if (typeface != null) {
            this.f1386a.setTypeface(typeface, this.f1395j);
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        v0.c.f(editorInfo, textView.getText());
    }

    public void s(boolean z10) {
        this.f1386a.setAllCaps(z10);
    }

    public void t(int i10, int i11, int i12, int i13) {
        this.f1394i.p(i10, i11, i12, i13);
    }

    public void u(int[] iArr, int i10) {
        this.f1394i.q(iArr, i10);
    }

    public void v(int i10) {
        this.f1394i.r(i10);
    }

    public void w(ColorStateList colorStateList) {
        if (this.f1393h == null) {
            this.f1393h = new x0();
        }
        x0 x0Var = this.f1393h;
        x0Var.f1382a = colorStateList;
        x0Var.f1385d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.f1393h == null) {
            this.f1393h = new x0();
        }
        x0 x0Var = this.f1393h;
        x0Var.f1383b = mode;
        x0Var.f1384c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f1386a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f1386a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f1386a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f1386a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f1386a.getCompoundDrawables();
        TextView textView2 = this.f1386a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void z() {
        x0 x0Var = this.f1393h;
        this.f1387b = x0Var;
        this.f1388c = x0Var;
        this.f1389d = x0Var;
        this.f1390e = x0Var;
        this.f1391f = x0Var;
        this.f1392g = x0Var;
    }
}
