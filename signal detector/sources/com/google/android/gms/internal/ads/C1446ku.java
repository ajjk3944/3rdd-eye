package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.google.android.gms.internal.ads.ku, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1446ku {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f15310a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    public final Callable f15311b;

    /* renamed from: c, reason: collision with root package name */
    public final ID f15312c;

    public C1446ku(CallableC1493ln callableC1493ln, ID id) {
        this.f15311b = callableC1493ln;
        this.f15312c = id;
    }

    public final synchronized void a(int i) {
        LinkedBlockingDeque linkedBlockingDeque = this.f15310a;
        int size = i - linkedBlockingDeque.size();
        for (int i3 = 0; i3 < size; i3++) {
            linkedBlockingDeque.add(((C0623Mf) this.f15312c).b(this.f15311b));
        }
    }

    public final synchronized InterfaceFutureC2326a b() {
        a(1);
        return (InterfaceFutureC2326a) this.f15310a.poll();
    }
}
