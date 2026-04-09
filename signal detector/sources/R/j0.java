package R;

import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j0 {
    public static /* bridge */ /* synthetic */ CellSignalStrengthNr e(CellSignalStrength cellSignalStrength) {
        return (CellSignalStrengthNr) cellSignalStrength;
    }

    public static /* bridge */ /* synthetic */ CellSignalStrengthTdscdma f(CellSignalStrength cellSignalStrength) {
        return (CellSignalStrengthTdscdma) cellSignalStrength;
    }

    public static /* bridge */ /* synthetic */ boolean n(CellSignalStrength cellSignalStrength) {
        return cellSignalStrength instanceof CellSignalStrengthNr;
    }

    public static /* bridge */ /* synthetic */ boolean t(CellSignalStrength cellSignalStrength) {
        return cellSignalStrength instanceof CellSignalStrengthTdscdma;
    }
}
