package K6;

import P6.C3421i;
import android.bluetooth.BluetoothGattCharacteristic;
import java.util.Locale;

/* loaded from: classes3.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    private final C3421i f10294a;

    public G(C3421i c3421i) {
        this.f10294a = c3421i;
    }

    public String a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        return String.format(Locale.getDefault(), "Characteristic %s supports properties: %s (%d) does not have any property matching %s (%d)", L6.b.g(bluetoothGattCharacteristic.getUuid()), this.f10294a.c(bluetoothGattCharacteristic.getProperties()), Integer.valueOf(bluetoothGattCharacteristic.getProperties()), this.f10294a.c(i10), Integer.valueOf(i10));
    }
}
