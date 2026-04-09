package com.survicate.surveys.entities.survey.audience;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/AudienceRelation;", "", "(Ljava/lang/String;I)V", "AND", "OR", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AudienceRelation {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AudienceRelation[] $VALUES;

    @o(name = "and")
    public static final AudienceRelation AND = new AudienceRelation("AND", 0);

    @o(name = "or")
    public static final AudienceRelation OR = new AudienceRelation("OR", 1);

    private static final /* synthetic */ AudienceRelation[] $values() {
        return new AudienceRelation[]{AND, OR};
    }

    static {
        AudienceRelation[] audienceRelationArr$values = $values();
        $VALUES = audienceRelationArr$values;
        $ENTRIES = a.a.j(audienceRelationArr$values);
    }

    private AudienceRelation(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static AudienceRelation valueOf(String str) {
        return (AudienceRelation) Enum.valueOf(AudienceRelation.class, str);
    }

    public static AudienceRelation[] values() {
        return (AudienceRelation[]) $VALUES.clone();
    }
}
