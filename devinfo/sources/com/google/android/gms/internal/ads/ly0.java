package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ly0 {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f13680a;

    public ly0(ExecutorService executorService) {
        this.f13680a = executorService;
    }

    public final ky0 a(File file, byte[] bArr, Function function) {
        return new ky0(file, this.f13680a, new xd(bArr, 1), function);
    }
}
