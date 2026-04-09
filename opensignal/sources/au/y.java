package au;

import zt.e0;
import zt.m0;

/* loaded from: classes.dex */
public final class y extends e0 implements m0 {
    @Override // zt.m0
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.D;
            br.l.b(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.E + ((int) ((o() + this.G) - this.E))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void w(int i10) {
        synchronized (this) {
            Object[] objArr = this.D;
            br.l.b(objArr);
            q(Integer.valueOf(((Number) objArr[((int) ((this.E + ((int) ((o() + this.G) - this.E))) - 1)) & (objArr.length - 1)]).intValue() + i10));
        }
    }
}
