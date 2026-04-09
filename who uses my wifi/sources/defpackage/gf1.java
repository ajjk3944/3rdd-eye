package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gf1 implements jg1 {
    public final byte[] a = new byte[4096];

    @Override // defpackage.jg1
    public final void a(kz2 kz2Var, int i, int i2) {
        kz2Var.G(i);
    }

    @Override // defpackage.jg1
    public final int b(ua4 ua4Var, int i, boolean z) throws EOFException {
        int iD = ua4Var.d(this.a, 0, Math.min(4096, i));
        if (iD != -1) {
            return iD;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.jg1
    public final void d(ph4 ph4Var) {
    }

    @Override // defpackage.jg1
    public final void c(long j, int i, int i2, int i3, ig1 ig1Var) {
    }
}
