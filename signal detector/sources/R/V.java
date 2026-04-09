package R;

import A3.C0134c;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.internal.ads.C2195yo;
import h0.C2351a;
import j$.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class V implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final C2195yo f3284a;

    /* renamed from: b, reason: collision with root package name */
    public r0 f3285b;

    public V(View view, C2195yo c2195yo) {
        r0 r0VarB;
        this.f3284a = c2195yo;
        WeakHashMap weakHashMap = O.f3270a;
        r0 r0VarA = G.a(view);
        if (r0VarA != null) {
            int i = Build.VERSION.SDK_INT;
            r0VarB = (i >= 34 ? new e0(r0VarA) : i >= 30 ? new d0(r0VarA) : i >= 29 ? new c0(r0VarA) : new b0(r0VarA)).b();
        } else {
            r0VarB = null;
        }
        this.f3285b = r0VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z6;
        if (!view.isLaidOut()) {
            this.f3285b = r0.g(view, windowInsets);
            return W.i(view, windowInsets);
        }
        r0 r0VarG = r0.g(view, windowInsets);
        o0 o0Var = r0VarG.f3359a;
        if (this.f3285b == null) {
            WeakHashMap weakHashMap = O.f3270a;
            this.f3285b = G.a(view);
        }
        if (this.f3285b == null) {
            this.f3285b = r0VarG;
            return W.i(view, windowInsets);
        }
        C2195yo c2195yoJ = W.j(view);
        if (c2195yoJ != null && Objects.equals((r0) c2195yoJ.f17764c, r0VarG)) {
            return W.i(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        r0 r0Var = this.f3285b;
        int i = 1;
        while (i <= 512) {
            J.c cVarF = o0Var.f(i);
            J.c cVarF2 = r0Var.f3359a.f(i);
            int i3 = cVarF.f2007a;
            int i6 = cVarF.f2010d;
            int i7 = cVarF.f2009c;
            int i8 = cVarF.f2008b;
            int i9 = cVarF2.f2007a;
            int i10 = cVarF2.f2010d;
            int i11 = cVarF2.f2009c;
            int i12 = cVarF2.f2008b;
            if (i3 > i9 || i8 > i12 || i7 > i11 || i6 > i10) {
                iArr = iArr2;
                z6 = true;
            } else {
                iArr = iArr2;
                z6 = false;
            }
            if (z6 != (i3 < i9 || i8 < i12 || i7 < i11 || i6 < i10)) {
                if (z6) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i13 = iArr2[0];
        int i14 = iArr3[0];
        int i15 = i13 | i14;
        if (i15 == 0) {
            this.f3285b = r0VarG;
            return W.i(view, windowInsets);
        }
        r0 r0Var2 = this.f3285b;
        a0 a0Var = new a0(i15, (i13 & 8) != 0 ? W.f3286e : (i14 & 8) != 0 ? W.f3287f : (i13 & 519) != 0 ? W.f3288g : (i14 & 519) != 0 ? W.f3289h : null, (i15 & 8) != 0 ? 160L : 250L);
        a0Var.f3300a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(a0Var.f3300a.a());
        J.c cVarF3 = o0Var.f(i15);
        J.c cVarF4 = r0Var2.f3359a.f(i15);
        int iMin = Math.min(cVarF3.f2007a, cVarF4.f2007a);
        int i16 = cVarF3.f2008b;
        int i17 = cVarF4.f2008b;
        int iMin2 = Math.min(i16, i17);
        int i18 = cVarF3.f2009c;
        int i19 = cVarF4.f2009c;
        int iMin3 = Math.min(i18, i19);
        int i20 = cVarF3.f2010d;
        int i21 = cVarF4.f2010d;
        C2351a c2351a = new C2351a(J.c.b(iMin, iMin2, iMin3, Math.min(i20, i21)), 10, J.c.b(Math.max(cVarF3.f2007a, cVarF4.f2007a), Math.max(i16, i17), Math.max(i18, i19), Math.max(i20, i21)));
        W.f(view, r0VarG, false);
        duration.addUpdateListener(new U(a0Var, r0VarG, r0Var2, i15, view));
        duration.addListener(new C0134c(view, 3, a0Var));
        ViewTreeObserverOnPreDrawListenerC0190q.a(view, new A2.C(view, a0Var, c2351a, duration));
        this.f3285b = r0VarG;
        return W.i(view, windowInsets);
    }
}
