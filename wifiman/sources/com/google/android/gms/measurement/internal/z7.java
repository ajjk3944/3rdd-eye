package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z7 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final C4976v3 f36916a;

    public z7(C4976v3 c4976v3) {
        this.f36916a = c4976v3;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f36916a.zzj().H().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f36916a.zzj().H().a("App receiver called with null action");
            return;
        }
        if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            final C4976v3 c4976v3 = this.f36916a;
            if (com.google.android.gms.internal.measurement.U6.a() && c4976v3.w().F(null, N.f36054W0)) {
                c4976v3.zzj().G().a("App receiver notified triggers are available");
                c4976v3.zzl().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.B7
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4976v3 c4976v32 = c4976v3;
                        if (!c4976v32.K().R0()) {
                            c4976v32.zzj().H().a("registerTrigger called but app not eligible");
                            return;
                        }
                        c4976v32.E().D0();
                        final C4945r4 c4945r4E = c4976v32.E();
                        Objects.requireNonNull(c4945r4E);
                        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.y7
                            @Override // java.lang.Runnable
                            public final void run() {
                                c4945r4E.F0();
                            }
                        }).start();
                    }
                });
                return;
            }
            return;
        }
        if (!action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
            this.f36916a.zzj().H().a("App receiver called with unknown action");
        } else if (this.f36916a.w().F(null, N.f36044R0)) {
            this.f36916a.zzj().G().a("[sgtm] App Receiver notified batches are available");
            this.f36916a.zzl().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.A7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35783a.f36916a.G().y(((Long) N.f36015D.a(null)).longValue());
                }
            });
        }
    }
}
