package defpackage;

import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ta extends zb {
    public static final String h = h80.f("BatteryChrgTracker");

    @Override // defpackage.oi
    public final Object a() {
        Intent intentRegisterReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            h80.d().b(h, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    @Override // defpackage.zb
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // defpackage.zb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.content.Intent r4) {
        /*
            r3 = this;
            java.lang.String r4 = r4.getAction()
            if (r4 != 0) goto L7
            goto L4d
        L7:
            h80 r0 = defpackage.h80.d()
            java.lang.String r1 = "Received "
            r1.concat(r4)
            r1 = 0
            java.lang.Throwable[] r2 = new java.lang.Throwable[r1]
            r0.a(r2)
            int r0 = r4.hashCode()
            r2 = -1
            switch(r0) {
                case -1886648615: goto L41;
                case -54942926: goto L36;
                case 948344062: goto L2b;
                case 1019184907: goto L20;
                default: goto L1e;
            }
        L1e:
            r1 = r2
            goto L4a
        L20:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L29
            goto L1e
        L29:
            r1 = 3
            goto L4a
        L2b:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L34
            goto L1e
        L34:
            r1 = 2
            goto L4a
        L36:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L3f
            goto L1e
        L3f:
            r1 = 1
            goto L4a
        L41:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L4a
            goto L1e
        L4a:
            switch(r1) {
                case 0: goto L60;
                case 1: goto L5a;
                case 2: goto L54;
                case 3: goto L4e;
                default: goto L4d;
            }
        L4d:
            return
        L4e:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.c(r4)
            return
        L54:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.c(r4)
            return
        L5a:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.c(r4)
            return
        L60:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta.g(android.content.Intent):void");
    }
}
