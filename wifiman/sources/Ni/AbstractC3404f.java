package Ni;

import Yg.AbstractC3663g;
import dh.InterfaceC5384i;
import java.util.Iterator;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* renamed from: Ni.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3404f {
    public static final void a(InterfaceC5384i interfaceC5384i, Throwable th2) {
        Iterator it = AbstractC3403e.a().iterator();
        while (it.hasNext()) {
            try {
                ((Ii.K) it.next()).s(interfaceC5384i, th2);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                AbstractC3403e.b(Ii.L.b(th2, th3));
            }
        }
        try {
            AbstractC3663g.a(th2, new DiagnosticCoroutineContextException(interfaceC5384i));
        } catch (Throwable unused2) {
        }
        AbstractC3403e.b(th2);
    }
}
