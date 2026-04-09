package u5;

import a5.d0;
import androidx.media3.common.Metadata;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f23299a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23300b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23301c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23302d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23303e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23304f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23305g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23306h;

    /* renamed from: i, reason: collision with root package name */
    public final int f23307i;
    public final long j;
    public final ca.p k;

    /* renamed from: l, reason: collision with root package name */
    public final Metadata f23308l;

    public o(int i10, byte[] bArr) {
        byte b2 = 0;
        a5.u uVar = new a5.u(bArr, bArr.length, b2, b2);
        uVar.p(i10 * 8);
        this.f23299a = uVar.i(16);
        this.f23300b = uVar.i(16);
        this.f23301c = uVar.i(24);
        this.f23302d = uVar.i(24);
        int i11 = uVar.i(20);
        this.f23303e = i11;
        this.f23304f = d(i11);
        this.f23305g = uVar.i(3) + 1;
        int i12 = uVar.i(5) + 1;
        this.f23306h = i12;
        this.f23307i = a(i12);
        int i13 = uVar.i(4);
        int i14 = uVar.i(32);
        int i15 = d0.f105a;
        this.j = ((i13 & 4294967295L) << 32) | (i14 & 4294967295L);
        this.k = null;
        this.f23308l = null;
    }

    public static int a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f23303e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.common.r c(byte[] r9, androidx.media3.common.Metadata r10) {
        /*
            r8 = this;
            r0 = 4
            r1 = -128(0xffffffffffffff80, float:NaN)
            r9[r0] = r1
            int r0 = r8.f23302d
            if (r0 <= 0) goto La
            goto Lb
        La:
            r0 = -1
        Lb:
            androidx.media3.common.Metadata r1 = r8.f23308l
            if (r1 != 0) goto L10
            goto L35
        L10:
            if (r10 != 0) goto L13
            goto L18
        L13:
            androidx.media3.common.Metadata$Entry[] r10 = r10.f1549a
            int r2 = r10.length
            if (r2 != 0) goto L1a
        L18:
            r10 = r1
            goto L35
        L1a:
            androidx.media3.common.Metadata r2 = new androidx.media3.common.Metadata
            long r3 = r1.f1550d
            androidx.media3.common.Metadata$Entry[] r1 = r1.f1549a
            int r5 = a5.d0.f105a
            int r5 = r1.length
            int r6 = r10.length
            int r5 = r5 + r6
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r1, r5)
            int r1 = r1.length
            int r6 = r10.length
            r7 = 0
            java.lang.System.arraycopy(r10, r7, r5, r1, r6)
            androidx.media3.common.Metadata$Entry[] r5 = (androidx.media3.common.Metadata.Entry[]) r5
            r2.<init>(r3, r5)
            r10 = r2
        L35:
            androidx.media3.common.q r1 = new androidx.media3.common.q
            r1.<init>()
            java.lang.String r2 = "audio/flac"
            r1.k = r2
            r1.f1743l = r0
            int r0 = r8.f23305g
            r1.f1755x = r0
            int r0 = r8.f23303e
            r1.f1756y = r0
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r1.f1744m = r9
            r1.f1742i = r10
            androidx.media3.common.r r9 = new androidx.media3.common.r
            r9.<init>(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.o.c(byte[], androidx.media3.common.Metadata):androidx.media3.common.r");
    }

    public o(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j, ca.p pVar, Metadata metadata) {
        this.f23299a = i10;
        this.f23300b = i11;
        this.f23301c = i12;
        this.f23302d = i13;
        this.f23303e = i14;
        this.f23304f = d(i14);
        this.f23305g = i15;
        this.f23306h = i16;
        this.f23307i = a(i16);
        this.j = j;
        this.k = pVar;
        this.f23308l = metadata;
    }
}
