package yb;

import a0.x0;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import androidx.lifecycle.a0;
import androidx.lifecycle.j1;
import androidx.lifecycle.k1;
import androidx.lifecycle.l0;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.e2;
import b5.u0;
import b5.z;
import bh.w;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.r9;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.AccountProActivity;
import e4.c1;
import e4.k0;
import e4.v0;
import ec.b1;
import ec.d0;
import ec.f2;
import ec.o1;
import ec.q2;
import ec.s0;
import ec.v3;
import f1.k;
import g1.r;
import g2.a1;
import g2.f0;
import g2.x;
import g2.z0;
import g8.n;
import i.v;
import i2.e0;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import km.y;
import o.b0;
import o.m;
import u0.f1;
import x.i0;
import x.n0;
import x.o0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i implements AppSetIdClient, si.g, si.e, k, ga.b, z0, n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37515a;

    /* renamed from: b, reason: collision with root package name */
    public Object f37516b;

    /* renamed from: c, reason: collision with root package name */
    public Object f37517c;

    public /* synthetic */ i(int i4, Object obj, Object obj2) {
        this.f37515a = i4;
        this.f37517c = obj;
        this.f37516b = obj2;
    }

    public static i E(a0 a0Var) {
        return new i(a0Var, ((k1) a0Var).e());
    }

    public void A(z zVar, boolean z3) {
        nk.k.e(zVar, "f");
        z zVar2 = ((u0) this.f37516b).f1900z;
        if (zVar2 != null) {
            zVar2.s().f1890p.A(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f37517c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void B(String str, PrintWriter printWriter) {
        o0 o0Var = ((j5.a) this.f37517c).f27397b;
        if (o0Var.f36927c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (o0Var.f36927c <= 0) {
                return;
            }
            if (o0Var.f(0) != null) {
                throw new ClassCastException();
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(o0Var.f36925a[0]);
            printWriter.print(": ");
            throw null;
        }
    }

    public void C(int i4) {
        int[] iArr = (int[]) this.f37516b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i4, 10) + 1];
            this.f37516b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int length = iArr.length;
            while (length <= i4) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f37516b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f37516b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public Object D(a8.i iVar) {
        HashMap map = (HashMap) this.f37517c;
        a8.d dVar = (a8.d) map.get(iVar);
        if (dVar == null) {
            dVar = new a8.d(iVar);
            map.put(iVar, dVar);
        } else {
            iVar.a();
        }
        a8.d dVar2 = dVar.f223d;
        dVar2.f222c = dVar.f222c;
        dVar.f222c.f223d = dVar2;
        a8.d dVar3 = (a8.d) this.f37516b;
        dVar.f223d = dVar3;
        a8.d dVar4 = dVar3.f222c;
        dVar.f222c = dVar4;
        dVar4.f223d = dVar;
        dVar.f223d.f222c = dVar;
        ArrayList arrayList = dVar.f221b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return dVar.f221b.remove(size - 1);
        }
        return null;
    }

    public x F() {
        f0 f0Var = (f0) this.f37516b;
        e0 e0Var = (e0) f0Var.j.g(this.f37517c);
        if (e0Var != null) {
            return (x) f0Var.f24334f.g(e0Var);
        }
        return null;
    }

    public String G(x7.e eVar) {
        String strJ;
        synchronized (((r9) this.f37516b)) {
            strJ = (String) ((r9) this.f37516b).a(eVar);
        }
        if (strJ == null) {
            strJ = j(eVar);
        }
        synchronized (((r9) this.f37516b)) {
            ((r9) this.f37516b).f(eVar, strJ);
        }
        return strJ;
    }

    public a6.d H() {
        a6.d dVar;
        c6.a aVar = (c6.a) this.f37516b;
        synchronized (aVar.f2764c) {
            Iterator it = aVar.f2765d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                a6.d dVar2 = (a6.d) entry.getValue();
                if (nk.k.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public void I(int i4, int i10) {
        int[] iArr = (int[]) this.f37516b;
        if (iArr == null || i4 >= iArr.length) {
            return;
        }
        int i11 = i4 + i10;
        C(i11);
        int[] iArr2 = (int[]) this.f37516b;
        System.arraycopy(iArr2, i4, iArr2, i11, (iArr2.length - i4) - i10);
        Arrays.fill((int[]) this.f37516b, i4, i11, -1);
        ArrayList arrayList = (ArrayList) this.f37517c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e2 e2Var = (e2) ((ArrayList) this.f37517c).get(size);
            int i12 = e2Var.f1345a;
            if (i12 >= i4) {
                e2Var.f1345a = i12 + i10;
            }
        }
    }

    public void J(int i4, int i10) {
        int[] iArr = (int[]) this.f37516b;
        if (iArr == null || i4 >= iArr.length) {
            return;
        }
        int i11 = i4 + i10;
        C(i11);
        int[] iArr2 = (int[]) this.f37516b;
        System.arraycopy(iArr2, i11, iArr2, i4, (iArr2.length - i4) - i10);
        int[] iArr3 = (int[]) this.f37516b;
        Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f37517c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e2 e2Var = (e2) ((ArrayList) this.f37517c).get(size);
            int i12 = e2Var.f1345a;
            if (i12 >= i4) {
                if (i12 < i11) {
                    ((ArrayList) this.f37517c).remove(size);
                } else {
                    e2Var.f1345a = i12 - i10;
                }
            }
        }
    }

    public void K(n.a aVar) {
        x0 x0Var = (x0) this.f37516b;
        ((ActionMode.Callback) x0Var.f148e).onDestroyActionMode(x0Var.y(aVar));
        v vVar = (v) this.f37517c;
        if (vVar.f25386w != null) {
            vVar.f25375l.getDecorView().removeCallbacks(vVar.f25387x);
        }
        if (vVar.f25385v != null) {
            c1 c1Var = vVar.f25388y;
            if (c1Var != null) {
                c1Var.b();
            }
            c1 c1VarB = v0.b(vVar.f25385v);
            c1VarB.a(0.0f);
            vVar.f25388y = c1VarB;
            c1VarB.d(new i.n(2, this));
        }
        vVar.f25384u = null;
        ViewGroup viewGroup = vVar.A;
        WeakHashMap weakHashMap = v0.f22405a;
        k0.c(viewGroup);
        vVar.K();
    }

    public void L(Throwable th2) {
        v3 v3Var = (v3) this.f37516b;
        q2 q2Var = (q2) this.f37517c;
        q2Var.B();
        q2Var.j = false;
        o1 o1Var = (o1) q2Var.f218b;
        ec.g gVar = o1Var.f22952d;
        s0 s0Var = o1Var.f22954f;
        int i4 = 2;
        if (gVar.L(null, d0.U0)) {
            String message = th2.getMessage();
            q2Var.f23018o = false;
            if (message != null) {
                if ((th2 instanceof IllegalStateException) || message.contains("garbage collected") || th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if (message.contains("Background")) {
                        q2Var.f23018o = true;
                    }
                    i4 = 1;
                } else if ((th2 instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    i4 = 3;
                }
            }
        }
        int i10 = i4 - 1;
        if (i10 == 0) {
            o1.m(s0Var);
            s0Var.j.f(s0.J(o1Var.r().H()), s0.J(th2.toString()), "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable");
            q2Var.f23014k = 1;
            q2Var.Z().add(v3Var);
            return;
        }
        if (i10 != 1) {
            o1.m(s0Var);
            s0Var.g.f(s0.J(o1Var.r().H()), th2, "registerTriggerAsync failed. Dropping URI. App ID, Throwable");
            T();
            q2Var.f23014k = 1;
            q2Var.a0();
            return;
        }
        q2Var.Z().add(v3Var);
        if (q2Var.f23014k > ((Integer) d0.f22673x0.a(null)).intValue()) {
            q2Var.f23014k = 1;
            o1.m(s0Var);
            s0Var.j.f(s0.J(o1Var.r().H()), s0.J(th2.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        o1.m(s0Var);
        s0Var.j.g("registerTriggerAsync failed. App ID, delay in seconds, throwable", s0.J(o1Var.r().H()), s0.J(String.valueOf(q2Var.f23014k)), s0.J(th2.toString()));
        int i11 = q2Var.f23014k;
        if (q2Var.f23015l == null) {
            q2Var.f23015l = new f2(q2Var, o1Var, 1);
        }
        q2Var.f23015l.b(i11 * 1000);
        int i12 = q2Var.f23014k;
        q2Var.f23014k = i12 + i12;
    }

    public boolean M(n.a aVar, Menu menu) {
        ViewGroup viewGroup = ((v) this.f37517c).A;
        WeakHashMap weakHashMap = v0.f22405a;
        k0.c(viewGroup);
        x0 x0Var = (x0) this.f37516b;
        ActionMode.Callback callback = (ActionMode.Callback) x0Var.f148e;
        n.e eVarY = x0Var.y(aVar);
        n0 n0Var = (n0) x0Var.f147d;
        Menu b0Var = (Menu) n0Var.get(menu);
        if (b0Var == null) {
            b0Var = new b0((Context) x0Var.f145b, (m) menu);
            n0Var.put(menu, b0Var);
        }
        return callback.onPrepareActionMode(eVarY, b0Var);
    }

    public void N(b4.i iVar) {
        b4.n nVar = (b4.n) this.f37517c;
        y yVar = (y) this.f37516b;
        int i4 = iVar.f1689b;
        if (i4 != 0) {
            nVar.execute(new b4.a(yVar, i4, 0));
        } else {
            nVar.execute(new vd.a(2, yVar, iVar.f1688a));
        }
    }

    public void O(a8.i iVar, Object obj) {
        HashMap map = (HashMap) this.f37517c;
        a8.d dVar = (a8.d) map.get(iVar);
        if (dVar == null) {
            dVar = new a8.d(iVar);
            dVar.f223d = dVar;
            a8.d dVar2 = (a8.d) this.f37516b;
            dVar.f223d = dVar2.f223d;
            dVar.f222c = dVar2;
            dVar2.f223d = dVar;
            dVar.f223d.f222c = dVar;
            map.put(iVar, dVar);
        } else {
            iVar.a();
        }
        if (dVar.f221b == null) {
            dVar.f221b = new ArrayList();
        }
        dVar.f221b.add(obj);
    }

    public void P(String str, a6.d dVar) {
        nk.k.e(dVar, "provider");
        c6.a aVar = (c6.a) this.f37516b;
        synchronized (aVar.f2764c) {
            if (aVar.f2765d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            aVar.f2765d.put(str, dVar);
        }
    }

    public Object Q() {
        a8.d dVar = (a8.d) this.f37516b;
        a8.d dVar2 = dVar.f223d;
        while (true) {
            boolean zEquals = dVar2.equals(dVar);
            Object obj = dVar2.f220a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = dVar2.f221b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? dVar2.f221b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            a8.d dVar3 = dVar2.f223d;
            dVar3.f222c = dVar2.f222c;
            dVar2.f222c.f223d = dVar3;
            ((HashMap) this.f37517c).remove(obj);
            ((a8.i) obj).a();
            dVar2 = dVar2.f223d;
        }
    }

    public void R() throws NoSuchMethodException, SecurityException {
        if (!((c6.a) this.f37516b).f2768h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a6.a aVar = (a6.a) this.f37517c;
        if (aVar == null) {
            aVar = new a6.a(this);
        }
        this.f37517c = aVar;
        try {
            o.class.getDeclaredConstructor(null);
            a6.a aVar2 = (a6.a) this.f37517c;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f203b).add(o.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + o.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public void S(boolean z3, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f37516b)) {
            map = new HashMap((Map) this.f37516b);
        }
        synchronized (((Map) this.f37517c)) {
            map2 = new HashMap((Map) this.f37517c);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z3 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z3 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ob.d(status));
            }
        }
    }

    public void T() {
        o1 o1Var = (o1) ((q2) this.f37517c).f218b;
        b1 b1Var = o1Var.f22953e;
        o1.k(b1Var);
        SparseArray sparseArrayH = b1Var.H();
        v3 v3Var = (v3) this.f37516b;
        sparseArrayH.put(v3Var.f23103c, Long.valueOf(v3Var.f23102b));
        b1 b1Var2 = o1Var.f22953e;
        o1.k(b1Var2);
        int[] iArr = new int[sparseArrayH.size()];
        long[] jArr = new long[sparseArrayH.size()];
        for (int i4 = 0; i4 < sparseArrayH.size(); i4++) {
            iArr[i4] = sparseArrayH.keyAt(i4);
            jArr[i4] = ((Long) sparseArrayH.valueAt(i4)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        b1Var2.f22566o.S(bundle);
    }

    @Override // si.e
    public void a(km.o oVar) {
        w wVar = (w) this.f37516b;
        l0 l0Var = wVar.f2244b;
        if (((AccountProActivity) ((WeakReference) this.f37517c).get()) != null) {
            r5.c.t(false, l0Var);
        } else {
            wVar.f2254n = null;
            r5.c.t(false, l0Var);
        }
    }

    @Override // g2.z0
    public a1 apply() {
        f0 f0Var = (f0) this.f37516b;
        x xVarF = F();
        if (xVarF != null) {
            f0Var.d(xVarF, false);
        }
        return f0Var.f(this.f37517c);
    }

    @Override // g2.z0
    public boolean b() {
        f1 f1Var;
        x xVarF = F();
        if (xVarF == null || (f1Var = xVarF.f24434f) == null) {
            return true;
        }
        return f1Var.c();
    }

    @Override // si.g
    public void c() {
        switch (this.f37515a) {
            case 4:
                ((si.g) this.f37516b).c();
                break;
            default:
                w wVar = (w) this.f37516b;
                wVar.f2254n = null;
                wVar.f2246d.h(hg.e.e(R.string.failed_try_again_later));
                r5.c.t(false, wVar.f2244b);
                break;
        }
    }

    @Override // g2.z0
    public void cancel() {
        x xVarF = F();
        if ((xVarF != null ? xVarF.f24434f : null) != null) {
            f0.c((f0) this.f37516b, this.f37517c);
        }
    }

    @Override // f1.k
    public Object d(f1.b bVar, Object obj) {
        return ((mk.e) this.f37516b).invoke(bVar, obj);
    }

    @Override // g8.n
    public void e(a8.b bVar, Bitmap bitmap) throws IOException {
        IOException iOException = ((t8.e) this.f37517c).f34508b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            bVar.d(bitmap);
            throw iOException;
        }
    }

    @Override // f1.k
    public Object f(Object obj) {
        return ((mk.c) this.f37517c).invoke(obj);
    }

    @Override // g8.n
    public void g() {
        g8.y yVar = (g8.y) this.f37516b;
        synchronized (yVar) {
            yVar.f24610c = yVar.f24608a.length;
        }
    }

    @Override // xj.a
    public Object get() {
        return new fa.d((Context) ((f4.e) this.f37516b).f23649a, (e) ((jf.c) this.f37517c).get());
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public Task getAppSetIdInfo() {
        return ((h) this.f37516b).getAppSetIdInfo().continueWithTask(new y(29, this));
    }

    @Override // si.g
    public void h(List list) {
        if (((ah.o) this.f37517c).f401a.r() == 1) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TextUtils.equals(((si.c) it.next()).f33798a, "devinfo_vip");
            }
        }
        ((si.g) this.f37516b).h(list);
    }

    @Override // g2.z0
    public boolean i(com.applovin.impl.sdk.ad.f fVar) {
        x xVarF = F();
        f1 f1Var = xVarF != null ? xVarF.f24434f : null;
        if (f1Var == null || f1Var.c()) {
            return true;
        }
        f0 f0Var = (f0) this.f37516b;
        g1.g gVarF = r.f();
        mk.c cVarE = gVarF != null ? gVarF.e() : null;
        g1.g gVarK = r.k(gVarF);
        try {
            e0 e0Var = f0Var.f24329a;
            e0Var.f25642r = true;
            try {
                boolean zE = f1Var.e(fVar);
                e0Var.f25642r = false;
                return zE;
            } catch (Throwable th2) {
                xVarF.getClass();
                throw th2;
            }
        } finally {
            r.o(gVarF, gVarK, cVarE);
        }
    }

    public String j(x7.e eVar) {
        String str;
        b8.h hVar = (b8.h) ((i0.f) this.f37517c).k();
        try {
            eVar.b(hVar.f2085a);
            byte[] bArrDigest = hVar.f2085a.digest();
            char[] cArr = t8.m.f34521b;
            synchronized (cArr) {
                for (int i4 = 0; i4 < bArrDigest.length; i4++) {
                    byte b10 = bArrDigest[i4];
                    int i10 = i4 * 2;
                    char[] cArr2 = t8.m.f34520a;
                    cArr[i10] = cArr2[(b10 & 255) >>> 4];
                    cArr[i10 + 1] = cArr2[b10 & 15];
                }
                str = new String(cArr);
            }
            return str;
        } finally {
            ((i0.f) this.f37517c).i(hVar);
        }
    }

    public void k() {
        int[] iArr = (int[]) this.f37516b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f37517c = null;
    }

    public Bundle l(String str) {
        nk.k.e(str, "key");
        c6.a aVar = (c6.a) this.f37516b;
        if (!aVar.g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = aVar.f2767f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleL = bundle.containsKey(str) ? z3.l(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            aVar.f2767f = null;
        }
        return bundleL;
    }

    public void m() throws IOException {
        String str = (String) this.f37516b;
        try {
            pe.c cVar = (pe.c) this.f37517c;
            cVar.getClass();
            new File((File) cVar.f31752d, str).createNewFile();
        } catch (IOException e2) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e2);
        }
    }

    public void n(z zVar, boolean z3) {
        nk.k.e(zVar, "f");
        z zVar2 = ((u0) this.f37516b).f1900z;
        if (zVar2 != null) {
            zVar2.s().f1890p.n(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f37517c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void o(z zVar, boolean z3) {
        nk.k.e(zVar, "f");
        u0 u0Var = (u0) this.f37516b;
        i.g gVar = u0Var.f1898x.f1766b;
        z zVar2 = u0Var.f1900z;
        if (zVar2 != null) {
            zVar2.s().f1890p.o(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f37517c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void p(z zVar, boolean z3) {
        nk.k.e(zVar, "f");
        z zVar2 = ((u0) this.f37516b).f1900z;
        if (zVar2 != null) {
            zVar2.s().f1890p.p(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f37517c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void q(z zVar, boolean z3) {
        nk.k.e(zVar, "f");
        z zVar2 = ((u0) this.f37516b).f1900z;
        if (zVar2 != null) {
            zVar2.s().f1890p.q(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f37517c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void r(z zVar, boolean z3) {
        nk.k.e(zVar, "f");
        z zVar2 = ((u0) this.f37516b).f1900z;
        if (zVar2 != null) {
            zVar2.s().f1890p.r(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f37517c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void s(z zVar, boolean z3) {
        nk.k.e(zVar, "f");
        z zVar2 = ((u0) this.f37516b).f1900z;
        if (zVar2 != null) {
            zVar2.s().f1890p.s(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f37517c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void t(z zVar, boolean z3) {
        nk.k.e(zVar, "f");
        u0 u0Var = (u0) this.f37516b;
        i.g gVar = u0Var.f1898x.f1766b;
        z zVar2 = u0Var.f1900z;
        if (zVar2 != null) {
            zVar2.s().f1890p.t(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f37517c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public String toString() {
        int iLastIndexOf;
        switch (this.f37515a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
                a8.d dVar = (a8.d) this.f37516b;
                a8.d dVar2 = dVar.f222c;
                boolean z3 = false;
                while (!dVar2.equals(dVar)) {
                    sb2.append('{');
                    sb2.append(dVar2.f220a);
                    sb2.append(':');
                    ArrayList arrayList = dVar2.f221b;
                    sb2.append(arrayList != null ? arrayList.size() : 0);
                    sb2.append("}, ");
                    dVar2 = dVar2.f222c;
                    z3 = true;
                }
                if (z3) {
                    sb2.delete(sb2.length() - 2, sb2.length());
                }
                sb2.append(" )");
                return sb2.toString();
            case 13:
                return "Bounds{lower=" + ((v3.b) this.f37516b) + " upper=" + ((v3.b) this.f37517c) + "}";
            case 24:
                String string = "[ ";
                if (((i3.f) this.f37516b) != null) {
                    for (int i4 = 0; i4 < 9; i4++) {
                        StringBuilder sbZ = d.h.z(string);
                        sbZ.append(((i3.f) this.f37516b).f25859h[i4]);
                        sbZ.append(" ");
                        string = sbZ.toString();
                    }
                }
                StringBuilder sbB = i3.e.b(string, "] ");
                sbB.append((i3.f) this.f37516b);
                return sbB.toString();
            case 26:
                StringBuilder sb3 = new StringBuilder(128);
                sb3.append("LoaderManager{");
                sb3.append(Integer.toHexString(System.identityHashCode(this)));
                sb3.append(" in ");
                a0 a0Var = (a0) this.f37516b;
                if (a0Var == null) {
                    sb3.append("null");
                } else {
                    String simpleName = a0Var.getClass().getSimpleName();
                    if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = a0Var.getClass().getName()).lastIndexOf(46)) > 0) {
                        simpleName = simpleName.substring(iLastIndexOf + 1);
                    }
                    sb3.append(simpleName);
                    sb3.append('{');
                    sb3.append(Integer.toHexString(System.identityHashCode(a0Var)));
                }
                sb3.append("}}");
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public void u(z zVar, boolean z3) {
        nk.k.e(zVar, "f");
        z zVar2 = ((u0) this.f37516b).f1900z;
        if (zVar2 != null) {
            zVar2.s().f1890p.u(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f37517c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void v(z zVar, boolean z3) {
        nk.k.e(zVar, "f");
        z zVar2 = ((u0) this.f37516b).f1900z;
        if (zVar2 != null) {
            zVar2.s().f1890p.v(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f37517c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void w(z zVar, Bundle bundle, boolean z3) {
        nk.k.e(zVar, "f");
        z zVar2 = ((u0) this.f37516b).f1900z;
        if (zVar2 != null) {
            zVar2.s().f1890p.w(zVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f37517c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void x(z zVar, boolean z3) {
        nk.k.e(zVar, "f");
        z zVar2 = ((u0) this.f37516b).f1900z;
        if (zVar2 != null) {
            zVar2.s().f1890p.x(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f37517c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void y(z zVar, boolean z3) {
        nk.k.e(zVar, "f");
        z zVar2 = ((u0) this.f37516b).f1900z;
        if (zVar2 != null) {
            zVar2.s().f1890p.y(zVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f37517c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void z(z zVar, View view, boolean z3) {
        nk.k.e(zVar, "f");
        nk.k.e(view, "v");
        z zVar2 = ((u0) this.f37516b).f1900z;
        if (zVar2 != null) {
            zVar2.s().f1890p.z(zVar, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f37517c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public i(Context context, int i4) {
        e eVar;
        this.f37515a = i4;
        switch (i4) {
            case 21:
                this.f37516b = context;
                this.f37517c = null;
                return;
            default:
                this.f37516b = new h(context, nb.f.f29899b);
                synchronized (e.class) {
                    try {
                        if (e.f37506e == null) {
                            e.f37506e = new e(context.getApplicationContext());
                        }
                        eVar = e.f37506e;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f37517c = eVar;
                return;
        }
    }

    public /* synthetic */ i(Object obj, boolean z3, Object obj2, int i4) {
        this.f37515a = i4;
        this.f37516b = obj;
        this.f37517c = obj2;
    }

    public i(int i4) {
        this.f37515a = i4;
        switch (i4) {
            case 5:
                break;
            case 8:
                this.f37516b = new r9(2, 1000L);
                this.f37517c = u8.d.a(10, new b7.h(6));
                break;
            case 11:
                this.f37516b = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.f37517c = DesugarCollections.synchronizedMap(new WeakHashMap());
                break;
            case 12:
                this.f37516b = new d2.d(0);
                this.f37517c = new d2.d(0);
                break;
            default:
                this.f37516b = new a8.d(null);
                this.f37517c = new HashMap();
                break;
        }
    }

    public i(c6.a aVar) {
        this.f37515a = 1;
        this.f37516b = aVar;
    }

    public i(u0 u0Var) {
        this.f37515a = 7;
        this.f37516b = u0Var;
        this.f37517c = new CopyOnWriteArrayList();
    }

    public i(i3.d dVar) {
        this.f37515a = 24;
        this.f37517c = dVar;
    }

    public i(a0 a0Var, j1 j1Var) {
        this.f37515a = 26;
        this.f37516b = a0Var;
        nk.k.e(j1Var, "store");
        h5.a aVar = h5.a.f24879b;
        nk.k.e(aVar, "defaultCreationExtras");
        x0 x0Var = new x0(j1Var, j5.a.f27396c, aVar);
        nk.e eVarA = nk.v.a(j5.a.class);
        String strB = eVarA.b();
        if (strB != null) {
            this.f37517c = (j5.a) x0Var.D(eVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public i(j0.b0 b0Var) {
        this.f37515a = 25;
        this.f37516b = b0Var;
        x.z zVar = i0.f36903a;
        this.f37517c = new x.z();
    }

    public i(i.g gVar, la.e eVar) {
        this.f37515a = 3;
        ag.c cVar = ag.c.f364f;
        this.f37516b = gVar;
        this.f37517c = eVar;
    }

    public i(zk.h hVar, zk.b bVar) {
        this.f37515a = 18;
        zk.d dVar = zk.d.f38329i;
        zk.e eVar = zk.e.f38330i;
        this.f37516b = hVar;
        this.f37517c = bVar;
    }

    public i(WindowInsetsAnimation.Bounds bounds) {
        this.f37515a = 13;
        this.f37516b = e4.j1.g(bounds);
        this.f37517c = e4.j1.f(bounds);
    }
}
