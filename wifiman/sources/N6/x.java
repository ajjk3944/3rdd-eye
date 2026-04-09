package N6;

import P6.I;
import android.bluetooth.le.ScanRecord;
import android.os.Build;
import android.os.ParcelUuid;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class x implements Q6.e {

    /* renamed from: a, reason: collision with root package name */
    private final ScanRecord f15388a;

    /* renamed from: b, reason: collision with root package name */
    private final I f15389b;

    public x(ScanRecord scanRecord, I i10) {
        this.f15388a = scanRecord;
        this.f15389b = i10;
    }

    @Override // Q6.e
    public String a() {
        return this.f15388a.getDeviceName();
    }

    @Override // Q6.e
    public byte[] b() {
        return this.f15388a.getBytes();
    }

    @Override // Q6.e
    public int c() {
        return this.f15388a.getAdvertiseFlags();
    }

    @Override // Q6.e
    public byte[] d(int i10) {
        return this.f15388a.getManufacturerSpecificData(i10);
    }

    @Override // Q6.e
    public List e() {
        return Build.VERSION.SDK_INT >= 29 ? this.f15388a.getServiceSolicitationUuids() : this.f15389b.b(this.f15388a.getBytes()).e();
    }

    @Override // Q6.e
    public List f() {
        return this.f15388a.getServiceUuids();
    }

    @Override // Q6.e
    public Map g() {
        return this.f15388a.getServiceData();
    }

    @Override // Q6.e
    public byte[] h(ParcelUuid parcelUuid) {
        return this.f15388a.getServiceData(parcelUuid);
    }
}
