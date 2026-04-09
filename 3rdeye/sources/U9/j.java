package U9;

import N7.C1154e9;
import U9.I;
import c9.C2097r;
import e9.C4326a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: ConnectionSpec.kt */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final j f12668e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f12669f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12670a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12671b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f12672c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f12673d;

    /* compiled from: ConnectionSpec.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f12674a = true;

        /* renamed from: b, reason: collision with root package name */
        public String[] f12675b;

        /* renamed from: c, reason: collision with root package name */
        public String[] f12676c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f12677d;

        public final j a() {
            return new j(this.f12674a, this.f12677d, this.f12675b, this.f12676c);
        }

        public final void b(C1612i... cipherSuites) {
            kotlin.jvm.internal.l.f(cipherSuites, "cipherSuites");
            if (!this.f12674a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C1612i c1612i : cipherSuites) {
                arrayList.add(c1612i.f12667a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            c((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final void c(String... cipherSuites) {
            kotlin.jvm.internal.l.f(cipherSuites, "cipherSuites");
            if (!this.f12674a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f12675b = (String[]) cipherSuites.clone();
        }

        public final void d(I... iArr) {
            if (!this.f12674a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(iArr.length);
            for (I i : iArr) {
                arrayList.add(i.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final void e(String... tlsVersions) {
            kotlin.jvm.internal.l.f(tlsVersions, "tlsVersions");
            if (!this.f12674a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f12676c = (String[]) tlsVersions.clone();
        }
    }

    static {
        C1612i c1612i = C1612i.f12664r;
        C1612i c1612i2 = C1612i.f12665s;
        C1612i c1612i3 = C1612i.f12666t;
        C1612i c1612i4 = C1612i.f12658l;
        C1612i c1612i5 = C1612i.f12660n;
        C1612i c1612i6 = C1612i.f12659m;
        C1612i c1612i7 = C1612i.f12661o;
        C1612i c1612i8 = C1612i.f12663q;
        C1612i c1612i9 = C1612i.f12662p;
        C1612i[] c1612iArr = {c1612i, c1612i2, c1612i3, c1612i4, c1612i5, c1612i6, c1612i7, c1612i8, c1612i9, C1612i.f12656j, C1612i.f12657k, C1612i.f12655h, C1612i.i, C1612i.f12653f, C1612i.f12654g, C1612i.f12652e};
        a aVar = new a();
        aVar.b((C1612i[]) Arrays.copyOf(new C1612i[]{c1612i, c1612i2, c1612i3, c1612i4, c1612i5, c1612i6, c1612i7, c1612i8, c1612i9}, 9));
        I i = I.TLS_1_3;
        I i10 = I.TLS_1_2;
        aVar.d(i, i10);
        if (!aVar.f12674a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        aVar.f12677d = true;
        aVar.a();
        a aVar2 = new a();
        aVar2.b((C1612i[]) Arrays.copyOf(c1612iArr, 16));
        aVar2.d(i, i10);
        if (!aVar2.f12674a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        aVar2.f12677d = true;
        f12668e = aVar2.a();
        a aVar3 = new a();
        aVar3.b((C1612i[]) Arrays.copyOf(c1612iArr, 16));
        aVar3.d(i, i10, I.TLS_1_1, I.TLS_1_0);
        if (!aVar3.f12674a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        aVar3.f12677d = true;
        aVar3.a();
        f12669f = new j(false, false, null, null);
    }

    public j(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f12670a = z10;
        this.f12671b = z11;
        this.f12672c = strArr;
        this.f12673d = strArr2;
    }

    public final List<C1612i> a() {
        String[] strArr = this.f12672c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C1612i.f12649b.b(str));
        }
        return C2097r.G0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f12670a) {
            return false;
        }
        String[] strArr = this.f12673d;
        if (strArr != null && !V9.b.i(strArr, sSLSocket.getEnabledProtocols(), C4326a.f37775b)) {
            return false;
        }
        String[] strArr2 = this.f12672c;
        return strArr2 == null || V9.b.i(strArr2, sSLSocket.getEnabledCipherSuites(), C1612i.f12650c);
    }

    public final List<I> c() {
        String[] strArr = this.f12673d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            I.Companion.getClass();
            arrayList.add(I.a.a(str));
        }
        return C2097r.G0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z10 = jVar.f12670a;
        boolean z11 = this.f12670a;
        if (z11 != z10) {
            return false;
        }
        if (z11) {
            return Arrays.equals(this.f12672c, jVar.f12672c) && Arrays.equals(this.f12673d, jVar.f12673d) && this.f12671b == jVar.f12671b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f12670a) {
            return 17;
        }
        String[] strArr = this.f12672c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f12673d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f12671b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f12670a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(a(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return C1154e9.k(sb, this.f12671b, ')');
    }
}
