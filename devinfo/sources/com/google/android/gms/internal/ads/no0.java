package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class no0 {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f14384b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f14385a;

    public no0(Handler handler) {
        this.f14385a = handler;
    }

    public static /* synthetic */ void f(io0 io0Var) {
        ArrayList arrayList = f14384b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(io0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static io0 g() {
        io0 io0Var;
        ArrayList arrayList = f14384b;
        synchronized (arrayList) {
            try {
                io0Var = arrayList.isEmpty() ? new io0() : (io0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return io0Var;
    }

    public final boolean a() {
        return this.f14385a.hasMessages(37);
    }

    public final io0 b(int i4, Object obj) {
        io0 io0VarG = g();
        io0VarG.f12403a = this.f14385a.obtainMessage(i4, obj);
        return io0VarG;
    }

    public final boolean c(int i4) {
        return this.f14385a.sendEmptyMessage(i4);
    }

    public final void d(int i4) {
        this.f14385a.removeMessages(i4);
    }

    public final boolean e(Runnable runnable) {
        return this.f14385a.post(runnable);
    }
}
