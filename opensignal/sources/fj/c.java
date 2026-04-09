package fj;

import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes.dex */
public class c extends TelephonyCallback implements TelephonyCallback.SignalStrengthsListener, TelephonyCallback.ServiceStateListener, TelephonyCallback.DisplayInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final j f8909a;

    public c(j jVar) {
        this.f8909a = jVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        br.l.e(telephonyDisplayInfo, "telephonyDisplayInfo");
        ch.n.b("DefaultTelephonyCallbac", "onTelephonyDisplayInfo - " + telephonyDisplayInfo);
        this.f8909a.onDisplayInfoChanged(telephonyDisplayInfo);
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        br.l.e(serviceState, "serviceState");
        ch.n.b("DefaultTelephonyCallbac", "onServiceStateChanged - " + serviceState);
        this.f8909a.f(serviceState);
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        br.l.e(signalStrength, "signalStrength");
        ch.n.b("DefaultTelephonyCallbac", "onSignalStrengthsChanged - " + signalStrength);
        this.f8909a.g(signalStrength);
    }
}
