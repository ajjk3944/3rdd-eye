package zc;

import Cc.AbstractC2558b;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: zc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8727a {
    public static final AbstractC2558b a(BluetoothDevice bluetoothDevice) {
        AbstractC6492s.i(bluetoothDevice, "<this>");
        try {
            BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
            Integer numValueOf = bluetoothClass != null ? Integer.valueOf(bluetoothClass.getMajorDeviceClass()) : null;
            if (numValueOf != null && numValueOf.intValue() == 1024) {
                return AbstractC2558b.l.f2501b;
            }
            if (numValueOf != null && numValueOf.intValue() == 256) {
                return AbstractC2558b.h.f2497b;
            }
            if (numValueOf != null && numValueOf.intValue() == 2304) {
                return null;
            }
            if (numValueOf != null && numValueOf.intValue() == 1536) {
                return null;
            }
            if (numValueOf != null && numValueOf.intValue() == 768) {
                return AbstractC2558b.g.d.f2496b;
            }
            if (numValueOf != null && numValueOf.intValue() == 1280) {
                return null;
            }
            if (numValueOf != null && numValueOf.intValue() == 512) {
                return AbstractC2558b.i.f2498b;
            }
            if (numValueOf != null && numValueOf.intValue() == 2048) {
                return AbstractC2558b.m.f2502b;
            }
            if (numValueOf != null && numValueOf.intValue() == 1792) {
                return AbstractC2558b.n.f2503b;
            }
            if (numValueOf == null) {
                return null;
            }
            numValueOf.intValue();
            return null;
        } catch (SecurityException e10) {
            Z7.b.e("Attempt to access `bluetoothClass` without bluetooth permission", e10, null, 4, null);
            return null;
        }
    }

    public static final Set b(int i10) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i10 == 1) {
            linkedHashSet.add(U7.b.CLASSIC);
        } else if (i10 == 2) {
            linkedHashSet.add(U7.b.BLE);
        } else if (i10 == 3) {
            linkedHashSet.add(U7.b.CLASSIC);
            linkedHashSet.add(U7.b.BLE);
        }
        return linkedHashSet;
    }
}
