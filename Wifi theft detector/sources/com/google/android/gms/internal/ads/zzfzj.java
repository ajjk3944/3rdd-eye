package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzfzj {
    @NotNull
    public static final zzfzh zza(@NotNull final ExecutorService executorService) {
        kotlin.jvm.internal.p.e(executorService, "executorService");
        return new zzfzh() { // from class: com.google.android.gms.internal.ads.zzfzi
            @Override // com.google.android.gms.internal.ads.zzfzh
            public final /* synthetic */ kotlinx.coroutines.j0 zza() {
                return kotlinx.coroutines.k0.a(kotlinx.coroutines.j1.b(executorService));
            }
        };
    }
}
