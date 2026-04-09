package m;

import m.f;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    static boolean[] f2940a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ac, code lost:
    
        r4.j(r2, 1, r17.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b5, code lost:
    
        r4.i(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c2, code lost:
    
        if (r6 != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
    
        if (r6 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
    
        r7 = r17.D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ff, code lost:
    
        if (r6 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01aa, code lost:
    
        if (r6 != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec A[PHI: r7
  0x00ec: PHI (r7v26 int) = (r7v21 int), (r7v27 int), (r7v27 int) binds: [B:55:0x00e8, B:32:0x007b, B:27:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void a(int r16, m.f r17) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.k.a(int, m.f):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[PHI: r11 r12
  0x002c: PHI (r11v11 boolean) = (r11v1 boolean), (r11v13 boolean) binds: [B:21:0x003c, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x002c: PHI (r12v8 boolean) = (r12v1 boolean), (r12v10 boolean) binds: [B:21:0x003c, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[PHI: r11 r12
  0x002e: PHI (r11v3 boolean) = (r11v1 boolean), (r11v13 boolean) binds: [B:21:0x003c, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x002e: PHI (r12v3 boolean) = (r12v1 boolean), (r12v10 boolean) binds: [B:21:0x003c, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean b(m.g r22, l.e r23, int r24, int r25, m.d r26) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.k.b(m.g, l.e, int, int, m.d):boolean");
    }

    static void c(g gVar, l.e eVar, f fVar) {
        f.b bVar = gVar.E[0];
        f.b bVar2 = f.b.WRAP_CONTENT;
        if (bVar != bVar2 && fVar.E[0] == f.b.MATCH_PARENT) {
            int i2 = fVar.f2915u.f2854e;
            int iD = gVar.D() - fVar.f2917w.f2854e;
            e eVar2 = fVar.f2915u;
            eVar2.f2859j = eVar.r(eVar2);
            e eVar3 = fVar.f2917w;
            eVar3.f2859j = eVar.r(eVar3);
            eVar.f(fVar.f2915u.f2859j, i2);
            eVar.f(fVar.f2917w.f2859j, iD);
            fVar.f2878a = 2;
            fVar.f0(i2, iD);
        }
        if (gVar.E[1] == bVar2 || fVar.E[1] != f.b.MATCH_PARENT) {
            return;
        }
        int i3 = fVar.f2916v.f2854e;
        int iR = gVar.r() - fVar.f2918x.f2854e;
        e eVar4 = fVar.f2916v;
        eVar4.f2859j = eVar.r(eVar4);
        e eVar5 = fVar.f2918x;
        eVar5.f2859j = eVar.r(eVar5);
        eVar.f(fVar.f2916v.f2859j, i3);
        eVar.f(fVar.f2918x.f2859j, iR);
        if (fVar.U > 0 || fVar.C() == 8) {
            e eVar6 = fVar.f2919y;
            eVar6.f2859j = eVar.r(eVar6);
            eVar.f(fVar.f2919y.f2859j, fVar.U + i3);
        }
        fVar.f2880b = 2;
        fVar.t0(i3, iR);
    }

    private static boolean d(f fVar, int i2) {
        f.b[] bVarArr = fVar.E;
        if (bVarArr[i2] != f.b.MATCH_CONSTRAINT) {
            return false;
        }
        if (fVar.I != 0.0f) {
            f.b bVar = bVarArr[i2 != 0 ? (char) 0 : (char) 1];
            return false;
        }
        if (i2 == 0) {
            if (fVar.f2886e != 0 || fVar.f2892h != 0 || fVar.f2894i != 0) {
                return false;
            }
        } else if (fVar.f2888f != 0 || fVar.f2898k != 0 || fVar.f2900l != 0) {
            return false;
        }
        return true;
    }

    static void e(f fVar, int i2, int i3) {
        int i4 = i2 * 2;
        int i5 = i4 + 1;
        fVar.C[i4].f().f2945g = fVar.u().f2915u.f();
        fVar.C[i4].f().f2946h = i3;
        fVar.C[i4].f().f2956b = 1;
        fVar.C[i5].f().f2945g = fVar.C[i4].f();
        fVar.C[i5].f().f2946h = fVar.t(i2);
        fVar.C[i5].f().f2956b = 1;
    }
}
