package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.w5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4986w5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Bundle f36847a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4970u5 f36848b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C4970u5 f36849c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ long f36850d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C4994x5 f36851e;

    RunnableC4986w5(C4994x5 c4994x5, Bundle bundle, C4970u5 c4970u5, C4970u5 c4970u52, long j10) {
        this.f36847a = bundle;
        this.f36848b = c4970u5;
        this.f36849c = c4970u52;
        this.f36850d = j10;
        this.f36851e = c4994x5;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C4994x5.G(this.f36851e, this.f36847a, this.f36848b, this.f36849c, this.f36850d);
    }
}
