package C3;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC4286o;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class q extends O {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f2220a;

    q(TaskCompletionSource taskCompletionSource) {
        this.f2220a = taskCompletionSource;
    }

    @Override // C3.P
    public final void n(Status status, Location location) {
        AbstractC4286o.a(status, location, this.f2220a);
    }
}
