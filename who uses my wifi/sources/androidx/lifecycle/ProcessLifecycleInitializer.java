package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.i30;
import defpackage.lm0;
import defpackage.mm0;
import defpackage.ns;
import defpackage.t20;
import defpackage.t50;
import defpackage.t83;
import defpackage.w50;
import defpackage.x50;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements t20 {
    @Override // defpackage.t20
    public final List a() {
        return ns.f;
    }

    @Override // defpackage.t20
    public final Object b(Context context) {
        i30.m(context, "context");
        t83 t83VarD = t83.D(context);
        i30.l(t83VarD, "getInstance(...)");
        if (!((HashSet) t83VarD.i).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!x50.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            i30.k(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new w50());
        }
        mm0 mm0Var = mm0.n;
        mm0Var.getClass();
        mm0Var.j = new Handler();
        mm0Var.k.d(t50.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        i30.k(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new lm0(mm0Var));
        return mm0Var;
    }
}
