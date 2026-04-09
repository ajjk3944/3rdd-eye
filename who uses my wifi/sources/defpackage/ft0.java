package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ft0 extends ht {
    public pk h;

    @Override // defpackage.lk
    public final void k(hk hkVar, Runnable runnable) {
        pk pkVar = this.h;
        AtomicLongFieldUpdater atomicLongFieldUpdater = pk.m;
        pkVar.c(runnable, o01.g);
    }
}
