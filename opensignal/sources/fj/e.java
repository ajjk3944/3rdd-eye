package fj;

import android.telephony.TelephonyManager$CellInfoCallback;
import br.w;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class e extends TelephonyManager$CellInfoCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f8910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f8911b;

    public e(w wVar, CountDownLatch countDownLatch) {
        this.f8910a = wVar;
        this.f8911b = countDownLatch;
    }

    public final void onCellInfo(List list) {
        br.l.e(list, "cellsInfo");
        this.f8910a.f2917a = list;
        this.f8911b.countDown();
    }
}
