package ya;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements pb.n {

    /* renamed from: a, reason: collision with root package name */
    public final pb.n f26087a;

    /* renamed from: d, reason: collision with root package name */
    public final int f26088d;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f26089g;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f26090r;

    /* renamed from: x, reason: collision with root package name */
    public int f26091x;

    public l(pb.n nVar, int i10, i0 i0Var) {
        qb.b.g(i10 > 0);
        this.f26087a = nVar;
        this.f26088d = i10;
        this.f26089g = i0Var;
        this.f26090r = new byte[1];
        this.f26091x = i10;
    }

    @Override // pb.n
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // pb.n
    public final Map k() {
        return this.f26087a.k();
    }

    @Override // pb.n
    public final Uri o() {
        return this.f26087a.o();
    }

    @Override // pb.n
    public final long q(na.c cVar) {
        throw new UnsupportedOperationException();
    }

    @Override // pb.k
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f26091x;
        pb.n nVar = this.f26087a;
        if (i12 == 0) {
            byte[] bArr2 = this.f26090r;
            int i13 = 0;
            if (nVar.read(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int i16 = nVar.read(bArr3, i13, i15);
                        if (i16 != -1) {
                            i13 += i16;
                            i15 -= i16;
                        }
                    }
                    while (i14 > 0 && bArr3[i14 - 1] == 0) {
                        i14--;
                    }
                    if (i14 > 0) {
                        fb.f fVar = new fb.f(i14, bArr3);
                        i0 i0Var = this.f26089g;
                        long jMax = !i0Var.I ? i0Var.E : Math.max(i0Var.J.t(), i0Var.E);
                        int iA = fVar.a();
                        r0 r0Var = i0Var.H;
                        r0Var.getClass();
                        r0Var.a(iA, fVar);
                        r0Var.d(jMax, 1, iA, 0, null);
                        i0Var.I = true;
                    }
                }
                this.f26091x = this.f26088d;
            }
            return -1;
        }
        int i17 = nVar.read(bArr, i10, Math.min(this.f26091x, i11));
        if (i17 != -1) {
            this.f26091x -= i17;
        }
        return i17;
    }

    @Override // pb.n
    public final void s(pb.u0 u0Var) {
        u0Var.getClass();
        this.f26087a.s(u0Var);
    }
}
