package bc;

import android.database.SQLException;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzr;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import zc.c1;
import zc.d2;
import zc.i1;
import zc.j0;
import zc.m0;
import zc.n1;
import zc.p1;
import zc.p3;
import zc.r0;
import zc.s3;
import zc.w0;
import zc.x2;

/* loaded from: classes.dex */
public final class e0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2597a;

    /* renamed from: d, reason: collision with root package name */
    public Object f2598d;

    /* renamed from: g, reason: collision with root package name */
    public Object f2599g;

    /* renamed from: r, reason: collision with root package name */
    public Object f2600r;

    public /* synthetic */ e0() {
        this.f2597a = 5;
    }

    private final void a() throws MalformedURLException, URISyntaxException, NumberFormatException, SQLException {
        zzbe zzbeVar;
        zzbg zzbgVar = (zzbg) this.f2598d;
        zzr zzrVar = (zzr) this.f2599g;
        i1 i1Var = (i1) this.f2600r;
        i1Var.getClass();
        p3 p3Var = i1Var.f26968d;
        if ("_cmp".equals(zzbgVar.f5405a) && (zzbeVar = zzbgVar.f5406d) != null) {
            Bundle bundle = zzbeVar.f5404a;
            if (bundle.size() != 0) {
                String string = bundle.getString("_cis");
                if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                    p3Var.x().I.c(zzbgVar.toString(), "Event has been filtered ");
                    zzbgVar = new zzbg("_cmpx", zzbeVar, zzbgVar.f5407g, zzbgVar.f5408r);
                }
            }
        }
        String str = zzbgVar.f5405a;
        w0 w0Var = p3Var.f27091a;
        m0 m0Var = p3Var.B;
        p3.Q(w0Var);
        String str2 = zzrVar.f5426a;
        com.google.android.gms.internal.measurement.e0 e0Var = TextUtils.isEmpty(str2) ? null : (com.google.android.gms.internal.measurement.e0) w0Var.G.h(str2);
        if (e0Var == null) {
            p3Var.x().K.c(zzrVar.f5426a, "EES not loaded for");
            p3Var.w();
            p3Var.e(zzbgVar, zzrVar);
            return;
        }
        try {
            bm.d dVar = e0Var.f4961c;
            p3.Q(m0Var);
            HashMap mapI2 = m0.i2(zzbgVar.f5406d.j(), true);
            String strG = p1.g(str, p1.f27077c, p1.f27075a);
            if (strG == null) {
                strG = str;
            }
            if (e0Var.a(new com.google.android.gms.internal.measurement.b(strG, zzbgVar.f5408r, mapI2))) {
                if (((com.google.android.gms.internal.measurement.b) dVar.f2827g).equals((com.google.android.gms.internal.measurement.b) dVar.f2826d)) {
                    p3Var.w();
                    p3Var.e(zzbgVar, zzrVar);
                } else {
                    p3Var.x().K.c(str, "EES edited event");
                    p3.Q(m0Var);
                    zzbg zzbgVarW1 = m0.w1((com.google.android.gms.internal.measurement.b) dVar.f2827g);
                    p3Var.w();
                    p3Var.e(zzbgVarW1, zzrVar);
                }
                if (((ArrayList) dVar.f2828r).isEmpty()) {
                    return;
                }
                Iterator it = ((ArrayList) dVar.f2828r).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.b bVar = (com.google.android.gms.internal.measurement.b) it.next();
                    p3Var.x().K.c(bVar.f4912a, "EES logging created event");
                    p3.Q(m0Var);
                    zzbg zzbgVarW12 = m0.w1(bVar);
                    p3Var.w();
                    p3Var.e(zzbgVarW12, zzrVar);
                }
                return;
            }
        } catch (q0 unused) {
            p3Var.x().B.d(zzrVar.f5428d, str, "EES error. appId, eventName");
        }
        p3Var.x().K.c(str, "EES was not applied to event");
        p3Var.w();
        p3Var.e(zzbgVar, zzrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.e0.b():void");
    }

    private final void c() {
        AtomicReference atomicReference;
        x2 x2Var;
        c1 c1Var;
        r0 r0Var;
        AtomicReference atomicReference2 = (AtomicReference) this.f2598d;
        synchronized (atomicReference2) {
            try {
                try {
                    x2Var = (x2) this.f2600r;
                    c1Var = (c1) x2Var.f1504d;
                    r0Var = c1Var.f26888x;
                    c1.e(r0Var);
                } catch (Throwable th2) {
                    ((AtomicReference) this.f2598d).notify();
                    throw th2;
                }
            } catch (RemoteException e4) {
                j0 j0Var = ((c1) ((x2) this.f2600r).f1504d).f26889y;
                c1.g(j0Var);
                j0Var.B.c(e4, "Failed to get app instance id");
                atomicReference = (AtomicReference) this.f2598d;
            }
            if (r0Var.z1().i(n1.ANALYTICS_STORAGE)) {
                zc.x xVar = x2Var.f27267x;
                if (xVar != null) {
                    atomicReference2.set(xVar.M((zzr) this.f2599g));
                    String str = (String) atomicReference2.get();
                    if (str != null) {
                        d2 d2Var = ((c1) x2Var.f1504d).I;
                        c1.f(d2Var);
                        d2Var.D.set(str);
                        r0 r0Var2 = c1Var.f26888x;
                        c1.e(r0Var2);
                        r0Var2.D.o(str);
                    }
                    x2Var.F1();
                    atomicReference = (AtomicReference) this.f2598d;
                    atomicReference.notify();
                    return;
                }
                j0 j0Var2 = c1Var.f26889y;
                c1.g(j0Var2);
                j0Var2.B.b("Failed to get app instance id");
            } else {
                j0 j0Var3 = c1Var.f26889y;
                c1.g(j0Var3);
                j0Var3.H.b("Analytics storage consent denied; will not get app instance id");
                d2 d2Var2 = ((c1) x2Var.f1504d).I;
                c1.f(d2Var2);
                d2Var2.D.set(null);
                r0 r0Var3 = c1Var.f26888x;
                c1.e(r0Var3);
                r0Var3.D.o(null);
                atomicReference2.set(null);
            }
            atomicReference2.notify();
        }
    }

    private final void d() {
        s3 s3Var;
        c1 c1Var;
        r0 r0Var;
        j0 j0Var;
        com.google.android.gms.internal.measurement.m0 m0Var = (com.google.android.gms.internal.measurement.m0) this.f2599g;
        x2 x2Var = (x2) this.f2600r;
        String strM = null;
        try {
            try {
                c1Var = (c1) x2Var.f1504d;
                r0Var = c1Var.f26888x;
                j0Var = c1Var.f26889y;
                c1.e(r0Var);
            } catch (RemoteException e4) {
                j0 j0Var2 = ((c1) x2Var.f1504d).f26889y;
                c1.g(j0Var2);
                j0Var2.B.c(e4, "Failed to get app instance id");
            }
            if (r0Var.z1().i(n1.ANALYTICS_STORAGE)) {
                zc.x xVar = x2Var.f27267x;
                if (xVar != null) {
                    strM = xVar.M((zzr) this.f2598d);
                    if (strM != null) {
                        d2 d2Var = c1Var.I;
                        c1.f(d2Var);
                        d2Var.D.set(strM);
                        c1.e(r0Var);
                        r0Var.D.o(strM);
                    }
                    x2Var.F1();
                    s3Var = ((c1) x2Var.f1504d).E;
                    c1.e(s3Var);
                    s3Var.a2(strM, m0Var);
                }
                c1.g(j0Var);
                j0Var.B.b("Failed to get app instance id");
            } else {
                c1.g(j0Var);
                j0Var.H.b("Analytics storage consent denied; will not get app instance id");
                d2 d2Var2 = c1Var.I;
                c1.f(d2Var2);
                d2Var2.D.set(null);
                c1.e(r0Var);
                r0Var.D.o(null);
            }
            s3Var = c1Var.E;
            c1.e(s3Var);
            s3Var.a2(strM, m0Var);
        } catch (Throwable th2) {
            s3 s3Var2 = ((c1) x2Var.f1504d).E;
            c1.e(s3Var2);
            s3Var2.a2(null, m0Var);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0449 A[PHI: r4 r9
  0x0449: PHI (r4v29 java.net.HttpURLConnection) = 
  (r4v24 java.net.HttpURLConnection)
  (r4v25 java.net.HttpURLConnection)
  (r4v26 java.net.HttpURLConnection)
  (r4v33 java.net.HttpURLConnection)
 binds: [B:192:0x04c9, B:198:0x04df, B:202:0x0502, B:149:0x043f] A[DONT_GENERATE, DONT_INLINE]
  0x0449: PHI (r9v23 java.io.DataOutputStream) = 
  (r9v41 java.io.DataOutputStream)
  (r9v42 java.io.DataOutputStream)
  (r9v43 java.io.DataOutputStream)
  (r9v44 java.io.DataOutputStream)
 binds: [B:192:0x04c9, B:198:0x04df, B:202:0x0502, B:149:0x043f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0481 A[Catch: all -> 0x04b7, TryCatch #17 {all -> 0x04b7, blocks: (B:180:0x047a, B:182:0x0481, B:184:0x04a4), top: B:251:0x047a }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v8, types: [fh.d] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.e0.run():void");
    }

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, int i10) {
        this.f2597a = i10;
        this.f2598d = obj2;
        this.f2599g = obj3;
        this.f2600r = obj;
    }

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, int i10, boolean z10) {
        this.f2597a = i10;
        this.f2598d = obj;
        this.f2599g = obj2;
        this.f2600r = obj3;
    }

    public e0(x2 x2Var, AtomicReference atomicReference, zzr zzrVar) {
        this.f2597a = 13;
        this.f2598d = atomicReference;
        this.f2599g = zzrVar;
        Objects.requireNonNull(x2Var);
        this.f2600r = x2Var;
    }
}
