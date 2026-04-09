package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.c3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4525c3 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BatteryInfo f40608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4551d3 f40609b;

    public C4525c3(C4551d3 c4551d3, BatteryInfo batteryInfo) {
        this.f40609b = c4551d3;
        this.f40608a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4576e3 c4576e3 = this.f40609b.f40682a;
        ChargeType chargeType = this.f40608a.chargeType;
        ChargeType chargeType2 = C4576e3.f40779d;
        synchronized (c4576e3) {
            Iterator it = c4576e3.f40782c.iterator();
            while (it.hasNext()) {
                ((ChargeTypeChangeListener) it.next()).onChargeTypeChanged(chargeType);
            }
        }
    }
}
