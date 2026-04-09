package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class Rh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f40065b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4927ri f40066c;

    public Rh(C4927ri c4927ri, String str, List list) {
        this.f40066c = c4927ri;
        this.f40064a = str;
        this.f40065b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f40066c;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).reportEvent(this.f40064a, CollectionUtils.getMapFromList(this.f40065b));
    }
}
