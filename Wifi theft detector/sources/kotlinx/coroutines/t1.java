package kotlinx.coroutines;

/* loaded from: classes4.dex */
public class t1 extends y1 implements a0 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22693c;

    public t1(r1 r1Var) {
        super(true);
        n0(r1Var);
        this.f22693c = Q0();
    }

    public final boolean Q0() {
        y1 y1VarZ;
        u uVarH0 = h0();
        v vVar = uVarH0 instanceof v ? (v) uVarH0 : null;
        if (vVar != null && (y1VarZ = vVar.z()) != null) {
            while (!y1VarZ.e0()) {
                u uVarH02 = y1VarZ.h0();
                v vVar2 = uVarH02 instanceof v ? (v) uVarH02 : null;
                if (vVar2 == null || (y1VarZ = vVar2.z()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.y1
    public boolean e0() {
        return this.f22693c;
    }

    @Override // kotlinx.coroutines.y1
    public boolean f0() {
        return true;
    }

    @Override // kotlinx.coroutines.a0
    public boolean h() {
        return s0(y8.s.f25199a);
    }
}
