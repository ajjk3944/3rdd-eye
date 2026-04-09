package com.survicate.surveys.infrastructure.network.ai;

import br.l;
import com.survicate.surveys.presentation.text.micro.MicroSurveyPointTextAdapterItem;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toFollowUpDialog", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpDialog;", "Lcom/survicate/surveys/presentation/text/micro/MicroSurveyPointTextAdapterItem;", "survicate-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FollowUpQuestionRequestBodyKt {
    public static final FollowUpDialog toFollowUpDialog(MicroSurveyPointTextAdapterItem microSurveyPointTextAdapterItem) {
        l.e(microSurveyPointTextAdapterItem, "<this>");
        return new FollowUpDialog(microSurveyPointTextAdapterItem.f6524d.f6598d, microSurveyPointTextAdapterItem.f6525g.f6527a);
    }
}
