package u1;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C0752Tp;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import l1.InterfaceC2638d;

/* loaded from: classes.dex */
public final class m implements InterfaceC2638d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f23742a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f23743b = "MPF".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f23744c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int g(l lVar, C0752Tp c0752Tp) {
        try {
            int iA = lVar.a();
            if ((iA & 65496) == 65496 || iA == 19789 || iA == 18761) {
                int iK = k(lVar, 225);
                if (iK != -1) {
                    byte[] bArr = (byte[]) c0752Tp.e(iK, byte[].class);
                    try {
                        return l(lVar, bArr, iK);
                    } finally {
                        c0752Tp.i(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iA);
                return -1;
            }
        } catch (k unused) {
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType h(l lVar) {
        try {
            int iA = lVar.a();
            if (iA == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iE = (iA << 8) | lVar.e();
            if (iE == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iE2 = (iE << 8) | lVar.e();
            if (iE2 == -1991225785) {
                lVar.skip(21L);
                try {
                    return lVar.e() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (k unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iE2 == 1380533830) {
                lVar.skip(4L);
                if (((lVar.a() << 16) | lVar.a()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iA2 = (lVar.a() << 16) | lVar.a();
                if ((iA2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iA2 & 255;
                if (i == 88) {
                    lVar.skip(4L);
                    short sE = lVar.e();
                    return (sE & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sE & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                lVar.skip(4L);
                return (lVar.e() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((lVar.a() << 16) | lVar.a()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iA3 = (lVar.a() << 16) | lVar.a();
            if (iA3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i3 = 0;
            boolean z6 = iA3 == 1635150182;
            lVar.skip(4L);
            int i6 = iE2 - 16;
            if (i6 % 4 == 0) {
                while (i3 < 5 && i6 > 0) {
                    int iA4 = (lVar.a() << 16) | lVar.a();
                    if (iA4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iA4 == 1635150182) {
                        z6 = true;
                    }
                    i3++;
                    i6 -= 4;
                }
            }
            return z6 ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (k unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static boolean i(l lVar, C0752Tp c0752Tp) {
        boolean zJ;
        if (h(lVar) == ImageHeaderParser$ImageType.JPEG) {
            int iK = k(lVar, 226);
            while (iK > 0) {
                byte[] bArr = (byte[]) c0752Tp.e(iK, byte[].class);
                try {
                    int iF = lVar.f(iK, bArr);
                    if (iF != iK) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + iK + ", actually read: " + iF);
                        }
                        zJ = false;
                    } else {
                        zJ = j(bArr, iK, f23743b);
                    }
                    if (zJ) {
                        c0752Tp.i(bArr);
                        return true;
                    }
                    c0752Tp.i(bArr);
                    iK = k(lVar, 226);
                } catch (Throwable th) {
                    c0752Tp.i(bArr);
                    throw th;
                }
            }
            if (Log.isLoggable("DfltImageHeaderParser", 2)) {
                Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
            }
        }
        return false;
    }

    public static boolean j(byte[] bArr, int i, byte[] bArr2) {
        boolean z6 = (bArr == null || bArr2 == null || i <= bArr2.length) ? false : true;
        if (z6) {
            for (int i3 = 0; i3 < bArr2.length; i3++) {
                if (bArr[i3] != bArr2[i3]) {
                    return false;
                }
            }
        }
        return z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int k(u1.l r9, int r10) {
        /*
        L0:
            short r0 = r9.e()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = -1
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r0 == r1) goto L24
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L86
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unknown segmentId="
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
            return r3
        L24:
            short r0 = r9.e()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L2d
            goto L86
        L2d:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L4e
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L86
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Found MARKER_EOI in "
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r10 = " segment"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
            return r3
        L4e:
            int r1 = r9.a()
            int r1 = r1 + (-2)
            if (r0 == r10) goto L87
            long r5 = (long) r1
            long r7 = r9.skip(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L0
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L86
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unable to skip enough data, type: "
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r10 = ", wanted to skip: "
            r9.append(r10)
            r9.append(r1)
            java.lang.String r10 = ", but actually skipped: "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L86:
            return r3
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.m.k(u1.l, int):int");
    }

    public static int l(l lVar, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iF = lVar.f(i, bArr);
        if (iF != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iF);
                return -1;
            }
        } else if (j(bArr, i, f23742a)) {
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s5 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s5 != 18761) {
                if (s5 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s5));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i3 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i6 = i3 + 6;
            short s6 = byteBuffer.remaining() - i6 >= 2 ? byteBuffer.getShort(i6) : (short) -1;
            for (int i7 = 0; i7 < s6; i7++) {
                int i8 = (i7 * 12) + i3 + 8;
                short s7 = byteBuffer.remaining() - i8 >= 2 ? byteBuffer.getShort(i8) : (short) -1;
                if (s7 == 274) {
                    int i9 = i8 + 2;
                    short s8 = byteBuffer.remaining() - i9 >= 2 ? byteBuffer.getShort(i9) : (short) -1;
                    if (s8 >= 1 && s8 <= 12) {
                        int i10 = i8 + 4;
                        int i11 = byteBuffer.remaining() - i10 >= 4 ? byteBuffer.getInt(i10) : -1;
                        if (i11 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got tagIndex=" + i7 + " tagType=" + ((int) s7) + " formatCode=" + ((int) s8) + " componentCount=" + i11);
                            }
                            int i12 = i11 + f23744c[s8];
                            if (i12 <= 4) {
                                int i13 = i8 + 8;
                                if (i13 >= 0 && i13 <= byteBuffer.remaining()) {
                                    if (i12 >= 0 && i12 + i13 <= byteBuffer.remaining()) {
                                        if (byteBuffer.remaining() - i13 >= 2) {
                                            return byteBuffer.getShort(i13);
                                        }
                                        return -1;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s7));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i13 + " tagType=" + ((int) s7));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s8));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s8));
                    }
                }
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // l1.InterfaceC2638d
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        H1.g.c(byteBuffer, "Argument must not be null");
        return h(new j(byteBuffer));
    }

    @Override // l1.InterfaceC2638d
    public final boolean b(ByteBuffer byteBuffer, C0752Tp c0752Tp) {
        j jVar = new j(byteBuffer);
        H1.g.c(c0752Tp, "Argument must not be null");
        return i(jVar, c0752Tp);
    }

    @Override // l1.InterfaceC2638d
    public final int c(ByteBuffer byteBuffer, C0752Tp c0752Tp) {
        j jVar = new j(byteBuffer);
        H1.g.c(c0752Tp, "Argument must not be null");
        return g(jVar, c0752Tp);
    }

    @Override // l1.InterfaceC2638d
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return h(new h2.d(inputStream));
    }

    @Override // l1.InterfaceC2638d
    public final boolean e(InputStream inputStream, C0752Tp c0752Tp) {
        H1.g.c(inputStream, "Argument must not be null");
        h2.d dVar = new h2.d(inputStream);
        H1.g.c(c0752Tp, "Argument must not be null");
        return i(dVar, c0752Tp);
    }

    @Override // l1.InterfaceC2638d
    public final int f(InputStream inputStream, C0752Tp c0752Tp) {
        h2.d dVar = new h2.d(inputStream);
        H1.g.c(c0752Tp, "Argument must not be null");
        return g(dVar, c0752Tp);
    }
}
