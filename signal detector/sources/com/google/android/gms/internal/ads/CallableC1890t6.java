package com.google.android.gms.internal.ads;

import android.content.Context;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.t6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC1890t6 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16855a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16856b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16857c;

    public /* synthetic */ CallableC1890t6(Object obj, int i, Object obj2) {
        this.f16855a = i;
        this.f16856b = obj;
        this.f16857c = obj2;
    }

    private final Object a() {
        C0657Of c0657Of;
        C1431kf c1431kf = (C1431kf) this.f16856b;
        C1807re c1807re = (C1807re) this.f16857c;
        C1227gp c1227gp = (C1227gp) c1431kf.f15175d;
        synchronized (c1227gp.f15280b) {
            try {
                if (c1227gp.f15281c) {
                    c0657Of = c1227gp.f15279a;
                } else {
                    c1227gp.f15281c = true;
                    c1227gp.f15283e = c1807re;
                    c1227gp.f15284f.n();
                    C0657Of c0657Of2 = c1227gp.f15279a;
                    c0657Of2.f10212a.a(new RunnableC0558Ii(13, c1227gp), AbstractC0640Nf.f10011g);
                    AbstractC1441kp.b(c1227gp.f14379h, c0657Of2, c1227gp.i);
                    c0657Of = c0657Of2;
                }
            } finally {
            }
        }
        return (C1818rp) c0657Of.f10212a.get(((Integer) C2841s.f23267e.f23270c.a(H9.t6)).intValue(), TimeUnit.SECONDS);
    }

    private final /* synthetic */ Object b() {
        C2043vy c2043vy = (C2043vy) this.f16856b;
        Object obj = this.f16857c;
        synchronized (c2043vy) {
            File file = c2043vy.f17372a;
            AbstractC0582Jp.x(file);
            String parent = file.getParent();
            String name = file.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 5);
            sb.append(name);
            sb.append(".temp");
            File file2 = new File(parent, sb.toString());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    c2043vy.f17374c.d(obj, fileOutputStream);
                    fileOutputStream.close();
                    if (!file2.renameTo(c2043vy.f17372a)) {
                        throw new IOException("Failed to rename file.");
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e6) {
                file2.delete();
                throw e6;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0251  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, com.google.android.gms.internal.ads.C0736Sq {
        /*
            Method dump skipped, instructions count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CallableC1890t6.call():java.lang.Object");
    }

    public CallableC1890t6(Context context, Rx rx) {
        this.f16855a = 2;
        this.f16857c = context;
        Objects.requireNonNull(rx);
        this.f16856b = rx;
    }
}
