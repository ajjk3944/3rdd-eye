package C6;

import N7.EnumC1404w4;
import a7.EnumC1667d;

/* compiled from: FunctionMapper.kt */
/* loaded from: classes.dex */
public final class h {

    /* compiled from: FunctionMapper.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f947a;

        static {
            int[] iArr = new int[EnumC1404w4.values().length];
            try {
                iArr[EnumC1404w4.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1404w4.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1404w4.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1404w4.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC1404w4.DATETIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC1404w4.COLOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC1404w4.URL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC1404w4.DICT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC1404w4.ARRAY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f947a = iArr;
        }
    }

    public static final EnumC1667d a(EnumC1404w4 enumC1404w4) {
        switch (a.f947a[enumC1404w4.ordinal()]) {
            case 1:
                return EnumC1667d.STRING;
            case 2:
                return EnumC1667d.INTEGER;
            case 3:
                return EnumC1667d.NUMBER;
            case 4:
                return EnumC1667d.BOOLEAN;
            case 5:
                return EnumC1667d.DATETIME;
            case 6:
                return EnumC1667d.COLOR;
            case 7:
                return EnumC1667d.URL;
            case 8:
                return EnumC1667d.DICT;
            case 9:
                return EnumC1667d.ARRAY;
            default:
                throw new b9.j();
        }
    }
}
