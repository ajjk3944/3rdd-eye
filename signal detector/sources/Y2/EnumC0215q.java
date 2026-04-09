package Y2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Y2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0215q {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0215q f4357a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0215q[] f4358b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0215q EF0;

    static {
        EnumC0215q enumC0215q = new EnumC0215q("DEBUG_PARAM_UNKNOWN", 0);
        EnumC0215q enumC0215q2 = new EnumC0215q("ALWAYS_SHOW", 1);
        EnumC0215q enumC0215q3 = new EnumC0215q("GEO_OVERRIDE_EEA", 2);
        EnumC0215q enumC0215q4 = new EnumC0215q("GEO_OVERRIDE_REGULATED_US_STATE", 3);
        EnumC0215q enumC0215q5 = new EnumC0215q("GEO_OVERRIDE_OTHER", 4);
        EnumC0215q enumC0215q6 = new EnumC0215q("GEO_OVERRIDE_NON_EEA", 5);
        EnumC0215q enumC0215q7 = new EnumC0215q("PREVIEWING_DEBUG_MESSAGES", 6);
        f4357a = enumC0215q7;
        f4358b = new EnumC0215q[]{enumC0215q, enumC0215q2, enumC0215q3, enumC0215q4, enumC0215q5, enumC0215q6, enumC0215q7};
    }

    public static EnumC0215q[] values() {
        return (EnumC0215q[]) f4358b.clone();
    }
}
