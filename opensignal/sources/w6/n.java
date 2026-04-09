package w6;

import a5.b0;
import a5.d0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24326a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f24327b;

    /* renamed from: c, reason: collision with root package name */
    public final a5.v f24328c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24329d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24330e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24331f;

    /* renamed from: g, reason: collision with root package name */
    public long f24332g;

    /* renamed from: h, reason: collision with root package name */
    public long f24333h;

    /* renamed from: i, reason: collision with root package name */
    public long f24334i;

    public n(int i10) {
        this.f24326a = i10;
        switch (i10) {
            case 1:
                this.f24327b = new b0(0L);
                this.f24332g = -9223372036854775807L;
                this.f24333h = -9223372036854775807L;
                this.f24334i = -9223372036854775807L;
                this.f24328c = new a5.v();
                break;
            default:
                this.f24327b = new b0(0L);
                this.f24332g = -9223372036854775807L;
                this.f24333h = -9223372036854775807L;
                this.f24334i = -9223372036854775807L;
                this.f24328c = new a5.v();
                break;
        }
    }

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long c(a5.v vVar) {
        int i10 = vVar.f166b;
        if (vVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        vVar.e(bArr, 0, 9);
        vVar.E(i10);
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

    public final void a(u5.l lVar) {
        switch (this.f24326a) {
            case 0:
                byte[] bArr = d0.f109e;
                a5.v vVar = this.f24328c;
                vVar.getClass();
                vVar.C(bArr.length, bArr);
                this.f24329d = true;
                lVar.l();
                break;
            default:
                byte[] bArr2 = d0.f109e;
                a5.v vVar2 = this.f24328c;
                vVar2.getClass();
                vVar2.C(bArr2.length, bArr2);
                this.f24329d = true;
                lVar.l();
                break;
        }
    }
}
