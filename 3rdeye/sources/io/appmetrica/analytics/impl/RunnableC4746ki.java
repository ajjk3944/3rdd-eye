package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ki, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4746ki implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f41148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4927ri f41149b;

    public RunnableC4746ki(C4927ri c4927ri, List list) {
        this.f41149b = c4927ri;
        this.f41148a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f41149b;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).reportAnr(CollectionUtils.getMapFromList(this.f41148a));
    }
}
