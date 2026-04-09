package v5;

import java.util.concurrent.atomic.AtomicBoolean;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final j f35869a;

    /* renamed from: b, reason: collision with root package name */
    public final j f35870b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreadLocal f35871c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f35872d;

    /* renamed from: e, reason: collision with root package name */
    public final long f35873e;

    public e(km.o oVar) {
        this.f35871c = new ThreadLocal();
        this.f35872d = new AtomicBoolean(false);
        int i4 = wk.a.f36814d;
        this.f35873e = com.bumptech.glide.d.D(30, wk.c.SECONDS);
        j jVar = new j(1, new a6.e(26, oVar));
        this.f35869a = jVar;
        this.f35870b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b3 A[Catch: all -> 0x01d2, TryCatch #8 {all -> 0x01d2, blocks: (B:106:0x01ad, B:108:0x01b3, B:113:0x01ce, B:117:0x01d8, B:121:0x01e2, B:132:0x0237, B:133:0x023e, B:134:0x023f, B:135:0x0240, B:136:0x0245), top: B:172:0x01ad }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021d A[Catch: all -> 0x0236, TRY_LEAVE, TryCatch #9 {all -> 0x0236, blocks: (B:125:0x0217, B:127:0x021d, B:129:0x0227, B:130:0x022c), top: B:173:0x0217 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0240 A[Catch: all -> 0x01d2, TryCatch #8 {all -> 0x01d2, blocks: (B:106:0x01ad, B:108:0x01b3, B:113:0x01ce, B:117:0x01d8, B:121:0x01e2, B:132:0x0237, B:133:0x023e, B:134:0x023f, B:135:0x0240, B:136:0x0245), top: B:172:0x01ad }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // v5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object I(boolean r23, mk.e r24, ek.c r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.e.I(boolean, mk.e, ek.c):java.lang.Object");
    }

    public final void c(boolean z3) {
        String str = z3 ? "reader" : "writer";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Timed out attempting to acquire a " + str + " connection.");
        sb2.append("\n\nWriter pool:\n");
        this.f35870b.c(sb2);
        sb2.append("Reader pool:");
        sb2.append('\n');
        this.f35869a.c(sb2);
        i0.v(5, sb2.toString());
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f35872d.compareAndSet(false, true)) {
            this.f35869a.b();
            this.f35870b.b();
        }
    }

    public e(final km.o oVar, final String str, int i4) {
        nk.k.e(str, "fileName");
        this.f35871c = new ThreadLocal();
        final int i10 = 0;
        this.f35872d = new AtomicBoolean(false);
        int i11 = wk.a.f36814d;
        this.f35873e = com.bumptech.glide.d.D(30, wk.c.SECONDS);
        if (i4 > 0) {
            this.f35869a = new j(i4, new mk.a() { // from class: v5.c
                @Override // mk.a
                public final Object invoke() throws Exception {
                    switch (i10) {
                        case 0:
                            d6.a aVarH = oVar.h(str);
                            i0.g(aVarH, "PRAGMA query_only = 1");
                            return aVarH;
                        default:
                            return oVar.h(str);
                    }
                }
            });
            final int i12 = 1;
            this.f35870b = new j(1, new mk.a() { // from class: v5.c
                @Override // mk.a
                public final Object invoke() throws Exception {
                    switch (i12) {
                        case 0:
                            d6.a aVarH = oVar.h(str);
                            i0.g(aVarH, "PRAGMA query_only = 1");
                            return aVarH;
                        default:
                            return oVar.h(str);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
