package fl;

import a5.s;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import androidx.lifecycle.c0;
import ch.f;
import com.opensignal.sdk.common.measurements.base.e;
import com.staircase3.opensignal.models.NetworkUiState;
import com.staircase3.opensignal.utils.k;
import com.staircase3.opensignal.utils.m;
import com.staircase3.opensignal.utils.n;
import com.staircase3.opensignal.utils.o;
import fj.l;
import g4.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import mq.w;

/* loaded from: classes.dex */
public final class b extends c0 {
    public final Context k;

    /* renamed from: l, reason: collision with root package name */
    public final TelephonyManager f8974l;

    /* renamed from: m, reason: collision with root package name */
    public final ConnectivityManager f8975m;

    /* renamed from: n, reason: collision with root package name */
    public final WifiManager f8976n;

    /* renamed from: o, reason: collision with root package name */
    public final e f8977o;

    /* renamed from: p, reason: collision with root package name */
    public final f f8978p;

    /* renamed from: q, reason: collision with root package name */
    public final NetworkUiState f8979q;

    /* renamed from: r, reason: collision with root package name */
    public final qm.f f8980r;

    /* renamed from: s, reason: collision with root package name */
    public final String f8981s;

    /* renamed from: t, reason: collision with root package name */
    public final com.opensignal.sdk.common.measurements.base.f f8982t;

    /* renamed from: u, reason: collision with root package name */
    public final o f8983u;

    /* renamed from: v, reason: collision with root package name */
    public final k f8984v;

    /* renamed from: w, reason: collision with root package name */
    public ServiceState f8985w;

    /* renamed from: x, reason: collision with root package name */
    public final s f8986x;

    /* renamed from: y, reason: collision with root package name */
    public final l f8987y;

    public b(Context context, TelephonyManager telephonyManager, ConnectivityManager connectivityManager, WifiManager wifiManager, e eVar, f fVar, NetworkUiState networkUiState, qm.f fVar2, String str, com.opensignal.sdk.common.measurements.base.f fVar3, o oVar, k kVar) {
        br.l.e(context, "context");
        br.l.e(fVar, "deviceSdk");
        br.l.e(fVar2, "permissionsManager");
        br.l.e(oVar, "networkTypeUtils");
        br.l.e(kVar, "networkOperatorInfo");
        this.k = context;
        this.f8974l = telephonyManager;
        this.f8975m = connectivityManager;
        this.f8976n = wifiManager;
        this.f8977o = eVar;
        this.f8978p = fVar;
        this.f8979q = networkUiState;
        this.f8980r = fVar2;
        this.f8981s = str;
        this.f8982t = fVar3;
        this.f8983u = oVar;
        this.f8984v = kVar;
        this.f8986x = new s(4, this);
        this.f8987y = new l(1, this);
    }

