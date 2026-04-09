package ob;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.Set;
import km.n;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30485a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30486b;

    /* renamed from: c, reason: collision with root package name */
    public final n f30487c;

    /* renamed from: d, reason: collision with root package name */
    public final b f30488d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.a f30489e;

    /* renamed from: f, reason: collision with root package name */
    public final int f30490f;
    public final ed.f g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.d f30491h;

    public f(Context context, n nVar, b bVar, e eVar) {
        y.i(context, "Null context is not permitted.");
        y.i(nVar, "Api must not be null.");
        y.i(eVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        y.i(applicationContext, "The provided context did not have an application context.");
        this.f30485a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f30486b = attributionTag;
        this.f30487c = nVar;
        this.f30488d = bVar;
        this.f30489e = new com.google.android.gms.common.api.internal.a(nVar, bVar, attributionTag);
        com.google.android.gms.common.api.internal.d dVarE = com.google.android.gms.common.api.internal.d.e(applicationContext);
        this.f30491h = dVarE;
        this.f30490f = dVarE.f9088h.getAndIncrement();
        this.g = eVar.f30484a;
        ac.k kVar = dVarE.f9092m;
        kVar.sendMessage(kVar.obtainMessage(7, this));
    }

    public final i0.f a() {
        i0.f fVar = new i0.f(13, false);
        Set set = Collections.EMPTY_SET;
        if (((x.f) fVar.f25416b) == null) {
            fVar.f25416b = new x.f(0);
        }
        ((x.f) fVar.f25416b).addAll(set);
        Context context = this.f30485a;
        fVar.f25418d = context.getClass().getName();
        fVar.f25417c = context.getPackageName();
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.tasks.Task b(int r14, com.google.android.gms.common.api.internal.k r15) {
        /*
            r13 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            ed.f r1 = r13.g
            com.google.android.gms.common.api.internal.d r3 = r13.f30491h
            ac.k r10 = r3.f9092m
            int r4 = r15.f9098d
            if (r4 == 0) goto L80
            com.google.android.gms.common.api.internal.a r5 = r13.f30489e
            boolean r2 = r3.a()
            if (r2 != 0) goto L18
            goto L55
        L18:
            pb.k r2 = pb.k.b()
            java.lang.Object r2 = r2.f31634a
            pb.l r2 = (pb.l) r2
            r6 = 1
            if (r2 == 0) goto L57
            boolean r7 = r2.f31644b
            if (r7 == 0) goto L55
            boolean r2 = r2.f31645c
            j$.util.concurrent.ConcurrentHashMap r7 = r3.j
            java.lang.Object r7 = r7.get(r5)
            com.google.android.gms.common.api.internal.n r7 = (com.google.android.gms.common.api.internal.n) r7
            if (r7 == 0) goto L53
            ob.c r8 = r7.f9102b
            boolean r9 = r8 instanceof pb.e
            if (r9 == 0) goto L55
            pb.e r8 = (pb.e) r8
            pb.g0 r9 = r8.f31586v
            if (r9 == 0) goto L53
            boolean r9 = r8.c()
            if (r9 != 0) goto L53
            pb.f r2 = com.google.android.gms.common.api.internal.t.a(r7, r8, r4)
            if (r2 == 0) goto L55
            int r8 = r7.f9110l
            int r8 = r8 + r6
            r7.f9110l = r8
            boolean r6 = r2.f31591c
            goto L57
        L53:
            r6 = r2
            goto L57
        L55:
            r2 = 0
            goto L6e
        L57:
            com.google.android.gms.common.api.internal.t r2 = new com.google.android.gms.common.api.internal.t
            r7 = 0
            if (r6 == 0) goto L62
            long r11 = java.lang.System.currentTimeMillis()
            goto L63
        L62:
            r11 = r7
        L63:
            if (r6 == 0) goto L69
            long r7 = android.os.SystemClock.elapsedRealtime()
        L69:
            r8 = r7
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r8)
        L6e:
            if (r2 == 0) goto L80
            com.google.android.gms.tasks.Task r4 = r0.getTask()
            r10.getClass()
            b4.n r5 = new b4.n
            r6 = 1
            r5.<init>(r10, r6)
            r4.addOnCompleteListener(r5, r2)
        L80:
            com.google.android.gms.common.api.internal.x r2 = new com.google.android.gms.common.api.internal.x
            r2.<init>(r14, r15, r0, r1)
            java.util.concurrent.atomic.AtomicInteger r14 = r3.f9089i
            com.google.android.gms.common.api.internal.v r15 = new com.google.android.gms.common.api.internal.v
            int r14 = r14.get()
            r15.<init>(r2, r14, r13)
            r14 = 4
            android.os.Message r14 = r10.obtainMessage(r14, r15)
            r10.sendMessage(r14)
            com.google.android.gms.tasks.Task r14 = r0.getTask()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.f.b(int, com.google.android.gms.common.api.internal.k):com.google.android.gms.tasks.Task");
    }
}
