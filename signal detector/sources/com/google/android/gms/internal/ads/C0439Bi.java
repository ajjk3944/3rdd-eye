package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.Bi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0439Bi implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7391a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f7392b;

    /* renamed from: c, reason: collision with root package name */
    public final C2190yj f7393c;

    public /* synthetic */ C0439Bi(C2190yj c2190yj, InterfaceC2069wN interfaceC2069wN, int i) {
        this.f7391a = i;
        this.f7393c = c2190yj;
        this.f7392b = interfaceC2069wN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f7391a) {
            case 0:
                return new C0422Ai(this.f7393c.a(), ((C0659Oh) this.f7392b).c());
            case 1:
                return new C0763Uj(this.f7393c.a());
            case 2:
                return new C2192yl(this.f7393c.a(), (C2202yv) this.f7392b.c());
            case 3:
                return new C1976ul((Context) this.f7392b.c(), new HashSet(), this.f7393c.a());
            default:
                return new C1816rn((C2191yk) this.f7392b.c(), this.f7393c.a());
        }
    }

    public /* synthetic */ C0439Bi(C1799rN c1799rN, C2190yj c2190yj, int i) {
        this.f7391a = i;
        this.f7392b = c1799rN;
        this.f7393c = c2190yj;
    }
}
