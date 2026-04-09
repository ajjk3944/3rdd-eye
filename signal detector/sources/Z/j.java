package z;

import x.C2982c;
import x.C2985f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f24437a = new boolean[3];

    /* JADX WARN: Removed duplicated region for block: B:188:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x06e4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(z.e r40, x.C2982c r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instructions count: 1779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.j.a(z.e, x.c, java.util.ArrayList, int):void");
    }

    public static void b(e eVar, C2982c c2982c, d dVar) {
        dVar.f24343o = -1;
        c cVar = dVar.M;
        int[] iArr = dVar.f24346p0;
        c cVar2 = dVar.f24303L;
        c cVar3 = dVar.f24301J;
        c cVar4 = dVar.f24302K;
        c cVar5 = dVar.f24300I;
        dVar.f24345p = -1;
        if (eVar.f24346p0[0] != 2 && iArr[0] == 4) {
            int i = cVar5.f24290g;
            int iQ = eVar.q() - cVar4.f24290g;
            cVar5.i = c2982c.k(cVar5);
            cVar4.i = c2982c.k(cVar4);
            c2982c.d(cVar5.i, i);
            c2982c.d(cVar4.i, iQ);
            dVar.f24343o = 2;
            dVar.f24315Y = i;
            int i3 = iQ - i;
            dVar.f24311U = i3;
            int i6 = dVar.b0;
            if (i3 < i6) {
                dVar.f24311U = i6;
            }
        }
        if (eVar.f24346p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i7 = cVar3.f24290g;
        int iK = eVar.k() - cVar2.f24290g;
        cVar3.i = c2982c.k(cVar3);
        cVar2.i = c2982c.k(cVar2);
        c2982c.d(cVar3.i, i7);
        c2982c.d(cVar2.i, iK);
        if (dVar.f24318a0 > 0 || dVar.f24329g0 == 8) {
            C2985f c2985fK = c2982c.k(cVar);
            cVar.i = c2985fK;
            c2982c.d(c2985fK, dVar.f24318a0 + i7);
        }
        dVar.f24345p = 2;
        dVar.f24316Z = i7;
        int i8 = iK - i7;
        dVar.f24312V = i8;
        int i9 = dVar.f24321c0;
        if (i8 < i9) {
            dVar.f24312V = i9;
        }
    }

    public static final boolean c(int i, int i3) {
        return (i & i3) == i3;
    }
}
