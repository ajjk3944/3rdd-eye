package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.gt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1231gt {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f14396b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f14397a;

    public C1231gt(Handler handler) {
        this.f14397a = handler;
    }

    public static /* synthetic */ void f(C0959bt c0959bt) {
        ArrayList arrayList = f14396b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(c0959bt);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C0959bt g() {
        C0959bt c0959bt;
        ArrayList arrayList = f14396b;
        synchronized (arrayList) {
            try {
                c0959bt = arrayList.isEmpty() ? new C0959bt() : (C0959bt) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0959bt;
    }

    public final boolean a() {
        return this.f14397a.hasMessages(37);
    }

    public final C0959bt b(int i, Object obj) {
        C0959bt c0959btG = g();
        c0959btG.f13478a = this.f14397a.obtainMessage(i, obj);
        return c0959btG;
    }

    public final boolean c(int i) {
        return this.f14397a.sendEmptyMessage(i);
    }

    public final void d(int i) {
        this.f14397a.removeMessages(i);
    }

    public final boolean e(Runnable runnable) {
        return this.f14397a.post(runnable);
    }
}
