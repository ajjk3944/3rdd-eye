package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* loaded from: classes.dex */
public abstract class V implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final Choreographer f11854a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayManager f11855b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f11856c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f11857d = -9223372036854775807L;

    public /* synthetic */ V(Choreographer choreographer, DisplayManager displayManager) {
        this.f11854a = choreographer;
        this.f11855b = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
