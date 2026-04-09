package J4;

import com.google.android.gms.common.util.Clock;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import g5.InterfaceC4392b;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements InterfaceC4392b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2791a;

    @Override // g5.InterfaceC4392b
    public final Object get() {
        switch (this.f2791a) {
            case 0:
                I4.n<ScheduledExecutorService> nVar = ExecutorsRegistrar.f23245a;
                return Executors.newSingleThreadScheduledExecutor(new a("Firebase Scheduler", 0, null));
            default:
                Clock clock = r5.n.f45705j;
                return null;
        }
    }
}
