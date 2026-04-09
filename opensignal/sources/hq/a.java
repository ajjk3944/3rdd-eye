package hq;

import br.l;
import gu.f;
import iu.e;
import ku.c1;
import ku.k0;
import ku.p0;
import ku.r0;
import ku.z;
import xu.d;

/* loaded from: classes.dex */
public final class a implements z {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10862a;
    private static final /* synthetic */ r0 descriptor;

    static {
        a aVar = new a();
        f10862a = aVar;
        r0 r0Var = new r0("com.survicate.surveys.traits.UserTrait", aVar, 4);
        r0Var.b("key", false);
        r0Var.b("value", false);
        r0Var.b("timestamp_ms", true);
        r0Var.b("throttled_to_ms", true);
        descriptor = r0Var;
    }

    @Override // ku.z
    public final gu.a[] childSerializers() {
        k0 k0Var = k0.f14571a;
        gu.a aVarF = d.F(k0Var);
        gu.a aVarF2 = d.F(k0Var);
        c1 c1Var = c1.f14534a;
        return new gu.a[]{c1Var, c1Var, aVarF, aVarF2};
    }

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        r0 r0Var = descriptor;
        ju.a aVarB = cVar.b(r0Var);
        int i10 = 0;
        String strQ = null;
        String strQ2 = null;
        Long l10 = null;
        Long l11 = null;
        boolean z10 = true;
        while (z10) {
            int iT = aVarB.t(r0Var);
            if (iT == -1) {
                z10 = false;
            } else if (iT == 0) {
                strQ = aVarB.q(r0Var, 0);
                i10 |= 1;
            } else if (iT == 1) {
                strQ2 = aVarB.q(r0Var, 1);
                i10 |= 2;
            } else if (iT == 2) {
                l10 = (Long) aVarB.y(r0Var, 2, k0.f14571a, l10);
                i10 |= 4;
            } else {
                if (iT != 3) {
                    throw new f(iT);
                }
                l11 = (Long) aVarB.y(r0Var, 3, k0.f14571a, l11);
                i10 |= 8;
            }
        }
        aVarB.c(r0Var);
        return new c(i10, strQ, strQ2, l10, l11, null);
    }

    @Override // gu.a
    public final e getDescriptor() {
        return descriptor;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        c cVar = (c) obj;
        l.e(cVar, "value");
        r0 r0Var = descriptor;
        ju.b bVarB = dVar.b(r0Var);
        c.f(cVar, bVarB, r0Var);
        bVarB.c(r0Var);
    }

    @Override // ku.z
    public final gu.a[] typeParametersSerializers() {
        return p0.f14595b;
    }
}
