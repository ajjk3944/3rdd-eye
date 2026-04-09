package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f39057a;

    /* renamed from: b, reason: collision with root package name */
    public final p9.l f39058b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39059c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f39060d;

    public f(e eVar, p9.l lVar, String str, SafePackageManager safePackageManager) {
        this.f39057a = eVar;
        this.f39058b = lVar;
        this.f39059c = str;
        this.f39060d = safePackageManager;
    }

    public final Object a(Context context) throws g {
        IBinder iBinder;
        e eVar;
        if (this.f39060d.resolveService(context, this.f39057a.f39054a, 0) == null) {
            throw new l(B4.f.c(new StringBuilder("could not resolve "), this.f39059c, " services"));
        }
        try {
            eVar = this.f39057a;
        } catch (Throwable unused) {
        }
        if (context.bindService(eVar.f39054a, eVar, 1)) {
            e eVar2 = this.f39057a;
            if (eVar2.f39055b == null) {
                synchronized (eVar2.f39056c) {
                    if (eVar2.f39055b == null) {
                        try {
                            eVar2.f39056c.wait(3000L);
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
            }
            iBinder = eVar2.f39055b;
        } else {
            iBinder = null;
        }
        if (iBinder != null) {
            return this.f39058b.invoke(iBinder);
        }
        throw new g(B4.f.c(new StringBuilder("could not bind to "), this.f39059c, " services"));
    }

    public final void b(Context context) {
        try {
            this.f39057a.a(context);
        } catch (Throwable unused) {
        }
    }

    public f(Intent intent, p9.l lVar, String str) {
        this(new e(intent, str), lVar, str, new SafePackageManager());
    }
}
