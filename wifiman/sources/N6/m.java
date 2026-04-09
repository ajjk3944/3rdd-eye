package N6;

import android.bluetooth.le.ScanResult;

/* loaded from: classes3.dex */
public class m implements j {
    @Override // N6.j
    public Q6.b a(ScanResult scanResult) {
        return scanResult.isConnectable() ? Q6.b.CONNECTABLE : Q6.b.NOT_CONNECTABLE;
    }
}
