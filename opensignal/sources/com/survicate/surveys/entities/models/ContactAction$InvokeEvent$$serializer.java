package com.survicate.surveys.entities.models;

import br.l;
import com.survicate.surveys.entities.models.ContactAction;
import iu.e;
import java.util.List;
import ju.b;
import ju.d;
import kotlin.Metadata;
import ku.c1;
import ku.f;
import ku.p0;
import ku.r0;
import ku.z;
import lq.c;

@c
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/survicate/surveys/entities/models/ContactAction.InvokeEvent.$serializer", "Lku/z;", "Lcom/survicate/surveys/entities/models/ContactAction$InvokeEvent;", "<init>", "()V", "", "Lgu/a;", "childSerializers", "()[Lgu/a;", "Lju/c;", "decoder", "deserialize", "(Lju/c;)Lcom/survicate/surveys/entities/models/ContactAction$InvokeEvent;", "Lju/d;", "encoder", "value", "Llq/b0;", "serialize", "(Lju/d;Lcom/survicate/surveys/entities/models/ContactAction$InvokeEvent;)V", "Liu/e;", "getDescriptor", "()Liu/e;", "descriptor", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContactAction$InvokeEvent$$serializer implements z {
    public static final ContactAction$InvokeEvent$$serializer INSTANCE;
    private static final /* synthetic */ r0 descriptor;

    static {
        ContactAction$InvokeEvent$$serializer contactAction$InvokeEvent$$serializer = new ContactAction$InvokeEvent$$serializer();
        INSTANCE = contactAction$InvokeEvent$$serializer;
        r0 r0Var = new r0("invoke_event", contactAction$InvokeEvent$$serializer, 5);
        r0Var.b(hq.c.USER_ID, false);
        r0Var.b(hq.c.USER_KEY, false);
        r0Var.b("respondent_uuid", false);
        r0Var.b("events", false);
        r0Var.b("is_scheduled", false);
        descriptor = r0Var;
    }

    private ContactAction$InvokeEvent$$serializer() {
    }

    @Override // ku.z
    public gu.a[] childSerializers() {
        gu.a aVar = ContactAction.InvokeEvent.$childSerializers[3];
        c1 c1Var = c1.f14534a;
        return new gu.a[]{c1Var, c1Var, c1Var, aVar, f.f14545a};
    }

    @Override // gu.a
    public ContactAction.InvokeEvent deserialize(ju.c decoder) {
        l.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        ju.a aVarB = decoder.b(descriptor2);
        gu.a[] aVarArr = ContactAction.InvokeEvent.$childSerializers;
        int i10 = 0;
        boolean zV = false;
        String strQ = null;
        String strQ2 = null;
        String strQ3 = null;
        List list = null;
        boolean z10 = true;
        while (z10) {
            int iT = aVarB.t(descriptor2);
            if (iT == -1) {
                z10 = false;
            } else if (iT == 0) {
                strQ = aVarB.q(descriptor2, 0);
                i10 |= 1;
            } else if (iT == 1) {
                strQ2 = aVarB.q(descriptor2, 1);
                i10 |= 2;
            } else if (iT == 2) {
                strQ3 = aVarB.q(descriptor2, 2);
                i10 |= 4;
            } else if (iT == 3) {
                list = (List) aVarB.m(descriptor2, 3, aVarArr[3], list);
                i10 |= 8;
            } else {
                if (iT != 4) {
                    throw new gu.f(iT);
                }
                zV = aVarB.v(descriptor2, 4);
                i10 |= 16;
            }
        }
        aVarB.c(descriptor2);
        return new ContactAction.InvokeEvent(i10, strQ, strQ2, strQ3, list, zV, null);
    }

    @Override // gu.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // gu.a
    public void serialize(d encoder, ContactAction.InvokeEvent value) {
        l.e(encoder, "encoder");
        l.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarB = encoder.b(descriptor2);
        ContactAction.InvokeEvent.write$Self(value, bVarB, descriptor2);
        bVarB.c(descriptor2);
    }

    @Override // ku.z
    public gu.a[] typeParametersSerializers() {
        return p0.f14595b;
    }
}
