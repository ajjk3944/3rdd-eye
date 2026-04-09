package jcifs.smb1.smb1;

/* renamed from: jcifs.smb1.smb1.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6269c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f50544a;

    /* renamed from: b, reason: collision with root package name */
    static Object[] f50545b;

    /* renamed from: c, reason: collision with root package name */
    private static int f50546c;

    static {
        int iD = Rg.a.d("jcifs.smb1.smb.maxBuffers", 16);
        f50544a = iD;
        f50545b = new Object[iD];
        f50546c = 0;
    }

    public static byte[] a() {
        synchronized (f50545b) {
            try {
                if (f50546c > 0) {
                    for (int i10 = 0; i10 < f50544a; i10++) {
                        Object[] objArr = f50545b;
                        Object obj = objArr[i10];
                        if (obj != null) {
                            byte[] bArr = (byte[]) obj;
                            objArr[i10] = null;
                            f50546c--;
                            return bArr;
                        }
                    }
                }
                return new byte[65535];
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void b(C c10, D d10) {
        synchronized (f50545b) {
            c10.f50289r1 = a();
            d10.f50308k1 = a();
        }
    }

    public static void c(byte[] bArr) {
        synchronized (f50545b) {
            try {
                if (f50546c < f50544a) {
                    for (int i10 = 0; i10 < f50544a; i10++) {
                        Object[] objArr = f50545b;
                        if (objArr[i10] == null) {
                            objArr[i10] = bArr;
                            f50546c++;
                            return;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
