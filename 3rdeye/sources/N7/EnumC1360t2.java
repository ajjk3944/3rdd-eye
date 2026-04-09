package N7;

/* compiled from: DivAnimationInterpolator.kt */
/* renamed from: N7.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1360t2 {
    LINEAR("linear"),
    EASE("ease"),
    EASE_IN("ease_in"),
    EASE_OUT("ease_out"),
    EASE_IN_OUT("ease_in_out"),
    SPRING("spring");

    private final String value;
    public static final c Converter = new c();
    public static final p9.l<EnumC1360t2, String> TO_STRING = b.f9207g;
    public static final p9.l<String, EnumC1360t2> FROM_STRING = a.f9206g;

    /* compiled from: DivAnimationInterpolator.kt */
    /* renamed from: N7.t2$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, EnumC1360t2> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f9206g = new a(1);

        @Override // p9.l
        public final EnumC1360t2 invoke(String str) {
            String value = str;
            kotlin.jvm.internal.l.f(value, "value");
            EnumC1360t2.Converter.getClass();
            EnumC1360t2 enumC1360t2 = EnumC1360t2.LINEAR;
            if (value.equals(enumC1360t2.value)) {
                return enumC1360t2;
            }
            EnumC1360t2 enumC1360t22 = EnumC1360t2.EASE;
            if (value.equals(enumC1360t22.value)) {
                return enumC1360t22;
            }
            EnumC1360t2 enumC1360t23 = EnumC1360t2.EASE_IN;
            if (value.equals(enumC1360t23.value)) {
                return enumC1360t23;
            }
            EnumC1360t2 enumC1360t24 = EnumC1360t2.EASE_OUT;
            if (value.equals(enumC1360t24.value)) {
                return enumC1360t24;
            }
            EnumC1360t2 enumC1360t25 = EnumC1360t2.EASE_IN_OUT;
            if (value.equals(enumC1360t25.value)) {
                return enumC1360t25;
            }
            EnumC1360t2 enumC1360t26 = EnumC1360t2.SPRING;
            if (value.equals(enumC1360t26.value)) {
                return enumC1360t26;
            }
            return null;
        }
    }

    /* compiled from: DivAnimationInterpolator.kt */
    /* renamed from: N7.t2$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<EnumC1360t2, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f9207g = new b(1);

        @Override // p9.l
        public final String invoke(EnumC1360t2 enumC1360t2) {
            EnumC1360t2 value = enumC1360t2;
            kotlin.jvm.internal.l.f(value, "value");
            EnumC1360t2.Converter.getClass();
            return value.value;
        }
    }

    /* compiled from: DivAnimationInterpolator.kt */
    /* renamed from: N7.t2$c */
    public static final class c {
    }

    EnumC1360t2(String str) {
        this.value = str;
    }
}
