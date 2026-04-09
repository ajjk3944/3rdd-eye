package N7;

/* compiled from: DivContentAlignmentHorizontal.kt */
/* loaded from: classes.dex */
public enum C3 {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    START("start"),
    END("end"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");

    private final String value;
    public static final c Converter = new c();
    public static final p9.l<C3, String> TO_STRING = b.f5014g;
    public static final p9.l<String, C3> FROM_STRING = a.f5013g;

    /* compiled from: DivContentAlignmentHorizontal.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, C3> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f5013g = new a(1);

        @Override // p9.l
        public final C3 invoke(String str) {
            String value = str;
            kotlin.jvm.internal.l.f(value, "value");
            C3.Converter.getClass();
            C3 c32 = C3.LEFT;
            if (value.equals(c32.value)) {
                return c32;
            }
            C3 c33 = C3.CENTER;
            if (value.equals(c33.value)) {
                return c33;
            }
            C3 c34 = C3.RIGHT;
            if (value.equals(c34.value)) {
                return c34;
            }
            C3 c35 = C3.START;
            if (value.equals(c35.value)) {
                return c35;
            }
            C3 c36 = C3.END;
            if (value.equals(c36.value)) {
                return c36;
            }
            C3 c37 = C3.SPACE_BETWEEN;
            if (value.equals(c37.value)) {
                return c37;
            }
            C3 c38 = C3.SPACE_AROUND;
            if (value.equals(c38.value)) {
                return c38;
            }
            C3 c39 = C3.SPACE_EVENLY;
            if (value.equals(c39.value)) {
                return c39;
            }
            return null;
        }
    }

    /* compiled from: DivContentAlignmentHorizontal.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<C3, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f5014g = new b(1);

        @Override // p9.l
        public final String invoke(C3 c32) {
            C3 value = c32;
            kotlin.jvm.internal.l.f(value, "value");
            C3.Converter.getClass();
            return value.value;
        }
    }

    /* compiled from: DivContentAlignmentHorizontal.kt */
    public static final class c {
    }

    C3(String str) {
        this.value = str;
    }
}
