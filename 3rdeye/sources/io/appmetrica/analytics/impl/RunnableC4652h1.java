package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4652h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f40985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f40986b;

    public RunnableC4652h1(C4859p1 c4859p1, List list) {
        this.f40986b = c4859p1;
        this.f40985a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1.a(this.f40986b).reportAnr(CollectionUtils.getMapFromList(this.f40985a));
    }
}
