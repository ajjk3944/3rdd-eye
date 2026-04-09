package km;

import java.lang.reflect.InvocationHandler;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w0 implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f28516a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f28517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ va.o f28518c;

    public w0(va.o oVar, Class cls) {
        this.f28518c = oVar;
        this.f28517b = cls;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        r1 = km.v.b(r10, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        ((j$.util.concurrent.ConcurrentHashMap) r10.f36146b).put(r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        r9 = (km.v) r2;
     */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.reflect.Method r9, java.lang.Object[] r10) {
        /*
            r7 = this;
            java.lang.Class r0 = r7.f28517b
            java.lang.Class r1 = r9.getDeclaringClass()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 != r2) goto Lf
            java.lang.Object r8 = r9.invoke(r7, r10)
            return r8
        Lf:
            if (r10 == 0) goto L13
        L11:
            r4 = r10
            goto L16
        L13:
            java.lang.Object[] r10 = r7.f28516a
            goto L11
        L16:
            km.a r10 = km.o0.f28448b
            boolean r1 = r10.e(r9)
            if (r1 == 0) goto L23
            java.lang.Object r8 = r10.d(r9, r0, r8, r4)
            return r8
        L23:
            va.o r10 = r7.f28518c
        L25:
            java.lang.Object r1 = r10.f36146b
            j$.util.concurrent.ConcurrentHashMap r1 = (j$.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r9)
            boolean r2 = r1 instanceof km.v
            if (r2 == 0) goto L35
            km.v r1 = (km.v) r1
        L33:
            r9 = r1
            goto L79
        L35:
            if (r1 != 0) goto L65
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            monitor-enter(r2)
            java.lang.Object r1 = r10.f36146b     // Catch: java.lang.Throwable -> L54
            j$.util.concurrent.ConcurrentHashMap r1 = (j$.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L54
            java.lang.Object r1 = r1.putIfAbsent(r9, r2)     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L61
            km.v r1 = km.v.b(r10, r0, r9)     // Catch: java.lang.Throwable -> L57
            java.lang.Object r10 = r10.f36146b     // Catch: java.lang.Throwable -> L54
            j$.util.concurrent.ConcurrentHashMap r10 = (j$.util.concurrent.ConcurrentHashMap) r10     // Catch: java.lang.Throwable -> L54
            r10.put(r9, r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            goto L33
        L54:
            r0 = move-exception
            r8 = r0
            goto L63
        L57:
            r0 = move-exception
            r8 = r0
            java.lang.Object r10 = r10.f36146b     // Catch: java.lang.Throwable -> L54
            j$.util.concurrent.ConcurrentHashMap r10 = (j$.util.concurrent.ConcurrentHashMap) r10     // Catch: java.lang.Throwable -> L54
            r10.remove(r9)     // Catch: java.lang.Throwable -> L54
            throw r8     // Catch: java.lang.Throwable -> L54
        L61:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            goto L65
        L63:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            throw r8
        L65:
            monitor-enter(r1)
            java.lang.Object r2 = r10.f36146b     // Catch: java.lang.Throwable -> L72
            j$.util.concurrent.ConcurrentHashMap r2 = (j$.util.concurrent.ConcurrentHashMap) r2     // Catch: java.lang.Throwable -> L72
            java.lang.Object r2 = r2.get(r9)     // Catch: java.lang.Throwable -> L72
            if (r2 != 0) goto L75
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            goto L25
        L72:
            r0 = move-exception
            r8 = r0
            goto L8a
        L75:
            r9 = r2
            km.v r9 = (km.v) r9     // Catch: java.lang.Throwable -> L72
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
        L79:
            km.d0 r1 = new km.d0
            km.u0 r2 = r9.f28507a
            rl.d r5 = r9.f28508b
            km.m r6 = r9.f28509c
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r8 = r9.a(r1, r4)
            return r8
        L8a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: km.w0.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
