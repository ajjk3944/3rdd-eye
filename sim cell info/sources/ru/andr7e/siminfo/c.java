package ru.andr7e.siminfo;

import android.annotation.TargetApi;
import android.os.Build;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    static int f3260a;

    /* renamed from: b, reason: collision with root package name */
    private static HashMap<String, Integer> f3261b = new HashMap<>();

    public static synchronized void a(List<b> list, List<CellInfo> list2) {
        list.clear();
        f3261b.clear();
        int i2 = 0;
        Iterator<CellInfo> it = list2.iterator();
        while (it.hasNext()) {
            b bVarG = g(it.next(), i2);
            if (bVarG != null) {
                list.add(bVarG);
                i2++;
            }
        }
    }

    public static String b(String str) {
        return b.c(f(str));
    }

    public static int c(CellSignalStrengthLte cellSignalStrengthLte) {
        return d(cellSignalStrengthLte, "mRsrq");
    }

    @TargetApi(17)
    protected static int d(CellSignalStrengthLte cellSignalStrengthLte, String str) throws NoSuchFieldException {
        try {
            Field declaredField = cellSignalStrengthLte.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(cellSignalStrengthLte)).intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return Integer.MAX_VALUE;
        }
    }

    public static int e() {
        return f3260a;
    }

    public static int f(String str) {
        Integer num;
        if (str == null || str.isEmpty() || !f3261b.containsKey(str) || (num = f3261b.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @TargetApi(17)
    public static b g(CellInfo cellInfo, int i2) {
        String mccString;
        String mncString;
        int i3;
        String strF;
        String mccString2;
        String mncString2;
        String strF2;
        b bVarB;
        MyApplication myApplicationE = MyApplication.e();
        b bVar = new b();
        int i4 = Build.VERSION.SDK_INT;
        boolean zIsRegistered = cellInfo.isRegistered();
        if (i4 >= 28) {
            cellInfo.getCellConnectionStatus();
        }
        if (cellInfo instanceof CellInfoGsm) {
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
            bVar.r(cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            if (i4 >= 28) {
                mccString = cellIdentity.getMccString();
                mncString = cellIdentity.getMncString();
            } else {
                int mcc = cellIdentity.getMcc();
                int mnc = cellIdentity.getMnc();
                if (f.w(mcc)) {
                    mccString = mcc + "";
                } else {
                    mccString = null;
                }
                if (f.w(mnc)) {
                    mncString = mnc + "";
                } else {
                    mncString = null;
                }
            }
            bVar.s(cellIdentity.getLac(), cellIdentity.getCid());
            bVar.n(i4 >= 24 ? cellIdentity.getArfcn() : Integer.MAX_VALUE);
            i3 = 1;
        } else if (cellInfo instanceof CellInfoLte) {
            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
            CellSignalStrengthLte cellSignalStrength2 = cellInfoLte.getCellSignalStrength();
            bVar.r(cellSignalStrength2.getDbm(), cellSignalStrength2.getAsuLevel());
            CellIdentityLte cellIdentity2 = cellInfoLte.getCellIdentity();
            if (i4 >= 28) {
                mccString2 = cellIdentity2.getMccString();
                mncString2 = cellIdentity2.getMncString();
            } else {
                int mcc2 = cellIdentity2.getMcc();
                int mnc2 = cellIdentity2.getMnc();
                if (f.w(mcc2)) {
                    mccString2 = mcc2 + "";
                } else {
                    mccString2 = null;
                }
                if (f.w(mnc2)) {
                    mncString2 = mnc2 + "";
                } else {
                    mncString2 = null;
                }
            }
            bVar.t(cellIdentity2.getTac(), cellIdentity2.getCi(), cellIdentity2.getPci());
            bVar.o(i4 >= 26 ? cellSignalStrength2.getRsrq() : i4 >= 18 ? c(cellSignalStrength2) : Integer.MAX_VALUE);
            if (i4 >= 29) {
                bVar.p(cellSignalStrength2.getRssi());
            }
            bVar.n(i4 >= 24 ? cellIdentity2.getEarfcn() : Integer.MAX_VALUE);
            bVar.v(cellSignalStrength2.getTimingAdvance());
            String strG = f.g(i4 >= 28 ? cellIdentity2.getBandwidth() : 0);
            if (strG != null) {
                bVar.i(strG);
            }
            int[] bands = i4 >= 30 ? cellIdentity2.getBands() : null;
            if (bands != null && zIsRegistered && (strF2 = f.f(bands, false)) != null) {
                bVar.f(strF2);
            }
            mncString = mncString2;
            mccString = mccString2;
            i3 = 3;
        } else if (i4 >= 29 && (cellInfo instanceof CellInfoNr)) {
            CellInfoNr cellInfoNr = (CellInfoNr) cellInfo;
            CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) cellInfoNr.getCellSignalStrength();
            bVar.r(cellSignalStrengthNr.getDbm(), cellSignalStrengthNr.getAsuLevel());
            i3 = 4;
            CellIdentityNr cellIdentityNr = (CellIdentityNr) cellInfoNr.getCellIdentity();
            String mccString3 = cellIdentityNr.getMccString();
            String mncString3 = cellIdentityNr.getMncString();
            bVar.u(cellIdentityNr.getTac(), cellIdentityNr.getNci(), cellIdentityNr.getPci());
            bVar.o(cellSignalStrengthNr.getCsiRsrq());
            if (i4 >= 34) {
                bVar.v(cellSignalStrengthNr.getTimingAdvanceMicros());
            }
            bVar.n(cellIdentityNr.getNrarfcn());
            String strG2 = f.g(0);
            if (strG2 != null) {
                bVar.i(strG2);
            }
            int[] bands2 = i4 >= 30 ? cellIdentityNr.getBands() : null;
            if (bands2 != null && zIsRegistered && (strF = f.f(bands2, false)) != null) {
                bVar.f(strF);
            }
            mccString = mccString3;
            mncString = mncString3;
        } else if (i4 < 18 || !(cellInfo instanceof CellInfoWcdma)) {
            mccString = null;
            mncString = null;
            i3 = 0;
        } else {
            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
            CellSignalStrengthWcdma cellSignalStrength3 = cellInfoWcdma.getCellSignalStrength();
            bVar.r(cellSignalStrength3.getDbm(), cellSignalStrength3.getAsuLevel());
            CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
            if (i4 >= 28) {
                mccString = cellIdentity3.getMccString();
                mncString = cellIdentity3.getMncString();
            } else {
                int mcc3 = cellIdentity3.getMcc();
                int mnc3 = cellIdentity3.getMnc();
                if (f.w(mcc3)) {
                    mccString = mcc3 + "";
                } else {
                    mccString = null;
                }
                if (f.w(mnc3)) {
                    mncString = mnc3 + "";
                } else {
                    mncString = null;
                }
            }
            bVar.t(cellIdentity3.getLac(), cellIdentity3.getCid(), cellIdentity3.getPsc());
            bVar.n(i4 >= 24 ? cellIdentity3.getUarfcn() : Integer.MAX_VALUE);
            i3 = 2;
        }
        if (i3 == 0) {
            return null;
        }
        bVar.j(i2 + 1);
        bVar.d(zIsRegistered);
        bVar.q(false);
        bVar.w(i3);
        bVar.k(mccString, mncString);
        String strA = f.A(mccString, mncString);
        bVar.l(strA);
        if (zIsRegistered) {
            f3260a = i3;
            f3261b.put(strA, Integer.valueOf(i3));
            myApplicationE.h(bVar);
        }
        f.k(bVar);
        if (!zIsRegistered && f.w(bVar.f3242f) && strA.length() < 2 && n0.b.c() && (bVarB = myApplicationE.b(i3, bVar.f3242f)) != null) {
            bVar.m(bVarB.f3251o + "*");
        }
        return bVar;
    }

    public static String h(CellLocation cellLocation) {
        if (cellLocation instanceof GsmCellLocation) {
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            int lac = gsmCellLocation.getLac();
            int cid = gsmCellLocation.getCid();
            int psc = gsmCellLocation.getPsc();
            String str = "A " + f.r(lac, cid);
            if (psc <= 0) {
                return str;
            }
            return str + " PSC:" + f.u(psc);
        }
        if (!(cellLocation instanceof CdmaCellLocation)) {
            return null;
        }
        CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
        int baseStationId = cdmaCellLocation.getBaseStationId();
        int baseStationLatitude = cdmaCellLocation.getBaseStationLatitude();
        int baseStationLongitude = cdmaCellLocation.getBaseStationLongitude();
        return "A NET:" + f.u(cdmaCellLocation.getNetworkId()) + " SYS:" + f.u(cdmaCellLocation.getSystemId()) + " BS:" + f.u(baseStationId) + " LAT:" + f.u(baseStationLatitude) + " LON:" + f.u(baseStationLongitude);
    }
}
