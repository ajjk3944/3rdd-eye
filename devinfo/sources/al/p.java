package al;

import android.net.Uri;
import android.view.View;
import com.google.android.gms.internal.ads.yf0;
import d0.s1;
import d0.z1;
import j2.o1;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f582b;

    /* renamed from: c, reason: collision with root package name */
    public int f583c;

    /* renamed from: d, reason: collision with root package name */
    public Object f584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f585e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.lifecycle.j0 j0Var, Object obj, ck.c cVar) {
        super(2, cVar);
        this.f582b = 3;
        this.f585e = j0Var;
        this.f584d = obj;
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [ek.j, mk.e] */
    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f582b) {
            case 0:
                p pVar = new p((i1) this.f585e, cVar, 0);
                pVar.f584d = obj;
                return pVar;
            case 1:
                p pVar2 = new p((va.o) this.f585e, cVar, 1);
                pVar2.f584d = obj;
                return pVar2;
            case 2:
                p pVar3 = new p((a0) this.f585e, cVar, 2);
                pVar3.f584d = obj;
                return pVar3;
            case 3:
                return new p((androidx.lifecycle.j0) this.f585e, this.f584d, cVar);
            case 4:
                p pVar4 = new p((bh.w) this.f585e, cVar, 4);
                pVar4.f584d = ((yj.l) obj).f37641a;
                return pVar4;
            case 5:
                return new p((String) this.f584d, (bh.w) this.f585e, cVar, 5);
            case 6:
                p pVar5 = new p((bl.e) this.f585e, cVar, 6);
                pVar5.f584d = obj;
                return pVar5;
            case 7:
                p pVar6 = new p((bl.f) this.f585e, cVar, 7);
                pVar6.f584d = obj;
                return pVar6;
            case 8:
                p pVar7 = new p((i) this.f585e, cVar, 8);
                pVar7.f584d = obj;
                return pVar7;
            case 9:
                return new p((e0.i) this.f584d, (e0.f) this.f585e, cVar, 9);
            case 10:
                return new p((e0.i) this.f584d, (e0.g) this.f585e, cVar, 10);
            case 11:
                return new p((yf0) this.f584d, (String) this.f585e, cVar, 11);
            case 12:
                p pVar8 = new p((zk.l) this.f585e, cVar, 12);
                pVar8.f584d = obj;
                return pVar8;
            case 13:
                p pVar9 = new p((d0.z0) this.f585e, cVar, 13);
                pVar9.f584d = obj;
                return pVar9;
            case 14:
                return new p((z1) this.f584d, (mk.e) this.f585e, cVar, 14);
            case 15:
                return new p((d0.u) this.f584d, (s1) this.f585e, cVar, 15);
            case 16:
                return new p((String) this.f584d, (dh.g) this.f585e, cVar, 16);
            case 17:
                return new p((g3.p) this.f584d, (o1.c) this.f585e, cVar, 17);
            case 18:
                return new p((gg.b) this.f584d, (String) this.f585e, cVar, 18);
            case 19:
                return new p((String) this.f584d, (hh.i) this.f585e, cVar, 19);
            case 20:
                return new p((u0.s1) this.f584d, (View) this.f585e, cVar, 20);
            case 21:
                return new p((g1) this.f584d, (o1) this.f585e, cVar, 21);
            case 22:
                return new p((k0.c) this.f584d, (c1.b) this.f585e, cVar, 22);
            case 23:
                return new p((n5.a) this.f584d, (Uri) this.f585e, cVar, 23);
            case 24:
                return new p((o2.c) this.f584d, (Runnable) this.f585e, cVar, 24);
            case 25:
                return new p((o5.a) this.f584d, (q5.b) this.f585e, cVar, 25);
            case 26:
                p pVar10 = new p((List) this.f585e, cVar, 26);
                pVar10.f584d = obj;
                return pVar10;
            case 27:
                return new p((mk.e) this.f584d, (p4.d) this.f585e, cVar);
            case 28:
                p pVar11 = new p((p4.z) this.f585e, cVar, 28);
                pVar11.f584d = obj;
                return pVar11;
            default:
                return new p((a0.x0) this.f585e, cVar, 29);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f582b) {
            case 0:
                return ((p) create((zk.u) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 1:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 2:
                return ((p) create((androidx.lifecycle.j0) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 3:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 4:
                Object obj3 = ((yj.l) obj).f37641a;
                p pVar = new p((bh.w) this.f585e, (ck.c) obj2, 4);
                pVar.f584d = obj3;
                return pVar.invokeSuspend(yj.u.f37649a);
            case 5:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 6:
                return ((p) create((zk.u) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 7:
                return ((p) create((i) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 8:
                return ((p) create(obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 9:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 10:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 11:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 12:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 13:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 14:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 15:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 16:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 17:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 18:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 19:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 20:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 21:
                ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
                return dk.a.f22275a;
            case 22:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 23:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 24:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 25:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 26:
                return ((p) create((p4.j) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 27:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 28:
                return ((p) create((p4.l0) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            default:
                return ((p) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r0.invoke(r1, r14) != r10) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[PHI: r0 r1
  0x005f: PHI (r0v202 al.p) = (r0v208 al.p), (r0v215 al.p) binds: [B:15:0x005c, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]
  0x005f: PHI (r1v55 java.lang.Object) = (r1v58 java.lang.Object), (r1v59 java.lang.Object) binds: [B:15:0x005c, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0414 A[Catch: all -> 0x03f2, TryCatch #1 {all -> 0x03f2, blocks: (B:230:0x03ee, B:240:0x040a, B:242:0x0414, B:245:0x0423, B:237:0x03fe), top: B:413:0x03e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x044b A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r0v185, types: [ek.j, mk.e] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v16, types: [xk.y0] */
    /* JADX WARN: Type inference failed for: r1v19, types: [xk.y0] */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0067 -> B:20:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:246:0x0447 -> B:240:0x040a). Please report as a decompilation issue!!! */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, ck.c cVar, int i4) {
        super(2, cVar);
        this.f582b = i4;
        this.f585e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Object obj2, ck.c cVar, int i4) {
        super(2, cVar);
        this.f582b = i4;
        this.f584d = obj;
        this.f585e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(mk.e eVar, p4.d dVar, ck.c cVar) {
        super(2, cVar);
        this.f582b = 27;
        this.f584d = (ek.j) eVar;
        this.f585e = dVar;
    }
}
