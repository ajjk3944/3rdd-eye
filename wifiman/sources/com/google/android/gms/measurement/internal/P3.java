package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class P3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f36166a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f36167b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f36168c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ A3 f36169d;

    P3(A3 a32, String str, String str2, String str3) {
        this.f36166a = str;
        this.f36167b = str2;
        this.f36168c = str3;
        this.f36169d = a32;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f36169d.f35772a.K0();
        return this.f36169d.f35772a.v0().I0(this.f36166a, this.f36167b, this.f36168c);
    }
}
