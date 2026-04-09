package fj;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyDisplayInfo;
import com.opensignal.sdk.data.telephony.TelephonyPhoneStateListener;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l extends PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8933b;

    public /* synthetic */ l(int i10, Object obj) {
        this.f8932a = i10;
        this.f8933b = obj;
    }

    @Override // android.telephony.PhoneStateListener
    public void onCellInfoChanged(List list) {
        switch (this.f8932a) {
            case 0:
                ch.n.b("TelephonyPhoneStateListener", "onCellInfoChanged");
                ch.n.a();
                TelephonyPhoneStateListener telephonyPhoneStateListener = (TelephonyPhoneStateListener) this.f8933b;
                TelephonyPhoneStateListener.k(telephonyPhoneStateListener, new ah.d(telephonyPhoneStateListener, 15, list));
                break;
            default:
                super.onCellInfoChanged(list);
                break;
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onCellLocationChanged(CellLocation cellLocation) {
        switch (this.f8932a) {
            case 0:
                ch.n.b("TelephonyPhoneStateListener", "onCellLocationChanged() called");
                ch.n.a();
                TelephonyPhoneStateListener telephonyPhoneStateListener = (TelephonyPhoneStateListener) this.f8933b;
                TelephonyPhoneStateListener.k(telephonyPhoneStateListener, new ah.d(telephonyPhoneStateListener, 16, cellLocation));
                break;
            default:
                super.onCellLocationChanged(cellLocation);
                break;
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onDataConnectionStateChanged(int i10) {
        switch (this.f8932a) {
            case 1:
                super.onDataConnectionStateChanged(i10);
                fl.b bVar = (fl.b) this.f8933b;
                ServiceState serviceState = bVar.f8985w;
                if (serviceState != null) {
                    fl.b.j(bVar, serviceState);
                    break;
                }
                break;
            default:
                super.onDataConnectionStateChanged(i10);
                break;
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        switch (this.f8932a) {
            case 0:
                br.l.e(telephonyDisplayInfo, "telephonyDisplayInfo");
                ch.n.b("TelephonyPhoneStateListener", "onTelephonyDisplayInfo");
                ch.n.a();
                TelephonyPhoneStateListener telephonyPhoneStateListener = (TelephonyPhoneStateListener) this.f8933b;
                TelephonyPhoneStateListener.k(telephonyPhoneStateListener, new ah.d(telephonyPhoneStateListener, 17, telephonyDisplayInfo));
                break;
            case 1:
            default:
                super.onDisplayInfoChanged(telephonyDisplayInfo);
                break;
            case 2:
                ch.n.b("CustomNetworkTypeObserver", "onDisplayInfoChanged()");
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                oh.e.a((oh.e) this.f8933b, overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
                break;
            case 3:
                int overrideNetworkType2 = telephonyDisplayInfo.getOverrideNetworkType();
                qb.p.a((qb.p) this.f8933b, overrideNetworkType2 == 3 || overrideNetworkType2 == 4 ? 10 : 5);
                break;
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        switch (this.f8932a) {
            case 0:
                br.l.e(serviceState, "serviceState");
                ch.n.b("TelephonyPhoneStateListener", "onServiceStateChanged");
                ch.n.a();
                TelephonyPhoneStateListener telephonyPhoneStateListener = (TelephonyPhoneStateListener) this.f8933b;
                TelephonyPhoneStateListener.k(telephonyPhoneStateListener, new ah.d(telephonyPhoneStateListener, 18, serviceState));
                break;
            case 1:
                super.onServiceStateChanged(serviceState);
                Objects.toString(serviceState);
                if (serviceState != null) {
                    fl.b bVar = (fl.b) this.f8933b;
                    bVar.f8985w = serviceState;
                    fl.b.j(bVar, serviceState);
                    break;
                }
                break;
            case 2:
                ch.n.b("CustomNetworkTypeObserver", "onServiceStateChanged()");
                String string = serviceState == null ? "" : serviceState.toString();
                oh.e.a((oh.e) this.f8933b, string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
                break;
            default:
                String string2 = serviceState == null ? "" : serviceState.toString();
                qb.p.a((qb.p) this.f8933b, string2.contains("nrState=CONNECTED") || string2.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
                break;
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        switch (this.f8932a) {
            case 0:
                br.l.e(signalStrength, "signalStrength");
                ch.n.b("TelephonyPhoneStateListener", "onSignalStrengthsChanged");
                ch.n.a();
                TelephonyPhoneStateListener telephonyPhoneStateListener = (TelephonyPhoneStateListener) this.f8933b;
                TelephonyPhoneStateListener.k(telephonyPhoneStateListener, new ah.d(telephonyPhoneStateListener, 19, signalStrength));
                break;
            case 1:
                fl.b bVar = (fl.b) this.f8933b;
                super.onSignalStrengthsChanged(signalStrength);
                Objects.toString(signalStrength);
                if (signalStrength != null) {
                    bVar.getClass();
                }
                ServiceState serviceState = bVar.f8985w;
                if (serviceState != null) {
                    fl.b.j(bVar, serviceState);
                    break;
                }
                break;
            default:
                super.onSignalStrengthsChanged(signalStrength);
                break;
        }
    }
}
