package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzlk;
import x3.t;

/* loaded from: classes.dex */
final class zzcn {
    private boolean zza;
    private u3.e zzb;

    public zzcn(Context context) {
        try {
            t.f(context);
            this.zzb = t.c().g(v3.a.f24710g).a("PLAY_BILLING_LIBRARY", zzlk.class, u3.b.b("proto"), new u3.d() { // from class: com.android.billingclient.api.zzcm
                @Override // u3.d
                public final Object apply(Object obj) {
                    return ((zzlk) obj).zzh();
                }
            });
        } catch (Throwable unused) {
            this.zza = true;
        }
    }

    public final void zza(zzlk zzlkVar) {
        if (this.zza) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.zzb.a(u3.c.d(zzlkVar));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingLogger", "logging failed.");
        }
    }
}
