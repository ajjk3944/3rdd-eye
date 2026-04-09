package defpackage;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lg3 {
    public final File a;
    public final ExecutorService b;
    public final kg3 c;
    public final Function d;

    public lg3(File file, ExecutorService executorService, kg3 kg3Var, Function function) {
        this.a = file;
        this.b = executorService;
        this.c = kg3Var;
        this.d = function;
    }

    public final ar3 a(Object obj) {
        return pu1.D(new gs1(this, obj, 12), this.b);
    }
}
