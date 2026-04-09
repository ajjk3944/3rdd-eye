package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f4963a;

    /* renamed from: d, reason: collision with root package name */
    public final long f4964d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4965g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i1 f4966r;

    public e1(i1 i1Var, boolean z10) {
        Objects.requireNonNull(i1Var);
        this.f4966r = i1Var;
        this.f4963a = System.currentTimeMillis();
        this.f4964d = SystemClock.elapsedRealtime();
        this.f4965g = z10;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        i1 i1Var = this.f4966r;
        if (i1Var.f5071e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e4) {
            i1Var.d(e4, false, this.f4965g);
            b();
        }
    }
}
