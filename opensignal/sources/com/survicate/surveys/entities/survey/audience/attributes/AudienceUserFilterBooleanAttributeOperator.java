package com.survicate.surveys.entities.survey.audience.attributes;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterBooleanAttributeOperator;", "", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeOperator;", "(Ljava/lang/String;I)V", "IS_TRUE", "IS_FALSE", "ANY", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AudienceUserFilterBooleanAttributeOperator implements AudienceUserFilterAttributeOperator {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AudienceUserFilterBooleanAttributeOperator[] $VALUES;

    @o(name = "is_true")
    public static final AudienceUserFilterBooleanAttributeOperator IS_TRUE = new AudienceUserFilterBooleanAttributeOperator("IS_TRUE", 0);

    @o(name = "is_false")
    public static final AudienceUserFilterBooleanAttributeOperator IS_FALSE = new AudienceUserFilterBooleanAttributeOperator("IS_FALSE", 1);

    @o(name = "any")
    public static final AudienceUserFilterBooleanAttributeOperator ANY = new AudienceUserFilterBooleanAttributeOperator("ANY", 2);

    private static final /* synthetic */ AudienceUserFilterBooleanAttributeOperator[] $values() {
        return new AudienceUserFilterBooleanAttributeOperator[]{IS_TRUE, IS_FALSE, ANY};
    }

    static {
        AudienceUserFilterBooleanAttributeOperator[] audienceUserFilterBooleanAttributeOperatorArr$values = $values();
        $VALUES = audienceUserFilterBooleanAttributeOperatorArr$values;
        $ENTRIES = a.a.j(audienceUserFilterBooleanAttributeOperatorArr$values);
    }

    private AudienceUserFilterBooleanAttributeOperator(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static AudienceUserFilterBooleanAttributeOperator valueOf(String str) {
        return (AudienceUserFilterBooleanAttributeOperator) Enum.valueOf(AudienceUserFilterBooleanAttributeOperator.class, str);
    }

    public static AudienceUserFilterBooleanAttributeOperator[] values() {
        return (AudienceUserFilterBooleanAttributeOperator[]) $VALUES.clone();
    }
}
