package com.survicate.surveys.entities.survey.audience.attributes;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterTimeIntervalAttributeOperator;", "", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeOperator;", "(Ljava/lang/String;I)V", "IS_GREATER_THAN", "IS_LESS_THAN", "ANY", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AudienceUserFilterTimeIntervalAttributeOperator implements AudienceUserFilterAttributeOperator {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AudienceUserFilterTimeIntervalAttributeOperator[] $VALUES;

    @o(name = "is_greater_than")
    public static final AudienceUserFilterTimeIntervalAttributeOperator IS_GREATER_THAN = new AudienceUserFilterTimeIntervalAttributeOperator("IS_GREATER_THAN", 0);

    @o(name = "is_less_than")
    public static final AudienceUserFilterTimeIntervalAttributeOperator IS_LESS_THAN = new AudienceUserFilterTimeIntervalAttributeOperator("IS_LESS_THAN", 1);

    @o(name = "any")
    public static final AudienceUserFilterTimeIntervalAttributeOperator ANY = new AudienceUserFilterTimeIntervalAttributeOperator("ANY", 2);

    private static final /* synthetic */ AudienceUserFilterTimeIntervalAttributeOperator[] $values() {
        return new AudienceUserFilterTimeIntervalAttributeOperator[]{IS_GREATER_THAN, IS_LESS_THAN, ANY};
    }

    static {
        AudienceUserFilterTimeIntervalAttributeOperator[] audienceUserFilterTimeIntervalAttributeOperatorArr$values = $values();
        $VALUES = audienceUserFilterTimeIntervalAttributeOperatorArr$values;
        $ENTRIES = a.a.j(audienceUserFilterTimeIntervalAttributeOperatorArr$values);
    }

    private AudienceUserFilterTimeIntervalAttributeOperator(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static AudienceUserFilterTimeIntervalAttributeOperator valueOf(String str) {
        return (AudienceUserFilterTimeIntervalAttributeOperator) Enum.valueOf(AudienceUserFilterTimeIntervalAttributeOperator.class, str);
    }

    public static AudienceUserFilterTimeIntervalAttributeOperator[] values() {
        return (AudienceUserFilterTimeIntervalAttributeOperator[]) $VALUES.clone();
    }
}
