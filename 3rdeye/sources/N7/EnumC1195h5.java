package N7;

import com.singular.sdk.internal.Constants;

/* compiled from: DivFontWeight.kt */
/* renamed from: N7.h5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1195h5 {
    LIGHT("light"),
    MEDIUM(Constants.MEDIUM),
    REGULAR("regular"),
    BOLD("bold");

    private final String value;
    public static final c Converter = new c();
    public static final p9.l<EnumC1195h5, String> TO_STRING = b.f8351g;
    public static final p9.l<String, EnumC1195h5> FROM_STRING = a.f8350g;

    /* compiled from: DivFontWeight.kt */
    /* renamed from: N7.h5$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, EnumC1195h5> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f8350g = new a(1);

        @Override // p9.l
        public final EnumC1195h5 invoke(String str) {
            String value = str;
            kotlin.jvm.internal.l.f(value, "value");
            EnumC1195h5.Converter.getClass();
            EnumC1195h5 enumC1195h5 = EnumC1195h5.LIGHT;
            if (value.equals(enumC1195h5.value)) {
                return enumC1195h5;
            }
            EnumC1195h5 enumC1195h52 = EnumC1195h5.MEDIUM;
            if (value.equals(enumC1195h52.value)) {
                return enumC1195h52;
            }
            EnumC1195h5 enumC1195h53 = EnumC1195h5.REGULAR;
            if (value.equals(enumC1195h53.value)) {
                return enumC1195h53;
            }
            EnumC1195h5 enumC1195h54 = EnumC1195h5.BOLD;
            if (value.equals(enumC1195h54.value)) {
                return enumC1195h54;
            }
            return null;
        }
    }

    /* compiled from: DivFontWeight.kt */
    /* renamed from: N7.h5$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<EnumC1195h5, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f8351g = new b(1);

        @Override // p9.l
        public final String invoke(EnumC1195h5 enumC1195h5) {
            EnumC1195h5 value = enumC1195h5;
            kotlin.jvm.internal.l.f(value, "value");
            EnumC1195h5.Converter.getClass();
            return value.value;
        }
    }

    /* compiled from: DivFontWeight.kt */
    /* renamed from: N7.h5$c */
    public static final class c {
    }

    EnumC1195h5(String str) {
        this.value = str;
    }
}
