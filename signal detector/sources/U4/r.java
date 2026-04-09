package U4;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.widget.TextView;
import com.apm.insight.R;
import com.lefan.signal.ui.phone.PhoneFragment;
import java.util.List;

/* loaded from: classes.dex */
public final class r extends PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PhoneFragment f3764b;

    public /* synthetic */ r(PhoneFragment phoneFragment, int i) {
        this.f3763a = i;
        this.f3764b = phoneFragment;
    }

    @Override // android.telephony.PhoneStateListener
    public void onCellInfoChanged(List list) {
        switch (this.f3763a) {
            case 0:
                PhoneFragment.X(this.f3764b, list);
                break;
            default:
                super.onCellInfoChanged(list);
                break;
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        int networkType;
        int networkType2;
        switch (this.f3763a) {
            case 0:
                super.onServiceStateChanged(serviceState);
                PhoneFragment phoneFragment = this.f3764b;
                TextView textView = phoneFragment.f19113C0;
                if (textView != null) {
                    Context contextM = phoneFragment.m();
                    TelephonyManager telephonyManager = phoneFragment.f19137s0;
                    int simState = telephonyManager != null ? telephonyManager.getSimState() : 0;
                    String string = null;
                    if (contextM != null) {
                        switch (simState) {
                            case 1:
                                string = contextM.getString(R.string.sim_absent);
                                break;
                            case 2:
                                string = contextM.getString(R.string.sim_pin_required);
                                break;
                            case 3:
                                string = contextM.getString(R.string.sim_puk_required);
                                break;
                            case 4:
                                string = contextM.getString(R.string.sim_network_locked);
                                break;
                            case 5:
                                string = contextM.getString(R.string.sim_ready);
                                break;
                            case 6:
                                string = contextM.getString(R.string.sim_not_ready);
                                break;
                            case 7:
                                string = contextM.getString(R.string.sim_perm_sidabled);
                                break;
                            case 8:
                                string = contextM.getString(R.string.sim_card_io_error);
                                break;
                            case 9:
                                string = contextM.getString(R.string.sim_card_restricted);
                                break;
                        }
                    }
                    textView.setText(string);
                }
                Context contextM2 = phoneFragment.m();
                String str = phoneFragment.f19131m0;
                q5.i.e(str, "string");
                if (contextM2 != null && G.c.a(contextM2, str) == 0) {
                    String str2 = "5G";
                    if (Build.VERSION.SDK_INT < 24) {
                        TextView textView2 = phoneFragment.f19114D0;
                        if (textView2 != null) {
                            TelephonyManager telephonyManager2 = phoneFragment.f19137s0;
                            networkType = telephonyManager2 != null ? telephonyManager2.getNetworkType() : 0;
                            if (networkType != 20) {
                                switch (networkType) {
                                    case 1:
                                    case 2:
                                    case 4:
                                    case 7:
                                    case 11:
                                        str2 = "2G";
                                        break;
                                    case 3:
                                    case 5:
                                    case 6:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 12:
                                    case 14:
                                    case 15:
                                        str2 = "3G";
                                        break;
                                    case 13:
                                        str2 = "4G";
                                        break;
                                    default:
                                        str2 = "--";
                                        break;
                                }
                            }
                            textView2.setText(str2);
                            break;
                        }
                    } else {
                        TextView textView3 = phoneFragment.f19114D0;
                        if (textView3 != null) {
                            TelephonyManager telephonyManager3 = phoneFragment.f19137s0;
                            networkType = telephonyManager3 != null ? telephonyManager3.getDataNetworkType() : 0;
                            if (networkType != 20) {
                                switch (networkType) {
                                    case 1:
                                    case 2:
                                    case 4:
                                    case 7:
                                    case 11:
                                        str2 = "2G";
                                        break;
                                    case 3:
                                    case 5:
                                    case 6:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 12:
                                    case 14:
                                    case 15:
                                        str2 = "3G";
                                        break;
                                    case 13:
                                        str2 = "4G";
                                        break;
                                    default:
                                        str2 = "--";
                                        break;
                                }
                            }
                            textView3.setText(str2);
                            break;
                        }
                    }
                }
                break;
            default:
                super.onServiceStateChanged(serviceState);
                PhoneFragment phoneFragment2 = this.f3764b;
                TextView textView4 = phoneFragment2.f19113C0;
                if (textView4 != null) {
                    Context contextM3 = phoneFragment2.m();
                    TelephonyManager telephonyManager4 = phoneFragment2.f19137s0;
                    int simState2 = telephonyManager4 != null ? telephonyManager4.getSimState() : 0;
                    String string2 = null;
                    if (contextM3 != null) {
                        switch (simState2) {
                            case 1:
                                string2 = contextM3.getString(R.string.sim_absent);
                                break;
                            case 2:
                                string2 = contextM3.getString(R.string.sim_pin_required);
                                break;
                            case 3:
                                string2 = contextM3.getString(R.string.sim_puk_required);
                                break;
                            case 4:
                                string2 = contextM3.getString(R.string.sim_network_locked);
                                break;
                            case 5:
                                string2 = contextM3.getString(R.string.sim_ready);
                                break;
                            case 6:
                                string2 = contextM3.getString(R.string.sim_not_ready);
                                break;
                            case 7:
                                string2 = contextM3.getString(R.string.sim_perm_sidabled);
                                break;
                            case 8:
                                string2 = contextM3.getString(R.string.sim_card_io_error);
                                break;
                            case 9:
                                string2 = contextM3.getString(R.string.sim_card_restricted);
                                break;
                        }
                    }
                    textView4.setText(string2);
                }
                Context contextM4 = phoneFragment2.m();
                String str3 = phoneFragment2.f19131m0;
                q5.i.e(str3, "string");
                if (contextM4 != null && G.c.a(contextM4, str3) == 0) {
                    String str4 = "5G";
                    if (Build.VERSION.SDK_INT < 24) {
                        TextView textView5 = phoneFragment2.f19114D0;
                        if (textView5 != null) {
                            TelephonyManager telephonyManager5 = phoneFragment2.f19137s0;
                            networkType2 = telephonyManager5 != null ? telephonyManager5.getNetworkType() : 0;
                            if (networkType2 != 20) {
                                switch (networkType2) {
                                    case 1:
                                    case 2:
                                    case 4:
                                    case 7:
                                    case 11:
                                        str4 = "2G";
                                        break;
                                    case 3:
                                    case 5:
                                    case 6:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 12:
                                    case 14:
                                    case 15:
                                        str4 = "3G";
                                        break;
                                    case 13:
                                        str4 = "4G";
                                        break;
                                    default:
                                        str4 = "--";
                                        break;
                                }
                            }
                            textView5.setText(str4);
                            break;
                        }
                    } else {
                        TextView textView6 = phoneFragment2.f19114D0;
                        if (textView6 != null) {
                            TelephonyManager telephonyManager6 = phoneFragment2.f19137s0;
                            networkType2 = telephonyManager6 != null ? telephonyManager6.getDataNetworkType() : 0;
                            if (networkType2 != 20) {
                                switch (networkType2) {
                                    case 1:
                                    case 2:
                                    case 4:
                                    case 7:
                                    case 11:
                                        str4 = "2G";
                                        break;
                                    case 3:
                                    case 5:
                                    case 6:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 12:
                                    case 14:
                                    case 15:
                                        str4 = "3G";
                                        break;
                                    case 13:
                                        str4 = "4G";
                                        break;
                                    default:
                                        str4 = "--";
                                        break;
                                }
                            }
                            textView6.setText(str4);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        switch (this.f3763a) {
            case 0:
                super.onSignalStrengthsChanged(signalStrength);
                PhoneFragment.Y(this.f3764b, signalStrength);
                break;
            default:
                super.onSignalStrengthsChanged(signalStrength);
                PhoneFragment.Y(this.f3764b, signalStrength);
                break;
        }
    }
}
