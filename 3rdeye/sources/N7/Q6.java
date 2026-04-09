package N7;

/* compiled from: DivLineStyle.kt */
/* loaded from: classes.dex */
public enum Q6 {
    NONE("none"),
    SINGLE("single");

    private final String value;
    public static final c Converter = new c();
    public static final p9.l<Q6, String> TO_STRING = b.f6039g;
    public static final p9.l<String, Q6> FROM_STRING = a.f6038g;

    /* compiled from: DivLineStyle.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, Q6> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f6038g = new a(1);

        @Override // p9.l
        public final Q6 invoke(String str) {
            String value = str;
            kotlin.jvm.internal.l.f(value, "value");
            Q6.Converter.getClass();
            Q6 q62 = Q6.NONE;
            if (value.equals(q62.value)) {
                return q62;
            }
            Q6 q63 = Q6.SINGLE;
            if (value.equals(q63.value)) {
                return q63;
            }
            return null;
        }
    }

    /* compiled from: DivLineStyle.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Q6, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f6039g = new b(1);

        @Override // p9.l
        public final String invoke(Q6 q62) {
            Q6 value = q62;
            kotlin.jvm.internal.l.f(value, "value");
            Q6.Converter.getClass();
            return value.value;
        }
    }

    /* compiled from: DivLineStyle.kt */
    public static final class c {
    }

    Q6(String str) {
        this.value = str;
    }
}
