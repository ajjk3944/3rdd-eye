package com.android.billingclient.api;

import Q9.C1553s;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18715a;

    /* renamed from: b, reason: collision with root package name */
    public final PurchasesUpdatedListener f18716b;

    /* renamed from: c, reason: collision with root package name */
    public final UserChoiceBillingListener f18717c;

    /* renamed from: d, reason: collision with root package name */
    public final C1553s f18718d;

    /* renamed from: e, reason: collision with root package name */
    public final v f18719e = new v(this, true);

    /* renamed from: f, reason: collision with root package name */
    public final v f18720f = new v(this, false);

    /* renamed from: g, reason: collision with root package name */
    public boolean f18721g;

    public w(Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, C1553s c1553s) {
        this.f18715a = context;
        this.f18716b = purchasesUpdatedListener;
        this.f18717c = userChoiceBillingListener;
        this.f18718d = c1553s;
    }

    public final void a(boolean z10) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f18721g = z10;
        this.f18720f.a(this.f18715a, intentFilter2);
        if (!this.f18721g) {
            this.f18719e.a(this.f18715a, intentFilter);
            return;
        }
        v vVar = this.f18719e;
        Context context = this.f18715a;
        synchronized (vVar) {
            try {
                if (vVar.f18712a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(vVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != vVar.f18713b ? 4 : 2);
                } else {
                    context.registerReceiver(vVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                vVar.f18712a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
