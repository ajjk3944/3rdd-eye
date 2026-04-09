package Ki;

import Ii.AbstractC3070n0;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
abstract /* synthetic */ class p {
    public static final void a(v vVar, Throwable th2) {
        if (th2 != null) {
            cancellationExceptionA = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = AbstractC3070n0.a("Channel was consumed, consumer had failed", th2);
            }
        }
        vVar.cancel(cancellationExceptionA);
    }
}
