package pf;

import android.view.View;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31867b;

    /* renamed from: c, reason: collision with root package name */
    public int f31868c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f31870e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, ck.c cVar, int i4) {
        super(2, cVar);
        this.f31867b = i4;
        this.f31870e = obj;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f31867b) {
            case 0:
                return new n((o) this.f31869d, (x0) this.f31870e, cVar, 0);
            case 1:
                return new n((c1) this.f31869d, (j0) this.f31870e, cVar, 1);
            case 2:
                n nVar = new n((q0.a) this.f31870e, cVar, 2);
                nVar.f31869d = obj;
                return nVar;
            case 3:
                return new n((c2.s) this.f31869d, (a0.l) this.f31870e, cVar, 3);
            case 4:
                return new n((e0.i) this.f31869d, (g1.q) this.f31870e, cVar, 4);
            case 5:
                n nVar2 = new n((sf.c) this.f31870e, cVar, 5);
                nVar2.f31869d = obj;
                return nVar2;
            case 6:
                n nVar3 = new n((te.b) this.f31870e, cVar, 6);
                nVar3.f31869d = obj;
                return nVar3;
            case 7:
                return new n((t5.f0) this.f31869d, (mk.a) this.f31870e, cVar, 7);
            case 8:
                return new n((te.c) this.f31869d, (mk.c) this.f31870e, cVar, 8);
            case 9:
                return new n((mk.e) this.f31869d, (v5.r) this.f31870e, cVar, 9);
            case 10:
                return new n((mk.e) this.f31869d, (nk.u) this.f31870e, cVar, 10);
            case 11:
                return new n((x6.d) this.f31869d, (zk.u) this.f31870e, cVar, 11);
            case 12:
                return new n((View) this.f31869d, (mk.a) this.f31870e, cVar, 12);
            case 13:
                n nVar4 = new n((y6.b) this.f31870e, cVar, 13);
                nVar4.f31869d = obj;
                return nVar4;
            default:
                n nVar5 = new n((zk.x) this.f31870e, cVar, 14);
                nVar5.f31869d = obj;
                return nVar5;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31867b) {
            case 0:
                return ((n) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 1:
                return ((n) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 2:
                return ((n) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 3:
                return ((n) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 4:
                return ((n) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 5:
                return ((n) create((JSONObject) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 6:
                return ((n) create((t4.b) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 7:
                return ((n) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 8:
                return ((n) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 9:
                return ((n) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 10:
                return ((n) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 11:
                return ((n) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 12:
                return ((n) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 13:
                return ((n) create((zk.u) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            default:
                return ((n) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[RETURN, SYNTHETIC] */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, Object obj2, ck.c cVar, int i4) {
        super(2, cVar);
        this.f31867b = i4;
        this.f31869d = obj;
        this.f31870e = obj2;
    }
}
