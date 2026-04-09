package P6;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import com.polidea.rxandroidble3.exceptions.BleException;
import java.util.List;

/* loaded from: classes3.dex */
public class G {

    /* renamed from: b, reason: collision with root package name */
    private static BleException f18060b = new BleException("bluetoothAdapter is null");

    /* renamed from: a, reason: collision with root package name */
    private final BluetoothAdapter f18061a;

    public G(BluetoothAdapter bluetoothAdapter) {
        this.f18061a = bluetoothAdapter;
    }

    public BluetoothDevice a(String str) {
        BluetoothAdapter bluetoothAdapter = this.f18061a;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.getRemoteDevice(str);
        }
        throw f18060b;
    }

    public boolean b() {
        return this.f18061a != null;
    }

    public boolean c() {
        BluetoothAdapter bluetoothAdapter = this.f18061a;
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }

    public void d(List list, ScanSettings scanSettings, ScanCallback scanCallback) {
        BluetoothAdapter bluetoothAdapter = this.f18061a;
        if (bluetoothAdapter == null) {
            throw f18060b;
        }
        bluetoothAdapter.getBluetoothLeScanner().startScan((List<ScanFilter>) list, scanSettings, scanCallback);
    }

    public boolean e(BluetoothAdapter.LeScanCallback leScanCallback) {
        BluetoothAdapter bluetoothAdapter = this.f18061a;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.startLeScan(leScanCallback);
        }
        throw f18060b;
    }

    public void f(ScanCallback scanCallback) {
        BluetoothAdapter bluetoothAdapter = this.f18061a;
        if (bluetoothAdapter == null) {
            throw f18060b;
        }
        if (!bluetoothAdapter.isEnabled()) {
            I6.q.p("BluetoothAdapter is disabled, calling BluetoothLeScanner.stopScan(ScanCallback) may cause IllegalStateException", new Object[0]);
            return;
        }
        BluetoothLeScanner bluetoothLeScanner = this.f18061a.getBluetoothLeScanner();
        if (bluetoothLeScanner == null) {
            I6.q.q("Cannot call BluetoothLeScanner.stopScan(ScanCallback) on 'null' reference; BluetoothAdapter.isEnabled() == %b", Boolean.valueOf(this.f18061a.isEnabled()));
        } else {
            bluetoothLeScanner.stopScan(scanCallback);
        }
    }

    public void g(BluetoothAdapter.LeScanCallback leScanCallback) {
        BluetoothAdapter bluetoothAdapter = this.f18061a;
        if (bluetoothAdapter == null) {
            throw f18060b;
        }
        bluetoothAdapter.stopLeScan(leScanCallback);
    }
}
