package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fl {

    /* renamed from: a, reason: collision with root package name */
    public MotionEvent f11199a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b, reason: collision with root package name */
    public MotionEvent f11200b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f11201c;

    public fl(ScheduledExecutorService scheduledExecutorService) {
        this.f11201c = scheduledExecutorService;
    }
}
