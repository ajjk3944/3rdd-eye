package Q4;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.os.Build;
import com.lefan.signal.ui.bluetooth.BluetoothActivity;

/* loaded from: classes.dex */
public final class k extends ScanCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BluetoothActivity f3211a;

    public k(BluetoothActivity bluetoothActivity) {
        this.f3211a = bluetoothActivity;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i, ScanResult scanResult) {
        super.onScanResult(i, scanResult);
        if (scanResult == null) {
            return;
        }
        BluetoothActivity bluetoothActivity = this.f3211a;
        String str = bluetoothActivity.f18884P;
        q5.i.e(str, "string");
        if (G.c.a(bluetoothActivity, str) == 0) {
            v vVarC = bluetoothActivity.C();
            m mVar = new m();
            mVar.f3214a = scanResult.getDevice();
            mVar.f3215b = scanResult.getDevice().getName();
            mVar.f3216c = scanResult.getRssi();
            mVar.f3217d = scanResult.getDevice().getAddress();
            if (Build.VERSION.SDK_INT >= 30) {
                mVar.f3218e = scanResult.getDevice().getAlias();
            }
            vVarC.e(mVar);
        }
    }
}
