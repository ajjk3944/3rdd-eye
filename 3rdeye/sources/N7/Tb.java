package N7;

/* compiled from: DivTransitionSelector.kt */
/* loaded from: classes.dex */
public enum Tb {
    NONE("none"),
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    ANY_CHANGE("any_change");

    private final String value;
    public static final c Converter = new c();
    public static final p9.l<Tb, String> TO_STRING = b.f6351g;
    public static final p9.l<String, Tb> FROM_STRING = a.f6350g;

    /* compiled from: DivTransitionSelector.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, Tb> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f6350g = new a(1);

        @Override // p9.l
        public final Tb invoke(String str) {
            String value = str;
            kotlin.jvm.internal.l.f(value, "value");
            Tb.Converter.getClass();
            Tb tb = Tb.NONE;
            if (value.equals(tb.value)) {
                return tb;
            }
            Tb tb2 = Tb.DATA_CHANGE;
            if (value.equals(tb2.value)) {
                return tb2;
            }
            Tb tb3 = Tb.STATE_CHANGE;
            if (value.equals(tb3.value)) {
                return tb3;
            }
            Tb tb4 = Tb.ANY_CHANGE;
            if (value.equals(tb4.value)) {
                return tb4;
            }
            return null;
        }
    }

    /* compiled from: DivTransitionSelector.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Tb, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f6351g = new b(1);

        @Override // p9.l
        public final String invoke(Tb tb) {
            Tb value = tb;
            kotlin.jvm.internal.l.f(value, "value");
            Tb.Converter.getClass();
            return value.value;
        }
    }

    /* compiled from: DivTransitionSelector.kt */
    public static final class c {
    }

    Tb(String str) {
        this.value = str;
    }
}
