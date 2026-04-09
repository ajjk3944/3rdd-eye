package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v71 extends tn0 {
    public byte[] k;
    public int l;
    public int[] m;

    @Override // defpackage.tn0
    public final void k(cm cmVar) {
        this.k = cmVar.c(4);
        this.l = cmVar.i();
        byte[] bArrB = cmVar.b();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bArrB.length; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                if ((bArrB[i] & 255 & (1 << (7 - i2))) != 0) {
                    arrayList.add(Integer.valueOf((i * 8) + i2));
                }
            }
        }
        this.m = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.m[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
    }

    @Override // defpackage.tn0
    public final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(a30.j(this.k));
        sb.append(" ");
        sb.append(this.l);
        for (int i : this.m) {
            sb.append(" ");
            sb.append(i);
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.j(this.k);
        t3Var.q(this.l);
        int[] iArr = this.m;
        int i = (iArr[iArr.length - 1] / 8) + 1;
        byte[] bArr = new byte[i];
        for (int i2 : iArr) {
            int i3 = i2 / 8;
            bArr[i3] = (byte) ((1 << (7 - (i2 % 8))) | bArr[i3]);
        }
        t3Var.k(bArr, 0, i);
    }
}
