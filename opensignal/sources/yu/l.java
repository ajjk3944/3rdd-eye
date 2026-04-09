package yu;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final k f26470a;

    /* renamed from: b, reason: collision with root package name */
    public m f26471b;

    public l(k kVar) {
        this.f26470a = kVar;
    }

    @Override // yu.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f26470a.a(sSLSocket);
    }

    @Override // yu.m
    public final boolean b() {
        return true;
    }

    @Override // yu.m
    public final String c(SSLSocket sSLSocket) {
        m mVarE = e(sSLSocket);
        if (mVarE != null) {
            return mVarE.c(sSLSocket);
        }
        return null;
    }

    @Override // yu.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        br.l.e(list, "protocols");
        m mVarE = e(sSLSocket);
        if (mVarE != null) {
            mVarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f26471b == null && this.f26470a.a(sSLSocket)) {
                this.f26471b = this.f26470a.b(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f26471b;
    }
}
