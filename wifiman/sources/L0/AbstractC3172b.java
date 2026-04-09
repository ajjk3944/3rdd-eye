package L0;

import L0.F;
import M0.f0;
import W0.e;
import W0.f;
import W0.j;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;

/* renamed from: L0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3172b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence j(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        U0.c.u(spannableString, new O0.c(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(f0 f0Var, int i10) {
        int iM = f0Var.m();
        for (int i11 = 0; i11 < iM; i11++) {
            if (f0Var.l(i11) > i10) {
                return i11;
            }
        }
        return f0Var.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(U u10, boolean z10) {
        if (!z10 || Y0.v.e(u10.q(), Y0.w.g(0)) || Y0.v.e(u10.q(), Y0.v.f24549b.a())) {
            return false;
        }
        int iZ = u10.z();
        j.a aVar = W0.j.f23523b;
        return (W0.j.k(iZ, aVar.g()) || W0.j.k(u10.z(), aVar.f()) || W0.j.k(u10.z(), aVar.c())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(int i10) {
        j.a aVar = W0.j.f23523b;
        if (W0.j.k(i10, aVar.d())) {
            return 3;
        }
        if (W0.j.k(i10, aVar.e())) {
            return 4;
        }
        if (W0.j.k(i10, aVar.a())) {
            return 2;
        }
        return (!W0.j.k(i10, aVar.f()) && W0.j.k(i10, aVar.b())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(int i10) {
        f.b.a aVar = f.b.f23494a;
        if (f.b.e(i10, aVar.c())) {
            return 0;
        }
        if (f.b.e(i10, aVar.b())) {
            return 1;
        }
        return f.b.e(i10, aVar.a()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(int i10) {
        e.a aVar = W0.e.f23483b;
        if (W0.e.g(i10, aVar.a())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        W0.e.g(i10, aVar.b());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(int i10) {
        f.c.a aVar = f.c.f23499a;
        if (f.c.f(i10, aVar.a())) {
            return 0;
        }
        if (f.c.f(i10, aVar.b())) {
            return 1;
        }
        if (f.c.f(i10, aVar.c())) {
            return 2;
        }
        return f.c.f(i10, aVar.d()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(int i10) {
        f.d.a aVar = f.d.f23505a;
        return (!f.d.d(i10, aVar.a()) && f.d.d(i10, aVar.b())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(int i10) {
        F.a aVar = F.f11064a;
        return (!F.d(i10, aVar.a()) && F.d(i10, aVar.b())) ? 1 : 0;
    }
}
