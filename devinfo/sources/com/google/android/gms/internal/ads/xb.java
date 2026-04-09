package com.google.android.gms.internal.ads;

import java.util.function.Supplier;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18342a;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ xb f18341c = new xb(1);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ xb f18340b = new xb(0);

    public /* synthetic */ xb(int i4) {
        this.f18342a = i4;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f18342a != 0 ? lc.a(null) : new ac();
    }
}
