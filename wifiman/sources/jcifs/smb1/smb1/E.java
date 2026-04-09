package jcifs.smb1.smb1;

/* loaded from: classes4.dex */
class E extends AbstractC6268b {

    /* renamed from: N, reason: collision with root package name */
    private static final boolean f50320N = Rg.a.a("jcifs.smb1.smb.client.disablePlainTextPasswords", true);

    /* renamed from: X, reason: collision with root package name */
    private static byte[] f50321X = {1, 1, 1, 1, 1, 1, 1, 1, 0};

    /* renamed from: E, reason: collision with root package name */
    private P f50322E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f50323F;

    /* renamed from: G, reason: collision with root package name */
    private String f50324G;

    /* renamed from: H, reason: collision with root package name */
    private byte[] f50325H;

    /* renamed from: I, reason: collision with root package name */
    private int f50326I;

    /* renamed from: J, reason: collision with root package name */
    String f50327J;

    static {
        String strG = Rg.a.g("jcifs.smb1.smb.client.TreeConnectAndX.CheckDirectory");
        if (strG != null) {
            f50321X[0] = Byte.parseByte(strG);
        }
        String strG2 = Rg.a.g("jcifs.smb1.smb.client.TreeConnectAndX.CreateDirectory");
        if (strG2 != null) {
            f50321X[2] = Byte.parseByte(strG2);
        }
        String strG3 = Rg.a.g("jcifs.smb1.smb.client.TreeConnectAndX.Delete");
        if (strG3 != null) {
            f50321X[3] = Byte.parseByte(strG3);
        }
        String strG4 = Rg.a.g("jcifs.smb1.smb.client.TreeConnectAndX.DeleteDirectory");
        if (strG4 != null) {
            f50321X[4] = Byte.parseByte(strG4);
        }
        String strG5 = Rg.a.g("jcifs.smb1.smb.client.TreeConnectAndX.OpenAndX");
        if (strG5 != null) {
            f50321X[5] = Byte.parseByte(strG5);
        }
        String strG6 = Rg.a.g("jcifs.smb1.smb.client.TreeConnectAndX.Rename");
        if (strG6 != null) {
            f50321X[6] = Byte.parseByte(strG6);
        }
        String strG7 = Rg.a.g("jcifs.smb1.smb.client.TreeConnectAndX.Transaction");
        if (strG7 != null) {
            f50321X[7] = Byte.parseByte(strG7);
        }
        String strG8 = Rg.a.g("jcifs.smb1.smb.client.TreeConnectAndX.QueryInformation");
        if (strG8 != null) {
            f50321X[8] = Byte.parseByte(strG8);
        }
    }

