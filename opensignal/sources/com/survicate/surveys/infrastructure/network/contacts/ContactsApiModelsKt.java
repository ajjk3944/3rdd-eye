package com.survicate.surveys.infrastructure.network.contacts;

import bf.n;
import br.l;
import com.survicate.surveys.entities.models.ContactAction;
import com.survicate.surveys.infrastructure.network.contacts.ContactsApiModels;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"toApiModel", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$SurveyInteraction;", "Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteraction$Interaction;", "Lcom/survicate/surveys/infrastructure/network/contacts/ContactsApiModels$SurveyInteractionType;", "Lcom/survicate/surveys/entities/models/ContactAction$SurveyInteractionType;", "survicate-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContactsApiModelsKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContactAction.SurveyInteractionType.values().length];
            try {
                iArr[ContactAction.SurveyInteractionType.SEEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContactAction.SurveyInteractionType.ANSWERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContactAction.SurveyInteractionType.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContactAction.SurveyInteractionType.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContactsApiModels.SurveyInteractionType toApiModel(ContactAction.SurveyInteractionType surveyInteractionType) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[surveyInteractionType.ordinal()];
        if (i10 == 1) {
            return ContactsApiModels.SurveyInteractionType.SEEN;
        }
        if (i10 == 2) {
            return ContactsApiModels.SurveyInteractionType.ANSWERED;
        }
        if (i10 == 3) {
            return ContactsApiModels.SurveyInteractionType.COMPLETED;
        }
        if (i10 == 4) {
            return ContactsApiModels.SurveyInteractionType.CLOSED;
        }
        throw new n();
    }

    public static final ContactsApiModels.SurveyInteraction toApiModel(ContactAction.SurveyInteraction.Interaction interaction) {
        l.e(interaction, "<this>");
        return new ContactsApiModels.SurveyInteraction(interaction);
    }
}
