package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import c9.C2099t;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class J1 implements InterfaceC5062x1, InterfaceC4858p0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f39658a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f39659b;

    /* renamed from: c, reason: collision with root package name */
    public volatile InterfaceC5037w1 f39660c;

    /* renamed from: d, reason: collision with root package name */
    public final C5040w4 f39661d;

    /* renamed from: e, reason: collision with root package name */
    public final Q1 f39662e;

    /* renamed from: f, reason: collision with root package name */
    public C4565dh f39663f;

    /* renamed from: g, reason: collision with root package name */
    public final C5071xa f39664g;

    /* renamed from: h, reason: collision with root package name */
    public final C4782m2 f39665h;
    public final K1 i;

    /* renamed from: j, reason: collision with root package name */
    public final C4849oh f39666j;

    public J1(Context context, InterfaceC5037w1 interfaceC5037w1) {
        this(context, interfaceC5037w1, new C5091y5(context));
    }

    public final void a() {
        this.f39662e.c(new Eo(this, 0));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void b(Intent intent) throws NumberFormatException {
        this.f39662e.d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int i = Integer.parseInt(data.getQueryParameter("pid"));
            this.f39661d.a(encodedAuthority, Integer.valueOf(i), data.getQueryParameter("psid"));
            this.f39665h.a(i);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void c(Intent intent) {
        Q1 q12 = this.f39662e;
        if (intent == null) {
            q12.getClass();
            return;
        }
        q12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            q12.f40000a.a(action, Integer.valueOf(Q1.a(intent)));
        }
        for (Map.Entry entry : q12.f40001b.entrySet()) {
            P1 p12 = (P1) entry.getKey();
            if (((O1) entry.getValue()).a(intent)) {
                p12.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        Ga.f39501F.u().a(AbstractC5122zb.e(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void onConfigurationChanged(Configuration configuration) {
        Ga.f39501F.u().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void onCreate() {
        if (this.f39658a) {
            Ga.f39501F.u().a(this.f39659b.getResources().getConfiguration());
        } else {
            this.f39664g.b(this.f39659b);
            Ga ga2 = Ga.f39501F;
            synchronized (ga2) {
                ga2.f39503B.initAsync();
                ga2.f39526u.a(ga2.f39507a);
                ga2.f39526u.a(new Cdo(ga2.f39503B));
                NetworkServiceLocator.init();
                ga2.k().a(ga2.f39522q);
                ga2.C();
            }
            AbstractC4568dk.f40755a.e();
            C4595em c4595em = Ga.f39501F.f39526u;
            c4595em.b();
            C4544cm c4544cmB = c4595em.b();
            C5031vk c5031vkO = Ga.f39501F.o();
            c5031vkO.a(new C4671hk(new C4974td(this.f39662e)), c4544cmB);
            c4595em.a(c5031vkO);
            ((C5082xl) Ga.f39501F.y()).getClass();
            a();
            Ga.f39501F.l().init();
            Ga.f39501F.b().init();
            K1 k12 = this.i;
            Context context = this.f39659b;
            C5040w4 c5040w4 = this.f39661d;
            k12.getClass();
            this.f39663f = new C4565dh(context, c5040w4);
            Context context2 = this.f39659b;
            AbstractC4885q1.f41448a.b(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.f39659b;
            C4565dh c4565dh = this.f39663f;
            C4510be c4510beQ = Ga.j().q();
            IHandlerExecutor iHandlerExecutorE = Ga.j().w().e();
            C5117z6 c5117z6 = new C5117z6(context3, c4565dh, EnumC4997ub.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new W(), new BlockingExecutor(), "previous");
            C5117z6 c5117z62 = new C5117z6(context3, c4565dh, EnumC4997ub.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Fb(), iHandlerExecutorE, "actual");
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                FileObserverC5067x6 fileObserverC5067x6 = new FileObserverC5067x6(crashesDirectory, c5117z62, new C4971ta());
                iHandlerExecutorE.execute(new RunnableC4615fg(crashesDirectory, c5117z6));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                fileObserverC5067x6.startWatching();
                Ga.f39501F.f39506E.storeReference(fileObserverC5067x6);
            }
            c4510beQ.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                c4510beQ.f40585a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = c4510beQ.f40585a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    Wd wdB = c4510beQ.f40586b.b(context3, c4565dh);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        wdB.newCrash((NativeCrash) it.next());
                    }
                }
                c4510beQ.f40585a.setDefaultCrashHandler(c4510beQ.f40586b.a(context3, c4565dh));
            }
            new RunnableC4502b6(E.u.G(new RunnableC4719jh())).run();
            this.f39658a = true;
        }
        Ga.f39501F.k().a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void onDestroy() {
        Yb ybK = Ga.f39501F.k();
        synchronized (ybK) {
            Iterator it = ybK.f40416c.iterator();
            while (it.hasNext()) {
                ((InterfaceC4878pk) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void pauseUserSession(Bundle bundle) {
        Nf nf;
        bundle.setClassLoader(Nf.class.getClassLoader());
        String str = Nf.f39901c;
        try {
            nf = (Nf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            nf = null;
        }
        Integer asInteger = nf != null ? nf.f39902a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f39665h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void reportData(int i, Bundle bundle) {
        this.f39666j.getClass();
        List list = (List) Ga.f39501F.f39527v.f41120a.get(Integer.valueOf(i));
        if (list == null) {
            list = C2099t.f18581b;
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC4696ik) it.next()).reportData(i, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void resumeUserSession(Bundle bundle) {
        Nf nf;
        bundle.setClassLoader(Nf.class.getClassLoader());
        String str = Nf.f39901c;
        try {
            nf = (Nf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            nf = null;
        }
        Integer asInteger = nf != null ? nf.f39902a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f39665h.c(asInteger.intValue());
        }
    }

    public J1(Context context, InterfaceC5037w1 interfaceC5037w1, C5091y5 c5091y5) {
        this(context, interfaceC5037w1, new C5040w4(context, c5091y5), new Q1(), C5071xa.f42063d, Ga.j().d(), new K1());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void a(Intent intent) {
        Q1 q12 = this.f39662e;
        if (intent == null) {
            q12.getClass();
            return;
        }
        q12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            q12.f40000a.a(action, Integer.valueOf(Q1.a(intent)));
        }
        for (Map.Entry entry : q12.f40001b.entrySet()) {
            P1 p12 = (P1) entry.getKey();
            if (((O1) entry.getValue()).a(intent)) {
                p12.a(intent);
            }
        }
    }

    public J1(Context context, InterfaceC5037w1 interfaceC5037w1, C5040w4 c5040w4, Q1 q12, C5071xa c5071xa, C4782m2 c4782m2, K1 k12) {
        this.f39658a = false;
        this.f39659b = context;
        this.f39660c = interfaceC5037w1;
        this.f39661d = c5040w4;
        this.f39662e = q12;
        this.f39664g = c5071xa;
        this.f39665h = c4782m2;
        this.i = k12;
        this.f39666j = new C4849oh();
    }

    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        C4683i6.b(bundle);
        C4565dh c4565dh = this.f39663f;
        if (c4565dh != null) {
            c4565dh.a(C4683i6.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void a(InterfaceC5037w1 interfaceC5037w1) {
        this.f39660c = interfaceC5037w1;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void a(Intent intent, int i) {
        ((C4987u1) this.f39660c).f41702a.stopSelfResult(i);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5062x1
    public final void a(Intent intent, int i, int i10) {
        ((C4987u1) this.f39660c).f41702a.stopSelfResult(i10);
    }
}
