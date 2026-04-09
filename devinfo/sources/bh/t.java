package bh;

import a0.x0;
import a0.z;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.view.InputEvent;
import c0.v0;
import com.google.android.gms.internal.ads.se;
import d0.f1;
import d0.x1;
import d0.z1;
import i2.d1;
import j2.l0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import u0.r1;
import u0.u0;
import u6.c0;
import u6.d0;
import xk.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2233b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2234c;

    /* renamed from: d, reason: collision with root package name */
    public int f2235d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2236e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2237f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, int i4, String str, ck.c cVar) {
        super(2, cVar);
        this.f2233b = 1;
        this.f2234c = wVar;
        this.f2235d = i4;
        this.f2236e = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        if (com.bumptech.glide.f.d(r3, r9, r8) == r0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object d(java.lang.Object r9) {
        /*
            r8 = this;
            dk.a r0 = dk.a.f22275a
            int r1 = r8.f2235d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            ci.b.D(r9)
            goto La7
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            java.lang.Object r1 = r8.f2236e
            p4.s0 r1 = (p4.s0) r1
            java.lang.Object r3 = r8.f2234c
            zk.u r3 = (zk.u) r3
            ci.b.D(r9)
            goto L92
        L25:
            ci.b.D(r9)
            java.lang.Object r9 = r8.f2234c
            zk.u r9 = (zk.u) r9
            c2.w r1 = new c2.w
            java.lang.Object r4 = r8.f2237f
            java.io.File r4 = (java.io.File) r4
            r5 = 13
            r1.<init>(r5, r4, r9)
            java.lang.Object r5 = p4.t0.f31314b
            java.io.File r4 = r4.getParentFile()
            nk.k.b(r4)
            java.io.File r4 = r4.getCanonicalFile()
            java.lang.String r4 = r4.getPath()
            java.lang.Object r5 = p4.t0.f31314b
            monitor-enter(r5)
            java.util.LinkedHashMap r6 = p4.t0.f31315c     // Catch: java.lang.Throwable -> L61
            java.lang.String r7 = "key"
            nk.k.d(r4, r7)     // Catch: java.lang.Throwable -> L61
            java.lang.Object r7 = r6.get(r4)     // Catch: java.lang.Throwable -> L61
            if (r7 != 0) goto L63
            p4.t0 r7 = new p4.t0     // Catch: java.lang.Throwable -> L61
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L61
            r6.put(r4, r7)     // Catch: java.lang.Throwable -> L61
            goto L63
        L61:
            r9 = move-exception
            goto Laa
        L63:
            p4.t0 r7 = (p4.t0) r7     // Catch: java.lang.Throwable -> L61
            java.util.concurrent.CopyOnWriteArrayList r6 = r7.f31316a     // Catch: java.lang.Throwable -> L61
            r6.add(r1)     // Catch: java.lang.Throwable -> L61
            java.util.concurrent.CopyOnWriteArrayList r6 = r7.f31316a     // Catch: java.lang.Throwable -> L61
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L61
            if (r6 != r3) goto L75
            r7.startWatching()     // Catch: java.lang.Throwable -> L61
        L75:
            monitor-exit(r5)
            p4.s0 r5 = new p4.s0
            r6 = 0
            r5.<init>(r6, r4, r1)
            yj.u r1 = yj.u.f37649a
            r8.f2234c = r9
            r8.f2236e = r5
            r8.f2235d = r3
            r3 = r9
            zk.t r3 = (zk.t) r3
            zk.h r3 = r3.f38375d
            java.lang.Object r1 = r3.h(r8, r1)
            if (r1 != r0) goto L90
            goto La6
        L90:
            r3 = r9
            r1 = r5
        L92:
            b2.b r9 = new b2.b
            r4 = 20
            r9.<init>(r4, r1)
            r1 = 0
            r8.f2234c = r1
            r8.f2236e = r1
            r8.f2235d = r2
            java.lang.Object r9 = com.bumptech.glide.f.d(r3, r9, r8)
            if (r9 != r0) goto La7
        La6:
            return r0
        La7:
            yj.u r9 = yj.u.f37649a
            return r9
        Laa:
            monitor-exit(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.t.d(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ek.j, mk.e] */
    private final Object e(Object obj) {
        h3.h hVar = (h3.h) this.f2237f;
        int i4 = this.f2235d;
        try {
            if (i4 == 0) {
                ci.b.D(obj);
                xk.v vVar = (xk.v) this.f2236e;
                ?? r12 = (ek.j) this.f2234c;
                this.f2235d = 1;
                obj = r12.invoke(vVar, this);
                dk.a aVar = dk.a.f22275a;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ci.b.D(obj);
            }
            hVar.a(obj);
        } catch (CancellationException unused) {
            hVar.f24836d = true;
            h3.k kVar = hVar.f24834b;
            if (kVar != null && kVar.f24839b.cancel(true)) {
                hVar.f24833a = null;
                hVar.f24834b = null;
                hVar.f24835c = null;
            }
        } catch (Throwable th2) {
            hVar.b(th2);
        }
        return yj.u.f37649a;
    }

    private final Object g(Object obj) {
        int i4 = this.f2235d;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ci.b.D(obj);
            return yj.u.f37649a;
        }
        ci.b.D(obj);
        xk.v vVar = (xk.v) this.f2236e;
        r1 r1Var = (r1) this.f2234c;
        l0 l0Var = (l0) this.f2237f;
        this.f2235d = 1;
        r1Var.a(vVar, l0Var, this);
        return dk.a.f22275a;
    }

    private final Object h(Object obj) throws Throwable {
        t6.u uVar = (t6.u) this.f2234c;
        c0 c0Var = (c0) this.f2236e;
        b7.r rVar = c0Var.f35132a;
        int i4 = this.f2235d;
        Object obj2 = dk.a.f22275a;
        if (i4 == 0) {
            ci.b.D(obj);
            Context context = c0Var.f35133b;
            c7.r rVar2 = (c7.r) this.f2237f;
            x0 x0Var = c0Var.f35136e;
            this.f2235d = 1;
            String str = c7.p.f2798a;
            boolean z3 = rVar.f2044q;
            Object obj3 = yj.u.f37649a;
            if (z3 && Build.VERSION.SDK_INT < 31) {
                d7.b bVar = (d7.b) x0Var.f147d;
                nk.k.d(bVar, "getMainThreadExecutor(...)");
                Object objE = xk.x.E(xk.x.l(bVar), new al.m(uVar, rVar, rVar2, context, null, 4), this);
                if (objE == obj2) {
                    obj3 = objE;
                }
            }
            if (obj3 != obj2) {
            }
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ci.b.D(obj);
            return obj;
        }
        ci.b.D(obj);
        String str2 = d0.f35146a;
        t6.v.e().a(str2, "Starting work for " + rVar.f2032c);
        vd.b bVarStartWork = uVar.startWork();
        nk.k.d(bVarStartWork, "startWork(...)");
        this.f2235d = 2;
        Object objA = d0.a(bVarStartWork, uVar, this);
        return objA == obj2 ? obj2 : objA;
    }

    private final Object k(Object obj) {
        nk.u uVar;
        int i4 = this.f2235d;
        if (i4 == 0) {
            ci.b.D(obj);
            uVar = (nk.u) this.f2234c;
            v5.j jVar = (v5.j) this.f2237f;
            this.f2236e = uVar;
            this.f2235d = 1;
            obj = jVar.a(this);
            dk.a aVar = dk.a.f22275a;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = (nk.u) this.f2236e;
            ci.b.D(obj);
        }
        uVar.f29986a = obj;
        return yj.u.f37649a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ek.j, mk.e] */
    private final Object l(Object obj) {
        ?? r02 = this.f2235d;
        try {
            if (r02 == 0) {
                ci.b.D(obj);
                xk.v vVar = (xk.v) this.f2236e;
                xk.n nVar = (xk.n) this.f2234c;
                ?? r22 = (ek.j) this.f2237f;
                this.f2236e = nVar;
                this.f2235d = 1;
                obj = r22.invoke(vVar, this);
                dk.a aVar = dk.a.f22275a;
                r02 = nVar;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (r02 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xk.m mVar = (xk.m) this.f2236e;
                ci.b.D(obj);
                r02 = mVar;
            }
        } catch (Throwable th2) {
            obj = ci.b.h(th2);
        }
        Throwable thA = yj.l.a(obj);
        xk.n nVar2 = (xk.n) r02;
        if (thA == null) {
            nVar2.T(obj);
        } else {
            nVar2.getClass();
            nVar2.T(new xk.p(thA, false));
        }
        return yj.u.f37649a;
    }

    private final Object m(Object obj) throws Exception {
        mk.a bVar;
        x6.d dVar = (x6.d) this.f2237f;
        ConnectivityManager connectivityManager = dVar.f36979a;
        int i4 = this.f2235d;
        yj.u uVar = yj.u.f37649a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ci.b.D(obj);
            return uVar;
        }
        ci.b.D(obj);
        zk.u uVar2 = (zk.u) this.f2236e;
        NetworkRequest networkRequestA = ((t6.e) this.f2234c).a();
        ck.c cVar = null;
        if (networkRequestA == null) {
            zk.t tVar = (zk.t) uVar2;
            tVar.getClass();
            tVar.f38375d.m(null, false);
            return uVar;
        }
        b7.b bVar2 = new b7.b(25, xk.x.v(uVar2, null, null, new pf.n(dVar, uVar2, cVar, 11), 3), uVar2);
        if (Build.VERSION.SDK_INT >= 30) {
            x6.g.f36984a.getClass();
            bVar = x6.g.a(connectivityManager, networkRequestA, bVar2);
        } else {
            int i10 = se.f15994c;
            se seVar = new se(bVar2);
            nk.q qVar = new nk.q();
            try {
                t6.v.e().a(x6.i.f36992a, "NetworkRequestConstraintController register callback");
                connectivityManager.registerNetworkCallback(networkRequestA, seVar);
                qVar.f29982a = true;
            } catch (RuntimeException e2) {
                if (!vk.p.p0(e2.getClass().getName(), "TooManyRequestsException", false)) {
                    throw e2;
                }
                t6.v.e().b(x6.i.f36992a, "NetworkRequestConstraintController couldn't register callback", e2);
                bVar2.invoke(new x6.b(7));
            }
            bVar = new c1.b(qVar, connectivityManager, seVar, 8);
        }
        rl.k kVar = new rl.k(1, bVar);
        this.f2235d = 1;
        Object objD = com.bumptech.glide.f.d(uVar2, kVar, this);
        dk.a aVar = dk.a.f22275a;
        return objD == aVar ? aVar : uVar;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [ek.j, mk.e] */
    /* JADX WARN: Type inference failed for: r1v13, types: [ek.j, mk.e] */
    /* JADX WARN: Type inference failed for: r1v21, types: [ek.j, mk.e] */
    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2233b) {
            case 0:
                return new t((String) this.f2236e, (w) this.f2234c, (WeakReference) this.f2237f, cVar, 0);
            case 1:
                t tVar = new t((w) this.f2234c, this.f2235d, (String) this.f2236e, cVar);
                tVar.f2237f = ((yj.l) obj).f37641a;
                return tVar;
            case 2:
                t tVar2 = new t((al.i) this.f2234c, (bl.e) this.f2237f, cVar, 2);
                tVar2.f2236e = obj;
                return tVar2;
            case 3:
                t tVar3 = new t((al.q) this.f2234c, (al.i) this.f2237f, cVar, 3);
                tVar3.f2236e = obj;
                return tVar3;
            case 4:
                return new t((e0.i) this.f2236e, (e0.j) this.f2234c, (i0) this.f2237f, cVar, 4);
            case 5:
                return new t((e0.i) this.f2236e, (e0.h) this.f2234c, (i0) this.f2237f, cVar, 5);
            case 6:
                t tVar4 = new t((va.o) this.f2234c, (mk.e) this.f2237f, cVar, 6);
                tVar4.f2236e = obj;
                return tVar4;
            case 7:
                return new t((va.o) this.f2236e, (v0) this.f2234c, (mk.e) this.f2237f, cVar, 7);
            case 8:
                t tVar5 = new t((d0.i0) this.f2234c, (z1) this.f2237f, cVar, 8);
                tVar5.f2236e = obj;
                return tVar5;
            case 9:
                t tVar6 = new t((z1) this.f2234c, (mk.e) this.f2237f, cVar, 9);
                tVar6.f2236e = obj;
                return tVar6;
            case 10:
                return new t((String) this.f2236e, (String) this.f2234c, (gh.e) this.f2237f, cVar, 10);
            case 11:
                return new t((String) this.f2236e, (String) this.f2234c, (hh.i) this.f2237f, cVar, 11);
            case 12:
                return new t((String) this.f2236e, (String) this.f2234c, (ih.c) this.f2237f, cVar, 12);
            case 13:
                return new t((j0.s) this.f2236e, (z) this.f2234c, (s1.b) this.f2237f, cVar, 13);
            case 14:
                return new t((zk.h) this.f2237f, cVar, 14);
            case 15:
                return new t((jj.f) this.f2236e, (ArrayList) this.f2234c, (ArrayList) this.f2237f, cVar, 15);
            case 16:
                return new t((k0.c) this.f2236e, (d1) this.f2234c, (c2.c) this.f2237f, cVar, 16);
            case 17:
                return new t((n5.a) this.f2236e, (Uri) this.f2234c, (InputEvent) this.f2237f, cVar, 17);
            case 18:
                return new t((nm.o) this.f2236e, (u0) this.f2234c, (u0) this.f2237f, cVar, 18);
            case 19:
                t tVar7 = new t((p4.z) this.f2237f, cVar, 19);
                tVar7.f2234c = obj;
                return tVar7;
            case 20:
                t tVar8 = new t((p4.z) this.f2234c, (mk.e) this.f2237f, cVar);
                tVar8.f2236e = obj;
                return tVar8;
            case 21:
                t tVar9 = new t((File) this.f2237f, cVar, 21);
                tVar9.f2234c = obj;
                return tVar9;
            case 22:
                return new t((b8.d) this.f2236e, (qj.a) this.f2234c, (LinkedHashSet) this.f2237f, cVar, 22);
            case 23:
                t tVar10 = new t((mk.e) this.f2234c, (h3.h) this.f2237f, cVar);
                tVar10.f2236e = obj;
                return tVar10;
            case 24:
                t tVar11 = new t((r1) this.f2234c, (l0) this.f2237f, cVar, 24);
                tVar11.f2236e = obj;
                return tVar11;
            case 25:
                return new t((c0) this.f2236e, (t6.u) this.f2234c, (c7.r) this.f2237f, cVar, 25);
            case 26:
                return new t((nk.u) this.f2234c, (v5.j) this.f2237f, cVar, 26);
            case 27:
                t tVar12 = new t((xk.n) this.f2234c, (mk.e) this.f2237f, cVar);
                tVar12.f2236e = obj;
                return tVar12;
            case 28:
                t tVar13 = new t((t6.e) this.f2234c, (x6.d) this.f2237f, cVar, 28);
                tVar13.f2236e = obj;
                return tVar13;
            default:
                return new t((o8.b) this.f2236e, (b7.r) this.f2234c, (x6.f) this.f2237f, cVar, 29);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f2233b) {
            case 0:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 1:
                Object obj3 = ((yj.l) obj).f37641a;
                t tVar = new t((w) this.f2234c, this.f2235d, (String) this.f2236e, (ck.c) obj2);
                tVar.f2237f = obj3;
                yj.u uVar = yj.u.f37649a;
                tVar.invokeSuspend(uVar);
                return uVar;
            case 2:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 3:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 4:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 5:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 6:
                return ((t) create((f1) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 7:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 8:
                return ((t) create((x1) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 9:
                return ((t) create((f1) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 10:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 11:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 12:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 13:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 14:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 15:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 16:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 17:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 18:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 19:
                return ((t) create((al.i) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 20:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 21:
                return ((t) create((zk.u) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 22:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 23:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 24:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 25:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 26:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 27:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 28:
                return ((t) create((zk.u) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            default:
                return ((t) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05c2 A[LOOP:4: B:226:0x0570->B:240:0x05c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0656 A[Catch: all -> 0x0628, TryCatch #2 {all -> 0x0628, blocks: (B:248:0x0622, B:259:0x064e, B:261:0x0656, B:262:0x0664, B:270:0x0675, B:256:0x0640, B:272:0x0678, B:274:0x067d, B:275:0x067e, B:255:0x063b, B:263:0x0665, B:265:0x066b), top: B:518:0x0615, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x05c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0286  */
    /* JADX WARN: Type inference failed for: r2v71, types: [zk.w] */
    /* JADX WARN: Type inference failed for: r6v10, types: [xk.a, zk.t, zk.w] */
    /* JADX WARN: Type inference failed for: r7v45, types: [ek.j, mk.e] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:257:0x064b -> B:259:0x064e). Please report as a decompilation issue!!! */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, ck.c cVar, int i4) {
        super(2, cVar);
        this.f2233b = i4;
        this.f2237f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, Object obj2, ck.c cVar, int i4) {
        super(2, cVar);
        this.f2233b = i4;
        this.f2234c = obj;
        this.f2237f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, Object obj2, Object obj3, ck.c cVar, int i4) {
        super(2, cVar);
        this.f2233b = i4;
        this.f2236e = obj;
        this.f2234c = obj2;
        this.f2237f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(mk.e eVar, h3.h hVar, ck.c cVar) {
        super(2, cVar);
        this.f2233b = 23;
        this.f2234c = (ek.j) eVar;
        this.f2237f = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(p4.z zVar, mk.e eVar, ck.c cVar) {
        super(2, cVar);
        this.f2233b = 20;
        this.f2234c = zVar;
        this.f2237f = (ek.j) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(xk.n nVar, mk.e eVar, ck.c cVar) {
        super(2, cVar);
        this.f2233b = 27;
        this.f2234c = nVar;
        this.f2237f = (ek.j) eVar;
    }
}
