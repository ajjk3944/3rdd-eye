package ou;

import d5.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final m f19942e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f19943f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19944a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19945b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f19946c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f19947d;

    static {
        l lVar = l.f19938r;
        l lVar2 = l.f19939s;
        l lVar3 = l.f19940t;
        l lVar4 = l.f19932l;
        l lVar5 = l.f19934n;
        l lVar6 = l.f19933m;
        l lVar7 = l.f19935o;
        l lVar8 = l.f19937q;
        l lVar9 = l.f19936p;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9};
        l[] lVarArr2 = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, l.j, l.k, l.f19930h, l.f19931i, l.f19928f, l.f19929g, l.f19927e};
        z0 z0Var = new z0(2);
        z0Var.c((l[]) Arrays.copyOf(lVarArr, 9));
        h0 h0Var = h0.TLS_1_3;
        h0 h0Var2 = h0.TLS_1_2;
        z0Var.f(h0Var, h0Var2);
        z0Var.f7143c = true;
        z0Var.a();
        z0 z0Var2 = new z0(2);
        z0Var2.c((l[]) Arrays.copyOf(lVarArr2, 16));
        z0Var2.f(h0Var, h0Var2);
        z0Var2.f7143c = true;
        f19942e = z0Var2.a();
        z0 z0Var3 = new z0(2);
        z0Var3.c((l[]) Arrays.copyOf(lVarArr2, 16));
        z0Var3.f(h0Var, h0Var2, h0.TLS_1_1, h0.TLS_1_0);
        z0Var3.f7143c = true;
        z0Var3.a();
        f19943f = new m(false, false, null, null);
    }

    public m(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f19944a = z10;
        this.f19945b = z11;
        this.f19946c = strArr;
        this.f19947d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f19946c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(l.f19924b.c(str));
        }
        return mq.o.Q0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f19944a) {
            return false;
        }
        String[] strArr = this.f19947d;
        if (strArr != null && !pu.b.i(strArr, sSLSocket.getEnabledProtocols(), oq.a.f19659d)) {
            return false;
        }
        String[] strArr2 = this.f19946c;
        return strArr2 == null || pu.b.i(strArr2, sSLSocket.getEnabledCipherSuites(), l.f19925c);
    }

    public final List c() {
        String[] strArr = this.f19947d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            h0.Companion.getClass();
            arrayList.add(g0.a(str));
        }
        return mq.o.Q0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        m mVar = (m) obj;
        boolean z10 = mVar.f19944a;
        boolean z11 = this.f19944a;
        if (z11 != z10) {
            return false;
        }
        if (z11) {
            return Arrays.equals(this.f19946c, mVar.f19946c) && Arrays.equals(this.f19947d, mVar.f19947d) && this.f19945b == mVar.f19945b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f19944a) {
            return 17;
        }
        String[] strArr = this.f19946c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f19947d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f19945b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f19944a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb2.append(Objects.toString(a(), "[all enabled]"));
        sb2.append(", tlsVersions=");
        sb2.append(Objects.toString(c(), "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        return c7.a.r(sb2, this.f19945b, ')');
    }
}
