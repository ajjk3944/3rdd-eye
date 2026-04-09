package c2;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* loaded from: classes.dex */
public class n extends b2.a {

    /* renamed from: a, reason: collision with root package name */
    public final JsReplyProxyBoundaryInterface f4649a;

    public n(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f4649a = jsReplyProxyBoundaryInterface;
    }

    public static /* synthetic */ Object a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        return new n(jsReplyProxyBoundaryInterface);
    }

    public static n b(InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) da.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (n) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: c2.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return n.a(jsReplyProxyBoundaryInterface);
            }
        });
    }
}
