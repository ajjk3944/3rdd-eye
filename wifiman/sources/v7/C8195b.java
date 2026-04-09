package v7;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: v7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8195b {

    /* renamed from: a, reason: collision with root package name */
    public static final C8195b f63487a = new C8195b();

    /* renamed from: v7.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63488a;

        static {
            int[] iArr = new int[EnumC8194a.values().length];
            try {
                iArr[EnumC8194a.BIG_ENDIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8194a.LITTLE_ENDIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f63488a = iArr;
        }
    }

    private C8195b() {
    }

    private final int c(byte b10, int i10) {
        return (b10 & 255) << i10;
    }

    public final boolean a(byte[] bytes, EnumC8194a order) {
        AbstractC6492s.i(bytes, "bytes");
        AbstractC6492s.i(order, "order");
        int iB = b(bytes, order);
        if (iB == 0) {
            return false;
        }
        if (iB == 1) {
            return true;
        }
        throw new IllegalArgumentException("Value does not correspond to a boolean (int value = " + iB + ")");
    }

    public final int b(byte[] bytes, EnumC8194a order) {
        int length;
        AbstractC6492s.i(bytes, "bytes");
        AbstractC6492s.i(order, "order");
        if (bytes.length == 0) {
            throw new IllegalArgumentException("Input bytes must not be empty!");
        }
        int length2 = bytes.length;
        int iC = 0;
        for (int i10 = 0; i10 < length2; i10++) {
            byte b10 = bytes[i10];
            int i11 = a.f63488a[order.ordinal()];
            if (i11 == 1) {
                length = ((bytes.length - 1) - i10) * 8;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                length = i10 * 8;
            }
            iC += c(b10, length);
        }
        return iC;
    }
}
