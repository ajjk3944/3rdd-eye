package com.survicate.surveys.entities.survey.audience;

import br.g;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceFilter;", "", "()V", "exclude", "", "getExclude", "()Z", "type", "Lcom/survicate/surveys/entities/survey/audience/AudienceFilterType;", "getType", "()Lcom/survicate/surveys/entities/survey/audience/AudienceFilterType;", "values", "", "getValues", "()Ljava/util/List;", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceKnownUserFilter;", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceLocaleFilter;", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudiencePlatformFilter;", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceScreenOrientationFilter;", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceUserFilter;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class NetworkAudienceFilter {
    public /* synthetic */ NetworkAudienceFilter(g gVar) {
        this();
    }

    public abstract boolean getExclude();

    public abstract AudienceFilterType getType();

    public abstract List<?> getValues();

    private NetworkAudienceFilter() {
    }
}
