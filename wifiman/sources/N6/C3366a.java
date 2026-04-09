package N6;

import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import java.util.ArrayList;
import java.util.List;

/* renamed from: N6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3366a {

    /* renamed from: a, reason: collision with root package name */
    private final int f15344a;

    public C3366a(int i10) {
        this.f15344a = i10;
    }

    private static void a(Q6.g gVar, ScanSettings.Builder builder) {
        builder.setCallbackType(gVar.b()).setMatchMode(gVar.d()).setNumOfMatches(gVar.e());
    }

    private static ScanFilter b(Q6.d dVar) {
        ScanFilter.Builder builder = new ScanFilter.Builder();
        if (dVar.l() != null) {
            builder.setServiceData(dVar.l(), dVar.j(), dVar.k());
        }
        if (dVar.e() != null) {
            builder.setDeviceAddress(dVar.e());
        }
        return builder.setDeviceName(dVar.f()).setManufacturerData(dVar.i(), dVar.g(), dVar.h()).setServiceUuid(dVar.m(), dVar.n()).build();
    }

    public List c(Q6.d... dVarArr) {
        if (dVarArr == null || dVarArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(dVarArr.length);
        for (Q6.d dVar : dVarArr) {
            arrayList.add(b(dVar));
        }
        return arrayList;
    }

    public ScanSettings d(Q6.g gVar) {
        ScanSettings.Builder builder = new ScanSettings.Builder();
        if (this.f15344a >= 23) {
            a(gVar, builder);
            if (this.f15344a >= 26) {
                builder.setLegacy(gVar.c());
            }
        }
        return builder.setReportDelay(gVar.f()).setScanMode(gVar.g()).build();
    }
}
