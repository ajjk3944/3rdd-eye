package lr;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final et.d f15694a = new et.d();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, lq.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final mr.g e(lr.d1 r8, boolean r9) throws java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.t1.e(lr.d1, boolean):mr.g");
    }

    public static final String g(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        br.l.d(parameterTypes, "parameterTypes");
        sb2.append(mq.l.u0(parameterTypes, "(", ")", b.G, 24));
        Class<?> returnType = method.getReturnType();
        br.l.d(returnType, "returnType");
        sb2.append(xr.d.b(returnType));
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final mr.v j(lr.d1 r4, boolean r5, java.lang.reflect.Field r6) {
        /*
            lr.j1 r0 = r4.G()
            rr.m0 r0 = r0.C()
            rr.l r1 = r0.o()
            java.lang.String r2 = "containingDeclaration"
            br.l.d(r1, r2)
            boolean r2 = ts.d.l(r1)
            r3 = 1
            if (r2 != 0) goto L19
            goto L3c
        L19:
            rr.l r1 = r1.o()
            rr.g r2 = rr.g.INTERFACE
            boolean r2 = ts.d.n(r1, r2)
            if (r2 != 0) goto L2d
            rr.g r2 = rr.g.ANNOTATION_CLASS
            boolean r1 = ts.d.n(r1, r2)
            if (r1 == 0) goto L46
        L2d:
            boolean r1 = r0 instanceof ft.s
            if (r1 == 0) goto L3c
            ft.s r0 = (ft.s) r0
            ls.g0 r0 = r0.X
            boolean r0 = ps.i.d(r0)
            if (r0 == 0) goto L3c
            goto L46
        L3c:
            int r0 = r6.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L86
        L46:
            java.lang.String r0 = "field"
            if (r5 == 0) goto L64
            boolean r5 = r4.E()
            if (r5 == 0) goto L5a
            mr.j r5 = new mr.j
            java.lang.Object r4 = m(r4)
            r5.<init>(r6, r4)
            return r5
        L5a:
            mr.l r4 = new mr.l
            br.l.e(r6, r0)
            r5 = 0
            r4.<init>(r6, r3, r5)
            return r4
        L64:
            boolean r5 = r4.E()
            if (r5 == 0) goto L78
            mr.n r5 = new mr.n
            boolean r0 = k(r4)
            java.lang.Object r4 = m(r4)
            r5.<init>(r6, r0, r4)
            return r5
        L78:
            mr.p r5 = new mr.p
            boolean r4 = k(r4)
            br.l.e(r6, r0)
            r0 = 0
            r5.<init>(r6, r4, r3, r0)
            return r5
        L86:
            lr.j1 r0 = r4.G()
            rr.m0 r0 = r0.C()
            sr.h r0 = r0.getAnnotations()
            qs.c r1 = lr.z1.f15721a
            boolean r0 = r0.G(r1)
            r1 = 0
            if (r0 == 0) goto Lcb
            if (r5 == 0) goto Lb0
            boolean r4 = r4.E()
            if (r4 == 0) goto La9
            mr.k r4 = new mr.k
            r4.<init>(r6, r1)
            return r4
        La9:
            mr.l r4 = new mr.l
            r5 = 1
            r4.<init>(r6, r3, r5)
            return r4
        Lb0:
            boolean r5 = r4.E()
            if (r5 == 0) goto Lc0
            mr.o r5 = new mr.o
            boolean r4 = k(r4)
            r5.<init>(r6, r4, r1)
            return r5
        Lc0:
            mr.p r5 = new mr.p
            boolean r4 = k(r4)
            r0 = 1
            r5.<init>(r6, r4, r3, r0)
            return r5
        Lcb:
            if (r5 == 0) goto Ld4
            mr.l r4 = new mr.l
            r5 = 2
            r4.<init>(r6, r1, r5)
            return r4
        Ld4:
            mr.p r5 = new mr.p
            boolean r4 = k(r4)
            r0 = 2
            r5.<init>(r6, r4, r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.t1.j(lr.d1, boolean, java.lang.reflect.Field):mr.v");
    }

    public static final boolean k(d1 d1Var) {
        return !ht.a1.e(d1Var.G().C().getType());
    }

    public static final Object m(d1 d1Var) {
        j1 j1VarG = d1Var.G();
        return kc.f.n(j1VarG.D, j1VarG.C());
    }

    public static r1 n(rr.d dVar, ar.a aVar) {
        if (aVar != null) {
            return new r1(dVar, aVar);
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public abstract String i();
}
