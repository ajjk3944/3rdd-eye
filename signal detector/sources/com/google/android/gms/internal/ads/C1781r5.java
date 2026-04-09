package com.google.android.gms.internal.ads;

import java.util.function.Supplier;

/* renamed from: com.google.android.gms.internal.ads.r5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1781r5 implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16465a;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C1781r5 f16464c = new C1781r5(1);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1781r5 f16463b = new C1781r5(0);

    public /* synthetic */ C1781r5(int i) {
        this.f16465a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f16465a != 0 ? E5.a(null) : new C1943u5();
    }
}
