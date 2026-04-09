package h9;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f10477a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10478b;

    public /* synthetic */ t(int i10, long j, byte b2) {
        this.f10477a = i10;
        this.f10478b = j;
    }

    public static t a(String str, int i10, int i11) {
        if (i10 >= i11) {
            return null;
        }
        long j = 0;
        int i12 = i10;
        while (i12 < i11) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + (cCharAt - '0');
            if (j > 2147483647L) {
                return null;
            }
            i12++;
        }
        if (i12 == i10) {
            return null;
        }
        return new t(i12, j);
    }

    public static t b(ca.l lVar, fb.f fVar) {
        lVar.p(fVar.f8800a, 0, 8);
        fVar.y(0);
        return new t(fVar.d(), fVar.g(), (byte) 0);
    }

    public static t c(u5.l lVar, a5.v vVar) {
        lVar.p(vVar.f165a, 0, 8);
        vVar.E(0);
        return new t(vVar.g(), vVar.k(), (byte) 0);
    }

    public t(int i10, long j) {
        this.f10478b = j;
        this.f10477a = i10;
    }

    public t(int i10, int i11, long j) {
        switch (i11) {
            case 3:
                a5.a.e(j >= 0);
                this.f10477a = i10;
                this.f10478b = j;
                break;
            default:
                qb.b.g(j >= 0);
                this.f10477a = i10;
                this.f10478b = j;
                break;
        }
    }
}
