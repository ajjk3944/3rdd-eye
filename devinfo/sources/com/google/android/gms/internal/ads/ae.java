package com.google.android.gms.internal.ads;

import android.content.Context;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9309a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9310b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9311c;

    public /* synthetic */ ae(int i4, Object obj, Object obj2) {
        this.f9309a = i4;
        this.f9310b = obj;
        this.f9311c = obj2;
    }

    private final Object a() {
        gx gxVar;
        aw awVar = (aw) this.f9310b;
        iu iuVar = (iu) this.f9311c;
        dg0 dg0Var = (dg0) awVar.f9453d;
        synchronized (dg0Var.f11859b) {
            try {
                if (dg0Var.f11860c) {
                    gxVar = dg0Var.f11858a;
                } else {
                    dg0Var.f11860c = true;
                    dg0Var.f11862e = iuVar;
                    dg0Var.f11863f.n();
                    gx gxVar2 = dg0Var.f11858a;
                    gxVar2.f11625a.a(new s30(12, dg0Var), fx.g);
                    hg0.b(dg0Var.f10471h, gxVar2, dg0Var.f10472i);
                    gxVar = gxVar2;
                }
            } finally {
            }
        }
        return (pg0) gxVar.f11625a.get(((Integer) va.s.f36163e.f36166c.a(sk.f16337t6)).intValue(), TimeUnit.SECONDS);
    }

    private final /* synthetic */ Object b() {
        ky0 ky0Var = (ky0) this.f9310b;
        Object obj = this.f9311c;
        synchronized (ky0Var) {
            File file = ky0Var.f13289a;
            mq0.x(file);
            String parent = file.getParent();
            String name = file.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 5);
            sb2.append(name);
            sb2.append(".temp");
            File file2 = new File(parent, sb2.toString());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    ky0Var.f13291c.e(obj, fileOutputStream);
                    fileOutputStream.close();
                    if (!file2.renameTo(ky0Var.f13289a)) {
                        throw new IOException("Failed to rename file.");
                    }
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e2) {
                file2.delete();
                throw e2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0251  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, com.google.android.gms.internal.ads.qj0 {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ae.call():java.lang.Object");
    }

    public ae(ix0 ix0Var, Context context) {
        this.f9309a = 2;
        this.f9311c = context;
        Objects.requireNonNull(ix0Var);
        this.f9310b = ix0Var;
    }
}
