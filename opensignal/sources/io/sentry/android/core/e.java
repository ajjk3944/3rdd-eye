package io.sentry.android.core;

import io.sentry.b4;
import io.sentry.b5;
import io.sentry.k1;
import io.sentry.o3;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements o3, b4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f11559a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11560d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11561g;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3) {
        this.f11559a = obj;
        this.f11560d = obj2;
        this.f11561g = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0698 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // io.sentry.b4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(io.sentry.x5 r27) {
        /*
            Method dump skipped, instructions count: 1851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.e.c(io.sentry.x5):void");
    }

    @Override // io.sentry.o3
    public void d(k1 k1Var) {
        ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) this.f11559a;
        io.sentry.z0 z0Var = (io.sentry.z0) this.f11560d;
        k1 k1Var2 = (k1) this.f11561g;
        if (k1Var == null) {
            z0Var.I(k1Var2);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f11474r;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().m(b5.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", k1Var2.getName());
        }
    }
}
