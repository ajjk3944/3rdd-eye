package js;

import java.util.Set;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f13802b = i3.g.H(ks.b.CLASS);

    /* renamed from: c, reason: collision with root package name */
    public static final Set f13803c = mq.l.B0(new ks.b[]{ks.b.FILE_FACADE, ks.b.MULTIFILE_CLASS_PART});

    /* renamed from: d, reason: collision with root package name */
    public static final ps.f f13804d;

    /* renamed from: e, reason: collision with root package name */
    public static final ps.f f13805e;

    /* renamed from: a, reason: collision with root package name */
    public dt.k f13806a;

    static {
        new ps.f(new int[]{1, 1, 2}, false);
        f13804d = new ps.f(new int[]{1, 1, 11}, false);
        f13805e = new ps.f(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ft.r a(rr.f0 r17, wr.b r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r18
            java.lang.String r3 = "Could not read data from "
            java.lang.String r0 = "kotlinClass"
            br.l.e(r2, r0)
            ks.c r0 = r2.f24589b
            java.lang.Object r4 = r0.f14491e
            java.lang.String[] r4 = (java.lang.String[]) r4
            if (r4 != 0) goto L17
            java.lang.Object r4 = r0.f14492f
            java.lang.String[] r4 = (java.lang.String[]) r4
        L17:
            r5 = 0
            if (r4 == 0) goto L27
            java.lang.Object r6 = r0.f14489c
            ks.b r6 = (ks.b) r6
            java.util.Set r7 = js.g.f13803c
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L27
            goto L28
        L27:
            r4 = r5
        L28:
            if (r4 != 0) goto L2b
            goto L74
        L2b:
            java.lang.Object r6 = r0.f14490d
            r11 = r6
            ps.f r11 = (ps.f) r11
            java.lang.Object r0 = r0.f14493g
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L37
            goto L74
        L37:
            lq.l r0 = ps.i.h(r4, r0)     // Catch: java.lang.Throwable -> L3c rs.t -> L3e
            goto L72
        L3c:
            r0 = move-exception
            goto L55
        L3e:
            r0 = move-exception
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r2.a()     // Catch: java.lang.Throwable -> L3c
            r6.append(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L3c
            r4.<init>(r3, r0)     // Catch: java.lang.Throwable -> L3c
            throw r4     // Catch: java.lang.Throwable -> L3c
        L55:
            dt.k r3 = r1.c()
            dt.l r3 = r3.f7495c
            r3.getClass()
            dt.k r3 = r1.c()
            dt.l r3 = r3.f7495c
            java.lang.String r4 = "<this>"
            br.l.e(r3, r4)
            ps.f r3 = ps.f.f20634g
            boolean r3 = r11.b(r3)
            if (r3 != 0) goto Lb2
            r0 = r5
        L72:
            if (r0 != 0) goto L75
        L74:
            return r5
        L75:
            java.lang.Object r3 = r0.f15571a
            r10 = r3
            ps.g r10 = (ps.g) r10
            java.lang.Object r0 = r0.f15572d
            r9 = r0
            ls.c0 r9 = (ls.c0) r9
            js.i r12 = new js.i
            r1.d(r2)
            r1.e(r2)
            ft.j r0 = r1.b(r2)
            r12.<init>(r2, r9, r10, r0)
            ft.r r7 = new ft.r
            dt.k r13 = r1.c()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "scope for "
            r0.<init>(r2)
            r0.append(r12)
            java.lang.String r2 = " in "
            r0.append(r2)
            r8 = r17
            r0.append(r8)
            java.lang.String r14 = r0.toString()
            js.f r15 = js.f.f13801d
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            return r7
        Lb2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: js.g.a(rr.f0, wr.b):ft.r");
    }

    public final ft.j b(wr.b bVar) {
        c().f7495c.getClass();
        int i10 = bVar.f24589b.f14488b;
        return ((i10 & 64) == 0 || (i10 & 32) != 0) ? ((i10 & 16) == 0 || (i10 & 32) != 0) ? ft.j.STABLE : ft.j.IR_UNSTABLE : ft.j.FIR_UNSTABLE;
    }

    public final dt.k c() {
        dt.k kVar = this.f13806a;
        if (kVar != null) {
            return kVar;
        }
        br.l.l("components");
        throw null;
    }

    public final dt.o d(wr.b bVar) {
        c().f7495c.getClass();
        ps.f fVar = (ps.f) bVar.f24589b.f14490d;
        br.l.e(c().f7495c, "<this>");
        ps.f fVar2 = ps.f.f20634g;
        if (fVar.b(fVar2)) {
            return null;
        }
        ps.f fVar3 = (ps.f) bVar.f24589b.f14490d;
        br.l.e(c().f7495c, "<this>");
        br.l.e(c().f7495c, "<this>");
        boolean z10 = fVar3.f20636f;
        fVar2.getClass();
        ps.f fVar4 = z10 ? fVar2 : ps.f.f20635h;
        int i10 = fVar4.f18520b;
        int i11 = fVar2.f18520b;
        return new dt.o(fVar3, fVar2, fVar2, (i10 <= i11 && (i10 < i11 || fVar4.f18521c <= fVar2.f18521c)) ? fVar2 : fVar4, bVar.a(), xr.d.a(bVar.f24588a));
    }

    public final boolean e(wr.b bVar) {
        c().f7495c.getClass();
        c().f7495c.getClass();
        ks.c cVar = bVar.f24589b;
        return (cVar.f14488b & 2) != 0 && ((ps.f) cVar.f14490d).equals(f13804d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final dt.f f(wr.b r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Could not read data from "
            ks.c r1 = r7.f24589b
            java.lang.Object r2 = r1.f14491e
            java.lang.String[] r2 = (java.lang.String[]) r2
            if (r2 != 0) goto Le
            java.lang.Object r2 = r1.f14492f
            java.lang.String[] r2 = (java.lang.String[]) r2
        Le:
            r3 = 0
            if (r2 == 0) goto L1e
            java.lang.Object r4 = r1.f14489c
            ks.b r4 = (ks.b) r4
            java.util.Set r5 = js.g.f13802b
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L1e
            goto L1f
        L1e:
            r2 = r3
        L1f:
            if (r2 != 0) goto L22
            goto L6a
        L22:
            java.lang.Object r4 = r1.f14490d
            ps.f r4 = (ps.f) r4
            java.lang.Object r1 = r1.f14493g
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r1 != 0) goto L2d
            goto L6a
        L2d:
            lq.l r0 = ps.i.f(r2, r1)     // Catch: java.lang.Throwable -> L32 rs.t -> L34
            goto L68
        L32:
            r0 = move-exception
            goto L4b
        L34:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r7.a()     // Catch: java.lang.Throwable -> L32
            r5.append(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L32
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L4b:
            dt.k r1 = r6.c()
            dt.l r1 = r1.f7495c
            r1.getClass()
            dt.k r1 = r6.c()
            dt.l r1 = r1.f7495c
            java.lang.String r2 = "<this>"
            br.l.e(r1, r2)
            ps.f r1 = ps.f.f20634g
            boolean r1 = r4.b(r1)
            if (r1 != 0) goto L88
            r0 = r3
        L68:
            if (r0 != 0) goto L6b
        L6a:
            return r3
        L6b:
            java.lang.Object r1 = r0.f15571a
            ps.g r1 = (ps.g) r1
            java.lang.Object r0 = r0.f15572d
            ls.j r0 = (ls.j) r0
            js.r r2 = new js.r
            r6.d(r7)
            r6.e(r7)
            ft.j r3 = r6.b(r7)
            r2.<init>(r7, r3)
            dt.f r7 = new dt.f
            r7.<init>(r1, r0, r4, r2)
            return r7
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: js.g.f(wr.b):dt.f");
    }
}
