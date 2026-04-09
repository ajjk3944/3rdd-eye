package okhttp3.internal.cache;

import ej.p;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.internal.concurrent.Task;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "Lokhttp3/internal/concurrent/Task;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DiskLruCache$cleanupTask$1 extends Task {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ DiskLruCache f56305e;

    @Override // okhttp3.internal.concurrent.Task
    public long f() {
        DiskLruCache diskLruCache = this.f56305e;
        synchronized (diskLruCache) {
            if (!diskLruCache.initialized || diskLruCache.getClosed()) {
                return -1L;
            }
            try {
                diskLruCache.x0();
            } catch (IOException unused) {
                diskLruCache.mostRecentTrimFailed = true;
            }
            try {
                if (diskLruCache.o0()) {
                    diskLruCache.t0();
                    diskLruCache.redundantOpCount = 0;
                }
            } catch (IOException unused2) {
                diskLruCache.mostRecentRebuildFailed = true;
                diskLruCache.journalWriter = p.c(p.b());
            }
            return -1L;
        }
    }
}
