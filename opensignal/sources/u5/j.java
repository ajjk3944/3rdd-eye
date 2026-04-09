package u5;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class j implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f23295a = new byte[4096];

    @Override // u5.a0
    public final int b(androidx.media3.common.l lVar, int i10, boolean z10) throws EOFException {
        byte[] bArr = this.f23295a;
        int i11 = lVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (i11 != -1) {
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // u5.a0
    public final void d(int i10, a5.v vVar) {
        vVar.F(i10);
    }

    @Override // u5.a0
    public final void c(androidx.media3.common.r rVar) {
    }

    @Override // u5.a0
    public final void a(long j, int i10, int i11, int i12, z zVar) {
    }
}
