package com.zipoapps.premiumhelper.util;

import I1.b;
import android.content.Context;
import androidx.annotation.Keep;
import b9.C1992A;
import c9.C2099t;
import com.zipoapps.premiumhelper.performance.StartupPerformanceTracker;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: ApplicationStartListener.kt */
@Keep
/* loaded from: classes3.dex */
public final class ApplicationStartListener implements b<C1992A> {
    @Override // I1.b
    public /* bridge */ /* synthetic */ C1992A create(Context context) {
        create2(context);
        return C1992A.f18074a;
    }

    @Override // I1.b
    public List<Class<? extends b<?>>> dependencies() {
        return C2099t.f18581b;
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(Context context) {
        l.f(context, "context");
        StartupPerformanceTracker.f37057b.getClass();
        StartupPerformanceTracker startupPerformanceTrackerA = StartupPerformanceTracker.a.a();
        StartupPerformanceTracker.StartupData startupData = new StartupPerformanceTracker.StartupData(0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, null, null, 0L, 0L, 0L, 0L, 0L, 0L, false, false, false, 8388607, null);
        startupData.setApplicationStartTimestamp(System.currentTimeMillis());
        startupPerformanceTrackerA.f37059a = startupData;
    }
}
