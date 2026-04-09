package Y9;

import U9.C1612i;
import U9.j;
import e9.C4326a;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: ConnectionSpecSelector.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List<U9.j> f13807a;

    /* renamed from: b, reason: collision with root package name */
    public int f13808b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13809c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13810d;

    public b(List<U9.j> connectionSpecs) {
        kotlin.jvm.internal.l.f(connectionSpecs, "connectionSpecs");
        this.f13807a = connectionSpecs;
    }

    public final U9.j a(SSLSocket sSLSocket) throws IOException {
        U9.j jVar;
        int i;
        boolean z10;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        int i10 = this.f13808b;
        List<U9.j> list = this.f13807a;
        int size = list.size();
        while (true) {
            if (i10 >= size) {
                jVar = null;
                break;
            }
            jVar = list.get(i10);
            if (jVar.b(sSLSocket)) {
                this.f13808b = i10 + 1;
                break;
            }
            i10++;
        }
        if (jVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f13810d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.l.c(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            kotlin.jvm.internal.l.e(string, "toString(this)");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i11 = this.f13808b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i11 >= size2) {
                z10 = false;
                break;
            }
            if (list.get(i11).b(sSLSocket)) {
                z10 = true;
                break;
            }
            i11++;
        }
        this.f13809c = z10;
        boolean z11 = this.f13810d;
        String[] strArr = jVar.f12672c;
        if (strArr != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.l.e(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = V9.b.o(enabledCipherSuites, strArr, C1612i.f12650c);
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = jVar.f12673d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.l.e(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = V9.b.o(enabledProtocols2, strArr2, C4326a.f37775b);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.l.e(supportedCipherSuites, "supportedCipherSuites");
        C1612i.a aVar = C1612i.f12650c;
        byte[] bArr = V9.b.f13053a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (aVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z11 && i != -1) {
            kotlin.jvm.internal.l.e(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            kotlin.jvm.internal.l.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            kotlin.jvm.internal.l.e(objArrCopyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) objArrCopyOf;
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = str;
        }
        j.a aVar2 = new j.a();
        aVar2.f12674a = jVar.f12670a;
        aVar2.f12675b = strArr;
        aVar2.f12676c = strArr2;
        aVar2.f12677d = jVar.f12671b;
        kotlin.jvm.internal.l.e(cipherSuitesIntersection, "cipherSuitesIntersection");
        aVar2.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        kotlin.jvm.internal.l.e(tlsVersionsIntersection, "tlsVersionsIntersection");
        aVar2.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        U9.j jVarA = aVar2.a();
        if (jVarA.c() != null) {
            sSLSocket.setEnabledProtocols(jVarA.f12673d);
        }
        if (jVarA.a() != null) {
            sSLSocket.setEnabledCipherSuites(jVarA.f12672c);
        }
        return jVar;
    }
}
