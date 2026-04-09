package i4;

import g4.z;
import n4.C2689a;

/* loaded from: classes.dex */
public final class d extends z {

    /* renamed from: a, reason: collision with root package name */
    public volatile z f20590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f20591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f20592c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g4.m f20593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2689a f20594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f20595f;

    public d(e eVar, boolean z6, boolean z7, g4.m mVar, C2689a c2689a) {
        this.f20595f = eVar;
        this.f20591b = z6;
        this.f20592c = z7;
        this.f20593d = mVar;
        this.f20594e = c2689a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[SYNTHETIC] */
    @Override // g4.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(o4.C2762a r11) throws java.io.IOException {
        /*
            r10 = this;
            boolean r0 = r10.f20591b
            if (r0 == 0) goto L9
            r11.H()
            r11 = 0
            return r11
        L9:
            g4.z r0 = r10.f20590a
            if (r0 != 0) goto La0
            g4.m r0 = r10.f20593d
            i4.e r1 = r10.f20595f
            n4.a r2 = r10.f20594e
            j4.k r3 = r0.f20237d
            r3.getClass()
            j$.util.concurrent.ConcurrentHashMap r4 = r3.f21427b
            j4.j r5 = j4.C2579k.f21425c
            r6 = 1
            if (r1 != r5) goto L20
            goto L61
        L20:
            java.lang.Class r5 = r2.f22327a
            java.lang.Object r7 = r4.get(r5)
            g4.A r7 = (g4.InterfaceC2336A) r7
            if (r7 == 0) goto L2d
            if (r7 != r1) goto L62
            goto L61
        L2d:
            java.lang.Class<h4.a> r7 = h4.InterfaceC2365a.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            h4.a r7 = (h4.InterfaceC2365a) r7
            if (r7 != 0) goto L38
            goto L62
        L38:
            java.lang.Class r7 = r7.value()
            java.lang.Class<g4.A> r8 = g4.InterfaceC2336A.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 != 0) goto L45
            goto L62
        L45:
            b4.i r8 = r3.f21426a
            n4.a r9 = new n4.a
            r9.<init>(r7)
            i4.p r7 = r8.r(r9, r6)
            java.lang.Object r7 = r7.d()
            g4.A r7 = (g4.InterfaceC2336A) r7
            java.lang.Object r4 = r4.putIfAbsent(r5, r7)
            g4.A r4 = (g4.InterfaceC2336A) r4
            if (r4 == 0) goto L5f
            r7 = r4
        L5f:
            if (r7 != r1) goto L62
        L61:
            r1 = r3
        L62:
            java.util.List r3 = r0.f20238e
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L69:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L83
            java.lang.Object r5 = r3.next()
            g4.A r5 = (g4.InterfaceC2336A) r5
            if (r4 != 0) goto L7b
            if (r5 != r1) goto L69
            r4 = r6
            goto L69
        L7b:
            g4.z r5 = r5.a(r0, r2)
            if (r5 == 0) goto L69
            r0 = r5
            goto L89
        L83:
            if (r4 != 0) goto L8c
            g4.z r0 = r0.b(r2)
        L89:
            r10.f20590a = r0
            goto La0
        L8c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        La0:
            java.lang.Object r11 = r0.b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.d.b(o4.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082 A[SYNTHETIC] */
    @Override // g4.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(o4.C2764c r11, java.lang.Object r12) throws java.io.IOException {
        /*
            r10 = this;
            boolean r0 = r10.f20592c
            if (r0 == 0) goto L8
            r11.o()
            return
        L8:
            g4.z r0 = r10.f20590a
            if (r0 != 0) goto L9f
            g4.m r0 = r10.f20593d
            i4.e r1 = r10.f20595f
            n4.a r2 = r10.f20594e
            j4.k r3 = r0.f20237d
            r3.getClass()
            j$.util.concurrent.ConcurrentHashMap r4 = r3.f21427b
            j4.j r5 = j4.C2579k.f21425c
            r6 = 1
            if (r1 != r5) goto L1f
            goto L60
        L1f:
            java.lang.Class r5 = r2.f22327a
            java.lang.Object r7 = r4.get(r5)
            g4.A r7 = (g4.InterfaceC2336A) r7
            if (r7 == 0) goto L2c
            if (r7 != r1) goto L61
            goto L60
        L2c:
            java.lang.Class<h4.a> r7 = h4.InterfaceC2365a.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            h4.a r7 = (h4.InterfaceC2365a) r7
            if (r7 != 0) goto L37
            goto L61
        L37:
            java.lang.Class r7 = r7.value()
            java.lang.Class<g4.A> r8 = g4.InterfaceC2336A.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 != 0) goto L44
            goto L61
        L44:
            b4.i r8 = r3.f21426a
            n4.a r9 = new n4.a
            r9.<init>(r7)
            i4.p r7 = r8.r(r9, r6)
            java.lang.Object r7 = r7.d()
            g4.A r7 = (g4.InterfaceC2336A) r7
            java.lang.Object r4 = r4.putIfAbsent(r5, r7)
            g4.A r4 = (g4.InterfaceC2336A) r4
            if (r4 == 0) goto L5e
            r7 = r4
        L5e:
            if (r7 != r1) goto L61
        L60:
            r1 = r3
        L61:
            java.util.List r3 = r0.f20238e
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L68:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L82
            java.lang.Object r5 = r3.next()
            g4.A r5 = (g4.InterfaceC2336A) r5
            if (r4 != 0) goto L7a
            if (r5 != r1) goto L68
            r4 = r6
            goto L68
        L7a:
            g4.z r5 = r5.a(r0, r2)
            if (r5 == 0) goto L68
            r0 = r5
            goto L88
        L82:
            if (r4 != 0) goto L8b
            g4.z r0 = r0.b(r2)
        L88:
            r10.f20590a = r0
            goto L9f
        L8b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "GSON cannot serialize or deserialize "
            r12.<init>(r0)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L9f:
            r0.c(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.d.c(o4.c, java.lang.Object):void");
    }
}
