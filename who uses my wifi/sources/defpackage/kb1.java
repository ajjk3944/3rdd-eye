package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kb1 extends tn0 {
    public long k;
    public int l;
    public int m;
    public byte[] n;

    @Override // defpackage.tn0
    public final void k(cm cmVar) throws t91 {
        String string;
        this.k = cmVar.g();
        this.l = cmVar.i();
        this.m = cmVar.i();
        byte[] bArrB = cmVar.b();
        this.n = bArrB;
        int i = this.m;
        HashMap map = jb1.b;
        Integer num = (Integer) map.get(Integer.valueOf(i));
        int iIntValue = num == null ? -1 : num.intValue();
        if (iIntValue != -1 && iIntValue != bArrB.length) {
            StringBuilder sb = new StringBuilder("Digest size for ");
            sb.append(jb1.a.e(i));
            sb.append(" be exactly ");
            Integer num2 = (Integer) map.get(Integer.valueOf(i));
            sb.append(num2 != null ? num2.intValue() : -1);
            sb.append(" bytes, got ");
            sb.append(bArrB.length);
            string = sb.toString();
        } else if (bArrB.length < 12) {
            string = "Digest size must be at least 12 bytes, got " + bArrB.length;
        } else {
            string = null;
        }
        if (string != null) {
            throw new t91(string);
        }
    }

    @Override // defpackage.tn0
    public final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.k);
        sb.append(" ");
        sb.append(this.l);
        sb.append(" ");
        String strI = ex0.i(sb, this.m, " ");
        if (!tj0.a()) {
            return strI + yb.s(this.n);
        }
        return strI + "(" + g82.s(48, yb.s(this.n), true);
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.o(this.k);
        t3Var.q(this.l);
        t3Var.q(this.m);
        t3Var.j(this.n);
    }
}
