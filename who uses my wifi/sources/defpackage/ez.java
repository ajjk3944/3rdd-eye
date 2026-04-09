package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ez {
    public final Context f;
    public final String g;
    public final gw3 h;
    public final u4 i;
    public final c5 j;
    public final int k;
    public final fr l;
    public final jz m;

    public ez(Context context, gw3 gw3Var, u4 u4Var, dz dzVar) {
        ou1.k(context, "Null context is not permitted.");
        ou1.k(gw3Var, "Api must not be null.");
        ou1.k(dzVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f = context.getApplicationContext();
        String str = null;
        if (ob1.m()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.g = str;
        this.h = gw3Var;
        this.i = u4Var;
        this.j = new c5(gw3Var, u4Var, str);
        jz jzVarE = jz.e(this.f);
        this.m = jzVarE;
        this.k = jzVarE.m.getAndIncrement();
        this.l = dzVar.a;
        wc1 wc1Var = jzVarE.r;
        wc1Var.sendMessage(wc1Var.obtainMessage(7, this));
    }

    public final xb4 a() {
        xb4 xb4Var = new xb4(4);
        Set set = Collections.EMPTY_SET;
        if (((u8) xb4Var.g) == null) {
            xb4Var.g = new u8(0);
        }
        ((u8) xb4Var.g).addAll(set);
        Context context = this.f;
        xb4Var.i = context.getClass().getName();
        xb4Var.h = context.getPackageName();
        return xb4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.gi4 b(int r17, defpackage.rb r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            k01 r2 = new k01
            r2.<init>()
            gi4 r3 = r2.a
            jz r5 = r0.m
            fr r12 = r0.l
            wc1 r13 = r5.r
            int r6 = r1.b
            if (r6 == 0) goto L90
            c5 r7 = r0.j
            boolean r4 = r5.a()
            r8 = 0
            if (r4 != 0) goto L1f
            goto L75
        L1f:
            sq0 r4 = defpackage.sq0.k()
            java.lang.Object r4 = r4.g
            tq0 r4 = (defpackage.tq0) r4
            r9 = 1
            if (r4 == 0) goto L5e
            boolean r10 = r4.g
            if (r10 != 0) goto L2f
            goto L75
        L2f:
            boolean r4 = r4.h
            java.util.concurrent.ConcurrentHashMap r10 = r5.o
            java.lang.Object r10 = r10.get(r7)
            xb1 r10 = (defpackage.xb1) r10
            if (r10 == 0) goto L5d
            v4 r11 = r10.g
            boolean r14 = r11 instanceof defpackage.w9
            if (r14 != 0) goto L42
            goto L75
        L42:
            w9 r11 = (defpackage.w9) r11
            eb4 r14 = r11.v
            if (r14 == 0) goto L5d
            boolean r14 = r11.f()
            if (r14 != 0) goto L5d
            sh r4 = defpackage.hc1.a(r10, r11, r6)
            if (r4 != 0) goto L55
            goto L75
        L55:
            int r8 = r10.q
            int r8 = r8 + r9
            r10.q = r8
            boolean r9 = r4.h
            goto L5e
        L5d:
            r9 = r4
        L5e:
            hc1 r4 = new hc1
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
            vb1 r4 = new vb1
            r6 = 0
            r4.<init>(r13, r6)
            r3.getClass()
            mn2 r6 = new mn2
            r6.<init>(r4, r8)
            wy0 r4 = r3.b
            r4.c(r6)
            r3.h()
        L90:
            pc1 r4 = new pc1
            r6 = r17
            r4.<init>(r6, r1, r2, r12)
            jc1 r1 = new jc1
            java.util.concurrent.atomic.AtomicInteger r2 = r5.n
            int r2 = r2.get()
            r1.<init>(r4, r2, r0)
            r2 = 4
            android.os.Message r1 = r13.obtainMessage(r2, r1)
            r13.sendMessage(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez.b(int, rb):gi4");
    }
}
