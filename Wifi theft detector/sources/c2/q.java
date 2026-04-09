package c2;

import android.webkit.SafeBrowsingResponse;
import c2.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;

/* loaded from: classes.dex */
public class q extends b2.d {

    /* renamed from: a, reason: collision with root package name */
    public SafeBrowsingResponse f4653a;

    /* renamed from: b, reason: collision with root package name */
    public SafeBrowsingResponseBoundaryInterface f4654b;

    public q(InvocationHandler invocationHandler) {
        this.f4654b = (SafeBrowsingResponseBoundaryInterface) da.a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    @Override // b2.d
    public void a(boolean z10) {
        a.f fVar = x.f4698z;
        if (fVar.b()) {
            g.a(c(), z10);
        } else {
            if (!fVar.c()) {
                throw x.a();
            }
            b().showInterstitial(z10);
        }
    }

    public final SafeBrowsingResponseBoundaryInterface b() {
        if (this.f4654b == null) {
            this.f4654b = (SafeBrowsingResponseBoundaryInterface) da.a.a(SafeBrowsingResponseBoundaryInterface.class, y.c().b(this.f4653a));
        }
        return this.f4654b;
    }

    public final SafeBrowsingResponse c() {
        if (this.f4653a == null) {
            this.f4653a = y.c().a(Proxy.getInvocationHandler(this.f4654b));
        }
        return this.f4653a;
    }

    public q(SafeBrowsingResponse safeBrowsingResponse) {
        this.f4653a = safeBrowsingResponse;
    }
}
