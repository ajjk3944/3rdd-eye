package g8;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l implements x7.d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f24575a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f24576b = "MPF".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f24577c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int g(k kVar, a8.g gVar) {
        try {
            int iD = kVar.d();
            if ((iD & 65496) == 65496 || iD == 19789 || iD == 18761) {
                int iK = k(kVar, 225);
                if (iK != -1) {
                    byte[] bArr = (byte[]) gVar.e(iK, byte[].class);
                    try {
                        return l(kVar, bArr, iK);
                    } finally {
                        gVar.i(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iD);
                return -1;
            }
        } catch (j unused) {
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType h(k kVar) {
        try {
            int iD = kVar.d();
            if (iD == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iE = (iD << 8) | kVar.e();
            if (iE == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iE2 = (iE << 8) | kVar.e();
            if (iE2 == -1991225785) {
                kVar.skip(21L);
                try {
                    return kVar.e() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (j unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iE2 == 1380533830) {
                kVar.skip(4L);
                if (((kVar.d() << 16) | kVar.d()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iD2 = (kVar.d() << 16) | kVar.d();
                if ((iD2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i4 = iD2 & 255;
                if (i4 == 88) {
                    kVar.skip(4L);
                    short sE = kVar.e();
                    return (sE & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sE & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i4 != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                kVar.skip(4L);
                return (kVar.e() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((kVar.d() << 16) | kVar.d()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iD3 = (kVar.d() << 16) | kVar.d();
            if (iD3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i10 = 0;
            boolean z3 = iD3 == 1635150182;
            kVar.skip(4L);
            int i11 = iE2 - 16;
            if (i11 % 4 == 0) {
                while (i10 < 5 && i11 > 0) {
                    int iD4 = (kVar.d() << 16) | kVar.d();
                    if (iD4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iD4 == 1635150182) {
                        z3 = true;
                    }
                    i10++;
                    i11 -= 4;
                }
            }
            return z3 ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (j unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static boolean i(k kVar, a8.g gVar) {
        boolean zJ;
        if (h(kVar) == ImageHeaderParser$ImageType.JPEG) {
            int iK = k(kVar, 226);
            while (iK > 0) {
                byte[] bArr = (byte[]) gVar.e(iK, byte[].class);
                try {
                    int iF = kVar.f(iK, bArr);
                    if (iF != iK) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + iK + ", actually read: " + iF);
                        }
                        zJ = false;
                    } else {
                        zJ = j(bArr, iK, f24576b);
                    }
                    if (zJ) {
                        gVar.i(bArr);
                        return true;
                    }
                    gVar.i(bArr);
                    iK = k(kVar, 226);
                } catch (Throwable th2) {
                    gVar.i(bArr);
                    throw th2;
                }
            }
            if (Log.isLoggable("DfltImageHeaderParser", 2)) {
                Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
            }
        }
        return false;
    }

    public static boolean j(byte[] bArr, int i4, byte[] bArr2) {
        boolean z3 = (bArr == null || bArr2 == null || i4 <= bArr2.length) ? false : true;
        if (z3) {
            for (int i10 = 0; i10 < bArr2.length; i10++) {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
            }
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int k(g8.k r9, int r10) {
        /*
        L0:
            short r0 = r9.e()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = -1
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r0 == r1) goto L24
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L79
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
            goto L79
        L2d:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L4e
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L79
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
            int r1 = r9.d()
            int r1 = r1 + (-2)
            if (r0 == r10) goto L7a
            long r5 = (long) r1
            long r7 = r9.skip(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L0
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L79
            java.lang.String r9 = ", wanted to skip: "
            java.lang.String r10 = ", but actually skipped: "
            java.lang.String r2 = "Unable to skip enough data, type: "
            java.lang.StringBuilder r9 = r5.c.n(r0, r2, r9, r1, r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L79:
            return r3
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.l.k(g8.k, int):int");
    }

    public static int l(k kVar, byte[] bArr, int i4) {
        ByteOrder byteOrder;
        int iF = kVar.f(i4, bArr);
        if (iF != i4) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i4 + ", actually read: " + iF);
                return -1;
            }
        } else if (j(bArr, i4, f24575a)) {
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i4);
            short s10 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s10 != 18761) {
                if (s10 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s10));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i10 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i11 = i10 + 6;
            short s11 = byteBuffer.remaining() - i11 >= 2 ? byteBuffer.getShort(i11) : (short) -1;
            for (int i12 = 0; i12 < s11; i12++) {
                int i13 = (i12 * 12) + i10 + 8;
                short s12 = byteBuffer.remaining() - i13 >= 2 ? byteBuffer.getShort(i13) : (short) -1;
                if (s12 == 274) {
                    int i14 = i13 + 2;
                    short s13 = byteBuffer.remaining() - i14 >= 2 ? byteBuffer.getShort(i14) : (short) -1;
                    if (s13 >= 1 && s13 <= 12) {
                        int i15 = i13 + 4;
                        int i16 = byteBuffer.remaining() - i15 >= 4 ? byteBuffer.getInt(i15) : -1;
                        if (i16 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder sbN = r5.c.n(i12, "Got tagIndex=", " tagType=", s12, " formatCode=");
                                sbN.append((int) s13);
                                sbN.append(" componentCount=");
                                sbN.append(i16);
                                Log.d("DfltImageHeaderParser", sbN.toString());
                            }
                            int i17 = i16 + f24577c[s13];
                            if (i17 <= 4) {
                                int i18 = i13 + 8;
                                if (i18 >= 0 && i18 <= byteBuffer.remaining()) {
                                    if (i17 >= 0 && i17 + i18 <= byteBuffer.remaining()) {
                                        if (byteBuffer.remaining() - i18 >= 2) {
                                            return byteBuffer.getShort(i18);
                                        }
                                        return -1;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s12));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i18 + " tagType=" + ((int) s12));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s13));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s13));
                    }
                }
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // x7.d
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        t8.f.c(byteBuffer, "Argument must not be null");
        return h(new i(byteBuffer, 0));
    }

    @Override // x7.d
    public final boolean b(ByteBuffer byteBuffer, a8.g gVar) {
        i iVar = new i(byteBuffer, 0);
        t8.f.c(gVar, "Argument must not be null");
        return i(iVar, gVar);
    }

    @Override // x7.d
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return h(new jf.c(18, inputStream));
    }

    @Override // x7.d
    public final int d(InputStream inputStream, a8.g gVar) {
        jf.c cVar = new jf.c(18, inputStream);
        t8.f.c(gVar, "Argument must not be null");
        return g(cVar, gVar);
    }

    @Override // x7.d
    public final boolean e(InputStream inputStream, a8.g gVar) {
        t8.f.c(inputStream, "Argument must not be null");
        jf.c cVar = new jf.c(18, inputStream);
        t8.f.c(gVar, "Argument must not be null");
        return i(cVar, gVar);
    }

    @Override // x7.d
    public final int f(ByteBuffer byteBuffer, a8.g gVar) {
        i iVar = new i(byteBuffer, 0);
        t8.f.c(gVar, "Argument must not be null");
        return g(iVar, gVar);
    }
}
