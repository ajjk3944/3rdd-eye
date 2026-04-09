package N4;

import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import d5.AbstractC2283k;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class q extends k3.f {

    /* renamed from: A0, reason: collision with root package name */
    public c1.g f3031A0;

    /* renamed from: B0, reason: collision with root package name */
    public final D4.a f3032B0 = new D4.a(R.layout.item_wifi_info, 3);

    /* renamed from: C0, reason: collision with root package name */
    public final ArrayList f3033C0 = new ArrayList();

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        String str;
        PackageManager packageManager;
        Integer numValueOf = Integer.valueOf(R.string.to_ap_rtt);
        q5.i.e(layoutInflater, "inflater");
        final int i3 = 0;
        View viewInflate = layoutInflater.inflate(R.layout.dialog_bottom_wifi_manager, viewGroup, false);
        int i6 = R.id.close_btn;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a4.p.e(R.id.close_btn, viewInflate);
        if (appCompatImageView != null) {
            i6 = R.id.sim_info_recycler;
            RecyclerView recyclerView = (RecyclerView) a4.p.e(R.id.sim_info_recycler, viewInflate);
            if (recyclerView != null) {
                i6 = R.id.wifi_manager_cancel;
                MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.wifi_manager_cancel, viewInflate);
                if (materialButton != null) {
                    this.f3031A0 = new c1.g((LinearLayout) viewInflate, appCompatImageView, recyclerView, materialButton, 5);
                    Context contextM = m();
                    WifiManager wifiManager = (WifiManager) (contextM != null ? contextM.getSystemService("wifi") : null);
                    int i7 = Build.VERSION.SDK_INT;
                    Context contextM2 = m();
                    ConnectivityManager connectivityManager = contextM2 != null ? (ConnectivityManager) contextM2.getSystemService(ConnectivityManager.class) : null;
                    c1.g gVar = this.f3031A0;
                    q5.i.b(gVar);
                    ((MaterialButton) gVar.f5899e).setOnClickListener(new View.OnClickListener(this) { // from class: N4.o

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ q f3027b;

                        {
                            this.f3027b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i3) {
                                case 0:
                                    this.f3027b.X();
                                    break;
                                default:
                                    this.f3027b.X();
                                    break;
                            }
                        }
                    });
                    c1.g gVar2 = this.f3031A0;
                    q5.i.b(gVar2);
                    final int i8 = 1;
                    ((AppCompatImageView) gVar2.f5897c).setOnClickListener(new View.OnClickListener(this) { // from class: N4.o

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ q f3027b;

                        {
                            this.f3027b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i8) {
                                case 0:
                                    this.f3027b.X();
                                    break;
                                default:
                                    this.f3027b.X();
                                    break;
                            }
                        }
                    });
                    c1.g gVar3 = this.f3031A0;
                    q5.i.b(gVar3);
                    RecyclerView recyclerView2 = (RecyclerView) gVar3.f5898d;
                    D4.a aVar = this.f3032B0;
                    recyclerView2.setAdapter(aVar);
                    ArrayList arrayList = this.f3033C0;
                    aVar.p(arrayList);
                    aVar.f4672f = new F4.c(4, this);
                    String strR = r(R.string.string_state);
                    q5.i.d(strR, "getString(...)");
                    Integer numValueOf2 = wifiManager != null ? Integer.valueOf(wifiManager.getWifiState()) : null;
                    arrayList.add(new p(strR, (numValueOf2 != null && numValueOf2.intValue() == 2) ? r(R.string.wifi_enabling) : (numValueOf2 != null && numValueOf2.intValue() == 3) ? r(R.string.wifi_enabled) : (numValueOf2 != null && numValueOf2.intValue() == 1) ? r(R.string.wifi_disabled) : (numValueOf2 != null && numValueOf2.intValue() == 0) ? r(R.string.wifi_disabling) : r(R.string.string_unknown), null));
                    if (i7 >= 30) {
                        ArrayList arrayList2 = new ArrayList();
                        if (wifiManager != null && wifiManager.isWifiStandardSupported(7)) {
                            arrayList2.add("WiGig");
                        }
                        if (wifiManager != null && wifiManager.isWifiStandardSupported(8)) {
                            arrayList2.add("Wi-Fi7");
                        }
                        if (wifiManager != null && wifiManager.isWifiStandardSupported(6)) {
                            arrayList2.add("Wi-Fi6");
                        }
                        if (wifiManager != null && wifiManager.isWifiStandardSupported(5)) {
                            arrayList2.add("Wi-Fi5");
                        }
                        if (wifiManager != null && wifiManager.isWifiStandardSupported(4)) {
                            arrayList2.add("Wi-Fi4");
                        }
                        if (wifiManager != null && wifiManager.isWifiStandardSupported(1)) {
                            arrayList2.add("Wi-Fi3");
                        }
                        if (!arrayList2.isEmpty()) {
                            String strR2 = r(R.string.support_wifi_standard);
                            q5.i.d(strR2, "getString(...)");
                            arrayList.add(new p(strR2, arrayList2.toString(), null));
                        }
                    }
                    if (i7 >= 31) {
                        LinkProperties linkProperties = connectivityManager != null ? connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork()) : null;
                        if (linkProperties != null) {
                            Iterator<LinkAddress> it = linkProperties.getLinkAddresses().iterator();
                            while (it.hasNext()) {
                                InetAddress address = it.next().getAddress();
                                int i9 = i3;
                                if (address instanceof Inet4Address) {
                                    Inet4Address inet4Address = (Inet4Address) address;
                                    if (!inet4Address.isLoopbackAddress() && inet4Address.isSiteLocalAddress()) {
                                        arrayList.add(new p("IP", inet4Address.getHostAddress(), null));
                                    }
                                }
                                i3 = i9;
                            }
                            i = i3;
                            String strR3 = r(R.string.gateway);
                            q5.i.d(strR3, "getString(...)");
                            Inet4Address dhcpServerAddress = linkProperties.getDhcpServerAddress();
                            arrayList.add(new p(strR3, dhcpServerAddress != null ? dhcpServerAddress.getHostAddress() : null, null));
                            List<InetAddress> dnsServers = linkProperties.getDnsServers();
                            q5.i.d(dnsServers, "getDnsServers(...)");
                            int i10 = i;
                            for (Object obj : dnsServers) {
                                int i11 = i10 + 1;
                                if (i10 < 0) {
                                    AbstractC2283k.O();
                                    throw null;
                                }
                                arrayList.add(new p(AbstractC1135f5.l(i11, "dns"), ((InetAddress) obj).getHostAddress(), null));
                                i10 = i11;
                            }
                            String strR4 = r(R.string.private_DNS);
                            q5.i.d(strR4, "getString(...)");
                            arrayList.add(new p(strR4, R2.a.k(Boolean.valueOf(linkProperties.isPrivateDnsActive()), "%b"), null));
                            String strR5 = r(R.string.support_WakeOnLAN);
                            q5.i.d(strR5, "getString(...)");
                            arrayList.add(new p(strR5, R2.a.k(Boolean.valueOf(linkProperties.isWakeOnLanSupported()), "%b"), null));
                        } else {
                            i = 0;
                        }
                    } else {
                        i = 0;
                        DhcpInfo dhcpInfo = wifiManager != null ? wifiManager.getDhcpInfo() : null;
                        if (dhcpInfo != null) {
                            arrayList.add(new p("IP", a4.p.i(Integer.valueOf(dhcpInfo.ipAddress)), null));
                            arrayList.add(new p("serverAddress", a4.p.i(Integer.valueOf(dhcpInfo.serverAddress)), null));
                            String strR6 = r(R.string.gateway);
                            q5.i.d(strR6, "getString(...)");
                            arrayList.add(new p(strR6, a4.p.i(Integer.valueOf(dhcpInfo.gateway)), null));
                            arrayList.add(new p("dns1", a4.p.i(Integer.valueOf(dhcpInfo.dns1)), null));
                            arrayList.add(new p("dns2", a4.p.i(Integer.valueOf(dhcpInfo.dns2)), null));
                            String strR7 = r(R.string.netmask);
                            q5.i.d(strR7, "getString(...)");
                            arrayList.add(new p(strR7, a4.p.i(Integer.valueOf(dhcpInfo.netmask)), null));
                            String strR8 = r(R.string.ip_configuration_mode);
                            q5.i.d(strR8, "getString(...)");
                            arrayList.add(new p(strR8, dhcpInfo.leaseDuration == 0 ? r(R.string.static_ip) : r(R.string.dynamic_ip), null));
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    if (wifiManager != null && wifiManager.is5GHzBandSupported()) {
                        arrayList3.add("5GHz");
                    }
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 30 && wifiManager != null && wifiManager.is6GHzBandSupported()) {
                        arrayList3.add("6GHz");
                    }
                    if (i12 >= 31) {
                        if (wifiManager != null && wifiManager.is24GHzBandSupported()) {
                            arrayList3.add("24GHz");
                        }
                        if (wifiManager != null && wifiManager.is60GHzBandSupported()) {
                            arrayList3.add("60GHz");
                        }
                        arrayList.add(new p("BridgedAp", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isBridgedApConcurrencySupported()) : null, "%b"), Integer.valueOf(R.string.bridged_ap)));
                        arrayList.add(new p("RFC", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isDecoratedIdentitySupported()) : null, "%b"), Integer.valueOf(R.string.rfc_7542)));
                    }
                    if (!arrayList3.isEmpty()) {
                        String strR9 = r(R.string.wifi_band_support);
                        q5.i.d(strR9, "getString(...)");
                        arrayList.add(new p(strR9, arrayList3.toString(), null));
                    }
                    if (i12 >= 29) {
                        Context contextM3 = m();
                        arrayList.add(new p("AP RTT", R2.a.k((contextM3 == null || (packageManager = contextM3.getPackageManager()) == null) ? null : Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.wifi.rtt")), "%b"), numValueOf));
                        arrayList.add(new p("EnhancedOpen", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isEnhancedOpenSupported()) : null, "%b"), Integer.valueOf(R.string.enhanced_open)));
                        arrayList.add(new p("EasyConnect", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isEasyConnectSupported()) : null, "%b"), Integer.valueOf(R.string.wifi_easy_connect)));
                    } else {
                        Boolean boolValueOf = wifiManager != null ? Boolean.valueOf(wifiManager.isDeviceToApRttSupported()) : null;
                        if (R2.a.f3390d) {
                            Locale locale = F4.e.f1457a;
                            Locale localeB = F4.e.b();
                            Object[] objArr = new Object[1];
                            objArr[i] = boolValueOf;
                            str = String.format(localeB, "%b", Arrays.copyOf(objArr, 1));
                        } else {
                            Locale locale2 = Locale.ENGLISH;
                            Object[] objArr2 = new Object[1];
                            objArr2[i] = boolValueOf;
                            str = String.format(locale2, "%b", Arrays.copyOf(objArr2, 1));
                        }
                        arrayList.add(new p("AP RTT", str, numValueOf));
                    }
                    if (i12 >= 34) {
                        arrayList.add(new p("DualBandSimultaneous", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isDualBandSimultaneousSupported()) : null, "%b"), Integer.valueOf(R.string.dual_band_simultaneous_support)));
                        arrayList.add(new p("TidToLinkMappingNegotiationSupported", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isTidToLinkMappingNegotiationSupported()) : null, "%b"), Integer.valueOf(R.string.tid_to_link_mapping_negotiation_support)));
                    }
                    arrayList.add(new p("PowerReporting", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isEnhancedPowerReportingSupported()) : null, "%b"), Integer.valueOf(R.string.power_reporting)));
                    if (i12 >= 33) {
                        arrayList.add(new p("EasyConnectDppAkmS", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isEasyConnectDppAkmSupported()) : null, "%b"), Integer.valueOf(R.string.easy_akms)));
                    }
                    if (i12 >= 31) {
                        arrayList.add(new p("DPP", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isEasyConnectEnrolleeResponderModeSupported()) : null, "%b"), Integer.valueOf(R.string.easy_dpp)));
                        arrayList.add(new p("MakeBeforeBreakWifiSwitching", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isMakeBeforeBreakWifiSwitchingSupported()) : null, "%b"), Integer.valueOf(R.string.make_before_switch)));
                    }
                    arrayList.add(new p("P2p", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isP2pSupported()) : null, "%b"), Integer.valueOf(R.string.wifi_p2p)));
                    if (i12 >= 31) {
                        arrayList.add(new p("PasspointTermsAndConditions", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isPasspointTermsAndConditionsSupported()) : null, "%b"), Integer.valueOf(R.string.passoint_term)));
                    }
                    arrayList.add(new p("PreferredNetworkOffload", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isPreferredNetworkOffloadSupported()) : null, "%b"), Integer.valueOf(R.string.preferred_net)));
                    if (i12 >= 30) {
                        arrayList.add(new p("StaApConcurrency", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isStaApConcurrencySupported()) : null, "%b"), Integer.valueOf(R.string.sta_ap_concurr)));
                    }
                    if (i12 >= 31) {
                        arrayList.add(new p("StaBridgedApConcurrency", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isStaBridgedApConcurrencySupported()) : null, "%b"), Integer.valueOf(R.string.sta_brid)));
                    }
                    if (i12 >= 31) {
                        arrayList.add(new p("StaConcurrencyForLocal", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isStaConcurrencyForLocalOnlyConnectionsSupported()) : null, "%b"), Integer.valueOf(R.string.sta_concurrency)));
                    }
                    arrayList.add(new p("Tdls", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isTdlsSupported()) : null, "%b"), Integer.valueOf(R.string.wifi_tdls)));
                    if (i12 >= 34) {
                        arrayList.add(new p("TlsV13", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isTlsV13Supported()) : null, "%b"), Integer.valueOf(R.string.is_tls_v13)));
                    }
                    if (i12 >= 33) {
                        arrayList.add(new p("TrustOnFirstUse", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isTrustOnFirstUseSupported()) : null, "%b"), Integer.valueOf(R.string.trust_on_first)));
                    }
                    if (i12 >= 30) {
                        arrayList.add(new p("Wapi", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isWapiSupported()) : null, "%b"), Integer.valueOf(R.string.wifi_wapi)));
                    }
                    if (i12 >= 31) {
                        arrayList.add(new p("WifiDisplayR2", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isWifiDisplayR2Supported()) : null, "%b"), Integer.valueOf(R.string.wifi_display2)));
                    }
                    if (i12 >= 33) {
                        arrayList.add(new p("Passpoint", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isWifiPasspointEnabled()) : null, "%b"), Integer.valueOf(R.string.wifi_passpoint)));
                    }
                    if (i12 >= 31) {
                        arrayList.add(new p("Wpa3SaeH2e", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isWpa3SaeH2eSupported()) : null, "%b"), Integer.valueOf(R.string.wap_sae_h2e)));
                        arrayList.add(new p("Wpa3SaePublicKey", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isWpa3SaePublicKeySupported()) : null, "%b"), Integer.valueOf(R.string.wap_sae_key)));
                    }
                    if (i12 >= 29) {
                        arrayList.add(new p("Wpa3Sae", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isWpa3SaeSupported()) : null, "%b"), Integer.valueOf(R.string.wpa_sae3)));
                        arrayList.add(new p("Wpa3Suite", R2.a.k(wifiManager != null ? Boolean.valueOf(wifiManager.isWpa3SuiteBSupported()) : null, "%b"), Integer.valueOf(R.string.wap_suite)));
                    }
                    c1.g gVar4 = this.f3031A0;
                    q5.i.b(gVar4);
                    LinearLayout linearLayout = (LinearLayout) gVar4.f5896b;
                    q5.i.d(linearLayout, "getRoot(...)");
                    return linearLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void D() {
        super.D();
        this.f3031A0 = null;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void K() {
        BottomSheetBehavior bottomSheetBehaviorH;
        super.K();
        Dialog dialog = this.v0;
        k3.e eVar = dialog instanceof k3.e ? (k3.e) dialog : null;
        if (eVar == null || (bottomSheetBehaviorH = eVar.h()) == null) {
            return;
        }
        DisplayMetrics displayMetrics = q().getDisplayMetrics();
        q5.i.d(displayMetrics, "getDisplayMetrics(...)");
        int i = displayMetrics.heightPixels;
        bottomSheetBehaviorH.f18157l = i > displayMetrics.widthPixels ? (i * 2) / 3 : (i * 4) / 5;
        bottomSheetBehaviorH.I(3);
        bottomSheetBehaviorH.f18134X = true;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final int a0() {
        return R.style.bottomDialog;
    }
}
