package h9;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int f10352a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10353b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10354c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10355d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10356e;

    public i(int i10, int i11, boolean z10, boolean z11, String str) {
        this.f10352a = i10;
        this.f10353b = i11;
        this.f10354c = z10;
        this.f10355d = z11;
        this.f10356e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065 A[RETURN] */
    @Override // h9.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(h9.o1 r8) {
        /*
            r7 = this;
            boolean r0 = r7.f10355d
            java.lang.String r1 = r7.f10356e
            if (r0 == 0) goto Lc
            if (r1 != 0) goto Lc
            java.lang.String r1 = r8.o()
        Lc:
            h9.m1 r0 = r8.f10462b
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3c
            java.util.List r0 = r0.f()
            java.util.Iterator r0 = r0.iterator()
            r4 = r2
            r5 = r4
        L1c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L3e
            java.lang.Object r6 = r0.next()
            h9.q1 r6 = (h9.q1) r6
            h9.o1 r6 = (h9.o1) r6
            if (r6 != r8) goto L2d
            r4 = r5
        L2d:
            if (r1 == 0) goto L39
            java.lang.String r6 = r6.o()
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L1c
        L39:
            int r5 = r5 + 1
            goto L1c
        L3c:
            r4 = r2
            r5 = r3
        L3e:
            boolean r8 = r7.f10354c
            if (r8 == 0) goto L44
            int r4 = r4 + r3
            goto L46
        L44:
            int r4 = r5 - r4
        L46:
            int r8 = r7.f10352a
            int r0 = r7.f10353b
            if (r8 != 0) goto L4f
            if (r4 != r0) goto L65
            goto L64
        L4f:
            int r4 = r4 - r0
            int r0 = r4 % r8
            if (r0 != 0) goto L65
            int r0 = java.lang.Integer.signum(r4)
            if (r0 == 0) goto L64
            int r0 = java.lang.Integer.signum(r4)
            int r8 = java.lang.Integer.signum(r8)
            if (r0 != r8) goto L65
        L64:
            return r3
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.i.a(h9.o1):boolean");
    }

    public final String toString() {
        String str = this.f10354c ? "" : "last-";
        boolean z10 = this.f10355d;
        int i10 = this.f10353b;
        int i11 = this.f10352a;
        return z10 ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i11), Integer.valueOf(i10), this.f10356e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i11), Integer.valueOf(i10));
    }
}
