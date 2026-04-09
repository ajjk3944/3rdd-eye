package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class U9 {

    /* renamed from: a, reason: collision with root package name */
    public MotionEvent f11614a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b, reason: collision with root package name */
    public MotionEvent f11615b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f11616c;

    public U9(ScheduledExecutorService scheduledExecutorService) {
        this.f11616c = scheduledExecutorService;
    }
}
