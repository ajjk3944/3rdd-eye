package N7;

/* compiled from: DivTextAlignmentVertical.kt */
/* loaded from: classes.dex */
public enum La {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline");

    private final String value;
    public static final c Converter = new c();
    public static final p9.l<La, String> TO_STRING = b.f5826g;
    public static final p9.l<String, La> FROM_STRING = a.f5825g;

    /* compiled from: DivTextAlignmentVertical.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, La> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f5825g = new a(1);

        @Override // p9.l
        public final La invoke(String str) {
            String value = str;
            kotlin.jvm.internal.l.f(value, "value");
            La.Converter.getClass();
            La la2 = La.TOP;
            if (value.equals(la2.value)) {
                return la2;
            }
            La la3 = La.CENTER;
            if (value.equals(la3.value)) {
                return la3;
            }
            La la4 = La.BOTTOM;
            if (value.equals(la4.value)) {
                return la4;
            }
            La la5 = La.BASELINE;
            if (value.equals(la5.value)) {
                return la5;
            }
            return null;
        }
    }

    /* compiled from: DivTextAlignmentVertical.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<La, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f5826g = new b(1);

        @Override // p9.l
        public final String invoke(La la2) {
            La value = la2;
            kotlin.jvm.internal.l.f(value, "value");
            La.Converter.getClass();
            return value.value;
        }
    }

    /* compiled from: DivTextAlignmentVertical.kt */
    public static final class c {
    }

    La(String str) {
        this.value = str;
    }
}
