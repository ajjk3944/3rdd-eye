package N7;

/* compiled from: DivVideoScale.kt */
/* renamed from: N7.kc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1245kc {
    FILL("fill"),
    NO_SCALE("no_scale"),
    FIT("fit");

    private final String value;
    public static final c Converter = new c();
    public static final p9.l<EnumC1245kc, String> TO_STRING = b.f8705g;
    public static final p9.l<String, EnumC1245kc> FROM_STRING = a.f8704g;

    /* compiled from: DivVideoScale.kt */
    /* renamed from: N7.kc$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, EnumC1245kc> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f8704g = new a(1);

        @Override // p9.l
        public final EnumC1245kc invoke(String str) {
            String value = str;
            kotlin.jvm.internal.l.f(value, "value");
            EnumC1245kc.Converter.getClass();
            EnumC1245kc enumC1245kc = EnumC1245kc.FILL;
            if (value.equals(enumC1245kc.value)) {
                return enumC1245kc;
            }
            EnumC1245kc enumC1245kc2 = EnumC1245kc.NO_SCALE;
            if (value.equals(enumC1245kc2.value)) {
                return enumC1245kc2;
            }
            EnumC1245kc enumC1245kc3 = EnumC1245kc.FIT;
            if (value.equals(enumC1245kc3.value)) {
                return enumC1245kc3;
            }
            return null;
        }
    }

    /* compiled from: DivVideoScale.kt */
    /* renamed from: N7.kc$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<EnumC1245kc, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f8705g = new b(1);

        @Override // p9.l
        public final String invoke(EnumC1245kc enumC1245kc) {
            EnumC1245kc value = enumC1245kc;
            kotlin.jvm.internal.l.f(value, "value");
            EnumC1245kc.Converter.getClass();
            return value.value;
        }
    }

    /* compiled from: DivVideoScale.kt */
    /* renamed from: N7.kc$c */
    public static final class c {
    }

    EnumC1245kc(String str) {
        this.value = str;
    }
}
