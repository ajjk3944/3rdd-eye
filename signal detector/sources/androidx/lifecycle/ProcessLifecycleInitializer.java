package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements J0.b {
    @Override // J0.b
    public final List a() {
        return d5.s.f19824a;
    }

    @Override // J0.b
    public final Object b(Context context) {
        q5.i.e(context, "context");
        J0.a aVarC = J0.a.c(context);
        q5.i.d(aVarC, "getInstance(context)");
        if (!aVarC.f2034b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!r.f5253a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            q5.i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0295q());
        }
        I i = I.i;
        i.getClass();
        i.f5190e = new Handler();
        i.f5191f.d(EnumC0291m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        q5.i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new H(i));
        return i;
    }
}
