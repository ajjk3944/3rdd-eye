package com.google.android.gms.internal.ads;

import android.os.Bundle;
import q2.C2841s;
import q2.C2852x0;
import t2.C2909E;

/* renamed from: com.google.android.gms.internal.ads.Ep, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0497Ep implements InterfaceC0441Bk, InterfaceC1544mk {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8009c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int f8010d;

    /* renamed from: a, reason: collision with root package name */
    public final C2909E f8011a;

    /* renamed from: b, reason: collision with root package name */
    public final C0548Hp f8012b;

    public C0497Ep(C0548Hp c0548Hp, C2909E c2909e) {
        this.f8012b = c0548Hp;
        this.f8011a = c2909e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1544mk
    public final void D(C2852x0 c2852x0) {
        a(false);
    }

    public final void a(boolean z6) {
        int i;
        int iIntValue;
        E9 e9 = H9.W6;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && !this.f8011a.E()) {
            Object obj = f8009c;
            synchronized (obj) {
                i = f8010d;
                iIntValue = ((Integer) c2841s.f23270c.a(H9.X6)).intValue();
            }
            if (i < iIntValue) {
                C0548Hp c0548Hp = this.f8012b;
                Ju juA = c0548Hp.f9003d.a(new Bundle());
                juA.a(new CD(juA, 0, new P.g(c0548Hp, z6)), AbstractC0640Nf.f10011g);
                synchronized (obj) {
                    f8010d++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0441Bk
    public final void e() {
        a(true);
    }
}
