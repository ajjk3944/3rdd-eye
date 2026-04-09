package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p90 implements oo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14927a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f14928b;

    public /* synthetic */ p90(r90 r90Var, int i4) {
        this.f14927a = i4;
        switch (i4) {
            case 1:
                this.f14928b = new WeakReference(r90Var);
                break;
            default:
                this.f14928b = new WeakReference(r90Var);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.oo
    public final void k(Object obj, Map map) {
        switch (this.f14927a) {
            case 0:
                r90 r90Var = (r90) this.f14928b.get();
                if (r90Var != null) {
                    s80 s80Var = r90Var.f15586i;
                    if ("_ac".equals((String) map.get("eventName"))) {
                        r90Var.f15585h.onAdClicked();
                        if (((Boolean) va.s.f36163e.f36166c.a(sk.Zb)).booleanValue()) {
                            s80Var.x();
                            if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                                s80Var.D();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                r90 r90Var2 = (r90) this.f14928b.get();
                if (r90Var2 != null) {
                    s80 s80Var2 = r90Var2.f15586i;
                    r90Var2.f15585h.onAdClicked();
                    if (((Boolean) va.s.f36163e.f36166c.a(sk.Zb)).booleanValue()) {
                        s80Var2.x();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            s80Var2.D();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
