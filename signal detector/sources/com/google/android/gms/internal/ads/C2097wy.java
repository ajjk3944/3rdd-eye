package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* renamed from: com.google.android.gms.internal.ads.wy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2097wy {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f17523a;

    public C2097wy(ExecutorService executorService) {
        this.f17523a = executorService;
    }

    public final C2043vy a(File file, byte[] bArr, Function function) {
        return new C2043vy(file, this.f17523a, new C1729q6(bArr, 1), function);
    }
}
