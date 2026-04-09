package G6;

import android.bluetooth.BluetoothGattCharacteristic;
import com.polidea.rxandroidble3.exceptions.BleGattException;
import gg.AbstractC5912b;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public interface N {

    public interface a {
        gg.s a();

        a b(int i10);

        a c(BluetoothGattCharacteristic bluetoothGattCharacteristic);

        a d(byte[] bArr);
    }

    public enum b {
        CONNECTING("CONNECTING"),
        CONNECTED("CONNECTED"),
        DISCONNECTED("DISCONNECTED"),
        DISCONNECTING("DISCONNECTING");

        private final String description;

        b(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "RxBleConnectionState{" + this.description + '}';
        }
    }

    public interface c extends gg.w {
    }

    public interface d extends gg.w {

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            final int f7036a;

            /* renamed from: b, reason: collision with root package name */
            final BleGattException f7037b;

            public a(int i10, BleGattException bleGattException) {
                this.f7036a = i10;
                this.f7037b = bleGattException;
            }

            public int a() {
                return this.f7036a;
            }

            public BleGattException b() {
                return this.f7037b;
            }
        }
    }

    int a();

    gg.z b();

    a c();

    AbstractC5912b d(int i10, long j10, TimeUnit timeUnit);

    gg.z e(int i10);

    gg.z f(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr);

    gg.z g();

    gg.s h(BluetoothGattCharacteristic bluetoothGattCharacteristic);
}
