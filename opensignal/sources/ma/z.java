package ma;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class z implements ca.k {

    /* renamed from: e, reason: collision with root package name */
    public boolean f16657e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16658f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16659g;

    /* renamed from: h, reason: collision with root package name */
    public long f16660h;

    /* renamed from: i, reason: collision with root package name */
    public ea.b f16661i;
    public ca.m j;
    public boolean k;

    /* renamed from: a, reason: collision with root package name */
    public final qb.u f16653a = new qb.u(0);

    /* renamed from: c, reason: collision with root package name */
    public final fb.f f16655c = new fb.f(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f16654b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final x f16656d = new x(0);

    @Override // ca.k
    public final void c(long j, long j7) {
        long j10;
        SparseArray sparseArray = this.f16654b;
        qb.u uVar = this.f16653a;
        synchronized (uVar) {
            j10 = uVar.f20825b;
        }
        boolean z10 = j10 == -9223372036854775807L;
        if (!z10) {
            long jC = uVar.c();
            z10 = (jC == -9223372036854775807L || jC == 0 || jC == j7) ? false : true;
        }
        if (z10) {
            uVar.d(j7);
        }
        ea.b bVar = this.f16661i;
        if (bVar != null) {
            bVar.e(j7);
        }
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            y yVar = (y) sparseArray.valueAt(i10);
            yVar.f16651f = false;
            yVar.f16646a.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023a  */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // ca.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(ca.l r28, ca.n r29) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.z.f(ca.l, ca.n):int");
    }

    @Override // ca.k
    public final boolean g(ca.l lVar) {
        byte[] bArr = new byte[14];
        lVar.p(bArr, 0, 14);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lVar.g(bArr[13] & 7);
            lVar.p(bArr, 0, 3);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // ca.k
    public final void h(ca.m mVar) {
        this.j = mVar;
    }

    @Override // ca.k
    public final void release() {
    }
}
