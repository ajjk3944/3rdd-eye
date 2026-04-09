package o;

import Zg.AbstractC3682n;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f54926a = {-9187201950435737345L, -1};

    /* renamed from: b, reason: collision with root package name */
    private static final C7009H f54927b = new C7009H(0);

    public static final void a(long[] metadata, int i10) {
        AbstractC6492s.i(metadata, "metadata");
        int i11 = (i10 + 7) >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = metadata[i12] & (-9187201950435737472L);
            metadata[i12] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int iF0 = AbstractC3682n.f0(metadata);
        int i13 = iF0 - 1;
        metadata[i13] = (metadata[i13] & 72057594037927935L) | (-72057594037927936L);
        metadata[iF0] = metadata[0];
    }

    public static final int b(long[] metadata, int i10, int i11) {
        AbstractC6492s.i(metadata, "metadata");
        while (i10 < i11) {
            if (((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) == 128) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final int c(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return i10 - (i10 / 8);
    }

    public static final C7009H d() {
        return new C7009H(0, 1, null);
    }

    public static final int e(int i10) {
        if (i10 == 0) {
            return 6;
        }
        return (i10 * 2) + 1;
    }

    public static final int f(int i10) {
        if (i10 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i10);
        }
        return 0;
    }

    public static final int g(int i10) {
        if (i10 == 7) {
            return 8;
        }
        return i10 + ((i10 - 1) / 7);
    }
}
