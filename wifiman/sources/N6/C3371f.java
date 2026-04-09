package N6;

import P6.I;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanResult;

/* renamed from: N6.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3371f {

    /* renamed from: a, reason: collision with root package name */
    private final I f15356a;

    /* renamed from: b, reason: collision with root package name */
    private final j f15357b;

    public C3371f(I i10, j jVar) {
        this.f15356a = i10;
        this.f15357b = jVar;
    }

    private static Q6.c d(int i10) {
        if (i10 == 1) {
            return Q6.c.CALLBACK_TYPE_ALL_MATCHES;
        }
        if (i10 == 2) {
            return Q6.c.CALLBACK_TYPE_FIRST_MATCH;
        }
        if (i10 == 4) {
            return Q6.c.CALLBACK_TYPE_MATCH_LOST;
        }
        I6.q.q("Unknown callback type %d -> check android.bluetooth.le.ScanSettings", Integer.valueOf(i10));
        return Q6.c.CALLBACK_TYPE_UNKNOWN;
    }

    public o a(int i10, ScanResult scanResult) {
        return new o(scanResult.getDevice(), scanResult.getRssi(), scanResult.getTimestampNanos(), new x(scanResult.getScanRecord(), this.f15356a), d(i10), this.f15357b.a(scanResult));
    }

    public o b(BluetoothDevice bluetoothDevice, int i10, byte[] bArr) {
        return new o(bluetoothDevice, i10, System.nanoTime(), this.f15356a.b(bArr), Q6.c.CALLBACK_TYPE_UNSPECIFIED, Q6.b.LEGACY_UNKNOWN);
    }

    public o c(ScanResult scanResult) {
        return new o(scanResult.getDevice(), scanResult.getRssi(), scanResult.getTimestampNanos(), new x(scanResult.getScanRecord(), this.f15356a), Q6.c.CALLBACK_TYPE_BATCH, this.f15357b.a(scanResult));
    }
}
