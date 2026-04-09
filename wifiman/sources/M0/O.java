package M0;

import android.os.Build;
import android.text.StaticLayout;

/* loaded from: classes.dex */
final class O implements b0 {
    @Override // M0.b0
    public StaticLayout a(c0 c0Var) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(c0Var.r(), c0Var.q(), c0Var.e(), c0Var.o(), c0Var.u());
        builderObtain.setTextDirection(c0Var.s());
        builderObtain.setAlignment(c0Var.a());
        builderObtain.setMaxLines(c0Var.n());
        builderObtain.setEllipsize(c0Var.c());
        builderObtain.setEllipsizedWidth(c0Var.d());
        builderObtain.setLineSpacing(c0Var.l(), c0Var.m());
        builderObtain.setIncludePad(c0Var.g());
        builderObtain.setBreakStrategy(c0Var.b());
        builderObtain.setHyphenationFrequency(c0Var.f());
        builderObtain.setIndents(c0Var.i(), c0Var.p());
        int i10 = Build.VERSION.SDK_INT;
        P.a(builderObtain, c0Var.h());
        if (i10 >= 28) {
            S.a(builderObtain, c0Var.t());
        }
        if (i10 >= 33) {
            Z.b(builderObtain, c0Var.j(), c0Var.k());
        }
        return builderObtain.build();
    }

    @Override // M0.b0
    public boolean b(StaticLayout staticLayout, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return Z.a(staticLayout);
        }
        if (i10 >= 28) {
            return z10;
        }
        return false;
    }
}
