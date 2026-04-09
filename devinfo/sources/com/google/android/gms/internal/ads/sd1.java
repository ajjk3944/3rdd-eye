package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sd1 implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f15992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f15993b;

    public sd1(ud1 ud1Var, List list, List list2) {
        this.f15992a = list;
        this.f15993b = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new td1(this.f15992a.iterator(), this.f15993b.iterator());
    }
}
