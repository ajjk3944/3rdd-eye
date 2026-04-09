package su;

import d5.z0;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import zc.j0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f22307a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22308b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22309c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22310d;

    public b(j0 j0Var, int i10, boolean z10, boolean z11) {
        this.f22310d = j0Var;
        this.f22307a = i10;
        this.f22308b = z10;
        this.f22309c = z11;
    }

    public ou.m a(SSLSocket sSLSocket) throws UnknownServiceException {
        boolean z10;
        ou.m mVar;
        boolean z11;
        boolean z12;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i10 = this.f22307a;
        List list = (List) this.f22310d;
        int size = list.size();
        while (true) {
            z10 = true;
            if (i10 >= size) {
                mVar = null;
                break;
            }
            mVar = (ou.m) list.get(i10);
            if (mVar.b(sSLSocket)) {
                this.f22307a = i10 + 1;
                break;
            }
            i10++;
        }
        if (mVar == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb2.append(this.f22309c);
            sb2.append(", modes=");
            sb2.append(list);
            sb2.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            br.l.b(enabledProtocols2);
            String string = Arrays.toString(enabledProtocols2);
            br.l.d(string, "toString(this)");
            sb2.append(string);
            throw new UnknownServiceException(sb2.toString());
        }
        int i11 = this.f22307a;
        int size2 = list.size();
        while (true) {
            z11 = false;
            if (i11 >= size2) {
                z12 = false;
                break;
            }
            if (((ou.m) list.get(i11)).b(sSLSocket)) {
                z12 = true;
                break;
            }
            i11++;
        }
        this.f22308b = z12;
        boolean z13 = this.f22309c;
        String[] strArr = mVar.f19947d;
        String[] strArr2 = mVar.f19946c;
        if (strArr2 != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            br.l.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = pu.b.o(enabledCipherSuites2, strArr2, ou.l.f19925c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (strArr != null) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            br.l.d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = pu.b.o(enabledProtocols3, strArr, oq.a.f19659d);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        br.l.d(supportedCipherSuites, "supportedCipherSuites");
        ou.k kVar = ou.l.f19925c;
        byte[] bArr = pu.b.f20645a;
        int length = supportedCipherSuites.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i12 = -1;
                break;
            }
            boolean z14 = z10;
            if (kVar.compare(supportedCipherSuites[i12], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i12++;
            z10 = z14;
        }
        if (z13 && i12 != -1) {
            br.l.d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i12];
            br.l.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            br.l.d(objArrCopyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        z0 z0Var = new z0(z11);
        z0Var.f7142b = mVar.f19944a;
        z0Var.f7144d = strArr2;
        z0Var.f7145e = strArr;
        z0Var.f7143c = mVar.f19945b;
        br.l.d(enabledCipherSuites, "cipherSuitesIntersection");
        z0Var.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        br.l.d(enabledProtocols, "tlsVersionsIntersection");
        z0Var.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        ou.m mVarA = z0Var.a();
        if (mVarA.c() != null) {
            sSLSocket.setEnabledProtocols(mVarA.f19947d);
        }
        if (mVarA.a() != null) {
            sSLSocket.setEnabledCipherSuites(mVarA.f19946c);
        }
        return mVar;
    }

    public void b(String str) {
        ((j0) this.f22310d).B1(this.f22307a, this.f22308b, this.f22309c, str, null, null, null);
    }

    public void c(Object obj, String str) {
        ((j0) this.f22310d).B1(this.f22307a, this.f22308b, this.f22309c, str, obj, null, null);
    }

    public void d(Object obj, Object obj2, String str) {
        ((j0) this.f22310d).B1(this.f22307a, this.f22308b, this.f22309c, str, obj, obj2, null);
    }

    public void e(String str, Object obj, Object obj2, Object obj3) {
        ((j0) this.f22310d).B1(this.f22307a, this.f22308b, this.f22309c, str, obj, obj2, obj3);
    }

    public b(List list) {
        br.l.e(list, "connectionSpecs");
        this.f22310d = list;
    }
}
