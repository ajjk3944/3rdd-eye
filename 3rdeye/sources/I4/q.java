package I4;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import g5.InterfaceC4392b;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements InterfaceC4392b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2476a;

    @Override // g5.InterfaceC4392b
    public final Object get() {
        switch (this.f2476a) {
            case 0:
                return null;
            default:
                n<ScheduledExecutorService> nVar = ExecutorsRegistrar.f23245a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i = Build.VERSION.SDK_INT;
                builderDetectNetwork.detectResourceMismatches();
                if (i >= 26) {
                    builderDetectNetwork.detectUnbufferedIo();
                }
                return new J4.i(Executors.newFixedThreadPool(4, new J4.a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), ExecutorsRegistrar.f23248d.get());
        }
    }
}
