package io.appmetrica.analytics.impl;

import android.content.Context;
import b9.C1992A;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;

/* loaded from: classes3.dex */
public final class Wd implements NativeCrashHandler {

    /* renamed from: a, reason: collision with root package name */
    public final p9.l f40335a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f40336b = Ga.j().w().e();

    /* renamed from: c, reason: collision with root package name */
    public final Zd f40337c;

    public Wd(Context context, C4565dh c4565dh, p9.l<? super String, C1992A> lVar, InterfaceC4587ee interfaceC4587ee, EnumC4997ub enumC4997ub, String str) {
        this.f40335a = lVar;
        this.f40337c = new Zd(context, c4565dh, interfaceC4587ee, enumC4997ub);
    }

    public static final void a(Wd wd, NativeCrash nativeCrash, File file) {
        wd.f40335a.invoke(nativeCrash.getUuid());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(final NativeCrash nativeCrash) {
        B0 b02;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String uuid = nativeCrash.getUuid();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            C0 c0A = D0.a(nativeCrash.getMetadata());
            kotlin.jvm.internal.l.c(c0A);
            b02 = new B0(source, handlerVersion, uuid, dumpFile, creationTime, c0A);
        } catch (Throwable unused) {
            b02 = null;
        }
        if (b02 == null) {
            this.f40335a.invoke(nativeCrash.getUuid());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(b02.f39139f.f39215a).info("Detected native crash with uuid = " + b02.f39136c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.f40336b;
        Zd zd = this.f40337c;
        Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.No
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Wd.a(this.f39914a, nativeCrash, (File) obj);
            }
        };
        zd.getClass();
        Sd sd = new Sd(new Ud(b02.f39134a, b02.f39135b), zd.f40474f);
        Pd pd = new Pd(zd.f40470b, b02.f39139f, new Yd(b02, zd.f40472d));
        C4971ta c4971ta = zd.f40473e;
        String str = b02.f39137d;
        c4971ta.getClass();
        File file = new File(str);
        Context context = zd.f40469a;
        if (C4945sa.f41632c == null) {
            synchronized (kotlin.jvm.internal.x.a(C4945sa.class)) {
                try {
                    if (C4945sa.f41632c == null) {
                        C4945sa.f41632c = new C4945sa(context);
                    }
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C4945sa c4945sa = C4945sa.f41632c;
        if (c4945sa != null) {
            iHandlerExecutor.execute(new RunnableC4589eg(file, sd, consumer, pd, c4945sa, zd.f40471c.a(b02)));
        } else {
            kotlin.jvm.internal.l.l("INSTANCE");
            throw null;
        }
    }
}
