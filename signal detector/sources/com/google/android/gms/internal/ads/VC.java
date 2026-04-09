package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class VC {

    /* renamed from: d, reason: collision with root package name */
    public static final VC f11966d = new VC();

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f11967a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f11968b;

    /* renamed from: c, reason: collision with root package name */
    public VC f11969c;

    public VC() {
        this.f11967a = null;
        this.f11968b = null;
    }

    public VC(Runnable runnable, Executor executor) {
        this.f11967a = runnable;
        this.f11968b = executor;
    }
}
