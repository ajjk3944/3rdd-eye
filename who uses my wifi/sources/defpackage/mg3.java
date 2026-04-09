package defpackage;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mg3 {
    public final ExecutorService a;

    public mg3(ExecutorService executorService) {
        this.a = executorService;
    }

    public final lg3 a(File file, byte[] bArr, Function function) {
        return new lg3(file, this.a, new rc3(1, bArr), function);
    }
}
