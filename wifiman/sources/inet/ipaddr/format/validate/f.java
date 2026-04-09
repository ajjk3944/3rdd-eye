package inet.ipaddr.format.validate;

import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class f implements Serializable {
    public abstract Zf.d c(int i10, int i11, Integer num);

    public abstract Zf.d[] d(int i10);

    protected abstract inet.ipaddr.a h(Zf.c cVar, Zf.f fVar);

    protected abstract inet.ipaddr.a j(Zf.c cVar, CharSequence charSequence, Zf.f fVar);

    protected abstract inet.ipaddr.a l(Zf.c cVar, CharSequence charSequence, Zf.f fVar, inet.ipaddr.a aVar, inet.ipaddr.a aVar2);

    protected abstract inet.ipaddr.a m(byte[] bArr, CharSequence charSequence);

    protected inet.ipaddr.a n(Zf.d[] dVarArr, Zf.f fVar, Integer num) {
        return h(p(dVarArr, num), fVar);
    }

    protected inet.ipaddr.a o(Zf.d[] dVarArr, CharSequence charSequence, Zf.f fVar, Integer num) {
        return j(p(dVarArr, num), charSequence, fVar);
    }

    protected abstract Zf.c p(Zf.d[] dVarArr, Integer num);

    protected abstract Zf.c r(Zf.d[] dVarArr, Integer num, boolean z10);

    protected abstract Zf.d s(int i10, int i11, Integer num, CharSequence charSequence, int i12, int i13, boolean z10, boolean z11, int i14, int i15, int i16);

    protected abstract Zf.c t(Zf.d[] dVarArr);

    protected abstract Zf.d v(int i10, Integer num, CharSequence charSequence, int i11, boolean z10, int i12, int i13);

    protected abstract int y();
}
