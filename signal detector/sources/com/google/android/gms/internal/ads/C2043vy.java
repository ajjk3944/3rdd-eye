package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* renamed from: com.google.android.gms.internal.ads.vy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2043vy {

    /* renamed from: a, reason: collision with root package name */
    public final File f17372a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f17373b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1989uy f17374c;

    /* renamed from: d, reason: collision with root package name */
    public final Function f17375d;

    public C2043vy(File file, ExecutorService executorService, InterfaceC1989uy interfaceC1989uy, Function function) {
        this.f17372a = file;
        this.f17373b = executorService;
        this.f17374c = interfaceC1989uy;
        this.f17375d = function;
    }

    public final TD a(Object obj) {
        return AbstractC1984ut.z(new CallableC1890t6(this, 10, obj), this.f17373b);
    }
}
