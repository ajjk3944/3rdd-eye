package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;

/* loaded from: classes3.dex */
public final class ae0 implements ls0 {

    /* renamed from: a, reason: collision with root package name */
    private final qs0 f24628a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f24629b;

    public /* synthetic */ ae0(Context context, String str) {
        this(context, str, new qs0(context, str));
    }

    @Override // com.yandex.mobile.ads.impl.ls0
    public final Location a() {
        Location locationA;
        synchronized (this.f24629b) {
            ps0 ps0VarB = this.f24628a.b();
            if (ps0VarB == null || !ps0VarB.b()) {
                locationA = null;
            } else {
                locationA = ps0VarB.a();
                this.f24628a.c();
            }
        }
        return locationA;
    }

    public ae0(Context context, String locationServicesClassName, qs0 locationTaskManager) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(locationServicesClassName, "locationServicesClassName");
        kotlin.jvm.internal.l.f(locationTaskManager, "locationTaskManager");
        this.f24628a = locationTaskManager;
        this.f24629b = new Object();
    }
}
