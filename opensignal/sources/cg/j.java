package cg;

import android.app.Application;
import android.content.Context;
import br.x;
import br.y;
import c0.s;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.i4;
import com.staircase3.opensignal.OpensignalApplication;
import io.sentry.android.core.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.a0;
import ku.o0;
import ku.r0;
import lq.b0;
import mq.o;
import mq.p;
import mq.w;
import n0.l1;
import n0.o1;
import n0.v;
import p.l2;
import tg.f0;
import tg.g0;
import wt.t0;
import x0.q;
import x0.r;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements ar.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3757a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3758d;

    public /* synthetic */ j(int i10, Object obj) {
        this.f3757a = i10;
        this.f3758d = obj;
    }

    @Override // ar.k
    public final Object a(Object obj) throws ba.l {
        int iIntValue = 0;
        switch (this.f3757a) {
            case 0:
                l lVar = (l) this.f3758d;
                h4.b bVar = (h4.b) obj;
                h4.e eVar = l.f3761c;
                long j = 0;
                for (Map.Entry entry : bVar.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        h4.e eVar2 = (h4.e) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strB = lVar.b(System.currentTimeMillis());
                        if (set.contains(strB)) {
                            Object[] objArr = {strB};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr[0];
                            Objects.requireNonNull(obj2);
                            if (!hashSet.add(obj2)) {
                                throw new IllegalArgumentException("duplicate element: " + obj2);
                            }
                            bVar.d(eVar2, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            bVar.c(eVar2);
                        }
                    }
                }
                if (j == 0) {
                    bVar.c(eVar);
                } else {
                    bVar.d(eVar, Long.valueOf(j));
                }
                return null;
            case 1:
                ((d8.f) this.f3758d).G = true;
                return b0.f15562a;
            case 2:
                ((eu.d) this.f3758d).f(null);
                return b0.f15562a;
            case 3:
                iu.f fVar = (iu.f) this.f3758d;
                int iIntValue2 = ((Integer) obj).intValue();
                return fVar.f13002f[iIntValue2] + ": " + fVar.f13003g[iIntValue2].h();
            case 4:
                a0 a0Var = (a0) obj;
                return ((k2.i) this.f3758d).a(new a0(null, a0Var.f13970b, a0Var.f13971c, a0Var.f13972d, a0Var.f13973e)).getValue();
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                o0 o0Var = (o0) this.f3758d;
                iu.a aVar = (iu.a) obj;
                br.l.e(aVar, "$this$buildSerialDescriptor");
                o0Var.getClass();
                aVar.f12983b = w.f16945a;
                return b0.f15562a;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                r0 r0Var = (r0) this.f3758d;
                int iIntValue3 = ((Integer) obj).intValue();
                return r0Var.f14610e[iIntValue3] + ": " + r0Var.n(iIntValue3).h();
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ml.b bVar2 = (ml.b) this.f3758d;
                zl.e eVar3 = (zl.e) obj;
                br.l.b(eVar3);
                bVar2.h0(eVar3);
                return b0.f15562a;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return obj == ((mq.a) this.f3758d) ? "(this Collection)" : String.valueOf(obj);
            case 9:
                mq.e eVar4 = (mq.e) this.f3758d;
                Map.Entry entry2 = (Map.Entry) obj;
                br.l.e(entry2, "it");
                StringBuilder sb2 = new StringBuilder();
                Object key = entry2.getKey();
                sb2.append(key == eVar4 ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = entry2.getValue();
                sb2.append(value != eVar4 ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case 10:
                ((v) this.f3758d).u(obj);
                return b0.f15562a;
            case 11:
                o1 o1Var = (o1) this.f3758d;
                Throwable th2 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th2);
                synchronized (o1Var.f17234b) {
                    try {
                        t0 t0Var = o1Var.f17235c;
                        if (t0Var != null) {
                            o1Var.f17250t.g(l1.ShuttingDown);
                            t0Var.h(cancellationException);
                            o1Var.f17247q = null;
                            t0Var.R(new s(o1Var, 5, th2));
                        } else {
                            o1Var.f17236d = cancellationException;
                            o1Var.f17250t.g(l1.ShutDown);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return b0.f15562a;
            case 12:
                OpensignalApplication opensignalApplication = (OpensignalApplication) this.f3758d;
                jv.b bVar3 = (jv.b) obj;
                AtomicBoolean atomicBoolean = OpensignalApplication.B;
                br.l.e(bVar3, "$this$startKoin");
                jv.a aVar2 = bVar3.f13866a;
                l2 l2Var = aVar2.f13864b;
                pv.a aVar3 = pv.a.INFO;
                if (l2Var.F(aVar3)) {
                    l2Var.B(aVar3, "[init] declare Android Context");
                }
                qv.a aVar4 = new qv.a();
                gv.a aVar5 = new gv.a(iIntValue, opensignalApplication);
                mv.d dVarA = aVar4.a();
                sv.a aVar6 = aVar4.f21092a;
                mv.c cVar = mv.c.Single;
                y yVar = x.f2918a;
                mv.b bVar4 = new mv.b(aVar6, yVar.b(Context.class), null, aVar5, cVar, dVarA);
                i4.c(aVar4.f21095d, bVar4);
                bVar4.f17064f = o.F0(bVar4.f17064f, yVar.b(Application.class));
                jv.a.b(aVar2, e5.H(aVar4));
                List listI = e5.I(wl.b.f24543a, ol.a.f19547a, il.b.f11436a, il.c.f11437a, ym.a.f26409a);
                if (l2Var.F(aVar3)) {
                    double dH = xu.l.H(new ah.d(bVar3, 26, listI));
                    Collection collectionValues = ((HashMap) aVar2.f13863a.f23027a).values();
                    br.l.d(collectionValues, "_scopeDefinitions.values");
                    Collection collection = collectionValues;
                    ArrayList arrayList = new ArrayList(p.a0(collection, 10));
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((uv.c) it.next()).f23728c.size()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        iIntValue += ((Number) it2.next()).intValue();
                    }
                    String str = "loaded " + iIntValue + " definitions - " + dH + " ms";
                    br.l.e(str, "msg");
                    l2Var.B(pv.a.INFO, str);
                } else {
                    jv.a.b(aVar2, listI);
                }
                return b0.f15562a;
            case 13:
                es.b0 b0Var = (es.b0) this.f3758d;
                br.l.e(obj, "it");
                return b0Var.c();
            case 14:
                g0 g0Var = (g0) this.f3758d;
                d4.b bVar5 = (d4.b) obj;
                br.l.e(bVar5, "ex");
                e0.q("FirebaseSessions", "CorruptionException in session data DataStore", bVar5);
                return new f0(g0Var.f22782a.a(null), null, null);
            case 15:
                return ((s0.j) this.f3758d).b(((Integer) obj).intValue());
            default:
                r rVar = (r) this.f3758d;
                synchronized (rVar.f24744g) {
                    q qVar = rVar.f24746i;
                    br.l.b(qVar);
                    Object obj3 = qVar.f24729b;
                    br.l.b(obj3);
                    int i10 = qVar.f24731d;
                    u.y yVar2 = qVar.f24730c;
                    if (yVar2 == null) {
                        yVar2 = new u.y();
                        qVar.f24730c = yVar2;
                        qVar.f24733f.l(obj3, yVar2);
                    }
                    qVar.c(obj, i10, obj3, yVar2);
                }
                return b0.f15562a;
        }
    }

    public /* synthetic */ j(eu.d dVar, eu.c cVar) {
        this.f3757a = 2;
        this.f3758d = dVar;
    }
}
