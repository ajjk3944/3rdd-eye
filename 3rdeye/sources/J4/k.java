package J4;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import g5.InterfaceC4392b;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements InterfaceC4392b {
    @Override // g5.InterfaceC4392b
    public final Object get() {
        I4.n<ScheduledExecutorService> nVar = ExecutorsRegistrar.f23245a;
        return new i(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.f23248d.get());
    }
}
