package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class Oy implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Py f10285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10286b;

    public /* synthetic */ Oy(Py py, int i) {
        this.f10285a = py;
        this.f10286b = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.f10286b - 1;
        Py py = this.f10285a;
        if (i == 1) {
            return (My) py.f10541a.c();
        }
        if (i == 2) {
            return (My) py.f10542b.c();
        }
        if (i == 3) {
            return (My) py.f10543c.c();
        }
        py.getClass();
        throw new IllegalArgumentException();
    }
}
