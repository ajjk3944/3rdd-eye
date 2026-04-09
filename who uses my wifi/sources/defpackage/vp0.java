package defpackage;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public interface vp0 {
    CompletionStage a(me0 me0Var);

    Duration b();

    default me0 c(me0 me0Var) {
        try {
            return (me0) a(me0Var).toCompletableFuture().get(b().toMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException(e);
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof IOException) {
                throw ((IOException) e2.getCause());
            }
            if (e2.getCause() != null) {
                throw new IOException(e2.getCause());
            }
            throw new IOException(e2);
        } catch (TimeoutException e3) {
            throw new IOException("Timed out while trying to resolve " + me0Var.e().f + "/" + k31.a.e(me0Var.e().g) + ", id=" + me0Var.f.f, e3);
        }
    }
}
