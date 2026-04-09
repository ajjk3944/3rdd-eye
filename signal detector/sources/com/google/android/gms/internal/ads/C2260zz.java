package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import f4.InterfaceFutureC2326a;

/* renamed from: com.google.android.gms.internal.ads.zz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2260zz implements My {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1692pN f17996a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1692pN f17997b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1692pN f17998c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17999d;

    /* renamed from: e, reason: collision with root package name */
    public final long f18000e;

    public C2260zz(InterfaceC1692pN interfaceC1692pN, InterfaceC1692pN interfaceC1692pN2, InterfaceC1692pN interfaceC1692pN3, boolean z6, long j6) {
        this.f17996a = interfaceC1692pN;
        this.f17997b = interfaceC1692pN2;
        this.f17998c = interfaceC1692pN3;
        this.f17999d = z6;
        this.f18000e = j6;
    }

    @Override // com.google.android.gms.internal.ads.My
    public final String a() {
        return ((Lz) this.f17997b.c()).a();
    }

    @Override // com.google.android.gms.internal.ads.My
    public final InterfaceFutureC2326a b(Context context, View view, Activity activity) {
        return ((Lz) this.f17997b.c()).b(context, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.My
    public final InterfaceFutureC2326a c() {
        boolean z6 = this.f17999d;
        EnumC2059wD enumC2059wD = EnumC2059wD.f17407a;
        if (z6) {
            final int i = 1;
            C1306iD c1306iDF = AbstractC1984ut.F(AbstractC1984ut.C(AbstractC2221zD.r(((Gz) this.f17996a.c()).a()), Throwable.class, C1563n2.f15729v, enumC2059wD), new InterfaceC1736qD(this) { // from class: com.google.android.gms.internal.ads.yz

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C2260zz f17805b;

                {
                    this.f17805b = this;
                }

                @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
                public final /* synthetic */ InterfaceFutureC2326a b(Object obj) {
                    switch (i) {
                        case 0:
                            return ((Lz) this.f17805b.f17997b.c()).c();
                        case 1:
                            return ((Vz) this.f17805b.f17998c.c()).a();
                        default:
                            return ((Lz) this.f17805b.f17997b.c()).c();
                    }
                }
            }, enumC2059wD);
            final int i3 = 2;
            return AbstractC1984ut.F(c1306iDF, new InterfaceC1736qD(this) { // from class: com.google.android.gms.internal.ads.yz

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C2260zz f17805b;

                {
                    this.f17805b = this;
                }

                @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
                public final /* synthetic */ InterfaceFutureC2326a b(Object obj) {
                    switch (i3) {
                        case 0:
                            return ((Lz) this.f17805b.f17997b.c()).c();
                        case 1:
                            return ((Vz) this.f17805b.f17998c.c()).a();
                        default:
                            return ((Lz) this.f17805b.f17997b.c()).c();
                    }
                }
            }, enumC2059wD);
        }
        final int i6 = 0;
        C1306iD c1306iDF2 = AbstractC1984ut.F(AbstractC1984ut.C(AbstractC2221zD.r(((Vz) this.f17998c.c()).a()), Throwable.class, C1563n2.f15730w, enumC2059wD), new InterfaceC1736qD(this) { // from class: com.google.android.gms.internal.ads.yz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C2260zz f17805b;

            {
                this.f17805b = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
            public final /* synthetic */ InterfaceFutureC2326a b(Object obj) {
                switch (i6) {
                    case 0:
                        return ((Lz) this.f17805b.f17997b.c()).c();
                    case 1:
                        return ((Vz) this.f17805b.f17998c.c()).a();
                    default:
                        return ((Lz) this.f17805b.f17997b.c()).c();
                }
            }
        }, enumC2059wD);
        c1306iDF2.a(new Fu(6, this), enumC2059wD);
        return c1306iDF2;
    }

    @Override // com.google.android.gms.internal.ads.My
    public final void d(InputEvent inputEvent) {
        ((Lz) this.f17997b.c()).d(inputEvent);
    }

    @Override // com.google.android.gms.internal.ads.My
    public final int e() {
        return ((Lz) this.f17997b.c()).e();
    }

    @Override // com.google.android.gms.internal.ads.My
    public final InterfaceFutureC2326a f(Context context) {
        return ((Lz) this.f17997b.c()).f(context);
    }

    @Override // com.google.android.gms.internal.ads.My
    public final InterfaceFutureC2326a g(Context context, View view, String str) {
        return ((Lz) this.f17997b.c()).g(context, view, str);
    }
}
