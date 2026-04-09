package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.C1787u;
import c9.C2099t;
import java.util.List;

/* compiled from: ProcessLifecycleInitializer.kt */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements I1.b<InterfaceC1790x> {
    @Override // I1.b
    public final InterfaceC1790x create(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        I1.a aVarC = I1.a.c(context);
        kotlin.jvm.internal.l.e(aVarC, "getInstance(context)");
        if (!aVarC.f2411b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!C1787u.f16182a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.l.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C1787u.a());
        }
        J j4 = J.f16049j;
        j4.getClass();
        j4.f16054f = new Handler();
        j4.f16055g.d(AbstractC1781n.a.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.l.d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new K(j4));
        return j4;
    }

    @Override // I1.b
    public final List<Class<? extends I1.b<?>>> dependencies() {
        return C2099t.f18581b;
    }
}
