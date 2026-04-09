package c8;

/* loaded from: classes.dex */
public final class i0 implements k {
    @Override // c8.k
    public final l a(f8.m mVar, l8.n nVar) {
        long jX;
        String str = mVar.f8702b;
        d0 d0Var = mVar.f8701a;
        if (!br.l.a(str, "image/svg+xml")) {
            cv.i iVarI = d0Var.i();
            if (!iVarI.m0(0L, h0.f3346b)) {
                return null;
            }
            cv.j jVar = h0.f3345a;
            byte[] bArr = jVar.f6716a;
            if (bArr.length <= 0) {
                throw new IllegalArgumentException("bytes is empty");
            }
            byte b2 = bArr[0];
            long length = 1024 - bArr.length;
            long j = 0;
            while (true) {
                if (j >= length) {
                    jX = -1;
                    break;
                }
                byte b10 = b2;
                long j7 = length;
                jX = iVarI.x(b10, j, j7);
                if (jX == -1 || iVarI.m0(jX, jVar)) {
                    break;
                }
                j = jX + 1;
                length = j7;
                b2 = b10;
            }
            if (jX == -1) {
                return null;
            }
        }
        return new w(d0Var, nVar, 1);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof i0);
    }

    public final int hashCode() {
        return Boolean.hashCode(true);
    }
}
