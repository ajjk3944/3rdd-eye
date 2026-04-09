package um;

import com.survicate.surveys.entities.survey.NetworkTargetingEvent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    /* renamed from: id, reason: collision with root package name */
    private final String f23593id;
    public static final a WIFI = new a("WIFI", 0, "wifi");
    public static final a MOBILE = new a("MOBILE", 1, NetworkTargetingEvent.TYPE_MOBILE);
    public static final a NONE = new a("NONE", 2, "none");

    private static final /* synthetic */ a[] $values() {
        return new a[]{WIFI, MOBILE, NONE};
    }

    static {
        a[] aVarArr$values = $values();
        $VALUES = aVarArr$values;
        $ENTRIES = a.a.j(aVarArr$values);
    }

    private a(String str, int i10, String str2) {
        this.f23593id = str2;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f23593id;
    }
}
