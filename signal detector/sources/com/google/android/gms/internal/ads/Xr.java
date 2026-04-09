package com.google.android.gms.internal.ads;

import android.os.Bundle;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Xr implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12505a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12506b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12507c;

    public /* synthetic */ Xr(Object obj, boolean z6, int i) {
        this.f12505a = i;
        this.f12506b = obj;
        this.f12507c = z6;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final void b(Object obj) {
        switch (this.f12505a) {
            case 0:
                String str = (String) this.f12506b;
                C0797Wj c0797Wj = (C0797Wj) obj;
                if (str != null) {
                    Bundle bundleA = AbstractC0582Jp.a("pii", c0797Wj.f12308a);
                    bundleA.putString("afai", str);
                    bundleA.putBoolean("is_afai_lat", this.f12507c);
                    break;
                }
                break;
            case 1:
                Bundle bundle = ((C0797Wj) obj).f12308a;
                bundle.putString("gct", (String) this.f12506b);
                if (this.f12507c) {
                    bundle.putString("de", "1");
                    break;
                }
                break;
            default:
                Bundle bundle2 = ((C0797Wj) obj).f12308a;
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.k6)).booleanValue()) {
                    bundle2.putBoolean("app_switched", this.f12507c);
                }
                q2.g1 g1Var = (q2.g1) this.f12506b;
                if (g1Var != null) {
                    int i = g1Var.f23223a;
                    if (i != 1) {
                        if (i == 2) {
                            bundle2.putString("avo", "l");
                            break;
                        }
                    } else {
                        bundle2.putString("avo", "p");
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void d(Object obj) {
        switch (this.f12505a) {
            case 1:
                ((C0797Wj) obj).f12309b.putString("gct", (String) this.f12506b);
                break;
        }
    }
}
