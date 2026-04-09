package bl;

import al.g1;
import al.y0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c0 extends y0 implements g1 {
    @Override // al.g1
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f651h;
            nk.k.b(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f652i + ((int) ((o() + this.f653k) - this.f652i))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void w(int i4) {
        synchronized (this) {
            Object[] objArr = this.f651h;
            nk.k.b(objArr);
            q(Integer.valueOf(((Number) objArr[((int) ((this.f652i + ((int) ((o() + this.f653k) - this.f652i))) - 1)) & (objArr.length - 1)]).intValue() + i4));
        }
    }
}
