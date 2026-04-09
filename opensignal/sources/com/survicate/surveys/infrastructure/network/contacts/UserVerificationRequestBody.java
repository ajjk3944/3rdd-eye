package com.survicate.surveys.infrastructure.network.contacts;

import br.g;
import br.l;
import com.survicate.surveys.entities.models.ContactAction;
import com.survicate.surveys.infrastructure.network.contacts.ContactsApiModels;
import iu.e;
import ju.b;
import kotlin.Metadata;
import ku.p0;
import ku.y0;
import lq.c;
import mu.y;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000 '2\u00020\u0001:\u0002('B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fB?\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u0012\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010!R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010#\u0012\u0004\b&\u0010\u001e\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/UserVerificationRequestBody;", "", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User;", "user", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Respondent;", "respondent", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Metadata;", "metadata", "<init>", "(Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User;Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Respondent;Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Metadata;)V", "Lcom/survicate/surveys/entities/models/ContactAction$VerifyUser;", "action", "(Lcom/survicate/surveys/entities/models/ContactAction$VerifyUser;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User;Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Respondent;Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Metadata;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/contacts/UserVerificationRequestBody;Lju/b;Liu/e;)V", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User;", "getUser", "()Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User;", "getUser$annotations", "()V", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Respondent;", "getRespondent", "()Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Respondent;", "getRespondent$annotations", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Metadata;", "getMetadata", "()Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Metadata;", "getMetadata$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserVerificationRequestBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ContactsApiModels.Metadata metadata;
    private final ContactsApiModels.Respondent respondent;
    private final ContactsApiModels.User user;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/UserVerificationRequestBody$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/contacts/UserVerificationRequestBody;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final gu.a serializer() {
            return UserVerificationRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @c
    public /* synthetic */ UserVerificationRequestBody(int i10, ContactsApiModels.User user, ContactsApiModels.Respondent respondent, ContactsApiModels.Metadata metadata, y0 y0Var) {
        if (7 != (i10 & 7)) {
            p0.f(i10, 7, UserVerificationRequestBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.user = user;
        this.respondent = respondent;
        this.metadata = metadata;
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getRespondent$annotations() {
    }

    public static /* synthetic */ void getUser$annotations() {
    }

    public static final /* synthetic */ void write$Self(UserVerificationRequestBody self, b output, e serialDesc) {
        y yVar = (y) output;
        yVar.w(serialDesc, 0, ContactsApiModels$User$$serializer.INSTANCE, self.user);
        yVar.w(serialDesc, 1, ContactsApiModels$Respondent$$serializer.INSTANCE, self.respondent);
        yVar.w(serialDesc, 2, ContactsApiModels$Metadata$$serializer.INSTANCE, self.metadata);
    }

    public final ContactsApiModels.Metadata getMetadata() {
        return this.metadata;
    }

    public final ContactsApiModels.Respondent getRespondent() {
        return this.respondent;
    }

    public final ContactsApiModels.User getUser() {
        return this.user;
    }

    private UserVerificationRequestBody(ContactsApiModels.User user, ContactsApiModels.Respondent respondent, ContactsApiModels.Metadata metadata) {
        this.user = user;
        this.respondent = respondent;
        this.metadata = metadata;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserVerificationRequestBody(ContactAction.VerifyUser verifyUser) {
        this(new ContactsApiModels.User(verifyUser.getUserId(), verifyUser.getUserKey()), new ContactsApiModels.Respondent(verifyUser.getRespondentUuid()), ContactsApiModels.INSTANCE.buildMetadata("1.0.0"));
        l.e(verifyUser, "action");
    }
}
