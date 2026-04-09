package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ju, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1392ju {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0637Nc f15016a;

    public C1392ju(InterfaceC0637Nc interfaceC0637Nc) {
        this.f15016a = interfaceC0637Nc;
    }

    public final boolean a() throws C1123eu {
        try {
            return this.f15016a.l();
        } catch (Throwable th) {
            throw new C1123eu(th);
        }
    }

    public final void b(boolean z6) {
        try {
            this.f15016a.O1(z6);
        } catch (Throwable th) {
            throw new C1123eu(th);
        }
    }
}
