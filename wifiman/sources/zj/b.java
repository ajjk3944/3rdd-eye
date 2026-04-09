package zj;

import org.msgpack.core.MessageTypeCastException;
import yj.n;
import yj.o;

/* loaded from: classes2.dex */
abstract class b implements o {
    b() {
    }

    @Override // yj.u
    public boolean C() {
        return k().isNilType();
    }

    @Override // yj.u
    public boolean G() {
        return k().isArrayType();
    }

    @Override // yj.u
    public boolean H() {
        return k().isBooleanType();
    }

    @Override // yj.u
    public boolean I() {
        return k().isStringType();
    }

    @Override // yj.u
    public boolean N() {
        return k().isFloatType();
    }

    @Override // yj.u
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public yj.f i() {
        throw new MessageTypeCastException();
    }

    @Override // yj.u
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public yj.g F() {
        throw new MessageTypeCastException();
    }

    @Override // yj.u
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public yj.h M() {
        throw new MessageTypeCastException();
    }

    @Override // yj.u
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public yj.i D() {
        throw new MessageTypeCastException();
    }

    @Override // yj.u
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public yj.j A() {
        throw new MessageTypeCastException();
    }

    @Override // yj.u
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public yj.k x() {
        throw new MessageTypeCastException();
    }

    @Override // yj.u
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public yj.l o() {
        throw new MessageTypeCastException();
    }

    @Override // yj.u
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public n L() {
        throw new MessageTypeCastException();
    }

    @Override // yj.u
    public boolean e() {
        return k().isBinaryType();
    }

    @Override // yj.u
    public boolean j() {
        return k().isRawType();
    }

    @Override // yj.u
    public boolean v() {
        return k().isExtensionType();
    }

    @Override // yj.u
    public boolean y() {
        return k().isIntegerType();
    }

    @Override // yj.u
    public boolean z() {
        return k().isMapType();
    }
}
