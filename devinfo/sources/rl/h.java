package rl;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final h f33084e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f33085f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33086a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33087b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f33088c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f33089d;

    static {
        g gVar = g.f33080r;
        g gVar2 = g.f33081s;
        g gVar3 = g.f33082t;
        g gVar4 = g.f33074l;
        g gVar5 = g.f33076n;
        g gVar6 = g.f33075m;
        g gVar7 = g.f33077o;
        g gVar8 = g.f33079q;
        g gVar9 = g.f33078p;
        List listT = cm.g.t(gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9);
        List listT2 = cm.g.t(gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.j, g.f33073k, g.f33071h, g.f33072i, g.f33070f, g.g, g.f33069e);
        ah.f fVar = new ah.f();
        g[] gVarArr = (g[]) listT.toArray(new g[0]);
        fVar.d((g[]) Arrays.copyOf(gVarArr, gVarArr.length));
        e0 e0Var = e0.TLS_1_3;
        e0 e0Var2 = e0.TLS_1_2;
        fVar.f(e0Var, e0Var2);
        fVar.f381b = true;
        fVar.a();
        ah.f fVar2 = new ah.f();
        g[] gVarArr2 = (g[]) listT2.toArray(new g[0]);
        fVar2.d((g[]) Arrays.copyOf(gVarArr2, gVarArr2.length));
        fVar2.f(e0Var, e0Var2);
        fVar2.f381b = true;
        f33084e = fVar2.a();
        ah.f fVar3 = new ah.f();
        g[] gVarArr3 = (g[]) listT2.toArray(new g[0]);
        fVar3.d((g[]) Arrays.copyOf(gVarArr3, gVarArr3.length));
        fVar3.f(e0Var, e0Var2, e0.TLS_1_1, e0.TLS_1_0);
        fVar3.f381b = true;
        fVar3.a();
        f33085f = new h(false, false, null, null);
    }

    public h(boolean z3, boolean z10, String[] strArr, String[] strArr2) {
        this.f33086a = z3;
        this.f33087b = z10;
        this.f33088c = strArr;
        this.f33089d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z3) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        nk.k.b(enabledCipherSuites);
        String[] strArr = this.f33088c;
        if (strArr != null) {
            enabledCipherSuites = sl.f.i(strArr, enabledCipherSuites, g.f33067c);
        }
        String[] strArr2 = this.f33089d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            nk.k.d(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = sl.f.i(enabledProtocols2, strArr2, bk.b.f2273b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        nk.k.b(supportedCipherSuites);
        f fVar = g.f33067c;
        byte[] bArr = sl.f.f33832a;
        int length = supportedCipherSuites.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            } else if (fVar.compare(supportedCipherSuites[i4], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i4++;
            }
        }
        if (z3 && i4 != -1) {
            String str = supportedCipherSuites[i4];
            nk.k.d(str, "get(...)");
            nk.k.e(enabledCipherSuites, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            nk.k.d(objArrCopyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        ah.f fVar2 = new ah.f();
        fVar2.f380a = this.f33086a;
        fVar2.f382c = strArr;
        fVar2.f383d = strArr2;
        fVar2.f381b = this.f33087b;
        fVar2.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        fVar2.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        h hVarA = fVar2.a();
        if (hVarA.c() != null) {
            sSLSocket.setEnabledProtocols(hVarA.f33089d);
        }
        if (hVarA.b() != null) {
            sSLSocket.setEnabledCipherSuites(hVarA.f33088c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.f33088c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(g.f33066b.b(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.f33089d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            e0.f33058b.getClass();
            arrayList.add(b.c(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        boolean z3 = hVar.f33086a;
        boolean z10 = this.f33086a;
        if (z10 != z3) {
            return false;
        }
        if (z10) {
            return Arrays.equals(this.f33088c, hVar.f33088c) && Arrays.equals(this.f33089d, hVar.f33089d) && this.f33087b == hVar.f33087b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f33086a) {
            return 17;
        }
        String[] strArr = this.f33088c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f33089d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f33087b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f33086a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb2.append(Objects.toString(b(), "[all enabled]"));
        sb2.append(", tlsVersions=");
        sb2.append(Objects.toString(c(), "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        return d.h.x(sb2, this.f33087b, ')');
    }
}
