package fb;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: fb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5803a implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final C5803a f47231a = new C5803a();

    private C5803a() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return true;
    }
}
