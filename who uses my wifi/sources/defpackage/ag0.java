package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ag0 extends tn0 {
    public int k;
    public int l;
    public int m;
    public byte[] n;
    public byte[] o;
    public l31 p;

    @Override // defpackage.tn0
    public final void k(cm cmVar) throws t91 {
        this.k = cmVar.i();
        this.l = cmVar.i();
        this.m = cmVar.f();
        int i = cmVar.i();
        if (i > 0) {
            this.n = cmVar.c(i);
        } else {
            this.n = null;
        }
        this.o = cmVar.c(cmVar.i());
        this.p = new l31(cmVar);
    }

    @Override // defpackage.tn0
    public final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.k);
        sb.append(' ');
        sb.append(this.l);
        sb.append(' ');
        sb.append(this.m);
        sb.append(' ');
        byte[] bArr = this.n;
        if (bArr == null) {
            sb.append('-');
        } else {
            sb.append(yb.s(bArr));
        }
        sb.append(' ');
        byte[] bArr2 = this.o;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        short s = 0;
        int i = 0;
        while (i < (bArr2.length + 4) / 5) {
            short[] sArr = new short[5];
            int i2 = 5;
            for (int i3 = s; i3 < 5; i3++) {
                int i4 = (i * 5) + i3;
                if (i4 < bArr2.length) {
                    sArr[i3] = (short) (bArr2[i4] & 255);
                } else {
                    sArr[i3] = s;
                    i2--;
                }
            }
            short s2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? (short) -1 : s : (short) 1 : (short) 3 : (short) 4 : (short) 6;
            short s3 = sArr[s];
            short s4 = sArr[1];
            short s5 = sArr[2];
            short s6 = sArr[3];
            short s7 = sArr[4];
            int[] iArr = {(byte) ((s3 >> 3) & 31), (byte) (((s3 & 7) << 2) | ((s4 >> 6) & 3)), (byte) ((s4 >> 1) & 31), (byte) (((s4 & 1) << 4) | ((s5 >> 4) & 15)), (byte) (((s5 & 15) << 1) | ((s6 >> 7) & 1)), (byte) ((s6 >> 2) & 31), (byte) (((s7 >> 5) & 7) | ((s6 & 3) << 3)), (byte) (s7 & 31)};
            for (int i5 = 0; i5 < 8 - s2; i5++) {
                byteArrayOutputStream.write("0123456789ABCDEFGHIJKLMNOPQRSTUV=".charAt(iArr[i5]));
            }
            i++;
            s = 0;
        }
        sb.append(byteArrayOutputStream.toString());
        if (!this.p.f.isEmpty()) {
            sb.append(' ');
            sb.append(this.p.toString());
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.q(this.k);
        t3Var.q(this.l);
        t3Var.m(this.m);
        byte[] bArr = this.n;
        if (bArr != null) {
            t3Var.q(bArr.length);
            t3Var.j(this.n);
        } else {
            t3Var.q(0);
        }
        t3Var.q(this.o.length);
        t3Var.j(this.o);
        this.p.b(t3Var);
    }
}
