package com.survicate.surveys.entities.survey.audience.attributes;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterStringAttributeOperator;", "", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeOperator;", "(Ljava/lang/String;I)V", "IS_EQUAL", "IS_NOT_EQUAL", "CONTAINS", "DOES_NOT_CONTAIN", "EXISTS", "DOES_NOT_EXIST", "ANY", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AudienceUserFilterStringAttributeOperator implements AudienceUserFilterAttributeOperator {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AudienceUserFilterStringAttributeOperator[] $VALUES;

    @o(name = "is_equal")
    public static final AudienceUserFilterStringAttributeOperator IS_EQUAL = new AudienceUserFilterStringAttributeOperator("IS_EQUAL", 0);

    @o(name = "is_not_equal")
    public static final AudienceUserFilterStringAttributeOperator IS_NOT_EQUAL = new AudienceUserFilterStringAttributeOperator("IS_NOT_EQUAL", 1);

    @o(name = "contains")
    public static final AudienceUserFilterStringAttributeOperator CONTAINS = new AudienceUserFilterStringAttributeOperator("CONTAINS", 2);

    @o(name = "does_not_contain")
    public static final AudienceUserFilterStringAttributeOperator DOES_NOT_CONTAIN = new AudienceUserFilterStringAttributeOperator("DOES_NOT_CONTAIN", 3);

    @o(name = "exists")
    public static final AudienceUserFilterStringAttributeOperator EXISTS = new AudienceUserFilterStringAttributeOperator("EXISTS", 4);

    @o(name = "does_not_exist")
    public static final AudienceUserFilterStringAttributeOperator DOES_NOT_EXIST = new AudienceUserFilterStringAttributeOperator("DOES_NOT_EXIST", 5);

    @o(name = "any")
    public static final AudienceUserFilterStringAttributeOperator ANY = new AudienceUserFilterStringAttributeOperator("ANY", 6);

    private static final /* synthetic */ AudienceUserFilterStringAttributeOperator[] $values() {
        return new AudienceUserFilterStringAttributeOperator[]{IS_EQUAL, IS_NOT_EQUAL, CONTAINS, DOES_NOT_CONTAIN, EXISTS, DOES_NOT_EXIST, ANY};
    }

    static {
        AudienceUserFilterStringAttributeOperator[] audienceUserFilterStringAttributeOperatorArr$values = $values();
        $VALUES = audienceUserFilterStringAttributeOperatorArr$values;
        $ENTRIES = a.a.j(audienceUserFilterStringAttributeOperatorArr$values);
    }

    private AudienceUserFilterStringAttributeOperator(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static AudienceUserFilterStringAttributeOperator valueOf(String str) {
        return (AudienceUserFilterStringAttributeOperator) Enum.valueOf(AudienceUserFilterStringAttributeOperator.class, str);
    }

    public static AudienceUserFilterStringAttributeOperator[] values() {
        return (AudienceUserFilterStringAttributeOperator[]) $VALUES.clone();
    }
}
