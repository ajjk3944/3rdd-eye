package okhttp3.internal.cache;

import Yg.J;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;
import okhttp3.internal.cache.DiskLruCache;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002R\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u0012 \r*\b\u0018\u00010\fR\u00020\u00030\fR\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, d2 = {"okhttp3/internal/cache/DiskLruCache$snapshots$1", "", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "", "hasNext", "()Z", "d", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "LYg/J;", "remove", "()V", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "kotlin.jvm.PlatformType", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/Iterator;", "delegate", SnmpConfigurator.O_BIND_ADDRESS, "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "nextSnapshot", SnmpConfigurator.O_COMMUNITY, "removeSnapshot", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Iterator delegate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private DiskLruCache.Snapshot nextSnapshot;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private DiskLruCache.Snapshot removeSnapshot;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ DiskLruCache f56310d;

    @Override // java.util.Iterator
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public DiskLruCache.Snapshot next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        DiskLruCache.Snapshot snapshot = this.nextSnapshot;
        this.removeSnapshot = snapshot;
        this.nextSnapshot = null;
        AbstractC6492s.f(snapshot);
        return snapshot;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        DiskLruCache.Snapshot snapshotR;
        if (this.nextSnapshot != null) {
            return true;
        }
        DiskLruCache diskLruCache = this.f56310d;
        synchronized (diskLruCache) {
            if (diskLruCache.getClosed()) {
                return false;
            }
            while (this.delegate.hasNext()) {
                DiskLruCache.Entry entry = (DiskLruCache.Entry) this.delegate.next();
                if (entry != null && (snapshotR = entry.r()) != null) {
                    this.nextSnapshot = snapshotR;
                    return true;
                }
            }
            J j10 = J.f24997a;
            return false;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        DiskLruCache.Snapshot snapshot = this.removeSnapshot;
        if (snapshot == null) {
            throw new IllegalStateException("remove() before next()");
        }
        try {
            this.f56310d.u0(snapshot.getKey());
        } catch (IOException unused) {
        } catch (Throwable th2) {
            this.removeSnapshot = null;
            throw th2;
        }
        this.removeSnapshot = null;
    }
}
