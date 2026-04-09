package com.survicate.surveys.infrastructure.network.contacts;

import br.l;
import com.survicate.surveys.infrastructure.network.contacts.ContactsApiModels;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/survicate/surveys/infrastructure/network/contacts/ContactsApiModels.User.$serializer", "Lku/z;", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User;", "<init>", "()V", "", "Lgu/a;", "childSerializers", "()[Lgu/a;", "Lju/c;", "decoder", "deserialize", "(Lju/c;)Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User;", "Lju/d;", "encoder", "value", "Llq/b0;", "serialize", "(Lju/d;Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User;)V", "Liu/e;", "getDescriptor", "()Liu/e;", "descriptor", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContactsApiModels$User$$serializer implements z {
    public static final ContactsApiModels$User$$serializer INSTANCE;
    private static final /* synthetic */ r0 descriptor;

    static {
        ContactsApiModels$User$$serializer contactsApiModels$User$$serializer = new ContactsApiModels$User$$serializer();
        INSTANCE = contactsApiModels$User$$serializer;
        r0 r0Var = new r0("com.survicate.surveys.infrastructure.network.contacts.ContactsApiModels.User", contactsApiModels$User$$serializer, 2);
        r0Var.b("id", false);
        r0Var.b("key", false);
        descriptor = r0Var;
    }

    private ContactsApiModels$User$$serializer() {
    }

    @Override // ku.z
    public gu.a[] childSerializers() {
        c1 c1Var = c1.f14534a;
        return new gu.a[]{c1Var, c1Var};
    }

    @Override // gu.a
    public ContactsApiModels.User deserialize(ju.c decoder) {
        l.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        ju.a aVarB = decoder.b(descriptor2);
        y0 y0Var = null;
        boolean z10 = true;
        int i10 = 0;
        String strQ = null;
        String strQ2 = null;
        while (z10) {
            int iT = aVarB.t(descriptor2);
            if (iT == -1) {
                z10 = false;
            } else if (iT == 0) {
                strQ = aVarB.q(descriptor2, 0);
                i10 |= 1;
            } else {
                if (iT != 1) {
                    throw new f(iT);
                }
                strQ2 = aVarB.q(descriptor2, 1);
                i10 |= 2;
            }
        }
        aVarB.c(descriptor2);
        return new ContactsApiModels.User(i10, strQ, strQ2, y0Var);
    }

    @Override // gu.a
    public e getDescriptor() {
        return descriptor;
    }

    @Override // gu.a
    public void serialize(d encoder, ContactsApiModels.User value) {
        l.e(encoder, "encoder");
        l.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarB = encoder.b(descriptor2);
        ContactsApiModels.User.write$Self(value, bVarB, descriptor2);
        bVarB.c(descriptor2);
    }

    @Override // ku.z
    public gu.a[] typeParametersSerializers() {
        return p0.f14595b;
    }
}
