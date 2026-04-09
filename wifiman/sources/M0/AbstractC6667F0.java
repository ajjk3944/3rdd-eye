package m0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: m0.F0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6667F0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public static final a f52794a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final short f52795b = b(5120);

    /* renamed from: c, reason: collision with root package name */
    private static final short f52796c = b(-1025);

    /* renamed from: d, reason: collision with root package name */
    private static final short f52797d = b(31743);

    /* renamed from: e, reason: collision with root package name */
    private static final short f52798e = b(1024);

    /* renamed from: f, reason: collision with root package name */
    private static final short f52799f = b(1);

    /* renamed from: g, reason: collision with root package name */
    private static final short f52800g = b(32256);

    /* renamed from: h, reason: collision with root package name */
    private static final short f52801h = b(-1024);

    /* renamed from: i, reason: collision with root package name */
    private static final short f52802i = b(Short.MIN_VALUE);

    /* renamed from: j, reason: collision with root package name */
    private static final short f52803j = b(31744);

    /* renamed from: k, reason: collision with root package name */
    private static final short f52804k = b(0);

    /* renamed from: m0.F0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static short a(float f10) {
        int i10;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        int i11 = iFloatToRawIntBits >>> 31;
        int i12 = (iFloatToRawIntBits >>> 23) & 255;
        int i13 = 8388607 & iFloatToRawIntBits;
        int i14 = 31;
        int i15 = 0;
        if (i12 != 255) {
            int i16 = i12 - 112;
            if (i16 >= 31) {
                i14 = 49;
            } else if (i16 > 0) {
                i15 = i13 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i10 = (((i16 << 10) | i15) + 1) | (i11 << 15);
                    return b((short) i10);
                }
                i14 = i16;
            } else if (i16 >= -10) {
                int i17 = (8388608 | i13) >> (1 - i16);
                if ((i17 & 4096) != 0) {
                    i17 += 8192;
                }
                i14 = 0;
                i15 = i17 >> 13;
            } else {
                i14 = 0;
            }
        } else if (i13 != 0) {
            i15 = 512;
        }
        i10 = (i11 << 15) | (i14 << 10) | i15;
        return b((short) i10);
    }

    public static short b(short s10) {
        return s10;
    }
}
