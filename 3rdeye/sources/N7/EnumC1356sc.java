package N7;

/* compiled from: DivVisibility.kt */
/* renamed from: N7.sc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1356sc {
    VISIBLE("visible"),
    INVISIBLE("invisible"),
    GONE("gone");

    private final String value;
    public static final c Converter = new c();
    public static final p9.l<EnumC1356sc, String> TO_STRING = b.f9194g;
    public static final p9.l<String, EnumC1356sc> FROM_STRING = a.f9193g;

    /* compiled from: DivVisibility.kt */
    /* renamed from: N7.sc$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, EnumC1356sc> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f9193g = new a(1);

        @Override // p9.l
        public final EnumC1356sc invoke(String str) {
            String value = str;
            kotlin.jvm.internal.l.f(value, "value");
            EnumC1356sc.Converter.getClass();
            EnumC1356sc enumC1356sc = EnumC1356sc.VISIBLE;
            if (value.equals(enumC1356sc.value)) {
                return enumC1356sc;
            }
            EnumC1356sc enumC1356sc2 = EnumC1356sc.INVISIBLE;
            if (value.equals(enumC1356sc2.value)) {
                return enumC1356sc2;
            }
            EnumC1356sc enumC1356sc3 = EnumC1356sc.GONE;
            if (value.equals(enumC1356sc3.value)) {
                return enumC1356sc3;
            }
            return null;
        }
    }

    /* compiled from: DivVisibility.kt */
    /* renamed from: N7.sc$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<EnumC1356sc, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f9194g = new b(1);

        @Override // p9.l
        public final String invoke(EnumC1356sc enumC1356sc) {
            EnumC1356sc value = enumC1356sc;
            kotlin.jvm.internal.l.f(value, "value");
            EnumC1356sc.Converter.getClass();
            return value.value;
        }
    }

    /* compiled from: DivVisibility.kt */
    /* renamed from: N7.sc$c */
    public static final class c {
    }

    EnumC1356sc(String str) {
        this.value = str;
    }
}
