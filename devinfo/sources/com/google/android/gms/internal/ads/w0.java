package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class w0 implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final Choreographer f17804a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayManager f17805b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f17806c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f17807d = -9223372036854775807L;

    public /* synthetic */ w0(Choreographer choreographer, DisplayManager displayManager) {
        this.f17804a = choreographer;
        this.f17805b = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i4) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i4) {
    }
}
