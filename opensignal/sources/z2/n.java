package z2;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f26621a = new boolean[3];

    /* JADX WARN: Removed duplicated region for block: B:188:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x06f0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(z2.h r40, x2.c r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instructions count: 1789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.n.a(z2.h, x2.c, java.util.ArrayList, int):void");
    }

    public static void b(h hVar, x2.c cVar, g gVar) {
        gVar.f26562o = -1;
        d dVar = gVar.M;
        f[] fVarArr = gVar.T;
        d dVar2 = gVar.L;
        d dVar3 = gVar.J;
        d dVar4 = gVar.K;
        d dVar5 = gVar.I;
        gVar.f26564p = -1;
        f[] fVarArr2 = hVar.T;
        f fVar = fVarArr2[0];
        f fVar2 = f.WRAP_CONTENT;
        if (fVar != fVar2 && fVarArr[0] == f.MATCH_PARENT) {
            int i10 = dVar5.f26532g;
            int iQ = hVar.q() - dVar4.f26532g;
            dVar5.f26534i = cVar.k(dVar5);
            dVar4.f26534i = cVar.k(dVar4);
            cVar.d(dVar5.f26534i, i10);
            cVar.d(dVar4.f26534i, iQ);
            gVar.f26562o = 2;
            gVar.Z = i10;
            int i11 = iQ - i10;
            gVar.V = i11;
            int i12 = gVar.f26541c0;
            if (i11 < i12) {
                gVar.V = i12;
            }
        }
        if (fVarArr2[1] == fVar2 || fVarArr[1] != f.MATCH_PARENT) {
            return;
        }
        int i13 = dVar3.f26532g;
        int iK = hVar.k() - dVar2.f26532g;
        dVar3.f26534i = cVar.k(dVar3);
        dVar2.f26534i = cVar.k(dVar2);
        cVar.d(dVar3.f26534i, i13);
        cVar.d(dVar2.f26534i, iK);
        if (gVar.f26539b0 > 0 || gVar.f26551h0 == 8) {
            x2.f fVarK = cVar.k(dVar);
            dVar.f26534i = fVarK;
            cVar.d(fVarK, gVar.f26539b0 + i13);
        }
        gVar.f26564p = 2;
        gVar.f26537a0 = i13;
        int i14 = iK - i13;
        gVar.W = i14;
        int i15 = gVar.f26543d0;
        if (i14 < i15) {
            gVar.W = i15;
        }
    }

    public static final boolean c(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
