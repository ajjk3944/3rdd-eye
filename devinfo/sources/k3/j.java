package k3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f27923a = new boolean[3];

    /* JADX WARN: Removed duplicated region for block: B:188:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x06f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(k3.e r40, i3.c r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instructions count: 1791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.j.a(k3.e, i3.c, java.util.ArrayList, int):void");
    }

    public static void b(e eVar, i3.c cVar, d dVar) {
        dVar.f27865o = -1;
        c cVar2 = dVar.M;
        int[] iArr = dVar.f27868p0;
        c cVar3 = dVar.L;
        c cVar4 = dVar.J;
        c cVar5 = dVar.K;
        c cVar6 = dVar.I;
        dVar.f27867p = -1;
        int[] iArr2 = eVar.f27868p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i4 = cVar6.g;
            int iQ = eVar.q() - cVar5.g;
            cVar6.f27838i = cVar.k(cVar6);
            cVar5.f27838i = cVar.k(cVar5);
            cVar.d(cVar6.f27838i, i4);
            cVar.d(cVar5.f27838i, iQ);
            dVar.f27865o = 2;
            dVar.Y = i4;
            int i10 = iQ - i4;
            dVar.U = i10;
            int i11 = dVar.f27842b0;
            if (i10 < i11) {
                dVar.U = i11;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i12 = cVar4.g;
        int iK = eVar.k() - cVar3.g;
        cVar4.f27838i = cVar.k(cVar4);
        cVar3.f27838i = cVar.k(cVar3);
        cVar.d(cVar4.f27838i, i12);
        cVar.d(cVar3.f27838i, iK);
        if (dVar.f27840a0 > 0 || dVar.f27851g0 == 8) {
            i3.f fVarK = cVar.k(cVar2);
            cVar2.f27838i = fVarK;
            cVar.d(fVarK, dVar.f27840a0 + i12);
        }
        dVar.f27867p = 2;
        dVar.Z = i12;
        int i13 = iK - i12;
        dVar.V = i13;
        int i14 = dVar.f27844c0;
        if (i13 < i14) {
            dVar.V = i14;
        }
    }

    public static final boolean c(int i4, int i10) {
        return (i4 & i10) == i10;
    }
}
