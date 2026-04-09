package rd;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import rd.b;

/* loaded from: classes4.dex */
public abstract class f {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60284a;

        static {
            int[] iArr = new int[b.a.EnumC2104a.values().length];
            try {
                iArr[b.a.EnumC2104a.TABLET_ANDROID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.a.EnumC2104a.PHONE_ANDROID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.a.EnumC2104a.TABLE_IOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.a.EnumC2104a.PHONE_IOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f60284a = iArr;
        }
    }

    public static final b.a.EnumC2104a a(String str) {
        AbstractC6492s.i(str, "<this>");
        switch (str.hashCode()) {
            case -1831212328:
                if (str.equals("ios_tablet")) {
                    return b.a.EnumC2104a.TABLE_IOS;
                }
                return null;
            case -680327266:
                if (str.equals("android_phone")) {
                    return b.a.EnumC2104a.PHONE_ANDROID;
                }
                return null;
            case 492354102:
                if (str.equals("android_tablet")) {
                    return b.a.EnumC2104a.TABLET_ANDROID;
                }
                return null;
            case 1184381628:
                if (str.equals("ios_phone")) {
                    return b.a.EnumC2104a.PHONE_IOS;
                }
                return null;
            default:
                return null;
        }
    }

    public static final String b(b.a.EnumC2104a enumC2104a) {
        AbstractC6492s.i(enumC2104a, "<this>");
        int i10 = a.f60284a[enumC2104a.ordinal()];
        if (i10 == 1) {
            return "android_tablet";
        }
        if (i10 == 2) {
            return "android_phone";
        }
        if (i10 == 3) {
            return "ios_tablet";
        }
        if (i10 == 4) {
            return "ios_phone";
        }
        throw new NoWhenBranchMatchedException();
    }
}
