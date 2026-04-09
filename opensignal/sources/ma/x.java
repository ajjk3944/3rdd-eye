package ma;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16637a;

    /* renamed from: b, reason: collision with root package name */
    public final qb.u f16638b;

    /* renamed from: c, reason: collision with root package name */
    public final fb.f f16639c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16640d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16641e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16642f;

    /* renamed from: g, reason: collision with root package name */
    public long f16643g;

    /* renamed from: h, reason: collision with root package name */
    public long f16644h;

    /* renamed from: i, reason: collision with root package name */
    public long f16645i;

    public x(int i10) {
        this.f16637a = i10;
        switch (i10) {
            case 1:
                this.f16638b = new qb.u(0L);
                this.f16643g = -9223372036854775807L;
                this.f16644h = -9223372036854775807L;
                this.f16645i = -9223372036854775807L;
                this.f16639c = new fb.f();
                break;
            default:
                this.f16638b = new qb.u(0L);
                this.f16643g = -9223372036854775807L;
                this.f16644h = -9223372036854775807L;
                this.f16645i = -9223372036854775807L;
                this.f16639c = new fb.f();
                break;
        }
    }

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long c(fb.f fVar) {
        int i10 = fVar.f8801b;
        if (fVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        fVar.c(bArr, 0, 9);
        fVar.y(i10);
        byte b2 = bArr[0];
        if ((b2 & 196) == 68) {
            byte b10 = bArr[2];
            if ((b10 & 4) == 4) {
                byte b11 = bArr[4];
                if ((b11 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b2;
                    long j7 = b10;
                    return ((j7 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j7 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b11 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(ca.l lVar) {
        switch (this.f16637a) {
            case 0:
                byte[] bArr = qb.v.f20833f;
                fb.f fVar = this.f16639c;
                fVar.getClass();
                fVar.w(bArr.length, bArr);
                this.f16640d = true;
                lVar.l();
                break;
            default:
                byte[] bArr2 = qb.v.f20833f;
                fb.f fVar2 = this.f16639c;
                fVar2.getClass();
                fVar2.w(bArr2.length, bArr2);
                this.f16640d = true;
                lVar.l();
                break;
        }
    }
}
