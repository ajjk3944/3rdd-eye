package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tj extends cr {
    public byte[] g;
    public byte[] h;

    @Override // defpackage.cr
    public final void a(cm cmVar) throws t91 {
        int iRemaining = ((ByteBuffer) cmVar.j).remaining();
        if (iRemaining < 8) {
            throw new t91("invalid length of client cookie");
        }
        this.g = cmVar.c(8);
        if (iRemaining > 8) {
            if (iRemaining < 16 || iRemaining > 40) {
                throw new t91("invalid length of server cookie");
            }
            this.h = cmVar.b();
        }
    }

    @Override // defpackage.cr
    public final String b() {
        if (this.h == null) {
            return yb.s(this.g);
        }
        return yb.s(this.g) + " " + yb.s(this.h);
    }

    @Override // defpackage.cr
    public final void c(t3 t3Var) {
        t3Var.j(this.g);
        byte[] bArr = this.h;
        if (bArr != null) {
            t3Var.k(bArr, 0, bArr.length);
        }
    }
}
