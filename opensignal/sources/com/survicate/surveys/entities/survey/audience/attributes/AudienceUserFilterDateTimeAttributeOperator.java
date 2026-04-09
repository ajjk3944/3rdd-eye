package com.survicate.surveys.entities.survey.audience.attributes;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterDateTimeAttributeOperator;", "", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeOperator;", "(Ljava/lang/String;I)V", "IS_EARLIER_THAN", "IS_LATER_THAN", "IS_ON_THE_DATE", "IS_BETWEEN", "IS_NOT_BETWEEN", "ANY", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AudienceUserFilterDateTimeAttributeOperator implements AudienceUserFilterAttributeOperator {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AudienceUserFilterDateTimeAttributeOperator[] $VALUES;

    @o(name = "is_earlier_than")
    public static final AudienceUserFilterDateTimeAttributeOperator IS_EARLIER_THAN = new AudienceUserFilterDateTimeAttributeOperator("IS_EARLIER_THAN", 0);

    @o(name = "is_later_than")
    public static final AudienceUserFilterDateTimeAttributeOperator IS_LATER_THAN = new AudienceUserFilterDateTimeAttributeOperator("IS_LATER_THAN", 1);

    @o(name = "is_on_the_date")
    public static final AudienceUserFilterDateTimeAttributeOperator IS_ON_THE_DATE = new AudienceUserFilterDateTimeAttributeOperator("IS_ON_THE_DATE", 2);

    @o(name = "is_between")
    public static final AudienceUserFilterDateTimeAttributeOperator IS_BETWEEN = new AudienceUserFilterDateTimeAttributeOperator("IS_BETWEEN", 3);

    @o(name = "is_not_between")
    public static final AudienceUserFilterDateTimeAttributeOperator IS_NOT_BETWEEN = new AudienceUserFilterDateTimeAttributeOperator("IS_NOT_BETWEEN", 4);

    @o(name = "any")
    public static final AudienceUserFilterDateTimeAttributeOperator ANY = new AudienceUserFilterDateTimeAttributeOperator("ANY", 5);

    private static final /* synthetic */ AudienceUserFilterDateTimeAttributeOperator[] $values() {
        return new AudienceUserFilterDateTimeAttributeOperator[]{IS_EARLIER_THAN, IS_LATER_THAN, IS_ON_THE_DATE, IS_BETWEEN, IS_NOT_BETWEEN, ANY};
    }

    static {
        AudienceUserFilterDateTimeAttributeOperator[] audienceUserFilterDateTimeAttributeOperatorArr$values = $values();
        $VALUES = audienceUserFilterDateTimeAttributeOperatorArr$values;
        $ENTRIES = a.a.j(audienceUserFilterDateTimeAttributeOperatorArr$values);
    }

    private AudienceUserFilterDateTimeAttributeOperator(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static AudienceUserFilterDateTimeAttributeOperator valueOf(String str) {
        return (AudienceUserFilterDateTimeAttributeOperator) Enum.valueOf(AudienceUserFilterDateTimeAttributeOperator.class, str);
    }

    public static AudienceUserFilterDateTimeAttributeOperator[] values() {
        return (AudienceUserFilterDateTimeAttributeOperator[]) $VALUES.clone();
    }
}
