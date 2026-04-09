package N7;

/* compiled from: DivTransitionTrigger.kt */
/* loaded from: classes.dex */
public enum Ub {
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    VISIBILITY_CHANGE("visibility_change");

    private final String value;
    public static final c Converter = new c();
    public static final p9.l<Ub, String> TO_STRING = b.f6404g;
    public static final p9.l<String, Ub> FROM_STRING = a.f6403g;

    /* compiled from: DivTransitionTrigger.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, Ub> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f6403g = new a(1);

        @Override // p9.l
        public final Ub invoke(String str) {
            String value = str;
            kotlin.jvm.internal.l.f(value, "value");
            Ub.Converter.getClass();
            Ub ub = Ub.DATA_CHANGE;
            if (value.equals(ub.value)) {
                return ub;
            }
            Ub ub2 = Ub.STATE_CHANGE;
            if (value.equals(ub2.value)) {
                return ub2;
            }
            Ub ub3 = Ub.VISIBILITY_CHANGE;
            if (value.equals(ub3.value)) {
                return ub3;
            }
            return null;
        }
    }

    /* compiled from: DivTransitionTrigger.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Ub, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f6404g = new b(1);

        @Override // p9.l
        public final String invoke(Ub ub) {
            Ub value = ub;
            kotlin.jvm.internal.l.f(value, "value");
            Ub.Converter.getClass();
            return value.value;
        }
    }

    /* compiled from: DivTransitionTrigger.kt */
    public static final class c {
    }

    Ub(String str) {
        this.value = str;
    }
}
