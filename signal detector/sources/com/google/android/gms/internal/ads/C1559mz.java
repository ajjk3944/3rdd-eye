package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.mz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1559mz implements InterfaceCallableC2044vz {

    /* renamed from: a, reason: collision with root package name */
    public final Map f15692a;

    /* renamed from: b, reason: collision with root package name */
    public final S5 f15693b;

    /* renamed from: c, reason: collision with root package name */
    public final C1894tA f15694c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15695d;

    public C1559mz(S5 s5, Map map, Xx xx, C1948uA c1948uA) {
        this.f15692a = map;
        this.f15693b = s5;
        this.f15694c = c1948uA.a(112);
        this.f15695d = xx.N();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1136f6 c1136f6;
        try {
            try {
                this.f15694c.a();
                InterfaceFutureC2326a interfaceFutureC2326a = (InterfaceFutureC2326a) this.f15692a.get("gs");
                if (interfaceFutureC2326a != null && (c1136f6 = (C1136f6) interfaceFutureC2326a.get(this.f15695d, TimeUnit.MILLISECONDS)) != null) {
                    S5 s5 = this.f15693b;
                    synchronized (s5) {
                        C1513m6 c1513m6A0 = c1136f6.A0();
                        s5.b();
                        ((C1136f6) s5.f13551b).o0(c1513m6A0);
                        long jX0 = c1136f6.x0();
                        s5.b();
                        ((C1136f6) s5.f13551b).X(jX0);
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e6) {
                this.f15694c.b(e6);
            }
            this.f15694c.c();
            return null;
        } catch (Throwable th) {
            this.f15694c.c();
            throw th;
        }
    }
}
