package P6;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: P6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3417e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18070a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f18071b;

    public C3417e(Object obj, byte[] bArr) {
        this.f18070a = obj;
        this.f18071b = bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3417e)) {
            return false;
        }
        C3417e c3417e = (C3417e) obj;
        return Arrays.equals(c3417e.f18071b, this.f18071b) && c3417e.f18070a.equals(this.f18070a);
    }

    public int hashCode() {
        return this.f18070a.hashCode() ^ Arrays.hashCode(this.f18071b);
    }

    public String toString() {
        String simpleName;
        Object obj = this.f18070a;
        if (obj instanceof BluetoothGattCharacteristic) {
            simpleName = BluetoothGattCharacteristic.class.getSimpleName() + "(" + ((BluetoothGattCharacteristic) this.f18070a).getUuid().toString() + ")";
        } else if (obj instanceof BluetoothGattDescriptor) {
            simpleName = BluetoothGattDescriptor.class.getSimpleName() + "(" + ((BluetoothGattDescriptor) this.f18070a).getUuid().toString() + ")";
        } else if (obj instanceof UUID) {
            simpleName = UUID.class.getSimpleName() + "(" + this.f18070a.toString() + ")";
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "[first=" + simpleName + ", second=" + Arrays.toString(this.f18071b) + "]";
    }
}
