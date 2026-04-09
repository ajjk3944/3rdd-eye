package L6;

import G6.P;
import I6.q;
import P6.C3421i;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final C3421i f11246a;

    c(C3421i c3421i) {
        this.f11246a = c3421i;
    }

    private static void a(StringBuilder sb2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        sb2.append('\n');
        sb2.append('\t');
        sb2.append("* ");
        sb2.append(i(bluetoothGattCharacteristic));
        sb2.append(" (");
        sb2.append(b.g(bluetoothGattCharacteristic.getUuid()));
        sb2.append(")");
    }

    private void b(StringBuilder sb2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        sb2.append('\n');
        sb2.append('\t');
        sb2.append("  ");
        sb2.append("Properties: ");
        sb2.append(this.f11246a.c(bluetoothGattCharacteristic.getProperties()));
    }

    private static void c(StringBuilder sb2, BluetoothGattDescriptor bluetoothGattDescriptor) {
        sb2.append('\n');
        sb2.append('\t');
        sb2.append('\t');
        sb2.append("* ");
        sb2.append(j(bluetoothGattDescriptor));
        sb2.append(" (");
        sb2.append(b.g(bluetoothGattDescriptor.getUuid()));
        sb2.append(")");
    }

    private static void d(StringBuilder sb2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic.getDescriptors().isEmpty()) {
            return;
        }
        e(sb2);
        Iterator<BluetoothGattDescriptor> it = bluetoothGattCharacteristic.getDescriptors().iterator();
        while (it.hasNext()) {
            c(sb2, it.next());
        }
    }

    private static void e(StringBuilder sb2) {
        sb2.append('\n');
        sb2.append('\t');
        sb2.append("  ");
        sb2.append("-> Descriptors: ");
    }

    private static void f(BluetoothDevice bluetoothDevice, StringBuilder sb2) {
        sb2.append("--------------- ====== Printing peripheral content ====== ---------------\n");
        sb2.append(b.d(bluetoothDevice.getAddress()));
        sb2.append('\n');
        sb2.append("PERIPHERAL NAME: ");
        sb2.append(bluetoothDevice.getName());
        sb2.append('\n');
        sb2.append("-------------------------------------------------------------------------");
    }

    private void g(StringBuilder sb2, BluetoothGattService bluetoothGattService) {
        h(sb2, bluetoothGattService);
        sb2.append("-> Characteristics:");
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
            a(sb2, bluetoothGattCharacteristic);
            b(sb2, bluetoothGattCharacteristic);
            d(sb2, bluetoothGattCharacteristic);
        }
    }

    private static void h(StringBuilder sb2, BluetoothGattService bluetoothGattService) {
        sb2.append("\n");
        sb2.append(l(bluetoothGattService));
        sb2.append(" - ");
        sb2.append(k(bluetoothGattService));
        sb2.append(" (");
        sb2.append(b.g(bluetoothGattService.getUuid()));
        sb2.append(")\n");
        sb2.append("Instance ID: ");
        sb2.append(bluetoothGattService.getInstanceId());
        sb2.append('\n');
    }

    private static String i(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        String strA = R6.b.a(bluetoothGattCharacteristic.getUuid());
        return strA == null ? "Unknown characteristic" : strA;
    }

    private static String j(BluetoothGattDescriptor bluetoothGattDescriptor) {
        String strB = R6.b.b(bluetoothGattDescriptor.getUuid());
        return strB == null ? "Unknown descriptor" : strB;
    }

    private static String k(BluetoothGattService bluetoothGattService) {
        String strC = R6.b.c(bluetoothGattService.getUuid());
        return strC == null ? "Unknown service" : strC;
    }

    private static String l(BluetoothGattService bluetoothGattService) {
        return bluetoothGattService.getType() == 0 ? "Primary Service" : "Secondary Service";
    }

    private String n(P p10, BluetoothDevice bluetoothDevice) {
        StringBuilder sb2 = new StringBuilder();
        f(bluetoothDevice, sb2);
        for (BluetoothGattService bluetoothGattService : p10.a()) {
            sb2.append('\n');
            g(sb2, bluetoothGattService);
        }
        sb2.append("\n--------------- ====== Finished peripheral content ====== ---------------");
        return sb2.toString();
    }

    public void m(P p10, BluetoothDevice bluetoothDevice) {
        if (q.l(2)) {
            q.p("Preparing services description", new Object[0]);
            q.p(n(p10, bluetoothDevice), new Object[0]);
        }
    }
}
