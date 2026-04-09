package com.survicate.surveys.infrastructure.network.ai;

import br.l;
import gu.a;
import gu.f;
import iu.e;
import ju.b;
import ju.d;
import kotlin.Metadata;
import ku.p0;
import ku.r0;
import ku.z;
import lq.c;
import mu.y;

@c
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponse.$serializer", "Lku/z;", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponse;", "<init>", "()V", "", "Lgu/a;", "childSerializers", "()[Lgu/a;", "Lju/c;", "decoder", "deserialize", "(Lju/c;)Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponse;", "Lju/d;", "encoder", "value", "Llq/b0;", "serialize", "(Lju/d;Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionResponse;)V", "Liu/e;", "getDescriptor", "()Liu/e;", "descriptor", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FollowUpQuestionResponse$$serializer implements z {
    public static final FollowUpQuestionResponse$$serializer INSTANCE;
    private static final /* synthetic */ r0 descriptor;

    static {
        FollowUpQuestionResponse$$serializer followUpQuestionResponse$$serializer = new FollowUpQuestionResponse$$serializer();
        INSTANCE = followUpQuestionResponse$$serializer;
        r0 r0Var = new r0("com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionResponse", followUpQuestionResponse$$serializer, 1);
        r0Var.b("data", false);
        descriptor = r0Var;
    }

    private FollowUpQuestionResponse$$serializer() {
    }

    @Override // ku.z
    public a[] childSerializers() {
        return new a[]{FollowUpQuestionResponseData$$serializer.INSTANCE};
    }

    @Override // gu.a
    public FollowUpQuestionResponse deserialize(ju.c decoder) {
        l.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        ju.a aVarB = decoder.b(descriptor2);
        boolean z10 = true;
        int i10 = 0;
        FollowUpQuestionResponseData followUpQuestionResponseData = null;
        while (z10) {
            int iT = aVarB.t(descriptor2);
            if (iT == -1) {
                z10 = false;
            } else {
                if (iT != 0) {
                    throw new f(iT);
                }
                followUpQuestionResponseData = (FollowUpQuestionResponseData) aVarB.m(descriptor2, 0, FollowUpQuestionResponseData$$serializer.INSTANCE, followUpQuestionResponseData);
                i10 = 1;
            }
        }
        aVarB.c(descriptor2);
        return new FollowUpQuestionResponse(i10, followUpQuestionResponseData, null);
    }

    @Override // gu.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // gu.a
    public void serialize(d encoder, FollowUpQuestionResponse value) {
        l.e(encoder, "encoder");
        l.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarB = encoder.b(descriptor2);
        ((y) bVarB).w(descriptor2, 0, FollowUpQuestionResponseData$$serializer.INSTANCE, value.data);
        bVarB.c(descriptor2);
    }

    @Override // ku.z
    public a[] typeParametersSerializers() {
        return p0.f14595b;
    }
}
