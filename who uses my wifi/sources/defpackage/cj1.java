package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cj1 implements ak1 {
    public long f;
    public long g;
    public Object h;
    public Object i;

    public cj1(String str, byte[] bArr, long j, long j2) {
        this.h = str;
        this.i = bArr;
        this.f = j;
        this.g = j2;
    }

    public static cj1 a(nb nbVar, byte[] bArr) throws hp1, kp1 {
        nbVar.d();
        ((iq1) nbVar.g).c.h = vp1.e(bArr);
        List list = (List) nbVar.h(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        nbVar.j(jLongValue, Optional.empty());
        String strConcat = "3.".concat(new String(yb.z(), StandardCharsets.UTF_8));
        cj1 cj1Var = new cj1();
        cj1Var.i = nbVar;
        cj1Var.f = jLongValue2;
        cj1Var.g = jLongValue3;
        cj1Var.h = strConcat;
        return cj1Var;
    }

    @Override // defpackage.ak1
    public long b(mf1 mf1Var) {
        long j = this.g;
        if (j < 0) {
            return -1L;
        }
        this.g = -1L;
        return -(j + 2);
    }

    @Override // defpackage.ak1
    public void d(long j) {
        long[] jArr = (long[]) ((vq2) this.i).g;
        this.g = jArr[v23.p(jArr, j, true)];
    }

    @Override // defpackage.ak1
    public cg1 h() {
        zt0.b0(this.f != -1);
        return new qf1((rf1) this.h, this.f, 0);
    }

    public cj1(long j) {
        zt0.b0(((qj4) this.h) == null);
        this.f = j;
        this.g = j + 65536;
    }
}
