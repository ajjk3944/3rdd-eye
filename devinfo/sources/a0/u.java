package a0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.android.gms.internal.ads.fg;
import com.google.android.gms.internal.ads.gv0;
import com.google.android.gms.internal.ads.ng;
import com.google.android.gms.internal.ads.tv0;
import com.google.android.gms.internal.ads.wv0;
import com.google.android.gms.internal.ads.yv0;
import com.google.android.gms.internal.ads.zv0;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u implements h, pb.b, pb.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f132a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f133b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f134c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f135d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f136e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f137f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f138h;

    public u(Context context, fg fgVar, String str, String str2, gv0 gv0Var) throws PackageManager.NameNotFoundException {
        this.f134c = str;
        this.f136e = fgVar;
        this.f135d = str2;
        this.f138h = gv0Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.g = handlerThread;
        handlerThread.start();
        this.f132a = System.currentTimeMillis();
        tv0 tv0Var = new tv0(context, handlerThread.getLooper(), this, this, 19621000);
        this.f133b = tv0Var;
        this.f137f = new LinkedBlockingQueue();
        tv0Var.n();
    }

    @Override // pb.c
    public void O(nb.b bVar) throws InterruptedException {
        try {
            b(4012, this.f132a, null);
            ((LinkedBlockingQueue) this.f137f).put(new zv0());
        } catch (InterruptedException unused) {
        }
    }

    @Override // pb.b
    public void S(int i4) throws InterruptedException {
        try {
            b(4011, this.f132a, null);
            ((LinkedBlockingQueue) this.f137f).put(new zv0());
        } catch (InterruptedException unused) {
        }
    }

    @Override // pb.b
    public void T() {
        wv0 wv0Var;
        long j = this.f132a;
        HandlerThread handlerThread = (HandlerThread) this.g;
        try {
            wv0Var = (wv0) ((tv0) this.f133b).t();
        } catch (DeadObjectException | IllegalStateException unused) {
            wv0Var = null;
        }
        if (wv0Var != null) {
            try {
                yv0 yv0Var = new yv0(1, 1, ((fg) this.f136e).f11160a, (String) this.f134c, (String) this.f135d);
                Parcel parcelT = wv0Var.T();
                ng.c(parcelT, yv0Var);
                Parcel parcelR0 = wv0Var.r0(parcelT, 3);
                zv0 zv0Var = (zv0) ng.b(parcelR0, zv0.CREATOR);
                parcelR0.recycle();
                b(5011, j, null);
                ((LinkedBlockingQueue) this.f137f).put(zv0Var);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public void a() {
        tv0 tv0Var = (tv0) this.f133b;
        if (tv0Var != null) {
            if (tv0Var.g() || tv0Var.c()) {
                tv0Var.f();
            }
        }
    }

    public void b(int i4, long j, Exception exc) {
        gv0 gv0Var = (gv0) this.f138h;
        if (gv0Var != null) {
            gv0Var.c(i4, System.currentTimeMillis() - j, exc);
        }
    }

    @Override // a0.h
    public boolean d() {
        return false;
    }

    @Override // a0.h
    public long e() {
        return this.f132a;
    }

    @Override // a0.h
    public y4.a f() {
        return (y4.a) this.f134c;
    }

    @Override // a0.h
    public r g(long j) {
        return !g.b(this, j) ? ((x0) this.f133b).C(j, (r) this.f137f, (r) this.g) : (r) this.f138h;
    }

    @Override // a0.h
    public /* synthetic */ boolean h(long j) {
        return g.b(this, j);
    }

    @Override // a0.h
    public Object i(long j) {
        if (g.b(this, j)) {
            return this.f136e;
        }
        mk.c cVar = (mk.c) ((y4.a) this.f134c).f37324b;
        x0 x0Var = (x0) this.f133b;
        r rVar = (r) this.f137f;
        r rVar2 = (r) this.g;
        if (((r) x0Var.f145b) == null) {
            x0Var.f145b = rVar.c();
        }
        r rVar3 = (r) x0Var.f145b;
        String str = "valueVector";
        if (rVar3 == null) {
            nk.k.k("valueVector");
            throw null;
        }
        int iB = rVar3.b();
        int i4 = 0;
        while (i4 < iB) {
            r rVar4 = (r) x0Var.f145b;
            if (rVar4 == null) {
                nk.k.k(str);
                throw null;
            }
            z.e eVar = (z.e) x0Var.f148e;
            float fA = rVar.a(i4);
            long j8 = j / 1000000;
            z.c cVarA = ((qc.e) eVar.f37798a).a(rVar2.a(i4));
            String str2 = str;
            long j9 = cVarA.f37796c;
            rVar4.e(i4, (Math.signum(cVarA.f37794a) * cVarA.f37795b * z.b.a(j9 > 0 ? j8 / j9 : 1.0f).f37791a) + fA);
            i4++;
            str = str2;
        }
        String str3 = str;
        r rVar5 = (r) x0Var.f145b;
        if (rVar5 != null) {
            return cVar.invoke(rVar5);
        }
        nk.k.k(str3);
        throw null;
    }

    @Override // a0.h
    public Object j() {
        return this.f136e;
    }

    public u(v vVar, y4.a aVar, Object obj, r rVar) {
        x0 x0Var = new x0(1, vVar.f141a);
        this.f133b = x0Var;
        this.f134c = aVar;
        this.f135d = obj;
        r rVar2 = (r) ((mk.c) aVar.f37323a).invoke(obj);
        this.f137f = rVar2;
        this.g = f.g(rVar);
        mk.c cVar = (mk.c) aVar.f37324b;
        if (((r) x0Var.f147d) == null) {
            x0Var.f147d = rVar2.c();
        }
        r rVar3 = (r) x0Var.f147d;
        if (rVar3 != null) {
            int iB = rVar3.b();
            int i4 = 0;
            while (i4 < iB) {
                r rVar4 = (r) x0Var.f147d;
                if (rVar4 == null) {
                    nk.k.k("targetVector");
                    throw null;
                }
                z.e eVar = (z.e) x0Var.f148e;
                float fA = rVar2.a(i4);
                float fA2 = rVar.a(i4);
                double dB = ((qc.e) eVar.f37798a).b(fA2);
                double d10 = z.d.f37797a;
                int i10 = i4;
                rVar4.e(i10, (Math.signum(fA2) * ((float) (Math.exp((d10 / (d10 - 1.0d)) * dB) * r13.f32238a * r13.f32239b))) + fA);
                i4 = i10 + 1;
            }
            r rVar5 = (r) x0Var.f147d;
            if (rVar5 != null) {
                this.f136e = cVar.invoke(rVar5);
                x0 x0Var2 = (x0) this.f133b;
                r rVar6 = (r) this.f137f;
                if (((r) x0Var2.f146c) == null) {
                    x0Var2.f146c = rVar6.c();
                }
                r rVar7 = (r) x0Var2.f146c;
                if (rVar7 != null) {
                    int iB2 = rVar7.b();
                    long jMax = 0;
                    for (int i11 = 0; i11 < iB2; i11++) {
                        z.e eVar2 = (z.e) x0Var2.f148e;
                        rVar6.getClass();
                        jMax = Math.max(jMax, ((long) (Math.exp(((qc.e) eVar2.f37798a).b(rVar.a(i11)) / (z.d.f37797a - 1.0d)) * 1000.0d)) * 1000000);
                    }
                    this.f132a = jMax;
                    r rVarG = f.g(((x0) this.f133b).C(jMax, (r) this.f137f, rVar));
                    this.f138h = rVarG;
                    int iB3 = rVarG.b();
                    for (int i12 = 0; i12 < iB3; i12++) {
                        r rVar8 = (r) this.f138h;
                        float fA3 = rVar8.a(i12);
                        ((x0) this.f133b).getClass();
                        ((x0) this.f133b).getClass();
                        rVar8.e(i12, ci.b.d(fA3, -0.0f, 0.0f));
                    }
                    return;
                }
                nk.k.k("velocityVector");
                throw null;
            }
            nk.k.k("targetVector");
            throw null;
        }
        nk.k.k("targetVector");
        throw null;
    }
}
