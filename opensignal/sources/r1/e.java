package r1;

import u.o;
import u.z;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final p0.e f21162a = new p0.e(new d[16]);

    /* renamed from: b, reason: collision with root package name */
    public final z f21163b = new z(10);

    public boolean a(o oVar, v1.m mVar, q3.a aVar, boolean z10) {
        p0.e eVar = this.f21162a;
        Object[] objArr = eVar.f20230a;
        int i10 = eVar.f20232g;
        boolean z11 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z11 = ((d) objArr[i11]).a(oVar, mVar, aVar, z10) || z11;
        }
        return z11;
    }

    public void b(q3.a aVar) {
        p0.e eVar = this.f21162a;
        int i10 = eVar.f20232g;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            }
            if (((d) eVar.f20230a[i10]).f21156d.f142b == 0) {
                eVar.k(i10);
            }
        }
    }
}
