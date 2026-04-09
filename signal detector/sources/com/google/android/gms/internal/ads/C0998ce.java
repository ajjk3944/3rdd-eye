package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.ce, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0998ce implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f13586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1053de f13587c;

    public /* synthetic */ C0998ce(C1053de c1053de, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.f13585a = i;
        this.f13586b = uncaughtExceptionHandler;
        this.f13587c = c1053de;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        switch (this.f13585a) {
            case 0:
                uncaughtExceptionHandler = this.f13586b;
                try {
                    try {
                        this.f13587c.g(th);
                    } catch (Throwable unused) {
                        u2.k.e("AdMob exception reporter failed reporting the exception.");
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    return;
                } finally {
                }
            default:
                uncaughtExceptionHandler = this.f13586b;
                try {
                    try {
                        this.f13587c.g(th);
                    } catch (Throwable unused2) {
                        u2.k.e("AdMob exception reporter failed reporting the exception.");
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    return;
                } finally {
                }
        }
    }
}
