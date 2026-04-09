package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f20198a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ o0[] f20199b;

    static {
        o0 o0Var = new o0("INSTANCE", 0);
        f20198a = o0Var;
        f20199b = new o0[]{o0Var};
    }

    public static o0[] values() {
        return (o0[]) f20199b.clone();
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
