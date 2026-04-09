package jj;

/* loaded from: classes.dex */
public final class q0 extends ik.a {

    /* renamed from: b, reason: collision with root package name */
    public final r0 f13751b;

    /* renamed from: c, reason: collision with root package name */
    public final xi.g f13752c;

    /* renamed from: d, reason: collision with root package name */
    public final et.d f13753d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f13754e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, xi.g gVar, et.d dVar) {
        super(gVar);
        br.l.e(r0Var, "wifiConnectedTriggerType");
        this.f13751b = r0Var;
        this.f13752c = gVar;
        this.f13753d = dVar;
        this.f13754e = r0Var.getTriggerType();
    }

    @Override // ik.a
    public final o0 a() {
        return this.f13754e;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3 A[RETURN] */
    @Override // ik.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(hk.h r7) {
        /*
            r6 = this;
            java.lang.String r0 = "task"
            br.l.e(r7, r0)
            int[] r0 = jj.p0.f13746a
            jj.r0 r1 = r6.f13751b
            int r1 = r1.ordinal()
            r0 = r0[r1]
            xi.g r1 = r6.f13752c
            r2 = 0
            r3 = 1
            if (r0 == r3) goto La8
            r4 = 2
            if (r0 == r4) goto L2d
            r7 = 3
            if (r0 != r7) goto L27
            al.b r7 = r1.f25329r
            ak.e1 r7 = r7.g(r3, r3)
            ak.e1 r0 = ak.e1.DISCONNECTED
            if (r7 != r0) goto Lb3
            goto Lb2
        L27:
            bf.n r7 = new bf.n
            r7.<init>()
            throw r7
        L2d:
            et.d r0 = r6.f13753d
            if (r0 == 0) goto Lb3
            al.b r0 = r1.f25329r
            ak.e1 r0 = r0.g(r3, r3)
            ak.e1 r4 = ak.e1.CONNECTED
            if (r0 != r4) goto L3d
            r0 = r3
            goto L3e
        L3d:
            r0 = r2
        L3e:
            al.b r1 = r1.f25329r
            java.lang.Object r1 = r1.f809a
            h9.r2 r1 = (h9.r2) r1
            java.lang.String r1 = r1.w0()
            java.lang.String r7 = r7.D
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Checking if wifiSsid: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r5 = " matches regex: "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "WifiSsidMatcher"
            ch.n.b(r5, r4)
            if (r1 == 0) goto La2
            int r4 = r1.length()
            if (r4 != 0) goto L72
            goto La2
        L72:
            if (r7 == 0) goto La2
            int r4 = r7.length()
            if (r4 != 0) goto L7b
            goto La2
        L7b:
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7)
            java.lang.String r4 = "compile(...)"
            br.l.d(r7, r4)
            java.util.regex.Matcher r7 = r7.matcher(r1)
            boolean r7 = r7.matches()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "wifiMatch: "
            r1.<init>(r4)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            ch.n.b(r5, r1)
            goto La3
        La2:
            r7 = r2
        La3:
            if (r0 == 0) goto Lb3
            if (r7 == 0) goto Lb3
            goto Lb2
        La8:
            al.b r7 = r1.f25329r
            ak.e1 r7 = r7.g(r3, r3)
            ak.e1 r0 = ak.e1.CONNECTED
            if (r7 != r0) goto Lb3
        Lb2:
            return r3
        Lb3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.q0.b(hk.h):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!q0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        br.l.c(obj, "null cannot be cast to non-null type com.opensignal.sdk.data.trigger.WifiConnectedTrigger");
        q0 q0Var = (q0) obj;
        return this.f13751b == q0Var.f13751b && br.l.a(this.f13752c, q0Var.f13752c) && this.f13754e == q0Var.f13754e && br.l.a(this.f13753d, q0Var.f13753d);
    }

    public final int hashCode() {
        int iHashCode = (this.f13752c.hashCode() + ((this.f13754e.hashCode() + (this.f13751b.hashCode() * 31)) * 31)) * 31;
        et.d dVar = this.f13753d;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
