package la;

import ca.h;
import ca.k;
import ca.l;
import ca.m;
import ca.n;
import ca.o;
import ca.x;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.y0;
import fb.f;
import java.io.IOException;
import qb.b;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Format f15066a;

    /* renamed from: c, reason: collision with root package name */
    public x f15068c;

    /* renamed from: e, reason: collision with root package name */
    public int f15070e;

    /* renamed from: f, reason: collision with root package name */
    public long f15071f;

    /* renamed from: g, reason: collision with root package name */
    public int f15072g;

    /* renamed from: h, reason: collision with root package name */
    public int f15073h;

    /* renamed from: b, reason: collision with root package name */
    public final f f15067b = new f(9);

    /* renamed from: d, reason: collision with root package name */
    public int f15069d = 0;

    public a(Format format) {
        this.f15066a = format;
    }

    @Override // ca.k
    public final void c(long j, long j7) {
        this.f15069d = 0;
    }

    @Override // ca.k
    public final int f(l lVar, n nVar) throws IOException {
        b.k(this.f15068c);
        while (true) {
            int i10 = this.f15069d;
            f fVar = this.f15067b;
            if (i10 == 0) {
                fVar.v(8);
                if (!((h) lVar).b(fVar.f8800a, 0, 8, true)) {
                    return -1;
                }
                if (fVar.d() != 1380139777) {
                    throw new IOException("Input not RawCC");
                }
                this.f15070e = fVar.o();
                this.f15069d = 1;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    while (this.f15072g > 0) {
                        fVar.v(3);
                        ((h) lVar).b(fVar.f8800a, 0, 3, false);
                        this.f15068c.a(3, fVar);
                        this.f15073h += 3;
                        this.f15072g--;
                    }
                    int i11 = this.f15073h;
                    if (i11 > 0) {
                        this.f15068c.d(this.f15071f, 1, i11, 0, null);
                    }
                    this.f15069d = 1;
                    return 0;
                }
                int i12 = this.f15070e;
                if (i12 == 0) {
                    fVar.v(5);
                    if (!((h) lVar).b(fVar.f8800a, 0, 5, true)) {
                        break;
                    }
                    this.f15071f = (fVar.p() * 1000) / 45;
                    this.f15072g = fVar.o();
                    this.f15073h = 0;
                    this.f15069d = 2;
                } else {
                    if (i12 != 1) {
                        StringBuilder sb2 = new StringBuilder(39);
                        sb2.append("Unsupported version number: ");
                        sb2.append(i12);
                        throw y0.a(null, sb2.toString());
                    }
                    fVar.v(9);
                    if (!((h) lVar).b(fVar.f8800a, 0, 9, true)) {
                        break;
                    }
                    this.f15071f = fVar.j();
                    this.f15072g = fVar.o();
                    this.f15073h = 0;
                    this.f15069d = 2;
                }
            }
        }
        this.f15069d = 0;
        return -1;
    }

    @Override // ca.k
    public final boolean g(l lVar) {
        f fVar = this.f15067b;
        fVar.v(8);
        lVar.p(fVar.f8800a, 0, 8);
        return fVar.d() == 1380139777;
    }

    @Override // ca.k
    public final void h(m mVar) {
        mVar.r(new o(-9223372036854775807L));
        x xVarN = mVar.n(0, 3);
        this.f15068c = xVarN;
        xVarN.e(this.f15066a);
        mVar.j();
    }

    @Override // ca.k
    public final void release() {
    }
}
