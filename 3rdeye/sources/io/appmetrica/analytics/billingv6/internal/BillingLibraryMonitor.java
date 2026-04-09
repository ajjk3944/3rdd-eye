package io.appmetrica.analytics.billingv6.internal;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv6.impl.b;
import io.appmetrica.analytics.billingv6.impl.c;
import io.appmetrica.analytics.billingv6.impl.d;
import io.appmetrica.analytics.billingv6.impl.n;
import io.appmetrica.analytics.billingv6.impl.o;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class BillingLibraryMonitor implements BillingMonitor, n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38858a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f38859b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f38860c;

    /* renamed from: d, reason: collision with root package name */
    private final BillingInfoSender f38861d;

    /* renamed from: e, reason: collision with root package name */
    private final BillingInfoManager f38862e;

    /* renamed from: f, reason: collision with root package name */
    private final UpdatePolicy f38863f;

    /* renamed from: g, reason: collision with root package name */
    private BillingConfig f38864g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f38865h;

    public BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy) {
        this.f38858a = context;
        this.f38859b = executor;
        this.f38860c = executor2;
        this.f38861d = billingInfoSender;
        this.f38862e = billingInfoManager;
        this.f38863f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(BillingConfig billingConfig) throws Throwable {
        try {
            try {
                if (l.b(this.f38864g, billingConfig)) {
                    return;
                }
                this.f38864g = billingConfig;
                if (billingConfig != null && !this.f38865h) {
                    this.f38865h = true;
                    BillingClient billingClientBuild = BillingClient.newBuilder(this.f38858a).setListener(new io.appmetrica.analytics.billingv6.impl.l()).enablePendingPurchases().build();
                    billingClientBuild.startConnection(new b(billingConfig, billingClientBuild, new BillingLibraryMonitor$updateBilling$1(this), new d(billingClientBuild), this));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        BillingConfig billingConfig = this.f38864g;
        if (billingConfig == null || this.f38865h) {
            return;
        }
        this.f38865h = true;
        BillingClient billingClientBuild = BillingClient.newBuilder(this.f38858a).setListener(new io.appmetrica.analytics.billingv6.impl.l()).enablePendingPurchases().build();
        billingClientBuild.startConnection(new b(billingConfig, billingClientBuild, new BillingLibraryMonitor$updateBilling$1(this), new d(billingClientBuild), this));
    }

    @Override // io.appmetrica.analytics.billingv6.impl.n
    public synchronized void onUpdateFinished() {
        this.f38865h = false;
    }

    public /* synthetic */ BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy, int i, g gVar) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i & 32) != 0 ? new c(billingInfoStorage) : billingInfoManager, (i & 64) != 0 ? new o(null, 1, null) : updatePolicy);
    }
}
