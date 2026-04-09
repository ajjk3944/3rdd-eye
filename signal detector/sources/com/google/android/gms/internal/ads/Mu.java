package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class Mu {

    /* renamed from: d, reason: collision with root package name */
    public static final ED f9922d = ED.f7928b;

    /* renamed from: a, reason: collision with root package name */
    public final ID f9923a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f9924b;

    /* renamed from: c, reason: collision with root package name */
    public final Lu f9925c;

    public Mu(ID id, ScheduledExecutorService scheduledExecutorService, Lu lu) {
        this.f9923a = id;
        this.f9924b = scheduledExecutorService;
        this.f9925c = lu;
    }

    public final C1677p8 a(InterfaceFutureC2326a interfaceFutureC2326a, Object obj) {
        return new C1677p8(this, obj, null, interfaceFutureC2326a, Collections.singletonList(interfaceFutureC2326a), interfaceFutureC2326a);
    }
}
