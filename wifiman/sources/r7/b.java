package R7;

import b8.EnumC4076c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class b {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19590a;

        static {
            int[] iArr = new int[EnumC4076c.values().length];
            try {
                iArr[EnumC4076c.MOBILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4076c.WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4076c.ETHERNET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4076c.DISCONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4076c.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f19590a = iArr;
        }
    }

    public static final String a(EnumC4076c enumC4076c) {
        AbstractC6492s.i(enumC4076c, "<this>");
        int i10 = a.f19590a[enumC4076c.ordinal()];
        if (i10 == 1) {
            return "cellular";
        }
        if (i10 == 2) {
            return "wifi";
        }
        if (i10 == 3) {
            return "ethernet";
        }
        if (i10 == 4) {
            return "disconnected";
        }
        if (i10 == 5) {
            return "unknown";
        }
        throw new NoWhenBranchMatchedException();
    }
}
