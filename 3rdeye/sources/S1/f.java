package S1;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* compiled from: JavaScriptReplyProxyImpl.java */
/* loaded from: classes.dex */
public final class f implements Callable<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JsReplyProxyBoundaryInterface f11851a;

    public f(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f11851a = jsReplyProxyBoundaryInterface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        g gVar = new g();
        gVar.f11852a = this.f11851a;
        return gVar;
    }
}
