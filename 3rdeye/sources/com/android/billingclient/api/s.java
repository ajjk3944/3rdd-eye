package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzhe;
import v3.C5675a;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18708a;

    /* renamed from: b, reason: collision with root package name */
    public v3.h f18709b;

    public final void a(zzhe zzheVar) {
        if (this.f18708a) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((y3.t) this.f18709b).a(new C5675a(zzheVar, v3.e.DEFAULT, null), new androidx.work.s());
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingLogger", "logging failed.");
        }
    }
}
