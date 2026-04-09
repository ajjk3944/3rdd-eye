package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class n40 extends tn0 {
    public int k;
    public int l;
    public int m;
    public byte[] n;
    public int o = -1;

    @Override // defpackage.tn0
    public final void k(cm cmVar) {
        this.k = cmVar.f();
        this.l = cmVar.i();
        this.m = cmVar.i();
        if (((ByteBuffer) cmVar.j).remaining() > 0) {
            this.n = cmVar.b();
        }
    }

    @Override // defpackage.tn0
    public final String l() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(this.k);
        sb.append(" ");
        sb.append(this.l);
        sb.append(" ");
        sb.append(this.m);
        if (this.n != null) {
            if (tj0.a()) {
                sb.append(" (\n");
                sb.append(um.i(this.n, true));
                sb.append(" ; key_tag = ");
                int i2 = this.o;
                if (i2 < 0) {
                    int i3 = 0;
                    t3 t3Var = new t3(2, (byte) 0);
                    m(t3Var, null, false);
                    byte[] bArrI = t3Var.i();
                    if (this.m == 1) {
                        i = ((bArrI[bArrI.length - 3] & 255) << 8) + (bArrI[bArrI.length - 2] & 255);
                    } else {
                        int i4 = 0;
                        while (i3 < bArrI.length - 1) {
                            i4 += ((bArrI[i3] & 255) << 8) + (bArrI[i3 + 1] & 255);
                            i3 += 2;
                        }
                        if (i3 < bArrI.length) {
                            i4 += (bArrI[i3] & 255) << 8;
                        }
                        i = i4 + ((i4 >> 16) & 65535);
                    }
                    i2 = i & 65535;
                    this.o = i2;
                }
                sb.append(i2);
            } else {
                sb.append(" ");
                sb.append(um.y(this.n));
            }
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.m(this.k);
        t3Var.q(this.l);
        t3Var.q(this.m);
        byte[] bArr = this.n;
        if (bArr != null) {
            t3Var.k(bArr, 0, bArr.length);
        }
    }
}
