package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class R3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f36190a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f36191b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f36192c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ A3 f36193d;

    R3(A3 a32, String str, String str2, String str3) {
        this.f36190a = str;
        this.f36191b = str2;
        this.f36192c = str3;
        this.f36193d = a32;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f36193d.f35772a.K0();
        return this.f36193d.f35772a.v0().R(this.f36190a, this.f36191b, this.f36192c);
    }
}
