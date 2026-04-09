package o0;

import android.telephony.SignalStrength;

/* loaded from: classes.dex */
public class e {
    public static int a(SignalStrength signalStrength) {
        return d(signalStrength, "getAsuLevel");
    }

    public static int b(SignalStrength signalStrength) {
        return d(signalStrength, "getDbm");
    }

    public static int c(SignalStrength signalStrength) {
        return d(signalStrength, "getGsmLevel");
    }

    protected static int d(SignalStrength signalStrength, String str) {
        try {
            return ((Integer) Class.forName(SignalStrength.class.getName()).getDeclaredMethod(str, new Class[0]).invoke(signalStrength, new Object[0])).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }
}
