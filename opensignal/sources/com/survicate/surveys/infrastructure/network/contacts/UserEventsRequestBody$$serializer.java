package com.survicate.surveys.infrastructure.network.contacts;

import br.l;
import com.survicate.surveys.infrastructure.network.contacts.ContactsApiModels;
import gu.f;
import iu.e;
import java.util.List;
import ju.b;
import ju.d;
import kotlin.Metadata;
import ku.p0;
import ku.r0;
import ku.z;
import lq.c;

@c
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/survicate/surveys/infrastructure/network/contacts/UserEventsRequestBody.$serializer", "Lku/z;", "Lcom/survicate/surveys/infrastructure/network/contacts/UserEventsRequestBody;", "<init>", "()V", "", "Lgu/a;", "childSerializers", "()[Lgu/a;", "Lju/c;", "decoder", "deserialize", "(Lju/c;)Lcom/survicate/surveys/infrastructure/network/contacts/UserEventsRequestBody;", "Lju/d;", "encoder", "value", "Llq/b0;", "serialize", "(Lju/d;Lcom/survicate/surveys/infrastructure/network/contacts/UserEventsRequestBody;)V", "Liu/e;", "getDescriptor", "()Liu/e;", "descriptor", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserEventsRequestBody$$serializer implements z {
    public static final UserEventsRequestBody$$serializer INSTANCE;
    private static final /* synthetic */ r0 descriptor;

    static {
        UserEventsRequestBody$$serializer userEventsRequestBody$$serializer = new UserEventsRequestBody$$serializer();
        INSTANCE = userEventsRequestBody$$serializer;
        r0 r0Var = new r0("com.survicate.surveys.infrastructure.network.contacts.UserEventsRequestBody", userEventsRequestBody$$serializer, 4);
        r0Var.b("user", false);
        r0Var.b("respondent", false);
        r0Var.b("events", false);
        r0Var.b("metadata", false);
        descriptor = r0Var;
    }

    private UserEventsRequestBody$$serializer() {
    }

    @Override // ku.z
    public gu.a[] childSerializers() {
        return new gu.a[]{ContactsApiModels$User$$serializer.INSTANCE, ContactsApiModels$Respondent$$serializer.INSTANCE, UserEventsRequestBody.$childSerializers[2], ContactsApiModels$Metadata$$serializer.INSTANCE};
    }

    @Override // gu.a
    public UserEventsRequestBody deserialize(ju.c decoder) {
        l.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        ju.a aVarB = decoder.b(descriptor2);
        gu.a[] aVarArr = UserEventsRequestBody.$childSerializers;
        int i10 = 0;
        ContactsApiModels.User user = null;
        ContactsApiModels.Respondent respondent = null;
        List list = null;
        ContactsApiModels.Metadata metadata = null;
        boolean z10 = true;
        while (z10) {
            int iT = aVarB.t(descriptor2);
            if (iT == -1) {
                z10 = false;
            } else if (iT == 0) {
                user = (ContactsApiModels.User) aVarB.m(descriptor2, 0, ContactsApiModels$User$$serializer.INSTANCE, user);
                i10 |= 1;
            } else if (iT == 1) {
                respondent = (ContactsApiModels.Respondent) aVarB.m(descriptor2, 1, ContactsApiModels$Respondent$$serializer.INSTANCE, respondent);
                i10 |= 2;
            } else if (iT == 2) {
                list = (List) aVarB.m(descriptor2, 2, aVarArr[2], list);
                i10 |= 4;
            } else {
                if (iT != 3) {
                    throw new f(iT);
                }
                metadata = (ContactsApiModels.Metadata) aVarB.m(descriptor2, 3, ContactsApiModels$Metadata$$serializer.INSTANCE, metadata);
                i10 |= 8;
            }
        }
        aVarB.c(descriptor2);
        return new UserEventsRequestBody(i10, user, respondent, list, metadata, null);
    }

    @Override // gu.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // gu.a
    public void serialize(d encoder, UserEventsRequestBody value) {
        l.e(encoder, "encoder");
        l.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarB = encoder.b(descriptor2);
        UserEventsRequestBody.write$Self(value, bVarB, descriptor2);
        bVarB.c(descriptor2);
    }

    @Override // ku.z
    public gu.a[] typeParametersSerializers() {
        return p0.f14595b;
    }
}
