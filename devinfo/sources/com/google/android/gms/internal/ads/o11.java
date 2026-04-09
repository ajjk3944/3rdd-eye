package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class o11 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p11 f14512b;

    public /* synthetic */ o11(p11 p11Var, int i4) {
        this.f14511a = i4;
        this.f14512b = p11Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14511a) {
            case 0:
                w01 w01Var = this.f14512b.f14858a;
                zy0 zy0VarB = w01Var.b(1);
                if (zy0VarB == null) {
                    w01Var.f17816e.b(15315);
                    return null;
                }
                String strA = zy0VarB.A().A();
                File fileB = mq0.b(strA, "pcam.jar", w01Var.c());
                fileB.getClass();
                if (!fileB.exists()) {
                    fileB = mq0.b(strA, "pcam", w01Var.c());
                    fileB.getClass();
                }
                File fileB2 = mq0.b(strA, "pcopt", w01Var.c());
                fileB2.getClass();
                File fileB3 = mq0.b(strA, "pcbc", w01Var.c());
                fileB3.getClass();
                return new xv0(zy0VarB.A(), fileB, fileB3, fileB2);
            default:
                zy0 zy0VarB2 = this.f14512b.f14858a.b(1);
                return zy0VarB2 == null ? zy0.F() : zy0VarB2;
        }
    }
}
