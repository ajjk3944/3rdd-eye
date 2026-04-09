package N7;

/* compiled from: DivContentAlignmentVertical.kt */
/* loaded from: classes.dex */
public enum D3 {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");

    private final String value;
    public static final c Converter = new c();
    public static final p9.l<D3, String> TO_STRING = b.f5061g;
    public static final p9.l<String, D3> FROM_STRING = a.f5060g;

    /* compiled from: DivContentAlignmentVertical.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, D3> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f5060g = new a(1);

        @Override // p9.l
        public final D3 invoke(String str) {
            String value = str;
            kotlin.jvm.internal.l.f(value, "value");
            D3.Converter.getClass();
            D3 d32 = D3.TOP;
            if (value.equals(d32.value)) {
                return d32;
            }
            D3 d33 = D3.CENTER;
            if (value.equals(d33.value)) {
                return d33;
            }
            D3 d34 = D3.BOTTOM;
            if (value.equals(d34.value)) {
                return d34;
            }
            D3 d35 = D3.BASELINE;
            if (value.equals(d35.value)) {
                return d35;
            }
            D3 d36 = D3.SPACE_BETWEEN;
            if (value.equals(d36.value)) {
                return d36;
            }
            D3 d37 = D3.SPACE_AROUND;
            if (value.equals(d37.value)) {
                return d37;
            }
            D3 d38 = D3.SPACE_EVENLY;
            if (value.equals(d38.value)) {
                return d38;
            }
            return null;
        }
    }

    /* compiled from: DivContentAlignmentVertical.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<D3, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f5061g = new b(1);

        @Override // p9.l
        public final String invoke(D3 d32) {
            D3 value = d32;
            kotlin.jvm.internal.l.f(value, "value");
            D3.Converter.getClass();
            return value.value;
        }
    }

    /* compiled from: DivContentAlignmentVertical.kt */
    public static final class c {
    }

    D3(String str) {
        this.value = str;
    }
}
