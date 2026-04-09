package p;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.app.FrameMetricsAggregator;
import com.google.android.gms.internal.measurement.e5;
import com.opensignal.sdk.domain.model.TaskInfo;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class v2 implements vg.b {
    public final Object B;
    public Object D;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20200a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20201d;

    /* renamed from: g, reason: collision with root package name */
    public Object f20202g;

    /* renamed from: r, reason: collision with root package name */
    public Object f20203r;

    /* renamed from: x, reason: collision with root package name */
    public final Object f20204x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f20205y;

    public v2() {
        this.f20200a = 1;
        this.f20201d = new AtomicBoolean();
        this.f20202g = null;
        this.f20203r = new HashMap(16, 1.0f);
        this.f20204x = new HashMap(16, 1.0f);
        this.f20205y = new HashMap(16, 1.0f);
        this.B = new HashMap(16, 1.0f);
        this.D = null;
    }

    public static ht.b0 c(ht.b0 b0Var, ht.x xVar) {
        or.h hVarA = se.b.A(b0Var);
        sr.h annotations = b0Var.getAnnotations();
        ht.x xVarI = xu.d.I(b0Var);
        List listS = xu.d.s(b0Var);
        List listN0 = mq.o.n0(xu.d.L(b0Var));
        ArrayList arrayList = new ArrayList(mq.p.a0(listN0, 10));
        Iterator it = listN0.iterator();
        while (it.hasNext()) {
            arrayList.add(((ht.p0) it.next()).b());
        }
        return xu.d.m(hVarA, annotations, xVarI, listS, arrayList, xVar, true).p0(b0Var.c0());
    }

    public static final ArrayList k(ls.q0 q0Var, v2 v2Var) {
        List list = q0Var.f15860r;
        br.l.d(list, "argumentList");
        ls.q0 q0VarH = ba.m.H(q0Var, (h7.h0) ((al.b) v2Var.f20201d).f813e);
        Iterable iterableK = q0VarH != null ? k(q0VarH, v2Var) : null;
        if (iterableK == null) {
            iterableK = mq.w.f16945a;
        }
        return mq.o.E0(list, iterableK);
    }

    public static ht.i0 l(List list, sr.h hVar, ht.m0 m0Var, rr.l lVar) {
        ht.i0 i0VarM;
        ArrayList arrayList = new ArrayList(mq.p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ht.m) it.next()).getClass();
            if (hVar.isEmpty()) {
                ht.i0.f10910d.getClass();
                i0VarM = ht.i0.f10911g;
            } else {
                bm.e eVar = ht.i0.f10910d;
                List listH = e5.H(new ht.i(hVar));
                eVar.getClass();
                i0VarM = bm.e.m(listH);
            }
            arrayList.add(i0VarM);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            mq.t.d0(arrayList2, (Iterable) it2.next());
        }
        ht.i0.f10910d.getClass();
        return bm.e.m(arrayList2);
    }

    public static final rr.f n(v2 v2Var, ls.q0 q0Var, int i10) {
        al.b bVar = (al.b) v2Var.f20201d;
        qs.b bVarT = io.sentry.config.a.T((ns.f) bVar.f811c, i10);
        st.p pVarB0 = st.l.b0(st.l.a0(q0Var, new dt.a0(v2Var, 2)), dt.c0.f7479g);
        ArrayList arrayList = new ArrayList();
        Iterator it = pVarB0.f22304a.iterator();
        while (it.hasNext()) {
            arrayList.add(pVarB0.f22305b.a(it.next()));
        }
        int iX = st.l.X(st.l.a0(bVarT, dt.b0.E));
        while (arrayList.size() < iX) {
            arrayList.add(0);
        }
        return ((dt.k) bVar.f810b).f7502l.Y(bVarT, arrayList);
    }

    public void a(Activity activity) {
        io.sentry.q qVarA = ((io.sentry.util.a) this.B).a();
        try {
            if (!f()) {
                qVarA.close();
                return;
            }
            h(new io.sentry.android.core.b(this, activity, 0), "FrameMetricsAggregator.add");
            io.sentry.android.core.c cVarB = b();
            if (cVarB != null) {
                ((WeakHashMap) this.f20204x).put(activity, cVarB);
            }
            qVarA.close();
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public io.sentry.android.core.c b() {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        if (!f() || !((Boolean) ((io.sentry.util.e) this.D).a()).booleanValue()) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) ((FrameMetricsAggregator) ((io.sentry.util.e) this.f20201d).a()).f1209a.f154b;
        int i12 = 0;
        if (sparseIntArrayArr.length <= 0 || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i10 = 0;
            i11 = 0;
        } else {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i12);
                int iValueAt = sparseIntArray.valueAt(i12);
                i13 += iValueAt;
                if (iKeyAt > 700) {
                    i11 += iValueAt;
                } else if (iKeyAt > 16) {
                    i10 += iValueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new io.sentry.android.core.c(i12, i10, i11);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public List d() {
        return mq.o.Q0(this.D.values());
    }

    public ArrayList e() {
        qj.a aVar = (qj.a) this.f20201d;
        ArrayList arrayList = new ArrayList();
        List listC = ((h9.p) this.f20205y).c();
        ArrayList arrayList2 = new ArrayList(mq.p.a0(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList2.add((TaskInfo) ((xj.h) this.f20202g).a((hk.h) it.next()));
        }
        ArrayList arrayList3 = new ArrayList(mq.p.a0(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(TaskInfo.d((TaskInfo) it2.next(), "currently_running_tasks"));
        }
        arrayList.addAll(mq.o.M0(arrayList3, new sm.i(5)));
        hi.a aVar2 = (hi.a) this.B;
        mq.w wVar = mq.w.f16945a;
        ArrayList arrayListJ = aVar.j(aVar2, wVar, wVar);
        ArrayList arrayList4 = new ArrayList(mq.p.a0(arrayListJ, 10));
        Iterator it3 = arrayListJ.iterator();
        while (it3.hasNext()) {
            arrayList4.add((TaskInfo) ((xj.h) this.f20203r).a((rj.f) it3.next()));
        }
        ArrayList arrayList5 = new ArrayList(mq.p.a0(arrayList4, 10));
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            arrayList5.add(TaskInfo.d((TaskInfo) it4.next(), "scheduled_tasks"));
        }
        arrayList.addAll(mq.o.M0(arrayList5, new sm.i(6)));
        ArrayList arrayListJ2 = aVar.j((hi.a) this.D, wVar, wVar);
        ArrayList arrayList6 = new ArrayList(mq.p.a0(arrayListJ2, 10));
        Iterator it5 = arrayListJ2.iterator();
        while (it5.hasNext()) {
            arrayList6.add((TaskInfo) ((xj.h) this.f20204x).a((rj.b) it5.next()));
        }
        arrayList.addAll(mq.o.M0(arrayList6, new sm.i(7)));
        return arrayList;
    }

    public boolean f() {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f20202g;
        return ((Boolean) ((io.sentry.util.e) this.D).a()).booleanValue() && sentryAndroidOptions.isEnableFramesTracking() && !sentryAndroidOptions.isEnablePerformanceV2();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public rr.r0 g(int i10) {
        rr.r0 r0Var = (rr.r0) this.D.get(Integer.valueOf(i10));
        if (r0Var != null) {
            return r0Var;
        }
        v2 v2Var = (v2) this.f20202g;
        if (v2Var != null) {
            return v2Var.g(i10);
        }
        return null;
    }

    @Override // kq.a
    public Object get() {
        return new tg.a1((wg.k) ((kq.a) this.f20201d).get(), (tg.q0) ((kq.a) this.f20202g).get(), (tg.m0) ((kq.a) this.f20203r).get(), (tg.e1) ((kq.a) this.f20204x).get(), (d4.g) ((kq.a) this.f20205y).get(), (tg.a0) ((vg.c) this.B).get(), (pq.h) ((kq.a) this.D).get());
    }

    public void h(Runnable runnable, String str) {
        try {
            if (io.sentry.android.core.internal.util.e.f11647a.c()) {
                runnable.run();
                return;
            }
            io.sentry.android.core.f0 f0Var = (io.sentry.android.core.f0) this.f20205y;
            ((Handler) f0Var.f11569a).post(new io.sentry.android.core.t0(this, runnable, str, 1));
        } catch (Throwable unused) {
            if (str != null) {
                ((SentryAndroidOptions) this.f20202g).getLogger().m(b5.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    public void i(String str) {
        d8.a aVar = (d8.a) this.f20205y;
        synchronized (aVar) {
            try {
                if (((kf.d) ((AtomicMarkableReference) aVar.f7149c).getReference()).b(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) aVar.f7149c;
                    atomicMarkableReference.set((kf.d) atomicMarkableReference.getReference(), true);
                    j4.o oVar = new j4.o(5, aVar);
                    AtomicReference atomicReference = (AtomicReference) aVar.f7147a;
                    while (!atomicReference.compareAndSet(null, oVar)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    ((jf.d) ((v2) aVar.f7150d).f20202g).f13708b.a(oVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ht.b0 j(ls.q0 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.v2.j(ls.q0, boolean):ht.b0");
    }

    public ht.x m(ls.q0 q0Var) {
        al.b bVar = (al.b) this.f20201d;
        br.l.e(q0Var, "proto");
        if ((q0Var.f15859g & 2) != 2) {
            return j(q0Var, true);
        }
        String string = ((ns.f) bVar.f811c).getString(q0Var.f15862y);
        ht.b0 b0VarJ = j(q0Var, true);
        h7.h0 h0Var = (h7.h0) bVar.f813e;
        int i10 = q0Var.f15859g;
        ls.q0 q0VarX = (i10 & 4) == 4 ? q0Var.B : (i10 & 8) == 8 ? h0Var.x(q0Var.D) : null;
        br.l.b(q0VarX);
        return ((dt.k) bVar.f810b).j.a(q0Var, string, b0VarJ, j(q0VarX, true));
    }

    public String toString() {
        String str;
        switch (this.f20200a) {
            case 2:
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) this.f20203r);
                v2 v2Var = (v2) this.f20202g;
                if (v2Var == null) {
                    str = "";
                } else {
                    str = ". Child of " + ((String) v2Var.f20203r);
                }
                sb2.append(str);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public v2(qj.a aVar, xj.h hVar, xj.h hVar2, xj.h hVar3, h9.p pVar, hi.a aVar2, hi.a aVar3) {
        this.f20200a = 6;
        br.l.e(hVar, "taskMapper");
        br.l.e(hVar2, "taskTableRawMapper");
        br.l.e(hVar3, "jobResultMapper");
        this.f20201d = aVar;
        this.f20202g = hVar;
        this.f20203r = hVar2;
        this.f20204x = hVar3;
        this.f20205y = pVar;
        this.B = aVar2;
        this.D = aVar3;
    }

    public v2(al.b bVar, v2 v2Var, List list, String str, String str2) {
        Map linkedHashMap;
        this.f20200a = 2;
        br.l.e(list, "typeParameterProtos");
        br.l.e(str, "debugName");
        this.f20201d = bVar;
        this.f20202g = v2Var;
        this.f20203r = str;
        this.f20204x = str2;
        dt.k kVar = (dt.k) bVar.f810b;
        this.f20205y = kVar.f7493a.c(new dt.a0(this, 0));
        this.B = kVar.f7493a.c(new dt.a0(this, 1));
        if (list.isEmpty()) {
            linkedHashMap = mq.x.f16946a;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                ls.v0 v0Var = (ls.v0) it.next();
                linkedHashMap.put(Integer.valueOf(v0Var.f15894r), new ft.v((al.b) this.f20201d, v0Var, i10));
                i10++;
            }
        }
        this.D = linkedHashMap;
    }

    public v2(vg.c cVar, vg.c cVar2, vg.c cVar3, vg.c cVar4, vg.c cVar5, vg.c cVar6, i5.c cVar7) {
        this.f20200a = 5;
        this.f20201d = cVar;
        this.f20202g = cVar2;
        this.f20203r = cVar3;
        this.f20204x = cVar4;
        this.f20205y = cVar5;
        this.B = cVar6;
        this.D = cVar7;
    }

    public v2(Context context) {
        this.f20200a = 0;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f20204x = layoutParams;
        this.f20205y = new Rect();
        this.B = new int[2];
        this.D = new int[2];
        this.f20201d = context;
        View viewInflate = LayoutInflater.from(context).inflate(h.g.abc_tooltip, (ViewGroup) null);
        this.f20202g = viewInflate;
        this.f20203r = (TextView) viewInflate.findViewById(h.f.message);
        layoutParams.setTitle(v2.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = h.i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public v2(sm.f fVar, SentryAndroidOptions sentryAndroidOptions) {
        this.f20200a = 3;
        io.sentry.android.core.f0 f0Var = new io.sentry.android.core.f0();
        this.f20203r = new ConcurrentHashMap();
        this.f20204x = new WeakHashMap();
        this.B = new io.sentry.util.a();
        this.D = new io.sentry.util.e(new io.sentry.android.replay.capture.e(fVar, sentryAndroidOptions.getLogger()));
        this.f20201d = new io.sentry.util.e(new d5.v(21));
        this.f20202g = sentryAndroidOptions;
        this.f20205y = f0Var;
    }

    public v2(String str, of.b bVar, jf.d dVar) {
        this.f20200a = 4;
        this.f20204x = new d8.a(this, false);
        this.f20205y = new d8.a(this, true);
        this.B = new kf.n(0);
        this.D = new AtomicMarkableReference(null, false);
        this.f20203r = str;
        this.f20201d = new kf.g(bVar);
        this.f20202g = dVar;
    }
}
