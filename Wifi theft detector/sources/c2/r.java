package c2;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* loaded from: classes.dex */
public class r implements b2.e {

    /* renamed from: a, reason: collision with root package name */
    public final ScriptHandlerBoundaryInterface f4655a;

    public r(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f4655a = scriptHandlerBoundaryInterface;
    }

    public static r a(InvocationHandler invocationHandler) {
        return new r((ScriptHandlerBoundaryInterface) da.a.a(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }
}
