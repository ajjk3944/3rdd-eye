package o0;

import android.os.Build;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.SignalStrength;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: i, reason: collision with root package name */
    private static final String f3048i = "c";

    /* renamed from: a, reason: collision with root package name */
    public int f3049a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public int f3050b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f3051c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f3052d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f3053e = Integer.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public int f3054f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f3055g = false;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<a> f3056h = new ArrayList<>();

    public static int a(int i2) {
        double d2 = i2 + 113;
        Double.isNaN(d2);
        double d3 = 58;
        Double.isNaN(d3);
        return (int) Math.round(((d2 * 1.0d) / d3) * 100.0d);
    }

    public static void c(SignalStrength signalStrength, c cVar) {
        int evdoDbm;
        if (!signalStrength.isGsm()) {
            if (signalStrength.getCdmaDbm() > 0) {
                evdoDbm = signalStrength.getCdmaDbm();
            } else if (signalStrength.getEvdoDbm() <= 0) {
                return;
            } else {
                evdoDbm = signalStrength.getEvdoDbm();
            }
            cVar.f3052d = evdoDbm;
            return;
        }
        String[] strArrSplit = signalStrength.toString().split(" ");
        q0.a.b(f3048i, signalStrength.toString());
        Integer numValueOf = Integer.MAX_VALUE;
        try {
            if (strArrSplit.length >= 10 && !strArrSplit[9].startsWith("rss")) {
                numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[9]));
            }
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
        if (numValueOf.intValue() != Integer.MAX_VALUE && numValueOf.intValue() != 255) {
            int iIntValue = numValueOf.intValue();
            cVar.f3052d = iIntValue;
            cVar.f3053e = b.a(iIntValue);
            return;
        }
        int gsmSignalStrength = signalStrength.getGsmSignalStrength();
        cVar.f3052d = b.b(gsmSignalStrength);
        cVar.f3053e = gsmSignalStrength;
        if (Build.VERSION.SDK_INT > 23) {
            try {
                cVar.f3054f = signalStrength.getLevel();
            } catch (Exception e3) {
                cVar.f3054f = -1;
                e3.printStackTrace();
            }
        }
    }

    public static void d(SignalStrength signalStrength, c cVar) {
        cVar.f3049a = e.b(signalStrength);
        cVar.f3050b = e.a(signalStrength);
        cVar.f3051c = e.c(signalStrength);
    }

    public static void e(SignalStrength signalStrength, c cVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            q0.a.b(f3048i, signalStrength.toString());
            List<CellSignalStrength> cellSignalStrengths = signalStrength.getCellSignalStrengths();
            cVar.f3056h.clear();
            int i2 = 0;
            int i3 = 0;
            for (CellSignalStrength cellSignalStrength : cellSignalStrengths) {
                String str = f3048i;
                q0.a.b(str, "css=" + cellSignalStrength.toString());
                cVar.f3052d = cellSignalStrength.getDbm();
                cVar.f3053e = cellSignalStrength.getAsuLevel();
                cVar.f3054f = cellSignalStrength.getLevel();
                q0.a.b(str, "dBm=" + cVar.f3052d + " " + cVar.f3053e);
                if (cellSignalStrength instanceof CellSignalStrengthNr) {
                    CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) cellSignalStrength;
                    cVar.f3056h.add(new a(cellSignalStrengthNr.getDbm(), cellSignalStrengthNr.getAsuLevel(), cellSignalStrengthNr.getLevel(), 4));
                    i2++;
                } else if (cellSignalStrength instanceof CellSignalStrengthLte) {
                    CellSignalStrengthLte cellSignalStrengthLte = (CellSignalStrengthLte) cellSignalStrength;
                    cVar.f3056h.add(new a(cellSignalStrengthLte.getDbm(), cellSignalStrengthLte.getAsuLevel(), cellSignalStrengthLte.getLevel(), 3));
                    i3++;
                } else if (cellSignalStrength instanceof CellSignalStrengthGsm) {
                    CellSignalStrengthGsm cellSignalStrengthGsm = (CellSignalStrengthGsm) cellSignalStrength;
                    cVar.f3056h.add(new a(cellSignalStrengthGsm.getDbm(), cellSignalStrengthGsm.getAsuLevel(), cellSignalStrengthGsm.getLevel(), 1));
                }
            }
            if (i2 <= 0 || i3 <= 0) {
                cVar.f3055g = false;
            } else {
                cVar.f3055g = true;
            }
            Iterator<a> it = cVar.f3056h.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }
    }

    public boolean b() {
        return this.f3055g;
    }

    public void f() {
        String str = f3048i;
        q0.a.b(str, "Signal Strength Dbm = " + this.f3049a);
        q0.a.b(str, "Signal Strength Asu = " + this.f3050b);
        q0.a.b(str, "Signal Strength Level = " + this.f3051c);
        q0.a.b(str, "Signal Strength API Dbm = " + this.f3052d);
        q0.a.b(str, "Signal Strength API Asu = " + this.f3053e);
    }
}
