package g3;

import e4.c2;
import e4.l1;
import g2.n0;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends androidx.datastore.preferences.protobuf.j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f24453c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x xVar) {
        super(1);
        this.f24453c = xVar;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final c2 f(c2 c2Var, List list) {
        return this.f24453c.n(c2Var);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final yb.i g(l1 l1Var, yb.i iVar) {
        i2.q qVar = (i2.q) this.f24453c.f24501z.G.f19257d;
        if (qVar.R.f25565n) {
            long jD = ii.a.D(qVar.E(0L));
            int i4 = (int) (jD >> 32);
            if (i4 < 0) {
                i4 = 0;
            }
            int i10 = (int) (jD & 4294967295L);
            if (i10 < 0) {
                i10 = 0;
            }
            long jM = n0.f(qVar).m();
            int i11 = (int) (jM >> 32);
            int i12 = (int) (jM & 4294967295L);
            long j = qVar.f24410c;
            long jD2 = ii.a.D(qVar.E((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
            int i13 = i11 - ((int) (jD2 >> 32));
            if (i13 < 0) {
                i13 = 0;
            }
            int i14 = i12 - ((int) (4294967295L & jD2));
            int i15 = i14 >= 0 ? i14 : 0;
            if (i4 != 0 || i10 != 0 || i13 != 0 || i15 != 0) {
                return new yb.i(j.m((v3.b) iVar.f37516b, i4, i10, i13, i15), false, j.m((v3.b) iVar.f37517c, i4, i10, i13, i15), 13);
            }
        }
        return iVar;
    }
}
