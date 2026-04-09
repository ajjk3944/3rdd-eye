package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class Q3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f36180a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f36181b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f36182c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ A3 f36183d;

    Q3(A3 a32, String str, String str2, String str3) {
        this.f36180a = str;
        this.f36181b = str2;
        this.f36182c = str3;
        this.f36183d = a32;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f36183d.f35772a.K0();
        return this.f36183d.f35772a.v0().R(this.f36180a, this.f36181b, this.f36182c);
    }
}
