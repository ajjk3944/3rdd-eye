package com.survicate.surveys.entities.survey.audience.attributes;

import br.g;
import br.l;
import java.util.Locale;
import kotlin.Metadata;
import nk.o;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeType;", "", "(Ljava/lang/String;I)V", "BOOLEAN", "DATETIME", "STRING", "NUMBER", "TIME_INTERVAL", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AudienceUserFilterAttributeType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AudienceUserFilterAttributeType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @o(name = "boolean")
    public static final AudienceUserFilterAttributeType BOOLEAN = new AudienceUserFilterAttributeType("BOOLEAN", 0);

    @o(name = "datetime")
    public static final AudienceUserFilterAttributeType DATETIME = new AudienceUserFilterAttributeType("DATETIME", 1);

    @o(name = "string")
    public static final AudienceUserFilterAttributeType STRING = new AudienceUserFilterAttributeType("STRING", 2);

    @o(name = "number")
    public static final AudienceUserFilterAttributeType NUMBER = new AudienceUserFilterAttributeType("NUMBER", 3);

    @o(name = "time_interval")
    public static final AudienceUserFilterAttributeType TIME_INTERVAL = new AudienceUserFilterAttributeType("TIME_INTERVAL", 4);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeType$Companion;", "", "()V", "fromString", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeType;", "value", "", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final AudienceUserFilterAttributeType fromString(String value) {
            l.e(value, "value");
            for (AudienceUserFilterAttributeType audienceUserFilterAttributeType : AudienceUserFilterAttributeType.values()) {
                String strName = audienceUserFilterAttributeType.name();
                Locale locale = Locale.US;
                l.d(locale, "US");
                String lowerCase = strName.toLowerCase(locale);
                l.d(lowerCase, "toLowerCase(...)");
                l.d(locale, "US");
                String lowerCase2 = value.toLowerCase(locale);
                l.d(lowerCase2, "toLowerCase(...)");
                if (lowerCase.equals(lowerCase2)) {
                    return audienceUserFilterAttributeType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ AudienceUserFilterAttributeType[] $values() {
        return new AudienceUserFilterAttributeType[]{BOOLEAN, DATETIME, STRING, NUMBER, TIME_INTERVAL};
    }

    static {
        AudienceUserFilterAttributeType[] audienceUserFilterAttributeTypeArr$values = $values();
        $VALUES = audienceUserFilterAttributeTypeArr$values;
        $ENTRIES = a.a.j(audienceUserFilterAttributeTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private AudienceUserFilterAttributeType(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static AudienceUserFilterAttributeType valueOf(String str) {
        return (AudienceUserFilterAttributeType) Enum.valueOf(AudienceUserFilterAttributeType.class, str);
    }

    public static AudienceUserFilterAttributeType[] values() {
        return (AudienceUserFilterAttributeType[]) $VALUES.clone();
    }
}
