package as;

/* loaded from: classes.dex */
public final class f extends br.n implements ar.k {
    public static final f B;
    public static final f D;
    public static final f E;

    /* renamed from: g, reason: collision with root package name */
    public static final f f2211g;

    /* renamed from: r, reason: collision with root package name */
    public static final f f2212r;

    /* renamed from: x, reason: collision with root package name */
    public static final f f2213x;

    /* renamed from: y, reason: collision with root package name */
    public static final f f2214y;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2215d;

    static {
        int i10 = 1;
        f2211g = new f(i10, 0);
        f2212r = new f(i10, 1);
        f2213x = new f(i10, 2);
        f2214y = new f(i10, 3);
        B = new f(i10, 4);
        D = new f(i10, 5);
        E = new f(i10, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, int i11) {
        super(i10);
        this.f2215d = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    @Override // ar.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f2215d
            r1 = 1
            r2 = 0
            java.lang.String r3 = "it"
            switch(r0) {
                case 0: goto Lc2;
                case 1: goto La2;
                case 2: goto L94;
                case 3: goto L8b;
                case 4: goto L79;
                case 5: goto L58;
                default: goto L9;
            }
        L9:
            rr.d r5 = (rr.d) r5
            br.l.e(r5, r3)
            boolean r0 = or.h.z(r5)
            if (r0 == 0) goto L52
            int r0 = as.g.f2216l
            java.util.Set r0 = as.j0.f2228e
            qs.g r3 = r5.getName()
            boolean r0 = r0.contains(r3)
            r3 = 0
            if (r0 != 0) goto L24
            goto L4f
        L24:
            as.f r0 = as.f.f2212r
            rr.d r5 = xs.d.b(r5, r0)
            if (r5 == 0) goto L4f
            java.lang.String r5 = i3.g.g(r5)
            if (r5 != 0) goto L33
            goto L4f
        L33:
            java.util.ArrayList r0 = as.j0.f2225b
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L3e
            as.h0 r3 = as.h0.ONE_COLLECTION_PARAMETER
            goto L4f
        L3e:
            java.util.LinkedHashMap r0 = as.j0.f2227d
            java.lang.Object r5 = mq.b0.O(r0, r5)
            as.i0 r5 = (as.i0) r5
            as.i0 r0 = as.i0.NULL
            if (r5 != r0) goto L4d
            as.h0 r3 = as.h0.OBJECT_PARAMETER_GENERIC
            goto L4f
        L4d:
            as.h0 r3 = as.h0.OBJECT_PARAMETER_NON_GENERIC
        L4f:
            if (r3 == 0) goto L52
            goto L53
        L52:
            r1 = r2
        L53:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L58:
            rr.d r5 = (rr.d) r5
            br.l.e(r5, r3)
            int r0 = as.e.f2210l
            ur.k0 r5 = (ur.k0) r5
            boolean r0 = or.h.z(r5)
            if (r0 == 0) goto L73
            as.d r0 = new as.d
            r0.<init>(r2, r5)
            rr.d r5 = xs.d.b(r5, r0)
            if (r5 == 0) goto L73
            goto L74
        L73:
            r1 = r2
        L74:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L79:
            rr.d r5 = (rr.d) r5
            br.l.e(r5, r3)
            rr.d r5 = xs.d.k(r5)
            boolean r5 = xu.l.A(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L8b:
            ur.q0 r5 = (ur.q0) r5
            ur.r0 r5 = (ur.r0) r5
            ht.x r5 = r5.getType()
            return r5
        L94:
            rr.d r5 = (rr.d) r5
            br.l.e(r5, r3)
            boolean r5 = xu.l.A(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        La2:
            rr.d r5 = (rr.d) r5
            br.l.e(r5, r3)
            boolean r0 = r5 instanceof rr.u
            if (r0 == 0) goto Lbc
            int r0 = as.g.f2216l
            java.util.Set r0 = as.j0.f2229f
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r5 = i3.g.g(r5)
            boolean r5 = mq.o.k0(r0, r5)
            if (r5 == 0) goto Lbc
            goto Lbd
        Lbc:
            r1 = r2
        Lbd:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        Lc2:
            rr.d r5 = (rr.d) r5
            br.l.e(r5, r3)
            int r0 = as.g.f2216l
            java.util.Set r0 = as.j0.f2229f
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r5 = i3.g.g(r5)
            boolean r5 = mq.o.k0(r0, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: as.f.a(java.lang.Object):java.lang.Object");
    }
}
