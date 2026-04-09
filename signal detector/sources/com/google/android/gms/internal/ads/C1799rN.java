package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1799rN implements InterfaceC2069wN, InterfaceC1692pN {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f16515c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC2069wN f16516a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f16517b = f16515c;

    public C1799rN(InterfaceC2069wN interfaceC2069wN) {
        this.f16516a = interfaceC2069wN;
    }

    public static C1799rN a(InterfaceC2069wN interfaceC2069wN) {
        return interfaceC2069wN instanceof C1799rN ? (C1799rN) interfaceC2069wN : new C1799rN(interfaceC2069wN);
    }

    public static InterfaceC1692pN b(InterfaceC2069wN interfaceC2069wN) {
        if (interfaceC2069wN instanceof InterfaceC1692pN) {
            return (InterfaceC1692pN) interfaceC2069wN;
        }
        interfaceC2069wN.getClass();
        return new C1799rN(interfaceC2069wN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        Object obj = this.f16517b;
        Object obj2 = f16515c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f16517b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objC = this.f16516a.c();
                Object obj4 = this.f16517b;
                if (obj4 != obj2 && obj4 != objC) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objC + ". This is likely due to a circular dependency.");
                }
                this.f16517b = objC;
                this.f16516a = null;
                return objC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
