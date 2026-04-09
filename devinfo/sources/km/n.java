package km;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f1;
import androidx.recyclerview.widget.g2;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.c2;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.play_billing.a3;
import com.google.android.gms.internal.play_billing.d3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.n3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.s3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.x2;
import com.google.android.gms.internal.play_billing.y2;
import com.liuzh.deviceinfo.splash.SplashActivity;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class n implements f, ga.b, rf.b, pa.n, pi.i, se.a, t7.q, hm.v, w4.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28441a;

    /* renamed from: b, reason: collision with root package name */
    public Object f28442b;

    /* renamed from: c, reason: collision with root package name */
    public Object f28443c;

    public /* synthetic */ n(char c9, int i4) {
        this.f28441a = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static km.n q(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L6d
            hm.h[] r0 = new hm.h[r0]     // Catch: java.io.IOException -> L6d
            hm.e r1 = new hm.e     // Catch: java.io.IOException -> L6d
            r1.<init>()     // Catch: java.io.IOException -> L6d
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L6d
            if (r3 >= r4) goto L5b
            r4 = r12[r3]     // Catch: java.io.IOException -> L6d
            java.lang.String[] r5 = q7.a.f32199e     // Catch: java.io.IOException -> L6d
            r6 = 34
            r1.E(r6)     // Catch: java.io.IOException -> L6d
            int r7 = r4.length()     // Catch: java.io.IOException -> L6d
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6d
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L6d
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.O(r9, r8, r4)     // Catch: java.io.IOException -> L6d
        L3d:
            r1.T(r10)     // Catch: java.io.IOException -> L6d
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.O(r9, r7, r4)     // Catch: java.io.IOException -> L6d
        L4a:
            r1.E(r6)     // Catch: java.io.IOException -> L6d
            r1.readByte()     // Catch: java.io.IOException -> L6d
            long r4 = r1.f25174b     // Catch: java.io.IOException -> L6d
            hm.h r4 = r1.readByteString(r4)     // Catch: java.io.IOException -> L6d
            r0[r3] = r4     // Catch: java.io.IOException -> L6d
            int r3 = r3 + 1
            goto La
        L5b:
            km.n r1 = new km.n     // Catch: java.io.IOException -> L6d
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6d
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6d
            hm.n r0 = wb.e.I(r0)     // Catch: java.io.IOException -> L6d
            r2 = 10
            r1.<init>(r2, r12, r0)     // Catch: java.io.IOException -> L6d
            return r1
        L6d:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: km.n.q(java.lang.String[]):km.n");
    }

    public void A() {
        synchronized (this) {
            ((AtomicInteger) this.f28442b).decrementAndGet();
            if (((AtomicInteger) this.f28442b).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public void B(u0.t0 t0Var) {
        Object objG = ((x.e0) this.f28443c).g(t0Var);
        if (objG != null) {
            if (!(objG instanceof x.a0)) {
                throw new ClassCastException();
            }
            x.a0 a0Var = (x.a0) objG;
            Object[] objArr = a0Var.f36846a;
            if (a0Var.f36847b <= 0) {
                return;
            }
            nk.k.c(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    public void C(y2 y2Var) {
        try {
            J(y2Var, (h3) this.f28442b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void D(y2 y2Var, int i4, long j) {
        try {
            g3 g3Var = (g3) ((h3) this.f28442b).g();
            g3Var.d();
            h3.p((h3) g3Var.f20201b, i4);
            h3 h3Var = (h3) g3Var.a();
            this.f28442b = h3Var;
            if (j != 0) {
                g3 g3Var2 = (g3) h3Var.g();
                g3Var2.d();
                h3.r((h3) g3Var2.f20201b, j);
                h3Var = (h3) g3Var2.a();
            }
            J(y2Var, h3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void E(y2 y2Var, long j, boolean z3) {
        h3 h3Var;
        try {
            x2 x2Var = (x2) y2Var.g();
            l3 l3Var = (l3) y2Var.o().g();
            l3Var.d();
            n3.n((n3) l3Var.f20201b, z3);
            x2Var.d();
            y2.r((y2) x2Var.f20201b, (n3) l3Var.a());
            y2 y2Var2 = (y2) x2Var.a();
            if (j == 0) {
                h3Var = (h3) this.f28442b;
            } else {
                g3 g3Var = (g3) ((h3) this.f28442b).g();
                g3Var.d();
                h3.r((h3) g3Var.f20201b, j);
                h3Var = (h3) g3Var.a();
            }
            J(y2Var2, h3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void F(y2 y2Var, int i4, long j, boolean z3) {
        h3 h3Var;
        try {
            g3 g3Var = (g3) ((h3) this.f28442b).g();
            g3Var.d();
            h3.p((h3) g3Var.f20201b, i4);
            this.f28442b = (h3) g3Var.a();
            x2 x2Var = (x2) y2Var.g();
            l3 l3Var = (l3) y2Var.o().g();
            l3Var.d();
            n3.n((n3) l3Var.f20201b, z3);
            x2Var.d();
            y2.r((y2) x2Var.f20201b, (n3) l3Var.a());
            y2 y2Var2 = (y2) x2Var.a();
            if (j == 0) {
                h3Var = (h3) this.f28442b;
            } else {
                g3 g3Var2 = (g3) ((h3) this.f28442b).g();
                g3Var2.d();
                h3.r((h3) g3Var2.f20201b, j);
                h3Var = (h3) g3Var2.a();
            }
            J(y2Var2, h3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void G(d3 d3Var) {
        try {
            o3 o3VarT = p3.t();
            o3VarT.e((h3) this.f28442b);
            o3VarT.d();
            p3.p((p3) o3VarT.f20201b, d3Var);
            ((a4.d) this.f28443c).u((p3) o3VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void H(s3 s3Var) {
        try {
            a4.d dVar = (a4.d) this.f28443c;
            o3 o3VarT = p3.t();
            o3VarT.e((h3) this.f28442b);
            o3VarT.d();
            p3.r((p3) o3VarT.f20201b, s3Var);
            dVar.u((p3) o3VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void I(t3 t3Var) {
        if (t3Var == null) {
            return;
        }
        try {
            o3 o3VarT = p3.t();
            o3VarT.e((h3) this.f28442b);
            o3VarT.d();
            p3.s((p3) o3VarT.f20201b, t3Var);
            ((a4.d) this.f28443c).u((p3) o3VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void J(y2 y2Var, h3 h3Var) {
        if (y2Var == null) {
            return;
        }
        try {
            o3 o3VarT = p3.t();
            o3VarT.e(h3Var);
            o3VarT.d();
            p3.n((p3) o3VarT.f20201b, y2Var);
            ((a4.d) this.f28443c).u((p3) o3VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void K(a3 a3Var, h3 h3Var) {
        try {
            o3 o3VarT = p3.t();
            o3VarT.e(h3Var);
            o3VarT.d();
            p3.o((p3) o3VarT.f20201b, a3Var);
            ((a4.d) this.f28443c).u((p3) o3VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // pa.n
    public void b(c2 c2Var) {
        ((pi.g) this.f28443c).x(d5.y(c2Var, (pi.a) this.f28442b, "rewardAd"));
    }

    @Override // w4.l
    public Object c() {
        return (w4.v) this.f28442b;
    }

    @Override // w4.l
    public boolean d(CharSequence charSequence, int i4, int i10, w4.s sVar) {
        if ((sVar.f36462c & 4) > 0) {
            return true;
        }
        if (((w4.v) this.f28442b) == null) {
            this.f28442b = new w4.v(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((i7.b) this.f28443c).getClass();
        ((w4.v) this.f28442b).setSpan(new w4.t(sVar), i4, i10, 33);
        return true;
    }

    @Override // hm.v
    public hm.w e() {
        return (vl.f) this.f28443c;
    }

    public void f(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.f28442b).add(r5.c.m(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    public void g(String str, String str2) {
        nk.k.e(str, "name");
        nk.k.e(str2, "value");
        ((ArrayList) this.f28442b).add(gm.a.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) this.f28443c).add(gm.a.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    @Override // xj.a
    public Object get() {
        switch (this.f28441a) {
            case 2:
                i7.b bVar = new i7.b();
                ja.c cVar = new ja.c();
                Object obj = ((xj.a) this.f28442b).get();
                xj.a aVar = (xj.a) this.f28443c;
                return new la.h(bVar, cVar, la.a.f28627f, (la.j) obj, aVar);
            default:
                Context context = (Context) ((rf.c) this.f28442b).f32941a;
                ck.h hVar = (ck.h) ((xj.a) this.f28443c).get();
                nk.k.e(context, "appContext");
                nk.k.e(hVar, "blockingDispatcher");
                return pf.q.a(sf.h.f33581a, new m1.g(new b7.w(14)), xk.x.b(hVar), new pf.p(context, 0));
        }
    }

    public void h(String str, String str2) {
        nk.k.e(str, "name");
        nk.k.e(str2, "value");
        ((ArrayList) this.f28442b).add(gm.a.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
        ((ArrayList) this.f28443c).add(gm.a.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
    }

    public boolean i() {
        synchronized (this) {
            if (((AtomicBoolean) this.f28443c).get()) {
                return false;
            }
            ((AtomicInteger) this.f28442b).incrementAndGet();
            return true;
        }
    }

    public void j(Throwable th2) {
        try {
            ((g) this.f28442b).g((d0) this.f28443c, th2);
        } catch (Throwable th3) {
            c1.q(th3);
            th3.printStackTrace();
        }
    }

    public boolean k(b7.l lVar) {
        boolean zContainsKey;
        synchronized (this.f28443c) {
            zContainsKey = ((LinkedHashMap) ((i) this.f28442b).f28426b).containsKey(lVar);
        }
        return zContainsKey;
    }

    public int l() {
        Rect rect = (Rect) this.f28443c;
        RecyclerView recyclerView = (RecyclerView) this.f28442b;
        if (recyclerView.getChildCount() == 0) {
            return 0;
        }
        View childAt = recyclerView.getChildAt(0);
        recyclerView.getClass();
        RecyclerView.Q(rect, childAt);
        return rect.height();
    }

    public com.bumptech.glide.p m(Context context, com.bumptech.glide.b bVar, androidx.lifecycle.t tVar, b5.u0 u0Var, boolean z3) {
        t8.m.a();
        t8.m.a();
        HashMap map = (HashMap) this.f28442b;
        com.bumptech.glide.p pVar = (com.bumptech.glide.p) map.get(tVar);
        if (pVar != null) {
            return pVar;
        }
        m8.h hVar = new m8.h(tVar);
        ja.c cVar = (ja.c) this.f28443c;
        j6.i iVar = new j6.i(this, u0Var);
        cVar.getClass();
        com.bumptech.glide.p pVar2 = new com.bumptech.glide.p(bVar, hVar, iVar, context);
        map.put(tVar, pVar2);
        hVar.n(new m8.j(this, tVar));
        if (z3) {
            pVar2.onStart();
        }
        return pVar2;
    }

    public LinearLayoutManager n() {
        f1 layoutManager = ((RecyclerView) this.f28442b).getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager.getOrientation() != 1) {
            return null;
        }
        return linearLayoutManager;
    }

    @Override // km.f
    public Type o() {
        return (Type) this.f28442b;
    }

    @Override // se.a
    public StackTraceElement[] p(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        se.a[] aVarArr = (se.a[]) this.f28442b;
        StackTraceElement[] stackTraceElementArrP = stackTraceElementArr;
        for (int i4 = 0; i4 < 1; i4++) {
            se.a aVar = aVarArr[i4];
            if (stackTraceElementArrP.length <= 1024) {
                break;
            }
            stackTraceElementArrP = aVar.p(stackTraceElementArr);
        }
        return stackTraceElementArrP.length > 1024 ? ((i7.b) this.f28443c).p(stackTraceElementArrP) : stackTraceElementArrP;
    }

    @Override // pi.i
    public void r() {
        SplashActivity splashActivity = (SplashActivity) this.f28443c;
        ((ViewGroup) splashActivity.findViewById(R.id.content)).setAlpha(0.0f);
        splashActivity.f32744a.a(new jg.n(3, this));
    }

    @Override // hm.v
    public hm.u s() {
        return (vl.e) this.f28442b;
    }

    @Override // pi.i
    public void t(String str) {
        ((rh.b) this.f28442b).run();
    }

    public String toString() {
        switch (this.f28441a) {
            case 7:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f28443c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f28442b;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    sb2.append((String) arrayList.get(i4));
                    if (i4 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(rl.z zVar) {
        d0 d0Var = (d0) this.f28443c;
        try {
            try {
                ((g) this.f28442b).p(d0Var, d0Var.d(zVar));
            } catch (Throwable th2) {
                c1.q(th2);
                th2.printStackTrace();
            }
        } catch (Throwable th3) {
            c1.q(th3);
            j(th3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v(android.content.Context r12, android.content.res.XmlResourceParser r13) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: km.n.v(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public void w(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((x.e) this.f28443c)) {
            ((x.e) this.f28443c).put(new t8.k(cls, cls2, cls3), list);
        }
    }

    public u6.h x(b7.l lVar) {
        u6.h hVarX;
        nk.k.e(lVar, FacebookMediationAdapter.KEY_ID);
        synchronized (this.f28443c) {
            hVarX = ((i) this.f28442b).x(lVar);
        }
        return hVarX;
    }

    @Override // km.f
    public Object y(d0 d0Var) {
        Executor executor = (Executor) this.f28443c;
        return executor == null ? d0Var : new p(executor, d0Var);
    }

    public u6.h z(b7.l lVar) {
        u6.h hVarA;
        synchronized (this.f28443c) {
            hVarA = ((i) this.f28442b).A(lVar);
        }
        return hVarA;
    }

    public /* synthetic */ n(int i4, Object obj, Object obj2) {
        this.f28441a = i4;
        this.f28442b = obj;
        this.f28443c = obj2;
    }

    public /* synthetic */ n(Object obj, boolean z3, Object obj2, int i4) {
        this.f28441a = i4;
        this.f28443c = obj;
        this.f28442b = obj2;
    }

    public n(Context context, h3 h3Var) {
        this.f28441a = 20;
        a4.d dVar = new a4.d();
        try {
            ea.q.b(context);
            dVar.f189b = ea.q.a().c(ca.a.f2822e).a("PLAY_BILLING_LIBRARY", new ba.b("proto"), new i7.b());
        } catch (Throwable unused) {
            dVar.f188a = true;
        }
        this.f28443c = dVar;
        this.f28442b = h3Var;
    }

    public /* synthetic */ n(Object obj) {
        this.f28441a = 7;
        this.f28443c = obj;
        this.f28442b = new ArrayList();
    }

    public n(String str, jm.a aVar, ja.c cVar) {
        this.f28441a = 6;
        this.f28443c = str;
        this.f28442b = aVar;
    }

    public n(byte b10, int i4) {
        this.f28441a = i4;
        switch (i4) {
            case 8:
                nb.e eVar = nb.e.f29897d;
                this.f28442b = new SparseIntArray();
                this.f28443c = eVar;
                break;
            case 22:
                this.f28442b = new x.e0();
                this.f28443c = new x.e0();
                break;
            case 26:
                this.f28442b = new z2.k();
                this.f28443c = new g2(16);
                break;
            default:
                this.f28442b = new AtomicReference();
                this.f28443c = new x.e(0);
                break;
        }
    }

    @Override // pi.i
    public void a() {
    }

    public n(ja.c cVar) {
        this.f28441a = 3;
        this.f28442b = new HashMap();
        this.f28443c = cVar;
    }

    public n(se.a[] aVarArr) {
        this.f28441a = 17;
        this.f28442b = aVarArr;
        this.f28443c = new i7.b();
    }

    public n(ScrollView scrollView, CheckBox checkBox, CheckBox checkBox2) {
        this.f28441a = 12;
        this.f28442b = checkBox;
        this.f28443c = checkBox2;
    }

    public n(LinearLayout linearLayout, ImageView imageView, FrameLayout frameLayout) {
        this.f28441a = 11;
        this.f28442b = linearLayout;
        this.f28443c = frameLayout;
    }

    public n(c0.h0 h0Var) {
        this.f28441a = 23;
        this.f28442b = new AtomicInteger(0);
        this.f28443c = new AtomicBoolean(false);
    }

    public n(RecyclerView recyclerView) {
        this.f28441a = 14;
        this.f28443c = new Rect();
        this.f28442b = recyclerView;
    }

    public n(View view) {
        this.f28441a = 28;
        this.f28442b = view;
        this.f28443c = a.a.t(yj.g.f37636b, new w2.c(0, this));
    }

    public n(i iVar) {
        this.f28441a = 24;
        this.f28442b = iVar;
        this.f28443c = new Object();
    }

    public n(int i4) {
        this.f28441a = 16;
        this.f28442b = new ArrayList();
        this.f28443c = new ArrayList();
    }

    public n(b5.i0 i0Var) {
        this.f28441a = 27;
        wl.f fVar = (wl.f) i0Var.f1823d;
        this.f28442b = new vl.e(i0Var, fVar.f().s(), -1L, true);
        this.f28443c = new vl.f(i0Var, fVar.f().e(), -1L, true);
    }
}
