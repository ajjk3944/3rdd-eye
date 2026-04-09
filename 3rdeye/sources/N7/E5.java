package N7;

/* compiled from: DivImageScale.kt */
/* loaded from: classes.dex */
public enum E5 {
    FILL("fill"),
    NO_SCALE("no_scale"),
    FIT("fit"),
    STRETCH("stretch");

    private final String value;
    public static final c Converter = new c();
    public static final p9.l<E5, String> TO_STRING = b.f5140g;
    public static final p9.l<String, E5> FROM_STRING = a.f5139g;

    /* compiled from: DivImageScale.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, E5> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f5139g = new a(1);

        @Override // p9.l
        public final E5 invoke(String str) {
            String value = str;
            kotlin.jvm.internal.l.f(value, "value");
            E5.Converter.getClass();
            E5 e52 = E5.FILL;
            if (value.equals(e52.value)) {
                return e52;
            }
            E5 e53 = E5.NO_SCALE;
            if (value.equals(e53.value)) {
                return e53;
            }
            E5 e54 = E5.FIT;
            if (value.equals(e54.value)) {
                return e54;
            }
            E5 e55 = E5.STRETCH;
            if (value.equals(e55.value)) {
                return e55;
            }
            return null;
        }
    }

    /* compiled from: DivImageScale.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<E5, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f5140g = new b(1);

        @Override // p9.l
        public final String invoke(E5 e52) {
            E5 value = e52;
            kotlin.jvm.internal.l.f(value, "value");
            E5.Converter.getClass();
            return value.value;
        }
    }

    /* compiled from: DivImageScale.kt */
    public static final class c {
    }

    E5(String str) {
        this.value = str;
    }
}