    E(P p10, String str, String str2, AbstractC6278l abstractC6278l) {
        super(abstractC6278l);
        this.f50323F = false;
        this.f50322E = p10;
        this.f50327J = str;
        this.f50324G = str2;
        this.f50591c = (byte) 117;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    @Override // jcifs.smb1.smb1.AbstractC6278l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    int A(byte[] r6, int r7) {
        /*
            r5 = this;
            jcifs.smb1.smb1.P r0 = r5.f50322E
            jcifs.smb1.smb1.Q r1 = r0.f50437h
            jcifs.smb1.smb1.Q$a r1 = r1.f50463v
            int r1 = r1.f50474g
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L5a
            jcifs.smb1.smb1.k r0 = r0.f50438i
            boolean r1 = r0.f50586f
            if (r1 != 0) goto L1a
            java.lang.String r0 = r0.f50583c
            int r0 = r0.length()
            if (r0 <= 0) goto L5a
        L1a:
            jcifs.smb1.smb1.P r0 = r5.f50322E
            jcifs.smb1.smb1.Q r1 = r0.f50437h
            jcifs.smb1.smb1.Q$a r1 = r1.f50463v
            boolean r4 = r1.f50475h
            if (r4 == 0) goto L32
            jcifs.smb1.smb1.k r0 = r0.f50438i
            byte[] r1 = r1.f50483p
            byte[] r0 = r0.d(r1)
            r5.f50325H = r0
            int r0 = r0.length
            r5.f50326I = r0
            goto L5c
        L32:
            boolean r1 = jcifs.smb1.smb1.E.f50320N
            if (r1 != 0) goto L52
            jcifs.smb1.smb1.k r0 = r0.f50438i
            java.lang.String r0 = r0.f50583c
            int r0 = r0.length()
            int r0 = r0 + r3
            int r0 = r0 * 2
            byte[] r0 = new byte[r0]
            r5.f50325H = r0
            jcifs.smb1.smb1.P r1 = r5.f50322E
            jcifs.smb1.smb1.k r1 = r1.f50438i
            java.lang.String r1 = r1.f50583c
            int r0 = r5.B(r1, r0, r2)
            r5.f50326I = r0
            goto L5c
        L52:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Plain text passwords are disabled"
            r6.<init>(r7)
            throw r6
        L5a:
            r5.f50326I = r3
        L5c:
            int r0 = r7 + 1
            boolean r1 = r5.f50323F
            r6[r7] = r1
            int r7 = r7 + 2
            r6[r0] = r2
            int r0 = r5.f50326I
            long r0 = (long) r0
            jcifs.smb1.smb1.AbstractC6278l.x(r0, r6, r7)
            r6 = 4
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jcifs.smb1.smb1.E.A(byte[], int):int");
    }

    @Override // jcifs.smb1.smb1.AbstractC6268b
    int E(byte b10) {
        int i10 = b10 & 255;
        if (i10 == 0) {
            return f50321X[2];
        }
        if (i10 == 1) {
            return f50321X[4];
        }
        if (i10 == 6) {
            return f50321X[3];
        }
        if (i10 == 7) {
            return f50321X[6];
        }
        if (i10 == 8) {
            return f50321X[8];
        }
        if (i10 == 16) {
            return f50321X[0];
        }
        if (i10 == 37) {
            return f50321X[7];
        }
        if (i10 != 45) {
            return 0;
        }
        return f50321X[5];
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int h(byte[] bArr, int i10) {
        return 0;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int m(byte[] bArr, int i10) {
        return 0;
    }

    @Override // jcifs.smb1.smb1.AbstractC6268b, jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("SmbComTreeConnectAndX[" + super.toString() + ",disconnectTid=" + this.f50323F + ",passwordLength=" + this.f50326I + ",password=" + Ug.d.d(this.f50325H, this.f50326I, 0) + ",path=" + this.f50327J + ",service=" + this.f50324G + "]");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // jcifs.smb1.smb1.AbstractC6278l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    int v(byte[] r5, int r6) {
        /*
            r4 = this;
            jcifs.smb1.smb1.P r0 = r4.f50322E
            jcifs.smb1.smb1.Q r1 = r0.f50437h
            jcifs.smb1.smb1.Q$a r1 = r1.f50463v
            int r1 = r1.f50474g
            r2 = 0
            if (r1 != 0) goto L24
            jcifs.smb1.smb1.k r0 = r0.f50438i
            boolean r1 = r0.f50586f
            if (r1 != 0) goto L19
            java.lang.String r0 = r0.f50583c
            int r0 = r0.length()
            if (r0 <= 0) goto L24
        L19:
            byte[] r0 = r4.f50325H
            int r1 = r4.f50326I
            java.lang.System.arraycopy(r0, r2, r5, r6, r1)
            int r0 = r4.f50326I
            int r0 = r0 + r6
            goto L28
        L24:
            int r0 = r6 + 1
            r5[r6] = r2
        L28:
            java.lang.String r1 = r4.f50327J
            int r1 = r4.B(r1, r5, r0)
            int r0 = r0 + r1
            java.lang.String r1 = r4.f50324G     // Catch: java.io.UnsupportedEncodingException -> L4d
            java.lang.String r3 = "ASCII"
            byte[] r1 = r1.getBytes(r3)     // Catch: java.io.UnsupportedEncodingException -> L4d
            java.lang.String r3 = r4.f50324G     // Catch: java.io.UnsupportedEncodingException -> L4d
            int r3 = r3.length()     // Catch: java.io.UnsupportedEncodingException -> L4d
            java.lang.System.arraycopy(r1, r2, r5, r0, r3)     // Catch: java.io.UnsupportedEncodingException -> L4d
            java.lang.String r1 = r4.f50324G
            int r1 = r1.length()
            int r0 = r0 + r1
            int r1 = r0 + 1
            r5[r0] = r2
            int r1 = r1 - r6
            return r1
        L4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jcifs.smb1.smb1.E.v(byte[], int):int");
    }
}
