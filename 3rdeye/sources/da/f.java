package da;

import U9.y;
import c9.C2092m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.l;
import y9.m;

/* compiled from: Jdk9Platform.kt */
/* loaded from: classes3.dex */
public final class f extends h {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f37597c;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numQ = property != null ? m.Q(property) : null;
        boolean z10 = true;
        if (numQ == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
            }
        } else if (numQ.intValue() < 9) {
            z10 = false;
        }
        f37597c = z10;
    }

    @Override // da.h
    public final void d(SSLSocket sSLSocket, String str, List<y> protocols) {
        l.f(protocols, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((y) obj) != y.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((y) it.next()).toString());
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // da.h
    public final String f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
