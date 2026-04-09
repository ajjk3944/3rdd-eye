package c8;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.google.android.gms.internal.measurement.b4;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c0 implements l {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f3323a;

    /* renamed from: b, reason: collision with root package name */
    public final l8.n f3324b;

    public c0(d0 d0Var, l8.n nVar) {
        this.f3323a = d0Var;
        this.f3324b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // c8.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(pq.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof c8.z
            if (r0 == 0) goto L13
            r0 = r7
            c8.z r0 = (c8.z) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L1a
        L13:
            c8.z r0 = new c8.z
            rq.c r7 = (rq.c) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.f3383y
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f3381r
            br.t r0 = (br.t) r0
            lf.t1.G(r7)
            goto L72
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            br.t r2 = r0.f3382x
            java.lang.Object r4 = r0.f3381r
            c8.c0 r4 = (c8.c0) r4
            lf.t1.G(r7)
            goto L61
        L42:
            lf.t1.G(r7)
            br.t r7 = new br.t
            r7.<init>()
            c8.x r2 = new c8.x
            r5 = 0
            r2.<init>(r6, r5, r7)
            r0.f3381r = r6
            r0.f3382x = r7
            r0.D = r4
            java.lang.Object r2 = wt.w.x(r2, r0)
            if (r2 != r1) goto L5d
            goto L70
        L5d:
            r4 = r2
            r2 = r7
            r7 = r4
            r4 = r6
        L61:
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            r0.f3381r = r2
            r5 = 0
            r0.f3382x = r5
            r0.D = r3
            android.graphics.drawable.Drawable r7 = r4.c(r7, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            r0 = r2
        L72:
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            boolean r0 = r0.f2914a
            c8.i r1 = new c8.i
            r1.<init>(r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.c0.a(pq.c):java.lang.Object");
    }

    public final ImageDecoder.Source b(d0 d0Var) {
        cv.w wVarF = d0Var.f();
        if (wVarF != null) {
            return ImageDecoder.createSource(wVarF.toFile());
        }
        b4 b4VarH = d0Var.h();
        boolean z10 = b4VarH instanceof a;
        l8.n nVar = this.f3324b;
        if (z10) {
            return ImageDecoder.createSource(nVar.f14948a.getAssets(), ((a) b4VarH).f3314c);
        }
        if (b4VarH instanceof g) {
            return ImageDecoder.createSource(nVar.f14948a.getContentResolver(), ((g) b4VarH).f3339c);
        }
        if (b4VarH instanceof f0) {
            f0 f0Var = (f0) b4VarH;
            if (f0Var.f3336c.equals(nVar.f14948a.getPackageName())) {
                return ImageDecoder.createSource(nVar.f14948a.getResources(), f0Var.f3337d);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 ? ImageDecoder.createSource(d0Var.i().r()) : i10 == 30 ? ImageDecoder.createSource(ByteBuffer.wrap(d0Var.i().r())) : ImageDecoder.createSource(d0Var.b().toFile());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable c(android.graphics.drawable.Drawable r5, rq.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof c8.b0
            if (r0 == 0) goto L13
            r0 = r6
            c8.b0 r0 = (c8.b0) r0
            int r1 = r0.f3320y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3320y = r1
            goto L18
        L13:
            c8.b0 r0 = new c8.b0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f3318r
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r0 = r0.f3320y
            if (r0 == 0) goto L31
            r5 = 1
            if (r0 != r5) goto L29
            lf.t1.G(r6)
            r5 = 0
            r6 = r5
            goto L67
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            lf.t1.G(r6)
            boolean r6 = a1.h.z(r5)
            if (r6 != 0) goto L3b
            return r5
        L3b:
            android.graphics.drawable.AnimatedImageDrawable r6 = a1.h.j(r5)
            l8.n r0 = r4.f3324b
            l8.o r1 = r0.f14957l
            l8.o r0 = r0.f14957l
            java.lang.String r2 = "coil#repeat_count"
            java.util.Map r1 = r1.f14962a
            java.lang.Object r1 = r1.get(r2)
            if (r1 != 0) goto L7d
            a1.h.x(r6)
            java.lang.String r6 = "coil#animation_start_callback"
            java.util.Map r1 = r0.f14962a
            java.lang.Object r6 = r1.get(r6)
            if (r6 != 0) goto L77
            java.lang.String r6 = "coil#animation_end_callback"
            java.util.Map r0 = r0.f14962a
            java.lang.Object r6 = r0.get(r6)
            if (r6 != 0) goto L71
            r6 = r4
        L67:
            e8.b r0 = new e8.b
            l8.n r6 = r6.f3324b
            m8.g r6 = r6.f14952e
            r0.<init>(r5, r6)
            return r0
        L71:
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        L77:
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        L7d:
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.c0.c(android.graphics.drawable.Drawable, rq.c):android.graphics.drawable.Drawable");
    }
}
