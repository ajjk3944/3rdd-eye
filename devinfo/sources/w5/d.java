package w5;

import com.google.android.gms.internal.measurement.d5;
import ek.j;
import t5.v;
import t5.w;
import v5.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements w, s {

    /* renamed from: a, reason: collision with root package name */
    public final a f36477a;

    public d(a aVar) {
        this.f36477a = aVar;
    }

    @Override // t5.m
    public final Object a(String str, mk.c cVar, ek.c cVar2) throws Exception {
        g gVarS = this.f36477a.S(str);
        try {
            Object objInvoke = cVar.invoke(gVarS);
            d5.c(gVarS, null);
            return objInvoke;
        } finally {
        }
    }

    @Override // t5.w
    public final Object b(v vVar, mk.e eVar, j jVar) {
        return e(vVar, eVar, jVar);
    }

    @Override // v5.s
    public final d6.a c() {
        return this.f36477a;
    }

    @Override // t5.w
    public final Object d(j jVar) {
        return Boolean.valueOf(this.f36477a.f36470a.K());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(t5.v r5, mk.e r6, ek.c r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof w5.c
            if (r0 == 0) goto L13
            r0 = r7
            w5.c r0 = (w5.c) r0
            int r1 = r0.f36476e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36476e = r1
            goto L18
        L13:
            w5.c r0 = new w5.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f36474c
            int r1 = r0.f36476e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            e6.a r5 = r0.f36473b
            w5.d r6 = r0.f36472a
            ci.b.D(r7)     // Catch: java.lang.Throwable -> L29
            goto L72
        L29:
            r7 = move-exception
            goto L87
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            ci.b.D(r7)
            w5.a r7 = r4.f36477a
            e6.a r7 = r7.f36470a
            r7.K()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L56
            if (r5 == r2) goto L52
            r1 = 2
            if (r5 != r1) goto L4c
            r7.f()
            goto L59
        L4c:
            ac.m r5 = new ac.m
            r5.<init>()
            throw r5
        L52:
            r7.u()
            goto L59
        L56:
            r7.o()
        L59:
            v5.l r5 = new v5.l     // Catch: java.lang.Throwable -> L82
            r1 = 1
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L82
            r0.f36472a = r4     // Catch: java.lang.Throwable -> L82
            r0.f36473b = r7     // Catch: java.lang.Throwable -> L82
            r0.f36476e = r2     // Catch: java.lang.Throwable -> L82
            java.lang.Object r5 = r6.invoke(r5, r0)     // Catch: java.lang.Throwable -> L82
            dk.a r6 = dk.a.f22275a
            if (r5 != r6) goto L6e
            return r6
        L6e:
            r6 = r7
            r7 = r5
            r5 = r6
            r6 = r4
        L72:
            r5.t()     // Catch: java.lang.Throwable -> L29
            r5.B()
            boolean r5 = r5.K()
            if (r5 != 0) goto L81
            r6.getClass()
        L81:
            return r7
        L82:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r6
            r6 = r4
        L87:
            r5.B()
            boolean r5 = r5.K()
            if (r5 != 0) goto L93
            r6.getClass()
        L93:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.d.e(t5.v, mk.e, ek.c):java.lang.Object");
    }
}
