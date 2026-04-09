package com.google.android.gms.internal.ads;

import j$.util.Objects;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.o8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1623o8 implements T7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15903a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15904b;

    public C1623o8(C1677p8 c1677p8) {
        Objects.requireNonNull(c1677p8);
        this.f15904b = c1677p8;
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final void g0(boolean z6) {
        switch (this.f15903a) {
            case 0:
                C1677p8 c1677p8 = (C1677p8) this.f15904b;
                if (!z6) {
                    c1677p8.s();
                    break;
                } else {
                    c1677p8.y();
                    break;
                }
            case 1:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8865z)).booleanValue()) {
                    ((Cv) this.f15904b).b(z6);
                    break;
                }
                break;
            default:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8865z)).booleanValue()) {
                    ((Iv) this.f15904b).c(z6);
                    break;
                }
                break;
        }
    }

    public C1623o8(Cv cv) {
        Objects.requireNonNull(cv);
        this.f15904b = cv;
    }

    public C1623o8(Iv iv) {
        Objects.requireNonNull(iv);
        this.f15904b = iv;
    }
}
