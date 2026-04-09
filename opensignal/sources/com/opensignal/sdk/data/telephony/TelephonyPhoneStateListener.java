package com.opensignal.sdk.data.telephony;

import ag.b;
import android.annotation.SuppressLint;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import ar.a;
import as.x;
import ch.f;
import ch.i;
import ch.n;
import fj.k;
import fj.t;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import lq.q;
import xj.j;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opensignal/sdk/data/telephony/TelephonyPhoneStateListener;", "Lfj/t;", "com.opensignal_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class TelephonyPhoneStateListener extends t {

    /* renamed from: h, reason: collision with root package name */
    public final TelephonyManager f5858h;

    /* renamed from: i, reason: collision with root package name */
    public final f f5859i;
    public final b j;
    public final i k;

    /* renamed from: l, reason: collision with root package name */
    public final Executor f5860l;

    /* renamed from: m, reason: collision with root package name */
    public final q f5861m;

    public TelephonyPhoneStateListener(TelephonyManager telephonyManager, f fVar, b bVar, j jVar, i iVar, Executor executor) {
        super(jVar);
        this.f5858h = telephonyManager;
        this.f5859i = fVar;
        this.j = bVar;
        this.k = iVar;
        this.f5860l = executor;
        this.f5861m = kc.f.F(new x(21, this));
    }

    public static final void k(TelephonyPhoneStateListener telephonyPhoneStateListener, a aVar) {
        try {
            telephonyPhoneStateListener.f5860l.execute(new k(aVar, 0));
        } catch (Throwable th2) {
            n.e("TelephonyPhoneStateListener", th2);
        }
    }

    @Override // fj.t
    public final void h() {
        f fVar = this.f5859i;
        boolean zG = fVar.g();
        int i10 = fVar.f3941a;
        int i11 = 1048833;
        b bVar = this.j;
        if (zG) {
            n.b("TelephonyPhoneStateListener", h0.b.m("API 31+ (", i10, ") AND"));
            if (this.k.f3951f || bVar.i("android.permission.READ_PHONE_STATE")) {
                n.b("TelephonyPhoneStateListener", "App targeting API 31+ or permission granted: listening for LISTEN_DISPLAY_INFO_CHANGED");
            } else {
                n.b("TelephonyPhoneStateListener", "App NOT targeting API 31+ and permission is not granted: LISTEN_DISPLAY_INFO_CHANGED not available");
                i11 = 257;
            }
        } else if (fVar.f()) {
            n.b("TelephonyPhoneStateListener", h0.b.m("API 30+ (", i10, ") AND"));
            if (bVar.i("android.permission.READ_PHONE_STATE")) {
                n.b("TelephonyPhoneStateListener", "READ_PHONE_STATE granted: listening for LISTEN_DISPLAY_INFO_CHANGED");
            } else {
                n.b("TelephonyPhoneStateListener", "READ_PHONE_STATE NOT granted: LISTEN_DISPLAY_INFO_CHANGED not available");
                i11 = 257;
            }
        } else if (28 > i10 || i10 >= 30) {
            i11 = 257;
        } else {
            n.b("TelephonyPhoneStateListener", h0.b.m("API 28 or 29 (", i10, "): listening for LISTEN_PHYSICAL_CHANNEL_CONFIGURATION"));
        }
        if (bVar.i("android.permission.ACCESS_FINE_LOCATION")) {
            bVar.i("android.permission.READ_PHONE_STATE");
        }
        TelephonyManager telephonyManager = this.f5858h;
        if (telephonyManager != null) {
            telephonyManager.listen((PhoneStateListener) this.f5861m.getValue(), i11);
        }
    }

    @Override // fj.t
    public final void i() {
        TelephonyManager telephonyManager = this.f5858h;
        if (telephonyManager != null) {
            telephonyManager.listen((PhoneStateListener) this.f5861m.getValue(), 0);
        }
    }
}
