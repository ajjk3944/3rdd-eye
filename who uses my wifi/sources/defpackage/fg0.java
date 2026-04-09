package defpackage;

import java.nio.ByteBuffer;
import java.util.BitSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fg0 extends tn0 {
    public gg0 k;
    public BitSet l;

    @Override // defpackage.tn0
    public final void k(cm cmVar) throws t91 {
        this.k = new gg0(cmVar);
        this.l = new BitSet();
        int iRemaining = ((ByteBuffer) cmVar.j).remaining();
        for (int i = 0; i < iRemaining; i++) {
            int i2 = cmVar.i();
            for (int i3 = 0; i3 < 8; i3++) {
                if (((1 << (7 - i3)) & i2) != 0) {
                    this.l.set((i * 8) + i3);
                }
            }
        }
    }

    @Override // defpackage.tn0
    public final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.k);
        int length = this.l.length();
        for (short s = 0; s < length; s = (short) (s + 1)) {
            if (this.l.get(s)) {
                sb.append(" ");
                sb.append(k31.a.e(s));
            }
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        this.k.r(t3Var, null, z);
        int length = this.l.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i |= this.l.get(i2) ? 1 << (7 - (i2 % 8)) : 0;
            if (i2 % 8 == 7 || i2 == length - 1) {
                t3Var.q(i);
                i = 0;
            }
        }
    }
}
