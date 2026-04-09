package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.h1;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class i {
    public static final void a(n nVar, Throwable th) {
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = h1.a("Channel was consumed, consumer had failed", th);
            }
        }
        nVar.a(cancellationExceptionA);
    }
}
