package wg;

import ku.e0;
import ku.k0;
import ku.p0;
import ku.q;
import ku.r0;
import ku.z;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements z {

    /* renamed from: a, reason: collision with root package name */
    public static final f f24503a;
    private static final iu.e descriptor;

    static {
        f fVar = new f();
        f24503a = fVar;
        r0 r0Var = new r0("com.google.firebase.sessions.settings.SessionConfigs", fVar, 5);
        r0Var.b("sessionsEnabled", false);
        r0Var.b("sessionSamplingRate", false);
        r0Var.b("sessionTimeoutSeconds", false);
        r0Var.b("cacheDurationSeconds", false);
        r0Var.b("cacheUpdatedTimeSeconds", false);
        descriptor = r0Var;
    }

    @Override // ku.z
    public final gu.a[] childSerializers() {
        gu.a aVarF = xu.d.F(ku.f.f14545a);
        gu.a aVarF2 = xu.d.F(q.f14598a);
        e0 e0Var = e0.f14542a;
        return new gu.a[]{aVarF, aVarF2, xu.d.F(e0Var), xu.d.F(e0Var), xu.d.F(k0.f14571a)};
    }

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        iu.e eVar = descriptor;
        ju.a aVarB = cVar.b(eVar);
        int i10 = 0;
        Boolean bool = null;
        Double d6 = null;
        Integer num = null;
        Integer num2 = null;
        Long l10 = null;
        boolean z10 = true;
        while (z10) {
            int iT = aVarB.t(eVar);
            if (iT == -1) {
                z10 = false;
            } else if (iT == 0) {
                bool = (Boolean) aVarB.y(eVar, 0, ku.f.f14545a, bool);
                i10 |= 1;
            } else if (iT == 1) {
                d6 = (Double) aVarB.y(eVar, 1, q.f14598a, d6);
                i10 |= 2;
            } else if (iT == 2) {
                num = (Integer) aVarB.y(eVar, 2, e0.f14542a, num);
                i10 |= 4;
            } else if (iT == 3) {
                num2 = (Integer) aVarB.y(eVar, 3, e0.f14542a, num2);
                i10 |= 8;
            } else {
                if (iT != 4) {
                    throw new gu.f(iT);
                }
                l10 = (Long) aVarB.y(eVar, 4, k0.f14571a, l10);
                i10 |= 16;
            }
        }
        aVarB.c(eVar);
        return new h(i10, bool, d6, num, num2, l10);
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return descriptor;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        h hVar = (h) obj;
        br.l.e(hVar, "value");
        iu.e eVar = descriptor;
        ju.b bVarB = dVar.b(eVar);
        bVarB.i(eVar, 0, ku.f.f14545a, hVar.f24504a);
        bVarB.i(eVar, 1, q.f14598a, hVar.f24505b);
        e0 e0Var = e0.f14542a;
        bVarB.i(eVar, 2, e0Var, hVar.f24506c);
        bVarB.i(eVar, 3, e0Var, hVar.f24507d);
        bVarB.i(eVar, 4, k0.f14571a, hVar.f24508e);
        bVarB.c(eVar);
    }

    @Override // ku.z
    public final gu.a[] typeParametersSerializers() {
        return p0.f14595b;
    }
}
