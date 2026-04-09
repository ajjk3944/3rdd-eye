package wi;

import android.content.IntentFilter;
import ch.l;

/* loaded from: classes.dex */
public final class e extends a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final df.c f24535a = getServiceLocator().A();

    /* renamed from: d, reason: collision with root package name */
    public final js.e f24536d;

    public e() {
        l serviceLocator = getServiceLocator();
        if (serviceLocator.f3857m3 == null) {
            serviceLocator.f3857m3 = new js.e(22);
        }
        js.e eVar = serviceLocator.f3857m3;
        if (eVar != null) {
            this.f24536d = eVar;
        } else {
            br.l.l("_detailedWifiStateRepository");
            throw null;
        }
    }

    @Override // wi.f
    public final IntentFilter getIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        return intentFilter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r2.equals("android.net.wifi.STATE_CHANGE") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r2.equals("android.net.conn.CONNECTIVITY_CHANGE") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        r9 = (android.net.NetworkInfo) r9.getParcelableExtra("networkInfo");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        if (r9 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        r2 = r9.getType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r2 != 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        r3 = r9.getState();
        r9 = r9.getDetailedState();
        br.l.d(r9, "getDetailedState(...)");
        ch.n.b("ConnectivityChangedReceiver", "handleStateChangedAction() called with: state = " + r3 + ", detailedState = " + r9 + ", type = " + r2);
        r5.r0(r0, r9.toString(), r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    @Override // wi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceiveIntent(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            java.lang.String r8 = "ConnectivityChangedReceiver"
            ch.n.f(r8, r9)
            df.c r0 = r7.f24535a
            r0.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = r9.getAction()
            if (r2 == 0) goto Lcf
            int r3 = r2.hashCode()
            r4 = -1172645946(0xffffffffba1ad7c6, float:-5.9067865E-4)
            js.e r5 = r7.f24536d
            if (r3 == r4) goto L77
            r4 = -343630553(0xffffffffeb849d27, float:-3.2064068E26)
            if (r3 == r4) goto L6e
            r4 = 233521600(0xdeb41c0, float:1.4498822E-30)
            if (r3 == r4) goto L2b
            goto Lcf
        L2b:
            java.lang.String r3 = "android.net.wifi.supplicant.STATE_CHANGE"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L35
            goto Lcf
        L35:
            java.lang.String r2 = "newState"
            android.os.Parcelable r9 = r9.getParcelableExtra(r2)
            android.net.wifi.SupplicantState r9 = (android.net.wifi.SupplicantState) r9
            if (r9 != 0) goto L41
            goto Lce
        L41:
            android.net.NetworkInfo$DetailedState r2 = android.net.wifi.WifiInfo.getDetailedStateOf(r9)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "handleSupplicantStateChangedAction with State="
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r4 = ", supplicantState="
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            ch.n.b(r8, r3)
            java.lang.String r8 = r2.toString()
            java.lang.String r9 = r9.toString()
            r5.r0(r0, r8, r9)
            return
        L6e:
            java.lang.String r3 = "android.net.wifi.STATE_CHANGE"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L7f
            goto Lcf
        L77:
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lcf
        L7f:
            java.lang.String r2 = "networkInfo"
            android.os.Parcelable r9 = r9.getParcelableExtra(r2)
            android.net.NetworkInfo r9 = (android.net.NetworkInfo) r9
            if (r9 != 0) goto L8a
            goto Lce
        L8a:
            int r2 = r9.getType()
            r3 = 1
            if (r2 != r3) goto Lce
            android.net.NetworkInfo$State r3 = r9.getState()
            android.net.NetworkInfo$DetailedState r9 = r9.getDetailedState()
            java.lang.String r4 = "getDetailedState(...)"
            br.l.d(r9, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "handleStateChangedAction() called with: state = "
            r4.<init>(r6)
            r4.append(r3)
            java.lang.String r6 = ", detailedState = "
            r4.append(r6)
            r4.append(r9)
            java.lang.String r6 = ", type = "
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            ch.n.b(r8, r2)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = r3.toString()
            r5.r0(r0, r8, r9)
        Lce:
            return
        Lcf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown intent action - "
            r0.<init>(r1)
            java.lang.String r9 = r9.getAction()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            ch.n.b(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.e.onReceiveIntent(android.content.Context, android.content.Intent):void");
    }
}
