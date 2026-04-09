package J4;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o0.AbstractC5408a;

/* compiled from: DelegatingScheduledFuture.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class j<V> extends AbstractC5408a<V> implements ScheduledFuture<V> {
    public final ScheduledFuture<?> i;

    /* compiled from: DelegatingScheduledFuture.java */
    public class a {
        public a() {
        }
    }

    /* compiled from: DelegatingScheduledFuture.java */
    public interface b<T> {
        ScheduledFuture a(a aVar);
    }

    public j(b<V> bVar) {
        this.i = bVar.a(new a());
    }

    @Override // o0.AbstractC5408a
    public final void b() {
        ScheduledFuture<?> scheduledFuture = this.i;
        Object obj = this.f44779b;
        scheduledFuture.cancel((obj instanceof AbstractC5408a.b) && ((AbstractC5408a.b) obj).f44784a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.i.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.i.getDelay(timeUnit);
    }
}
