package fj;

import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import h9.r2;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ch.f f8912a;

    /* renamed from: b, reason: collision with root package name */
    public final ch.i f8913b;

    /* renamed from: c, reason: collision with root package name */
    public final TelephonyManager f8914c;

    /* renamed from: d, reason: collision with root package name */
    public final ag.b f8915d;

    /* renamed from: e, reason: collision with root package name */
    public final bk.k f8916e;

    /* renamed from: f, reason: collision with root package name */
    public final n f8917f;

    /* renamed from: g, reason: collision with root package name */
    public final al.b f8918g;

    /* renamed from: h, reason: collision with root package name */
    public final r2 f8919h;

    /* renamed from: i, reason: collision with root package name */
    public final b f8920i;
    public final int j;
    public final ak.e k;

    /* renamed from: l, reason: collision with root package name */
    public final ContentResolver f8921l;

    /* renamed from: m, reason: collision with root package name */
    public final PackageManager f8922m;

    /* renamed from: n, reason: collision with root package name */
    public final ConnectivityManager f8923n;

    /* renamed from: o, reason: collision with root package name */
    public final Pattern f8924o = Pattern.compile("(mIsUsingCarrierAggregation|isUsingCarrierAggregation|IsUsingCarrierAggregation)\\s*=\\s*(true|false)");

    public g(ch.f fVar, ch.i iVar, TelephonyManager telephonyManager, ag.b bVar, bk.k kVar, n nVar, al.b bVar2, r2 r2Var, b bVar3, int i10, ak.e eVar, ContentResolver contentResolver, PackageManager packageManager, ConnectivityManager connectivityManager) {
        this.f8912a = fVar;
        this.f8913b = iVar;
        this.f8914c = telephonyManager;
        this.f8915d = bVar;
        this.f8916e = kVar;
        this.f8917f = nVar;
        this.f8918g = bVar2;
        this.f8919h = r2Var;
        this.f8920i = bVar3;
        this.j = i10;
        this.k = eVar;
        this.f8921l = contentResolver;
        this.f8922m = packageManager;
        this.f8923n = connectivityManager;
    }

    public static CellIdentityCdma a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CellInfo cellInfo = (CellInfo) it.next();
            if ((cellInfo instanceof CellInfoCdma) && cellInfo.isRegistered()) {
                return ((CellInfoCdma) cellInfo).getCellIdentity();
            }
        }
        return null;
    }

    public static CellIdentityGsm b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CellInfo cellInfo = (CellInfo) it.next();
            if ((cellInfo instanceof CellInfoGsm) && cellInfo.isRegistered()) {
                return ((CellInfoGsm) cellInfo).getCellIdentity();
            }
        }
        return null;
    }

    public static CellIdentityLte c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CellInfo cellInfo = (CellInfo) it.next();
            if ((cellInfo instanceof CellInfoLte) && cellInfo.isRegistered()) {
                return ((CellInfoLte) cellInfo).getCellIdentity();
            }
        }
        return null;
    }

    public static CellIdentityWcdma d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CellInfo cellInfo = (CellInfo) it.next();
            if ((cellInfo instanceof CellInfoWcdma) && cellInfo.isRegistered()) {
                return ((CellInfoWcdma) cellInfo).getCellIdentity();
            }
        }
        return null;
    }

    public static CellSignalStrengthCdma e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CellInfo cellInfo = (CellInfo) it.next();
            if ((cellInfo instanceof CellInfoCdma) && cellInfo.isRegistered()) {
                return ((CellInfoCdma) cellInfo).getCellSignalStrength();
            }
        }
        return null;
    }

    public static CellSignalStrengthGsm f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CellInfo cellInfo = (CellInfo) it.next();
            if ((cellInfo instanceof CellInfoGsm) && cellInfo.isRegistered()) {
                return ((CellInfoGsm) cellInfo).getCellSignalStrength();
            }
        }
        return null;
    }

    public static CellSignalStrengthLte g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CellInfo cellInfo = (CellInfo) it.next();
            if ((cellInfo instanceof CellInfoLte) && cellInfo.isRegistered()) {
                return ((CellInfoLte) cellInfo).getCellSignalStrength();
            }
        }
        return null;
    }

    public static CellSignalStrengthWcdma h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CellInfo cellInfo = (CellInfo) it.next();
            if ((cellInfo instanceof CellInfoWcdma) && cellInfo.isRegistered()) {
                return ((CellInfoWcdma) cellInfo).getCellSignalStrength();
            }
        }
        return null;
    }

    public final List i() {
        return this.f8920i.a(this.f8914c);
    }

    public final boolean j() {
        ag.b bVar = this.f8915d;
        if (bVar.i("android.permission.READ_BASIC_PHONE_STATE")) {
            return true;
        }
        return (bVar.i("android.permission.READ_PHONE_STATE") || bVar.i("android.permission.ACCESS_NETWORK_STATE")) && this.f8912a.g();
    }

    public final nj.b k() {
        return this.f8919h.o0(l());
    }

    public final int l() {
        ag.b bVar = this.f8915d;
        boolean z10 = bVar.i("android.permission.READ_PHONE_STATE") || bVar.i("android.permission.READ_BASIC_PHONE_STATE");
        boolean z11 = this.f8913b.f3950e;
        ch.f fVar = this.f8912a;
        if (!z11 || !fVar.e() || z10) {
            boolean zF = fVar.f();
            TelephonyManager telephonyManager = this.f8914c;
            if (zF && z10) {
                if (telephonyManager != null) {
                    return telephonyManager.getDataNetworkType();
                }
                return 0;
            }
            if (telephonyManager != null) {
                return telephonyManager.getNetworkType();
            }
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f8918g.f812d;
        Network[] allNetworks = connectivityManager.getAllNetworks();
        br.l.d(allNetworks, "getAllNetworks(...)");
        for (Network network : allNetworks) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
            if (networkInfo != null && networkInfo.getType() == 0) {
                return networkInfo.getSubtype();
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m() throws java.io.IOException {
        /*
            r10 = this;
            android.telephony.TelephonyManager r0 = r10.f8914c
            if (r0 == 0) goto L9
            int r0 = r0.getSimState()
            goto La
        L9:
            r0 = 0
        La:
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L80
            if (r0 == 0) goto L80
            ch.f r0 = r10.f8912a
            boolean r0 = r0.f()
            if (r0 == 0) goto L25
            android.net.ConnectivityManager r0 = r10.f8923n
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L75
            java.lang.String r0 = r0.getExtraInfo()
            goto L76
        L25:
            r0 = -1
            int r3 = r10.j
            if (r3 <= r0) goto L75
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r4 = "subId/%d"
            java.lang.String r0 = java.lang.String.format(r0, r4, r3)
            java.lang.String r3 = "content://telephony/carriers/preferapn"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.net.Uri r5 = android.net.Uri.withAppendedPath(r3, r0)
            java.lang.String r0 = "apn"
            java.lang.String[] r6 = new java.lang.String[]{r0}
            r8 = 0
            r9 = 0
            android.content.ContentResolver r4 = r10.f8921l
            r7 = 0
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9)
            if (r3 == 0) goto L70
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L68
            if (r4 != r2) goto L70
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.Throwable -> L68
            goto L71
        L68:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L6b
        L6b:
            r0 = move-exception
            ic.a.g(r3, r1)
            throw r0
        L70:
            r0 = r1
        L71:
            ic.a.g(r3, r1)
            goto L76
        L75:
            r0 = r1
        L76:
            if (r0 == 0) goto L7f
            int r2 = r0.length()
            if (r2 != 0) goto L7f
            goto L80
        L7f:
            return r0
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fj.g.m():java.lang.String");
    }
}
