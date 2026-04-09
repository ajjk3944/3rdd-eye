package J4;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import g5.InterfaceC4392b;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements InterfaceC4392b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2790a;

    public /* synthetic */ l(int i) {
        this.f2790a = i;
    }

    @Override // g5.InterfaceC4392b
    public final Object get() {
        switch (this.f2790a) {
            case 0:
                I4.n<ScheduledExecutorService> nVar = ExecutorsRegistrar.f23245a;
                return new i(Executors.newCachedThreadPool(new a("Firebase Blocking", 11, null)), ExecutorsRegistrar.f23248d.get());
            default:
                com.google.firebase.messaging.a aVar = FirebaseMessaging.f23255l;
                return null;
        }
    }
}
