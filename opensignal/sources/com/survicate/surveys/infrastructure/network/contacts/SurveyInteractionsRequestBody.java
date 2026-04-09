package com.survicate.surveys.infrastructure.network.contacts;

import br.g;
import br.l;
import com.survicate.surveys.entities.models.ContactAction;
import com.survicate.surveys.infrastructure.network.contacts.ContactsApiModels;
import iu.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.b;
import kotlin.Metadata;
import ku.c;
import ku.p0;
import ku.y0;
import mq.p;
import mu.y;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u0000 .2\u00020\u0001:\u0002/.B/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fBQ\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000b\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b)\u0010!\u001a\u0004\b'\u0010(R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010*\u0012\u0004\b-\u0010!\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/SurveyInteractionsRequestBody;", "", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User;", "user", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Respondent;", "respondent", "", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$SurveyInteraction;", "surveys", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Metadata;", "metadata", "<init>", "(Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User;Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Respondent;Ljava/util/List;Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Metadata;)V", "Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteraction;", "action", "(Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteraction;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User;Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Respondent;Ljava/util/List;Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Metadata;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/contacts/SurveyInteractionsRequestBody;Lju/b;Liu/e;)V", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User;", "getUser", "()Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$User;", "getUser$annotations", "()V", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Respondent;", "getRespondent", "()Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Respondent;", "getRespondent$annotations", "Ljava/util/List;", "getSurveys", "()Ljava/util/List;", "getSurveys$annotations", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Metadata;", "getMetadata", "()Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$Metadata;", "getMetadata$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveyInteractionsRequestBody {
    private final ContactsApiModels.Metadata metadata;
    private final ContactsApiModels.Respondent respondent;
    private final List<ContactsApiModels.SurveyInteraction> surveys;
    private final ContactsApiModels.User user;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final gu.a[] $childSerializers = {null, null, new c(ContactsApiModels$SurveyInteraction$$serializer.INSTANCE), null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/contacts/SurveyInteractionsRequestBody$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/contacts/SurveyInteractionsRequestBody;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final gu.a serializer() {
            return SurveyInteractionsRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @lq.c
    public /* synthetic */ SurveyInteractionsRequestBody(int i10, ContactsApiModels.User user, ContactsApiModels.Respondent respondent, List list, ContactsApiModels.Metadata metadata, y0 y0Var) {
        if (15 != (i10 & 15)) {
            p0.f(i10, 15, SurveyInteractionsRequestBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.user = user;
        this.respondent = respondent;
        this.surveys = list;
        this.metadata = metadata;
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getRespondent$annotations() {
    }

    public static /* synthetic */ void getSurveys$annotations() {
    }

    public static /* synthetic */ void getUser$annotations() {
    }

    public static final /* synthetic */ void write$Self(SurveyInteractionsRequestBody self, b output, e serialDesc) {
        gu.a[] aVarArr = $childSerializers;
        y yVar = (y) output;
        yVar.w(serialDesc, 0, ContactsApiModels$User$$serializer.INSTANCE, self.user);
        yVar.w(serialDesc, 1, ContactsApiModels$Respondent$$serializer.INSTANCE, self.respondent);
        yVar.w(serialDesc, 2, aVarArr[2], self.surveys);
        yVar.w(serialDesc, 3, ContactsApiModels$Metadata$$serializer.INSTANCE, self.metadata);
    }

    public final ContactsApiModels.Metadata getMetadata() {
        return this.metadata;
    }

    public final ContactsApiModels.Respondent getRespondent() {
        return this.respondent;
    }

    public final List<ContactsApiModels.SurveyInteraction> getSurveys() {
        return this.surveys;
    }

    public final ContactsApiModels.User getUser() {
        return this.user;
    }

    private SurveyInteractionsRequestBody(ContactsApiModels.User user, ContactsApiModels.Respondent respondent, List<ContactsApiModels.SurveyInteraction> list, ContactsApiModels.Metadata metadata) {
        this.user = user;
        this.respondent = respondent;
        this.surveys = list;
        this.metadata = metadata;
    }

    public SurveyInteractionsRequestBody(ContactAction.SurveyInteraction surveyInteraction) {
        l.e(surveyInteraction, "action");
        ContactsApiModels.User user = new ContactsApiModels.User(surveyInteraction.getUserId(), surveyInteraction.getUserKey());
        ContactsApiModels.Respondent respondent = new ContactsApiModels.Respondent(surveyInteraction.getRespondentUuid());
        List<ContactAction.SurveyInteraction.Interaction> interactions = surveyInteraction.getInteractions();
        ArrayList arrayList = new ArrayList(p.a0(interactions, 10));
        Iterator<T> it = interactions.iterator();
        while (it.hasNext()) {
            arrayList.add(ContactsApiModelsKt.toApiModel((ContactAction.SurveyInteraction.Interaction) it.next()));
        }
        this(user, respondent, arrayList, ContactsApiModels.INSTANCE.buildMetadata("1.0.0"));
    }
}
