package com.mbridge.msdk.thrid.okhttp.internal;

/* loaded from: classes3.dex */
public abstract class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    protected final String f17625a;

    public b(String str, Object... objArr) {
        this.f17625a = c.a(str, objArr);
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f17625a);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
