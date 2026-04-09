package L6;

import I6.q;
import M6.j;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.UUID;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f11242a = "0123456789ABCDEF".toCharArray();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f11243a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f11244b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f11245c;

        public a(UUID uuid, byte[] bArr, boolean z10) {
            this.f11243a = uuid;
            this.f11244b = bArr;
            this.f11245c = z10;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[uuid='");
            sb2.append(b.g(this.f11243a));
            if (this.f11245c) {
                str = "', hexValue=" + b.a(this.f11244b);
            } else {
                str = "'";
            }
            sb2.append(str);
            sb2.append(']');
            return sb2.toString();
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        if (!q.h()) {
            return "[...]";
        }
        int length = bArr.length;
        if (length == 0) {
            return "[]";
        }
        int i10 = length - 1;
        int i11 = (length * 2) + (i10 * 2);
        char[] cArr = new char[i11 + 2];
        for (int i12 = 0; i12 < length; i12++) {
            byte b10 = bArr[i12];
            int i13 = i12 * 2;
            int i14 = i13 + 1 + i13;
            char[] cArr2 = f11242a;
            cArr[i14] = cArr2[(b10 & 255) >>> 4];
            cArr[i14 + 1] = cArr2[b10 & 15];
        }
        for (int i15 = 0; i15 < i10; i15++) {
            int i16 = i15 * 2;
            int i17 = i16 + 1 + i16;
            cArr[i17 + 2] = ',';
            cArr[i17 + 3] = ' ';
        }
        cArr[0] = '[';
        cArr[i11 + 1] = ']';
        return new String(cArr);
    }

    private static String b() {
        return " %24s()";
    }

    public static String c(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt == null ? "MAC=null" : d(bluetoothGatt.getDevice().getAddress());
    }

    public static String d(String str) {
        if (str == null) {
            return "MAC=null";
        }
        int iG = q.g();
        if (iG == 3) {
            str = str.substring(0, 15) + "XX";
        } else if (iG == Integer.MAX_VALUE) {
            str = "XX:XX:XX:XX:XX:XX";
        }
        return String.format("MAC='%s'", str);
    }

    private static String e() {
        return ", status=%d";
    }

    private static String f() {
        return ", value=%s";
    }

    public static String g(UUID uuid) {
        return q.j() == 2 ? uuid.toString() : "...";
    }

    public static void h(String str, BluetoothGatt bluetoothGatt, int i10) {
        if (q.l(4)) {
            q.k(c(bluetoothGatt) + b() + e(), str, Integer.valueOf(i10));
        }
    }

    public static void i(String str, BluetoothGatt bluetoothGatt, int i10, int i11) {
        if (q.l(4)) {
            q.k(c(bluetoothGatt) + b() + e() + f(), str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    public static void j(String str, BluetoothGatt bluetoothGatt, int i10, int i11, int i12) {
        if (q.l(4)) {
            q.k(c(bluetoothGatt) + b() + e() + f() + f(), str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    public static void k(String str, BluetoothGatt bluetoothGatt, int i10, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z10) {
        if (q.l(4)) {
            q.k(c(bluetoothGatt) + b() + e() + f(), str, Integer.valueOf(i10), new a(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue(), z10));
        }
    }

    public static void l(String str, BluetoothGatt bluetoothGatt, int i10, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z10) {
        if (q.l(4)) {
            q.k(c(bluetoothGatt) + b() + e() + f(), str, Integer.valueOf(i10), new a(bluetoothGattDescriptor.getUuid(), bluetoothGattDescriptor.getValue(), z10));
        }
    }

    public static void m(String str, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z10) {
        if (q.l(4)) {
            q.k(c(bluetoothGatt) + b() + f(), str, new a(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue(), z10));
        }
    }

    public static void n(String str, BluetoothGatt bluetoothGatt, int i10, int i11, int i12, int i13) {
        if (q.l(4)) {
            q.k(c(bluetoothGatt) + b() + e() + ", interval=%d (%.2f ms), latency=%d, timeout=%d (%.0f ms)", str, Integer.valueOf(i10), Integer.valueOf(i11), Float.valueOf(i11 * 1.25f), Integer.valueOf(i12), Integer.valueOf(i13), Float.valueOf(i13 * 10.0f));
        }
    }

    public static void o(j jVar, long j10, long j11) {
        if (q.l(3)) {
            q.b("FINISHED %s(%d) in %d ms", jVar.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(jVar)), Long.valueOf(j11 - j10));
        }
    }

    public static void p(j jVar) {
        if (q.l(3)) {
            q.b("QUEUED   %s(%d)", jVar.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(jVar)));
        }
    }

    public static void q(j jVar) {
        if (q.l(3)) {
            q.b("REMOVED  %s(%d)", jVar.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(jVar)));
        }
    }

    public static void r(j jVar) {
        q.k("RUNNING  %s", jVar);
    }

    public static void s(j jVar) {
        if (q.l(2)) {
            q.p("SKIPPED  %s(%d) just before running — is disposed", jVar.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(jVar)));
        }
    }

    public static void t(j jVar) {
        if (q.l(3)) {
            q.b("STARTED  %s(%d)", jVar.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(jVar)));
        }
    }

    public static a u(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z10) {
        return new a(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue(), z10);
    }
}
