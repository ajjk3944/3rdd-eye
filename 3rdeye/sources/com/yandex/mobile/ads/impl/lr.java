package com.yandex.mobile.ads.impl;

import c9.C2097r;
import com.yandex.mobile.ads.impl.d52;
import com.yandex.mobile.ads.impl.jo;
import e9.C4326a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public final class lr {

    /* renamed from: e, reason: collision with root package name */
    public static final lr f30077e;

    /* renamed from: f, reason: collision with root package name */
    public static final lr f30078f;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30079a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f30080b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f30081c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f30082d;

    static {
        jo joVar = jo.f29241r;
        jo joVar2 = jo.f29242s;
        jo joVar3 = jo.f29243t;
        jo joVar4 = jo.f29235l;
        jo joVar5 = jo.f29237n;
        jo joVar6 = jo.f29236m;
        jo joVar7 = jo.f29238o;
        jo joVar8 = jo.f29240q;
        jo joVar9 = jo.f29239p;
        jo[] joVarArr = {joVar, joVar2, joVar3, joVar4, joVar5, joVar6, joVar7, joVar8, joVar9, jo.f29233j, jo.f29234k, jo.f29232h, jo.i, jo.f29230f, jo.f29231g, jo.f29229e};
        a aVarA = new a(true).a((jo[]) Arrays.copyOf(new jo[]{joVar, joVar2, joVar3, joVar4, joVar5, joVar6, joVar7, joVar8, joVar9}, 9));
        d52 d52Var = d52.f25970d;
        d52 d52Var2 = d52.f25971e;
        aVarA.a(d52Var, d52Var2).b().a();
        f30077e = new a(true).a((jo[]) Arrays.copyOf(joVarArr, 16)).a(d52Var, d52Var2).b().a();
        new a(true).a((jo[]) Arrays.copyOf(joVarArr, 16)).a(d52Var, d52Var2, d52.f25972f, d52.f25973g).b().a();
        f30078f = new a(false).a();
    }

    public lr(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f30079a = z10;
        this.f30080b = z11;
        this.f30081c = strArr;
        this.f30082d = strArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lr)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f30079a;
        lr lrVar = (lr) obj;
        if (z10 != lrVar.f30079a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f30081c, lrVar.f30081c) && Arrays.equals(this.f30082d, lrVar.f30082d) && this.f30080b == lrVar.f30080b);
    }

    public final int hashCode() {
        if (!this.f30079a) {
            return 17;
        }
        String[] strArr = this.f30081c;
        int iHashCode = ((strArr != null ? Arrays.hashCode(strArr) : 0) + 527) * 31;
        String[] strArr2 = this.f30082d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f30080b ? 1 : 0);
    }

    public final String toString() {
        List listG0;
        if (!this.f30079a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f30081c;
        List listG02 = null;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(jo.f29226b.a(str));
            }
            listG0 = C2097r.G0(arrayList);
        } else {
            listG0 = null;
        }
        String string = Objects.toString(listG0, "[all enabled]");
        String[] strArr2 = this.f30082d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                d52.f25969c.getClass();
                arrayList2.add(d52.a.a(str2));
            }
            listG02 = C2097r.G0(arrayList2);
        }
        return androidx.work.s.h(j6.l.d("ConnectionSpec(cipherSuites=", string, ", tlsVersions=", Objects.toString(listG02, "[all enabled]"), ", supportsTlsExtensions="), this.f30080b, ")");
    }

    public final void a(SSLSocket sslSocket, boolean z10) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        List listG0;
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        if (this.f30081c != null) {
            String[] enabledCipherSuites2 = sslSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.l.e(enabledCipherSuites2, "getEnabledCipherSuites(...)");
            enabledCipherSuites = t82.b(enabledCipherSuites2, this.f30081c, jo.f29227c);
        } else {
            enabledCipherSuites = sslSocket.getEnabledCipherSuites();
        }
        if (this.f30082d != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            kotlin.jvm.internal.l.e(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = t82.b(enabledProtocols2, this.f30082d, C4326a.f37775b);
        } else {
            enabledProtocols = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.l.c(supportedCipherSuites);
        jo.a comparator = jo.f29227c;
        byte[] bArr = t82.f33480a;
        kotlin.jvm.internal.l.f(comparator, "comparator");
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (comparator.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z10 && i != -1) {
            kotlin.jvm.internal.l.c(enabledCipherSuites);
            String str = supportedCipherSuites[i];
            kotlin.jvm.internal.l.e(str, "get(...)");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            kotlin.jvm.internal.l.e(objArrCopyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        a aVar = new a(this);
        kotlin.jvm.internal.l.c(enabledCipherSuites);
        a aVarA = aVar.a((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        kotlin.jvm.internal.l.c(enabledProtocols);
        lr lrVarA = aVarA.b((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).a();
        String[] strArr = lrVarA.f30082d;
        List listG02 = null;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str2 : strArr) {
                d52.f25969c.getClass();
                arrayList.add(d52.a.a(str2));
            }
            listG0 = C2097r.G0(arrayList);
        } else {
            listG0 = null;
        }
        if (listG0 != null) {
            sslSocket.setEnabledProtocols(lrVarA.f30082d);
        }
        String[] strArr2 = lrVarA.f30081c;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str3 : strArr2) {
                arrayList2.add(jo.f29226b.a(str3));
            }
            listG02 = C2097r.G0(arrayList2);
        }
        if (listG02 != null) {
            sslSocket.setEnabledCipherSuites(lrVarA.f30081c);
        }
    }

    public final boolean b() {
        return this.f30080b;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f30083a;

        /* renamed from: b, reason: collision with root package name */
        private String[] f30084b;

        /* renamed from: c, reason: collision with root package name */
        private String[] f30085c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f30086d;

        public a(lr connectionSpec) {
            kotlin.jvm.internal.l.f(connectionSpec, "connectionSpec");
            this.f30083a = connectionSpec.a();
            this.f30084b = connectionSpec.f30081c;
            this.f30085c = connectionSpec.f30082d;
            this.f30086d = connectionSpec.b();
        }

        public final a a(jo... cipherSuites) {
            kotlin.jvm.internal.l.f(cipherSuites, "cipherSuites");
            if (!this.f30083a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (jo joVar : cipherSuites) {
                arrayList.add(joVar.c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return a((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a b() {
            if (!this.f30083a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f30086d = true;
            return this;
        }

        public final a b(String... tlsVersions) {
            kotlin.jvm.internal.l.f(tlsVersions, "tlsVersions");
            if (this.f30083a) {
                if (!(tlsVersions.length == 0)) {
                    this.f30085c = (String[]) tlsVersions.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }

        public a(boolean z10) {
            this.f30083a = z10;
        }

        public final a a(String... cipherSuites) {
            kotlin.jvm.internal.l.f(cipherSuites, "cipherSuites");
            if (this.f30083a) {
                if (!(cipherSuites.length == 0)) {
                    this.f30084b = (String[]) cipherSuites.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }

        public final a a(d52... tlsVersions) {
            kotlin.jvm.internal.l.f(tlsVersions, "tlsVersions");
            if (this.f30083a) {
                ArrayList arrayList = new ArrayList(tlsVersions.length);
                for (d52 d52Var : tlsVersions) {
                    arrayList.add(d52Var.a());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                return b((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }

        public final lr a() {
            return new lr(this.f30083a, this.f30086d, this.f30084b, this.f30085c);
        }
    }

    public final boolean a(SSLSocket socket) {
        kotlin.jvm.internal.l.f(socket, "socket");
        if (!this.f30079a) {
            return false;
        }
        String[] strArr = this.f30082d;
        if (strArr != null && !t82.a(strArr, socket.getEnabledProtocols(), C4326a.f37775b)) {
            return false;
        }
        String[] strArr2 = this.f30081c;
        return strArr2 == null || t82.a(strArr2, socket.getEnabledCipherSuites(), jo.f29227c);
    }

    public final boolean a() {
        return this.f30079a;
    }
}
