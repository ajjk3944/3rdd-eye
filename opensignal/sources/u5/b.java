package u5;

import a5.d0;
import androidx.media3.common.Metadata;
import androidx.media3.common.k0;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f23248a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f23249b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f23250c = {1, 2, 3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f23251d = {48000, 44100, 32000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f23252e = {24000, 22050, 16000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f23253f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f23254g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f23255h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f23256i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int[] j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f23257l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f23258m = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f23259n = {44100, 48000, 32000};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f23260o = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f23261p = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f23262q = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f23263r = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f23264s = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f23265t = {0, 0, 0, 1};

    /* renamed from: u, reason: collision with root package name */
    public static final float[] f23266u = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: v, reason: collision with root package name */
    public static final Object f23267v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public static int[] f23268w = new int[10];

    public static ArrayList a(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static boolean b(a5.v vVar, o oVar, int i10, ca.n nVar) {
        long jU = vVar.u();
        long j7 = jU >>> 16;
        if (j7 != i10) {
            return false;
        }
        boolean z10 = (j7 & 1) == 1;
        int i11 = (int) ((jU >> 12) & 15);
        int i12 = (int) ((jU >> 8) & 15);
        int i13 = (int) ((jU >> 4) & 15);
        int i14 = (int) ((jU >> 1) & 7);
        boolean z11 = (jU & 1) == 1;
        if (i13 <= 7) {
            if (i13 != oVar.f23305g - 1) {
                return false;
            }
        } else if (i13 > 10 || oVar.f23305g != 2) {
            return false;
        }
        if (!(i14 == 0 || i14 == oVar.f23307i) || z11) {
            return false;
        }
        try {
            long jZ = vVar.z();
            if (!z10) {
                jZ *= oVar.f23300b;
            }
            nVar.f3485a = jZ;
            int iS = s(i11, vVar);
            if (iS == -1 || iS > oVar.f23300b) {
                return false;
            }
            int i15 = oVar.f23303e;
            if (i12 != 0) {
                if (i12 <= 11) {
                    if (i12 != oVar.f23304f) {
                        return false;
                    }
                } else if (i12 != 12) {
                    if (i12 > 14) {
                        return false;
                    }
                    int iY = vVar.y();
                    if (i12 == 14) {
                        iY *= 10;
                    }
                    if (iY != i15) {
                        return false;
                    }
                } else if (vVar.t() * 1000 != i15) {
                    return false;
                }
            }
            int iT = vVar.t();
            int i16 = vVar.f166b;
            byte[] bArr = vVar.f165a;
            int i17 = i16 - 1;
            int i18 = 0;
            for (int i19 = vVar.f166b; i19 < i17; i19++) {
                i18 = d0.f115m[i18 ^ (bArr[i19] & 255)];
            }
            int i20 = d0.f105a;
            return iT == i18;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void c(String str, boolean z10) throws k0 {
        if (!z10) {
            throw k0.a(null, str);
        }
    }

    public static void d(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void e(long j7, a5.v vVar, a0[] a0VarArr) {
        int i10;
        while (true) {
            if (vVar.a() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (vVar.a() == 0) {
                    i10 = -1;
                    break;
                }
                int iT = vVar.t();
                i11 += iT;
                if (iT != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            while (true) {
                if (vVar.a() == 0) {
                    i12 = -1;
                    break;
                }
                int iT2 = vVar.t();
                i12 += iT2;
                if (iT2 != 255) {
                    break;
                }
            }
            int i13 = vVar.f166b + i12;
            if (i12 == -1 || i12 > vVar.a()) {
                a5.a.B("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i13 = vVar.f167c;
            } else if (i10 == 4 && i12 >= 8) {
                int iT3 = vVar.t();
                int iY = vVar.y();
                int iG = iY == 49 ? vVar.g() : 0;
                int iT4 = vVar.t();
                if (iY == 47) {
                    vVar.F(1);
                }
                boolean z10 = iT3 == 181 && (iY == 49 || iY == 47) && iT4 == 3;
                if (iY == 49) {
                    z10 &= iG == 1195456820;
                }
                if (z10) {
                    f(j7, vVar, a0VarArr);
                }
            }
            vVar.E(i13);
        }
    }

    public static void f(long j7, a5.v vVar, a0[] a0VarArr) {
        long j10;
        int iT = vVar.t();
        if ((iT & 64) != 0) {
            vVar.F(1);
            int i10 = (iT & 31) * 3;
            int i11 = vVar.f166b;
            int length = a0VarArr.length;
            int i12 = 0;
            while (i12 < length) {
                a0 a0Var = a0VarArr[i12];
                vVar.E(i11);
                a0Var.d(i10, vVar);
                if (j7 != -9223372036854775807L) {
                    j10 = j7;
                    a0Var.a(j10, 1, i10, 0, null);
                } else {
                    j10 = j7;
                }
                i12++;
                j7 = j10;
            }
        }
    }

    public static int g(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        a5.a.i(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            d(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            d(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            d(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b2 = bArr[i14];
            if ((b2 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b2 == 1) {
                    d(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static int h(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || i12 >= 19) {
            return -1;
        }
        int i13 = f23251d[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + f23255h[i12]) * 2;
        }
        int i14 = f23254g[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static void i(int i10, a5.v vVar) {
        vVar.B(7);
        byte[] bArr = vVar.f165a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f23259n[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f23260o[i13 - 1] : f23261p[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? f23262q[i13 - 1] : f23263r[i13 - 1] : f23264s[i13 - 1];
        if (i11 == 3) {
            return ((i17 * 144) / i15) + i16;
        }
        return (((i12 == 1 ? 72 : 144) * i17) / i15) + i16;
    }

    public static long k(byte b2, byte b10) {
        int i10;
        int i11 = b2 & 255;
        int i12 = b2 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = b10 & 63;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        return i10 * (i13 >= 16 ? 2500 << r6 : i13 >= 12 ? 10000 << (i13 & 1) : (i13 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static int l(a5.u uVar) throws k0 {
        int i10 = uVar.i(4);
        if (i10 == 15) {
            if (uVar.b() >= 24) {
                return uVar.i(24);
            }
            throw k0.a(null, "AAC header insufficient data");
        }
        if (i10 < 13) {
            return f23248a[i10];
        }
        throw k0.a(null, "AAC header wrong Sampling Frequency Index");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kc.c m(a5.u r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.s(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.i(r3)
            int[] r8 = u5.b.f23256i
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 8
            r8 = 1
            if (r2 == r8) goto L8b
            r8 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r7) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            kc.c r1 = new kc.c
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.b.m(a5.u):kc.c");
    }

    public static a n(a5.u uVar, boolean z10) throws k0 {
        int i10 = uVar.i(5);
        if (i10 == 31) {
            i10 = uVar.i(6) + 32;
        }
        int iL = l(uVar);
        int i11 = uVar.i(4);
        String strH = h0.b.h(i10, "mp4a.40.");
        if (i10 == 5 || i10 == 29) {
            iL = l(uVar);
            int i12 = uVar.i(5);
            if (i12 == 31) {
                i12 = uVar.i(6) + 32;
            }
            i10 = i12;
            if (i10 == 22) {
                i11 = uVar.i(4);
            }
        }
        if (z10) {
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7 && i10 != 17) {
                switch (i10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw k0.c("Unsupported audio object type: " + i10);
                }
            }
            if (uVar.h()) {
                a5.a.B("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (uVar.h()) {
                uVar.s(14);
            }
            boolean zH = uVar.h();
            if (i11 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i10 == 6 || i10 == 20) {
                uVar.s(3);
            }
            if (zH) {
                if (i10 == 22) {
                    uVar.s(16);
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    uVar.s(3);
                }
                uVar.s(1);
            }
            switch (i10) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i13 = uVar.i(2);
                    if (i13 == 2 || i13 == 3) {
                        throw k0.c("Unsupported epConfig: " + i13);
                    }
            }
        }
        int i14 = f23249b[i11];
        if (i14 != -1) {
            return new a(strH, iL, i14);
        }
        throw k0.a(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x02fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static u5.t o(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.b.o(byte[], int, int):u5.t");
    }

    public static int p(int i10) {
        int i11;
        int i12;
        if ((i10 & (-2097152)) == -2097152 && (i11 = (i10 >>> 19) & 3) != 1 && (i12 = (i10 >>> 17) & 3) != 0) {
            int i13 = (i10 >>> 12) & 15;
            int i14 = (i10 >>> 10) & 3;
            if (i13 != 0 && i13 != 15 && i14 != 3) {
                if (i12 == 1) {
                    return i11 == 3 ? 1152 : 576;
                }
                if (i12 == 2) {
                    return 1152;
                }
                if (i12 == 3) {
                    return 384;
                }
                throw new IllegalArgumentException();
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static u5.v q(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.b.q(byte[], int, int):u5.v");
    }

    public static Metadata r(l lVar, boolean z10) throws Throwable {
        d5.v vVar = z10 ? null : f6.c.f8634d;
        a5.v vVar2 = new a5.v(10);
        Metadata metadataK0 = null;
        int i10 = 0;
        while (true) {
            try {
                lVar.p(vVar2.f165a, 0, 10);
                vVar2.E(0);
                if (vVar2.v() != 4801587) {
                    break;
                }
                vVar2.F(3);
                int iS = vVar2.s();
                int i11 = iS + 10;
                if (metadataK0 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(vVar2.f165a, 0, bArr, 0, 10);
                    lVar.p(bArr, 10, iS);
                    metadataK0 = new f6.c(vVar).k0(i11, bArr);
                } else {
                    lVar.g(iS);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        lVar.l();
        lVar.g(i10);
        if (metadataK0 == null || metadataK0.f1549a.length == 0) {
            return null;
        }
        return metadataK0;
    }

    public static int s(int i10, a5.v vVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return 576 << (i10 - 2);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return vVar.t() + 1;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return vVar.y() + 1;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static ca.p t(a5.v vVar) {
        vVar.F(1);
        int iV = vVar.v();
        long j7 = vVar.f166b + iV;
        int i10 = iV / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long jN = vVar.n();
            if (jN == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jN;
            jArrCopyOf2[i11] = vVar.n();
            vVar.F(2);
            i11++;
        }
        vVar.F((int) (j7 - vVar.f166b));
        return new ca.p(jArrCopyOf, jArrCopyOf2);
    }

    public static int u(int i10, byte[] bArr) {
        int i11;
        synchronized (f23267v) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f23268w;
                    if (iArr.length <= i13) {
                        f23268w = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f23268w[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f23268w[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
