package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.yandex.mobile.ads.impl.z32;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public final class a42 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z32 f24438b;

    public a42(z32 z32Var) {
        this.f24438b = z32Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v32 v32VarB;
        long jA;
        while (true) {
            z32 z32Var = this.f24438b;
            synchronized (z32Var) {
                v32VarB = z32Var.b();
            }
            if (v32VarB == null) {
                return;
            }
            y32 y32VarD = v32VarB.d();
            kotlin.jvm.internal.l.c(y32VarD);
            z32 z32Var2 = this.f24438b;
            z32 z32Var3 = z32.f36157h;
            boolean zIsLoggable = z32.b.a().isLoggable(Level.FINE);
            if (zIsLoggable) {
                jA = y32VarD.h().d().a();
                w32.b(v32VarB, y32VarD, "starting");
            } else {
                jA = -1;
            }
            try {
                try {
                    z32Var2.b(v32VarB);
                    C1992A c1992a = C1992A.f18074a;
                    if (zIsLoggable) {
                        w32.b(v32VarB, y32VarD, "finished run in " + w32.a(y32VarD.h().d().a() - jA));
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (zIsLoggable) {
                    w32.b(v32VarB, y32VarD, "failed a run in " + w32.a(y32VarD.h().d().a() - jA));
                }
                throw th;
            }
        }
    }
}
