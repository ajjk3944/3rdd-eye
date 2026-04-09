package K2;

import G3.C0152f;
import M2.u;
import android.content.Context;
import h0.C2351a;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import u.C2937f;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2150a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2151b;

    /* renamed from: c, reason: collision with root package name */
    public final C2351a f2152c;

    /* renamed from: d, reason: collision with root package name */
    public final b f2153d;

    /* renamed from: e, reason: collision with root package name */
    public final L2.a f2154e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2155f;

    /* renamed from: g, reason: collision with root package name */
    public final C0152f f2156g;

    /* renamed from: h, reason: collision with root package name */
    public final L2.c f2157h;

    public f(Context context, C2351a c2351a, b bVar, e eVar) {
        u.f(context, "Null context is not permitted.");
        u.f(c2351a, "Api must not be null.");
        u.f(eVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f2150a = context.getApplicationContext();
        String str = null;
        if (Q2.b.f()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f2151b = str;
        this.f2152c = c2351a;
        this.f2153d = bVar;
        this.f2154e = new L2.a(c2351a, bVar, str);
        L2.c cVarE = L2.c.e(this.f2150a);
        this.f2157h = cVarE;
        this.f2155f = cVarE.f2513h.getAndIncrement();
        this.f2156g = eVar.f2149a;
        W2.e eVar2 = cVarE.f2517m;
        eVar2.sendMessage(eVar2.obtainMessage(7, this));
    }

    public final V2.e a() {
        V2.e eVar = new V2.e(7);
        Set set = Collections.EMPTY_SET;
        if (((C2937f) eVar.f3868b) == null) {
            eVar.f3868b = new C2937f(0);
        }
        ((C2937f) eVar.f3868b).addAll(set);
        Context context = this.f2150a;
        eVar.f3870d = context.getClass().getName();
        eVar.f3869c = context.getPackageName();
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c3.j c(int r17, H3.g r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            c3.f r2 = new c3.f
            r2.<init>()
            c3.j r3 = r2.f5902a
            L2.c r5 = r0.f2157h
            G3.f r12 = r0.f2156g
            W2.e r13 = r5.f2517m
            int r6 = r1.f1798c
            if (r6 == 0) goto L90
            L2.a r7 = r0.f2154e
            boolean r4 = r5.a()
            r8 = 0
            if (r4 != 0) goto L1f
            goto L75
        L1f:
            M2.k r4 = M2.k.b()
            java.lang.Object r4 = r4.f2787a
            M2.l r4 = (M2.l) r4
            r9 = 1
            if (r4 == 0) goto L5e
            boolean r10 = r4.f2789b
            if (r10 != 0) goto L2f
            goto L75
        L2f:
            boolean r4 = r4.f2790c
            j$.util.concurrent.ConcurrentHashMap r10 = r5.f2514j
            java.lang.Object r10 = r10.get(r7)
            L2.k r10 = (L2.k) r10
            if (r10 == 0) goto L5d
            K2.c r11 = r10.f2523b
            boolean r14 = r11 instanceof M2.AbstractC0165e
            if (r14 != 0) goto L42
            goto L75
        L42:
            M2.e r11 = (M2.AbstractC0165e) r11
            M2.C r14 = r11.f2753v
            if (r14 == 0) goto L5d
            boolean r14 = r11.d()
            if (r14 != 0) goto L5d
            M2.f r4 = L2.q.a(r10, r11, r6)
            if (r4 != 0) goto L55
            goto L75
        L55:
            int r8 = r10.f2532l
            int r8 = r8 + r9
            r10.f2532l = r8
            boolean r9 = r4.f2757c
            goto L5e
        L5d:
            r9 = r4
        L5e:
            L2.q r4 = new L2.q
            r10 = 0
            if (r9 == 0) goto L69
            long r14 = java.lang.System.currentTimeMillis()
            goto L6a
        L69:
            r14 = r10
        L6a:
            if (r9 == 0) goto L70
            long r10 = android.os.SystemClock.elapsedRealtime()
        L70:
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r10)
            r8 = r4
        L75:
            if (r8 == 0) goto L90
            r13.getClass()
            L2.i r4 = new L2.i
            r6 = 0
            r4.<init>(r13, r6)
            r3.getClass()
            c3.h r6 = new c3.h
            r6.<init>(r4, r8)
            A1.w r4 = r3.f5912b
            r4.i(r6)
            r3.j()
        L90:
            L2.u r4 = new L2.u
            r6 = r17
            r4.<init>(r6, r1, r2, r12)
            L2.s r1 = new L2.s
            java.util.concurrent.atomic.AtomicInteger r2 = r5.i
            int r2 = r2.get()
            r1.<init>(r4, r2, r0)
            r2 = 4
            android.os.Message r1 = r13.obtainMessage(r2, r1)
            r13.sendMessage(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.f.c(int, H3.g):c3.j");
    }
}
