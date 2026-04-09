package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1146fG implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f14049a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f14050b;

    public C1146fG(C1255hG c1255hG, List list, List list2) {
        this.f14049a = list;
        this.f14050b = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1201gG(this.f14049a.iterator(), this.f14050b.iterator());
    }
}
