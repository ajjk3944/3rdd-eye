package M6;

import N6.C3370e;
import N6.C3371f;
import P6.G;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

/* loaded from: classes3.dex */
public class q extends p {

    /* renamed from: b, reason: collision with root package name */
    final C3371f f12733b;

    /* renamed from: c, reason: collision with root package name */
    final C3370e f12734c;

    class a implements BluetoothAdapter.LeScanCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ gg.t f12735a;

        a(gg.t tVar) {
            this.f12735a = tVar;
        }

        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public void onLeScan(BluetoothDevice bluetoothDevice, int i10, byte[] bArr) {
            if (!q.this.f12734c.a() && I6.q.l(3) && I6.q.i()) {
                I6.q.b("%s, name=%s, rssi=%d, data=%s", L6.b.d(bluetoothDevice.getAddress()), bluetoothDevice.getName(), Integer.valueOf(i10), L6.b.a(bArr));
            }
            N6.o oVarB = q.this.f12733b.b(bluetoothDevice, i10, bArr);
            if (q.this.f12734c.b(oVarB)) {
                this.f12735a.h(oVarB);
            }
        }
    }

    public q(G g10, C3371f c3371f, C3370e c3370e) {
        super(g10);
        this.f12733b = c3371f;
        this.f12734c = c3370e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // M6.p
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public BluetoothAdapter.LeScanCallback d(gg.t tVar) {
        return new a(tVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // M6.p
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public boolean g(G g10, BluetoothAdapter.LeScanCallback leScanCallback) {
        if (this.f12734c.a()) {
            I6.q.b("No library side filtering —> debug logs of scanned devices disabled", new Object[0]);
        }
        return g10.e(leScanCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // M6.p
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(G g10, BluetoothAdapter.LeScanCallback leScanCallback) {
        g10.g(leScanCallback);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ScanOperationApi18{");
        if (this.f12734c.a()) {
            str = "";
        } else {
            str = "ANY_MUST_MATCH -> " + this.f12734c;
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}
