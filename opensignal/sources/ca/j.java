package ca;

import com.google.android.exoplayer2.Format;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class j implements x {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3483a = new byte[4096];

    @Override // ca.x
    public final void a(int i10, fb.f fVar) {
        fVar.z(i10);
    }

    @Override // ca.x
    public final int c(pb.k kVar, int i10, boolean z10) throws EOFException {
        byte[] bArr = this.f3483a;
        int i11 = kVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (i11 != -1) {
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // ca.x
    public final void e(Format format) {
    }

    @Override // ca.x
    public final void d(long j, int i10, int i11, int i12, w wVar) {
    }
}
