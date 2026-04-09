package ha;

import ca.l;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f10601d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10602a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f10603b;

    /* renamed from: c, reason: collision with root package name */
    public int f10604c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j = bArr[0] & 255;
        if (z10) {
            j &= ~f10601d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j = (j << 8) | (bArr[i11] & 255);
        }
        return j;
    }

    public final long b(l lVar, boolean z10, boolean z11, int i10) {
        int i11;
        int i12 = this.f10603b;
        byte[] bArr = this.f10602a;
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
                if ((f10601d[i14] & i13) != 0) {
                    i11 = i14 + 1;
                    break;
                }
                i14++;
            }
            this.f10604c = i11;
            if (i11 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f10603b = 1;
        }
        int i15 = this.f10604c;
        if (i15 > i10) {
            this.f10603b = 0;
            return -2L;
        }
        if (i15 != 1) {
            lVar.readFully(bArr, 1, i15 - 1);
        }
        this.f10603b = 0;
        return a(bArr, this.f10604c, z11);
    }
}
