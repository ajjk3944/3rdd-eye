package wi;

import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class d extends a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24534a;

    public /* synthetic */ d(int i10) {
        this.f24534a = i10;
    }

    @Override // wi.f
    public final IntentFilter getIntentFilter() {
        switch (this.f24534a) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.net.wifi.STATE_CHANGE");
                intentFilter2.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                intentFilter2.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                return intentFilter2;
            case 2:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter3.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                return intentFilter3;
            case 3:
                IntentFilter intentFilter4 = new IntentFilter();
                intentFilter4.addAction("android.intent.action.ACTION_SHUTDOWN");
                return intentFilter4;
            case 4:
                IntentFilter intentFilter5 = new IntentFilter();
                intentFilter5.addAction("android.net.wifi.SCAN_RESULTS");
                return intentFilter5;
            default:
                IntentFilter intentFilter6 = new IntentFilter();
                intentFilter6.addAction("android.intent.action.SCREEN_ON");
                intentFilter6.addAction("android.intent.action.SCREEN_OFF");
                intentFilter6.addAction("android.intent.action.USER_PRESENT");
                return intentFilter6;
        }
    }

    @Override // wi.a
    /* renamed from: isExported */
    public boolean getIsExported() {
        switch (this.f24534a) {
            case 4:
                return false;
            default:
                return super.getIsExported();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r4.equals("android.intent.action.SCREEN_ON") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r4.equals("android.intent.action.SCREEN_OFF") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        r4 = getServiceLocator().z0();
        r5 = (io.sentry.internal.debugmeta.c) r4.f13730y;
        r0 = new java.lang.StringBuilder("State has changed to screenOn: ");
        r1 = r5.t();
        br.l.d(r1, "isScreenOn(...)");
        r0.append(r1.booleanValue());
        r0.append(" , screenLocked: ");
        r5 = r5.s();
        br.l.d(r5, "isScreenLocked(...)");
        r0.append(r5.booleanValue());
        r0.append(". Update data source");
        ch.n.b("ScreenStateTriggerDS", r0.toString());
        r4.a1();
     */
    @Override // wi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceiveIntent(android.content.Context r4, android.content.Intent r5) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.d.onReceiveIntent(android.content.Context, android.content.Intent):void");
    }
}
