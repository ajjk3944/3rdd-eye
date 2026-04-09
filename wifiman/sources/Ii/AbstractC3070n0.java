package Ii;

import java.util.concurrent.CancellationException;

/* renamed from: Ii.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3070n0 {
    public static final CancellationException a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }
}
