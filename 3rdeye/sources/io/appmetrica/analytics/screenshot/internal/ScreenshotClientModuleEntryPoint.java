package io.appmetrica.analytics.screenshot.internal;

import b9.C1992A;
import c9.C2092m;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.screenshot.impl.B;
import io.appmetrica.analytics.screenshot.impl.C5138d;
import io.appmetrica.analytics.screenshot.impl.C5142h;
import io.appmetrica.analytics.screenshot.impl.C5145k;
import io.appmetrica.analytics.screenshot.impl.C5146l;
import io.appmetrica.analytics.screenshot.impl.C5154u;
import io.appmetrica.analytics.screenshot.impl.C5155v;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.P;
import io.appmetrica.analytics.screenshot.impl.S;
import io.appmetrica.analytics.screenshot.impl.d0;
import java.util.Iterator;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class ScreenshotClientModuleEntryPoint extends ModuleClientEntryPoint<B> {

    /* renamed from: a, reason: collision with root package name */
    private C5145k f42593a;

    /* renamed from: d, reason: collision with root package name */
    private S f42596d;

    /* renamed from: b, reason: collision with root package name */
    private final C5142h f42594b = new C5142h();

    /* renamed from: c, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$configUpdateListener$1 f42595c = new ServiceConfigUpdateListener<B>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener
        public void onServiceConfigUpdated(ModuleServiceConfig<B> moduleServiceConfig) {
            C5145k c5145k;
            ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint = this.f42599a;
            synchronized (screenshotClientModuleEntryPoint) {
                try {
                    B featuresConfig = moduleServiceConfig.getFeaturesConfig();
                    if (featuresConfig != null) {
                        boolean zB = featuresConfig.b();
                        D dA = featuresConfig.a();
                        c5145k = new C5145k(zB, dA != null ? new C5146l(dA) : null);
                    } else {
                        c5145k = null;
                    }
                    screenshotClientModuleEntryPoint.f42593a = c5145k;
                    if (screenshotClientModuleEntryPoint.f42596d != null) {
                        S s10 = screenshotClientModuleEntryPoint.f42596d;
                        if (s10 == null) {
                            l.l("screenshotCaptorsController");
                            throw null;
                        }
                        s10.a(screenshotClientModuleEntryPoint.f42593a);
                    }
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final String f42597e = "screenshot";

    /* renamed from: f, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1 f42598f = new ServiceConfigExtensionConfiguration<B>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public BundleToServiceConfigConverter<B> getBundleConverter() {
            return this.f42600a.f42594b;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public ServiceConfigUpdateListener<B> getServiceConfigUpdateListener() {
            return this.f42600a.f42595c;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public String getIdentifier() {
        return this.f42597e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public ServiceConfigExtensionConfiguration<B> getServiceConfigExtensionConfiguration() {
        return this.f42598f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(ClientContext clientContext) {
        synchronized (this) {
            C5155v c5155v = new C5155v(clientContext);
            this.f42596d = new S(C2092m.W(new C5138d(clientContext, c5155v), new d0(clientContext, c5155v), new C5154u(clientContext, c5155v)));
            C1992A c1992a = C1992A.f18074a;
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        synchronized (this) {
            try {
                S s10 = this.f42596d;
                if (s10 != null) {
                    C5145k c5145k = this.f42593a;
                    Iterator it = s10.f42521a.iterator();
                    while (it.hasNext()) {
                        ((P) it.next()).a();
                    }
                    s10.a(c5145k);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
