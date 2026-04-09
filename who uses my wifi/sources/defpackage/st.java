package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiFunction;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class st implements BiFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ ut b;
    public final /* synthetic */ Executor c;

    public /* synthetic */ st(ut utVar, Executor executor, int i) {
        this.a = i;
        this.b = utVar;
        this.c = executor;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        me0 me0Var = (me0) obj;
        Throwable th = (Throwable) obj2;
        switch (this.a) {
        }
        return this.b.a(me0Var, th, this.c);
    }
}
