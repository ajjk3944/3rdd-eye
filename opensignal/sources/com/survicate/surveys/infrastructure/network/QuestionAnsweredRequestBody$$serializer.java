package com.survicate.surveys.infrastructure.network;

import br.l;
import g4.j;
import gu.a;
import iu.e;
import java.util.List;
import java.util.Map;
import ju.b;
import kotlin.Metadata;
import ku.c1;
import ku.f;
import ku.k0;
import ku.p0;
import ku.r0;
import ku.y0;
import ku.z;
import lq.c;
import xu.d;

@c
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/survicate/surveys/infrastructure/network/QuestionAnsweredRequestBody.$serializer", "Lku/z;", "Lcom/survicate/surveys/infrastructure/network/QuestionAnsweredRequestBody;", "<init>", "()V", "", "Lgu/a;", "childSerializers", "()[Lgu/a;", "Lju/c;", "decoder", "deserialize", "(Lju/c;)Lcom/survicate/surveys/infrastructure/network/QuestionAnsweredRequestBody;", "Lju/d;", "encoder", "value", "Llq/b0;", "serialize", "(Lju/d;Lcom/survicate/surveys/infrastructure/network/QuestionAnsweredRequestBody;)V", "Liu/e;", "getDescriptor", "()Liu/e;", "descriptor", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class QuestionAnsweredRequestBody$$serializer implements z {
    public static final QuestionAnsweredRequestBody$$serializer INSTANCE;
    private static final /* synthetic */ r0 descriptor;

    static {
        QuestionAnsweredRequestBody$$serializer questionAnsweredRequestBody$$serializer = new QuestionAnsweredRequestBody$$serializer();
        INSTANCE = questionAnsweredRequestBody$$serializer;
        r0 r0Var = new r0("com.survicate.surveys.infrastructure.network.QuestionAnsweredRequestBody", questionAnsweredRequestBody$$serializer, 10);
        r0Var.b("version", true);
        r0Var.b("response_uuid", false);
        r0Var.b("survey_point_id", false);
        r0Var.b("visitor", false);
        r0Var.b("visit", false);
        r0Var.b("visit_points", false);
        r0Var.b("overwrite", false);
        r0Var.b("integrations", false);
        r0Var.b("disclaimer_accepted", false);
        r0Var.b("response_attributes", false);
        descriptor = r0Var;
    }

    private QuestionAnsweredRequestBody$$serializer() {
    }

    @Override // ku.z
    public a[] childSerializers() {
        a[] aVarArr = QuestionAnsweredRequestBody.$childSerializers;
        a aVarF = d.F(aVarArr[5]);
        f fVar = f.f14545a;
        a aVar = aVarArr[7];
        a aVarF2 = d.F(fVar);
        a aVarF3 = d.F(aVarArr[9]);
        c1 c1Var = c1.f14534a;
        return new a[]{c1Var, c1Var, k0.f14571a, VisitorData$$serializer.INSTANCE, VisitData$$serializer.INSTANCE, aVarF, fVar, aVar, aVarF2, aVarF3};
    }

    @Override // gu.a
    public QuestionAnsweredRequestBody deserialize(ju.c decoder) {
        a[] aVarArr;
        l.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        ju.a aVarB = decoder.b(descriptor2);
        a[] aVarArr2 = QuestionAnsweredRequestBody.$childSerializers;
        List list = null;
        Map map = null;
        String strQ = null;
        String strQ2 = null;
        VisitorData visitorData = null;
        VisitData visitData = null;
        long jG = 0;
        int i10 = 0;
        boolean z10 = true;
        boolean zV = false;
        Map map2 = null;
        Boolean bool = null;
        while (z10) {
            int iT = aVarB.t(descriptor2);
            switch (iT) {
                case -1:
                    z10 = false;
                    continue;
                case 0:
                    aVarArr = aVarArr2;
                    strQ = aVarB.q(descriptor2, 0);
                    i10 |= 1;
                    break;
                case 1:
                    aVarArr = aVarArr2;
                    strQ2 = aVarB.q(descriptor2, 1);
                    i10 |= 2;
                    break;
                case 2:
                    aVarArr = aVarArr2;
                    jG = aVarB.g(descriptor2, 2);
                    i10 |= 4;
                    break;
                case 3:
                    aVarArr = aVarArr2;
                    visitorData = (VisitorData) aVarB.m(descriptor2, 3, VisitorData$$serializer.INSTANCE, visitorData);
                    i10 |= 8;
                    break;
                case 4:
                    aVarArr = aVarArr2;
                    visitData = (VisitData) aVarB.m(descriptor2, 4, VisitData$$serializer.INSTANCE, visitData);
                    i10 |= 16;
                    break;
                case j.STRING_FIELD_NUMBER /* 5 */:
                    aVarArr = aVarArr2;
                    list = (List) aVarB.y(descriptor2, 5, aVarArr[5], list);
                    i10 |= 32;
                    break;
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                    aVarArr = aVarArr2;
                    zV = aVarB.v(descriptor2, 6);
                    i10 |= 64;
                    break;
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                    aVarArr = aVarArr2;
                    map2 = (Map) aVarB.m(descriptor2, 7, aVarArr[7], map2);
                    i10 |= 128;
                    break;
                case j.BYTES_FIELD_NUMBER /* 8 */:
                    aVarArr = aVarArr2;
                    bool = (Boolean) aVarB.y(descriptor2, 8, f.f14545a, bool);
                    i10 |= 256;
                    break;
                case 9:
                    aVarArr = aVarArr2;
                    map = (Map) aVarB.y(descriptor2, 9, aVarArr[9], map);
                    i10 |= 512;
                    break;
                default:
                    throw new gu.f(iT);
            }
            aVarArr2 = aVarArr;
        }
        aVarB.c(descriptor2);
        return new QuestionAnsweredRequestBody(i10, strQ, strQ2, jG, visitorData, visitData, list, zV, map2, bool, map, (y0) null);
    }

    @Override // gu.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // gu.a
    public void serialize(ju.d encoder, QuestionAnsweredRequestBody value) {
        l.e(encoder, "encoder");
        l.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarB = encoder.b(descriptor2);
        QuestionAnsweredRequestBody.write$Self(value, bVarB, descriptor2);
        bVarB.c(descriptor2);
    }

    @Override // ku.z
    public a[] typeParametersSerializers() {
        return p0.f14595b;
    }
}
