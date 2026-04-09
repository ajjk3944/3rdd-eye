package C3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC4286o;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class r extends M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f2221a;

    r(TaskCompletionSource taskCompletionSource) {
        this.f2221a = taskCompletionSource;
    }

    @Override // C3.N
    public final void v(Status status, LocationAvailability locationAvailability) {
        AbstractC4286o.a(status, locationAvailability, this.f2221a);
    }
}
