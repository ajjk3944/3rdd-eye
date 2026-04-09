package N7;

/* compiled from: DivBlendMode.kt */
/* loaded from: classes.dex */
public enum T2 {
    SOURCE_IN("source_in"),
    SOURCE_ATOP("source_atop"),
    DARKEN("darken"),
    LIGHTEN("lighten"),
    MULTIPLY("multiply"),
    SCREEN("screen");

    private final String value;
    public static final c Converter = new c();
    public static final p9.l<T2, String> TO_STRING = b.f6225g;
    public static final p9.l<String, T2> FROM_STRING = a.f6224g;

    /* compiled from: DivBlendMode.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, T2> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f6224g = new a(1);

        @Override // p9.l
        public final T2 invoke(String str) {
            String value = str;
            kotlin.jvm.internal.l.f(value, "value");
            T2.Converter.getClass();
            T2 t22 = T2.SOURCE_IN;
            if (value.equals(t22.value)) {
                return t22;
            }
            T2 t23 = T2.SOURCE_ATOP;
            if (value.equals(t23.value)) {
                return t23;
            }
            T2 t24 = T2.DARKEN;
            if (value.equals(t24.value)) {
                return t24;
            }
            T2 t25 = T2.LIGHTEN;
            if (value.equals(t25.value)) {
                return t25;
            }
            T2 t26 = T2.MULTIPLY;
            if (value.equals(t26.value)) {
                return t26;
            }
            T2 t27 = T2.SCREEN;
            if (value.equals(t27.value)) {
                return t27;
            }
            return null;
        }
    }

    /* compiled from: DivBlendMode.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<T2, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f6225g = new b(1);

        @Override // p9.l
        public final String invoke(T2 t22) {
            T2 value = t22;
            kotlin.jvm.internal.l.f(value, "value");
            T2.Converter.getClass();
            return value.value;
        }
    }

    /* compiled from: DivBlendMode.kt */
    public static final class c {
    }

    T2(String str) {
        this.value = str;
    }
}
