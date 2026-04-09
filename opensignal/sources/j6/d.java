package j6;

import u5.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f13408d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f13409a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f13410b;

    /* renamed from: c, reason: collision with root package name */
    public int f13411c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j = bArr[0] & 255;
        if (z10) {
            j &= ~f13408d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j = (j << 8) | (bArr[i11] & 255);
        }
        return j;
    }

    public final long b(l lVar, boolean z10, boolean z11, int i10) {
        int i11;
        int i12 = this.f13410b;
        byte[] bArr = this.f13409a;
        if (i12 == 0) {
            if (!lVar.b(bArr, 0, 1, z10)) {
                return -1L;
            }
            int i13 = bArr[0] & 255;
            int i14 = 0;
            while (true) {
                if (i14 >= 8) {
                    i11 = -1;
                    break;
                }
                if ((f13408d[i14] & i13) != 0) {
                    i11 = i14 + 1;
                    break;
                }
                i14++;
            }
            this.f13411c = i11;
            if (i11 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f13410b = 1;
        }
        int i15 = this.f13411c;
        if (i15 > i10) {
            this.f13410b = 0;
            return -2L;
        }
        if (i15 != 1) {
            lVar.readFully(bArr, 1, i15 - 1);
        }
        this.f13410b = 0;
        return a(bArr, this.f13411c, z11);
    }
}
