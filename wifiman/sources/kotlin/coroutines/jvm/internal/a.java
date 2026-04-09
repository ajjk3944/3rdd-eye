package kotlin.coroutines.jvm.internal;

import Yg.J;
import Yg.u;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class a implements InterfaceC5380e, e, Serializable {
    private final InterfaceC5380e<Object> completion;

    public a(InterfaceC5380e interfaceC5380e) {
        this.completion = interfaceC5380e;
    }

    public InterfaceC5380e<J> create(InterfaceC5380e<?> completion) {
        AbstractC6492s.i(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        InterfaceC5380e<Object> interfaceC5380e = this.completion;
        if (interfaceC5380e instanceof e) {
            return (e) interfaceC5380e;
        }
        return null;
    }

    public final InterfaceC5380e<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dh.InterfaceC5380e
    public final void resumeWith(Object obj) {
        Object objInvokeSuspend;
        InterfaceC5380e interfaceC5380e = this;
        while (true) {
            h.b(interfaceC5380e);
            a aVar = (a) interfaceC5380e;
            InterfaceC5380e interfaceC5380e2 = aVar.completion;
            AbstractC6492s.f(interfaceC5380e2);
            try {
                objInvokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th2) {
                u.a aVar2 = u.f25017b;
                obj = u.c(v.a(th2));
            }
            if (objInvokeSuspend == AbstractC5467b.g()) {
                return;
            }
            obj = u.c(objInvokeSuspend);
            aVar.releaseIntercepted();
            if (!(interfaceC5380e2 instanceof a)) {
                interfaceC5380e2.resumeWith(obj);
                return;
            }
            interfaceC5380e = interfaceC5380e2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public InterfaceC5380e<J> create(Object obj, InterfaceC5380e<?> completion) {
        AbstractC6492s.i(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
