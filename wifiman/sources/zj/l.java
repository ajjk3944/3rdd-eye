package zj;

import java.util.Arrays;
import yj.n;
import yj.u;
import yj.w;

/* loaded from: classes2.dex */
public class l extends a implements n {
    public l(byte[] bArr) {
        super(bArr);
    }

    @Override // zj.b, yj.u
    /* renamed from: W */
    public n L() {
        return this;
    }

    @Override // yj.u
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (uVar.I()) {
            return uVar instanceof l ? Arrays.equals(this.f67384a, ((l) uVar).f67384a) : Arrays.equals(this.f67384a, uVar.L().u());
        }
        return false;
    }

    @Override // yj.u
    public void f(org.msgpack.core.e eVar) {
        eVar.S(this.f67384a.length);
        eVar.o0(this.f67384a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f67384a);
    }

    @Override // yj.u
    public w k() {
        return w.STRING;
    }

    public l(String str) {
        super(str);
    }
}
