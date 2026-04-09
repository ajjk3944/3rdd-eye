package androidx.lifecycle;

import com.google.android.gms.internal.ads.ow0;
import com.google.android.gms.internal.ads.pw0;
import com.google.android.gms.internal.ads.rw0;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.mode.User;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1187b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1188c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, ck.c cVar, int i4) {
        super(2, cVar);
        this.f1187b = i4;
        this.f1189d = obj;
    }

    /* JADX WARN: Type inference failed for: r1v25, types: [ek.j, mk.e] */
    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f1187b) {
            case 0:
                u uVar = new u((v) this.f1189d, cVar, 0);
                uVar.f1188c = obj;
                return uVar;
            case 1:
                u uVar2 = new u((String) this.f1189d, cVar, 1);
                uVar2.f1188c = obj;
                return uVar2;
            case 2:
                u uVar3 = new u((ow0) this.f1189d, cVar, 2);
                uVar3.f1188c = obj;
                return uVar3;
            case 3:
                u uVar4 = new u((dh.g) this.f1189d, cVar, 3);
                uVar4.f1188c = ((yj.l) obj).f37641a;
                return uVar4;
            case 4:
                u uVar5 = new u((gh.e) this.f1189d, cVar, 4);
                uVar5.f1188c = ((yj.l) obj).f37641a;
                return uVar5;
            case 5:
                u uVar6 = new u((hh.y) this.f1189d, cVar, 5);
                uVar6.f1188c = ((yj.l) obj).f37641a;
                return uVar6;
            case 6:
                u uVar7 = new u((ih.c) this.f1189d, cVar, 6);
                uVar7.f1188c = ((yj.l) obj).f37641a;
                return uVar7;
            case 7:
                u uVar8 = new u((p4.b1) this.f1189d, cVar, 7);
                uVar8.f1188c = obj;
                return uVar8;
            case 8:
                u uVar9 = new u((p5.d) this.f1189d, cVar, 8);
                uVar9.f1188c = obj;
                return uVar9;
            case 9:
                u uVar10 = new u((LinkedHashSet) this.f1189d, cVar, 9);
                uVar10.f1188c = obj;
                return uVar10;
            case 10:
                u uVar11 = new u((Set) this.f1189d, cVar, 10);
                uVar11.f1188c = obj;
                return uVar11;
            case 11:
                return new u((sg.f) this.f1188c, (String) this.f1189d, cVar);
            default:
                u uVar12 = new u((ek.j) this.f1189d, cVar);
                uVar12.f1188c = obj;
                return uVar12;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1187b) {
            case 0:
                u uVar = (u) create((xk.v) obj, (ck.c) obj2);
                yj.u uVar2 = yj.u.f37649a;
                uVar.invokeSuspend(uVar2);
                return uVar2;
            case 1:
                return ((u) create((rw0) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 2:
                return ((u) create((rw0) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 3:
                Object obj3 = ((yj.l) obj).f37641a;
                u uVar3 = new u((dh.g) this.f1189d, (ck.c) obj2, 3);
                uVar3.f1188c = obj3;
                yj.u uVar4 = yj.u.f37649a;
                uVar3.invokeSuspend(uVar4);
                return uVar4;
            case 4:
                Object obj4 = ((yj.l) obj).f37641a;
                u uVar5 = new u((gh.e) this.f1189d, (ck.c) obj2, 4);
                uVar5.f1188c = obj4;
                yj.u uVar6 = yj.u.f37649a;
                uVar5.invokeSuspend(uVar6);
                return uVar6;
            case 5:
                Object obj5 = ((yj.l) obj).f37641a;
                u uVar7 = new u((hh.y) this.f1189d, (ck.c) obj2, 5);
                uVar7.f1188c = obj5;
                yj.u uVar8 = yj.u.f37649a;
                uVar7.invokeSuspend(uVar8);
                return uVar8;
            case 6:
                Object obj6 = ((yj.l) obj).f37641a;
                u uVar9 = new u((ih.c) this.f1189d, (ck.c) obj2, 6);
                uVar9.f1188c = obj6;
                yj.u uVar10 = yj.u.f37649a;
                uVar9.invokeSuspend(uVar10);
                return uVar10;
            case 7:
                return ((u) create((p4.b1) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 8:
                ((u) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
                throw null;
            case 9:
                u uVar11 = (u) create((xk.v) obj, (ck.c) obj2);
                yj.u uVar12 = yj.u.f37649a;
                uVar11.invokeSuspend(uVar12);
                return uVar12;
            case 10:
                return ((u) create((t4.b) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 11:
                u uVar13 = (u) create((xk.v) obj, (ck.c) obj2);
                yj.u uVar14 = yj.u.f37649a;
                uVar13.invokeSuspend(uVar14);
                return uVar14;
            default:
                return ((u) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [ck.c] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r7v13, types: [ek.j, mk.e] */
    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f1187b;
        boolean z3 = false;
        int i10 = 0;
        z = false;
        boolean z10 = false;
        z3 = false;
        yj.u uVar = yj.u.f37649a;
        Object obj2 = this.f1189d;
        switch (i4) {
            case 0:
                ci.b.D(obj);
                xk.v vVar = (xk.v) this.f1188c;
                v vVar2 = (v) obj2;
                t tVar = vVar2.f1192a;
                if (((c0) tVar).f1110d.compareTo(s.f1181b) >= 0) {
                    tVar.a(vVar2);
                } else {
                    xk.x.f(vVar.A(), null);
                }
                return uVar;
            case 1:
                ci.b.D(obj);
                pw0 pw0Var = (pw0) ((rw0) this.f1188c).s();
                nk.k.d(DesugarCollections.unmodifiableMap(((rw0) pw0Var.f14755b).B()), "getQueryIdToAdQualityDataMapMap(...)");
                String str = (String) obj2;
                nk.k.e(str, "key");
                pw0Var.b();
                ((rw0) pw0Var.f14755b).E().remove(str);
                return (rw0) pw0Var.e();
            case 2:
                ci.b.D(obj);
                pw0 pw0Var2 = (pw0) ((rw0) this.f1188c).s();
                nk.k.d(DesugarCollections.unmodifiableMap(((rw0) pw0Var2.f14755b).B()), "getQueryIdToAdQualityDataMapMap(...)");
                ow0 ow0Var = (ow0) obj2;
                String strD = ow0Var.D();
                nk.k.d(strD, "getGwsQueryId(...)");
                pw0Var2.b();
                ((rw0) pw0Var2.f14755b).E().put(strD, ow0Var);
                return (rw0) pw0Var2.e();
            case 3:
                dh.g gVar = (dh.g) obj2;
                Object obj3 = this.f1188c;
                ci.b.D(obj);
                if (((yj.u) (obj3 instanceof yj.k ? 0 : obj3)) != null) {
                    gVar.f22268f.h(Boolean.TRUE);
                    bh.c.f2188a.f();
                }
                Throwable thA = yj.l.a(obj3);
                if (thA != null) {
                    wi.e eVar = gVar.f22266d;
                    String message = thA.getMessage();
                    if (message == null) {
                        message = a0.g.o("error@", thA);
                    }
                    eVar.h(message);
                }
                return uVar;
            case 4:
                gh.e eVar2 = (gh.e) obj2;
                wi.e eVar3 = eVar2.f24734b;
                wi.e eVar4 = eVar2.f24738f;
                Object obj4 = this.f1188c;
                ci.b.D(obj);
                fh.h hVar = (fh.h) (obj4 instanceof yj.k ? null : obj4);
                if (hVar != null) {
                    bh.c.f2188a.e(hVar.b());
                    if (hVar.a()) {
                        eVar4.h(Boolean.TRUE);
                    } else {
                        eVar3.h(hg.e.e(R.string.redeem_successful));
                        eVar4.h(Boolean.FALSE);
                    }
                }
                Throwable thA2 = yj.l.a(obj4);
                if (thA2 != null) {
                    String message2 = thA2.getMessage();
                    if (message2 == null) {
                        message2 = a0.g.o("error@", thA2);
                    }
                    eVar3.h(message2);
                }
                return uVar;
            case 5:
                Object obj5 = this.f1188c;
                ci.b.D(obj);
                hh.y yVar = (hh.y) obj2;
                yVar.f25144d.h(new hh.r(hg.e.e(R.string.get_verification_code), true, false));
                if (((yj.u) (obj5 instanceof yj.k ? null : obj5)) != null) {
                    yVar.f25150l.start();
                    yVar.f25142b.h(hg.e.e(R.string.send_verify_code_success));
                }
                Throwable thA3 = yj.l.a(obj5);
                if (thA3 != null) {
                    hh.y.g(yVar, thA3);
                }
                return uVar;
            case 6:
                ih.c cVar = (ih.c) obj2;
                Object obj6 = this.f1188c;
                ci.b.D(obj);
                fh.e eVar5 = (fh.e) (obj6 instanceof yj.k ? null : obj6);
                if (eVar5 != null) {
                    if (eVar5.b() == null) {
                        ih.c.g(cVar, new NullPointerException("null data in result"));
                    } else {
                        bh.c.f2188a.e((User) eVar5.b());
                        cVar.f25997b.h(hg.e.e(R.string.edit_successful));
                        cVar.f26001f.h(Boolean.TRUE);
                    }
                }
                Throwable thA4 = yj.l.a(obj6);
                if (thA4 != null) {
                    ih.c.g(cVar, thA4);
                }
                return uVar;
            case 7:
                ci.b.D(obj);
                p4.b1 b1Var = (p4.b1) this.f1188c;
                if ((b1Var instanceof p4.d) && b1Var.f31175a <= ((p4.b1) obj2).f31175a) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 8:
                ci.b.D(obj);
                throw null;
            case 9:
                xk.v vVar3 = (xk.v) this.f1188c;
                ci.b.D(obj);
                wi.c.d((LinkedHashSet) obj2, new a6.e(21, vVar3), new j6.i(11));
                return uVar;
            case 10:
                ci.b.D(obj);
                Set setKeySet = ((t4.b) this.f1188c).a().keySet();
                ArrayList arrayList = new ArrayList(zj.o.T(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((t4.d) it.next()).f34168a);
                }
                Set set = (Set) obj2;
                if (set == s4.h.f33468a) {
                    z10 = true;
                } else {
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList.contains((String) it2.next())) {
                                z10 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z10);
            case 11:
                ci.b.D(obj);
                sg.f fVar = (sg.f) this.f1188c;
                ArrayList arrayList2 = fVar.f33607b;
                String str2 = (String) obj2;
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj7 = arrayList2.get(i10);
                    i10++;
                    sg.g gVar2 = (sg.g) obj7;
                    if (vk.i.y0(gVar2.f33613b, str2, true) || vk.i.y0(gVar2.f33612a, str2, true) || vk.i.y0(gVar2.f33614c, str2, true)) {
                        arrayList3.add(obj7);
                    }
                }
                fVar.f33608c.h(new sg.h(arrayList3, new ng.b(true, str2)));
                return uVar;
            default:
                ci.b.D(obj);
                ck.f fVarO = ((xk.v) this.f1188c).A().O(ck.d.f2897a);
                nk.k.b(fVarO);
                ck.e eVar6 = (ck.e) fVarO;
                xk.n nVarA = xk.x.a();
                xk.x.u(xk.t0.f37238a, eVar6, xk.w.f37247d, new bh.t(nVarA, (mk.e) obj2, (ck.c) null));
                while (!nVarA.R()) {
                    try {
                        return xk.x.z(eVar6, new al.k(nVarA, , 18));
                    } catch (InterruptedException unused) {
                    }
                }
                return nVarA.D();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(mk.e eVar, ck.c cVar) {
        super(2, cVar);
        this.f1187b = 12;
        this.f1189d = (ek.j) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(sg.f fVar, String str, ck.c cVar) {
        super(2, cVar);
        this.f1187b = 11;
        this.f1188c = fVar;
        this.f1189d = str;
    }
}
