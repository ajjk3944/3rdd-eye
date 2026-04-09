package jcifs.smb1.smb1;

/* loaded from: classes4.dex */
class S {

    /* renamed from: j, reason: collision with root package name */
    private static int f50486j;

    /* renamed from: a, reason: collision with root package name */
    int f50487a;

    /* renamed from: b, reason: collision with root package name */
    int f50488b;

    /* renamed from: c, reason: collision with root package name */
    String f50489c;

    /* renamed from: d, reason: collision with root package name */
    String f50490d;

    /* renamed from: e, reason: collision with root package name */
    String f50491e;

    /* renamed from: f, reason: collision with root package name */
    P f50492f;

    /* renamed from: g, reason: collision with root package name */
    boolean f50493g;

    /* renamed from: h, reason: collision with root package name */
    boolean f50494h;

    /* renamed from: i, reason: collision with root package name */
    int f50495i;

    S(P p10, String str, String str2) {
        this.f50490d = "?????";
        this.f50492f = p10;
        this.f50489c = str.toUpperCase();
        if (str2 != null && !str2.startsWith("??")) {
            this.f50490d = str2;
        }
        this.f50491e = this.f50490d;
        this.f50487a = 0;
    }

    boolean a(String str, String str2) {
        return this.f50489c.equalsIgnoreCase(str) && (str2 == null || str2.startsWith("??") || this.f50490d.equalsIgnoreCase(str2));
    }

