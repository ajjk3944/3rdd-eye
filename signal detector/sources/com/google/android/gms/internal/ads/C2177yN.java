package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2177yN implements InterfaceC2069wN {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f17713c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC1853sN f17714a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f17715b;

    public static InterfaceC2069wN a(InterfaceC1853sN interfaceC1853sN) {
        if ((interfaceC1853sN instanceof C2177yN) || (interfaceC1853sN instanceof C1799rN)) {
            return interfaceC1853sN;
        }
        C2177yN c2177yN = new C2177yN();
        c2177yN.f17715b = f17713c;
        c2177yN.f17714a = interfaceC1853sN;
        return c2177yN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        Object obj = this.f17715b;
        if (obj != f17713c) {
            return obj;
        }
        InterfaceC1853sN interfaceC1853sN = this.f17714a;
        if (interfaceC1853sN == null) {
            return this.f17715b;
        }
        Object objC = interfaceC1853sN.c();
        this.f17715b = objC;
        this.f17714a = null;
        return objC;
    }
}
