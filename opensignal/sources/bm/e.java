package bm;

import android.content.Context;
import android.graphics.Rect;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.util.Pair;
import android.util.SparseIntArray;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import b5.g;
import b5.m;
import bf.n;
import br.l;
import cc.s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.i4;
import com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase_Impl;
import d5.j0;
import d5.k0;
import d5.l0;
import d5.n0;
import d5.o0;
import d5.t0;
import db.q;
import dd.r;
import dt.w;
import ee.u;
import g4.j;
import h7.n1;
import h7.s1;
import h7.z1;
import hk.h;
import ht.i0;
import ht.x;
import io.sentry.android.core.e0;
import io.sentry.hints.i;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import ls.g0;
import ls.q0;
import ls.t;
import ls.v0;
import ls.y;
import ls.y0;
import ns.f;
import o5.f0;
import o5.v;
import o5.z;
import pb.p0;
import r8.h0;
import rr.a0;
import u.o;
import u.p;

/* loaded from: classes.dex */
public class e implements g, dd.c, f0, i5.g, q, dt.b, s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2829a;

    /* renamed from: d, reason: collision with root package name */
    public Object f2830d;

    /* renamed from: g, reason: collision with root package name */
    public Object f2831g;

    public /* synthetic */ e(Object obj, int i10, Object obj2) {
        this.f2829a = i10;
        this.f2830d = obj;
        this.f2831g = obj2;
    }

    public static long k(e eVar, ArrayList arrayList, long j, mj.b bVar, h hVar, int i10) {
        long j7;
        if ((i10 & 1) != 0) {
            arrayList = null;
        }
        if ((i10 & 8) != 0) {
            hVar = null;
        }
        boolean z10 = (i10 & 16) == 0;
        eVar.getClass();
        l.e(bVar, "appStatusMode");
        ek.c cVar = (ek.c) eVar.f2830d;
        if (arrayList == null) {
            if (hVar != null) {
                ArrayList arrayListJ = cVar.f8192a.j(cVar.f8193b, e5.H("task_name"), e5.H(hVar.f10805b));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayListJ.iterator();
                while (it.hasNext()) {
                    bj.a aVar = (bj.a) cVar.f8194c.a((rj.e) it.next());
                    if (aVar != null) {
                        arrayList2.add(aVar);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = cVar.b();
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new Date(jCurrentTimeMillis));
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.clear();
        gregorianCalendar2.set(1, gregorianCalendar.get(1));
        gregorianCalendar2.set(2, gregorianCalendar.get(2));
        gregorianCalendar2.set(5, gregorianCalendar.get(5));
        long timeInMillis = gregorianCalendar2.getTimeInMillis() - ((j - 1) * 86400000);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            bj.a aVar2 = (bj.a) obj;
            if (!z10 || !aVar2.f2781n) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            bj.a aVar3 = (bj.a) next;
            if (aVar3.f2772c == 0 && aVar3.f2774e >= timeInMillis) {
                arrayList4.add(next);
            }
        }
        Iterator it3 = arrayList4.iterator();
        long j10 = 0;
        while (it3.hasNext()) {
            bj.a aVar4 = (bj.a) it3.next();
            int i11 = ek.b.f8191a[bVar.ordinal()];
            if (i11 == 1) {
                j7 = aVar4.f2778i;
            } else if (i11 == 2) {
                j7 = aVar4.f2777h;
            } else {
                if (i11 != 3) {
                    throw new n();
                }
                j7 = aVar4.f2777h + aVar4.f2778i;
            }
            j10 += j7;
        }
        return j10 / 1000;
    }

    public static i0 m(List list) {
        return list.isEmpty() ? i0.f10911g : new i0(list);
    }

    public Object A(u uVar) {
        return (h0) this.f2831g;
    }

    public Object B(float f10, float f11, Object obj, Object obj2, float f12, float f13, float f14) {
        u uVar = (u) this.f2830d;
        uVar.f8153a = f10;
        uVar.f8154b = f11;
        uVar.f8158f = obj;
        uVar.f8159g = obj2;
        uVar.f8155c = f12;
        uVar.f8156d = f13;
        uVar.f8157e = f14;
        return A(uVar);
    }

    public boolean C(long j) {
        Calendar calendar = (Calendar) this.f2831g;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        if (((hm.d) this.f2830d) == hm.d.ALL_TIME) {
            return true;
        }
        if (calendar.get(1) != calendar2.get(1)) {
            return false;
        }
        boolean z10 = calendar.get(2) == calendar2.get(2);
        if (((hm.d) this.f2830d) == hm.d.PAST_MONTH) {
            return z10;
        }
        boolean z11 = calendar.get(3) == calendar2.get(3);
        if (((hm.d) this.f2830d) == hm.d.PAST_WEEK) {
            return z11;
        }
        int i10 = calendar.get(6);
        int i11 = calendar2.get(6);
        return ((hm.d) this.f2830d) == hm.d.YESTERDAY ? i10 - 1 == i11 : i10 == i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D(android.content.Context r12, android.content.res.XmlResourceParser r13) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bm.e.D(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public androidx.media3.common.i0 E(n1 n1Var, int i10) {
        z1 z1Var;
        androidx.media3.common.i0 i0Var;
        u.i0 i0Var2 = (u.i0) this.f2830d;
        int iD = i0Var2.d(n1Var);
        if (iD >= 0 && (z1Var = (z1) i0Var2.i(iD)) != null) {
            int i11 = z1Var.f10297a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                z1Var.f10297a = i12;
                if (i10 == 4) {
                    i0Var = z1Var.f10298b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    i0Var = z1Var.f10299c;
                }
                if ((i12 & 12) == 0) {
                    i0Var2.g(iD);
                    z1Var.f10297a = 0;
                    z1Var.f10298b = null;
                    z1Var.f10299c = null;
                    z1.f10296d.c(z1Var);
                }
                return i0Var;
            }
        }
        return null;
    }

    public void F(n1 n1Var) {
        z1 z1Var = (z1) ((u.i0) this.f2830d).get(n1Var);
        if (z1Var == null) {
            return;
        }
        z1Var.f10297a &= -2;
    }

    public void G(n1 n1Var) {
        o oVar = (o) this.f2831g;
        int iG = oVar.g() - 1;
        while (true) {
            if (iG < 0) {
                break;
            }
            if (n1Var == oVar.h(iG)) {
                Object[] objArr = oVar.f23093g;
                Object obj = objArr[iG];
                Object obj2 = p.f23095a;
                if (obj != obj2) {
                    objArr[iG] = obj2;
                    oVar.f23091a = true;
                }
            } else {
                iG--;
            }
        }
        z1 z1Var = (z1) ((u.i0) this.f2830d).remove(n1Var);
        if (z1Var != null) {
            z1Var.f10297a = 0;
            z1Var.f10298b = null;
            z1Var.f10299c = null;
            z1.f10296d.c(z1Var);
        }
    }

    public int H(Context context, ac.c cVar) {
        int i10;
        int iB;
        s.h(context);
        s.h(cVar);
        int iA = cVar.a();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f2830d;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(iA, -1);
        }
        if (i10 != -1) {
            return i10;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.f2830d;
        synchronized (sparseIntArray2) {
            iB = 0;
            int i11 = 0;
            while (true) {
                try {
                    if (i11 >= sparseIntArray2.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray2.keyAt(i11);
                    if (iKeyAt > iA && sparseIntArray2.get(iKeyAt) == 0) {
                        break;
                    }
                    i11++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (iB == -1) {
                iB = ((zb.c) this.f2831g).b(context, iA);
            }
            sparseIntArray2.put(iA, iB);
        }
        return iB;
    }

    public void I(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.f2830d;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.f2831g;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((dd.h) entry2.getKey()).b(new ac.d(status));
            }
        }
    }

    @Override // b5.g
    public b5.h a() {
        return new b5.l((Context) this.f2830d, ((m) this.f2831g).a());
    }

    @Override // dt.b
    public Object b(w wVar, g0 g0Var, x xVar) {
        l.e(g0Var, "proto");
        return null;
    }

    @Override // dt.e
    public List c(w wVar, rs.b bVar, dt.a aVar) {
        List list;
        ct.a aVar2 = (ct.a) this.f2830d;
        l.e(bVar, "proto");
        l.e(aVar, "kind");
        if (bVar instanceof ls.l) {
            list = (List) ((ls.l) bVar).k(aVar2.f6668b);
        } else if (bVar instanceof y) {
            list = (List) ((y) bVar).k(aVar2.f6670d);
        } else {
            if (!(bVar instanceof g0)) {
                throw new IllegalStateException(("Unknown message: " + bVar).toString());
            }
            int i10 = dt.c.f7478a[aVar.ordinal()];
            if (i10 == 1) {
                list = (List) ((g0) bVar).k(aVar2.f6671e);
            } else if (i10 == 2) {
                list = (List) ((g0) bVar).k(aVar2.f6672f);
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((g0) bVar).k(aVar2.f6673g);
            }
        }
        if (list == null) {
            list = mq.w.f16945a;
        }
        ArrayList arrayList = new ArrayList(mq.p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((io.sentry.internal.debugmeta.c) this.f2831g).e((ls.g) it.next(), (f) wVar.f7547b));
        }
        return arrayList;
    }

    public void d(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.f2830d).add(h0.b.s(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    public void e(n1 n1Var, androidx.media3.common.i0 i0Var) {
        u.i0 i0Var2 = (u.i0) this.f2830d;
        z1 z1VarA = (z1) i0Var2.get(n1Var);
        if (z1VarA == null) {
            z1VarA = z1.a();
            i0Var2.put(n1Var, z1VarA);
        }
        z1VarA.f10299c = i0Var;
        z1VarA.f10297a |= 8;
    }

    @Override // dt.e
    public ArrayList f(v0 v0Var, f fVar) {
        l.e(v0Var, "proto");
        l.e(fVar, "nameResolver");
        Iterable iterable = (List) v0Var.k(((ct.a) this.f2830d).f6676l);
        if (iterable == null) {
            iterable = mq.w.f16945a;
        }
        ArrayList arrayList = new ArrayList(mq.p.a0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((io.sentry.internal.debugmeta.c) this.f2831g).e((ls.g) it.next(), fVar));
        }
        return arrayList;
    }

    @Override // db.q
    public p0 g() {
        return new om.f(((q) this.f2830d).g(), 26, (List) this.f2831g);
    }

    @Override // dt.e
    public ArrayList h(q0 q0Var, f fVar) {
        l.e(q0Var, "proto");
        l.e(fVar, "nameResolver");
        Iterable iterable = (List) q0Var.k(((ct.a) this.f2830d).k);
        if (iterable == null) {
            iterable = mq.w.f16945a;
        }
        ArrayList arrayList = new ArrayList(mq.p.a0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((io.sentry.internal.debugmeta.c) this.f2831g).e((ls.g) it.next(), fVar));
        }
        return arrayList;
    }

    @Override // h7.s1
    public long i(long j) {
        o oVar = (o) this.f2830d;
        Long lValueOf = (Long) oVar.b(j);
        if (lValueOf == null) {
            ca.n nVar = (ca.n) this.f2831g;
            long j7 = nVar.f3485a;
            nVar.f3485a = 1 + j7;
            lValueOf = Long.valueOf(j7);
            oVar.e(lValueOf, j);
        }
        return lValueOf.longValue();
    }

    @Override // dt.e
    public List j(w wVar, g0 g0Var) {
        l.e(g0Var, "proto");
        ((ct.a) this.f2830d).getClass();
        mq.w wVar2 = mq.w.f16945a;
        ArrayList arrayList = new ArrayList(mq.p.a0(wVar2, 10));
        Iterator<E> it = wVar2.iterator();
        while (it.hasNext()) {
            arrayList.add(((io.sentry.internal.debugmeta.c) this.f2831g).e((ls.g) it.next(), (f) wVar.f7547b));
        }
        return arrayList;
    }

    @Override // dt.b
    public Object l(w wVar, g0 g0Var, x xVar) {
        l.e(g0Var, "proto");
        ls.d dVar = (ls.d) a.a.o(g0Var, ((ct.a) this.f2830d).f6675i);
        if (dVar == null) {
            return null;
        }
        return ((io.sentry.internal.debugmeta.c) this.f2831g).C(xVar, dVar, (f) wVar.f7547b);
    }

    @Override // dt.e
    public ArrayList n(dt.u uVar) {
        l.e(uVar, "container");
        Iterable iterable = (List) uVar.f7540e.k(((ct.a) this.f2830d).f6669c);
        if (iterable == null) {
            iterable = mq.w.f16945a;
        }
        ArrayList arrayList = new ArrayList(mq.p.a0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((io.sentry.internal.debugmeta.c) this.f2831g).e((ls.g) it.next(), (f) uVar.f7547b));
        }
        return arrayList;
    }

    @Override // dt.e
    public List o(w wVar, g0 g0Var) {
        l.e(g0Var, "proto");
        ((ct.a) this.f2830d).getClass();
        mq.w wVar2 = mq.w.f16945a;
        ArrayList arrayList = new ArrayList(mq.p.a0(wVar2, 10));
        Iterator<E> it = wVar2.iterator();
        while (it.hasNext()) {
            arrayList.add(((io.sentry.internal.debugmeta.c) this.f2831g).e((ls.g) it.next(), (f) wVar.f7547b));
        }
        return arrayList;
    }

    @Override // o5.f0
    public void onDownstreamFormatChanged(int i10, z zVar, v vVar) {
        Pair pairY = y(i10, zVar);
        if (pairY != null) {
            ((a5.z) ((o0) this.f2831g).j).d(new j0(this, pairY, vVar, 1));
        }
    }

    @Override // o5.f0
    public void onLoadCanceled(int i10, z zVar, o5.q qVar, v vVar) {
        Pair pairY = y(i10, zVar);
        if (pairY != null) {
            ((a5.z) ((o0) this.f2831g).j).d(new k0(this, pairY, qVar, vVar, 0));
        }
    }

    @Override // o5.f0
    public void onLoadCompleted(int i10, z zVar, o5.q qVar, v vVar) {
        Pair pairY = y(i10, zVar);
        if (pairY != null) {
            ((a5.z) ((o0) this.f2831g).j).d(new k0(this, pairY, qVar, vVar, 2));
        }
    }

    @Override // o5.f0
    public void onLoadError(int i10, z zVar, o5.q qVar, v vVar, IOException iOException, boolean z10) {
        Pair pairY = y(i10, zVar);
        if (pairY != null) {
            ((a5.z) ((o0) this.f2831g).j).d(new l0(this, pairY, qVar, vVar, iOException, z10, 0));
        }
    }

    @Override // o5.f0
    public void onLoadStarted(int i10, z zVar, o5.q qVar, v vVar) {
        Pair pairY = y(i10, zVar);
        if (pairY != null) {
            ((a5.z) ((o0) this.f2831g).j).d(new k0(this, pairY, qVar, vVar, 1));
        }
    }

    @Override // o5.f0
    public void onUpstreamDiscarded(int i10, z zVar, v vVar) {
        Pair pairY = y(i10, zVar);
        if (pairY != null) {
            ((a5.z) ((o0) this.f2831g).j).d(new j0(this, pairY, vVar, 0));
        }
    }

    @Override // dt.e
    public List p(w wVar, t tVar) {
        l.e(wVar, "container");
        Iterable iterable = (List) tVar.k(((ct.a) this.f2830d).f6674h);
        if (iterable == null) {
            iterable = mq.w.f16945a;
        }
        ArrayList arrayList = new ArrayList(mq.p.a0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((io.sentry.internal.debugmeta.c) this.f2831g).e((ls.g) it.next(), (f) wVar.f7547b));
        }
        return arrayList;
    }

    @Override // dt.e
    public List q(w wVar, rs.b bVar, dt.a aVar, int i10, y0 y0Var) {
        l.e(bVar, "callableProto");
        l.e(aVar, "kind");
        Iterable iterable = (List) y0Var.k(((ct.a) this.f2830d).j);
        if (iterable == null) {
            iterable = mq.w.f16945a;
        }
        ArrayList arrayList = new ArrayList(mq.p.a0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((io.sentry.internal.debugmeta.c) this.f2831g).e((ls.g) it.next(), (f) wVar.f7547b));
        }
        return arrayList;
    }

    @Override // db.q
    public p0 r(db.f fVar, db.l lVar) {
        return new om.f(((q) this.f2830d).r(fVar, lVar), 26, (List) this.f2831g);
    }

    @Override // dd.c
    public void s(r rVar) {
        ((Map) ((e) this.f2831g).f2831g).remove((dd.h) this.f2830d);
    }

    @Override // dt.e
    public List t(w wVar, rs.b bVar, dt.a aVar) {
        ct.a aVar2 = (ct.a) this.f2830d;
        l.e(bVar, "proto");
        l.e(aVar, "kind");
        if (bVar instanceof y) {
            aVar2.getClass();
        } else {
            if (!(bVar instanceof g0)) {
                throw new IllegalStateException(("Unknown message: " + bVar).toString());
            }
            int i10 = dt.c.f7478a[aVar.ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + aVar).toString());
            }
            aVar2.getClass();
        }
        mq.w wVar2 = mq.w.f16945a;
        ArrayList arrayList = new ArrayList(mq.p.a0(wVar2, 10));
        Iterator<E> it = wVar2.iterator();
        while (it.hasNext()) {
            arrayList.add(((io.sentry.internal.debugmeta.c) this.f2831g).e((ls.g) it.next(), (f) wVar.f7547b));
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f2829a) {
            case 9:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f2831g.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f2830d;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u() throws IOException {
        String str = (String) this.f2830d;
        try {
            of.b bVar = (of.b) this.f2831g;
            bVar.getClass();
            new File((File) bVar.f19423g, str).createNewFile();
        } catch (IOException e4) {
            e0.c("FirebaseCrashlytics", "Error creating marker: ".concat(str), e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d5.u0[] v(android.os.Handler r12, d5.w r13, d5.w r14, d5.w r15, d5.w r16) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bm.e.v(android.os.Handler, d5.w, d5.w, d5.w, d5.w):d5.u0[]");
    }

    public byte[] w(EventMessage eventMessage) throws IOException {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f2831g;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f2830d;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(eventMessage.f1948a);
            dataOutputStream.writeByte(0);
            String str = eventMessage.f1949d;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(eventMessage.f1950g);
            dataOutputStream.writeLong(eventMessage.f1951r);
            dataOutputStream.write(eventMessage.f1952x);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    public DhcpInfo x() {
        WifiManager wifiManager;
        if (!((ag.b) this.f2831g).i("android.permission.ACCESS_WIFI_STATE") || (wifiManager = (WifiManager) this.f2830d) == null) {
            return null;
        }
        return wifiManager.getDhcpInfo();
    }

    public Pair y(int i10, z zVar) {
        z zVarB;
        n0 n0Var = (n0) this.f2830d;
        z zVar2 = null;
        if (zVar != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= n0Var.f7038c.size()) {
                    zVarB = null;
                    break;
                }
                if (((z) n0Var.f7038c.get(i11)).f1692d == zVar.f1692d) {
                    Object obj = zVar.f1689a;
                    Object obj2 = n0Var.f7037b;
                    int i12 = t0.G;
                    zVarB = zVar.b(Pair.create(obj2, obj));
                    break;
                }
                i11++;
            }
            if (zVarB == null) {
                return null;
            }
            zVar2 = zVarB;
        }
        return Pair.create(Integer.valueOf(i10 + n0Var.f7039d), zVar2);
    }

    public int z(ir.d dVar) {
        int iIntValue;
        l.e(dVar, "kClass");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f2830d;
        String strN = dVar.n();
        l.b(strN);
        l.e(concurrentHashMap, "<this>");
        Integer num = (Integer) concurrentHashMap.get(strN);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(strN);
                if (num2 == null) {
                    int andIncrement = ((AtomicInteger) this.f2831g).getAndIncrement();
                    Integer numValueOf = Integer.valueOf(andIncrement);
                    concurrentHashMap.putIfAbsent(strN, Integer.valueOf(andIncrement));
                    num2 = numValueOf;
                }
                iIntValue = num2.intValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public e(int i10) {
        this.f2829a = i10;
        switch (i10) {
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f2830d = byteArrayOutputStream;
                this.f2831g = new DataOutputStream(byteArrayOutputStream);
                break;
            case 10:
                zb.c cVar = zb.c.f26814e;
                this.f2830d = new SparseIntArray();
                this.f2831g = cVar;
                break;
            case 19:
                this.f2830d = new u();
                this.f2831g = null;
                break;
            case 21:
                this.f2830d = new Rect();
                this.f2831g = new Rect();
                break;
            case 24:
                this.f2830d = new u.i0(0);
                this.f2831g = new o((Object) null);
                break;
            case 26:
                hm.d.Companion.getClass();
                this.f2830d = hm.d.defaultTimeFilter;
                this.f2831g = Calendar.getInstance();
                break;
            case 27:
                this.f2830d = new ConcurrentHashMap();
                this.f2831g = new AtomicInteger(0);
                break;
            default:
                this.f2830d = Collections.synchronizedMap(new WeakHashMap());
                this.f2831g = Collections.synchronizedMap(new WeakHashMap());
                break;
        }
    }

    public e(int i10, Object obj) {
        this.f2829a = i10;
        switch (i10) {
            case 22:
                this.f2830d = obj;
                this.f2831g = Thread.currentThread();
                break;
            default:
                s.h(obj);
                this.f2831g = obj;
                this.f2830d = new ArrayList();
                break;
        }
    }

    public e(e eVar, dd.h hVar) {
        this.f2829a = 6;
        this.f2830d = hVar;
        Objects.requireNonNull(eVar);
        this.f2831g = eVar;
    }

    public e(String str, i4 i4Var, ee.f fVar) {
        this.f2829a = 1;
        this.f2831g = str;
        this.f2830d = i4Var;
    }

    public e(Executor executor, dd.o oVar) {
        this.f2829a = 20;
        l.e(oVar, "directExecutor");
        this.f2830d = executor;
        this.f2831g = oVar;
    }

    public e(ek.c cVar, df.c cVar2, q3.a aVar, z.b bVar) {
        this.f2829a = 18;
        this.f2830d = cVar;
        this.f2831g = aVar;
    }

    public e(ConstraintLayout constraintLayout, Button button, TextView textView) {
        this.f2829a = 3;
        this.f2830d = constraintLayout;
        this.f2831g = button;
    }

    public e(a0 a0Var, js.e eVar, ct.a aVar) {
        this.f2829a = 17;
        l.e(a0Var, "module");
        l.e(aVar, "protocol");
        this.f2830d = aVar;
        this.f2831g = new io.sentry.internal.debugmeta.c(a0Var, eVar);
    }

    public e(OpensignalDatabase_Impl opensignalDatabase_Impl) {
        this.f2829a = 0;
        this.f2830d = opensignalDatabase_Impl;
        this.f2831g = new b(opensignalDatabase_Impl, 1);
    }

    public e(h0 h0Var) {
        this.f2829a = 19;
        this.f2830d = new u();
        this.f2831g = h0Var;
    }

    public e(Context context, int i10) {
        this.f2829a = i10;
        switch (i10) {
            case 13:
                this.f2830d = context;
                this.f2831g = new i(14);
                break;
            default:
                m mVar = new m();
                this.f2830d = context.getApplicationContext();
                this.f2831g = mVar;
                break;
        }
    }

    public e(ca.n nVar) {
        this.f2829a = 23;
        this.f2831g = nVar;
        this.f2830d = new o((Object) null);
    }

    public e(i4.c cVar) {
        this.f2829a = 29;
        this.f2831g = cVar;
    }

    public e(o0 o0Var, n0 n0Var) {
        this.f2829a = 14;
        this.f2831g = o0Var;
        this.f2830d = n0Var;
    }
}
