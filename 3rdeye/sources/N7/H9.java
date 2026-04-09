package N7;

/* compiled from: DivSizeUnit.kt */
/* loaded from: classes.dex */
public enum H9 {
    DP("dp"),
    SP("sp"),
    PX("px");

    private final String value;
    public static final c Converter = new c();
    public static final p9.l<H9, String> TO_STRING = b.f5405g;
    public static final p9.l<String, H9> FROM_STRING = a.f5404g;

    /* compiled from: DivSizeUnit.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, H9> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f5404g = new a(1);

        @Override // p9.l
        public final H9 invoke(String str) {
            String value = str;
            kotlin.jvm.internal.l.f(value, "value");
            H9.Converter.getClass();
            H9 h92 = H9.DP;
            if (value.equals(h92.value)) {
                return h92;
            }
            H9 h93 = H9.SP;
            if (value.equals(h93.value)) {
                return h93;
            }
            H9 h94 = H9.PX;
            if (value.equals(h94.value)) {
                return h94;
            }
            return null;
        }
    }

    /* compiled from: DivSizeUnit.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<H9, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f5405g = new b(1);

        @Override // p9.l
        public final String invoke(H9 h92) {
            H9 value = h92;
            kotlin.jvm.internal.l.f(value, "value");
            H9.Converter.getClass();
            return value.value;
        }
    }

    /* compiled from: DivSizeUnit.kt */
    public static final class c {
    }

    H9(String str) {
        this.value = str;
    }
}
