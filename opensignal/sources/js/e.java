package js;

import a5.d0;
import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.gms.internal.measurement.q8;
import h9.r2;
import ht.x;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import mq.w;
import o4.l0;
import o5.e0;
import o5.f0;
import o5.h1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rr.c0;
import rr.o0;
import u.i0;
import ur.q0;
import vs.z;
import w.g0;
import ya.a0;
import ya.b0;
import zc.c1;
import zc.j0;
import zc.r0;

/* loaded from: classes.dex */
public final class e implements o, p, f0, i5.g, o9.b, vg.b, bk.k, g0, b0, ba.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13796a;

    /* renamed from: d, reason: collision with root package name */
    public Object f13797d;

    /* renamed from: g, reason: collision with root package name */
    public Object f13798g;

    /* renamed from: r, reason: collision with root package name */
    public Object f13799r;

    /* renamed from: x, reason: collision with root package name */
    public Object f13800x;

    public /* synthetic */ e(int i10, boolean z10) {
        this.f13796a = i10;
    }

    @Override // bk.k
    public String A() {
        if (((ag.b) this.f13799r).i("android.permission.READ_PHONE_STATE")) {
            SubscriptionManager subscriptionManager = (SubscriptionManager) this.f13800x;
            List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager != null ? subscriptionManager.getActiveSubscriptionInfoList() : null;
            if (activeSubscriptionInfoList == null) {
                ch.n.b("PostApi22TelephonySubscriptions", "SubscriptionInfo List is null");
                return "";
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = activeSubscriptionInfoList.iterator();
            while (it.hasNext()) {
                String strU = u((SubscriptionInfo) it.next());
                if (strU != null) {
                    arrayList.add(strU);
                }
            }
            if (!arrayList.isEmpty()) {
                String string = new JSONArray((Collection) arrayList).toString();
                br.l.d(string, "toString(...)");
                return string;
            }
        }
        return "";
    }

    @Override // bk.k
    public List B() {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        ArrayList arrayList = new ArrayList();
        if (!((ag.b) this.f13799r).i("android.permission.READ_PHONE_STATE")) {
            arrayList.add(Integer.valueOf(x()));
            return arrayList;
        }
        SubscriptionManager subscriptionManager = (SubscriptionManager) this.f13800x;
        if (subscriptionManager == null || (activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList()) == null) {
            return w.f16945a;
        }
        Iterator<T> it = activeSubscriptionInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((SubscriptionInfo) it.next()).getSubscriptionId()));
        }
        return arrayList;
    }

    @Override // bk.k
    public Integer C(int i10) {
        SubscriptionInfo subscriptionInfoC0 = c0(i10);
        ch.f fVar = (ch.f) this.f13798g;
        if (subscriptionInfoC0 != null && fVar.e()) {
            return Integer.valueOf(subscriptionInfoC0.getCardId());
        }
        return null;
    }

    public androidx.fragment.app.b D(String str) {
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) ((HashMap) this.f13798g).get(str);
        if (eVar != null) {
            return eVar.f1462c;
        }
        return null;
    }

    @Override // w.g0
    public w.l E(long j, w.l lVar, w.l lVar2, w.l lVar3) {
        if (((w.l) this.f13800x) == null) {
            this.f13800x = lVar3.c();
        }
        w.l lVar4 = (w.l) this.f13800x;
        if (lVar4 == null) {
            br.l.l("velocityVector");
            throw null;
        }
        int iB = lVar4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            w.l lVar5 = (w.l) this.f13800x;
            if (lVar5 == null) {
                br.l.l("velocityVector");
                throw null;
            }
            lVar5.e(i10, ((w.m) this.f13798g).get(i10).b(j, lVar.a(i10), lVar2.a(i10), lVar3.a(i10)));
        }
        w.l lVar6 = (w.l) this.f13800x;
        if (lVar6 != null) {
            return lVar6;
        }
        br.l.l("velocityVector");
        throw null;
    }

    @Override // bk.k
    public Integer F() {
        return (Integer) this.f13797d;
    }

    @Override // bk.k
    public Boolean G(int i10) {
        return Boolean.valueOf(i() == i10);
    }

    @Override // bk.k
    public int I() {
        if (((ch.f) this.f13798g).b()) {
            return SubscriptionManager.getDefaultSmsSubscriptionId();
        }
        return -1;
    }

    @Override // bk.k
    public String J(int i10) {
        CharSequence carrierName;
        SubscriptionInfo subscriptionInfoC0 = c0(i10);
        if (subscriptionInfoC0 == null || (carrierName = subscriptionInfoC0.getCarrierName()) == null) {
            return null;
        }
        return carrierName.toString();
    }

    @Override // js.o
    public o K(qs.b bVar, qs.g gVar) {
        return ((of.b) this.f13798g).K(bVar, gVar);
    }

    @Override // w.g0
    public long L(w.l lVar, w.l lVar2, w.l lVar3) {
        int iB = lVar.b();
        long jMax = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            jMax = Math.max(jMax, ((w.m) this.f13798g).get(i10).c(lVar.a(i10), lVar2.a(i10), lVar3.a(i10)));
        }
        return jMax;
    }

    @Override // js.o
    public void M(qs.g gVar, vs.f fVar) {
        ((of.b) this.f13798g).M(gVar, fVar);
    }

    @Override // bk.k
    public String N(int i10) {
        CharSequence displayName;
        SubscriptionInfo subscriptionInfoC0 = c0(i10);
        if (subscriptionInfoC0 == null || (displayName = subscriptionInfoC0.getDisplayName()) == null) {
            return null;
        }
        return displayName.toString();
    }

    @Override // bk.k
    public Integer O() {
        if (((ch.f) this.f13798g).f()) {
            return Integer.valueOf(SubscriptionManager.getActiveDataSubscriptionId());
        }
        return null;
    }

    @Override // js.o
    public p P(qs.g gVar) {
        return ((of.b) this.f13798g).P(gVar);
    }

    @Override // bk.k
    public int Q() {
        if (((ch.f) this.f13798g).b()) {
            return SubscriptionManager.getDefaultDataSubscriptionId();
        }
        return -1;
    }

    @Override // bk.k
    public Boolean R(int i10) {
        SubscriptionInfo subscriptionInfoC0 = c0(i10);
        if (subscriptionInfoC0 != null && ((ch.f) this.f13798g).d()) {
            return Boolean.valueOf(subscriptionInfoC0.isEmbedded());
        }
        return null;
    }

    public androidx.fragment.app.b S(String str) {
        for (androidx.fragment.app.e eVar : ((HashMap) this.f13798g).values()) {
            if (eVar != null) {
                androidx.fragment.app.b bVarS = eVar.f1462c;
                if (!str.equals(bVarS.f1433y)) {
                    bVarS = bVarS.S.f1438c.S(str);
                }
                if (bVarS != null) {
                    return bVarS;
                }
            }
        }
        return null;
    }

    public void T(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        n0();
    }

    public void U(su.f fVar) {
        fVar.f22331d.decrementAndGet();
        T((ArrayDeque) this.f13800x, fVar);
    }

    public n.e V(n.a aVar) {
        ArrayList arrayList = (ArrayList) this.f13797d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n.e eVar = (n.e) arrayList.get(i10);
            if (eVar != null && eVar.f17083b == aVar) {
                return eVar;
            }
        }
        n.e eVar2 = new n.e((Context) this.f13799r, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList W() {
        ArrayList arrayList = new ArrayList();
        for (androidx.fragment.app.e eVar : ((HashMap) this.f13798g).values()) {
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    public ArrayList X() {
        ArrayList arrayList = new ArrayList();
        for (androidx.fragment.app.e eVar : ((HashMap) this.f13798g).values()) {
            if (eVar != null) {
                arrayList.add(eVar.f1462c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public rr.f Y(qs.b bVar, List list) {
        br.l.e(bVar, "classId");
        return (rr.f) ((gt.e) this.f13797d).a(new c0(bVar, list));
    }

    public Long Z(String str) {
        Object next;
        Long lValueOf;
        synchronized (this.f13800x) {
            try {
                Iterator it = ((ArrayList) this.f13797d).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (br.l.a(((xi.h) next).f25334c, str)) {
                        break;
                    }
                }
                xi.h hVar = (xi.h) next;
                lValueOf = hVar != null ? Long.valueOf(hVar.f25332a) : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lValueOf;
    }

    @Override // js.p
    public void a(qs.b bVar, qs.g gVar) {
        ((ArrayList) this.f13797d).add(new vs.i(bVar, gVar));
    }

    public List a0() {
        ArrayList arrayList;
        if (((ArrayList) this.f13797d).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f13797d)) {
            arrayList = new ArrayList((ArrayList) this.f13797d);
        }
        return arrayList;
    }

    @Override // js.o
    public void b() {
        switch (this.f13796a) {
            case 0:
                ((of.b) this.f13799r).b();
                ((ArrayList) ((e) this.f13800x).f13797d).add(new vs.a((sr.b) mq.o.I0((ArrayList) this.f13797d)));
                break;
            default:
                of.b bVar = (of.b) this.f13798g;
                qs.g gVar = (qs.g) this.f13800x;
                ArrayList arrayList = (ArrayList) this.f13797d;
                bVar.getClass();
                br.l.e(arrayList, "elements");
                if (gVar != null) {
                    q0 q0VarW = kc.f.w(gVar, (rr.f) bVar.f19424r);
                    if (q0VarW == null) {
                        if (((r2) bVar.f19423g).A0((qs.b) bVar.f19425x) && br.l.a(gVar.b(), "value")) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (next instanceof vs.a) {
                                    arrayList2.add(next);
                                }
                            }
                            List list = (List) bVar.f19426y;
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                list.add((sr.b) ((vs.a) it2.next()).f23957a);
                            }
                            break;
                        }
                    } else {
                        HashMap map = (HashMap) bVar.f19422d;
                        List listD = rt.k.d(arrayList);
                        x type = q0VarW.getType();
                        br.l.d(type, "parameter.type");
                        map.put(gVar, new z(listD, type));
                        break;
                    }
                }
                break;
        }
    }

    public String b0() {
        try {
            String str = ((ak.g) ((q3.a) this.f13798g).f20680g).f529f.f449a.f474c;
            o2.g gVar = (o2.g) this.f13799r;
            gVar.getClass();
            ch.n.b("DeviceIpResolver", h0.b.o("getPublicIp() called with: ipLookupUrl = [", str, "]"));
            String strB = ((wh.a) gVar.f18754d).b(str);
            ch.n.a();
            if (strB != null && !strB.isEmpty()) {
                if (Pattern.matches("((^\\s*((([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]))\\s*$)|(^\\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))(%.+)?\\s*$))", strB)) {
                    return strB;
                }
            }
            return null;
        } catch (Exception e4) {
            ch.n.e("DeviceIpRepository", e4);
            return null;
        }
    }

    @Override // js.p
    public void c(Object obj) {
        ((ArrayList) this.f13797d).add(r2.u((r2) this.f13799r, (qs.g) this.f13800x, obj));
    }

    public SubscriptionInfo c0(int i10) {
        if (!((ag.b) this.f13799r).i("android.permission.READ_PHONE_STATE")) {
            return null;
        }
        if (((ch.f) this.f13798g).e() && i10 == Q() && Q() == Integer.MAX_VALUE) {
            return null;
        }
        try {
            SubscriptionManager subscriptionManager = (SubscriptionManager) this.f13800x;
            if (subscriptionManager != null) {
                return subscriptionManager.getActiveSubscriptionInfo(i10);
            }
            return null;
        } catch (NoClassDefFoundError e4) {
            ch.n.e("PostApi22TelephonySubscriptions", e4);
            return null;
        }
    }

    @Override // js.p
    public o d(qs.b bVar) {
        ArrayList arrayList = new ArrayList();
        return new e(((r2) this.f13799r).D0(bVar, o0.f21696s, arrayList), this, arrayList);
    }

    public s0 d0(ir.d dVar, String str) {
        s0 s0Var;
        s0 s0VarJ;
        br.l.e(dVar, "modelClass");
        br.l.e(str, "key");
        synchronized (((ee.f) this.f13797d)) {
            try {
                v0 v0Var = (v0) this.f13798g;
                v0Var.getClass();
                s0Var = (s0) v0Var.f1523a.get(str);
                if (dVar.x(s0Var)) {
                    Object obj = (t0) this.f13799r;
                    if (obj instanceof u0) {
                        br.l.b(s0Var);
                        ((u0) obj).a(s0Var);
                    }
                    br.l.c(s0Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    v4.c cVar = new v4.c((v4.b) this.f13800x);
                    cVar.f23843a.put(androidx.lifecycle.o0.f1509x, str);
                    t0 t0Var = (t0) this.f13799r;
                    try {
                        try {
                            s0VarJ = t0Var.o(dVar, cVar);
                        } catch (AbstractMethodError unused) {
                            s0VarJ = t0Var.j(ir.f0.D(dVar));
                        }
                    } catch (AbstractMethodError unused2) {
                        s0VarJ = t0Var.y(ir.f0.D(dVar), cVar);
                    }
                    s0Var = s0VarJ;
                    v0 v0Var2 = (v0) this.f13798g;
                    v0Var2.getClass();
                    br.l.e(s0Var, "viewModel");
                    s0 s0Var2 = (s0) v0Var2.f1523a.put(str, s0Var);
                    if (s0Var2 != null) {
                        s0Var2.a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s0Var;
    }

    @Override // bk.k
    public String e(int i10) {
        return u(c0(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x037b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mj.h e0(java.lang.String r29) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: js.e.e0(java.lang.String):mj.h");
    }

    @Override // bk.k
    public Boolean f(int i10) {
        Integer numO = O();
        return Boolean.valueOf(numO != null && numO.intValue() == i10);
    }

    public void f0(androidx.fragment.app.e eVar) {
        androidx.fragment.app.b bVar = eVar.f1462c;
        String str = bVar.f1433y;
        HashMap map = (HashMap) this.f13798g;
        if (map.get(str) != null) {
            return;
        }
        map.put(bVar.f1433y, eVar);
        if (androidx.fragment.app.d.K(2)) {
            bVar.toString();
        }
    }

    @Override // bk.k
    public Integer g(int i10) {
        SubscriptionInfo subscriptionInfoC0 = c0(i10);
        if (subscriptionInfoC0 != null) {
            return Integer.valueOf(subscriptionInfoC0.getDataRoaming());
        }
        return null;
    }

    public void g0(androidx.fragment.app.e eVar) {
        HashMap map = (HashMap) this.f13798g;
        androidx.fragment.app.b bVar = eVar.f1462c;
        if (bVar.Z) {
            ((l0) this.f13800x).d(bVar);
        }
        if (map.get(bVar.f1433y) == eVar && ((androidx.fragment.app.e) map.put(bVar.f1433y, null)) != null && androidx.fragment.app.d.K(2)) {
            bVar.toString();
        }
    }

    @Override // kq.a
    public Object get() {
        switch (this.f13796a) {
            case 14:
                return new e((Executor) ((kq.a) this.f13798g).get(), (t9.d) ((kq.a) this.f13799r).get(), (qm.c) ((qm.c) this.f13800x).get(), (u9.c) ((kq.a) this.f13797d).get(), 13);
            default:
                return new tg.n((se.f) ((i5.c) this.f13798g).f11238a, (wg.k) ((kq.a) this.f13799r).get(), (pq.h) ((kq.a) this.f13800x).get(), (tg.t0) ((vg.c) this.f13797d).get());
        }
    }

    @Override // js.p
    public void h(vs.f fVar) {
        ((ArrayList) this.f13797d).add(new vs.u(new vs.s(fVar)));
    }

    public boolean h0(int i10, o5.z zVar) {
        o5.z zVarA;
        Object obj = this.f13798g;
        o5.j jVar = (o5.j) this.f13797d;
        if (zVar != null) {
            zVarA = jVar.a(obj, zVar);
            if (zVarA == null) {
                return false;
            }
        } else {
            zVarA = null;
        }
        int iC = jVar.c(i10, obj);
        e0 e0Var = (e0) this.f13799r;
        if (e0Var.f18922a != iC || !d0.a(e0Var.f18923b, zVarA)) {
            this.f13799r = jVar.createEventDispatcher(iC, zVarA, 0L);
        }
        i5.f fVar = (i5.f) this.f13800x;
        if (fVar.f11241a == iC && d0.a(fVar.f11242b, zVarA)) {
            return true;
        }
        this.f13800x = jVar.createDrmEventDispatcher(iC, zVarA);
        return true;
    }

    @Override // bk.k
    public int i() {
        if (((ch.f) this.f13798g).b()) {
            return SubscriptionManager.getDefaultSubscriptionId();
        }
        return -1;
    }

    public boolean i0(int i10, ya.v vVar) {
        ya.v vVarA;
        ya.g gVar = (ya.g) this.f13797d;
        if (vVar != null) {
            vVarA = gVar.a(this.f13798g, vVar);
            if (vVarA == null) {
                return false;
            }
        } else {
            vVarA = null;
        }
        a0 a0Var = (a0) this.f13799r;
        if (a0Var.f26035a != i10 || !qb.v.a(a0Var.f26036b, vVarA)) {
            this.f13799r = gVar.createEventDispatcher(i10, vVarA, 0L);
        }
        ba.d dVar = (ba.d) this.f13800x;
        if (dVar.f2486a == i10 && qb.v.a(dVar.f2487b, vVarA)) {
            return true;
        }
        this.f13800x = gVar.createDrmEventDispatcher(i10, vVarA);
        return true;
    }

    public void j(androidx.fragment.app.b bVar) {
        if (((ArrayList) this.f13797d).contains(bVar)) {
            throw new IllegalStateException("Fragment already added: " + bVar);
        }
        synchronized (((ArrayList) this.f13797d)) {
            ((ArrayList) this.f13797d).add(bVar);
        }
        bVar.H = true;
    }

    public o5.v j0(o5.v vVar) {
        o5.j jVar = (o5.j) this.f13797d;
        Object obj = this.f13798g;
        long j = vVar.f19076f;
        long jB = jVar.b(obj, j);
        long j7 = vVar.f19077g;
        long jB2 = jVar.b(obj, j7);
        return (jB == j && jB2 == j7) ? vVar : new o5.v(vVar.f19071a, vVar.f19072b, vVar.f19073c, vVar.f19074d, vVar.f19075e, jB, jB2);
    }

    @Override // bk.k
    public String k(int i10) {
        SubscriptionInfo subscriptionInfoC0 = c0(i10);
        if (subscriptionInfoC0 == null) {
            return null;
        }
        String strU = u(subscriptionInfoC0);
        if (br.l.a(strU, "null")) {
            return null;
        }
        return strU;
    }

    public ya.r k0(ya.r rVar) {
        long j = rVar.f26151f;
        long j7 = rVar.f26152g;
        return (j == j && j7 == j7) ? rVar : new ya.r(rVar.f26146a, rVar.f26147b, rVar.f26148c, rVar.f26149d, rVar.f26150e, j, j7);
    }

    @Override // js.o
    public void l(qs.g gVar, Object obj) {
        ((of.b) this.f13798g).l(gVar, obj);
    }

    public boolean l0(n.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f13798g).onActionItemClicked(V(aVar), new o.t((Context) this.f13799r, (m3.a) menuItem));
    }

    @Override // bk.k
    public int m() {
        if (((ch.f) this.f13798g).b()) {
            return SubscriptionManager.getDefaultVoiceSubscriptionId();
        }
        return -1;
    }

    public boolean m0(n.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f13798g;
        n.e eVarV = V(aVar);
        i0 i0Var = (i0) this.f13800x;
        Menu b0Var = (Menu) i0Var.get(menu);
        if (b0Var == null) {
            b0Var = new o.b0((Context) this.f13799r, (o.m) menu);
            i0Var.put(menu, b0Var);
        }
        return callback.onCreateActionMode(eVarV, b0Var);
    }

    @Override // w.g0
    public w.l n(w.l lVar, w.l lVar2, w.l lVar3) {
        if (((w.l) this.f13797d) == null) {
            this.f13797d = lVar3.c();
        }
        w.l lVar4 = (w.l) this.f13797d;
        if (lVar4 == null) {
            br.l.l("endVelocityVector");
            throw null;
        }
        int iB = lVar4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            w.l lVar5 = (w.l) this.f13797d;
            if (lVar5 == null) {
                br.l.l("endVelocityVector");
                throw null;
            }
            lVar5.e(i10, ((w.m) this.f13798g).get(i10).d(lVar.a(i10), lVar2.a(i10), lVar3.a(i10)));
        }
        w.l lVar6 = (w.l) this.f13797d;
        if (lVar6 != null) {
            return lVar6;
        }
        br.l.l("endVelocityVector");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n0() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: js.e.n0():void");
    }

    @Override // bk.k
    public Integer o(int i10) {
        SubscriptionInfo subscriptionInfoC0 = c0(i10);
        if (subscriptionInfoC0 != null) {
            return Integer.valueOf(subscriptionInfoC0.getSimSlotIndex());
        }
        return null;
    }

    public void o0(ArrayList arrayList, List list) {
        ((to.e) ((to.d) this.f13799r)).getClass();
        br.l.e(list, "savedTraits");
        ArrayList arrayList2 = new ArrayList(mq.p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hq.c cVarA = ((hq.c) it.next()).a();
            cVarA.d(null);
            arrayList2.add(cVarA);
        }
        ((on.k) this.f13798g).e(arrayList2);
    }

    @Override // ya.b0
    public void onDownstreamFormatChanged(int i10, ya.v vVar, ya.r rVar) {
        if (i0(i10, vVar)) {
            ((a0) this.f13799r).c(k0(rVar));
        }
    }

    @Override // ya.b0
    public void onLoadCanceled(int i10, ya.v vVar, ya.m mVar, ya.r rVar) {
        if (i0(i10, vVar)) {
            ((a0) this.f13799r).e(mVar, k0(rVar));
        }
    }

    @Override // ya.b0
    public void onLoadCompleted(int i10, ya.v vVar, ya.m mVar, ya.r rVar) {
        if (i0(i10, vVar)) {
            ((a0) this.f13799r).g(mVar, k0(rVar));
        }
    }

    @Override // ya.b0
    public void onLoadError(int i10, ya.v vVar, ya.m mVar, ya.r rVar, IOException iOException, boolean z10) {
        if (i0(i10, vVar)) {
            ((a0) this.f13799r).j(mVar, k0(rVar), iOException, z10);
        }
    }

    @Override // ya.b0
    public void onLoadStarted(int i10, ya.v vVar, ya.m mVar, ya.r rVar) {
        if (i0(i10, vVar)) {
            ((a0) this.f13799r).l(mVar, k0(rVar));
        }
    }

    @Override // ya.b0
    public void onUpstreamDiscarded(int i10, ya.v vVar, ya.r rVar) {
        if (i0(i10, vVar)) {
            ((a0) this.f13799r).m(k0(rVar));
        }
    }

    @Override // bk.k
    public Boolean p(int i10) {
        return Boolean.valueOf(I() == i10);
    }

    public Bundle p0(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f13799r;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    @Override // js.o
    public void q(qs.g gVar, qs.b bVar, qs.g gVar2) {
        ((of.b) this.f13798g).q(gVar, bVar, gVar2);
    }

    public void q0() {
        int iB;
        y9.u uVar = (y9.u) this.f13799r;
        z7.j jVar = (z7.j) this.f13798g;
        ViewPager2 viewPager2 = (ViewPager2) this.f13797d;
        int i10 = R.id.accessibilityActionPageLeft;
        u3.i0.k(viewPager2, R.id.accessibilityActionPageLeft);
        u3.i0.h(viewPager2, 0);
        u3.i0.k(viewPager2, R.id.accessibilityActionPageRight);
        u3.i0.h(viewPager2, 0);
        u3.i0.k(viewPager2, R.id.accessibilityActionPageUp);
        u3.i0.h(viewPager2, 0);
        u3.i0.k(viewPager2, R.id.accessibilityActionPageDown);
        u3.i0.h(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (iB = viewPager2.getAdapter().b()) == 0 || !viewPager2.M) {
            return;
        }
        if (viewPager2.getOrientation() != 0) {
            if (viewPager2.f2152g < iB - 1) {
                u3.i0.l(viewPager2, new v3.b(R.id.accessibilityActionPageDown, (String) null), jVar);
            }
            if (viewPager2.f2152g > 0) {
                u3.i0.l(viewPager2, new v3.b(R.id.accessibilityActionPageUp, (String) null), uVar);
                return;
            }
            return;
        }
        boolean z10 = viewPager2.f2155y.C() == 1;
        int i11 = z10 ? 16908360 : 16908361;
        if (z10) {
            i10 = 16908361;
        }
        if (viewPager2.f2152g < iB - 1) {
            u3.i0.l(viewPager2, new v3.b(i11, (String) null), jVar);
        }
        if (viewPager2.f2152g > 0) {
            u3.i0.l(viewPager2, new v3.b(i10, (String) null), uVar);
        }
    }

    public void r() {
        Long lZ;
        Long lZ2;
        if (((Long) this.f13799r) != null || (lZ = Z("OBTAINING_IPADDR")) == null || (lZ2 = Z("AUTHENTICATING")) == null) {
            return;
        }
        this.f13799r = Long.valueOf(lZ.longValue() - lZ2.longValue());
        ch.n.b("DetailedWifiStateRepository", "AUTH duration: " + ((Long) this.f13799r));
    }

    public void r0(long j, String str, String str2) {
        br.l.e(str, "detailedState");
        br.l.e(str2, "state");
        synchronized (this.f13800x) {
            try {
                ch.n.b("DetailedWifiStateRepository", "updateState() called with: detailedState = " + str + ", state = " + str2 + ", time = " + j);
                ((ArrayList) this.f13797d).add(new xi.h(j, str2, str));
                if (str.equals("CONNECTED") && str2.equals("CONNECTED")) {
                    s();
                }
                if (str.equals("OBTAINING_IPADDR")) {
                    r();
                }
                if (str.equals("DISCONNECTED") && str2.equals("DISCONNECTED")) {
                    ((ArrayList) this.f13797d).clear();
                    this.f13799r = null;
                    this.f13798g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s() {
        Long lZ;
        Object next;
        Long lValueOf;
        if (((Long) this.f13798g) != null || (lZ = Z("OBTAINING_IPADDR")) == null) {
            return;
        }
        synchronized (this.f13800x) {
            try {
                Iterator it = ((ArrayList) this.f13797d).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (br.l.a(((xi.h) next).f25333b, "CONNECTED")) {
                            break;
                        }
                    }
                }
                xi.h hVar = (xi.h) next;
                lValueOf = hVar != null ? Long.valueOf(hVar.f25332a) : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (lValueOf == null) {
            lValueOf = Z("CONNECTED");
        }
        if (lValueOf != null) {
            this.f13798g = Long.valueOf(lValueOf.longValue() - lZ.longValue());
            ch.n.b("DetailedWifiStateRepository", "CONNECTED IP ADDR duration: " + ((Long) this.f13798g));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle s0() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: js.e.s0():android.os.Bundle");
    }

    @Override // bk.k
    public Boolean t(int i10) {
        return Boolean.valueOf(m() == i10);
    }

    public void t0(Bundle bundle) throws JSONException {
        String str = (String) this.f13798g;
        r0 r0Var = (r0) this.f13797d;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesW1 = r0Var.w1();
        c1 c1Var = (c1) r0Var.f1504d;
        SharedPreferences.Editor editorEdit = sharedPreferencesW1.edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        q8.a();
                        if (c1Var.f26887r.C1(null, zc.u.Q0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                j0 j0Var = c1Var.f26889y;
                                c1.g(j0Var);
                                j0Var.B.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                j0 j0Var2 = c1Var.f26889y;
                                c1.g(j0Var2);
                                j0Var2.B.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e4) {
                        j0 j0Var3 = c1Var.f26889y;
                        c1.g(j0Var3);
                        j0Var3.B.c(e4, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f13800x = bundle2;
    }

    public String u(SubscriptionInfo subscriptionInfo) {
        if (subscriptionInfo == null) {
            return null;
        }
        if (((ch.f) this.f13798g).e()) {
            return subscriptionInfo.getMccString() + subscriptionInfo.getMncString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(subscriptionInfo.getMcc());
        sb2.append(subscriptionInfo.getMnc());
        return sb2.toString();
    }

    @Override // w.g0
    public w.l v(long j, w.l lVar, w.l lVar2, w.l lVar3) {
        if (((w.l) this.f13799r) == null) {
            this.f13799r = lVar.c();
        }
        w.l lVar4 = (w.l) this.f13799r;
        if (lVar4 == null) {
            br.l.l("valueVector");
            throw null;
        }
        int iB = lVar4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            w.l lVar5 = (w.l) this.f13799r;
            if (lVar5 == null) {
                br.l.l("valueVector");
                throw null;
            }
            lVar5.e(i10, ((w.m) this.f13798g).get(i10).e(j, lVar.a(i10), lVar2.a(i10), lVar3.a(i10)));
        }
        w.l lVar6 = (w.l) this.f13799r;
        if (lVar6 != null) {
            return lVar6;
        }
        br.l.l("valueVector");
        throw null;
    }

    @Override // bk.k
    public Boolean w(int i10) {
        return Boolean.valueOf(x() == i10);
    }

    @Override // bk.k
    public int x() {
        Integer numO = O();
        return (numO == null || numO.intValue() == -1) ? Q() : numO.intValue();
    }

    @Override // bk.k
    public Integer y() {
        SubscriptionManager subscriptionManager;
        if (!((ag.b) this.f13799r).i("android.permission.READ_PHONE_STATE") || (subscriptionManager = (SubscriptionManager) this.f13800x) == null) {
            return null;
        }
        return Integer.valueOf(subscriptionManager.getActiveSubscriptionInfoCount());
    }

    @Override // bk.k
    public Integer z(int i10) {
        SubscriptionInfo subscriptionInfoC0 = c0(i10);
        if (subscriptionInfoC0 != null) {
            return Integer.valueOf(subscriptionInfoC0.getSubscriptionId());
        }
        return null;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f13796a = i10;
        this.f13798g = obj;
        this.f13799r = obj2;
        this.f13800x = obj3;
        this.f13797d = obj4;
    }

    public e(o2.g gVar, io.sentry.t tVar) {
        this.f13796a = 2;
        br.l.e(tVar, "secretsCryptor");
        this.f13798g = gVar;
        this.f13799r = tVar;
        this.f13800x = "https://data-api";
    }

    @Override // o5.f0
    public void onDownstreamFormatChanged(int i10, o5.z zVar, o5.v vVar) {
        if (h0(i10, zVar)) {
            ((e0) this.f13799r).c(j0(vVar));
        }
    }

    @Override // o5.f0
    public void onUpstreamDiscarded(int i10, o5.z zVar, o5.v vVar) {
        if (h0(i10, zVar)) {
            ((e0) this.f13799r).m(j0(vVar));
        }
    }

    @Override // o5.f0
    public void onLoadCanceled(int i10, o5.z zVar, o5.q qVar, o5.v vVar) {
        if (h0(i10, zVar)) {
            ((e0) this.f13799r).e(qVar, j0(vVar));
        }
    }

    @Override // o5.f0
    public void onLoadCompleted(int i10, o5.z zVar, o5.q qVar, o5.v vVar) {
        if (h0(i10, zVar)) {
            ((e0) this.f13799r).g(qVar, j0(vVar));
        }
    }

    @Override // o5.f0
    public void onLoadError(int i10, o5.z zVar, o5.q qVar, o5.v vVar, IOException iOException, boolean z10) {
        if (h0(i10, zVar)) {
            ((e0) this.f13799r).j(qVar, j0(vVar), iOException, z10);
        }
    }

    @Override // o5.f0
    public void onLoadStarted(int i10, o5.z zVar, o5.q qVar, o5.v vVar) {
        if (h0(i10, zVar)) {
            ((e0) this.f13799r).l(qVar, j0(vVar));
        }
    }

    public e(r0 r0Var, String str) {
        this.f13796a = 29;
        this.f13797d = r0Var;
        cc.s.e(str);
        this.f13798g = str;
        this.f13799r = new Bundle();
    }

    public e(df.c cVar, q3.a aVar, cg.e eVar) {
        this.f13796a = 21;
        this.f13798g = cVar;
        this.f13799r = aVar;
    }

    public e(ch.f fVar, ag.b bVar, SubscriptionManager subscriptionManager) {
        this.f13796a = 17;
        this.f13798g = fVar;
        this.f13799r = bVar;
        this.f13800x = subscriptionManager;
        this.f13797d = subscriptionManager != null ? Integer.valueOf(subscriptionManager.getActiveSubscriptionInfoCountMax()) : null;
    }

    public e(q3.a aVar, o2.g gVar, om.f fVar) {
        this.f13796a = 23;
        br.l.e(gVar, "deviceIpResolver");
        this.f13798g = aVar;
        this.f13799r = gVar;
        this.f13800x = fVar;
        this.f13797d = new CopyOnWriteArraySet();
    }

    public e(gt.l lVar, rr.a0 a0Var) {
        this.f13796a = 12;
        br.l.e(a0Var, "module");
        this.f13798g = lVar;
        this.f13799r = a0Var;
        this.f13800x = lVar.b(new rr.e0(this, 1));
        this.f13797d = lVar.b(new rr.e0(this, 0));
    }

    public e(on.k kVar, to.d dVar, iq.f fVar, b9.e eVar, wt.q qVar) {
        this.f13796a = 18;
        br.l.e(kVar, "persistenceManager");
        br.l.e(dVar, "contactsRepository");
        br.l.e(fVar, "timestampProvider");
        br.l.e(eVar, "sdkExecutor");
        br.l.e(qVar, "dispatcher");
        this.f13798g = kVar;
        this.f13799r = dVar;
        this.f13800x = fVar;
        this.f13797d = eVar;
        wt.w.s(wt.w.b(se.b.M(qVar, wt.w.c())), null, null, new a8.h(this, (pq.c) null, 17), 3);
    }

    public e(int i10) {
        this.f13796a = i10;
        switch (i10) {
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                this.f13799r = new ArrayDeque();
                this.f13800x = new ArrayDeque();
                this.f13797d = new ArrayDeque();
                break;
            case 15:
                this.f13798g = new u.e(0);
                this.f13799r = new SparseArray();
                this.f13800x = new u.o((Object) null);
                this.f13797d = new u.e(0);
                break;
            case 22:
                this.f13797d = new ArrayList();
                this.f13800x = new Object();
                break;
            default:
                this.f13797d = new ArrayList();
                this.f13798g = new HashMap();
                this.f13799r = new HashMap();
                break;
        }
    }

    public e(v0 v0Var, t0 t0Var, v4.b bVar) {
        this.f13796a = 19;
        br.l.e(v0Var, "store");
        br.l.e(bVar, "defaultExtras");
        this.f13798g = v0Var;
        this.f13799r = t0Var;
        this.f13800x = bVar;
        this.f13797d = new ee.f(28);
    }

    public e(Context context, ActionMode.Callback callback) {
        this.f13796a = 3;
        this.f13799r = context;
        this.f13798g = callback;
        this.f13797d = new ArrayList();
        this.f13800x = new i0(0);
    }

    public e(r2 r2Var, qs.g gVar, of.b bVar) {
        this.f13796a = 1;
        this.f13799r = r2Var;
        this.f13800x = gVar;
        this.f13798g = bVar;
        this.f13797d = new ArrayList();
    }

    public e(of.b bVar, e eVar, ArrayList arrayList) {
        this.f13796a = 0;
        this.f13799r = bVar;
        this.f13800x = eVar;
        this.f13797d = arrayList;
        this.f13798g = bVar;
    }

    public e(ya.g gVar, Object obj) {
        this.f13796a = 26;
        this.f13797d = gVar;
        this.f13799r = gVar.createEventDispatcher(null);
        this.f13800x = gVar.createDrmEventDispatcher(null);
        this.f13798g = obj;
    }

    public e(o5.j jVar, Object obj) {
        this.f13796a = 5;
        this.f13797d = jVar;
        this.f13799r = jVar.createEventDispatcher(null);
        this.f13800x = jVar.createDrmEventDispatcher(null);
        this.f13798g = obj;
    }

    public e(w.m mVar) {
        this.f13796a = 20;
        this.f13798g = mVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(w.q qVar) {
        this(new oh.p(21, qVar));
        this.f13796a = 20;
    }

    public e(h1 h1Var, boolean[] zArr) {
        this.f13796a = 6;
        this.f13798g = h1Var;
        this.f13799r = zArr;
        int i10 = h1Var.f18958a;
        this.f13800x = new boolean[i10];
        this.f13797d = new boolean[i10];
    }

    public e(TrackGroupArray trackGroupArray, boolean[] zArr) {
        this.f13796a = 27;
        this.f13798g = trackGroupArray;
        this.f13799r = zArr;
        int i10 = trackGroupArray.f4457a;
        this.f13800x = new boolean[i10];
        this.f13797d = new boolean[i10];
    }

    public e(ViewPager2 viewPager2) {
        this.f13796a = 28;
        this.f13797d = viewPager2;
        this.f13798g = new z7.j(0, this);
        this.f13799r = new y9.u(4, this);
    }
}
