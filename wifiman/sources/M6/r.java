package M6;

import N6.C3366a;
import N6.C3370e;
import N6.C3371f;
import P6.G;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import com.polidea.rxandroidble3.exceptions.BleScanException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.snmp4j.mp.MPv3;

/* loaded from: classes3.dex */
public class r extends p {

    /* renamed from: b, reason: collision with root package name */
    final C3371f f12737b;

    /* renamed from: c, reason: collision with root package name */
    private final C3366a f12738c;

    /* renamed from: d, reason: collision with root package name */
    private final Q6.g f12739d;

    /* renamed from: e, reason: collision with root package name */
    final C3370e f12740e;

    /* renamed from: f, reason: collision with root package name */
    private final Q6.d[] f12741f;

    /* renamed from: g, reason: collision with root package name */
    private gg.t f12742g;

    class a extends ScanCallback {
        a() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List list) {
            gg.t tVar;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                N6.o oVarC = r.this.f12737b.c((ScanResult) it.next());
                if (r.this.f12740e.b(oVarC) && (tVar = r.this.f12742g) != null) {
                    tVar.h(oVarC);
                }
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i10) {
            gg.t tVar = r.this.f12742g;
            if (tVar != null) {
                tVar.c(new BleScanException(r.n(i10)));
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i10, ScanResult scanResult) {
            gg.t tVar;
            if (!r.this.f12740e.a() && I6.q.l(3) && I6.q.i()) {
                ScanRecord scanRecord = scanResult.getScanRecord();
                I6.q.b("%s, name=%s, rssi=%d, data=%s", L6.b.d(scanResult.getDevice().getAddress()), scanResult.getDevice().getName(), Integer.valueOf(scanResult.getRssi()), L6.b.a(scanRecord != null ? scanRecord.getBytes() : null));
            }
            N6.o oVarA = r.this.f12737b.a(i10, scanResult);
            if (!r.this.f12740e.b(oVarA) || (tVar = r.this.f12742g) == null) {
                return;
            }
            tVar.h(oVarA);
        }
    }

    public r(G g10, C3371f c3371f, C3366a c3366a, Q6.g gVar, C3370e c3370e, Q6.d[] dVarArr) {
        super(g10);
        this.f12737b = c3371f;
        this.f12739d = gVar;
        this.f12740e = c3370e;
        this.f12741f = dVarArr;
        this.f12738c = c3366a;
        this.f12742g = null;
    }

    static int n(int i10) {
        if (i10 == 1) {
            return 5;
        }
        if (i10 == 2) {
            return 6;
        }
        if (i10 == 3) {
            return 7;
        }
        if (i10 == 4) {
            return 8;
        }
        if (i10 == 5) {
            return 9;
        }
        I6.q.q("Encountered unknown scanning error code: %d -> check android.bluetooth.le.ScanCallback", new Object[0]);
        return MPv3.MAX_MESSAGE_ID;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // M6.p
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ScanCallback d(gg.t tVar) {
        this.f12742g = tVar;
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // M6.p
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean g(G g10, ScanCallback scanCallback) {
        if (this.f12740e.a()) {
            I6.q.b("No library side filtering —> debug logs of scanned devices disabled", new Object[0]);
        }
        g10.d(this.f12738c.c(this.f12741f), this.f12738c.d(this.f12739d), scanCallback);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // M6.p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void h(G g10, ScanCallback scanCallback) {
        g10.f(scanCallback);
        gg.t tVar = this.f12742g;
        if (tVar != null) {
            tVar.a();
            this.f12742g = null;
        }
    }

    public String toString() {
        String str;
        Q6.d[] dVarArr = this.f12741f;
        boolean z10 = dVarArr == null || dVarArr.length == 0;
        boolean zA = this.f12740e.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ScanOperationApi21{");
        String str2 = "";
        if (z10) {
            str = "";
        } else {
            str = "ANY_MUST_MATCH -> nativeFilters=" + Arrays.toString(this.f12741f);
        }
        sb2.append(str);
        sb2.append((z10 || zA) ? "" : " and then ");
        if (!zA) {
            str2 = "ANY_MUST_MATCH -> " + this.f12740e;
        }
        sb2.append(str2);
        sb2.append('}');
        return sb2.toString();
    }
}
