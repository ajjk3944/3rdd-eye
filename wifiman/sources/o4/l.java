package o4;

import A4.A;
import A4.I;
import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final A f55280a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f55281a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f55282b;

        static {
            int[] iArr = new int[b.values().length];
            f55282b = iArr;
            try {
                iArr[b.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55282b[b.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55282b[b.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55282b[b.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[I.values().length];
            f55281a = iArr2;
            try {
                iArr2[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55281a[I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55281a[I.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55281a[I.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    private l(A a10) {
        this.f55280a = a10;
    }

    public static l a(String str, byte[] bArr, b bVar) {
        return new l((A) A.b0().u(str).w(AbstractC5081h.s(bArr)).t(c(bVar)).i());
    }

    static I c(b bVar) {
        int i10 = a.f55282b[bVar.ordinal()];
        if (i10 == 1) {
            return I.TINK;
        }
        if (i10 == 2) {
            return I.LEGACY;
        }
        if (i10 == 3) {
            return I.RAW;
        }
        if (i10 == 4) {
            return I.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    A b() {
        return this.f55280a;
    }
}
