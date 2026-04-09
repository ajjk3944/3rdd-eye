package mj;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ProcessLifecycleOwner;
import br.l;
import ch.n;
import cj.s;
import cj.t;
import com.google.android.gms.internal.measurement.y3;
import com.opensignal.sdk.domain.ApplicationLifecycleListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class g extends y3 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f16855b = new AtomicBoolean(false);

    public static void g0(Context context, String str) {
        l.e(context, "context");
        l.e(str, "apiConfigSecret");
        ch.l lVar = ch.l.f3962t5;
        Context applicationContext = context.getApplicationContext();
        l.d(applicationContext, "getApplicationContext(...)");
        if (lVar.f3775a == null) {
            lVar.f3775a = applicationContext;
        }
        if (!lVar.t0().f()) {
            n.g("AppOsSdkInternal", "Another SDK is already running. Do not run");
            return;
        }
        if (!f16855b.compareAndSet(false, true)) {
            n.b("AppOsSdkInternal", "SDK is already initialised. Do nothing.");
            return;
        }
        n.b("AppOsSdkInternal", "SDK first initialisation.");
        lVar.k();
        Bundle bundle = new Bundle();
        ic.a.F(bundle, "EXECUTION_TYPE", cj.e.INITIALISE_SDK);
        bundle.putString("API_KEY", str);
        t.a(context, bundle);
        if (lVar.f3822h1 == null) {
            lVar.f3822h1 = new ApplicationLifecycleListener(lVar.d());
        }
        ApplicationLifecycleListener applicationLifecycleListener = lVar.f3822h1;
        if (applicationLifecycleListener == null) {
            l.l("_applicationLifecycleListener");
            throw null;
        }
        n.b("SdkApi", "registerAppLifecycleOwner");
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.E;
            l.c(processLifecycleOwner, "null cannot be cast to non-null type androidx.lifecycle.ProcessLifecycleOwner");
            lVar.c0().G(new s(processLifecycleOwner, applicationLifecycleListener, 1));
            lVar.c0().G(new s(processLifecycleOwner, applicationLifecycleListener, 0));
        } catch (Error e4) {
            n.c("SdkApi", "Error looking up ProcessLifecycleOwner: " + e4.getLocalizedMessage() + ". Is dependency missing!");
        }
        ch.l lVar2 = ch.l.f3962t5;
        ht.g gVar = new ht.g(25, context);
        synchronized (lVar2) {
            lVar2.I().execute(new ch.a(lVar2, str, gVar, 0));
        }
    }
}
