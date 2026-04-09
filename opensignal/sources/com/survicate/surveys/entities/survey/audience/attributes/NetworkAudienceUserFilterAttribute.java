package com.survicate.surveys.entities.survey.audience.attributes;

import br.g;
import dq.a;
import iq.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0005\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterAttribute;", "", "<init>", "()V", "Liq/f;", "timestampProvider", "Ldq/a;", "toDomainModel", "(Liq/f;)Ldq/a;", "", "getName", "()Ljava/lang/String;", "name", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeOperator;", "getOperator", "()Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeOperator;", "operator", "", "getValues", "()Ljava/util/List;", "values", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeType;", "getType", "()Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeType;", "type", "Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterBooleanAttribute;", "Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterDateTimeAttribute;", "Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterNumberAttribute;", "Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterStringAttribute;", "Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterTimeIntervalAttribute;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class NetworkAudienceUserFilterAttribute {
    public /* synthetic */ NetworkAudienceUserFilterAttribute(g gVar) {
        this();
    }

    public abstract String getName();

    public abstract AudienceUserFilterAttributeOperator getOperator();

    public abstract AudienceUserFilterAttributeType getType();

    public abstract List<?> getValues();

    public abstract a toDomainModel(f timestampProvider);

    private NetworkAudienceUserFilterAttribute() {
    }
}
