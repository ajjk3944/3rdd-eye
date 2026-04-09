package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ky0 {

    /* renamed from: a, reason: collision with root package name */
    public final File f13289a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f13290b;

    /* renamed from: c, reason: collision with root package name */
    public final jy0 f13291c;

    /* renamed from: d, reason: collision with root package name */
    public final Function f13292d;

    public ky0(File file, ExecutorService executorService, jy0 jy0Var, Function function) {
        this.f13289a = file;
        this.f13290b = executorService;
        this.f13291c = jy0Var;
        this.f13292d = function;
    }

    public final h91 a(Object obj) {
        return yo0.z(this.f13290b, new ae(10, this, obj));
    }
}
