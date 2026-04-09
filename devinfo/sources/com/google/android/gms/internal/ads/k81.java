package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k81 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final k81 f13081a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ k81[] f13082b;

    static {
        k81 k81Var = new k81("INSTANCE", 0);
        f13081a = k81Var;
        f13082b = new k81[]{k81Var};
    }

    public static k81[] values() {
        return (k81[]) f13082b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
