package j4;

import b4.C0344i;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import o4.C2762a;

/* renamed from: j4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2581m extends g4.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21429a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21430b;

    /* renamed from: c, reason: collision with root package name */
    public final g4.z f21431c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f21432d;

    public C2581m(g4.m mVar, g4.z zVar, Type type) {
        this.f21430b = mVar;
        this.f21431c = zVar;
        this.f21432d = type;
    }

    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        switch (this.f21429a) {
            case 0:
                int iB = c2762a.B();
                if (iB == 9) {
                    c2762a.x();
                    return null;
                }
                Map map = (Map) ((i4.p) this.f21432d).d();
                if (iB == 1) {
                    c2762a.a();
                    while (c2762a.o()) {
                        c2762a.a();
                        Object objB = ((C2581m) this.f21430b).f21431c.b(c2762a);
                        if (map.put(objB, ((C2581m) this.f21431c).f21431c.b(c2762a)) != null) {
                            throw new g4.p("duplicate key: " + objB);
                        }
                        c2762a.h();
                    }
                    c2762a.h();
                } else {
                    c2762a.b();
                    while (c2762a.o()) {
                        C0344i.f5754c.getClass();
                        int iE = c2762a.f22708g;
                        if (iE == 0) {
                            iE = c2762a.e();
                        }
                        if (iE == 13) {
                            c2762a.f22708g = 9;
                        } else if (iE == 12) {
                            c2762a.f22708g = 8;
                        } else {
                            if (iE != 14) {
                                throw c2762a.J("a name");
                            }
                            c2762a.f22708g = 10;
                        }
                        Object objB2 = ((C2581m) this.f21430b).f21431c.b(c2762a);
                        if (map.put(objB2, ((C2581m) this.f21431c).f21431c.b(c2762a)) != null) {
                            throw new g4.p("duplicate key: " + objB2);
                        }
                    }
                    c2762a.k();
                }
                return map;
            default:
                return this.f21431c.b(c2762a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.reflect.Type] */
    @Override // g4.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(o4.C2764c r5, java.lang.Object r6) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r4.f21429a
            switch(r0) {
                case 0: goto L4a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f21432d
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r6 == 0) goto L18
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L13
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L18
        L13:
            java.lang.Class r1 = r6.getClass()
            goto L19
        L18:
            r1 = r0
        L19:
            g4.z r2 = r4.f21431c
            if (r1 == r0) goto L46
            java.lang.Object r0 = r4.f21430b
            g4.m r0 = (g4.m) r0
            n4.a r3 = new n4.a
            r3.<init>(r1)
            g4.z r0 = r0.b(r3)
            boolean r1 = r0 instanceof j4.r
            if (r1 != 0) goto L2f
            goto L45
        L2f:
            r1 = r2
        L30:
            boolean r3 = r1 instanceof j4.AbstractC2590w
            if (r3 == 0) goto L40
            r3 = r1
            j4.w r3 = (j4.AbstractC2590w) r3
            g4.z r3 = r3.d()
            if (r3 != r1) goto L3e
            goto L40
        L3e:
            r1 = r3
            goto L30
        L40:
            boolean r1 = r1 instanceof j4.r
            if (r1 != 0) goto L45
            goto L46
        L45:
            r2 = r0
        L46:
            r2.c(r5, r6)
            return
        L4a:
            java.util.Map r6 = (java.util.Map) r6
            g4.z r0 = r4.f21431c
            j4.m r0 = (j4.C2581m) r0
            if (r6 != 0) goto L56
            r5.o()
            goto L83
        L56:
            r5.d()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L80
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5.m(r2)
            java.lang.Object r1 = r1.getValue()
            r0.c(r5, r1)
            goto L61
        L80:
            r5.k()
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.C2581m.c(o4.c, java.lang.Object):void");
    }

    public C2581m(C2572d c2572d, C2581m c2581m, C2581m c2581m2, i4.p pVar) {
        this.f21430b = c2581m;
        this.f21431c = c2581m2;
        this.f21432d = pVar;
    }
}
