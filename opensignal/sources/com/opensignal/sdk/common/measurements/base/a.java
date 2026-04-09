package com.opensignal.sdk.common.measurements.base;

import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import android.telephony.euicc.EuiccManager;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final EuiccManager f5850a;

    /* renamed from: b, reason: collision with root package name */
    public final TelephonyManager f5851b;

    /* renamed from: c, reason: collision with root package name */
    public final ch.f f5852c;

    /* renamed from: d, reason: collision with root package name */
    public final PackageManager f5853d;

    public a(EuiccManager euiccManager, TelephonyManager telephonyManager, ch.f fVar, PackageManager packageManager) {
        this.f5850a = euiccManager;
        this.f5851b = telephonyManager;
        this.f5852c = fVar;
        this.f5853d = packageManager;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            ch.f fVar = aVar.f5852c;
            TelephonyManager telephonyManager = aVar.f5851b;
            EuiccManager euiccManager = this.f5850a;
            EuiccManager euiccManager2 = aVar.f5850a;
            if (euiccManager == null ? euiccManager2 != null : !euiccManager.equals(euiccManager2)) {
                return false;
            }
            TelephonyManager telephonyManager2 = this.f5851b;
            if (telephonyManager2 == null ? telephonyManager != null : !telephonyManager2.equals(telephonyManager)) {
                return false;
            }
            ch.f fVar2 = this.f5852c;
            if (fVar2 != null) {
                return fVar2.equals(fVar);
            }
            if (fVar == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        EuiccManager euiccManager = this.f5850a;
        int iHashCode = (euiccManager != null ? euiccManager.hashCode() : 0) * 31;
        TelephonyManager telephonyManager = this.f5851b;
        int iHashCode2 = (iHashCode + (telephonyManager != null ? telephonyManager.hashCode() : 0)) * 31;
        ch.f fVar = this.f5852c;
        return iHashCode2 + (fVar != null ? fVar.hashCode() : 0);
    }
}
