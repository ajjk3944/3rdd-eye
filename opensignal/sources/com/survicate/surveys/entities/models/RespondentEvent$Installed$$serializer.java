package com.survicate.surveys.entities.models;

import br.l;
import com.survicate.surveys.entities.models.RespondentEvent;
import gu.f;
import iu.e;
import ju.b;
import ju.d;
import kotlin.Metadata;
import ku.c1;
import ku.p0;
import ku.r0;
import ku.y0;
import ku.z;
import lq.c;

@c
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/survicate/surveys/entities/models/RespondentEvent.Installed.$serializer", "Lku/z;", "Lcom/survicate/surveys/entities/models/RespondentEvent$Installed;", "<init>", "()V", "", "Lgu/a;", "childSerializers", "()[Lgu/a;", "Lju/c;", "decoder", "deserialize", "(Lju/c;)Lcom/survicate/surveys/entities/models/RespondentEvent$Installed;", "Lju/d;", "encoder", "value", "Llq/b0;", "serialize", "(Lju/d;Lcom/survicate/surveys/entities/models/RespondentEvent$Installed;)V", "Liu/e;", "getDescriptor", "()Liu/e;", "descriptor", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RespondentEvent$Installed$$serializer implements z {
    public static final RespondentEvent$Installed$$serializer INSTANCE;
    private static final /* synthetic */ r0 descriptor;

    static {
        RespondentEvent$Installed$$serializer respondentEvent$Installed$$serializer = new RespondentEvent$Installed$$serializer();
        INSTANCE = respondentEvent$Installed$$serializer;
        r0 r0Var = new r0("installed", respondentEvent$Installed$$serializer, 1);
        r0Var.b("platform", true);
        descriptor = r0Var;
    }

    private RespondentEvent$Installed$$serializer() {
    }

    @Override // ku.z
    public gu.a[] childSerializers() {
        return new gu.a[]{c1.f14534a};
    }

    @Override // gu.a
    public RespondentEvent.Installed deserialize(ju.c decoder) {
        l.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        ju.a aVarB = decoder.b(descriptor2);
        boolean z10 = true;
        int i10 = 0;
        String strQ = null;
        while (z10) {
            int iT = aVarB.t(descriptor2);
            if (iT == -1) {
                z10 = false;
            } else {
                if (iT != 0) {
                    throw new f(iT);
                }
                strQ = aVarB.q(descriptor2, 0);
                i10 = 1;
            }
        }
        aVarB.c(descriptor2);
        return new RespondentEvent.Installed(i10, strQ, (y0) null);
    }

    @Override // gu.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // gu.a
    public void serialize(d encoder, RespondentEvent.Installed value) {
        l.e(encoder, "encoder");
        l.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarB = encoder.b(descriptor2);
        RespondentEvent.Installed.write$Self(value, bVarB, descriptor2);
        bVarB.c(descriptor2);
    }

    @Override // ku.z
    public gu.a[] typeParametersSerializers() {
        return p0.f14595b;
    }
}
