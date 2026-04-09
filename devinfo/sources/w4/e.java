package w4;

import android.os.Build;
import com.google.android.gms.internal.play_billing.m1;
import java.util.ArrayList;
import java.util.Set;
import va.k2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fe.b f36430a;

    public e(fe.b bVar) {
        this.f36430a = bVar;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void y(Throwable th2) {
        ((i) this.f36430a.f24016b).e(th2);
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void z(se.b bVar) {
        fe.b bVar2 = this.f36430a;
        bVar2.f24017c = bVar;
        se.b bVar3 = (se.b) bVar2.f24017c;
        i iVar = (i) bVar2.f24016b;
        i7.b bVar4 = iVar.g;
        d dVar = iVar.f36439i;
        Set<int[]> setA = Build.VERSION.SDK_INT >= 34 ? k.a() : ii.a.n();
        m mVar = new m();
        mVar.f36442a = bVar4;
        mVar.f36443b = bVar3;
        mVar.f36444c = dVar;
        if (!setA.isEmpty()) {
            for (int[] iArr : setA) {
                String str = new String(iArr, 0, iArr.length);
                mVar.e(str, 0, str.length(), 1, true, new k2(str));
            }
        }
        bVar2.f24015a = mVar;
        i iVar2 = (i) bVar2.f24016b;
        iVar2.getClass();
        ArrayList arrayList = new ArrayList();
        iVar2.f36432a.writeLock().lock();
        try {
            iVar2.f36434c = 1;
            arrayList.addAll(iVar2.f36433b);
            iVar2.f36433b.clear();
            iVar2.f36432a.writeLock().unlock();
            iVar2.f36435d.post(new b4.a(arrayList, iVar2.f36434c, (Throwable) null));
        } catch (Throwable th2) {
            iVar2.f36432a.writeLock().unlock();
            throw th2;
        }
    }
}
