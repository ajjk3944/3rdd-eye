package defpackage;

import java.time.Duration;
import java.util.Collection;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wt implements vp0 {
    public static final i80 d = k80.d(wt.class);
    public static final Duration e = Duration.ofSeconds(10);
    public static final Duration f = Duration.ofSeconds(5);
    public final CopyOnWriteArrayList a;
    public final int b;
    public final Duration c;

    public wt() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.a = copyOnWriteArrayList;
        new AtomicInteger();
        this.b = 3;
        this.c = e;
        copyOnWriteArrayList.addAll((Collection) wp0.a().a.stream().map(new mp(3)).collect(Collectors.toList()));
    }

    @Override // defpackage.vp0
    public final CompletionStage a(me0 me0Var) {
        ForkJoinPool forkJoinPoolCommonPool = ForkJoinPool.commonPool();
        ut utVar = new ut(this, me0Var);
        return utVar.b(forkJoinPoolCommonPool).handle(new st(utVar, forkJoinPoolCommonPool, 0)).thenCompose(Function.identity());
    }

    @Override // defpackage.vp0
    public final Duration b() {
        return this.c;
    }

    public final String toString() {
        return "ExtendedResolver of " + this.a;
    }
}
