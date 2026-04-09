package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
class V2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final C4833d7 f36230a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f36231b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36232c;

    V2(C4833d7 c4833d7) {
        AbstractC7901p.l(c4833d7);
        this.f36230a = c4833d7;
    }

    public final void b() {
        this.f36230a.L0();
        this.f36230a.zzl().j();
        if (this.f36231b) {
            return;
        }
        this.f36230a.zza().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f36232c = this.f36230a.z0().x();
        this.f36230a.zzj().G().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f36232c));
        this.f36231b = true;
    }

    public final void c() {
        this.f36230a.L0();
        this.f36230a.zzl().j();
        this.f36230a.zzl().j();
        if (this.f36231b) {
            this.f36230a.zzj().G().a("Unregistering connectivity change receiver");
            this.f36231b = false;
            this.f36232c = false;
            try {
                this.f36230a.zza().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f36230a.zzj().C().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f36230a.L0();
        String action = intent.getAction();
        this.f36230a.zzj().G().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f36230a.zzj().H().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zX = this.f36230a.z0().x();
        if (this.f36232c != zX) {
            this.f36232c = zX;
            this.f36230a.zzl().z(new U2(this, zX));
        }
    }
}
