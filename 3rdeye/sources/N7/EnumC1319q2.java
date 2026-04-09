package N7;

/* compiled from: DivAlignmentVertical.kt */
/* renamed from: N7.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1319q2 {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline");

    private final String value;
    public static final c Converter = new c();
    public static final p9.l<EnumC1319q2, String> TO_STRING = b.f8922g;
    public static final p9.l<String, EnumC1319q2> FROM_STRING = a.f8921g;

    /* compiled from: DivAlignmentVertical.kt */
    /* renamed from: N7.q2$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, EnumC1319q2> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f8921g = new a(1);

        @Override // p9.l
        public final EnumC1319q2 invoke(String str) {
            String value = str;
            kotlin.jvm.internal.l.f(value, "value");
            EnumC1319q2.Converter.getClass();
            EnumC1319q2 enumC1319q2 = EnumC1319q2.TOP;
            if (value.equals(enumC1319q2.value)) {
                return enumC1319q2;
            }
            EnumC1319q2 enumC1319q22 = EnumC1319q2.CENTER;
            if (value.equals(enumC1319q22.value)) {
                return enumC1319q22;
            }
            EnumC1319q2 enumC1319q23 = EnumC1319q2.BOTTOM;
            if (value.equals(enumC1319q23.value)) {
                return enumC1319q23;
            }
            EnumC1319q2 enumC1319q24 = EnumC1319q2.BASELINE;
            if (value.equals(enumC1319q24.value)) {
                return enumC1319q24;
            }
            return null;
        }
    }

    /* compiled from: DivAlignmentVertical.kt */
    /* renamed from: N7.q2$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<EnumC1319q2, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f8922g = new b(1);

        @Override // p9.l
        public final String invoke(EnumC1319q2 enumC1319q2) {
            EnumC1319q2 value = enumC1319q2;
            kotlin.jvm.internal.l.f(value, "value");
            EnumC1319q2.Converter.getClass();
            return value.value;
        }
    }

    /* compiled from: DivAlignmentVertical.kt */
    /* renamed from: N7.q2$c */
    public static final class c {
    }

    EnumC1319q2(String str) {
        this.value = str;
    }
}
