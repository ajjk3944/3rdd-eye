package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.model.SdkInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.oj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4851oj implements SdkEnvironmentProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41379a;

    /* renamed from: b, reason: collision with root package name */
    public final C4508bc f41380b = new C4508bc();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f41381c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public SdkEnvironment f41382d;

    /* renamed from: e, reason: collision with root package name */
    public String f41383e;

    public C4851oj(Context context) {
        this.f41379a = context;
        this.f41382d = new SdkEnvironment(new AppVersionInfo(PackageManagerUtils.getAppVersionName(context), PackageManagerUtils.getAppVersionCodeString(context)), FrameworkDetector.framework(), new ScreenInfo(0, 0, 0, 0.0f), new SdkInfo("7.9.0", "50132373", AbstractC4877pj.a()), "phone", C4508bc.a(context.getResources().getConfiguration()));
    }

    public final synchronized void a(ScreenInfo screenInfo) {
        float f10;
        if (screenInfo != null) {
            try {
                if (!screenInfo.equals(getSdkEnvironment().getScreenInfo())) {
                    String str = this.f41383e;
                    if (str == null) {
                        Context context = this.f41379a;
                        Point point = new Point(screenInfo.getWidth(), screenInfo.getHeight());
                        SafePackageManager safePackageManager = Se.f40106a;
                        try {
                            f10 = context.getResources().getDisplayMetrics().density;
                        } catch (Throwable unused) {
                            f10 = 0.0f;
                        }
                        if (f10 == 0.0f) {
                            str = "phone";
                        } else {
                            float f11 = point.x;
                            float f12 = point.y;
                            float fMin = Math.min(f11 / f10, f12 / f10);
                            float f13 = f10 * 160.0f;
                            float f14 = f11 / f13;
                            float f15 = f12 / f13;
                            double dSqrt = Math.sqrt((f15 * f15) + (f14 * f14));
                            str = (dSqrt < 15.0d || Se.f40106a.hasSystemFeature(context, "android.hardware.touchscreen")) ? (dSqrt >= 7.0d || fMin >= 600.0f) ? "tablet" : "phone" : "tv";
                        }
                    }
                    this.f41382d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, screenInfo, null, str, null, 43, null);
                    Iterator it = this.f41381c.iterator();
                    while (it.hasNext()) {
                        ((H5) ((InterfaceC4825nj) it.next())).d();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(InterfaceC4825nj interfaceC4825nj) {
        this.f41381c.remove(interfaceC4825nj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider
    public final SdkEnvironment getSdkEnvironment() {
        SdkEnvironment sdkEnvironment = this.f41382d;
        if (sdkEnvironment != null) {
            return sdkEnvironment;
        }
        kotlin.jvm.internal.l.l("sdkEnvironment");
        throw null;
    }

    public final synchronized void a(String str) {
        if (str != null) {
            if (!str.equals(this.f41383e)) {
                this.f41383e = str;
                if (!str.equals(getSdkEnvironment().getDeviceType())) {
                    this.f41382d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, str, null, 47, null);
                    Iterator it = this.f41381c.iterator();
                    while (it.hasNext()) {
                        ((H5) ((InterfaceC4825nj) it.next())).d();
                    }
                }
            }
        }
    }

    public final synchronized void a(String str, String str2) {
        if (str == null) {
            try {
                str = getSdkEnvironment().getAppVersionInfo().getAppVersionName();
            } finally {
            }
        }
        if (str2 == null) {
            str2 = getSdkEnvironment().getAppVersionInfo().getAppBuildNumber();
        }
        AppVersionInfo appVersionInfo = getSdkEnvironment().getAppVersionInfo();
        if (!kotlin.jvm.internal.l.b(appVersionInfo.getAppVersionName(), str) || !kotlin.jvm.internal.l.b(appVersionInfo.getAppBuildNumber(), str2)) {
            this.f41382d = SdkEnvironment.copy$default(getSdkEnvironment(), new AppVersionInfo(str, str2), null, null, null, null, null, 62, null);
            Iterator it = this.f41381c.iterator();
            while (it.hasNext()) {
                ((H5) ((InterfaceC4825nj) it.next())).d();
            }
        }
    }

    public final synchronized void a(Configuration configuration) {
        this.f41380b.getClass();
        List listA = C4508bc.a(configuration);
        if (!kotlin.jvm.internal.l.b(getSdkEnvironment().getLocales(), listA)) {
            this.f41382d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, null, listA, 31, null);
            Iterator it = this.f41381c.iterator();
            while (it.hasNext()) {
                ((H5) ((InterfaceC4825nj) it.next())).d();
            }
        }
    }

    public final void a(InterfaceC4825nj interfaceC4825nj) {
        this.f41381c.add(interfaceC4825nj);
    }
}
