package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class SD extends GD {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11155c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TD f11156d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11157e;

    public SD(TD td, InterfaceC1682pD interfaceC1682pD) {
        this.f11156d = td;
        this.f11157e = interfaceC1682pD;
    }

    @Override // com.google.android.gms.internal.ads.GD
    public final Object a() {
        int i = this.f11155c;
        Object obj = this.f11157e;
        switch (i) {
            case 0:
                InterfaceC1682pD interfaceC1682pD = (InterfaceC1682pD) obj;
                InterfaceFutureC2326a interfaceFutureC2326aA = interfaceC1682pD.a();
                if (interfaceFutureC2326aA != null) {
                    return interfaceFutureC2326aA;
                }
                throw new NullPointerException(Cr.E("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC1682pD));
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // com.google.android.gms.internal.ads.GD
    public final String c() {
        switch (this.f11155c) {
            case 0:
                return ((InterfaceC1682pD) this.f11157e).toString();
            default:
                return ((Callable) this.f11157e).toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.GD
    public final boolean d() {
        switch (this.f11155c) {
        }
        return this.f11156d.isDone();
    }

    @Override // com.google.android.gms.internal.ads.GD
    public final void e(Object obj) {
        switch (this.f11155c) {
            case 0:
                this.f11156d.m((InterfaceFutureC2326a) obj);
                break;
            default:
                this.f11156d.d(obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.GD
    public final void f(Throwable th) {
        switch (this.f11155c) {
            case 0:
                this.f11156d.e(th);
                break;
            default:
                this.f11156d.e(th);
                break;
        }
    }

    public SD(TD td, Callable callable) {
        this.f11156d = td;
        callable.getClass();
        this.f11157e = callable;
    }
}
