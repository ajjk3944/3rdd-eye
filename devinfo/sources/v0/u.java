package v0;

import java.util.ArrayList;
import u0.d2;
import u0.e2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u f35601c = new u(1, 0, 2);

    @Override // v0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, u0.c cVar, e2 e2Var, c1.o oVar, k0 k0Var) {
        u0.a aVar;
        int iC;
        int i4 = kVar.i(0);
        if (e2Var.f34790n != 0) {
            u0.r.a("Cannot move a group while inserting");
        }
        if (i4 < 0) {
            u0.r.a("Parameter offset is out of bounds");
        }
        if (i4 == 0) {
            return;
        }
        int i10 = e2Var.f34796t;
        int i11 = e2Var.f34798v;
        int i12 = e2Var.f34797u;
        int i13 = i10;
        while (i4 > 0) {
            i13 += e2Var.f34780b[(e2Var.r(i13) * 5) + 3];
            if (i13 > i12) {
                u0.r.a("Parameter offset is out of bounds");
            }
            i4--;
        }
        int i14 = e2Var.f34780b[(e2Var.r(i13) * 5) + 3];
        int iG = e2Var.g(e2Var.r(e2Var.f34796t), e2Var.f34780b);
        int iG2 = e2Var.g(e2Var.r(i13), e2Var.f34780b);
        int i15 = i13 + i14;
        int iG3 = e2Var.g(e2Var.r(i15), e2Var.f34780b);
        int i16 = iG3 - iG2;
        e2Var.x(i16, Math.max(e2Var.f34796t - 1, 0));
        e2Var.w(i14);
        int[] iArr = e2Var.f34780b;
        int iR = e2Var.r(i15) * 5;
        zj.m.M(e2Var.r(i10) * 5, iR, (i14 * 5) + iR, iArr, iArr);
        if (i16 > 0) {
            Object[] objArr = e2Var.f34781c;
            int iH = e2Var.h(iG2 + i16);
            System.arraycopy(objArr, iH, objArr, iG, e2Var.h(iG3 + i16) - iH);
        }
        int i17 = iG2 + i16;
        int i18 = i17 - iG;
        int i19 = e2Var.f34787k;
        int i20 = e2Var.f34788l;
        int length = e2Var.f34781c.length;
        int i21 = e2Var.f34789m;
        int i22 = i10 + i14;
        int i23 = i10;
        while (i23 < i22) {
            int iR2 = e2Var.r(i23);
            int i24 = i18;
            int[] iArr2 = iArr;
            iArr2[(iR2 * 5) + 4] = e2.i(e2.i(e2Var.g(iR2, iArr) - i24, i21 < iR2 ? 0 : i19, i20, length), e2Var.f34787k, e2Var.f34788l, e2Var.f34781c.length);
            i23++;
            i18 = i24;
            iArr = iArr2;
            i19 = i19;
        }
        int i25 = i15 + i14;
        int iP = e2Var.p();
        int iB = d2.b(e2Var.f34782d, i15, iP);
        ArrayList arrayList = new ArrayList();
        if (iB >= 0) {
            while (iB < e2Var.f34782d.size() && (iC = e2Var.c((aVar = (u0.a) e2Var.f34782d.get(iB)))) >= i15 && iC < i25) {
                arrayList.add(aVar);
            }
        }
        int i26 = i10 - i15;
        int size = arrayList.size();
        for (int i27 = 0; i27 < size; i27++) {
            u0.a aVar2 = (u0.a) arrayList.get(i27);
            int iC2 = e2Var.c(aVar2) + i26;
            if (iC2 >= e2Var.g) {
                aVar2.f34724a = -(iP - iC2);
            } else {
                aVar2.f34724a = iC2;
            }
            e2Var.f34782d.add(d2.b(e2Var.f34782d, iC2, iP), aVar2);
        }
        if (e2Var.I(i15, i14)) {
            u0.r.a("Unexpectedly removed anchors");
        }
        e2Var.m(i11, e2Var.f34797u, i10);
        if (i16 > 0) {
            e2Var.J(i17, i16, i15 - 1);
        }
    }
}
