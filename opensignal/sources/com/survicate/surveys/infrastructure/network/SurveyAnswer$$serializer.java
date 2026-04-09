package com.survicate.surveys.infrastructure.network;

import br.l;
import g4.j;
import gu.a;
import iu.e;
import java.util.List;
import ju.b;
import kotlin.Metadata;
import ku.c1;
import ku.f;
import ku.k0;
import ku.p0;
import ku.q;
import ku.r0;
import ku.z;
import lq.c;
import xu.d;

@c
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/survicate/surveys/infrastructure/network/SurveyAnswer.$serializer", "Lku/z;", "Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;", "<init>", "()V", "", "Lgu/a;", "childSerializers", "()[Lgu/a;", "Lju/c;", "decoder", "deserialize", "(Lju/c;)Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;", "Lju/d;", "encoder", "value", "Llq/b0;", "serialize", "(Lju/d;Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;)V", "Liu/e;", "getDescriptor", "()Liu/e;", "descriptor", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveyAnswer$$serializer implements z {
    public static final SurveyAnswer$$serializer INSTANCE;
    private static final /* synthetic */ r0 descriptor;

    static {
        SurveyAnswer$$serializer surveyAnswer$$serializer = new SurveyAnswer$$serializer();
        INSTANCE = surveyAnswer$$serializer;
        r0 r0Var = new r0("com.survicate.surveys.infrastructure.network.SurveyAnswer", surveyAnswer$$serializer, 8);
        r0Var.b("finished", true);
        r0Var.b("cta_success", true);
        r0Var.b("content", true);
        r0Var.b("survey_question_answer_id", true);
        r0Var.b("answer_type", true);
        r0Var.b("completion_rate", true);
        r0Var.b("comment", true);
        r0Var.b("follow_ups", true);
        descriptor = r0Var;
    }

    private SurveyAnswer$$serializer() {
    }

    @Override // ku.z
    public a[] childSerializers() {
        a[] aVarArr = SurveyAnswer.$childSerializers;
        f fVar = f.f14545a;
        a aVarF = d.F(fVar);
        a aVarF2 = d.F(fVar);
        c1 c1Var = c1.f14534a;
        return new a[]{aVarF, aVarF2, d.F(c1Var), d.F(k0.f14571a), d.F(c1Var), q.f14598a, d.F(c1Var), d.F(aVarArr[7])};
    }

    @Override // gu.a
    public SurveyAnswer deserialize(ju.c decoder) {
        l.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        ju.a aVarB = decoder.b(descriptor2);
        a[] aVarArr = SurveyAnswer.$childSerializers;
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str2 = null;
        Long l10 = null;
        String str3 = null;
        double dW = 0.0d;
        int i10 = 0;
        boolean z10 = true;
        List list = null;
        while (z10) {
            int iT = aVarB.t(descriptor2);
            switch (iT) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    bool = (Boolean) aVarB.y(descriptor2, 0, f.f14545a, bool);
                    i10 |= 1;
                    break;
                case 1:
                    bool2 = (Boolean) aVarB.y(descriptor2, 1, f.f14545a, bool2);
                    i10 |= 2;
                    break;
                case 2:
                    str2 = (String) aVarB.y(descriptor2, 2, c1.f14534a, str2);
                    i10 |= 4;
                    break;
                case 3:
                    l10 = (Long) aVarB.y(descriptor2, 3, k0.f14571a, l10);
                    i10 |= 8;
                    break;
                case 4:
                    str3 = (String) aVarB.y(descriptor2, 4, c1.f14534a, str3);
                    i10 |= 16;
                    break;
                case j.STRING_FIELD_NUMBER /* 5 */:
                    dW = aVarB.w(descriptor2, 5);
                    i10 |= 32;
                    break;
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                    str = (String) aVarB.y(descriptor2, 6, c1.f14534a, str);
                    i10 |= 64;
                    break;
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                    list = (List) aVarB.y(descriptor2, 7, aVarArr[7], list);
                    i10 |= 128;
                    break;
                default:
                    throw new gu.f(iT);
            }
        }
        aVarB.c(descriptor2);
        return new SurveyAnswer(i10, bool, bool2, str2, l10, str3, dW, str, list, null);
    }

    @Override // gu.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // gu.a
    public void serialize(ju.d encoder, SurveyAnswer value) {
        l.e(encoder, "encoder");
        l.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarB = encoder.b(descriptor2);
        SurveyAnswer.write$Self(value, bVarB, descriptor2);
        bVarB.c(descriptor2);
    }

    @Override // ku.z
    public a[] typeParametersSerializers() {
        return p0.f14595b;
    }
}
