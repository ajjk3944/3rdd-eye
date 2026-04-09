package com.google.android.gms.measurement.internal;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.z5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC5010z5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C4970u5 f36910a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4970u5 f36911b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ long f36912c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f36913d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C4994x5 f36914e;

    RunnableC5010z5(C4994x5 c4994x5, C4970u5 c4970u5, C4970u5 c4970u52, long j10, boolean z10) {
        this.f36910a = c4970u5;
        this.f36911b = c4970u52;
        this.f36912c = j10;
        this.f36913d = z10;
        this.f36914e = c4994x5;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f36914e.E(this.f36910a, this.f36911b, this.f36912c, this.f36913d, null);
    }
}
