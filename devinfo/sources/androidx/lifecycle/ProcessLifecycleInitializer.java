package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements h6.b {
    @Override // h6.b
    public final List a() {
        return zj.s.f38317a;
    }

    @Override // h6.b
    public final Object create(Context context) {
        nk.k.e(context, "context");
        h6.a aVarC = h6.a.c(context);
        nk.k.d(aVarC, "getInstance(...)");
        if (!aVarC.f24884b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!x.f1198a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            nk.k.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new w());
        }
        r0 r0Var = r0.f1172i;
        r0Var.getClass();
        r0Var.f1177e = new Handler();
        r0Var.f1178f.e(r.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        nk.k.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new q0(r0Var));
        return r0Var;
    }
}
