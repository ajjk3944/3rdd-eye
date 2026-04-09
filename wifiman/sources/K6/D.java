package K6;

import android.bluetooth.BluetoothGattCharacteristic;
import com.polidea.rxandroidble3.internal.BleIllegalOperationException;
import gg.AbstractC5912b;
import kg.InterfaceC6464a;

/* loaded from: classes3.dex */
public class D {

    /* renamed from: a, reason: collision with root package name */
    final F f10288a;

    class a implements InterfaceC6464a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BluetoothGattCharacteristic f10289a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10290b;

        a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            this.f10289a = bluetoothGattCharacteristic;
            this.f10290b = i10;
        }

        @Override // kg.InterfaceC6464a
        public void run() {
            BleIllegalOperationException bleIllegalOperationExceptionA;
            int properties = this.f10289a.getProperties();
            int i10 = this.f10290b;
            if ((properties & i10) == 0 && (bleIllegalOperationExceptionA = D.this.f10288a.a(this.f10289a, i10)) != null) {
                throw bleIllegalOperationExceptionA;
            }
        }
    }

    public D(F f10) {
        this.f10288a = f10;
    }

    public AbstractC5912b a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        return AbstractC5912b.E(new a(bluetoothGattCharacteristic, i10));
    }
}
