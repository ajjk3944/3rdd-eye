package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ut {
    public final me0 a;
    public final int[] b;
    public final int c;
    public final long d;
    public final List e;
    public int f;

    public ut(wt wtVar, me0 me0Var) {
        ArrayList arrayList = new ArrayList(wtVar.a);
        this.e = arrayList;
        this.d = wtVar.c.toNanos() + System.nanoTime();
        i80 i80Var = wt.d;
        List list = (List) arrayList.stream().sorted(Comparator.comparingInt(new rt())).collect(Collectors.toList());
        this.e = list;
        this.b = new int[list.size()];
        this.c = wtVar.b;
        this.a = me0Var;
    }

    public final CompletionStage a(me0 me0Var, Throwable th, Executor executor) {
        int i = this.f;
        List list = this.e;
        AtomicInteger atomicInteger = ((vt) list.get(i)).b;
        if (th == null) {
            atomicInteger.updateAndGet(new tt());
            return CompletableFuture.completedFuture(me0Var);
        }
        i80 i80Var = wt.d;
        me0 me0Var2 = this.a;
        gg0 gg0Var = me0Var2.e().f;
        int i2 = me0Var2.e().g;
        bs0 bs0Var = k31.a;
        String strE = bs0Var.e(i2);
        Integer numValueOf = Integer.valueOf(me0Var2.f.f);
        Integer numValueOf2 = Integer.valueOf(this.f);
        ew0 ew0Var = ((vt) list.get(this.f)).a;
        int i3 = this.f;
        int[] iArr = this.b;
        Integer numValueOf3 = Integer.valueOf(iArr[i3]);
        int i4 = this.c;
        i80Var.e("Failed to resolve {}/{}, id={} with resolver {} ({}) on attempt {} of {}, reason={}", gg0Var, strE, numValueOf, numValueOf2, ew0Var, numValueOf3, Integer.valueOf(i4), th.getMessage());
        atomicInteger.incrementAndGet();
        if (this.d - System.nanoTime() >= 0) {
            int size = (this.f + 1) % list.size();
            this.f = size;
            if (iArr[size] < i4) {
                return b(executor).handle(new st(this, executor, 1)).thenCompose(Function.identity());
            }
            CompletableFuture completableFuture = new CompletableFuture();
            completableFuture.completeExceptionally(th);
            return completableFuture;
        }
        CompletableFuture completableFuture2 = new CompletableFuture();
        completableFuture2.completeExceptionally(new IOException("Timed out while trying to resolve " + me0Var2.e().f + "/" + bs0Var.e(me0Var2.e().g) + ", id=" + me0Var2.f.f));
        return completableFuture2;
    }

    public final CompletionStage b(Executor executor) {
        vt vtVar = (vt) this.e.get(this.f);
        i80 i80Var = wt.d;
        me0 me0Var = this.a;
        gg0 gg0Var = me0Var.e().f;
        String strE = k31.a.e(me0Var.e().g);
        Integer numValueOf = Integer.valueOf(me0Var.f.f);
        Integer numValueOf2 = Integer.valueOf(this.f);
        ew0 ew0Var = vtVar.a;
        int i = this.f;
        int[] iArr = this.b;
        i80Var.e("Sending {}/{}, id={} to resolver {} ({}), attempt {} of {}", gg0Var, strE, numValueOf, numValueOf2, ew0Var, Integer.valueOf(iArr[i] + 1), Integer.valueOf(this.c));
        int i2 = this.f;
        iArr[i2] = iArr[i2] + 1;
        return vtVar.a.f(me0Var, executor);
    }
}
