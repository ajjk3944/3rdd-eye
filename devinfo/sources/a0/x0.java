package a0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.e1;
import androidx.lifecycle.h1;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import b5.b1;
import com.google.android.gms.internal.ads.xz;
import com.google.android.gms.internal.consent_sdk.d3;
import com.google.android.gms.internal.consent_sdk.h7;
import com.google.android.gms.internal.consent_sdk.i7;
import com.google.android.gms.internal.consent_sdk.r1;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.u9;
import com.google.android.gms.internal.measurement.v5;
import com.google.android.gms.internal.measurement.w3;
import com.google.android.ump.ConsentInformation;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.Sku;
import ec.o1;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x0 implements v0, si.i, i7, com.google.android.gms.internal.consent_sdk.k0, d7.a, hm.v, ga.b, rf.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144a;

    /* renamed from: b, reason: collision with root package name */
    public Object f145b;

    /* renamed from: c, reason: collision with root package name */
    public Object f146c;

    /* renamed from: d, reason: collision with root package name */
    public Object f147d;

    /* renamed from: e, reason: collision with root package name */
    public Object f148e;

    public /* synthetic */ x0(int i4, Object obj) {
        this.f144a = i4;
        this.f148e = obj;
    }

    public static void I(x0 x0Var, vl.j jVar, vl.m mVar, vl.j jVar2, int i4) {
        o.e eVar;
        if ((i4 & 1) != 0) {
            jVar = null;
        }
        if ((i4 & 2) != 0) {
            mVar = null;
        }
        if ((i4 & 4) != 0) {
            jVar2 = null;
        }
        x0Var.getClass();
        TimeZone timeZone = sl.h.f33837a;
        boolean zIsShutdown = ((ThreadPoolExecutor) x0Var.u()).isShutdown();
        synchronized (x0Var) {
            if (mVar != null) {
                try {
                    if (!((ArrayDeque) x0Var.f147d).remove(mVar)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (jVar2 != null) {
                jVar2.f36328b.decrementAndGet();
                if (!((ArrayDeque) x0Var.f146c).remove(jVar2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (jVar != null) {
                ((ArrayDeque) x0Var.f145b).add(jVar);
                vl.j jVarW = x0Var.w(((rl.n) jVar.f36329c.f36333b.f36146b).f33116d);
                if (jVarW != null) {
                    jVar.f36328b = jVarW.f36328b;
                }
            }
            if ((mVar != null || jVar2 != null) && (zIsShutdown || ((ArrayDeque) x0Var.f146c).isEmpty())) {
                ((ArrayDeque) x0Var.f147d).isEmpty();
            }
            int i10 = 13;
            if (zIsShutdown) {
                List listR0 = zj.n.r0((ArrayDeque) x0Var.f145b);
                ((ArrayDeque) x0Var.f145b).clear();
                eVar = new o.e(i10, listR0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) x0Var.f145b).iterator();
                nk.k.d(it, "iterator(...)");
                while (it.hasNext()) {
                    vl.j jVar3 = (vl.j) it.next();
                    if (((ArrayDeque) x0Var.f146c).size() >= 64) {
                        break;
                    }
                    if (jVar3.f36328b.get() < 5) {
                        it.remove();
                        jVar3.f36328b.incrementAndGet();
                        arrayList.add(jVar3);
                        ((ArrayDeque) x0Var.f146c).add(jVar3);
                    }
                }
                eVar = new o.e(i10, arrayList);
            }
        }
        int size = ((List) eVar.f30195b).size();
        for (int i11 = 0; i11 < size; i11++) {
            vl.j jVar4 = (vl.j) ((List) eVar.f30195b).get(i11);
            if (jVar4 != jVar) {
                vl.m mVar2 = jVar4.f36329c;
            }
            if (zIsShutdown) {
                jVar4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                jVar4.f36329c.i(interruptedIOException);
                jVar4.f36327a.j(interruptedIOException);
            } else {
                ExecutorService executorServiceU = x0Var.u();
                jVar4.getClass();
                vl.m mVar3 = jVar4.f36329c;
                nk.k.e(mVar3.f36332a.f33154a, "<this>");
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceU).execute(jVar4);
                    } catch (RejectedExecutionException e2) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e2);
                        jVar4.f36329c.i(interruptedIOException2);
                        jVar4.f36327a.j(interruptedIOException2);
                        x0 x0Var2 = mVar3.f36332a.f33154a;
                        x0Var2.getClass();
                        I(x0Var2, null, null, jVar4, 3);
                    }
                } catch (Throwable th3) {
                    x0 x0Var3 = mVar3.f36332a.f33154a;
                    x0Var3.getClass();
                    I(x0Var3, null, null, jVar4, 3);
                    throw th3;
                }
            }
        }
    }

    public ArrayList A() {
        ArrayList arrayList = new ArrayList();
        for (b1 b1Var : ((HashMap) this.f145b).values()) {
            if (b1Var != null) {
                arrayList.add(b1Var.f1747c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List B() {
        ArrayList arrayList;
        if (((ArrayList) this.f148e).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f148e)) {
            arrayList = new ArrayList((ArrayList) this.f148e);
        }
        return arrayList;
    }

    public r C(long j, r rVar, r rVar2) {
        if (((r) this.f146c) == null) {
            this.f146c = rVar.c();
        }
        r rVar3 = (r) this.f146c;
        if (rVar3 == null) {
            nk.k.k("velocityVector");
            throw null;
        }
        int iB = rVar3.b();
        for (int i4 = 0; i4 < iB; i4++) {
            r rVar4 = (r) this.f146c;
            if (rVar4 == null) {
                nk.k.k("velocityVector");
                throw null;
            }
            z.e eVar = (z.e) this.f148e;
            rVar.getClass();
            long j8 = j / 1000000;
            z.c cVarA = ((qc.e) eVar.f37798a).a(rVar2.a(i4));
            long j9 = cVarA.f37796c;
            rVar4.e(i4, (((Math.signum(cVarA.f37794a) * z.b.a(j9 > 0 ? j8 / j9 : 1.0f).f37792b) * cVarA.f37795b) / j9) * 1000.0f);
        }
        r rVar5 = (r) this.f146c;
        if (rVar5 != null) {
            return rVar5;
        }
        nk.k.k("velocityVector");
        throw null;
    }

    public e1 D(nk.e eVar, String str) {
        e1 e1Var;
        e1 e1VarA;
        nk.k.e(str, "key");
        synchronized (((ec.z) this.f147d)) {
            try {
                j1 j1Var = (j1) this.f148e;
                j1Var.getClass();
                e1Var = (e1) j1Var.f1157a.get(str);
                if (eVar.d(e1Var)) {
                    h1 h1Var = (h1) this.f145b;
                    if (h1Var instanceof androidx.lifecycle.b1) {
                        androidx.lifecycle.b1 b1Var = (androidx.lifecycle.b1) h1Var;
                        nk.k.b(e1Var);
                        androidx.lifecycle.t tVar = b1Var.f1104d;
                        if (tVar != null) {
                            yb.i iVar = b1Var.f1105e;
                            nk.k.b(iVar);
                            androidx.lifecycle.y0.a(e1Var, iVar, tVar);
                        }
                    }
                    nk.k.c(e1Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    h5.c cVar = new h5.c((h5.b) this.f146c);
                    cVar.f24880a.put(i1.f1150b, str);
                    h1 h1Var2 = (h1) this.f145b;
                    nk.k.e(h1Var2, "factory");
                    try {
                        try {
                            e1VarA = h1Var2.c(eVar, cVar);
                        } catch (AbstractMethodError unused) {
                            e1VarA = h1Var2.b(pk.a.h(eVar), cVar);
                        }
                    } catch (AbstractMethodError unused2) {
                        e1VarA = h1Var2.a(pk.a.h(eVar));
                    }
                    e1Var = e1VarA;
                    j1 j1Var2 = (j1) this.f148e;
                    j1Var2.getClass();
                    nk.k.e(e1Var, "viewModel");
                    e1 e1Var2 = (e1) j1Var2.f1157a.put(str, e1Var);
                    if (e1Var2 != null) {
                        e1Var2.b();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e1Var;
    }

    public void E(b1 b1Var) {
        b5.z zVar = b1Var.f1747c;
        String str = zVar.f1934f;
        HashMap map = (HashMap) this.f145b;
        if (map.get(str) != null) {
            return;
        }
        map.put(zVar.f1934f, b1Var);
        if (b5.u0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + zVar);
        }
    }

    public void F(b1 b1Var) {
        HashMap map = (HashMap) this.f145b;
        b5.z zVar = b1Var.f1747c;
        if (zVar.D) {
            ((b5.w0) this.f147d).h(zVar);
        }
        if (map.get(zVar.f1934f) == b1Var && ((b1) map.put(zVar.f1934f, null)) != null && b5.u0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + zVar);
        }
    }

    public boolean G(n.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f148e).onActionItemClicked(y(aVar), new o.t((Context) this.f145b, (y3.a) menuItem));
    }

    public boolean H(n.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f148e;
        n.e eVarY = y(aVar);
        x.n0 n0Var = (x.n0) this.f147d;
        Menu b0Var = (Menu) n0Var.get(menu);
        if (b0Var == null) {
            b0Var = new o.b0((Context) this.f145b, (o.m) menu);
            n0Var.put(menu, b0Var);
        }
        return callback.onCreateActionMode(eVarY, b0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [gl.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [gl.a] */
    /* JADX WARN: Type inference failed for: r1v6, types: [gl.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object J(ek.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p4.v0
            if (r0 == 0) goto L13
            r0 = r8
            p4.v0 r0 = (p4.v0) r0
            int r1 = r0.f31335e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31335e = r1
            goto L18
        L13:
            p4.v0 r0 = new p4.v0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f31333c
            int r1 = r0.f31335e
            r2 = 2
            r3 = 1
            yj.u r4 = yj.u.f37649a
            r5 = 0
            dk.a r6 = dk.a.f22275a
            if (r1 == 0) goto L43
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            gl.a r1 = r0.f31332b
            a0.x0 r0 = r0.f31331a
            ci.b.D(r8)     // Catch: java.lang.Throwable -> L31
            goto L80
        L31:
            r8 = move-exception
            goto L8b
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            gl.a r1 = r0.f31332b
            a0.x0 r3 = r0.f31331a
            ci.b.D(r8)
            goto L64
        L43:
            ci.b.D(r8)
            java.lang.Object r8 = r7.f145b
            xk.n r8 = (xk.n) r8
            boolean r8 = r8.R()
            if (r8 == 0) goto L51
            return r4
        L51:
            java.lang.Object r8 = r7.f148e
            gl.c r8 = (gl.c) r8
            r0.f31331a = r7
            r0.f31332b = r8
            r0.f31335e = r3
            java.lang.Object r1 = r8.c(r0)
            if (r1 != r6) goto L62
            goto L7e
        L62:
            r3 = r7
            r1 = r8
        L64:
            java.lang.Object r8 = r3.f145b     // Catch: java.lang.Throwable -> L31
            xk.n r8 = (xk.n) r8     // Catch: java.lang.Throwable -> L31
            boolean r8 = r8.R()     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L72
            r1.e(r5)
            return r4
        L72:
            r0.f31331a = r3     // Catch: java.lang.Throwable -> L31
            r0.f31332b = r1     // Catch: java.lang.Throwable -> L31
            r0.f31335e = r2     // Catch: java.lang.Throwable -> L31
            java.lang.Object r8 = r3.t(r0)     // Catch: java.lang.Throwable -> L31
            if (r8 != r6) goto L7f
        L7e:
            return r6
        L7f:
            r0 = r3
        L80:
            java.lang.Object r8 = r0.f145b     // Catch: java.lang.Throwable -> L31
            xk.n r8 = (xk.n) r8     // Catch: java.lang.Throwable -> L31
            r8.T(r4)     // Catch: java.lang.Throwable -> L31
            r1.e(r5)
            return r4
        L8b:
            r1.e(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.x0.J(ek.c):java.lang.Object");
    }

    public Bundle K(Bundle bundle, String str) {
        HashMap map = (HashMap) this.f146c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public void L(c2.j jVar) {
        if (((c2.v) this.f145b) == c2.v.f2689b) {
            g2.v vVar = (g2.v) this.f148e;
            if (vVar == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            c2.h0.g(jVar, vVar.E(0L), new c2.x((c2.y) this.f147d, 1), true);
        }
        this.f145b = c2.v.f2690c;
    }

    public x0 M() {
        return new x0((com.google.android.gms.internal.consent_sdk.v0) ((h7) this.f148e).a(), ((com.google.android.gms.internal.consent_sdk.g) this.f145b).a(), (com.google.android.gms.internal.consent_sdk.h) ((h7) this.f146c).a(), (com.google.android.gms.internal.consent_sdk.e0) ((h7) this.f147d).a(), 9);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle N() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.x0.N():android.os.Bundle");
    }

    public com.google.android.gms.internal.measurement.n O(x0 x0Var, w3... w3VarArr) {
        com.google.android.gms.internal.measurement.n nVarG = com.google.android.gms.internal.measurement.n.J8;
        for (w3 w3Var : w3VarArr) {
            nVarG = com.bumptech.glide.d.G(w3Var);
            com.bumptech.glide.c.F((x0) this.f146c);
            if ((nVarG instanceof com.google.android.gms.internal.measurement.o) || (nVarG instanceof com.google.android.gms.internal.measurement.m)) {
                nVarG = ((com.google.android.gms.internal.measurement.t) this.f148e).c(x0Var, nVarG);
            }
        }
        return nVarG;
    }

    public com.google.android.gms.internal.measurement.n P(com.google.android.gms.internal.measurement.n nVar) {
        return ((com.google.android.gms.internal.measurement.t) this.f145b).c(this, nVar);
    }

    public com.google.android.gms.internal.consent_sdk.a Q(com.google.android.gms.internal.consent_sdk.c0 c0Var) throws r1 {
        ConsentInformation.PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus;
        String str;
        String str2;
        com.google.android.gms.internal.consent_sdk.h hVar = (com.google.android.gms.internal.consent_sdk.h) this.f146c;
        com.google.android.gms.internal.consent_sdk.e0 e0Var = (com.google.android.gms.internal.consent_sdk.e0) this.f147d;
        int i4 = c0Var.g;
        hVar.f19367b.edit().putBoolean("is_pub_misconfigured", i4 == 8).commit();
        int i10 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        int i11 = 3;
        switch (i10) {
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                i11 = 2;
                break;
            case 5:
                i11 = 1;
                break;
            case 6:
                throw new r1(1, "Invalid response from server: ".concat(String.valueOf(c0Var.f19287c)));
            case 7:
                throw new r1(3, "Publisher misconfiguration: ".concat(String.valueOf(c0Var.f19287c)));
            default:
                throw new r1(1, "Invalid response from server.");
        }
        int i12 = c0Var.f19291h;
        int i13 = i12 - 1;
        if (i12 == 0) {
            throw null;
        }
        if (i13 == 1) {
            privacyOptionsRequirementStatus = ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED;
        } else {
            if (i13 != 2) {
                throw new r1(1, "Invalid response from server.");
            }
            privacyOptionsRequirementStatus = ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED;
        }
        String str3 = c0Var.f19285a;
        com.google.android.gms.internal.consent_sdk.r rVar = str3 == null ? null : new com.google.android.gms.internal.consent_sdk.r(c0Var.f19286b, str3);
        e0Var.f19323a.set(c0Var.f19290f);
        hVar.f19367b.edit().putStringSet("stored_info", new HashSet(c0Var.f19288d)).commit();
        for (com.google.android.gms.internal.consent_sdk.b0 b0Var : c0Var.f19289e) {
            int i14 = b0Var.f19268b;
            int i15 = i14 - 1;
            if (i14 == 0) {
                throw null;
            }
            if (i15 != 0) {
                if (i15 == 1) {
                    str2 = "write";
                } else {
                    if (i15 != 2) {
                        throw new RuntimeException(null, null);
                    }
                    str2 = "clear";
                }
                str = str2;
            } else {
                str = null;
            }
            if (str != null) {
                com.google.android.gms.internal.consent_sdk.v0 v0Var = (com.google.android.gms.internal.consent_sdk.v0) this.f148e;
                String str4 = b0Var.f19267a;
                com.google.android.gms.internal.consent_sdk.k0[] k0VarArr = {(x0) this.f145b};
                v0Var.getClass();
                v0Var.f19542a.execute(new b4.o(str, str4, k0VarArr, false, 2));
            }
        }
        return new com.google.android.gms.internal.consent_sdk.a(i11, privacyOptionsRequirementStatus, rVar);
    }

    public com.google.android.gms.internal.measurement.n R(com.google.android.gms.internal.measurement.d dVar) {
        com.google.android.gms.internal.measurement.n nVarC = com.google.android.gms.internal.measurement.n.J8;
        Iterator itL = dVar.l();
        while (itL.hasNext()) {
            nVarC = ((com.google.android.gms.internal.measurement.t) this.f145b).c(this, dVar.o(((Integer) itL.next()).intValue()));
            if (nVarC instanceof com.google.android.gms.internal.measurement.f) {
                break;
            }
        }
        return nVarC;
    }

    public void S(Bundle bundle) {
        String str = (String) this.f148e;
        ec.b1 b1Var = (ec.b1) this.f147d;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesF = b1Var.F();
        o1 o1Var = (o1) b1Var.f218b;
        SharedPreferences.Editor editorEdit = sharedPreferencesF.edit();
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
                        p8.a();
                        if (o1Var.f22952d.L(null, ec.d0.R0)) {
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
                                ec.s0 s0Var = o1Var.f22954f;
                                o1.m(s0Var);
                                s0Var.g.e(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
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
                                ec.s0 s0Var2 = o1Var.f22954f;
                                o1.m(s0Var2);
                                s0Var2.g.e(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e2) {
                        ec.s0 s0Var3 = o1Var.f22954f;
                        o1.m(s0Var3);
                        s0Var3.g.e(e2, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f146c = bundle2;
    }

    public x0 T() {
        return new x0(this, (com.google.android.gms.internal.measurement.t) this.f145b);
    }

    public boolean U(String str) {
        if (((HashMap) this.f146c).containsKey(str)) {
            return true;
        }
        x0 x0Var = (x0) this.f148e;
        if (x0Var != null) {
            return x0Var.U(str);
        }
        return false;
    }

    public void V(String str, com.google.android.gms.internal.measurement.n nVar) {
        x0 x0Var;
        HashMap map = (HashMap) this.f146c;
        if (!map.containsKey(str) && (x0Var = (x0) this.f148e) != null && x0Var.U(str)) {
            x0Var.V(str, nVar);
        } else {
            if (((HashMap) this.f147d).containsKey(str)) {
                return;
            }
            if (nVar == null) {
                map.remove(str);
            } else {
                map.put(str, nVar);
            }
        }
    }

    public void W(String str, com.google.android.gms.internal.measurement.n nVar) {
        HashMap map = (HashMap) this.f146c;
        if (((HashMap) this.f147d).containsKey(str)) {
            return;
        }
        if (nVar == null) {
            map.remove(str);
        } else {
            map.put(str, nVar);
        }
    }

    public com.google.android.gms.internal.measurement.n X(String str) {
        HashMap map = (HashMap) this.f146c;
        if (map.containsKey(str)) {
            return (com.google.android.gms.internal.measurement.n) map.get(str);
        }
        x0 x0Var = (x0) this.f148e;
        if (x0Var != null) {
            return x0Var.X(str);
        }
        throw new IllegalArgumentException(d.h.s(str, " is not defined"));
    }

    @Override // com.google.android.gms.internal.consent_sdk.j7
    public /* bridge */ /* synthetic */ Object a() {
        switch (this.f144a) {
            case 5:
                return M();
            default:
                return new d3((com.google.android.gms.internal.consent_sdk.h) ((h7) this.f148e).a(), ((xz) this.f145b).a(), (com.google.android.gms.internal.consent_sdk.q) ((h7) this.f146c).a(), (com.google.android.gms.internal.consent_sdk.e0) ((h7) this.f147d).a());
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.k0
    public Executor b() {
        return (Executor) this.f147d;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x0215. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x030a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0262  */
    @Override // com.google.android.gms.internal.consent_sdk.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(java.lang.String r21, org.json.JSONObject r22) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.x0.c(java.lang.String, org.json.JSONObject):boolean");
    }

    @Override // hm.v
    public hm.w e() {
        return (im.d) this.f146c;
    }

    @Override // si.i
    public void f() {
        bh.w wVar = (bh.w) this.f146c;
        wVar.f2254n = null;
        r5.c.t(false, wVar.f2244b);
        wVar.f2246d.h(hg.e.e(R.string.current_unsupport_huawei_iap));
    }

    @Override // a0.v0
    public long g(r rVar, r rVar2, r rVar3) {
        int iB = rVar.b();
        long jMax = 0;
        for (int i4 = 0; i4 < iB; i4++) {
            jMax = Math.max(jMax, ((s) this.f148e).get(i4).b(rVar.a(i4), rVar2.a(i4), rVar3.a(i4)));
        }
        return jMax;
    }

    @Override // xj.a
    public Object get() {
        switch (this.f144a) {
            case 20:
                return new x0((Executor) ((xj.a) this.f148e).get(), (la.d) ((xj.a) this.f145b).get(), (i0.f) ((i0.f) this.f146c).get(), (ma.c) ((xj.a) this.f147d).get(), 19);
            default:
                return new pf.o((wd.f) ((rf.c) this.f148e).f32941a, (sf.j) ((xj.a) this.f145b).get(), (ck.h) ((xj.a) this.f146c).get(), (pf.x0) ((rf.d) this.f147d).get());
        }
    }

    public void h(b5.z zVar) {
        if (((ArrayList) this.f148e).contains(zVar)) {
            throw new IllegalStateException("Fragment already added: " + zVar);
        }
        synchronized (((ArrayList) this.f148e)) {
            ((ArrayList) this.f148e).add(zVar);
        }
        zVar.f1938l = true;
    }

    public void i(k5.d dVar) {
        if (((LinkedHashSet) this.f147d).add(dVar)) {
            ((k5.e) this.f145b).a(this, dVar, -1);
        }
    }

    @Override // a0.v0
    public r j(long j, r rVar, r rVar2, r rVar3) {
        if (((r) this.f146c) == null) {
            this.f146c = rVar3.c();
        }
        r rVar4 = (r) this.f146c;
        if (rVar4 == null) {
            nk.k.k("velocityVector");
            throw null;
        }
        int iB = rVar4.b();
        for (int i4 = 0; i4 < iB; i4++) {
            r rVar5 = (r) this.f146c;
            if (rVar5 == null) {
                nk.k.k("velocityVector");
                throw null;
            }
            rVar5.e(i4, ((s) this.f148e).get(i4).a(j, rVar.a(i4), rVar2.a(i4), rVar3.a(i4)));
        }
        r rVar6 = (r) this.f146c;
        if (rVar6 != null) {
            return rVar6;
        }
        nk.k.k("velocityVector");
        throw null;
    }

    public void k(k5.j jVar, int i4) {
        if (i4 != 1 && i4 != 0) {
            throw new IllegalArgumentException(je.u.r(i4, "Unsupported priority value: ").toString());
        }
        if (((LinkedHashSet) this.f147d).add(jVar)) {
            ((k5.e) this.f145b).a(this, jVar, i4);
        }
    }

    public synchronized void l() {
        if (!((LinkedHashSet) this.f148e).isEmpty()) {
            ((lf.j) this.f145b).e(0L);
        }
    }

    public void m(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((x.n0) this.f145b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                m(arrayList2.get(i4), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void n(k5.d dVar, k5.b bVar) {
        k5.e eVar = (k5.e) this.f145b;
        eVar.getClass();
        if (eVar.g != 0) {
            return;
        }
        d.y yVarC = eVar.c(-1);
        eVar.f27946f = yVarC;
        eVar.g = -1;
        eVar.f27947h = dVar;
        if (bVar != null) {
            if (yVarC != null) {
                b5.u0 u0Var = (b5.u0) yVarC.f21643d.f1823d;
                if (b5.u0.K(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + u0Var);
                }
                u0Var.w();
                u0Var.x(new b5.t0(u0Var), false);
            }
            al.i1 i1Var = eVar.f27941a;
            k5.g gVar = new k5.g(bVar);
            i1Var.getClass();
            i1Var.j(null, gVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public void o(c2.j jVar, boolean z3) {
        c2.y yVar = (c2.y) this.f147d;
        ?? r12 = jVar.f2626a;
        int size = r12.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((c2.p) r12.get(i4)).b()) {
                L(jVar);
                return;
            }
        }
        g2.v vVar = (g2.v) this.f148e;
        if (vVar == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        c2.h0.g(jVar, vVar.E(0L), new c2.w(0, this, yVar), false);
        if (((c2.v) this.f145b) == c2.v.f2689b) {
            if (z3) {
                int size2 = r12.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((c2.p) r12.get(i10)).a();
                }
            }
            i4 i4Var = jVar.f2627b;
            if (i4Var != null) {
                i4Var.f19781b = !yVar.f2699c;
            }
        }
    }

    @Override // si.i
    public void p() {
        ((ah.o) this.f148e).d(fi.a.f24058a, new si.f(((Sku) this.f145b).getHwpaySkuId()), 0, new yb.i((bh.w) this.f146c, false, (WeakReference) this.f147d, 9));
    }

    @Override // a0.v0
    public r q(r rVar, r rVar2, r rVar3) {
        if (((r) this.f147d) == null) {
            this.f147d = rVar3.c();
        }
        r rVar4 = (r) this.f147d;
        if (rVar4 == null) {
            nk.k.k("endVelocityVector");
            throw null;
        }
        int iB = rVar4.b();
        for (int i4 = 0; i4 < iB; i4++) {
            r rVar5 = (r) this.f147d;
            if (rVar5 == null) {
                nk.k.k("endVelocityVector");
                throw null;
            }
            rVar5.e(i4, ((s) this.f148e).get(i4).d(rVar.a(i4), rVar2.a(i4), rVar3.a(i4)));
        }
        r rVar6 = (r) this.f147d;
        if (rVar6 != null) {
            return rVar6;
        }
        nk.k.k("endVelocityVector");
        throw null;
    }

    @Override // a0.v0
    public r r(long j, r rVar, r rVar2, r rVar3) {
        if (((r) this.f145b) == null) {
            this.f145b = rVar.c();
        }
        r rVar4 = (r) this.f145b;
        if (rVar4 == null) {
            nk.k.k("valueVector");
            throw null;
        }
        int iB = rVar4.b();
        for (int i4 = 0; i4 < iB; i4++) {
            r rVar5 = (r) this.f145b;
            if (rVar5 == null) {
                nk.k.k("valueVector");
                throw null;
            }
            rVar5.e(i4, ((s) this.f148e).get(i4).e(j, rVar.a(i4), rVar2.a(i4), rVar3.a(i4)));
        }
        r rVar6 = (r) this.f145b;
        if (rVar6 != null) {
            return rVar6;
        }
        nk.k.k("valueVector");
        throw null;
    }

    @Override // hm.v
    public hm.u s() {
        return (im.c) this.f147d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object t(ek.c r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f147d
            p4.z r0 = (p4.z) r0
            boolean r1 = r7 instanceof p4.h
            if (r1 == 0) goto L17
            r1 = r7
            p4.h r1 = (p4.h) r1
            int r2 = r1.f31216d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f31216d = r2
            goto L1c
        L17:
            p4.h r1 = new p4.h
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.f31214b
            int r2 = r1.f31216d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            a0.x0 r0 = r1.f31213a
            ci.b.D(r7)
            goto L64
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            a0.x0 r0 = r1.f31213a
            ci.b.D(r7)
            goto L74
        L3c:
            ci.b.D(r7)
            java.lang.Object r7 = r6.f146c
            java.util.List r7 = (java.util.List) r7
            dk.a r2 = dk.a.f22275a
            if (r7 == 0) goto L67
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L67
        L4e:
            p4.k0 r7 = r0.g()
            p4.k r4 = new p4.k
            r5 = 0
            r4.<init>(r0, r6, r5)
            r1.f31213a = r6
            r1.f31216d = r3
            java.lang.Object r7 = r7.c(r4, r1)
            if (r7 != r2) goto L63
            goto L72
        L63:
            r0 = r6
        L64:
            p4.d r7 = (p4.d) r7
            goto L76
        L67:
            r1.f31213a = r6
            r1.f31216d = r4
            r7 = 0
            java.lang.Object r7 = p4.z.f(r0, r7, r1)
            if (r7 != r2) goto L73
        L72:
            return r2
        L73:
            r0 = r6
        L74:
            p4.d r7 = (p4.d) r7
        L76:
            java.lang.Object r0 = r0.f147d
            p4.z r0 = (p4.z) r0
            km.y r0 = r0.f31364h
            r0.C(r7)
            yj.u r7 = yj.u.f37649a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.x0.t(ek.c):java.lang.Object");
    }

    public String toString() {
        switch (this.f144a) {
            case 16:
                String string = ((Socket) this.f148e).toString();
                nk.k.d(string, "toString(...)");
                return string;
            default:
                return super.toString();
        }
    }

    public synchronized ExecutorService u() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f148e) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = sl.h.f33838b + " Dispatcher";
                nk.k.e(str, "name");
                this.f148e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new sl.g(false, 0, str));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f148e;
            nk.k.b(threadPoolExecutor);
        } catch (Throwable th2) {
            throw th2;
        }
        return threadPoolExecutor;
    }

    public b5.z v(String str) {
        b1 b1Var = (b1) ((HashMap) this.f145b).get(str);
        if (b1Var != null) {
            return b1Var.f1747c;
        }
        return null;
    }

    public vl.j w(String str) {
        Iterator it = ((ArrayDeque) this.f146c).iterator();
        nk.k.d(it, "iterator(...)");
        while (it.hasNext()) {
            vl.j jVar = (vl.j) it.next();
            if (nk.k.a(((rl.n) jVar.f36329c.f36333b.f36146b).f33116d, str)) {
                return jVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f145b).iterator();
        nk.k.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            vl.j jVar2 = (vl.j) it2.next();
            if (nk.k.a(((rl.n) jVar2.f36329c.f36333b.f36146b).f33116d, str)) {
                return jVar2;
            }
        }
        return null;
    }

    public b5.z x(String str) {
        for (b1 b1Var : ((HashMap) this.f145b).values()) {
            if (b1Var != null) {
                b5.z zVarX = b1Var.f1747c;
                if (!str.equals(zVarX.f1934f)) {
                    zVarX = zVarX.f1949w.f1879c.x(str);
                }
                if (zVarX != null) {
                    return zVarX;
                }
            }
        }
        return null;
    }

    public n.e y(n.a aVar) {
        ArrayList arrayList = (ArrayList) this.f146c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            n.e eVar = (n.e) arrayList.get(i4);
            if (eVar != null && eVar.f29453b == aVar) {
                return eVar;
            }
        }
        n.e eVar2 = new n.e((Context) this.f145b, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList z() {
        ArrayList arrayList = new ArrayList();
        for (b1 b1Var : ((HashMap) this.f145b).values()) {
            if (b1Var != null) {
                arrayList.add(b1Var);
            }
        }
        return arrayList;
    }

    public /* synthetic */ x0(int i4, boolean z3) {
        this.f144a = i4;
    }

    public /* synthetic */ x0(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f144a = i4;
        this.f148e = obj;
        this.f145b = obj2;
        this.f146c = obj3;
        this.f147d = obj4;
    }

    public x0(x0 x0Var, com.google.android.gms.internal.measurement.t tVar) {
        this.f144a = 11;
        this.f146c = new HashMap();
        this.f147d = new HashMap();
        this.f148e = x0Var;
        this.f145b = tVar;
    }

    public x0(ec.b1 b1Var, String str) {
        this.f144a = 13;
        this.f147d = b1Var;
        pb.y.e(str);
        this.f148e = str;
        this.f145b = new Bundle();
    }

    public x0(xk.v vVar, c2.l0 l0Var, al.p pVar) {
        this.f144a = 26;
        this.f148e = vVar;
        this.f145b = pVar;
        this.f146c = com.bumptech.glide.e.f(Integer.MAX_VALUE, 6, null);
        this.f147d = new o.e((byte) 0, 3);
        xk.y0 y0Var = (xk.y0) vVar.A().O(xk.s.f37235b);
        if (y0Var != null) {
            y0Var.m(new c2.w(14, l0Var, this));
        }
    }

    public x0(j1 j1Var, h1 h1Var, h5.b bVar) {
        this.f144a = 15;
        nk.k.e(j1Var, "store");
        nk.k.e(h1Var, "factory");
        nk.k.e(bVar, "defaultExtras");
        this.f148e = j1Var;
        this.f145b = h1Var;
        this.f146c = bVar;
        this.f147d = new ec.z(29);
    }

    public x0(int i4) {
        this.f144a = i4;
        switch (i4) {
            case 10:
                com.google.android.gms.internal.measurement.t tVar = new com.google.android.gms.internal.measurement.t(0);
                this.f148e = tVar;
                x0 x0Var = new x0((x0) null, tVar);
                this.f146c = x0Var;
                this.f145b = x0Var.T();
                v5 v5Var = new v5(1);
                this.f147d = v5Var;
                x0Var.V("require", new u9(v5Var));
                ((HashMap) v5Var.f19970a).put("internal.platform", d1.f19658a);
                x0Var.V("runtime.counter", new com.google.android.gms.internal.measurement.g(Double.valueOf(0.0d)));
                break;
            case 17:
                this.f148e = new x.e(0);
                this.f145b = new SparseArray();
                this.f146c = new x.o((Object) null);
                this.f147d = new x.e(0);
                break;
            case 24:
                this.f148e = new d4.d(10);
                this.f145b = new x.n0(0);
                this.f146c = new ArrayList();
                this.f147d = new HashSet();
                break;
            case 29:
                this.f145b = new ArrayDeque();
                this.f146c = new ArrayDeque();
                this.f147d = new ArrayDeque();
                break;
            default:
                this.f148e = new ArrayList();
                this.f145b = new HashMap();
                this.f146c = new HashMap();
                break;
        }
    }

    @Override // a0.v0
    public /* synthetic */ void d() {
    }

    public x0(Socket socket) {
        this.f144a = 16;
        this.f148e = socket;
        this.f145b = new AtomicInteger();
        this.f146c = new im.d(this);
        this.f147d = new im.c(this);
    }

    public x0(ExecutorService executorService) {
        this.f144a = 12;
        this.f146c = new Handler(Looper.getMainLooper());
        this.f147d = new d7.b(0, this);
        c7.l lVar = new c7.l(executorService, 0);
        this.f148e = lVar;
        this.f145b = xk.x.l(lVar);
    }

    public x0(c2.y yVar) {
        this.f144a = 4;
        this.f147d = yVar;
        this.f145b = c2.v.f2688a;
    }

    public x0(wd.f fVar, df.d dVar, lf.g gVar, lf.b bVar, Context context, lf.l lVar, ScheduledExecutorService scheduledExecutorService) {
        this.f144a = 21;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f148e = linkedHashSet;
        this.f145b = new lf.j(fVar, dVar, gVar, bVar, context, linkedHashSet, lVar, scheduledExecutorService);
        this.f146c = context;
        this.f147d = scheduledExecutorService;
    }

    public x0(ca.b bVar) {
        this.f144a = 18;
        this.f148e = bVar;
        this.f145b = new k5.e();
        new LinkedHashSet();
        this.f146c = new LinkedHashSet();
        this.f147d = new LinkedHashSet();
    }

    public x0(Context context, ActionMode.Callback callback) {
        this.f144a = 23;
        this.f145b = context;
        this.f148e = callback;
        this.f146c = new ArrayList();
        this.f147d = new x.n0(0);
    }

    public x0(p4.z zVar, List list) {
        this.f144a = 25;
        this.f147d = zVar;
        this.f148e = gl.d.a();
        this.f145b = xk.x.a();
        this.f146c = zj.n.r0(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x0(a0 a0Var) {
        this(0, new o7.d(1, a0Var));
        this.f144a = 0;
    }
}
