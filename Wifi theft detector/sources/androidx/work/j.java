package androidx.work;

import java.util.concurrent.CancellationException;
import kotlin.Result;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.o f4523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.common.util.concurrent.a f4524b;

    public j(kotlinx.coroutines.o oVar, com.google.common.util.concurrent.a aVar) {
        this.f4523a = oVar;
        this.f4524b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4523a.resumeWith(Result.b(this.f4524b.get()));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.f4523a.k(cause);
                return;
            }
            kotlinx.coroutines.o oVar = this.f4523a;
            Result.Companion companion = Result.INSTANCE;
            oVar.resumeWith(Result.b(kotlin.c.a(cause)));
        }
    }
}
