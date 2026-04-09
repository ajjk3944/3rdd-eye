package com.survicate.surveys.entities.survey.audience;

import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/AudienceVisitorType;", "", "(Ljava/lang/String;I)V", "ANONYMOUS", "IDENTIFIED", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AudienceVisitorType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AudienceVisitorType[] $VALUES;

    @o(name = "anonymous")
    public static final AudienceVisitorType ANONYMOUS = new AudienceVisitorType("ANONYMOUS", 0);

    @o(name = "identified")
    public static final AudienceVisitorType IDENTIFIED = new AudienceVisitorType("IDENTIFIED", 1);

    private static final /* synthetic */ AudienceVisitorType[] $values() {
        return new AudienceVisitorType[]{ANONYMOUS, IDENTIFIED};
    }

    static {
        AudienceVisitorType[] audienceVisitorTypeArr$values = $values();
        $VALUES = audienceVisitorTypeArr$values;
        $ENTRIES = a.a.j(audienceVisitorTypeArr$values);
    }

    private AudienceVisitorType(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static AudienceVisitorType valueOf(String str) {
        return (AudienceVisitorType) Enum.valueOf(AudienceVisitorType.class, str);
    }

    public static AudienceVisitorType[] values() {
        return (AudienceVisitorType[]) $VALUES.clone();
    }
}
