package Zi;

import Zg.AbstractC3682n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public final class E {

    /* renamed from: e, reason: collision with root package name */
    private static final a f25538e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final long[] f25539f = new long[0];

    /* renamed from: a, reason: collision with root package name */
    private final Xi.f f25540a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6839p f25541b;

    /* renamed from: c, reason: collision with root package name */
    private long f25542c;

    /* renamed from: d, reason: collision with root package name */
    private final long[] f25543d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public E(Xi.f descriptor, InterfaceC6839p readIfAbsent) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(readIfAbsent, "readIfAbsent");
        this.f25540a = descriptor;
        this.f25541b = readIfAbsent;
        int iE = descriptor.e();
        if (iE <= 64) {
            this.f25542c = iE != 64 ? (-1) << iE : 0L;
            this.f25543d = f25539f;
        } else {
            this.f25542c = 0L;
            this.f25543d = e(iE);
        }
    }

    private final void b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.f25543d;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    private final int c() {
        int length = this.f25543d.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.f25543d[i10];
            while (j10 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << iNumberOfTrailingZeros;
                int i13 = iNumberOfTrailingZeros + i12;
                if (((Boolean) this.f25541b.invoke(this.f25540a, Integer.valueOf(i13))).booleanValue()) {
                    this.f25543d[i10] = j10;
                    return i13;
                }
            }
            this.f25543d[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    private final long[] e(int i10) {
        long[] jArr = new long[(i10 - 1) >>> 6];
        if ((i10 & 63) != 0) {
            jArr[AbstractC3682n.f0(jArr)] = (-1) << i10;
        }
        return jArr;
    }

    public final void a(int i10) {
        if (i10 < 64) {
            this.f25542c |= 1 << i10;
        } else {
            b(i10);
        }
    }

    public final int d() {
        int iNumberOfTrailingZeros;
        int iE = this.f25540a.e();
        do {
            long j10 = this.f25542c;
            if (j10 == -1) {
                if (iE > 64) {
                    return c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
            this.f25542c |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) this.f25541b.invoke(this.f25540a, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
