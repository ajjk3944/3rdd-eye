package w6;

import a5.b0;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class p implements u5.k {

    /* renamed from: e, reason: collision with root package name */
    public boolean f24346e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24347f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24348g;

    /* renamed from: h, reason: collision with root package name */
    public long f24349h;

    /* renamed from: i, reason: collision with root package name */
    public m f24350i;
    public u5.m j;
    public boolean k;

    /* renamed from: a, reason: collision with root package name */
    public final b0 f24342a = new b0(0);

    /* renamed from: c, reason: collision with root package name */
    public final a5.v f24344c = new a5.v(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f24343b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final n f24345d = new n(0);

    @Override // u5.k
    public final void c(long j, long j7) {
        long j10;
        SparseArray sparseArray = this.f24343b;
        b0 b0Var = this.f24342a;
        synchronized (b0Var) {
            j10 = b0Var.f94b;
        }
        boolean z10 = j10 == -9223372036854775807L;
        if (!z10) {
            long jC = b0Var.c();
            z10 = (jC == -9223372036854775807L || jC == 0 || jC == j7) ? false : true;
        }
        if (z10) {
            b0Var.d(j7);
        }
        m mVar = this.f24350i;
        if (mVar != null) {
            mVar.e(j7);
        }
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            o oVar = (o) sparseArray.valueAt(i10);
            oVar.f24340f = false;
            oVar.f24335a.a();
        }
    }

    @Override // u5.k
    public final void f(u5.m mVar) {
        this.j = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0230  */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // u5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(u5.l r28, ca.n r29) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 805
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.p.g(u5.l, ca.n):int");
    }

    @Override // u5.k
    public final boolean h(u5.l lVar) {
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

    @Override // u5.k
    public final void release() {
    }
}
