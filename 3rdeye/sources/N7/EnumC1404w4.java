package N7;

import com.google.android.gms.common.internal.ImagesContract;

/* compiled from: DivEvaluableType.kt */
/* renamed from: N7.w4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1404w4 {
    STRING("string"),
    INTEGER("integer"),
    NUMBER("number"),
    BOOLEAN("boolean"),
    DATETIME("datetime"),
    COLOR("color"),
    URL(ImagesContract.URL),
    DICT("dict"),
    ARRAY("array");

    private final String value;
    public static final c Converter = new c();
    public static final p9.l<EnumC1404w4, String> TO_STRING = b.f9673g;
    public static final p9.l<String, EnumC1404w4> FROM_STRING = a.f9672g;

    /* compiled from: DivEvaluableType.kt */
    /* renamed from: N7.w4$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, EnumC1404w4> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f9672g = new a(1);

        @Override // p9.l
        public final EnumC1404w4 invoke(String str) {
            String value = str;
            kotlin.jvm.internal.l.f(value, "value");
            EnumC1404w4.Converter.getClass();
            EnumC1404w4 enumC1404w4 = EnumC1404w4.STRING;
            if (value.equals(enumC1404w4.value)) {
                return enumC1404w4;
            }
            EnumC1404w4 enumC1404w42 = EnumC1404w4.INTEGER;
            if (value.equals(enumC1404w42.value)) {
                return enumC1404w42;
            }
            EnumC1404w4 enumC1404w43 = EnumC1404w4.NUMBER;
            if (value.equals(enumC1404w43.value)) {
                return enumC1404w43;
            }
            EnumC1404w4 enumC1404w44 = EnumC1404w4.BOOLEAN;
            if (value.equals(enumC1404w44.value)) {
                return enumC1404w44;
            }
            EnumC1404w4 enumC1404w45 = EnumC1404w4.DATETIME;
            if (value.equals(enumC1404w45.value)) {
                return enumC1404w45;
            }
            EnumC1404w4 enumC1404w46 = EnumC1404w4.COLOR;
            if (value.equals(enumC1404w46.value)) {
                return enumC1404w46;
            }
            EnumC1404w4 enumC1404w47 = EnumC1404w4.URL;
            if (value.equals(enumC1404w47.value)) {
                return enumC1404w47;
            }
            EnumC1404w4 enumC1404w48 = EnumC1404w4.DICT;
            if (value.equals(enumC1404w48.value)) {
                return enumC1404w48;
            }
            EnumC1404w4 enumC1404w49 = EnumC1404w4.ARRAY;
            if (value.equals(enumC1404w49.value)) {
                return enumC1404w49;
            }
            return null;
        }
    }

    /* compiled from: DivEvaluableType.kt */
    /* renamed from: N7.w4$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<EnumC1404w4, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f9673g = new b(1);

        @Override // p9.l
        public final String invoke(EnumC1404w4 enumC1404w4) {
            EnumC1404w4 value = enumC1404w4;
            kotlin.jvm.internal.l.f(value, "value");
            EnumC1404w4.Converter.getClass();
            return value.value;
        }
    }

    /* compiled from: DivEvaluableType.kt */
    /* renamed from: N7.w4$c */
    public static final class c {
    }

    EnumC1404w4(String str) {
        this.value = str;
    }
}
