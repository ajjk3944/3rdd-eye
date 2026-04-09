package com.survicate.surveys.infrastructure.network;

import br.l;
import gu.a;
import iu.e;
import ju.b;
import ju.d;
import kotlin.Metadata;
import ku.f;
import ku.p0;
import ku.r0;
import ku.z;
import lq.c;
import mu.y;

@c
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/survicate/surveys/infrastructure/network/SurveySeenRequestBody.$serializer", "Lku/z;", "Lcom/survicate/surveys/infrastructure/network/SurveySeenRequestBody;", "<init>", "()V", "", "Lgu/a;", "childSerializers", "()[Lgu/a;", "Lju/c;", "decoder", "deserialize", "(Lju/c;)Lcom/survicate/surveys/infrastructure/network/SurveySeenRequestBody;", "Lju/d;", "encoder", "value", "Llq/b0;", "serialize", "(Lju/d;Lcom/survicate/surveys/infrastructure/network/SurveySeenRequestBody;)V", "Liu/e;", "getDescriptor", "()Liu/e;", "descriptor", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveySeenRequestBody$$serializer implements z {
    public static final SurveySeenRequestBody$$serializer INSTANCE;
    private static final /* synthetic */ r0 descriptor;

    static {
        SurveySeenRequestBody$$serializer surveySeenRequestBody$$serializer = new SurveySeenRequestBody$$serializer();
        INSTANCE = surveySeenRequestBody$$serializer;
        r0 r0Var = new r0("com.survicate.surveys.infrastructure.network.SurveySeenRequestBody", surveySeenRequestBody$$serializer, 1);
        r0Var.b("survey_first_seen", false);
        descriptor = r0Var;
    }

    private SurveySeenRequestBody$$serializer() {
    }

    @Override // ku.z
    public a[] childSerializers() {
        return new a[]{f.f14545a};
    }

    @Override // gu.a
    public SurveySeenRequestBody deserialize(ju.c decoder) {
        l.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        ju.a aVarB = decoder.b(descriptor2);
        boolean z10 = true;
        int i10 = 0;
        boolean zV = false;
        while (z10) {
            int iT = aVarB.t(descriptor2);
            if (iT == -1) {
                z10 = false;
            } else {
                if (iT != 0) {
                    throw new gu.f(iT);
                }
                zV = aVarB.v(descriptor2, 0);
                i10 = 1;
            }
        }
        aVarB.c(descriptor2);
        return new SurveySeenRequestBody(i10, zV, null);
    }

    @Override // gu.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // gu.a
    public void serialize(d encoder, SurveySeenRequestBody value) {
        l.e(encoder, "encoder");
        l.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarB = encoder.b(descriptor2);
        ((y) bVarB).s(descriptor2, 0, value.surveyFirstSeen);
        bVarB.c(descriptor2);
    }

    @Override // ku.z
    public a[] typeParametersSerializers() {
        return p0.f14595b;
    }
}
