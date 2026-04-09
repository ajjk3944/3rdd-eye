package id;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: id.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6142a implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String hostname, SSLSession session) {
        AbstractC6492s.i(hostname, "hostname");
        AbstractC6492s.i(session, "session");
        return true;
    }
}
