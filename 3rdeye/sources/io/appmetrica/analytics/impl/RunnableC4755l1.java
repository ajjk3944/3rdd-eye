package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.l1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4755l1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f41163b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f41164c;

    public RunnableC4755l1(C4859p1 c4859p1, String str, List list) {
        this.f41164c = c4859p1;
        this.f41162a = str;
        this.f41163b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1.a(this.f41164c).reportEvent(this.f41162a, CollectionUtils.getMapFromList(this.f41163b));
    }
}
