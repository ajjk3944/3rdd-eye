package com.survicate.surveys.entities.survey.audience.attributes;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterNumberAttributeOperator;", "", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeOperator;", "(Ljava/lang/String;I)V", "IS_EQUAL", "IS_NOT_EQUAL", "IS_GREATER_THAN", "IS_GREATER_THAN_OR_EQUAL", "IS_LESS_THAN", "IS_LESS_THAN_OR_EQUAL", "IS_BETWEEN", "IS_NOT_BETWEEN", "ANY", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AudienceUserFilterNumberAttributeOperator implements AudienceUserFilterAttributeOperator {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AudienceUserFilterNumberAttributeOperator[] $VALUES;

    @o(name = "is_equal")
    public static final AudienceUserFilterNumberAttributeOperator IS_EQUAL = new AudienceUserFilterNumberAttributeOperator("IS_EQUAL", 0);

    @o(name = "is_not_equal")
    public static final AudienceUserFilterNumberAttributeOperator IS_NOT_EQUAL = new AudienceUserFilterNumberAttributeOperator("IS_NOT_EQUAL", 1);

    @o(name = "is_greater_than")
    public static final AudienceUserFilterNumberAttributeOperator IS_GREATER_THAN = new AudienceUserFilterNumberAttributeOperator("IS_GREATER_THAN", 2);

    @o(name = "is_greater_than_or_equal")
    public static final AudienceUserFilterNumberAttributeOperator IS_GREATER_THAN_OR_EQUAL = new AudienceUserFilterNumberAttributeOperator("IS_GREATER_THAN_OR_EQUAL", 3);

    @o(name = "is_less_than")
    public static final AudienceUserFilterNumberAttributeOperator IS_LESS_THAN = new AudienceUserFilterNumberAttributeOperator("IS_LESS_THAN", 4);

    @o(name = "is_less_than_or_equal")
    public static final AudienceUserFilterNumberAttributeOperator IS_LESS_THAN_OR_EQUAL = new AudienceUserFilterNumberAttributeOperator("IS_LESS_THAN_OR_EQUAL", 5);

    @o(name = "is_between")
    public static final AudienceUserFilterNumberAttributeOperator IS_BETWEEN = new AudienceUserFilterNumberAttributeOperator("IS_BETWEEN", 6);

    @o(name = "is_not_between")
    public static final AudienceUserFilterNumberAttributeOperator IS_NOT_BETWEEN = new AudienceUserFilterNumberAttributeOperator("IS_NOT_BETWEEN", 7);

    @o(name = "any")
    public static final AudienceUserFilterNumberAttributeOperator ANY = new AudienceUserFilterNumberAttributeOperator("ANY", 8);

    private static final /* synthetic */ AudienceUserFilterNumberAttributeOperator[] $values() {
        return new AudienceUserFilterNumberAttributeOperator[]{IS_EQUAL, IS_NOT_EQUAL, IS_GREATER_THAN, IS_GREATER_THAN_OR_EQUAL, IS_LESS_THAN, IS_LESS_THAN_OR_EQUAL, IS_BETWEEN, IS_NOT_BETWEEN, ANY};
    }

    static {
        AudienceUserFilterNumberAttributeOperator[] audienceUserFilterNumberAttributeOperatorArr$values = $values();
        $VALUES = audienceUserFilterNumberAttributeOperatorArr$values;
        $ENTRIES = a.a.j(audienceUserFilterNumberAttributeOperatorArr$values);
    }

    private AudienceUserFilterNumberAttributeOperator(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static AudienceUserFilterNumberAttributeOperator valueOf(String str) {
        return (AudienceUserFilterNumberAttributeOperator) Enum.valueOf(AudienceUserFilterNumberAttributeOperator.class, str);
    }

    public static AudienceUserFilterNumberAttributeOperator[] values() {
        return (AudienceUserFilterNumberAttributeOperator[]) $VALUES.clone();
    }
}
