package rs;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f21746a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f21747b = new d0();

    public static int a(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int b(byte[] bArr, int i10, int i11) {
        byte b2 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i12 == 1) {
            return a(b2, bArr[i10]);
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if (b2 > -12 || b10 > -65 || b11 > -65) {
            return -1;
        }
        return (b11 << 16) ^ ((b10 << 8) ^ b2);
    }

    public static int c(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                i10 = i12;
            } else if (b2 < -32) {
                if (i12 >= i11) {
                    return b2;
                }
                if (b2 < -62) {
                    return -1;
                }
                i10 += 2;
                if (bArr[i12] > -65) {
                    return -1;
                }
            } else if (b2 < -16) {
                if (i12 >= i11 - 1) {
                    return b(bArr, i12, i11);
                }
                int i13 = i10 + 2;
                byte b10 = bArr[i12];
                if (b10 > -65) {
                    return -1;
                }
                if (b2 == -32 && b10 < -96) {
                    return -1;
                }
                if (b2 == -19 && b10 >= -96) {
                    return -1;
                }
                i10 += 3;
                if (bArr[i13] > -65) {
                    return -1;
                }
            } else {
                if (i12 >= i11 - 2) {
                    return b(bArr, i12, i11);
                }
                int i14 = i10 + 2;
                byte b11 = bArr[i12];
                if (b11 > -65) {
                    return -1;
                }
                if ((((b11 + 112) + (b2 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i15 = i10 + 3;
                if (bArr[i14] > -65) {
                    return -1;
                }
                i10 += 4;
                if (bArr[i15] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
