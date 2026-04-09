package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.n3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4809n3 implements InterfaceC4673hm {

    /* renamed from: a, reason: collision with root package name */
    public BillingMonitor f41291a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f41292b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f41293c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f41294d;

    /* renamed from: e, reason: collision with root package name */
    public final BillingType f41295e;

    /* renamed from: f, reason: collision with root package name */
    public final BillingInfoStorage f41296f;

    /* renamed from: g, reason: collision with root package name */
    public final BillingInfoSender f41297g;

    /* renamed from: h, reason: collision with root package name */
    public final ApplicationStateProvider f41298h;
    public final C4757l3 i;

    public C4809n3(Context context, Executor executor, Executor executor2, BillingType billingType, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender) {
        this(context, executor, executor2, billingType, billingInfoStorage, billingInfoSender, Ga.j().d(), new C4757l3());
    }

    public final void a(C4544cm c4544cm, Boolean bool) {
        BillingMonitor c4762l8;
        if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
            synchronized (this) {
                try {
                    C4757l3 c4757l3 = this.i;
                    Context context = this.f41292b;
                    Executor executor = this.f41293c;
                    Executor executor2 = this.f41294d;
                    BillingType billingType = this.f41295e;
                    BillingInfoStorage billingInfoStorage = this.f41296f;
                    BillingInfoSender billingInfoSender = this.f41297g;
                    c4757l3.getClass();
                    if (AbstractC4731k3.f41130a[billingType.ordinal()] == 1) {
                        c4762l8 = new BillingLibraryMonitor(context, executor, executor2, billingInfoStorage, billingInfoSender, null, null, 96, null);
                    } else {
                        c4762l8 = new C4762l8();
                    }
                    this.f41291a = c4762l8;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c4762l8.onBillingConfigChanged(c4544cm.f40662x);
            if (this.f41298h.registerStickyObserver(new C4783m3(this)) == ApplicationState.VISIBLE) {
                try {
                    BillingMonitor billingMonitor = this.f41291a;
                    if (billingMonitor != null) {
                        billingMonitor.onSessionResumed();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public C4809n3(Context context, Executor executor, Executor executor2, BillingType billingType, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, ApplicationStateProvider applicationStateProvider, C4757l3 c4757l3) {
        this.f41292b = context;
        this.f41293c = executor;
        this.f41294d = executor2;
        this.f41295e = billingType;
        this.f41296f = billingInfoStorage;
        this.f41297g = billingInfoSender;
        this.f41298h = applicationStateProvider;
        this.i = c4757l3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4673hm
    public final synchronized void a(C4544cm c4544cm) {
        BillingMonitor billingMonitor;
        synchronized (this) {
            billingMonitor = this.f41291a;
        }
        if (billingMonitor != null) {
            billingMonitor.onBillingConfigChanged(c4544cm.f40662x);
        }
    }
}
