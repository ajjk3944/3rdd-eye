package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Vl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0782Vl implements InterfaceC0466Db {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12079a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f12080b;

    public /* synthetic */ C0782Vl(C0816Xl c0816Xl, int i) {
        this.f12079a = i;
        switch (i) {
            case 1:
                this.f12080b = new WeakReference(c0816Xl);
                break;
            default:
                this.f12080b = new WeakReference(c0816Xl);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
    public final void e(Object obj, Map map) {
        switch (this.f12079a) {
            case 0:
                C0816Xl c0816Xl = (C0816Xl) this.f12080b.get();
                if (c0816Xl != null) {
                    C2030vl c2030vl = c0816Xl.i;
                    if ("_ac".equals((String) map.get("eventName"))) {
                        c0816Xl.f12479h.onAdClicked();
                        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Xb)).booleanValue()) {
                            c2030vl.L();
                            if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                                c2030vl.M();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                C0816Xl c0816Xl2 = (C0816Xl) this.f12080b.get();
                if (c0816Xl2 != null) {
                    C2030vl c2030vl2 = c0816Xl2.i;
                    c0816Xl2.f12479h.onAdClicked();
                    if (((Boolean) C2841s.f23267e.f23270c.a(H9.Xb)).booleanValue()) {
                        c2030vl2.L();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            c2030vl2.M();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
