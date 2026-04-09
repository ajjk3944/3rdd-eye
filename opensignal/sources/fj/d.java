package fj;

import android.telephony.CellLocation;
import android.telephony.TelephonyCallback;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends c implements TelephonyCallback.CellLocationListener, TelephonyCallback.CellInfoListener {
    public final void onCellInfoChanged(List list) {
        ch.n.b("ExtendedTelephonyCallback", "onCellInfoChanged() called with: cellInfo = [" + list + "]");
        this.f8909a.d(list);
    }

    public final void onCellLocationChanged(CellLocation cellLocation) {
        ch.n.b("ExtendedTelephonyCallback", "onCellLocationChanged() called with: location = [" + cellLocation + "]");
        this.f8909a.e(cellLocation);
    }
}
