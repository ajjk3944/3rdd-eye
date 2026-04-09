package b5;

import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Trace;
import android.util.SparseArray;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.a02;
import com.google.android.gms.internal.ads.di;
import com.google.android.gms.internal.ads.ii;
import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.m2;
import com.google.android.gms.internal.ads.r6;
import com.google.android.gms.internal.ads.rz1;
import com.google.android.gms.internal.ads.s41;
import com.google.android.gms.internal.ads.sz1;
import com.google.android.gms.internal.ads.t6;
import com.google.android.gms.internal.ads.u2;
import com.google.android.gms.internal.ads.u51;
import com.google.android.gms.internal.ads.v41;
import com.google.android.gms.internal.ads.wz1;
import com.google.android.gms.internal.ads.x41;
import com.google.android.gms.internal.ads.x9;
import com.google.android.gms.internal.ads.yr1;
import com.google.android.gms.internal.ads.z1;
import com.google.android.gms.internal.measurement.z3;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p.r3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i0 implements t8.g, z1, a02 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1820a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1821b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1822c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1823d;

    public i0(ka kaVar) {
        this.f1820a = false;
        this.f1821b = null;
        this.f1822c = null;
        this.f1823d = kaVar;
    }

    public static IOException b(i0 i0Var, boolean z3, IOException iOException, int i4) {
        boolean z10 = (i4 & 4) == 0;
        boolean z11 = (i4 & 8) == 0;
        if (iOException != null) {
            i0Var.g(iOException);
        }
        return ((vl.m) i0Var.f1821b).h(i0Var, z11 && !z3, z10 && !z3, z10 && z3, z11 && z3, iOException);
    }

    public void a() {
        v7.c.c((v7.c) this.f1823d, this, false);
    }

    public vl.n c() {
        wl.e eVarG = ((wl.f) this.f1823d).g();
        vl.n nVar = eVarG instanceof vl.n ? (vl.n) eVarG : null;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public File d() {
        File file;
        synchronized (((v7.c) this.f1823d)) {
            try {
                v7.b bVar = (v7.b) this.f1821b;
                if (bVar.f35955f != this) {
                    throw new IllegalStateException();
                }
                if (!bVar.f35954e) {
                    ((boolean[]) this.f1822c)[0] = true;
                }
                file = bVar.f35953d[0];
                ((v7.c) this.f1823d).f35956a.mkdirs();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return file;
    }

    public boolean e() {
        boolean z3;
        synchronized (this.f1822c) {
            z3 = this.f1820a;
        }
        return z3;
    }

    public rl.y f(boolean z3) throws IOException {
        try {
            rl.y responseHeaders = ((wl.f) this.f1823d).readResponseHeaders(z3);
            if (responseHeaders == null) {
                return responseHeaders;
            }
            responseHeaders.f33202n = this;
            return responseHeaders;
        } catch (IOException e2) {
            g(e2);
            throw e2;
        }
    }

    public void g(IOException iOException) {
        this.f1820a = true;
        ((wl.f) this.f1823d).g().g((vl.m) this.f1821b, iOException);
    }

    @Override // t8.g
    public Object get() {
        if (this.f1820a) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection(z3.w("Glide registry"));
        this.f1820a = true;
        try {
            return a.a.g((com.bumptech.glide.b) this.f1821b, (List) this.f1822c, (nh.a) this.f1823d);
        } finally {
            this.f1820a = false;
            Trace.endSection();
        }
    }

    public km.n h() throws SocketException {
        vl.m mVar = (vl.m) this.f1821b;
        if (mVar.f36339i) {
            throw new IllegalStateException("Check failed.");
        }
        mVar.f36339i = true;
        mVar.f36335d.i();
        synchronized (mVar) {
            if (mVar.f36346q == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (mVar.f36342m || mVar.f36343n) {
                throw new IllegalStateException("Check failed.");
            }
            if (mVar.f36340k) {
                throw new IllegalStateException("Check failed.");
            }
            if (!mVar.f36341l) {
                throw new IllegalStateException("Check failed.");
            }
            mVar.f36341l = false;
            mVar.f36342m = true;
            mVar.f36343n = true;
        }
        wl.e eVarG = ((wl.f) this.f1823d).g();
        nk.k.c(eVarG, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
        vl.n nVar = (vl.n) eVarG;
        nVar.f36351e.setSoTimeout(0);
        nVar.e();
        return new km.n(this);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public void i() {
        ((z1) this.f1821b).i();
        if (!this.f1820a) {
            return;
        }
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) this.f1823d;
            if (i4 >= sparseArray.size()) {
                return;
            }
            ((t6) sparseArray.valueAt(i4)).f16718i = true;
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.a02
    public u51 j(int i4, ii iiVar, int[] iArr) {
        com.google.android.gms.internal.ads.b bVar = (com.google.android.gms.internal.ads.b) this.f1821b;
        wz1 wz1Var = (wz1) this.f1822c;
        sz1 sz1Var = new sz1(bVar, wz1Var);
        int i10 = ((int[]) this.f1823d)[i4];
        v41 v41Var = x41.f18307b;
        yr1.u(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < iiVar.f12337a) {
            int i13 = i4;
            ii iiVar2 = iiVar;
            rz1 rz1Var = new rz1(i13, iiVar2, i11, wz1Var, iArr[i11], this.f1820a, sz1Var);
            int length = objArrCopyOf.length;
            int i14 = i12 + 1;
            int iD = s41.d(length, i14);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i12] = rz1Var;
            i11++;
            i12 = i14;
            i4 = i13;
            iiVar = iiVar2;
        }
        return x41.s(objArrCopyOf, i12);
    }

    public String k() {
        if (!this.f1820a) {
            this.f1820a = true;
            ec.b1 b1Var = (ec.b1) this.f1823d;
            this.f1822c = b1Var.F().getString((String) this.f1821b, null);
        }
        return (String) this.f1822c;
    }

    public /* synthetic */ void l() {
        synchronized (this.f1823d) {
            try {
                di diVar = (di) this.f1821b;
                if (diVar == null) {
                    return;
                }
                diVar.f();
                this.f1821b = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public u2 m(int i4, int i10) {
        z1 z1Var = (z1) this.f1821b;
        if (i10 != 3) {
            this.f1820a = true;
            return z1Var.m(i4, i10);
        }
        SparseArray sparseArray = (SparseArray) this.f1823d;
        t6 t6Var = (t6) sparseArray.get(i4);
        if (t6Var != null) {
            return t6Var;
        }
        t6 t6Var2 = new t6(z1Var.m(i4, 3), (r6) this.f1822c);
        sparseArray.put(i4, t6Var2);
        return t6Var2;
    }

    public void n(String str) {
        SharedPreferences.Editor editorEdit = ((ec.b1) this.f1823d).F().edit();
        editorEdit.putString((String) this.f1821b, str);
        editorEdit.apply();
        this.f1822c = str;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public void o(m2 m2Var) {
        ((z1) this.f1821b).o(m2Var);
    }

    public i0(Object obj, x9 x9Var) {
        this.f1820a = false;
        this.f1821b = obj;
        this.f1822c = x9Var;
        this.f1823d = null;
    }

    public i0(z1 z1Var, r6 r6Var) {
        this.f1821b = z1Var;
        this.f1822c = r6Var;
        this.f1823d = new SparseArray();
    }

    public i0(ec.b1 b1Var, String str) {
        this.f1823d = b1Var;
        pb.y.e(str);
        this.f1821b = str;
    }

    public i0(int i4, boolean z3) {
        switch (i4) {
            case 13:
                this.f1822c = new Object();
                this.f1821b = new ArrayList();
                this.f1823d = new ArrayList();
                this.f1820a = true;
                break;
            default:
                this.f1821b = new ArrayList();
                this.f1820a = false;
                this.f1822c = new CopyOnWriteArrayList();
                break;
        }
    }

    public i0(r3 r3Var, boolean z3) {
        this.f1823d = r3Var;
        this.f1822c = new AtomicReference(null);
        this.f1820a = z3;
        this.f1821b = new AtomicMarkableReference(new le.e(z3 ? Segment.SIZE : Segment.SHARE_MINIMUM), false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i0(u0 u0Var) {
        this(0, false);
        this.f1823d = u0Var;
    }

    public i0(v7.c cVar, v7.b bVar) {
        this.f1823d = cVar;
        this.f1821b = bVar;
        this.f1822c = bVar.f35954e ? null : new boolean[cVar.g];
    }
}
