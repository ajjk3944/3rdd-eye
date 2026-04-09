package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tt implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f16943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ut f16944c;

    public /* synthetic */ tt(ut utVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i4) {
        this.f16942a = i4;
        this.f16943b = uncaughtExceptionHandler;
        this.f16944c = utVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        switch (this.f16942a) {
            case 0:
                uncaughtExceptionHandler = this.f16943b;
                try {
                    try {
                        this.f16944c.g(th2);
                    } catch (Throwable unused) {
                        za.i.e("AdMob exception reporter failed reporting the exception.");
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th2);
                        return;
                    }
                    return;
                } finally {
                }
            default:
                uncaughtExceptionHandler = this.f16943b;
                try {
                    try {
                        this.f16944c.g(th2);
                    } catch (Throwable unused2) {
                        za.i.e("AdMob exception reporter failed reporting the exception.");
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th2);
                        return;
                    }
                    return;
                } finally {
                }
        }
    }
}
