package N7;

/* compiled from: DivAlignmentHorizontal.kt */
/* renamed from: N7.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1305p2 {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    START("start"),
    END("end");

    private final String value;
    public static final c Converter = new c();
    public static final p9.l<EnumC1305p2, String> TO_STRING = b.f8888g;
    public static final p9.l<String, EnumC1305p2> FROM_STRING = a.f8887g;

    /* compiled from: DivAlignmentHorizontal.kt */
    /* renamed from: N7.p2$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, EnumC1305p2> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f8887g = new a(1);

        @Override // p9.l
        public final EnumC1305p2 invoke(String str) {
            String value = str;
            kotlin.jvm.internal.l.f(value, "value");
            EnumC1305p2.Converter.getClass();
            EnumC1305p2 enumC1305p2 = EnumC1305p2.LEFT;
            if (value.equals(enumC1305p2.value)) {
                return enumC1305p2;
            }
            EnumC1305p2 enumC1305p22 = EnumC1305p2.CENTER;
            if (value.equals(enumC1305p22.value)) {
                return enumC1305p22;
            }
            EnumC1305p2 enumC1305p23 = EnumC1305p2.RIGHT;
            if (value.equals(enumC1305p23.value)) {
                return enumC1305p23;
            }
            EnumC1305p2 enumC1305p24 = EnumC1305p2.START;
            if (value.equals(enumC1305p24.value)) {
                return enumC1305p24;
            }
            EnumC1305p2 enumC1305p25 = EnumC1305p2.END;
            if (value.equals(enumC1305p25.value)) {
                return enumC1305p25;
            }
            return null;
        }
    }

    /* compiled from: DivAlignmentHorizontal.kt */
    /* renamed from: N7.p2$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<EnumC1305p2, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f8888g = new b(1);

        @Override // p9.l
        public final String invoke(EnumC1305p2 enumC1305p2) {
            EnumC1305p2 value = enumC1305p2;
            kotlin.jvm.internal.l.f(value, "value");
            EnumC1305p2.Converter.getClass();
            return value.value;
        }
    }

    /* compiled from: DivAlignmentHorizontal.kt */
    /* renamed from: N7.p2$c */
    public static final class c {
    }

    EnumC1305p2(String str) {
        this.value = str;
    }
}
