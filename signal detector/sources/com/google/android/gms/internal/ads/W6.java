package com.google.android.gms.internal.ads;

import java.io.IOException;
import n2.C2687b;

/* loaded from: classes.dex */
public final class W6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X6 f12164b;

    public /* synthetic */ W6(X6 x6, int i) {
        this.f12163a = i;
        this.f12164b = x6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12163a) {
            case 0:
                X6 x6 = this.f12164b;
                x6.getClass();
                try {
                    if (x6.f12380f == null && x6.f12381g) {
                        C2687b c2687b = new C2687b(x6.f12375a, 30000L, false);
                        c2687b.d(true);
                        x6.f12380f = c2687b;
                        break;
                    }
                } catch (J2.g | IOException unused) {
                    x6.f12380f = null;
                    return;
                }
                break;
            default:
                H9.a(this.f12164b.f12375a);
                break;
        }
    }
}
