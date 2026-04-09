package If;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class L {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9145a;

        static {
            int[] iArr = new int[EnumC3021a.values().length];
            try {
                iArr[EnumC3021a.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3021a.REQUIREMENTS_NOT_MET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3021a.DISCOVERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3021a.ADOPTION_READY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3021a.ADOPTION_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC3021a.CONNECTING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC3021a.CONNECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC3021a.FW_UPDATE_PROGRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC3021a.COMPLIANCE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC3021a.FW_UPDATE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f9145a = iArr;
        }
    }

    public static final boolean a(EnumC3021a enumC3021a) {
        AbstractC6492s.i(enumC3021a, "<this>");
        switch (a.f9145a[enumC3021a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 9:
            case 10:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final float b(EnumC3021a enumC3021a) {
        AbstractC6492s.i(enumC3021a, "<this>");
        return Y0.h.j(111);
    }
}
