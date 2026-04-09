package z7;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import ar.n;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.EnumMap;
import zc.c1;
import zc.d2;
import zc.e3;
import zc.j0;
import zc.n1;
import zc.r0;
import zc.r1;

/* loaded from: classes.dex */
public final class j implements v3.m, zt.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26705a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f26706d;

    public /* synthetic */ j(int i10, Object obj) {
        this.f26705a = i10;
        this.f26706d = obj;
    }

    public String b(Object obj) throws IOException {
        StringWriter stringWriter = new StringWriter();
        try {
            zf.c cVar = (zf.c) this.f26706d;
            zf.d dVar = new zf.d(stringWriter, cVar.f27371a, cVar.f27372b, cVar.f27373c, cVar.f27374d);
            dVar.h(obj);
            dVar.j();
            dVar.f27376b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public void c() {
        e3 e3Var = (e3) this.f26706d;
        e3Var.s1();
        c1 c1Var = (c1) e3Var.f1504d;
        r0 r0Var = c1Var.f26888x;
        c1.e(r0Var);
        gc.a aVar = c1Var.G;
        aVar.getClass();
        if (r0Var.C1(System.currentTimeMillis())) {
            r0 r0Var2 = c1Var.f26888x;
            c1.e(r0Var2);
            r0Var2.I.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                j0 j0Var = c1Var.f26889y;
                c1.g(j0Var);
                j0Var.K.b("Detected application was in foreground");
                aVar.getClass();
                h(System.currentTimeMillis());
            }
        }
    }

    @Override // v3.m
    public boolean d(View view) {
        js.e eVar = (js.e) this.f26706d;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) eVar.f13797d;
        if (viewPager2.M) {
            viewPager2.b(currentItem, true);
        }
        return true;
    }

    public boolean e() {
        j0 j0Var = ((c1) this.f26706d).f26889y;
        c1.g(j0Var);
        return Log.isLoggable(j0Var.C1(), 3);
    }

    public void f(long j) {
        e3 e3Var = (e3) this.f26706d;
        e3Var.s1();
        e3Var.w1();
        c1 c1Var = (c1) e3Var.f1504d;
        r0 r0Var = c1Var.f26888x;
        c1.e(r0Var);
        if (r0Var.C1(j)) {
            c1.e(r0Var);
            r0Var.I.b(true);
            c1Var.l().x1();
        }
        c1.e(r0Var);
        r0Var.M.f(j);
        if (r0Var.I.a()) {
            h(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(zc.n1 r3, int r4) {
        /*
            r2 = this;
            zc.g r0 = zc.g.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            zc.g r0 = zc.g.INITIALIZATION
            goto L20
        L18:
            zc.g r0 = zc.g.MANIFEST
            goto L20
        L1b:
            zc.g r0 = zc.g.API
            goto L20
        L1e:
            zc.g r0 = zc.g.TCF
        L20:
            java.lang.Object r4 = r2.f26706d
            java.util.EnumMap r4 = (java.util.EnumMap) r4
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.j.g(zc.n1, int):void");
    }

    public void h(long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        e3 e3Var = (e3) this.f26706d;
        e3Var.s1();
        c1 c1Var = (c1) e3Var.f1504d;
        if (c1Var.a()) {
            r0 r0Var = c1Var.f26888x;
            c1.e(r0Var);
            r0Var.M.f(j);
            c1Var.G.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.K.c(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j7 = j / 1000;
            Long lValueOf = Long.valueOf(j7);
            d2 d2Var = c1Var.I;
            c1.f(d2Var);
            d2Var.D1(j, lValueOf, "auto", "_sid");
            c1.e(r0Var);
            r0Var.N.f(j7);
            r0Var.I.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j7);
            c1.f(d2Var);
            d2Var.A1(j, bundle, "auto", "_s");
            String strN = r0Var.S.n();
            if (TextUtils.isEmpty(strN)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strN);
            c1.f(d2Var);
            d2Var.A1(j, bundle2, "auto", "_ssr");
        }
    }

    public void i(n1 n1Var, zc.g gVar) {
        ((EnumMap) this.f26706d).put((EnumMap) n1Var, (n1) gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v4, types: [ar.n, rq.j] */
    @Override // zt.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object l(zt.g r7, pq.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zt.a
            if (r0 == 0) goto L13
            r0 = r8
            zt.a r0 = (zt.a) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            zt.a r0 = new zt.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f27522x
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            lq.b0 r3 = lq.b0.f15562a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            au.s r7 = r0.f27521r
            lf.t1.G(r8)     // Catch: java.lang.Throwable -> L2b
            goto L56
        L2b:
            r8 = move-exception
            goto L60
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            lf.t1.G(r8)
            au.s r8 = new au.s
            pq.h r2 = r0.f21666d
            br.l.b(r2)
            r8.<init>(r7, r2)
            r0.f27521r = r8     // Catch: java.lang.Throwable -> L5e
            r0.B = r4     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r6.f26706d     // Catch: java.lang.Throwable -> L5e
            rq.j r7 = (rq.j) r7     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r7.w(r8, r0)     // Catch: java.lang.Throwable -> L5e
            if (r7 != r1) goto L51
            goto L52
        L51:
            r7 = r3
        L52:
            if (r7 != r1) goto L55
            return r1
        L55:
            r7 = r8
        L56:
            r7.r()
            return r3
        L5a:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L60
        L5e:
            r7 = move-exception
            goto L5a
        L60:
            r7.r()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.j.l(zt.g, pq.c):java.lang.Object");
    }

    public String toString() {
        switch (this.f26705a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("1");
                for (n1 n1Var : n1.values()) {
                    zc.g gVar = (zc.g) ((EnumMap) this.f26706d).get(n1Var);
                    if (gVar == null) {
                        gVar = zc.g.UNSET;
                    }
                    sb2.append(gVar.zzb());
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public j() {
        this.f26705a = 1;
        this.f26706d = new EnumMap(n1.class);
    }

    public j(r1 r1Var, c1 c1Var) {
        this.f26705a = 3;
        this.f26706d = c1Var;
    }

    public j(EnumMap enumMap) {
        this.f26705a = 1;
        EnumMap enumMap2 = new EnumMap(n1.class);
        this.f26706d = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public j(z4.e eVar, cj.a aVar) {
        this.f26705a = 6;
        br.l.e(eVar, "serverResponseTestServerConfigMapper");
        this.f26706d = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(n nVar) {
        this.f26705a = 7;
        this.f26706d = (rq.j) nVar;
    }
}
