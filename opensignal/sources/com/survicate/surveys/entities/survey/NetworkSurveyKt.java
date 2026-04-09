package com.survicate.surveys.entities.survey;

import br.l;
import com.survicate.surveys.entities.survey.audience.AudienceVisitorType;
import com.survicate.surveys.entities.survey.audience.NetworkAudience;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"isContactMode", "", "Lcom/survicate/surveys/entities/survey/NetworkSurvey;", "audiences", "", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudience;", "survicate-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkSurveyKt {
    public static final boolean isContactMode(NetworkSurvey networkSurvey, List<NetworkAudience> list) {
        l.e(networkSurvey, "<this>");
        l.e(list, "audiences");
        if (list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((NetworkAudience) it.next()).getVisitorType() == AudienceVisitorType.IDENTIFIED) {
                return true;
            }
        }
        return false;
    }
}
