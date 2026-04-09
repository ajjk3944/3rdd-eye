package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lr7/b;", "Landroidx/lifecycle/v;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements r7.b {
    @Override // r7.b
    public final List a() {
        return mq.w.f16945a;
    }

    @Override // r7.b
    public final Object b(Context context) {
        br.l.e(context, "context");
        r7.a aVarC = r7.a.c(context);
        br.l.d(aVarC, "getInstance(...)");
        if (!aVarC.f21302b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!s.f1521a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            br.l.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.E;
        processLifecycleOwner.getClass();
        processLifecycleOwner.f1469x = new Handler();
        processLifecycleOwner.f1470y.v1(m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        br.l.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new h0(processLifecycleOwner));
        return processLifecycleOwner;
    }
}