    void b(AbstractC6278l abstractC6278l, AbstractC6278l abstractC6278l2) {
        String str;
        byte b10;
        synchronized (this.f50492f.f()) {
            if (abstractC6278l2 != null) {
                try {
                    abstractC6278l2.f50605q = false;
                } finally {
                }
            }
            c(abstractC6278l, abstractC6278l2);
            if (abstractC6278l != null && (abstractC6278l2 == null || !abstractC6278l2.f50605q)) {
                if (!this.f50490d.equals("A:") && (b10 = abstractC6278l.f50591c) != -94 && b10 != 4) {
                    if (b10 == 37 || b10 == 50) {
                        int i10 = ((C) abstractC6278l).f50286o1 & 255;
                        if (i10 != 0 && i10 != 16 && i10 != 35 && i10 != 38 && i10 != 104 && i10 != 215 && i10 != 83 && i10 != 84) {
                            throw new SmbException("Invalid operation for " + this.f50490d + " service");
                        }
                    } else if (b10 != 113) {
                        switch (b10) {
                            case 45:
                            case 46:
                            case 47:
                                break;
                            default:
                                throw new SmbException("Invalid operation for " + this.f50490d + " service" + abstractC6278l);
                        }
                    }
                }
                abstractC6278l.f50598j = this.f50488b;
                if (this.f50493g && !this.f50490d.equals("IPC") && (str = abstractC6278l.f50611w) != null && str.length() > 0) {
                    abstractC6278l.f50597i = 4096;
                    abstractC6278l.f50611w = '\\' + this.f50492f.f().f50448D + '\\' + this.f50489c + abstractC6278l.f50611w;
                }
                try {
                    this.f50492f.d(abstractC6278l, abstractC6278l2);
                } catch (SmbException e10) {
                    if (e10.d() == -1073741623) {
                        d(true);
                    }
                    throw e10;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        r7.f50487a = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        r7.f50492f.f50437h.n();
        r2 = "\\\\" + r7.f50492f.f50437h.f50448D + '\\' + r7.f50489c;
        r7.f50490d = r7.f50491e;
        r4 = r7.f50492f.f50437h;
        r4 = jcifs.smb1.smb1.Q.f50441E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (Ug.e.f22464b < 4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        jcifs.smb1.smb1.Q.f50443G.println("treeConnect: unc=" + r2 + ",service=" + r7.f50490d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        r4 = new jcifs.smb1.smb1.F(r9);
        r7.f50492f.d(new jcifs.smb1.smb1.E(r7.f50492f, r2, r7.f50490d, r8), r4);
        r7.f50488b = r4.f50598j;
        r7.f50490d = r4.f50330G;
        r7.f50493g = r4.f50329F;
        r8 = jcifs.smb1.smb1.S.f50486j;
        jcifs.smb1.smb1.S.f50486j = r8 + 1;
        r7.f50495i = r8;
        r7.f50487a = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        d(true);
        r7.f50487a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        throw r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void c(jcifs.smb1.smb1.AbstractC6278l r8, jcifs.smb1.smb1.AbstractC6278l r9) {
        /*
            r7 = this;
            r0 = 1
            jcifs.smb1.smb1.P r1 = r7.f50492f
            jcifs.smb1.smb1.Q r1 = r1.f()
            monitor-enter(r1)
        L8:
            int r2 = r7.f50487a     // Catch: java.lang.Throwable -> L1b
            r3 = 2
            if (r2 == 0) goto L2b
            if (r2 == r3) goto L29
            r3 = 3
            if (r2 != r3) goto L13
            goto L29
        L13:
            jcifs.smb1.smb1.P r2 = r7.f50492f     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1e
            jcifs.smb1.smb1.Q r2 = r2.f50437h     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1e
            r2.wait()     // Catch: java.lang.Throwable -> L1b java.lang.InterruptedException -> L1e
            goto L8
        L1b:
            r8 = move-exception
            goto Lb9
        L1e:
            r8 = move-exception
            jcifs.smb1.smb1.SmbException r9 = new jcifs.smb1.smb1.SmbException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r8.getMessage()     // Catch: java.lang.Throwable -> L1b
            r9.<init>(r0, r8)     // Catch: java.lang.Throwable -> L1b
            throw r9     // Catch: java.lang.Throwable -> L1b
        L29:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            return
        L2b:
            r7.f50487a = r0     // Catch: java.lang.Throwable -> L1b
            jcifs.smb1.smb1.P r2 = r7.f50492f     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            jcifs.smb1.smb1.Q r2 = r2.f50437h     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r2.n()     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r2.<init>()     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            java.lang.String r4 = "\\\\"
            r2.append(r4)     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            jcifs.smb1.smb1.P r4 = r7.f50492f     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            jcifs.smb1.smb1.Q r4 = r4.f50437h     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            java.lang.String r4 = r4.f50448D     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r2.append(r4)     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r4 = 92
            r2.append(r4)     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            java.lang.String r4 = r7.f50489c     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r2.append(r4)     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            java.lang.String r4 = r7.f50491e     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r7.f50490d = r4     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            jcifs.smb1.smb1.P r4 = r7.f50492f     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            jcifs.smb1.smb1.Q r4 = r4.f50437h     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            byte[] r4 = jcifs.smb1.smb1.Q.f50441E     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            int r4 = Ug.e.f22464b     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r5 = 4
            if (r4 < r5) goto L87
            Ug.e r4 = jcifs.smb1.smb1.Q.f50443G     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r5.<init>()     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            java.lang.String r6 = "treeConnect: unc="
            r5.append(r6)     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r5.append(r2)     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            java.lang.String r6 = ",service="
            r5.append(r6)     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            java.lang.String r6 = r7.f50490d     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r5.append(r6)     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r4.println(r5)     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            goto L87
        L85:
            r8 = move-exception
            goto Lb2
        L87:
            jcifs.smb1.smb1.F r4 = new jcifs.smb1.smb1.F     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            jcifs.smb1.smb1.E r9 = new jcifs.smb1.smb1.E     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            jcifs.smb1.smb1.P r5 = r7.f50492f     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            java.lang.String r6 = r7.f50490d     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r9.<init>(r5, r2, r6, r8)     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            jcifs.smb1.smb1.P r8 = r7.f50492f     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r8.d(r9, r4)     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            int r8 = r4.f50598j     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r7.f50488b = r8     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            java.lang.String r8 = r4.f50330G     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r7.f50490d = r8     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            boolean r8 = r4.f50329F     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r7.f50493g = r8     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            int r8 = jcifs.smb1.smb1.S.f50486j     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            int r9 = r8 + 1
            jcifs.smb1.smb1.S.f50486j = r9     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r7.f50495i = r8     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            r7.f50487a = r3     // Catch: java.lang.Throwable -> L1b jcifs.smb1.smb1.SmbException -> L85
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            return
        Lb2:
            r7.d(r0)     // Catch: java.lang.Throwable -> L1b
            r9 = 0
            r7.f50487a = r9     // Catch: java.lang.Throwable -> L1b
            throw r8     // Catch: java.lang.Throwable -> L1b
        Lb9:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jcifs.smb1.smb1.S.c(jcifs.smb1.smb1.l, jcifs.smb1.smb1.l):void");
    }

    void d(boolean z10) {
        synchronized (this.f50492f.f()) {
            try {
                if (this.f50487a != 2) {
                    return;
                }
                this.f50487a = 3;
                if (!z10 && this.f50488b != 0) {
                    try {
                        b(new G(), null);
                    } catch (SmbException e10) {
                        Q q10 = this.f50492f.f50437h;
                        byte[] bArr = Q.f50441E;
                        if (Ug.e.f22464b > 1) {
                            e10.printStackTrace(Q.f50443G);
                        }
                    }
                }
                this.f50493g = false;
                this.f50494h = false;
                this.f50487a = 0;
                this.f50492f.f50437h.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return a(s10.f50489c, s10.f50490d);
    }

    public String toString() {
        return "SmbTree[share=" + this.f50489c + ",service=" + this.f50490d + ",tid=" + this.f50488b + ",inDfs=" + this.f50493g + ",inDomainDfs=" + this.f50494h + ",connectionState=" + this.f50487a + "]";
    }
}
