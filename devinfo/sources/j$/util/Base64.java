package j$.util;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class Base64 {
    public static Decoder getDecoder() {
        return Decoder.f26275c;
    }

    public static class Decoder {

        /* renamed from: a, reason: collision with root package name */
        public static final int[] f26273a;

        /* renamed from: b, reason: collision with root package name */
        public static final int[] f26274b;

        /* renamed from: c, reason: collision with root package name */
        public static final Decoder f26275c;

        static {
            int[] iArr = new int[256];
            f26273a = iArr;
            Arrays.fill(iArr, -1);
            for (int i4 = 0; i4 < 64; i4++) {
                f26273a[c.f26291a[i4]] = i4;
            }
            f26273a[61] = -2;
            int[] iArr2 = new int[256];
            f26274b = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i10 = 0; i10 < 64; i10++) {
                f26274b[c.f26292b[i10]] = i10;
            }
            f26274b[61] = -2;
            f26275c = new Decoder();
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
        
            if (r9 != 18) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x010a, code lost:
        
            if (r9 != 6) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x010c, code lost:
        
            r5[r10] = (byte) (r11 >> 16);
            r10 = r10 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0117, code lost:
        
            if (r9 != 0) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
        
            r0 = r10 + 1;
            r5[r10] = (byte) (r11 >> 16);
            r10 = r10 + 2;
            r5[r0] = (byte) (r11 >> 8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x012a, code lost:
        
            if (r9 == 12) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x012c, code lost:
        
            if (r8 < r6) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x012e, code lost:
        
            if (r10 == r1) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0134, code lost:
        
            return java.util.Arrays.copyOf(r5, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0135, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0149, code lost:
        
            throw new java.lang.IllegalArgumentException("Input byte array has incorrect ending byte at " + r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0151, code lost:
        
            throw new java.lang.IllegalArgumentException("Last unit does not have enough valid bits");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public byte[] decode(java.lang.String r21) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.Base64.Decoder.decode(java.lang.String):byte[]");
        }
    }
}
