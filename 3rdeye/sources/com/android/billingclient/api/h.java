package com.android.billingclient.api;

import Q9.C1553s;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzhd;
import com.google.android.gms.internal.play_billing.zzhe;
import com.google.android.gms.internal.play_billing.zzhl;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class h implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18653a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public boolean f18654b = false;

    /* renamed from: c, reason: collision with root package name */
    public BillingClientStateListener f18655c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f18656d;

    public /* synthetic */ h(a aVar, BillingClientStateListener billingClientStateListener) {
        this.f18656d = aVar;
        this.f18655c = billingClientStateListener;
    }

    public final void a(BillingResult billingResult) {
        synchronized (this.f18653a) {
            try {
                BillingClientStateListener billingClientStateListener = this.f18655c;
                if (billingClientStateListener != null) {
                    billingClientStateListener.onBillingSetupFinished(billingResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service connected.");
        this.f18656d.f18620g = com.google.android.gms.internal.play_billing.zzr.zzu(iBinder);
        Callable callable = new Callable() { // from class: com.android.billingclient.api.zzaz
            /* JADX WARN: Removed duplicated region for block: B:127:0x0191  */
            /* JADX WARN: Removed duplicated region for block: B:130:0x01b4  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x01c0  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x01cf  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 480
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzaz.call():java.lang.Object");
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzba
            @Override // java.lang.Runnable
            public final void run() {
                h hVar = this.zza;
                hVar.f18656d.f18614a = 0;
                hVar.f18656d.f18620g = null;
                BillingResult billingResult = r.f18694m;
                hVar.f18656d.f(zzcb.zza(24, 6, billingResult));
                hVar.a(billingResult);
            }
        };
        a aVar = this.f18656d;
        if (aVar.e(callable, 30000L, runnable, aVar.a()) == null) {
            a aVar2 = this.f18656d;
            BillingResult billingResultC = aVar2.c();
            aVar2.f(zzcb.zza(25, 6, billingResultC));
            a(billingResultC);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing service disconnected.");
        C1553s c1553s = this.f18656d.f18619f;
        zzhl zzhlVarZzz = zzhl.zzz();
        c1553s.getClass();
        if (zzhlVarZzz != null) {
            try {
                zzhd zzhdVarZzy = zzhe.zzy();
                zzhdVarZzy.zzn((zzgu) c1553s.f11527b);
                zzhdVarZzy.zzo(zzhlVarZzz);
                ((s) c1553s.f11528c).a((zzhe) zzhdVarZzy.zzf());
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
            }
        }
        this.f18656d.f18620g = null;
        this.f18656d.f18614a = 0;
        synchronized (this.f18653a) {
            try {
                BillingClientStateListener billingClientStateListener = this.f18655c;
                if (billingClientStateListener != null) {
                    billingClientStateListener.onBillingServiceDisconnected();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
