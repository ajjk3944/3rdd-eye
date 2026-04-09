package S9;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* compiled from: Composers.kt */
/* loaded from: classes3.dex */
public final class r extends C1584p {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12104c;

    public r(L l5, boolean z10) {
        super(l5);
        this.f12104c = z10;
    }

    @Override // S9.C1584p
    public final void b(byte b10) {
        if (this.f12104c) {
            h(String.valueOf(b10 & 255));
        } else {
            f(String.valueOf(b10 & 255));
        }
    }

    @Override // S9.C1584p
    public final void d(int i) {
        if (this.f12104c) {
            h(Long.toString(4294967295L & i, 10));
        } else {
            f(Long.toString(4294967295L & i, 10));
        }
    }

    @Override // S9.C1584p
    public final void e(long j4) {
        boolean z10 = this.f12104c;
        int i = 63;
        String str = CommonUrlParts.Values.FALSE_INTEGER;
        if (z10) {
            if (j4 != 0) {
                if (j4 > 0) {
                    str = Long.toString(j4, 10);
                } else {
                    char[] cArr = new char[64];
                    long j10 = (j4 >>> 1) / 5;
                    long j11 = 10;
                    cArr[63] = Character.forDigit((int) (j4 - (j10 * j11)), 10);
                    while (j10 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j10 % j11), 10);
                        j10 /= j11;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            h(str);
            return;
        }
        if (j4 != 0) {
            if (j4 > 0) {
                str = Long.toString(j4, 10);
            } else {
                char[] cArr2 = new char[64];
                long j12 = (j4 >>> 1) / 5;
                long j13 = 10;
                cArr2[63] = Character.forDigit((int) (j4 - (j12 * j13)), 10);
                while (j12 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j12 % j13), 10);
                    j12 /= j13;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        f(str);
    }

    @Override // S9.C1584p
    public final void g(short s10) {
        if (this.f12104c) {
            h(String.valueOf(s10 & 65535));
        } else {
            f(String.valueOf(s10 & 65535));
        }
    }
}
