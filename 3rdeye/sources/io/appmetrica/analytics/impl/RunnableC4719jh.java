package io.appmetrica.analytics.impl;

import c9.C2078B;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;

/* renamed from: io.appmetrica.analytics.impl.jh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4719jh implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C4769lf c4769lfX = Ga.f39501F.x();
        if (timePassedChecker.didTimePassMillis(c4769lfX.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            b9.l lVar = new b9.l("major", Integer.valueOf(kotlinVersion.getMajor()));
            b9.l lVar2 = new b9.l("minor", Integer.valueOf(kotlinVersion.getMinor()));
            b9.l lVar3 = new b9.l("patch", Integer.valueOf(kotlinVersion.getPatch()));
            StringBuilder sb = new StringBuilder();
            sb.append(kotlinVersion.getMajor());
            sb.append('.');
            sb.append(kotlinVersion.getMinor());
            sb.append('.');
            sb.append(kotlinVersion.getPatch());
            Map mapO = C2078B.o(lVar, lVar2, lVar3, new b9.l("version", sb.toString()));
            Zj zj = AbstractC5105yj.f42147a;
            zj.getClass();
            zj.a(new Yj("kotlin_version", mapO));
            c4769lfX.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
