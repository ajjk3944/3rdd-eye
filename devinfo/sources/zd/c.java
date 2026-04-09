package zd;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.y0;
import ec.r2;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements r2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k1 f38245a;

    public c(k1 k1Var) {
        this.f38245a = k1Var;
    }

    @Override // ec.r2
    public final String A1() {
        g0 g0Var = new g0();
        k1 k1Var = this.f38245a;
        k1Var.c(new c1(k1Var, g0Var, 1));
        return (String) g0.T(String.class, g0Var.S(50L));
    }

    @Override // ec.r2
    public final long B1() {
        g0 g0Var = new g0();
        k1 k1Var = this.f38245a;
        k1Var.c(new c1(k1Var, g0Var, 2));
        Long l10 = (Long) g0.T(Long.class, g0Var.S(500L));
        if (l10 != null) {
            return l10.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i4 = k1Var.f19797d + 1;
        k1Var.f19797d = i4;
        return jNextLong + i4;
    }

    @Override // ec.r2
    public final String C1() {
        g0 g0Var = new g0();
        k1 k1Var = this.f38245a;
        k1Var.c(new c1(k1Var, g0Var, 4));
        return (String) g0.T(String.class, g0Var.S(500L));
    }

    @Override // ec.r2
    public final void D(Bundle bundle) {
        k1 k1Var = this.f38245a;
        k1Var.c(new x0(k1Var, bundle, 0));
    }

    @Override // ec.r2
    public final String D1() {
        g0 g0Var = new g0();
        k1 k1Var = this.f38245a;
        k1Var.c(new c1(k1Var, g0Var, 0));
        return (String) g0.T(String.class, g0Var.S(500L));
    }

    @Override // ec.r2
    public final void L(String str) {
        k1 k1Var = this.f38245a;
        k1Var.c(new a1(k1Var, str, 1));
    }

    @Override // ec.r2
    public final void M(String str, String str2, Bundle bundle) {
        k1 k1Var = this.f38245a;
        k1Var.c(new e1(k1Var, str, str2, bundle, true));
    }

    @Override // ec.r2
    public final void N(String str, String str2, Bundle bundle) {
        k1 k1Var = this.f38245a;
        k1Var.c(new y0(k1Var, str, str2, bundle));
    }

    @Override // ec.r2
    public final void O(String str) {
        k1 k1Var = this.f38245a;
        k1Var.c(new a1(k1Var, str, 0));
    }

    @Override // ec.r2
    public final int P(String str) {
        return this.f38245a.b(str);
    }

    @Override // ec.r2
    public final List Q(String str, String str2) {
        return this.f38245a.f(str, str2);
    }

    @Override // ec.r2
    public final Map R(String str, String str2, boolean z3) {
        return this.f38245a.a(str, str2, z3);
    }

    @Override // ec.r2
    public final String z1() {
        g0 g0Var = new g0();
        k1 k1Var = this.f38245a;
        k1Var.c(new c1(k1Var, g0Var, 3));
        return (String) g0.T(String.class, g0Var.S(500L));
    }
}
