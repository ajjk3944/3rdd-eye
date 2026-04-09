package com.google.android.gms.internal.ads;

import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.bA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0922bA implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13324a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC2069wN f13325b;

    public static void a(C0922bA c0922bA, InterfaceC2069wN interfaceC2069wN) {
        if (c0922bA.f13325b != null) {
            throw new IllegalStateException();
        }
        c0922bA.f13325b = interfaceC2069wN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f13324a) {
            case 0:
                return new File(new File((File) this.f13325b.c(), "drgd"), "pcbc");
            case 1:
                return new File(new File((File) this.f13325b.c(), "drgd"), "pcam.jar.tmp");
            case 2:
                return new File(new File(new File((File) this.f13325b.c(), "drgd"), "v"), "pcam.jar");
            case 3:
                return new File(new File((File) this.f13325b.c(), "ocs"), "pmtd");
            case 4:
                return new File(new File((File) this.f13325b.c(), "ocs"), "pcbc");
            case 5:
                return new File(new File((File) this.f13325b.c(), "ocs"), "pcam.jar");
            case 6:
                return new C1625oA();
            default:
                InterfaceC2069wN interfaceC2069wN = this.f13325b;
                if (interfaceC2069wN != null) {
                    return interfaceC2069wN.c();
                }
                throw new IllegalStateException();
        }
    }

    public /* synthetic */ C0922bA(C1799rN c1799rN, int i) {
        this.f13324a = i;
        this.f13325b = c1799rN;
    }
}
