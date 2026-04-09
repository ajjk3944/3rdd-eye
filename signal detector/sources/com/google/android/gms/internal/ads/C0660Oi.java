package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Oi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660Oi implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10214a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f10215b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f10216c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f10217d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f10218e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2069wN f10219f;

    public /* synthetic */ C0660Oi(Object obj, C1799rN c1799rN, C1799rN c1799rN2, C1799rN c1799rN3, Object obj2, int i) {
        this.f10214a = i;
        this.f10215b = (InterfaceC2069wN) obj;
        this.f10216c = c1799rN;
        this.f10217d = c1799rN2;
        this.f10218e = c1799rN3;
        this.f10219f = (InterfaceC2069wN) obj2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.f10214a) {
            case 0:
                return new C0643Ni((C0501Fc) this.f10215b.c(), (C0592Ki) this.f10216c.c(), (Executor) this.f10217d.c(), (C0575Ji) this.f10218e.c(), (Q2.a) this.f10219f.c());
            case 1:
                return new C0817Xm((Executor) this.f10215b.c(), (C0694Qi) this.f10216c.c(), (C1976ul) this.f10217d.c(), (C2189yi) this.f10218e.c(), (C0712Rj) this.f10219f.c());
            case 2:
                return new Zw((Context) this.f10215b.c(), (InterfaceC0908ax) this.f10216c.c(), (Cw) this.f10217d.c(), (Bw) this.f10218e.c(), ((Xx) this.f10219f.c()).V());
            default:
                return new Nz((Zw) this.f10215b.c(), (Wz) this.f10216c.c(), (InterfaceC1195gA) this.f10217d.c(), (C1948uA) this.f10218e.c(), (ExecutorService) this.f10219f.c());
        }
    }
}
