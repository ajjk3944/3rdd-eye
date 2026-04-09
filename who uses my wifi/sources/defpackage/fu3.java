package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fu3 extends e6 {
    public final /* synthetic */ int c;

    public fu3(int i, byte[] bArr) throws GeneralSecurityException {
        this.c = i;
        if (!yb.x(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.a = r(1, bArr);
        this.b = r(0, bArr);
    }

    @Override // defpackage.e6
    public final eu3 r(int i, byte[] bArr) {
        switch (this.c) {
            case 0:
                return new eu3(bArr, i, 0);
            default:
                return new eu3(bArr, i, 1);
        }
    }
}
