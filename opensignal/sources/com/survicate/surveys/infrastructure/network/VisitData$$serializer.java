package com.survicate.surveys.infrastructure.network;

import br.l;
import gu.a;
import gu.f;
import iu.e;
import ju.b;
import kotlin.Metadata;
import ku.c1;
import ku.p0;
import ku.r0;
import ku.z;
import lq.c;
import xu.d;

@c
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/survicate/surveys/infrastructure/network/VisitData.$serializer", "Lku/z;", "Lcom/survicate/surveys/infrastructure/network/VisitData;", "<init>", "()V", "", "Lgu/a;", "childSerializers", "()[Lgu/a;", "Lju/c;", "decoder", "deserialize", "(Lju/c;)Lcom/survicate/surveys/infrastructure/network/VisitData;", "Lju/d;", "encoder", "value", "Llq/b0;", "serialize", "(Lju/d;Lcom/survicate/surveys/infrastructure/network/VisitData;)V", "Liu/e;", "getDescriptor", "()Liu/e;", "descriptor", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VisitData$$serializer implements z {
    public static final VisitData$$serializer INSTANCE;
    private static final /* synthetic */ r0 descriptor;

    static {
        VisitData$$serializer visitData$$serializer = new VisitData$$serializer();
        INSTANCE = visitData$$serializer;
        r0 r0Var = new r0("com.survicate.surveys.infrastructure.network.VisitData", visitData$$serializer, 3);
        r0Var.b("translation", true);
        r0Var.b("platform", true);
        r0Var.b("user_agent", true);
        descriptor = r0Var;
    }

    private VisitData$$serializer() {
    }

    @Override // ku.z
    public a[] childSerializers() {
        c1 c1Var = c1.f14534a;
        return new a[]{d.F(c1Var), c1Var, c1Var};
    }

    @Override // gu.a
    public VisitData deserialize(ju.c decoder) {
        l.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        ju.a aVarB = decoder.b(descriptor2);
        int i10 = 0;
        String str = null;
        String strQ = null;
        String strQ2 = null;
        boolean z10 = true;
        while (z10) {
            int iT = aVarB.t(descriptor2);
            if (iT == -1) {
                z10 = false;
            } else if (iT == 0) {
                str = (String) aVarB.y(descriptor2, 0, c1.f14534a, str);
                i10 |= 1;
            } else if (iT == 1) {
                strQ = aVarB.q(descriptor2, 1);
                i10 |= 2;
            } else {
                if (iT != 2) {
                    throw new f(iT);
                }
                strQ2 = aVarB.q(descriptor2, 2);
                i10 |= 4;
            }
        }
        aVarB.c(descriptor2);
        return new VisitData(i10, str, strQ, strQ2, null);
    }

    @Override // gu.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // gu.a
    public void serialize(ju.d encoder, VisitData value) {
        l.e(encoder, "encoder");
        l.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarB = encoder.b(descriptor2);
        VisitData.write$Self(value, bVarB, descriptor2);
        bVarB.c(descriptor2);
    }

    @Override // ku.z
    public a[] typeParametersSerializers() {
        return p0.f14595b;
    }
}
