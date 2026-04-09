package K6;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* loaded from: classes3.dex */
class T {

    /* renamed from: a, reason: collision with root package name */
    private BluetoothGattCallback f10322a;

    T() {
    }

    void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattCallback bluetoothGattCallback = this.f10322a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
        }
    }

    void b(BluetoothGatt bluetoothGatt, int i10, int i11) {
        BluetoothGattCallback bluetoothGattCallback = this.f10322a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onConnectionStateChange(bluetoothGatt, i10, i11);
        }
    }

    void c(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
        BluetoothGattCallback bluetoothGattCallback = this.f10322a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i10);
        }
    }

    void d(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
        BluetoothGattCallback bluetoothGattCallback = this.f10322a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i10);
        }
    }

    void e(BluetoothGatt bluetoothGatt, int i10, int i11) {
        BluetoothGattCallback bluetoothGattCallback = this.f10322a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onMtuChanged(bluetoothGatt, i10, i11);
        }
    }

    void f(BluetoothGatt bluetoothGatt, int i10, int i11, int i12, int i13) {
    }

    void g(BluetoothGatt bluetoothGatt, int i10, int i11, int i12) {
        BluetoothGattCallback bluetoothGattCallback = this.f10322a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onPhyRead(bluetoothGatt, i10, i11, i12);
        }
    }

    void h(BluetoothGatt bluetoothGatt, int i10, int i11, int i12) {
        BluetoothGattCallback bluetoothGattCallback = this.f10322a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onPhyUpdate(bluetoothGatt, i10, i11, i12);
        }
    }

    void i(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        BluetoothGattCallback bluetoothGattCallback = this.f10322a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i10);
        }
    }

    void j(BluetoothGatt bluetoothGatt, int i10, int i11) {
        BluetoothGattCallback bluetoothGattCallback = this.f10322a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onReadRemoteRssi(bluetoothGatt, i10, i11);
        }
    }

    void k(BluetoothGatt bluetoothGatt, int i10) {
        BluetoothGattCallback bluetoothGattCallback = this.f10322a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onReliableWriteCompleted(bluetoothGatt, i10);
        }
    }

    void l(BluetoothGatt bluetoothGatt, int i10) {
        BluetoothGattCallback bluetoothGattCallback = this.f10322a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onServicesDiscovered(bluetoothGatt, i10);
        }
    }

    void m(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        BluetoothGattCallback bluetoothGattCallback = this.f10322a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i10);
        }
    }
}
