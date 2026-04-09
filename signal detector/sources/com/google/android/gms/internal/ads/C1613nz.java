package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.nz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1613nz implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15852a;

    /* renamed from: b, reason: collision with root package name */
    public final C1907tN f15853b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f15854c;

    /* renamed from: d, reason: collision with root package name */
    public final C1907tN f15855d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f15856e;

    public /* synthetic */ C1613nz(C1907tN c1907tN, C1799rN c1799rN, C1799rN c1799rN2, C1907tN c1907tN2, int i) {
        this.f15852a = i;
        this.f15853b = c1907tN;
        this.f15854c = c1799rN;
        this.f15856e = c1799rN2;
        this.f15855d = c1907tN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f15852a) {
            case 0:
                return new C1559mz((S5) this.f15853b.f16902a, (Map) this.f15855d.f16902a, (Xx) this.f15854c.c(), (C1948uA) this.f15856e.c());
            case 1:
                return new C1828rz((S5) this.f15853b.f16902a, (C1291hz) this.f15854c.c(), (Map) this.f15855d.f16902a, (C1948uA) this.f15856e.c());
            case 2:
                return new C2152xz((Context) this.f15853b.f16902a, (C1948uA) this.f15854c.c(), (Yy) this.f15856e.c(), (Xx) this.f15855d.f16902a);
            case 3:
                return new C1463lA((Context) this.f15853b.f16902a, (C1948uA) this.f15854c.c(), (Xx) this.f15855d.f16902a, (ID) this.f15856e.c());
            default:
                return new C1463lA((Context) this.f15853b.f16902a, (C1948uA) this.f15854c.c(), (ID) this.f15856e.c(), (Xx) this.f15855d.f16902a);
        }
    }

    public /* synthetic */ C1613nz(C1907tN c1907tN, C1799rN c1799rN, C1907tN c1907tN2, C1799rN c1799rN2, int i) {
        this.f15852a = i;
        this.f15853b = c1907tN;
        this.f15854c = c1799rN;
        this.f15855d = c1907tN2;
        this.f15856e = c1799rN2;
    }

    public C1613nz(C1907tN c1907tN, C1907tN c1907tN2, C1907tN c1907tN3, C1799rN c1799rN) {
        this.f15852a = 0;
        this.f15853b = c1907tN;
        this.f15855d = c1907tN2;
        this.f15854c = c1907tN3;
        this.f15856e = c1799rN;
    }
}
