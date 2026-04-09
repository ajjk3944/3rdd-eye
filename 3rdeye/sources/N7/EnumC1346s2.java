package N7;

import com.singular.sdk.internal.Constants;

/* compiled from: DivAnimationDirection.kt */
/* renamed from: N7.s2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1346s2 {
    NORMAL(Constants.NORMAL),
    REVERSE("reverse"),
    ALTERNATE("alternate"),
    ALTERNATE_REVERSE("alternate_reverse");

    private final String value;
    public static final c Converter = new c();
    public static final p9.l<EnumC1346s2, String> TO_STRING = b.f9137g;
    public static final p9.l<String, EnumC1346s2> FROM_STRING = a.f9136g;

    /* compiled from: DivAnimationDirection.kt */
    /* renamed from: N7.s2$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, EnumC1346s2> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f9136g = new a(1);

        @Override // p9.l
        public final EnumC1346s2 invoke(String str) {
            String value = str;
            kotlin.jvm.internal.l.f(value, "value");
            EnumC1346s2.Converter.getClass();
            EnumC1346s2 enumC1346s2 = EnumC1346s2.NORMAL;
            if (value.equals(enumC1346s2.value)) {
                return enumC1346s2;
            }
            EnumC1346s2 enumC1346s22 = EnumC1346s2.REVERSE;
            if (value.equals(enumC1346s22.value)) {
                return enumC1346s22;
            }
            EnumC1346s2 enumC1346s23 = EnumC1346s2.ALTERNATE;
            if (value.equals(enumC1346s23.value)) {
                return enumC1346s23;
            }
            EnumC1346s2 enumC1346s24 = EnumC1346s2.ALTERNATE_REVERSE;
            if (value.equals(enumC1346s24.value)) {
                return enumC1346s24;
            }
            return null;
        }
    }

    /* compiled from: DivAnimationDirection.kt */
    /* renamed from: N7.s2$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<EnumC1346s2, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f9137g = new b(1);

        @Override // p9.l
        public final String invoke(EnumC1346s2 enumC1346s2) {
            EnumC1346s2 value = enumC1346s2;
            kotlin.jvm.internal.l.f(value, "value");
            EnumC1346s2.Converter.getClass();
            return value.value;
        }
    }

    /* compiled from: DivAnimationDirection.kt */
    /* renamed from: N7.s2$c */
    public static final class c {
    }

    EnumC1346s2(String str) {
        this.value = str;
    }
}
