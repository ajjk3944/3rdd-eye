package b5;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f1873b;

    public s0(u0 u0Var, int i4) {
        this.f1873b = u0Var;
        this.f1872a = i4;
    }

    @Override // b5.r0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        u0 u0Var = this.f1873b;
        z zVar = u0Var.A;
        int i4 = this.f1872a;
        if (zVar == null || i4 >= 0 || !zVar.o().T(-1, 0)) {
            return u0Var.U(arrayList, arrayList2, i4, 1);
        }
        return false;
    }
}
