package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.u3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4968u3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f36778a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4952s3 f36779b;

    public C4968u3(C4952s3 c4952s3, String str) {
        this.f36779b = c4952s3;
        AbstractC7901p.l(str);
        this.f36778a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.f36779b.zzj().C().b(this.f36778a, th2);
    }
}
