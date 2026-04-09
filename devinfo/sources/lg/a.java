package lg;

import android.content.pm.PackageManager;
import com.liuzh.deviceinfo.DeviceInfoApp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import jg.l;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends c {
    @Override // lg.c
    public final List d() throws InterruptedException {
        l lVar = this.f28807b;
        if (lVar != null) {
            bi.d.a(new b(lVar, 0), 0L);
        }
        yi.d dVarH = yi.g.f37630a.h(d.h.s(com.liuzh.deviceinfo.utilities.c.f21249b, "/Android/data"));
        boolean zA = dVarH.a();
        s sVar = s.f38317a;
        if (!zA) {
            b();
            return sVar;
        }
        PackageManager packageManager = DeviceInfoApp.f21145f.getPackageManager();
        ArrayList arrayListF = dVarH.f();
        if (arrayListF == null || arrayListF.isEmpty()) {
            b();
            return sVar;
        }
        ArrayList arrayList = new ArrayList();
        CountDownLatch countDownLatch = new CountDownLatch(arrayListF.size());
        AtomicInteger atomicInteger = new AtomicInteger(arrayListF.size() - 1);
        for (int i4 = 0; i4 < 3; i4++) {
            bi.d.c(new com.applovin.impl.mediation.j(atomicInteger, arrayListF, this, countDownLatch, packageManager, arrayList, 5));
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        b();
        arrayList.size();
        return arrayList;
    }
}
