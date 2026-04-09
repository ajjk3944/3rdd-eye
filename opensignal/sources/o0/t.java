package o0;

import java.util.ArrayList;
import n0.u1;
import n0.v1;

/* loaded from: classes.dex */
public final class t extends ns.d {

    /* renamed from: d, reason: collision with root package name */
    public static final t f18727d = new t(1, 0, 2);

    @Override // ns.d
    public final void c(androidx.datastore.preferences.protobuf.l lVar, n0.c cVar, v1 v1Var, al.g gVar, g0 g0Var) {
        n0.a aVar;
        int iC;
        int iF = lVar.f(0);
        if (v1Var.f17344n != 0) {
            n0.q.c("Cannot move a group while inserting");
        }
        if (iF < 0) {
            n0.q.c("Parameter offset is out of bounds");
        }
        if (iF == 0) {
            return;
        }
        int i10 = v1Var.f17350t;
        int i11 = v1Var.f17352v;
        int i12 = v1Var.f17351u;
        int i13 = i10;
        while (iF > 0) {
            i13 += v1Var.f17334b[(v1Var.r(i13) * 5) + 3];
            if (i13 > i12) {
                n0.q.c("Parameter offset is out of bounds");
            }
            iF--;
        }
        int i14 = v1Var.f17334b[(v1Var.r(i13) * 5) + 3];
        int iG = v1Var.g(v1Var.f17334b, v1Var.r(v1Var.f17350t));
        int iG2 = v1Var.g(v1Var.f17334b, v1Var.r(i13));
        int i15 = i13 + i14;
        int iG3 = v1Var.g(v1Var.f17334b, v1Var.r(i15));
        int i16 = iG3 - iG2;
        v1Var.w(i16, Math.max(v1Var.f17350t - 1, 0));
        v1Var.v(i14);
        int[] iArr = v1Var.f17334b;
        int iR = v1Var.r(i15) * 5;
        mq.l.b0(v1Var.r(i10) * 5, iR, (i14 * 5) + iR, iArr, iArr);
        if (i16 > 0) {
            Object[] objArr = v1Var.f17335c;
            int iH = v1Var.h(iG2 + i16);
            System.arraycopy(objArr, iH, objArr, iG, v1Var.h(iG3 + i16) - iH);
        }
        int i17 = iG2 + i16;
        int i18 = i17 - iG;
        int i19 = v1Var.k;
        int i20 = v1Var.f17342l;
        int length = v1Var.f17335c.length;
        int i21 = v1Var.f17343m;
        int i22 = i10 + i14;
        int i23 = i10;
        while (i23 < i22) {
            int iR2 = v1Var.r(i23);
            int i24 = i18;
            int[] iArr2 = iArr;
            iArr2[(iR2 * 5) + 4] = v1.i(v1.i(v1Var.g(iArr, iR2) - i24, i21 < iR2 ? 0 : i19, i20, length), v1Var.k, v1Var.f17342l, v1Var.f17335c.length);
            i23++;
            i18 = i24;
            iArr = iArr2;
            i19 = i19;
        }
        int i25 = i15 + i14;
        int iP = v1Var.p();
        int iB = u1.b(v1Var.f17336d, i15, iP);
        ArrayList arrayList = new ArrayList();
        if (iB >= 0) {
            while (iB < v1Var.f17336d.size() && (iC = v1Var.c((aVar = (n0.a) v1Var.f17336d.get(iB)))) >= i15 && iC < i25) {
                arrayList.add(aVar);
            }
        }
        int i26 = i10 - i15;
        int size = arrayList.size();
        for (int i27 = 0; i27 < size; i27++) {
            n0.a aVar2 = (n0.a) arrayList.get(i27);
            int iC2 = v1Var.c(aVar2) + i26;
            if (iC2 >= v1Var.f17339g) {
                aVar2.f17127a = -(iP - iC2);
            } else {
                aVar2.f17127a = iC2;
            }
            v1Var.f17336d.add(u1.b(v1Var.f17336d, iC2, iP), aVar2);
        }
        if (v1Var.G(i15, i14)) {
            n0.q.c("Unexpectedly removed anchors");
        }
        v1Var.m(i11, v1Var.f17351u, i10);
        if (i16 > 0) {
            v1Var.H(i17, i16, i15 - 1);
        }
    }
}
