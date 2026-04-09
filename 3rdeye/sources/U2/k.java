package U2;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;
import t4.C5606d;

/* compiled from: DefaultImageHeaderParser.java */
/* loaded from: classes.dex */
public final class k implements ImageHeaderParser {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f12403a = "Exif\u0000\u0000".getBytes(Charset.forName(Constants.ENCODING));

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f12404b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* compiled from: DefaultImageHeaderParser.java */
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f12405a;

        public a(ByteBuffer byteBuffer) {
            this.f12405a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // U2.k.b
        public final int a() throws b.a {
            return (b() << 8) | b();
        }

        @Override // U2.k.b
        public final short b() throws b.a {
            ByteBuffer byteBuffer = this.f12405a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new b.a();
        }

        @Override // U2.k.b
        public final int c(int i, byte[] bArr) {
            ByteBuffer byteBuffer = this.f12405a;
            int iMin = Math.min(i, byteBuffer.remaining());
            if (iMin == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // U2.k.b
        public final long skip(long j4) {
            ByteBuffer byteBuffer = this.f12405a;
            int iMin = (int) Math.min(byteBuffer.remaining(), j4);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* compiled from: DefaultImageHeaderParser.java */
    public interface b {

        /* compiled from: DefaultImageHeaderParser.java */
        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a() throws IOException;

        short b() throws IOException;

        int c(int i, byte[] bArr) throws IOException;

        long skip(long j4) throws IOException;
    }

    /* compiled from: DefaultImageHeaderParser.java */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final InputStream f12406a;

        public c(InputStream inputStream) {
            this.f12406a = inputStream;
        }

        @Override // U2.k.b
        public final int a() throws IOException {
            return (b() << 8) | b();
        }

        @Override // U2.k.b
        public final short b() throws IOException {
            int i = this.f12406a.read();
            if (i != -1) {
                return (short) i;
            }
            throw new b.a();
        }

        @Override // U2.k.b
        public final int c(int i, byte[] bArr) throws IOException {
            int i10 = 0;
            int i11 = 0;
            while (i10 < i && (i11 = this.f12406a.read(bArr, i10, i - i10)) != -1) {
                i10 += i11;
            }
            if (i10 == 0 && i11 == -1) {
                throw new b.a();
            }
            return i10;
        }

        @Override // U2.k.b
        public final long skip(long j4) throws IOException {
            if (j4 < 0) {
                return 0L;
            }
            long j10 = j4;
            while (j10 > 0) {
                InputStream inputStream = this.f12406a;
                long jSkip = inputStream.skip(j10);
                if (jSkip > 0) {
                    j10 -= jSkip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j10--;
                }
            }
            return j4 - j10;
        }
    }

    public static int e(b bVar, O2.g gVar) throws IOException {
        try {
            int iA = bVar.a();
            if ((iA & 65496) == 65496 || iA == 19789 || iA == 18761) {
                int iG = g(bVar);
                if (iG != -1) {
                    byte[] bArr = (byte[]) gVar.d(iG, byte[].class);
                    try {
                        return h(bVar, bArr, iG);
                    } finally {
                        gVar.h(bArr);
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
        } catch (b.a unused) {
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType f(b bVar) throws IOException {
        try {
            int iA = bVar.a();
            if (iA == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iB = (iA << 8) | bVar.b();
            if (iB == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iB2 = (iB << 8) | bVar.b();
            if (iB2 == -1991225785) {
                bVar.skip(21L);
                try {
                    return bVar.b() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (b.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iB2 == 1380533830) {
                bVar.skip(4L);
                if (((bVar.a() << 16) | bVar.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int iA2 = (bVar.a() << 16) | bVar.a();
                if ((iA2 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = iA2 & KotlinVersion.MAX_COMPONENT_VALUE;
                if (i == 88) {
                    bVar.skip(4L);
                    short sB = bVar.b();
                    return (sB & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (sB & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                bVar.skip(4L);
                return (bVar.b() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((bVar.a() << 16) | bVar.a()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iA3 = (bVar.a() << 16) | bVar.a();
            if (iA3 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            int i10 = 0;
            boolean z10 = iA3 == 1635150182;
            bVar.skip(4L);
            int i11 = iB2 - 16;
            if (i11 % 4 == 0) {
                while (i10 < 5 && i11 > 0) {
                    int iA4 = (bVar.a() << 16) | bVar.a();
                    if (iA4 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (iA4 == 1635150182) {
                        z10 = true;
                    }
                    i10++;
                    i11 -= 4;
                }
            }
            return z10 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (b.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(U2.k.b r9) throws java.io.IOException {
        /*
        L0:
            short r0 = r9.b()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = -1
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r0 == r1) goto L18
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L5e
            java.lang.String r9 = "Unknown segmentId="
            com.google.android.gms.measurement.internal.a.i(r0, r9, r4)
            return r3
        L18:
            short r0 = r9.b()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L21
            goto L5e
        L21:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L31
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L5e
            java.lang.String r9 = "Found MARKER_EOI in exif segment"
            android.util.Log.d(r4, r9)
            return r3
        L31:
            int r1 = r9.a()
            int r1 = r1 + (-2)
            r5 = 225(0xe1, float:3.15E-43)
            if (r0 == r5) goto L5f
            long r5 = (long) r1
            long r7 = r9.skip(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L0
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L5e
            java.lang.String r9 = "Unable to skip enough data, type: "
            java.lang.String r2 = ", wanted to skip: "
            java.lang.String r5 = ", but actually skipped: "
            java.lang.StringBuilder r9 = androidx.work.s.i(r9, r0, r2, r1, r5)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L5e:
            return r3
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.k.g(U2.k$b):int");
    }

    public static int h(b bVar, byte[] bArr, int i) throws IOException {
        ByteOrder byteOrder;
        String str;
        int iC = bVar.c(i, bArr);
        if (iC == i) {
            short s10 = 1;
            int i10 = 0;
            byte[] bArr2 = f12403a;
            boolean z10 = bArr != null && i > bArr2.length;
            if (z10) {
                int i11 = 0;
                while (true) {
                    if (i11 >= bArr2.length) {
                        break;
                    }
                    if (bArr[i11] != bArr2[i11]) {
                        z10 = false;
                        break;
                    }
                    i11++;
                }
            }
            if (z10) {
                ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
                short s11 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
                if (s11 != 18761) {
                    if (s11 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                        com.google.android.gms.measurement.internal.a.i(s11, "Unknown endianness = ", "DfltImageHeaderParser");
                    }
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                }
                byteBuffer.order(byteOrder);
                int i12 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
                int i13 = i12 + 6;
                short s12 = byteBuffer.remaining() - i13 >= 2 ? byteBuffer.getShort(i13) : (short) -1;
                while (i10 < s12) {
                    int i14 = (i10 * 12) + i12 + 8;
                    short s13 = byteBuffer.remaining() - i14 >= 2 ? byteBuffer.getShort(i14) : (short) -1;
                    if (s13 == 274) {
                        int i15 = i14 + 2;
                        short s14 = byteBuffer.remaining() - i15 >= 2 ? byteBuffer.getShort(i15) : (short) -1;
                        if (s14 >= s10 && s14 <= 12) {
                            int i16 = i14 + 4;
                            int i17 = byteBuffer.remaining() - i16 >= 4 ? byteBuffer.getInt(i16) : -1;
                            if (i17 >= 0) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sbI = androidx.work.s.i("Got tagIndex=", i10, " tagType=", s13, " formatCode=");
                                    sbI.append((int) s14);
                                    sbI.append(" componentCount=");
                                    sbI.append(i17);
                                    Log.d("DfltImageHeaderParser", sbI.toString());
                                }
                                int i18 = i17 + f12404b[s14];
                                if (i18 <= 4) {
                                    int i19 = i14 + 8;
                                    if (i19 < 0 || i19 > byteBuffer.remaining()) {
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i19 + " tagType=" + ((int) s13));
                                        }
                                    } else {
                                        if (i18 >= 0 && i18 + i19 <= byteBuffer.remaining()) {
                                            if (byteBuffer.remaining() - i19 >= 2) {
                                                return byteBuffer.getShort(i19);
                                            }
                                            return -1;
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            com.google.android.gms.measurement.internal.a.i(s13, "Illegal number of bytes for TI tag data tagType=", "DfltImageHeaderParser");
                                        }
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    str = "Got byte count > 4, not orientation, continuing, formatCode=";
                                    com.google.android.gms.measurement.internal.a.i(s14, str, "DfltImageHeaderParser");
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            str = "Got invalid format code = ";
                            com.google.android.gms.measurement.internal.a.i(s14, str, "DfltImageHeaderParser");
                        }
                    }
                    i10++;
                    s10 = 1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iC);
            return -1;
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) throws IOException {
        C5606d.l(byteBuffer, "Argument must not be null");
        return f(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType b(InputStream inputStream) throws IOException {
        C5606d.l(inputStream, "Argument must not be null");
        return f(new c(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int c(InputStream inputStream, O2.g gVar) throws IOException {
        C5606d.l(inputStream, "Argument must not be null");
        c cVar = new c(inputStream);
        C5606d.l(gVar, "Argument must not be null");
        return e(cVar, gVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int d(ByteBuffer byteBuffer, O2.g gVar) throws IOException {
        C5606d.l(byteBuffer, "Argument must not be null");
        a aVar = new a(byteBuffer);
        C5606d.l(gVar, "Argument must not be null");
        return e(aVar, gVar);
    }
}
