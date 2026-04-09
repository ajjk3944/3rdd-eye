package jg;

import android.content.res.Resources;
import android.os.Handler;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.airbnb.lottie.LottieAnimationView;
import com.applovin.impl.c9;
import com.google.android.gms.internal.ads.e80;
import com.liuzh.deviceinfo.clean.StorageCleanActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import nk.t;
import zj.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StorageCleanActivity f27668b;

    public /* synthetic */ h(StorageCleanActivity storageCleanActivity, int i4) {
        this.f27667a = i4;
        this.f27668b = storageCleanActivity;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        t tVar;
        boolean z3;
        int i4 = this.f27667a;
        long j = 0;
        final int i10 = 0;
        final StorageCleanActivity storageCleanActivity = this.f27668b;
        switch (i4) {
            case 0:
                e80 e80Var = storageCleanActivity.E;
                if (e80Var != null) {
                    ((LottieAnimationView) e80Var.f10736i).f();
                    return;
                } else {
                    nk.k.k("binding");
                    throw null;
                }
            case 1:
                int i11 = StorageCleanActivity.K;
                if (storageCleanActivity.isFinishing() || storageCleanActivity.isDestroyed()) {
                    return;
                }
                e80 e80Var2 = storageCleanActivity.E;
                if (e80Var2 == null) {
                    nk.k.k("binding");
                    throw null;
                }
                int measuredHeight = ((CardView) e80Var2.f10730b).getMeasuredHeight();
                Resources resources = storageCleanActivity.getResources();
                nk.k.d(resources, "getResources(...)");
                int iC = a4.a.c(resources, 28.0f) + measuredHeight;
                e80 e80Var3 = storageCleanActivity.E;
                if (e80Var3 == null) {
                    nk.k.k("binding");
                    throw null;
                }
                ((CardView) e80Var3.f10730b).animate().translationY(-iC).setDuration(380L).start();
                e80 e80Var4 = storageCleanActivity.E;
                if (e80Var4 == null) {
                    nk.k.k("binding");
                    throw null;
                }
                int top = ((LottieAnimationView) e80Var4.f10736i).getTop();
                nk.k.d(storageCleanActivity.getResources(), "getResources(...)");
                float f10 = -(top - a4.a.c(r4, 28.0f));
                e80 e80Var5 = storageCleanActivity.E;
                if (e80Var5 == null) {
                    nk.k.k("binding");
                    throw null;
                }
                ((LottieAnimationView) e80Var5.f10736i).animate().translationY(f10).scaleX(0.8f).scaleY(0.8f).setDuration(380L).start();
                e80 e80Var6 = storageCleanActivity.E;
                if (e80Var6 == null) {
                    nk.k.k("binding");
                    throw null;
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = ((TextView) e80Var6.f10740n).animate();
                nk.k.d(storageCleanActivity.getResources(), "getResources(...)");
                viewPropertyAnimatorAnimate.translationY(f10 - a4.a.c(r3, 28.0f)).start();
                return;
            case 2:
                int i12 = StorageCleanActivity.K;
                long jCurrentTimeMillis = System.currentTimeMillis();
                StorageCleanActivity storageCleanActivity2 = this.f27668b;
                ArrayList arrayList = storageCleanActivity2.C;
                ArrayList arrayList2 = storageCleanActivity2.B;
                CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
                ArrayList arrayList3 = new ArrayList();
                t tVar2 = new t();
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    StorageCleanActivity storageCleanActivity3 = storageCleanActivity2;
                    c9 c9Var = new c9((lg.c) obj, storageCleanActivity3, countDownLatch2, tVar2, arrayList3, 5);
                    Handler handler = bi.d.f2269a;
                    new Thread(c9Var).start();
                    storageCleanActivity2 = storageCleanActivity3;
                    j = j;
                    countDownLatch = countDownLatch2;
                }
                final StorageCleanActivity storageCleanActivity4 = storageCleanActivity2;
                long j8 = j;
                t tVar3 = tVar2;
                try {
                    countDownLatch.await();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                ArrayList arrayList4 = new ArrayList(o.T(arrayList3, 10));
                int size2 = arrayList3.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = arrayList3.get(i14);
                    i14++;
                    kg.d dVar = (kg.d) obj2;
                    e eVar = new e(dVar);
                    if (dVar instanceof kg.a) {
                        kg.a aVar = (kg.a) dVar;
                        long j9 = aVar.f28285i;
                        if (j9 < j8) {
                            tVar = tVar3;
                        } else {
                            tVar = tVar3;
                            long j10 = aVar.f28284h;
                            if (j10 < j8 || j10 < j9) {
                                z3 = false;
                            }
                            eVar.f27660a = z3;
                        }
                        z3 = true;
                        eVar.f27660a = z3;
                    } else {
                        tVar = tVar3;
                    }
                    if (dVar.c()) {
                        eVar.f27660a = false;
                    }
                    arrayList4.add(eVar);
                    i10 = 0;
                    tVar3 = tVar;
                }
                final t tVar4 = tVar3;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size3 = arrayList4.size();
                while (i10 < size3) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    Serializable serializableE = ((e) obj3).e();
                    Object arrayList5 = linkedHashMap.get(serializableE);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap.put(serializableE, arrayList5);
                    }
                    ((List) arrayList5).add(obj3);
                }
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    List listO0 = zj.n.o0((Iterable) ((Map.Entry) it.next()).getValue(), new androidx.recyclerview.widget.m(8));
                    d dVar2 = new d(listO0);
                    arrayList2.add(dVar2);
                    if (dVar2.f27656d) {
                        arrayList2.addAll(listO0);
                    }
                }
                if (System.currentTimeMillis() - jCurrentTimeMillis < 2000) {
                    Thread.sleep(2000L);
                } else if (System.currentTimeMillis() - jCurrentTimeMillis < 4000) {
                    Thread.sleep(900L);
                }
                if (storageCleanActivity4.isFinishing() || storageCleanActivity4.isDestroyed()) {
                    return;
                }
                final int i15 = 1;
                bi.d.b(new Runnable() { // from class: jg.i
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:154:0x0383  */
                    /* JADX WARN: Removed duplicated region for block: B:163:0x03d2  */
                    /* JADX WARN: Type inference failed for: r17v11 */
                    /* JADX WARN: Type inference failed for: r17v12 */
                    /* JADX WARN: Type inference failed for: r17v2 */
                    /* JADX WARN: Type inference failed for: r8v7, types: [sl.b] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() throws java.lang.Throwable {
                        /*
                            Method dump skipped, instructions count: 1152
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: jg.i.run():void");
                    }
                });
                return;
            default:
                int i16 = StorageCleanActivity.K;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                final t tVar5 = new t();
                ArrayList arrayList6 = storageCleanActivity.B;
                ArrayList arrayList7 = new ArrayList(o.T(arrayList6, 10));
                int size4 = arrayList6.size();
                int i17 = 0;
                while (i17 < size4) {
                    Object obj4 = arrayList6.get(i17);
                    i17++;
                    f fVar = (f) obj4;
                    arrayList7.add(fVar instanceof d ? ((d) fVar).f27654b : cm.g.s(fVar));
                }
                ArrayList arrayList8 = new ArrayList();
                int size5 = arrayList7.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj5 = arrayList7.get(i18);
                    i18++;
                    zj.n.W(arrayList8, (Iterable) obj5);
                }
                ArrayList arrayList9 = new ArrayList();
                int size6 = arrayList8.size();
                int i19 = 0;
                while (i19 < size6) {
                    Object obj6 = arrayList8.get(i19);
                    i19++;
                    if (((f) obj6).f27660a) {
                        arrayList9.add(obj6);
                    }
                }
                int size7 = arrayList9.size();
                int i20 = 0;
                while (i20 < size7) {
                    Object obj7 = arrayList9.get(i20);
                    i20++;
                    f fVar2 = (f) obj7;
                    if (fVar2 instanceof e) {
                        e eVar2 = (e) fVar2;
                        if (!(eVar2.f27657b instanceof kg.c)) {
                            continue;
                        } else {
                            if (storageCleanActivity.isFinishing() || storageCleanActivity.isDestroyed()) {
                                return;
                            }
                            bi.d.b(new aj.d(29, storageCleanActivity, eVar2));
                            tVar5.f29985a = eVar2.size() + tVar5.f29985a;
                            try {
                                if ((((e) fVar2).f27657b instanceof kg.e) && ((kg.e) ((e) fVar2).f27657b).f28292e == 3) {
                                    wi.c.c(((kg.e) ((e) fVar2).f27657b).f28291d, true);
                                } else {
                                    wi.c.c(((kg.c) ((e) fVar2).f27657b).f28291d, false);
                                }
                                aj.b bVar = ((kg.c) ((e) fVar2).f27657b).f28290c;
                                if (bVar != null) {
                                    bVar.b(0L, true);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (System.currentTimeMillis() - jCurrentTimeMillis2 < 4000) {
                    Thread.sleep(4200L);
                } else if (System.currentTimeMillis() - jCurrentTimeMillis2 < 6000) {
                    Thread.sleep(1000L);
                }
                bi.d.b(new Runnable() { // from class: jg.i
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        /*
                            Method dump skipped, instructions count: 1152
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: jg.i.run():void");
                    }
                });
                return;
        }
    }
}
