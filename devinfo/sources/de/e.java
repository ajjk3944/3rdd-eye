package de;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements cf.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22197a;

    public /* synthetic */ e(int i4) {
        this.f22197a = i4;
    }

    @Override // cf.b
    public final Object get() {
        switch (this.f22197a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                return ExecutorsRegistrar.a();
            case 3:
                m mVar = ExecutorsRegistrar.f20709a;
                return new ee.g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ee.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f20712d.get());
            case 4:
                m mVar2 = ExecutorsRegistrar.f20709a;
                return new ee.g(Executors.newCachedThreadPool(new ee.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f20712d.get());
            case 5:
                m mVar3 = ExecutorsRegistrar.f20709a;
                return Executors.newSingleThreadScheduledExecutor(new ee.a("Firebase Scheduler", 0, null));
            default:
                Random random = kf.i.j;
                return null;
        }
    }
}
