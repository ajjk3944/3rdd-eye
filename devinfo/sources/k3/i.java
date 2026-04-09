package k3;

import java.util.ArrayList;
import l3.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class i extends d {

    /* renamed from: q0, reason: collision with root package name */
    public d[] f27921q0 = new d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f27922r0 = 0;

    public final void R(int i4, ArrayList arrayList, m mVar) {
        for (int i10 = 0; i10 < this.f27922r0; i10++) {
            d dVar = this.f27921q0[i10];
            ArrayList arrayList2 = mVar.f28575a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i11 = 0; i11 < this.f27922r0; i11++) {
            l3.g.b(this.f27921q0[i11], i4, arrayList, mVar);
        }
    }

    public void S() {
    }
}
