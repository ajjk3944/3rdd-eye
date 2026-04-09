package com.unity3d.scar.adapter.common;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f20100a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f20101b;

    public synchronized void a() {
        this.f20100a++;
    }

    public synchronized void b() {
        this.f20100a--;
        d();
    }

    public void c(Runnable runnable) {
        this.f20101b = runnable;
        d();
    }

    public final void d() {
        Runnable runnable;
        if (this.f20100a > 0 || (runnable = this.f20101b) == null) {
            return;
        }
        runnable.run();
    }
}
