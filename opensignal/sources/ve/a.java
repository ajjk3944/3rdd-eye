package ve;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.h0;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.y0;
import java.util.List;
import java.util.Map;
import java.util.Random;
import zc.e2;

/* loaded from: classes.dex */
public final class a implements e2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f23908a;

    public a(i1 i1Var) {
        this.f23908a = i1Var;
    }

    @Override // zc.e2
    public final String a() {
        h0 h0Var = new h0();
        i1 i1Var = this.f23908a;
        i1Var.c(new a1(i1Var, h0Var, 3));
        return (String) h0.f(h0Var.e(500L), String.class);
    }

    @Override // zc.e2
    public final String b() {
        h0 h0Var = new h0();
        i1 i1Var = this.f23908a;
        i1Var.c(new a1(i1Var, h0Var, 4));
        return (String) h0.f(h0Var.e(500L), String.class);
    }

    @Override // zc.e2
    public final void c(Bundle bundle) {
        i1 i1Var = this.f23908a;
        i1Var.c(new v0(i1Var, bundle));
    }

    @Override // zc.e2
    public final void d(String str) {
        i1 i1Var = this.f23908a;
        i1Var.c(new y0(i1Var, str, 1));
    }

    @Override // zc.e2
    public final void e(String str, String str2, Bundle bundle) {
        i1 i1Var = this.f23908a;
        i1Var.c(new c1(i1Var, str, str2, bundle, true));
    }

    @Override // zc.e2
    public final void f(String str) {
        i1 i1Var = this.f23908a;
        i1Var.c(new y0(i1Var, str, 0));
    }

    @Override // zc.e2
    public final long g() {
        h0 h0Var = new h0();
        i1 i1Var = this.f23908a;
        i1Var.c(new a1(i1Var, h0Var, 2));
        Long l10 = (Long) h0.f(h0Var.e(500L), Long.class);
        if (l10 != null) {
            return l10.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i10 = i1Var.f5070d + 1;
        i1Var.f5070d = i10;
        return jNextLong + i10;
    }

    @Override // zc.e2
    public final void h(String str, String str2, Bundle bundle) {
        i1 i1Var = this.f23908a;
        i1Var.c(new w0(i1Var, str, str2, bundle));
    }

    @Override // zc.e2
    public final List i(String str, String str2) {
        return this.f23908a.f(str, str2);
    }

    @Override // zc.e2
    public final int j(String str) {
        return this.f23908a.b(str);
    }

    @Override // zc.e2
    public final String k() {
        h0 h0Var = new h0();
        i1 i1Var = this.f23908a;
        i1Var.c(new a1(i1Var, h0Var, 1));
        return (String) h0.f(h0Var.e(50L), String.class);
    }

    @Override // zc.e2
    public final String l() {
        h0 h0Var = new h0();
        i1 i1Var = this.f23908a;
        i1Var.c(new a1(i1Var, h0Var, 0));
        return (String) h0.f(h0Var.e(500L), String.class);
    }

    @Override // zc.e2
    public final Map m(String str, String str2, boolean z10) {
        return this.f23908a.a(str, str2, z10);
    }
}
