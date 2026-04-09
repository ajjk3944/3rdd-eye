package c2;

import android.webkit.WebResourceError;
import androidx.webkit.WebResourceErrorCompat;
import c2.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* loaded from: classes.dex */
public class w extends WebResourceErrorCompat {

    /* renamed from: a, reason: collision with root package name */
    public WebResourceError f4662a;

    /* renamed from: b, reason: collision with root package name */
    public WebResourceErrorBoundaryInterface f4663b;

    public w(InvocationHandler invocationHandler) {
        this.f4663b = (WebResourceErrorBoundaryInterface) da.a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public CharSequence a() {
        a.b bVar = x.f4694v;
        if (bVar.b()) {
            return b.a(d());
        }
        if (bVar.c()) {
            return c().getDescription();
        }
        throw x.a();
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public int b() {
        a.b bVar = x.f4695w;
        if (bVar.b()) {
            return b.b(d());
        }
        if (bVar.c()) {
            return c().getErrorCode();
        }
        throw x.a();
    }

    public final WebResourceErrorBoundaryInterface c() {
        if (this.f4663b == null) {
            this.f4663b = (WebResourceErrorBoundaryInterface) da.a.a(WebResourceErrorBoundaryInterface.class, y.c().d(this.f4662a));
        }
        return this.f4663b;
    }

    public final WebResourceError d() {
        if (this.f4662a == null) {
            this.f4662a = y.c().c(Proxy.getInvocationHandler(this.f4663b));
        }
        return this.f4662a;
    }

    public w(WebResourceError webResourceError) {
        this.f4662a = webResourceError;
    }
}
