package androidx.compose.ui.layout;

import u.t;
import v1.c0;
import v1.d0;
import v1.e0;
import v1.k;
import v1.l;
import x1.j0;
import z0.m;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final t f1148a;

    /* renamed from: b, reason: collision with root package name */
    public static final d0[] f1149b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f1150c;

    static {
        t tVar = new t(8);
        d0.f23772a.getClass();
        e0 e0Var = c0.f23766g;
        tVar.h(1, e0Var);
        e0 e0Var2 = c0.f23765f;
        tVar.h(2, e0Var2);
        e0 e0Var3 = c0.f23761b;
        tVar.h(4, e0Var3);
        e0 e0Var4 = c0.f23763d;
        tVar.h(8, e0Var4);
        e0 e0Var5 = c0.f23767h;
        tVar.h(16, e0Var5);
        e0 e0Var6 = c0.f23764e;
        tVar.h(32, e0Var6);
        e0 e0Var7 = c0.f23768i;
        tVar.h(64, e0Var7);
        f1148a = tVar;
        f1149b = new d0[]{e0Var, e0Var2, e0Var3, e0Var7, e0Var5, e0Var6, e0Var4, c0.j, c0.f23762c};
        t tVar2 = new t(7);
        tVar2.h(1, e0Var);
        tVar2.h(2, e0Var2);
        tVar2.h(4, e0Var3);
        tVar2.h(16, e0Var5);
        tVar2.h(64, e0Var7);
        tVar2.h(32, e0Var6);
        tVar2.h(8, e0Var4);
        f1150c = tVar2;
    }

    public static final void a(j0 j0Var, k kVar, long j, int i10, int i11) {
        if (io.sentry.config.a.N(j, -1L)) {
            return;
        }
        j0Var.a(kVar.b(), (int) ((j >>> 48) & 65535));
        j0Var.a(kVar.d(), (int) ((j >>> 32) & 65535));
        j0Var.a(kVar.c(), i10 - ((int) ((j >>> 16) & 65535)));
        j0Var.a(kVar.a(), i11 - ((int) (j & 65535)));
    }

    public static final m b(l lVar) {
        return new RulerProviderModifierElement(lVar);
    }
}
