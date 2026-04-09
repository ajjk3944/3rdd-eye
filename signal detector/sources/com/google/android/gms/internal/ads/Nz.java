package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class Nz implements Lz {

    /* renamed from: a, reason: collision with root package name */
    public final Zw f10111a;

    /* renamed from: b, reason: collision with root package name */
    public final Wz f10112b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1195gA f10113c;

    /* renamed from: d, reason: collision with root package name */
    public final C1948uA f10114d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f10115e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f10116f = new AtomicReference("2.825731049.-1");

    public Nz(Zw zw, Wz wz, InterfaceC1195gA interfaceC1195gA, C1948uA c1948uA, ExecutorService executorService) {
        this.f10111a = zw;
        this.f10112b = wz;
        this.f10113c = interfaceC1195gA;
        this.f10114d = c1948uA;
        this.f10115e = executorService;
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final String a() {
        return (String) this.f10116f.get();
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final TD b(Context context, View view, Activity activity) {
        return AbstractC1984ut.z(new CallableC0647Nm(this, context, view, activity, 2), this.f10115e);
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final AbstractC2221zD c() {
        AbstractC2221zD abstractC2221zDR = AbstractC2221zD.r(this.f10112b.c());
        C1563n2 c1563n2 = C1563n2.f15709C;
        EnumC2059wD enumC2059wD = EnumC2059wD.f17407a;
        final int i = 0;
        C1306iD c1306iDF = AbstractC1984ut.F(AbstractC1984ut.G(AbstractC1984ut.C(abstractC2221zDR, Throwable.class, c1563n2, enumC2059wD), new NA(this) { // from class: com.google.android.gms.internal.ads.Mz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Nz f9933b;

            {
                this.f9933b = this;
            }

            @Override // com.google.android.gms.internal.ads.NA
            public final Object apply(Object obj) {
                switch (i) {
                    case 0:
                        Ly ly = (Ly) obj;
                        Nz nz = this.f9933b;
                        if (nz.f10113c.a(ly) && ly != null) {
                            return new Boolean(true);
                        }
                        nz.f10114d.b(15003);
                        throw new J0.c(1);
                    default:
                        Tw tw = (Tw) obj;
                        if (tw == null) {
                            throw new J0.c(3);
                        }
                        File file = tw.f11510b;
                        if (Build.VERSION.SDK_INT >= 34) {
                            file.setReadOnly();
                        }
                        Nz nz2 = this.f9933b;
                        nz2.f10114d.f(15002, new RunnableC0786Vp(nz2, 16, tw));
                        return new Boolean(true);
                }
            }
        }, enumC2059wD), new C0738Tb(16, this), enumC2059wD);
        final int i3 = 1;
        return AbstractC1984ut.G(AbstractC1984ut.G(c1306iDF, new NA(this) { // from class: com.google.android.gms.internal.ads.Mz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Nz f9933b;

            {
                this.f9933b = this;
            }

            @Override // com.google.android.gms.internal.ads.NA
            public final Object apply(Object obj) {
                switch (i3) {
                    case 0:
                        Ly ly = (Ly) obj;
                        Nz nz = this.f9933b;
                        if (nz.f10113c.a(ly) && ly != null) {
                            return new Boolean(true);
                        }
                        nz.f10114d.b(15003);
                        throw new J0.c(1);
                    default:
                        Tw tw = (Tw) obj;
                        if (tw == null) {
                            throw new J0.c(3);
                        }
                        File file = tw.f11510b;
                        if (Build.VERSION.SDK_INT >= 34) {
                            file.setReadOnly();
                        }
                        Nz nz2 = this.f9933b;
                        nz2.f10114d.f(15002, new RunnableC0786Vp(nz2, 16, tw));
                        return new Boolean(true);
                }
            }
        }, enumC2059wD), C1563n2.f15708B, enumC2059wD);
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final void d(InputEvent inputEvent) {
        Ww wwB = this.f10111a.b();
        C1948uA c1948uA = this.f10114d;
        if (wwB == null) {
            c1948uA.b(15004);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                wwB.h((MotionEvent) inputEvent);
            } catch (Xw e6) {
                c1948uA.d(15005, e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final int e() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final TD f(Context context) {
        return AbstractC1984ut.z(new CallableC1890t6(this, 12, context), this.f10115e);
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final TD g(Context context, View view, String str) {
        return AbstractC1984ut.z(new CallableC0647Nm(this, context, str, view, 3), this.f10115e);
    }
}
