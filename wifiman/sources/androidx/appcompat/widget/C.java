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
import h.AbstractC5936j;
import java.lang.ref.WeakReference;
import v1.h;

/* loaded from: classes.dex */
class C {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f27059a;

    /* renamed from: b, reason: collision with root package name */
    private Z f27060b;

    /* renamed from: c, reason: collision with root package name */
    private Z f27061c;

    /* renamed from: d, reason: collision with root package name */
    private Z f27062d;

    /* renamed from: e, reason: collision with root package name */
    private Z f27063e;

    /* renamed from: f, reason: collision with root package name */
    private Z f27064f;

    /* renamed from: g, reason: collision with root package name */
    private Z f27065g;

    /* renamed from: h, reason: collision with root package name */
    private Z f27066h;

    /* renamed from: i, reason: collision with root package name */
    private final E f27067i;

    /* renamed from: j, reason: collision with root package name */
    private int f27068j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f27069k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f27070l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f27071m;

    class a extends h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f27072a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27073b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f27074c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f27072a = i10;
            this.f27073b = i11;
            this.f27074c = weakReference;
        }

        @Override // v1.h.e
        /* renamed from: h */
        public void f(int i10) {
        }

        @Override // v1.h.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f27072a) != -1) {
                typeface = e.a(typeface, i10, (this.f27073b & 2) != 0);
            }
            C.this.n(this.f27074c, typeface);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f27076a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f27077b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27078c;

        b(TextView textView, Typeface typeface, int i10) {
            this.f27076a = textView;
            this.f27077b = typeface;
            this.f27078c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27076a.setTypeface(this.f27077b, this.f27078c);
        }
    }

    static class c {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class d {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class e {
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    C(TextView textView) {
        this.f27059a = textView;
        this.f27067i = new E(textView);
    }

    private void B(int i10, float f10) {
        this.f27067i.t(i10, f10);
    }

    private void C(Context context, b0 b0Var) {
        String strO;
        this.f27068j = b0Var.k(AbstractC5936j.f48268q2, this.f27068j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iK = b0Var.k(AbstractC5936j.f48276s2, -1);
            this.f27069k = iK;
            if (iK != -1) {
                this.f27068j &= 2;
            }
        }
        int i11 = AbstractC5936j.f48272r2;
        if (!b0Var.s(i11) && !b0Var.s(AbstractC5936j.f48280t2)) {
            int i12 = AbstractC5936j.f48264p2;
            if (b0Var.s(i12)) {
                this.f27071m = false;
                int iK2 = b0Var.k(i12, 1);
                if (iK2 == 1) {
                    this.f27070l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f27070l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f27070l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f27070l = null;
        int i13 = AbstractC5936j.f48280t2;
        if (b0Var.s(i13)) {
            i11 = i13;
        }
        int i14 = this.f27069k;
        int i15 = this.f27068j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = b0Var.j(i11, this.f27068j, new a(i14, i15, new WeakReference(this.f27059a)));
                if (typefaceJ != null) {
                    if (i10 < 28 || this.f27069k == -1) {
                        this.f27070l = typefaceJ;
                    } else {
                        this.f27070l = e.a(Typeface.create(typefaceJ, 0), this.f27069k, (this.f27068j & 2) != 0);
                    }
                }
                this.f27071m = this.f27070l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f27070l != null || (strO = b0Var.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f27069k == -1) {
            this.f27070l = Typeface.create(strO, this.f27068j);
        } else {
            this.f27070l = e.a(Typeface.create(strO, 0), this.f27069k, (this.f27068j & 2) != 0);
        }
    }

    private void a(Drawable drawable, Z z10) {
        if (drawable == null || z10 == null) {
            return;
        }
        C3886k.i(drawable, z10, this.f27059a.getDrawableState());
    }

    private static Z d(Context context, C3886k c3886k, int i10) {
        ColorStateList colorStateListF = c3886k.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        Z z10 = new Z();
        z10.f27311d = true;
        z10.f27308a = colorStateListF;
        return z10;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f27059a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f27059a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f27059a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f27059a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f27059a.getCompoundDrawables();
        TextView textView2 = this.f27059a;
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

    private void z() {
        Z z10 = this.f27066h;
        this.f27060b = z10;
        this.f27061c = z10;
        this.f27062d = z10;
        this.f27063e = z10;
        this.f27064f = z10;
        this.f27065g = z10;
    }

    void A(int i10, float f10) {
        if (i0.f27413c || l()) {
            return;
        }
        B(i10, f10);
    }

    void b() {
        if (this.f27060b != null || this.f27061c != null || this.f27062d != null || this.f27063e != null) {
            Drawable[] compoundDrawables = this.f27059a.getCompoundDrawables();
            a(compoundDrawables[0], this.f27060b);
            a(compoundDrawables[1], this.f27061c);
            a(compoundDrawables[2], this.f27062d);
            a(compoundDrawables[3], this.f27063e);
        }
        if (this.f27064f == null && this.f27065g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f27059a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f27064f);
        a(compoundDrawablesRelative[2], this.f27065g);
    }

    void c() {
        this.f27067i.a();
    }

    int e() {
        return this.f27067i.f();
    }

    int f() {
        return this.f27067i.g();
    }

    int g() {
        return this.f27067i.h();
    }

    int[] h() {
        return this.f27067i.i();
    }

    int i() {
        return this.f27067i.j();
    }

    ColorStateList j() {
        Z z10 = this.f27066h;
        if (z10 != null) {
            return z10.f27308a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        Z z10 = this.f27066h;
        if (z10 != null) {
            return z10.f27309b;
        }
        return null;
    }

    boolean l() {
        return this.f27067i.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m(android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.f27071m) {
            this.f27070l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f27068j));
                } else {
                    textView.setTypeface(typeface, this.f27068j);
                }
            }
        }
    }

    void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (i0.f27413c) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i10) {
        String strO;
        b0 b0VarT = b0.t(context, i10, AbstractC5936j.f48256n2);
        int i11 = AbstractC5936j.f48288v2;
        if (b0VarT.s(i11)) {
            s(b0VarT.a(i11, false));
        }
        int i12 = AbstractC5936j.f48260o2;
        if (b0VarT.s(i12) && b0VarT.f(i12, -1) == 0) {
            this.f27059a.setTextSize(0, 0.0f);
        }
        C(context, b0VarT);
        int i13 = AbstractC5936j.f48284u2;
        if (b0VarT.s(i13) && (strO = b0VarT.o(i13)) != null) {
            d.d(this.f27059a, strO);
        }
        b0VarT.x();
        Typeface typeface = this.f27070l;
        if (typeface != null) {
            this.f27059a.setTypeface(typeface, this.f27068j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        I1.a.e(editorInfo, textView.getText());
    }

    void s(boolean z10) {
        this.f27059a.setAllCaps(z10);
    }

    void t(int i10, int i11, int i12, int i13) {
        this.f27067i.p(i10, i11, i12, i13);
    }

    void u(int[] iArr, int i10) {
        this.f27067i.q(iArr, i10);
    }

    void v(int i10) {
        this.f27067i.r(i10);
    }

    void w(ColorStateList colorStateList) {
        if (this.f27066h == null) {
            this.f27066h = new Z();
        }
        Z z10 = this.f27066h;
        z10.f27308a = colorStateList;
        z10.f27311d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f27066h == null) {
            this.f27066h = new Z();
        }
        Z z10 = this.f27066h;
        z10.f27309b = mode;
        z10.f27310c = mode != null;
        z();
    }
}
