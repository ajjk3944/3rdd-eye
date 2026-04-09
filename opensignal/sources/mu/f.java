package mu;

/* loaded from: classes.dex */
public final class f extends ab.g {

    /* renamed from: r, reason: collision with root package name */
    public final boolean f17013r;

    public f(ag.b bVar, boolean z10) {
        super((Object) bVar, 10, false);
        this.f17013r = z10;
    }

    @Override // ab.g
    public final void p(byte b2) {
        if (this.f17013r) {
            v(String.valueOf(b2 & 255));
        } else {
            t(String.valueOf(b2 & 255));
        }
    }

    @Override // ab.g
    public final void r(int i10) {
        if (this.f17013r) {
            v(Long.toString(i10 & 4294967295L, 10));
        } else {
            t(Long.toString(i10 & 4294967295L, 10));
        }
    }

    @Override // ab.g
    public final void s(long j) {
        int i10 = 63;
        String str = "0";
        if (this.f17013r) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j7 = (j >>> 1) / 5;
                    long j10 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j7 * j10)), 10);
                    while (j7 > 0) {
                        i10--;
                        cArr[i10] = Character.forDigit((int) (j7 % j10), 10);
                        j7 /= j10;
                    }
                    str = new String(cArr, i10, 64 - i10);
                }
            }
            v(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j11 = (j >>> 1) / 5;
                long j12 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j11 * j12)), 10);
                while (j11 > 0) {
                    i10--;
                    cArr2[i10] = Character.forDigit((int) (j11 % j12), 10);
                    j11 /= j12;
                }
                str = new String(cArr2, i10, 64 - i10);
            }
        }
        t(str);
    }

    @Override // ab.g
    public final void u(short s8) {
        if (this.f17013r) {
            v(String.valueOf(s8 & 65535));
        } else {
            t(String.valueOf(s8 & 65535));
        }
    }
}