    public static final void j(b bVar, ServiceState serviceState) {
        k kVar = bVar.f8984v;
        Objects.toString(serviceState);
        String str = bVar.f8981s;
        com.opensignal.sdk.common.measurements.base.f fVar = bVar.f8982t;
        Integer numB = bVar.f8977o.b(serviceState, str);
        if ((numB == null || numB.intValue() < 0) && fVar != null) {
            numB = fVar.B(serviceState);
        }
        TelephonyManager telephonyManager = bVar.f8974l;
        if (telephonyManager != null) {
            if (bVar.f8978p.e() && numB != null && numB.intValue() == 3) {
                bVar.k(20, dr.a.w(telephonyManager, kVar));
                return;
            }
            try {
                qm.f fVar2 = bVar.f8980r;
                Context context = bVar.k;
                fVar2.getClass();
                if (qm.f.c(context, "android.permission.READ_PHONE_STATE")) {
                    bVar.k(telephonyManager.getNetworkType(), dr.a.w(telephonyManager, kVar));
                    return;
                }
                String strW = dr.a.w(telephonyManager, kVar);
                ConnectivityManager connectivityManager = bVar.f8975m;
                Network[] allNetworks = connectivityManager.getAllNetworks();
                br.l.d(allNetworks, "getAllNetworks(...)");
                int length = allNetworks.length;
                int subtype = 0;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i10]);
                        if (networkInfo != null && networkInfo.getType() == 0) {
                            subtype = networkInfo.getSubtype();
                            break;
                        }
                        i10++;
                    } else {
                        break;
                    }
                }
                bVar.k(subtype, strW);
            } catch (SecurityException unused) {
            }
        }
    }

    @Override // androidx.lifecycle.c0
    public final void f() {
        this.k.registerReceiver(this.f8986x, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        TelephonyManager telephonyManager = this.f8974l;
        if (telephonyManager != null) {
            telephonyManager.listen(this.f8987y, 321);
        }
    }

    @Override // androidx.lifecycle.c0
    public final void g() {
        this.k.unregisterReceiver(this.f8986x);
        TelephonyManager telephonyManager = this.f8974l;
        if (telephonyManager != null) {
            telephonyManager.listen(this.f8987y, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [mq.w] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    public final void k(int i10, String str) {
        m mVar;
        boolean zA;
        ?? arrayList;
        List<CellInfo> allCellInfo;
        o oVar = this.f8983u;
        NetworkInfo activeNetworkInfo = this.f8975m.getActiveNetworkInfo();
        WifiInfo connectionInfo = this.f8976n.getConnectionInfo();
        NetworkUiState networkUiState = this.f8979q;
        String ssid = connectionInfo.getSSID();
        if (ssid == null) {
            ssid = "";
        }
        String strL0 = tt.s.l0(ssid, "\"", "");
        networkUiState.getClass();
        networkUiState.E = strL0;
        br.l.e(str, "<set-?>");
        networkUiState.F = str;
        networkUiState.f6132y = i10;
        oVar.getClass();
        com.staircase3.opensignal.utils.l lVarA = o.a(i10);
        br.l.e(lVarA, "<set-?>");
        networkUiState.D = lVarA;
        String strC = o.c(i10);
        br.l.e(strC, "<set-?>");
        networkUiState.f6130r = strC;
        if (i10 != 20) {
            switch (i10) {
                case 0:
                    mVar = m.UNKNOWN;
                    break;
                case 1:
                case 2:
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                case 11:
                case 14:
                    mVar = m.GSM;
                    break;
                case 3:
                case j.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                case 10:
                case 15:
                    mVar = m.WCDMA;
                    break;
                case 4:
                    mVar = m.CDMA;
                    break;
                case j.STRING_FIELD_NUMBER /* 5 */:
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                case 12:
                    mVar = m.EVDO;
                    break;
                case 13:
                    mVar = m.LTE;
                    break;
                default:
                    mVar = m.UNKNOWN;
                    break;
            }
        } else {
            mVar = m.FIVE_G;
        }
        br.l.e(mVar, "<set-?>");
        networkUiState.f6127a = mVar;
        NetworkInfo.State state = activeNetworkInfo != null ? activeNetworkInfo.getState() : null;
        int i11 = state == null ? -1 : a.f8973a[state.ordinal()];
        int i12 = 2;
        um.a aVar = (i11 == 1 || i11 == 2) ? activeNetworkInfo.getType() == 1 ? um.a.WIFI : activeNetworkInfo.getType() == 0 ? um.a.MOBILE : um.a.NONE : um.a.NONE;
        br.l.e(aVar, "<set-?>");
        networkUiState.B = aVar;
        Context context = this.k;
        qm.f fVar = this.f8980r;
        if (this.f8978p.e()) {
            fVar.getClass();
            zA = qm.f.c(context, "android.permission.ACCESS_FINE_LOCATION");
        } else {
            fVar.getClass();
            zA = qm.f.a(context);
        }
        if (zA) {
            try {
                TelephonyManager telephonyManager = this.f8974l;
                if (telephonyManager == null || (allCellInfo = telephonyManager.getAllCellInfo()) == null) {
                    arrayList = 0;
                } else {
                    arrayList = new ArrayList();
                    for (Object obj : allCellInfo) {
                        if (((CellInfo) obj).isRegistered()) {
                            arrayList.add(obj);
                        }
                    }
                }
            } catch (SecurityException unused) {
                arrayList = w.f16945a;
            }
            CellInfo cellInfo = arrayList != 0 ? (CellInfo) mq.o.t0(arrayList) : null;
            Objects.toString(cellInfo);
            if (cellInfo != null) {
                boolean z10 = cellInfo instanceof CellInfoWcdma;
                networkUiState.I = z10 ? ((CellInfoWcdma) cellInfo).getCellIdentity().getCid() : cellInfo instanceof CellInfoLte ? ((CellInfoLte) cellInfo).getCellIdentity().getCi() : cellInfo instanceof CellInfoCdma ? ((CellInfoCdma) cellInfo).getCellIdentity().getBasestationId() : cellInfo instanceof CellInfoGsm ? ((CellInfoGsm) cellInfo).getCellIdentity().getCid() : -1;
                networkUiState.H = z10 ? ((CellInfoWcdma) cellInfo).getCellIdentity().getLac() : cellInfo instanceof CellInfoLte ? ((CellInfoLte) cellInfo).getCellIdentity().getTac() : cellInfo instanceof CellInfoCdma ? ((CellInfoCdma) cellInfo).getCellIdentity().getNetworkId() : cellInfo instanceof CellInfoGsm ? ((CellInfoGsm) cellInfo).getCellIdentity().getLac() : -1;
                networkUiState.G = z10 ? ((CellInfoWcdma) cellInfo).getCellIdentity().getPsc() : cellInfo instanceof CellInfoLte ? ((CellInfoLte) cellInfo).getCellIdentity().getPci() : cellInfo instanceof CellInfoCdma ? ((CellInfoCdma) cellInfo).getCellIdentity().getSystemId() : cellInfo instanceof CellInfoGsm ? ((CellInfoGsm) cellInfo).getCellIdentity().getPsc() : -1;
                networkUiState.f6128d = z10 ? ((CellInfoWcdma) cellInfo).getCellSignalStrength().getDbm() : cellInfo instanceof CellInfoLte ? ((CellInfoLte) cellInfo).getCellSignalStrength().getDbm() : cellInfo instanceof CellInfoCdma ? ((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm() : cellInfo instanceof CellInfoGsm ? ((CellInfoGsm) cellInfo).getCellSignalStrength().getDbm() : -1;
            }
            m mVar2 = networkUiState.f6127a;
            int i13 = networkUiState.f6128d;
            int i14 = mVar2 != null ? n.f6188b[mVar2.ordinal()] : -1;
            int i15 = (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) ? 140 : 113;
            if (mVar2 == m.UNKNOWN) {
                networkUiState.f6129g = 0;
            } else {
                float f10 = (i13 + i15) / 2.0f;
                if (f10 < 0.0f || f10 < 2.0f) {
                    i12 = 0;
                } else if (f10 < 3.0f) {
                    i12 = 1;
                } else if (f10 >= 6.0f) {
                    i12 = f10 < 8.0f ? 3 : f10 < 14.0f ? 4 : f10 < 18.0f ? 5 : 6;
                }
                networkUiState.f6129g = i12;
            }
        }
        c0.a("setValue");
        this.f1490g++;
        this.f1488e = networkUiState;
        c(null);
    }
}
