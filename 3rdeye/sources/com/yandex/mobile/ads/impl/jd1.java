package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Looper;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.u21;

/* loaded from: classes3.dex */
public final class jd1 {

    /* renamed from: a, reason: collision with root package name */
    private final fd1 f29111a;

    public /* synthetic */ jd1() {
        this(new fd1());
    }

    public final u21 a(Context context, C4072a3 adConfiguration, gk0 impressionReporter, w52 trackingChecker, String viewControllerDescription, e9 adStructureType) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(impressionReporter, "impressionReporter");
        kotlin.jvm.internal.l.f(trackingChecker, "trackingChecker");
        kotlin.jvm.internal.l.f(viewControllerDescription, "viewControllerDescription");
        kotlin.jvm.internal.l.f(adStructureType, "adStructureType");
        ed1 ed1VarA = this.f29111a.a(impressionReporter, adStructureType);
        Looper mainLooper = Looper.getMainLooper();
        kotlin.jvm.internal.l.e(mainLooper, "getMainLooper(...)");
        return new u21(context, adConfiguration, ed1VarA, trackingChecker, viewControllerDescription, adStructureType, new u21.a(mainLooper, ed1VarA), new h9(context, adConfiguration), ew1.a.a(), new e62());
    }

    public jd1(fd1 noticeReportControllerCreator) {
        kotlin.jvm.internal.l.f(noticeReportControllerCreator, "noticeReportControllerCreator");
        this.f29111a = noticeReportControllerCreator;
    }
}
