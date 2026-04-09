package kotlinx.coroutines.internal;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class h {
    public static final void a(kotlin.coroutines.d dVar, Throwable th) {
        Iterator it = g.a().iterator();
        while (it.hasNext()) {
            try {
                ((kotlinx.coroutines.g0) it.next()).handleException(dVar, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                g.b(kotlinx.coroutines.h0.b(th, th2));
            }
        }
        try {
            y8.d.a(th, new DiagnosticCoroutineContextException(dVar));
        } catch (Throwable unused2) {
        }
        g.b(th);
    }
}
