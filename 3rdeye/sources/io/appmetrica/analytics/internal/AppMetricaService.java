package io.appmetrica.analytics.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import io.appmetrica.analytics.impl.A1;
import io.appmetrica.analytics.impl.B1;
import io.appmetrica.analytics.impl.BinderC5012v1;
import io.appmetrica.analytics.impl.C1;
import io.appmetrica.analytics.impl.C4722jk;
import io.appmetrica.analytics.impl.C4987u1;
import io.appmetrica.analytics.impl.C5055wj;
import io.appmetrica.analytics.impl.C5080xj;
import io.appmetrica.analytics.impl.C5087y1;
import io.appmetrica.analytics.impl.C5091y5;
import io.appmetrica.analytics.impl.D1;
import io.appmetrica.analytics.impl.E1;
import io.appmetrica.analytics.impl.Ga;
import io.appmetrica.analytics.impl.I1;
import io.appmetrica.analytics.impl.J1;
import io.appmetrica.analytics.impl.M1;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class AppMetricaService extends Service {

    /* renamed from: c, reason: collision with root package name */
    private static I1 f42217c;

    /* renamed from: a, reason: collision with root package name */
    private final C4987u1 f42218a = new C4987u1(this);

    /* renamed from: b, reason: collision with root package name */
    private final a f42219b = new a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        IBinder binderC5012v1 = (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) ? this.f42219b : new BinderC5012v1();
        I1 i12 = f42217c;
        i12.f39600a.execute(new C1(i12, intent));
        return binderC5012v1;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        I1 i12 = f42217c;
        i12.f39600a.execute(new C5087y1(i12, configuration));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Ga.a(getApplicationContext());
        BaseReleaseLogger.init(getApplicationContext());
        I1 i12 = f42217c;
        if (i12 == null) {
            Context applicationContext = getApplicationContext();
            J1 j12 = new J1(applicationContext, this.f42218a, new C5091y5(applicationContext));
            C4722jk c4722jk = Ga.f39501F.f39527v;
            M1 m12 = new M1(j12);
            LinkedHashMap linkedHashMap = c4722jk.f41120a;
            Object arrayList = linkedHashMap.get(1);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(1, arrayList);
            }
            ((List) arrayList).add(m12);
            f42217c = new I1(Ga.f39501F.f39510d.b(), j12);
        } else {
            i12.f39601b.a(this.f42218a);
        }
        Ga ga2 = Ga.f39501F;
        C5080xj c5080xj = new C5080xj(f42217c);
        synchronized (ga2) {
            ga2.f39512f = new C5055wj(ga2.f39507a, c5080xj);
        }
        f42217c.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        f42217c.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        I1 i12 = f42217c;
        i12.f39600a.execute(new D1(i12, intent));
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        I1 i12 = f42217c;
        i12.f39600a.execute(new A1(i12, intent, i));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i10) {
        I1 i12 = f42217c;
        i12.f39600a.execute(new B1(i12, intent, i, i10));
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        I1 i12 = f42217c;
        i12.f39600a.execute(new E1(i12, intent));
        String action = intent.getAction();
        return (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) && intent.getData() != null;
    }
}
