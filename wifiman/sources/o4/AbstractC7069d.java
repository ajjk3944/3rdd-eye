package o4;

import A4.C;
import A4.I;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: o4.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7069d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f55268a = new byte[0];

    /* renamed from: o4.d$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f55269a;

        static {
            int[] iArr = new int[I.values().length];
            f55269a = iArr;
            try {
                iArr[I.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55269a[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55269a[I.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55269a[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(C.c cVar) throws GeneralSecurityException {
        int i10 = a.f55269a[cVar.a0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return ByteBuffer.allocate(5).put((byte) 0).putInt(cVar.Z()).array();
        }
        if (i10 == 3) {
            return ByteBuffer.allocate(5).put((byte) 1).putInt(cVar.Z()).array();
        }
        if (i10 == 4) {
            return f55268a;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
