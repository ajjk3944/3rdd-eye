package is;

import ht.x;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static h7.g c(ht.b0 r18, c7.b r19, int r20, is.o r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: is.c.c(ht.b0, c7.b, int, is.o, boolean, boolean):h7.g");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ag.b d(ht.c1 r9, c7.b r10, int r11, boolean r12) {
        /*
            boolean r0 = ht.c.i(r9)
            r1 = 0
            if (r0 == 0) goto Lf
            ag.b r9 = new ag.b
            r10 = 1
            r11 = 5
            r9.<init>(r10, r11, r1)
            return r9
        Lf:
            boolean r0 = r9 instanceof ht.r
            if (r0 == 0) goto L79
            boolean r6 = r9 instanceof fs.h
            r0 = r9
            ht.r r0 = (ht.r) r0
            ht.b0 r8 = r0.f10939g
            ht.b0 r2 = r0.f10938d
            is.o r5 = is.o.FLEXIBLE_LOWER
            r3 = r10
            r4 = r11
            r7 = r12
            h7.g r10 = c(r2, r3, r4, r5, r6, r7)
            r11 = r2
            ht.b0 r2 = r0.f10939g
            is.o r5 = is.o.FLEXIBLE_UPPER
            h7.g r12 = c(r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r12.f10068c
            ht.b0 r0 = (ht.b0) r0
            java.lang.Object r2 = r10.f10068c
            ht.b0 r2 = (ht.b0) r2
            if (r2 != 0) goto L3b
            if (r0 != 0) goto L3b
            goto L70
        L3b:
            boolean r1 = r10.f10067b
            if (r1 != 0) goto L5f
            boolean r12 = r12.f10067b
            if (r12 == 0) goto L44
            goto L5f
        L44:
            if (r6 == 0) goto L53
            fs.h r1 = new fs.h
            if (r2 != 0) goto L4b
            r2 = r11
        L4b:
            if (r0 != 0) goto L4e
            goto L4f
        L4e:
            r8 = r0
        L4f:
            r1.<init>(r2, r8)
            goto L70
        L53:
            if (r2 != 0) goto L56
            r2 = r11
        L56:
            if (r0 != 0) goto L59
            goto L5a
        L59:
            r8 = r0
        L5a:
            ht.c1 r1 = ht.e.j(r2, r8)
            goto L70
        L5f:
            if (r0 == 0) goto L69
            if (r2 != 0) goto L64
            r2 = r0
        L64:
            ht.c1 r2 = ht.e.j(r2, r0)
            goto L6c
        L69:
            br.l.b(r2)
        L6c:
            ht.c1 r1 = ht.c.A(r9, r2)
        L70:
            ag.b r9 = new ag.b
            int r10 = r10.f10066a
            r11 = 5
            r9.<init>(r10, r11, r1)
            return r9
        L79:
            r3 = r10
            r4 = r11
            r7 = r12
            boolean r10 = r9 instanceof ht.b0
            if (r10 == 0) goto L9f
            r2 = r9
            ht.b0 r2 = (ht.b0) r2
            is.o r5 = is.o.INFLEXIBLE
            r6 = 0
            h7.g r10 = c(r2, r3, r4, r5, r6, r7)
            java.lang.Object r11 = r10.f10068c
            ht.b0 r11 = (ht.b0) r11
            ag.b r12 = new ag.b
            boolean r0 = r10.f10067b
            if (r0 == 0) goto L98
            ht.c1 r11 = ht.c.A(r9, r11)
        L98:
            int r9 = r10.f10066a
            r10 = 5
            r12.<init>(r9, r10, r11)
            return r12
        L9f:
            bf.n r9 = new bf.n
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: is.c.d(ht.c1, c7.b, int, boolean):ag.b");
    }

    public x a(cs.a aVar, rr.b bVar, boolean z10, cj.a aVar2, as.a aVar3, p pVar, boolean z11, ar.k kVar) {
        n nVar = new n(bVar, z10, aVar2, aVar3, false);
        x xVar = (x) kVar.a(aVar);
        Collection collectionP = aVar.p();
        br.l.d(collectionP, "overriddenDescriptors");
        Collection<rr.d> collection = collectionP;
        ArrayList arrayList = new ArrayList(mq.p.a0(collection, 10));
        for (rr.d dVar : collection) {
            br.l.d(dVar, "it");
            arrayList.add((x) kVar.a(dVar));
        }
        return b(nVar, xVar, arrayList, pVar, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ht.x b(is.n r28, ht.x r29, java.util.List r30, is.p r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: is.c.b(is.n, ht.x, java.util.List, is.p, boolean):ht.x");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f3  */
    /* JADX WARN: Type inference failed for: r22v0, types: [is.c] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [rr.b, rr.d, rr.l] */
    /* JADX WARN: Type inference failed for: r5v6, types: [cs.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList e(cj.a r23, java.util.Collection r24) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: is.c.e(cj.a, java.util.Collection):java.util.ArrayList");
    }
}
