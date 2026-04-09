package g2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w0 extends i2.b0 {

    /* renamed from: b, reason: collision with root package name */
    public static final w0 f24428b = new w0("Undefined intrinsics block and it is required");

    @Override // g2.j0
    public final k0 f(l0 l0Var, List list, long j) {
        int size = list.size();
        zj.t tVar = zj.t.f38318a;
        if (size == 0) {
            return l0Var.O(d3.a.j(j), d3.a.i(j), tVar, t0.f24418c);
        }
        if (size == 1) {
            s0 s0VarV = ((i0) list.get(0)).v(j);
            return l0Var.O(d3.b.f(s0VarV.f24408a, j), d3.b.e(s0VarV.f24409b, j), tVar, new v0(s0VarV, 0));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            s0 s0VarV2 = ((i0) list.get(i4)).v(j);
            iMax = Math.max(s0VarV2.f24408a, iMax);
            iMax2 = Math.max(s0VarV2.f24409b, iMax2);
            arrayList.add(s0VarV2);
        }
        return l0Var.O(d3.b.f(iMax, j), d3.b.e(iMax2, j), tVar, new c2.l0(1, arrayList));
    }
}
