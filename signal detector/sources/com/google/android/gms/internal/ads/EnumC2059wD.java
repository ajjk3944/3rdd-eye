package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.android.gms.internal.ads.wD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2059wD implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2059wD f17407a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC2059wD[] f17408b;

    static {
        EnumC2059wD enumC2059wD = new EnumC2059wD("INSTANCE", 0);
        f17407a = enumC2059wD;
        f17408b = new EnumC2059wD[]{enumC2059wD};
    }

    public static EnumC2059wD[] values() {
        return (EnumC2059wD[]) f17408b.clone();
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
