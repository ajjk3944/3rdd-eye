package zj;

import java.util.Arrays;
import yj.u;
import yj.w;

/* loaded from: classes2.dex */
public class e extends a implements yj.g {
    public e(byte[] bArr) {
        super(bArr);
    }

    @Override // zj.b, yj.u
    /* renamed from: Q */
    public yj.g F() {
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
        if (uVar.e()) {
            return uVar instanceof e ? Arrays.equals(this.f67384a, ((e) uVar).f67384a) : Arrays.equals(this.f67384a, uVar.F().u());
        }
        return false;
    }

    @Override // yj.u
    public void f(org.msgpack.core.e eVar) {
        eVar.p(this.f67384a.length);
        eVar.o0(this.f67384a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f67384a);
    }

    @Override // yj.u
    public w k() {
        return w.BINARY;
    }
}
