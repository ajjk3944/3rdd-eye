package com.mbridge.msdk.thrid.okhttp;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    private static final g[] f17984e;

    /* renamed from: f, reason: collision with root package name */
    private static final g[] f17985f;

    /* renamed from: g, reason: collision with root package name */
    public static final j f17986g;

    /* renamed from: h, reason: collision with root package name */
    public static final j f17987h;

    /* renamed from: i, reason: collision with root package name */
    public static final j f17988i;

    /* renamed from: j, reason: collision with root package name */
    public static final j f17989j;

    /* renamed from: a, reason: collision with root package name */
    final boolean f17990a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f17991b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    final String[] f17992c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    final String[] f17993d;

    static {
        g gVar = g.f17585n1;
        g gVar2 = g.f17588o1;
        g gVar3 = g.f17591p1;
        g gVar4 = g.f17594q1;
        g gVar5 = g.f17597r1;
        g gVar6 = g.Z0;
        g gVar7 = g.f17555d1;
        g gVar8 = g.f17546a1;
        g gVar9 = g.f17558e1;
        g gVar10 = g.f17576k1;
        g gVar11 = g.f17573j1;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11};
        f17984e = gVarArr;
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, g.K0, g.L0, g.f17569i0, g.f17572j0, g.G, g.K, g.f17574k};
        f17985f = gVarArr2;
        a aVarA = new a(true).a(gVarArr);
        d0 d0Var = d0.TLS_1_3;
        d0 d0Var2 = d0.TLS_1_2;
        f17986g = aVarA.a(d0Var, d0Var2).a(true).a();
        a aVarA2 = new a(true).a(gVarArr2);
        d0 d0Var3 = d0.TLS_1_0;
        f17987h = aVarA2.a(d0Var, d0Var2, d0.TLS_1_1, d0Var3).a(true).a();
        f17988i = new a(true).a(gVarArr2).a(d0Var3).a(true).a();
        f17989j = new a(false).a();
    }

    public j(a aVar) {
        this.f17990a = aVar.f17994a;
        this.f17992c = aVar.f17995b;
        this.f17993d = aVar.f17996c;
        this.f17991b = aVar.f17997d;
    }

    @Nullable
    public List<g> a() {
        String[] strArr = this.f17992c;
        if (strArr != null) {
            return g.a(strArr);
        }
        return null;
    }

    public boolean b() {
        return this.f17990a;
    }

    public boolean c() {
        return this.f17991b;
    }

    @Nullable
    public List<d0> d() {
        String[] strArr = this.f17993d;
        if (strArr != null) {
            return d0.a(strArr);
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z10 = this.f17990a;
        if (z10 != jVar.f17990a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f17992c, jVar.f17992c) && Arrays.equals(this.f17993d, jVar.f17993d) && this.f17991b == jVar.f17991b);
    }

    public int hashCode() {
        if (this.f17990a) {
            return ((((Arrays.hashCode(this.f17992c) + 527) * 31) + Arrays.hashCode(this.f17993d)) * 31) + (!this.f17991b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f17990a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + (this.f17992c != null ? a().toString() : "[all enabled]") + ", tlsVersions=" + (this.f17993d != null ? d().toString() : "[all enabled]") + ", supportsTlsExtensions=" + this.f17991b + ")";
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f17994a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        String[] f17995b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        String[] f17996c;

        /* renamed from: d, reason: collision with root package name */
        boolean f17997d;

        public a(boolean z10) {
            this.f17994a = z10;
        }

        public a a(g... gVarArr) {
            if (!this.f17994a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[gVarArr.length];
            for (int i10 = 0; i10 < gVarArr.length; i10++) {
                strArr[i10] = gVarArr[i10].f17614a;
            }
            return a(strArr);
        }

        public a b(String... strArr) {
            if (!this.f17994a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f17996c = (String[]) strArr.clone();
            return this;
        }

        public a(j jVar) {
            this.f17994a = jVar.f17990a;
            this.f17995b = jVar.f17992c;
            this.f17996c = jVar.f17993d;
            this.f17997d = jVar.f17991b;
        }

        public a a(String... strArr) {
            if (this.f17994a) {
                if (strArr.length != 0) {
                    this.f17995b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a a(d0... d0VarArr) {
            if (this.f17994a) {
                String[] strArr = new String[d0VarArr.length];
                for (int i10 = 0; i10 < d0VarArr.length; i10++) {
                    strArr[i10] = d0VarArr[i10].f17536a;
                }
                return b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a a(boolean z10) {
            if (this.f17994a) {
                this.f17997d = z10;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public j a() {
            return new j(this);
        }
    }

    private j b(SSLSocket sSLSocket, boolean z10) {
        String[] strArrA = this.f17992c != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(g.f17547b, sSLSocket.getEnabledCipherSuites(), this.f17992c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrA2 = this.f17993d != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.f17642q, sSLSocket.getEnabledProtocols(), this.f17993d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(g.f17547b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z10 && iA != -1) {
            strArrA = com.mbridge.msdk.thrid.okhttp.internal.c.a(strArrA, supportedCipherSuites[iA]);
        }
        return new a(this).a(strArrA).b(strArrA2).a();
    }

    public void a(SSLSocket sSLSocket, boolean z10) {
        j jVarB = b(sSLSocket, z10);
        String[] strArr = jVarB.f17993d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = jVarB.f17992c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.f17990a) {
            return false;
        }
        String[] strArr = this.f17993d;
        if (strArr != null && !com.mbridge.msdk.thrid.okhttp.internal.c.b(com.mbridge.msdk.thrid.okhttp.internal.c.f17642q, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f17992c;
        return strArr2 == null || com.mbridge.msdk.thrid.okhttp.internal.c.b(g.f17547b, strArr2, sSLSocket.getEnabledCipherSuites());
    }
}
