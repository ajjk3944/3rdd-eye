package c7;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.internal.measurement.d5;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import sh.b0;
import sh.e0;
import t6.v;
import u0.u0;
import u6.c0;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2800b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2801c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2803e;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f2799a = i4;
        this.f2800b = obj;
        this.f2801c = obj2;
        this.f2802d = obj3;
        this.f2803e = obj4;
    }

    private final Object c() {
        r rVar = (r) this.f2800b;
        UUID uuid = (UUID) this.f2801c;
        t6.m mVar = (t6.m) this.f2802d;
        Context context = (Context) this.f2803e;
        String string = uuid.toString();
        b7.r rVarD = rVar.f2806c.d(string);
        if (rVarD == null || rVarD.f2031b.a()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        u6.c cVar = (u6.c) rVar.f2805b;
        synchronized (cVar.f35131k) {
            try {
                v.e().f(u6.c.f35122l, "Moving WorkSpec (" + string + ") to the foreground");
                c0 c0Var = (c0) cVar.g.remove(string);
                if (c0Var != null) {
                    if (cVar.f35123a == null) {
                        PowerManager.WakeLock wakeLockA = n.a(cVar.f35124b);
                        cVar.f35123a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    cVar.f35128f.put(string, c0Var);
                    Intent intentB = a7.b.b(cVar.f35124b, d5.h(c0Var.f35132a), mVar);
                    Context context2 = cVar.f35124b;
                    if (Build.VERSION.SDK_INT >= 26) {
                        ub.a.v(context2, intentB);
                    } else {
                        context2.startService(intentB);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b7.l lVarH = d5.h(rVarD);
        String str = a7.b.f208k;
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", mVar.f34381a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", mVar.f34382b);
        intent.putExtra("KEY_NOTIFICATION", mVar.f34383c);
        intent.putExtra("KEY_WORKSPEC_ID", lVarH.f2007a);
        intent.putExtra("KEY_GENERATION", lVarH.f2008b);
        context.startService(intent);
        return null;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f2799a) {
            case 0:
                return c();
            default:
                g1.v vVar = (g1.v) this.f2800b;
                g1.q qVar = (g1.q) this.f2801c;
                tg.o oVar = (tg.o) this.f2802d;
                u0 u0Var = (u0) this.f2803e;
                if (!vVar.isEmpty()) {
                    u0Var.setValue(Boolean.TRUE);
                    ArrayList arrayList = new ArrayList(zj.o.T(qVar, 10));
                    ListIterator listIterator = qVar.listIterator();
                    while (true) {
                        ak.a aVar = (ak.a) listIterator;
                        if (aVar.hasNext()) {
                            String str = ((sh.c0) aVar.next()).f33654c;
                            arrayList.add(new b0(str, vVar.contains(str)));
                        } else {
                            List list = e0.f33672a;
                            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                            com.liuzh.deviceinfo.utilities.f.m("custom_tabs_new", new com.google.gson.j().g(arrayList));
                            com.liuzh.deviceinfo.utilities.f.f21257c.edit().remove("custom_tabs").apply();
                            List listB = e0.b();
                            for (zf.f fVar2 : e0.f33675d) {
                                fVar2.getClass();
                                fVar2.f38267a.E.clear();
                                ArrayList arrayList2 = fVar2.f38267a.E;
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj : listB) {
                                    if (((sh.c0) obj).f33655d) {
                                        arrayList3.add(obj);
                                    }
                                }
                                arrayList2.addAll(arrayList3);
                                ti.a aVar2 = fVar2.f38267a.D;
                                if (aVar2 == null) {
                                    nk.k.k("mPagerAdapter");
                                    throw null;
                                }
                                synchronized (aVar2) {
                                    try {
                                        DataSetObserver dataSetObserver = aVar2.f29767b;
                                        if (dataSetObserver != null) {
                                            dataSetObserver.onChanged();
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                aVar2.f29766a.notifyChanged();
                                fVar2.f38267a.G();
                            }
                            oVar.c0();
                        }
                    }
                }
                return u.f37649a;
        }
    }
}
