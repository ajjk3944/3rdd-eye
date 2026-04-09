package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import s.f;

/* loaded from: classes.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f1194a;

    /* renamed from: b, reason: collision with root package name */
    private u0 f1195b;

    /* renamed from: c, reason: collision with root package name */
    private u0 f1196c;

    /* renamed from: d, reason: collision with root package name */
    private u0 f1197d;

    /* renamed from: e, reason: collision with root package name */
    private u0 f1198e;

    /* renamed from: f, reason: collision with root package name */
    private u0 f1199f;

    /* renamed from: g, reason: collision with root package name */
    private u0 f1200g;

    /* renamed from: h, reason: collision with root package name */
    private u0 f1201h;

    /* renamed from: i, reason: collision with root package name */
    private final a0 f1202i;

    /* renamed from: j, reason: collision with root package name */
    private int f1203j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f1204k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f1205l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1206m;

    private static class a extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<y> f1207a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1208b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1209c;

        /* renamed from: androidx.appcompat.widget.y$a$a, reason: collision with other inner class name */
        private class RunnableC0007a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            private final WeakReference<y> f1210b;

            /* renamed from: c, reason: collision with root package name */
            private final Typeface f1211c;

            RunnableC0007a(WeakReference<y> weakReference, Typeface typeface) {
                this.f1210b = weakReference;
                this.f1211c = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                y yVar = this.f1210b.get();
                if (yVar == null) {
                    return;
                }
                yVar.B(this.f1211c);
            }
        }

        a(y yVar, int i2, int i3) {
            this.f1207a = new WeakReference<>(yVar);
            this.f1208b = i2;
            this.f1209c = i3;
        }

        @Override // s.f.a
        public void c(int i2) {
        }

        @Override // s.f.a
        public void d(Typeface typeface) {
            int i2;
            y yVar = this.f1207a.get();
            if (yVar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f1208b) != -1) {
                typeface = Typeface.create(typeface, i2, (this.f1209c & 2) != 0);
            }
            yVar.q(new RunnableC0007a(this.f1207a, typeface));
        }
    }

    y(TextView textView) {
        this.f1194a = textView;
        this.f1202i = new a0(textView);
    }

    private void A(int i2, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f1202i.y(i2, f2);
    }

    private void C(Context context, w0 w0Var) {
        String strN;
        Typeface typefaceCreate;
        Typeface typeface;
        this.f1203j = w0Var.j(a.j.M2, this.f1203j);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int iJ = w0Var.j(a.j.R2, -1);
            this.f1204k = iJ;
            if (iJ != -1) {
                this.f1203j = (this.f1203j & 2) | 0;
            }
        }
        int i3 = a.j.Q2;
        if (!w0Var.q(i3) && !w0Var.q(a.j.S2)) {
            int i4 = a.j.L2;
            if (w0Var.q(i4)) {
                this.f1206m = false;
                int iJ2 = w0Var.j(i4, 1);
                if (iJ2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iJ2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iJ2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f1205l = typeface;
                return;
            }
            return;
        }
        this.f1205l = null;
        int i5 = a.j.S2;
        if (w0Var.q(i5)) {
            i3 = i5;
        }
        int i6 = this.f1204k;
        int i7 = this.f1203j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceI = w0Var.i(i3, this.f1203j, new a(this, i6, i7));
                if (typefaceI != null) {
                    if (i2 >= 28 && this.f1204k != -1) {
                        typefaceI = Typeface.create(Typeface.create(typefaceI, 0), this.f1204k, (this.f1203j & 2) != 0);
                    }
                    this.f1205l = typefaceI;
                }
                this.f1206m = this.f1205l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1205l != null || (strN = w0Var.n(i3)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1204k == -1) {
            typefaceCreate = Typeface.create(strN, this.f1203j);
        } else {
            typefaceCreate = Typeface.create(Typeface.create(strN, 0), this.f1204k, (this.f1203j & 2) != 0);
        }
        this.f1205l = typefaceCreate;
    }

    private void a(Drawable drawable, u0 u0Var) {
        if (drawable == null || u0Var == null) {
            return;
        }
        j.i(drawable, u0Var, this.f1194a.getDrawableState());
    }

    private static u0 d(Context context, j jVar, int i2) {
        ColorStateList colorStateListF = jVar.f(context, i2);
        if (colorStateListF == null) {
            return null;
        }
        u0 u0Var = new u0();
        u0Var.f1135d = true;
        u0Var.f1132a = colorStateListF;
        return u0Var;
    }

    private void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1194a.getCompoundDrawablesRelative();
            TextView textView = this.f1194a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        if (i2 >= 17) {
            Drawable[] compoundDrawablesRelative2 = this.f1194a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                TextView textView2 = this.f1194a;
                Drawable drawable7 = compoundDrawablesRelative2[0];
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable8 = compoundDrawablesRelative2[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                return;
            }
        }
        Drawable[] compoundDrawables = this.f1194a.getCompoundDrawables();
        TextView textView3 = this.f1194a;
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
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void y() {
        u0 u0Var = this.f1201h;
        this.f1195b = u0Var;
        this.f1196c = u0Var;
        this.f1197d = u0Var;
        this.f1198e = u0Var;
        this.f1199f = u0Var;
        this.f1200g = u0Var;
    }

    public void B(Typeface typeface) {
        if (this.f1206m) {
            this.f1194a.setTypeface(typeface);
            this.f1205l = typeface;
        }
    }

    void b() {
        if (this.f1195b != null || this.f1196c != null || this.f1197d != null || this.f1198e != null) {
            Drawable[] compoundDrawables = this.f1194a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1195b);
            a(compoundDrawables[1], this.f1196c);
            a(compoundDrawables[2], this.f1197d);
            a(compoundDrawables[3], this.f1198e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f1199f == null && this.f1200g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f1194a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f1199f);
            a(compoundDrawablesRelative[2], this.f1200g);
        }
    }

    void c() {
        this.f1202i.b();
    }

    int e() {
        return this.f1202i.j();
    }

    int f() {
        return this.f1202i.k();
    }

    int g() {
        return this.f1202i.l();
    }

    int[] h() {
        return this.f1202i.m();
    }

    int i() {
        return this.f1202i.n();
    }

    ColorStateList j() {
        u0 u0Var = this.f1201h;
        if (u0Var != null) {
            return u0Var.f1132a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        u0 u0Var = this.f1201h;
        if (u0Var != null) {
            return u0Var.f1133b;
        }
        return null;
    }

    boolean l() {
        return this.f1202i.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b A[PHI: r11 r13
  0x015b: PHI (r11v2 android.content.res.ColorStateList) = (r11v1 android.content.res.ColorStateList), (r11v7 android.content.res.ColorStateList) binds: [B:62:0x0134, B:70:0x0154] A[DONT_GENERATE, DONT_INLINE]
  0x015b: PHI (r13v2 android.content.res.ColorStateList) = (r13v1 android.content.res.ColorStateList), (r13v4 android.content.res.ColorStateList) binds: [B:62:0x0134, B:70:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0196  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m(android.util.AttributeSet r24, int r25) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.m(android.util.AttributeSet, int):void");
    }

    void n(boolean z2, int i2, int i3, int i4, int i5) {
        if (androidx.core.widget.b.f1516a) {
            return;
        }
        c();
    }

    void o() {
        b();
    }

    void p(Context context, int i2) {
        String strN;
        ColorStateList colorStateListC;
        w0 w0VarR = w0.r(context, i2, a.j.J2);
        int i3 = a.j.U2;
        if (w0VarR.q(i3)) {
            r(w0VarR.a(i3, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23) {
            int i5 = a.j.N2;
            if (w0VarR.q(i5) && (colorStateListC = w0VarR.c(i5)) != null) {
                this.f1194a.setTextColor(colorStateListC);
            }
        }
        int i6 = a.j.K2;
        if (w0VarR.q(i6) && w0VarR.e(i6, -1) == 0) {
            this.f1194a.setTextSize(0, 0.0f);
        }
        C(context, w0VarR);
        if (i4 >= 26) {
            int i7 = a.j.T2;
            if (w0VarR.q(i7) && (strN = w0VarR.n(i7)) != null) {
                this.f1194a.setFontVariationSettings(strN);
            }
        }
        w0VarR.u();
        Typeface typeface = this.f1205l;
        if (typeface != null) {
            this.f1194a.setTypeface(typeface, this.f1203j);
        }
    }

    public void q(Runnable runnable) {
        this.f1194a.post(runnable);
    }

    void r(boolean z2) {
        this.f1194a.setAllCaps(z2);
    }

    void s(int i2, int i3, int i4, int i5) {
        this.f1202i.u(i2, i3, i4, i5);
    }

    void t(int[] iArr, int i2) {
        this.f1202i.v(iArr, i2);
    }

    void u(int i2) {
        this.f1202i.w(i2);
    }

    void v(ColorStateList colorStateList) {
        if (this.f1201h == null) {
            this.f1201h = new u0();
        }
        u0 u0Var = this.f1201h;
        u0Var.f1132a = colorStateList;
        u0Var.f1135d = colorStateList != null;
        y();
    }

    void w(PorterDuff.Mode mode) {
        if (this.f1201h == null) {
            this.f1201h = new u0();
        }
        u0 u0Var = this.f1201h;
        u0Var.f1133b = mode;
        u0Var.f1134c = mode != null;
        y();
    }

    void z(int i2, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (androidx.core.widget.b.f1516a || l()) {
            return;
        }
        A(i2, f2);
    }
}
