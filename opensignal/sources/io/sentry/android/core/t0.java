package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.c3;
import io.sentry.d3;
import io.sentry.x3;
import io.sentry.x5;
import java.util.ArrayList;
import java.util.Iterator;
import p.v2;

/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11774a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11775d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11776g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f11777r;

    public /* synthetic */ t0(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, b1 b1Var, SentryAndroidOptions sentryAndroidOptions) {
        this.f11774a = 4;
        this.f11775d = systemEventsBreadcrumbsIntegration;
        this.f11777r = b1Var;
        this.f11776g = sentryAndroidOptions;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        io.sentry.q qVarA;
        switch (this.f11774a) {
            case 0:
                SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = (SendCachedEnvelopeIntegration) this.f11775d;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f11776g;
                b1 b1Var = (b1) this.f11777r;
                try {
                    if (sendCachedEnvelopeIntegration.E.get()) {
                        sentryAndroidOptions.getLogger().m(b5.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                        return;
                    }
                    if (!sendCachedEnvelopeIntegration.D.getAndSet(true)) {
                        io.sentry.p0 connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                        sendCachedEnvelopeIntegration.f11512r = connectionStatusProvider;
                        connectionStatusProvider.Q(sendCachedEnvelopeIntegration);
                        sendCachedEnvelopeIntegration.B = sendCachedEnvelopeIntegration.f11509a.k(b1Var, sentryAndroidOptions);
                    }
                    io.sentry.p0 p0Var = sendCachedEnvelopeIntegration.f11512r;
                    if (p0Var != null && p0Var.N() == io.sentry.n0.DISCONNECTED) {
                        sentryAndroidOptions.getLogger().m(b5.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                        return;
                    }
                    io.sentry.transport.p pVarD = b1Var.d();
                    if (pVarD != null && pVarD.f(io.sentry.m.All)) {
                        sentryAndroidOptions.getLogger().m(b5.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                        return;
                    }
                    x3 x3Var = sendCachedEnvelopeIntegration.B;
                    if (x3Var == null) {
                        sentryAndroidOptions.getLogger().m(b5.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
                        return;
                    } else {
                        x3Var.a();
                        return;
                    }
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().g(b5.ERROR, "Failed trying to send cached events.", th2);
                    return;
                }
            case 1:
                v2 v2Var = (v2) this.f11775d;
                Runnable runnable = (Runnable) this.f11776g;
                String str = (String) this.f11777r;
                v2Var.getClass();
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused) {
                    if (str != null) {
                        ((SentryAndroidOptions) v2Var.f20202g).getLogger().m(b5.WARNING, "Failed to execute ".concat(str), new Object[0]);
                        return;
                    }
                    return;
                }
            case 2:
                g gVar = (g) this.f11775d;
                x5 x5Var = (x5) this.f11776g;
                b1 b1Var2 = (b1) this.f11777r;
                ArrayList arrayList = gVar.I;
                if (gVar.L.get()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                io.sentry.q qVarA2 = gVar.S.a();
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        c3 c3Var = (c3) it.next();
                        arrayList2.add(new d3(c3Var.f12100a, c3Var.f12101b, c3Var.f12103d, c3Var.f12102c, Double.valueOf(c3Var.f12104e), c3Var.f12105f, x5Var));
                    }
                    arrayList.clear();
                    qVarA2.close();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        b1Var2.n((d3) it2.next());
                    }
                    return;
                } catch (Throwable th3) {
                }
            case 3:
                EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.f11775d;
                x5 x5Var2 = (x5) this.f11776g;
                String str2 = (String) this.f11777r;
                qVarA = envelopeFileObserverIntegration.f11499r.a();
                try {
                    if (!envelopeFileObserverIntegration.f11498g) {
                        envelopeFileObserverIntegration.b(x5Var2, str2);
                    }
                    qVarA.close();
                    return;
                } finally {
                    try {
                        qVarA.close();
                        throw th;
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                    }
                }
            default:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.f11775d;
                b1 b1Var3 = (b1) this.f11777r;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) this.f11776g;
                qVarA = systemEventsBreadcrumbsIntegration.G.a();
                try {
                    if (!systemEventsBreadcrumbsIntegration.f11524y && !systemEventsBreadcrumbsIntegration.B && systemEventsBreadcrumbsIntegration.f11520d == null) {
                        systemEventsBreadcrumbsIntegration.f11520d = new ai.c(systemEventsBreadcrumbsIntegration, b1Var3, sentryAndroidOptions2);
                        if (systemEventsBreadcrumbsIntegration.D == null) {
                            systemEventsBreadcrumbsIntegration.D = new IntentFilter();
                            for (String str3 : systemEventsBreadcrumbsIntegration.f11523x) {
                                systemEventsBreadcrumbsIntegration.D.addAction(str3);
                            }
                        }
                        if (systemEventsBreadcrumbsIntegration.E == null) {
                            systemEventsBreadcrumbsIntegration.E = new HandlerThread("SystemEventsReceiver", 10);
                            systemEventsBreadcrumbsIntegration.E.start();
                        }
                        try {
                            Handler handler = new Handler(systemEventsBreadcrumbsIntegration.E.getLooper());
                            Context context = systemEventsBreadcrumbsIntegration.f11519a;
                            ai.c cVar = systemEventsBreadcrumbsIntegration.f11520d;
                            IntentFilter intentFilter = systemEventsBreadcrumbsIntegration.D;
                            ir.f0.T(sentryAndroidOptions2.getLogger(), "The ILogger object is required.");
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(cVar, intentFilter, null, handler, 4);
                            } else {
                                context.registerReceiver(cVar, intentFilter, null, handler);
                            }
                            if (!systemEventsBreadcrumbsIntegration.F.getAndSet(true)) {
                                sentryAndroidOptions2.getLogger().m(b5.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                                ic.a.b("SystemEventsBreadcrumbs");
                            }
                        } catch (Throwable th5) {
                            sentryAndroidOptions2.setEnableSystemEventBreadcrumbs(false);
                            sentryAndroidOptions2.getLogger().g(b5.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th5);
                        }
                    }
                    qVarA.close();
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ t0(Object obj, Object obj2, Object obj3, int i10) {
        this.f11774a = i10;
        this.f11775d = obj;
        this.f11776g = obj2;
        this.f11777r = obj3;
    }
}
