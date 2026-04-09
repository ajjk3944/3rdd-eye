package com.google.common.base;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class e {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f11584a;

        /* renamed from: b, reason: collision with root package name */
        public final C0215b f11585b;

        /* renamed from: c, reason: collision with root package name */
        public C0215b f11586c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f11587d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f11588e;

        public static final class a extends C0215b {
            public a() {
                super();
            }
        }

        /* renamed from: com.google.common.base.e$b$b, reason: collision with other inner class name */
        public static class C0215b {

            /* renamed from: a, reason: collision with root package name */
            public String f11589a;

            /* renamed from: b, reason: collision with root package name */
            public Object f11590b;

            /* renamed from: c, reason: collision with root package name */
            public C0215b f11591c;

            public C0215b() {
            }
        }

        public static boolean h(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof Optional ? !((Optional) obj).g() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b a(String str, double d10) {
            return g(str, String.valueOf(d10));
        }

        public b b(String str, long j10) {
            return g(str, String.valueOf(j10));
        }

        public b c(String str, Object obj) {
            return e(str, obj);
        }

        public final C0215b d() {
            C0215b c0215b = new C0215b();
            this.f11586c.f11591c = c0215b;
            this.f11586c = c0215b;
            return c0215b;
        }

        public final b e(String str, Object obj) {
            C0215b c0215bD = d();
            c0215bD.f11590b = obj;
            c0215bD.f11589a = (String) g.m(str);
            return this;
        }

        public final a f() {
            a aVar = new a();
            this.f11586c.f11591c = aVar;
            this.f11586c = aVar;
            return aVar;
        }

        public final b g(String str, Object obj) {
            a aVarF = f();
            aVarF.f11590b = obj;
            aVarF.f11589a = (String) g.m(str);
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r8 = this;
                boolean r0 = r8.f11587d
                boolean r1 = r8.f11588e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 32
                r2.<init>(r3)
                java.lang.String r3 = r8.f11584a
                r2.append(r3)
                r3 = 123(0x7b, float:1.72E-43)
                r2.append(r3)
                com.google.common.base.e$b$b r3 = r8.f11585b
                com.google.common.base.e$b$b r3 = r3.f11591c
                java.lang.String r4 = ""
            L1b:
                if (r3 == 0) goto L66
                java.lang.Object r5 = r3.f11590b
                boolean r6 = r3 instanceof com.google.common.base.e.b.a
                if (r6 != 0) goto L30
                if (r5 != 0) goto L28
                if (r0 != 0) goto L63
                goto L30
            L28:
                if (r1 == 0) goto L30
                boolean r6 = h(r5)
                if (r6 != 0) goto L63
            L30:
                r2.append(r4)
                java.lang.String r4 = r3.f11589a
                if (r4 == 0) goto L3f
                r2.append(r4)
                r4 = 61
                r2.append(r4)
            L3f:
                if (r5 == 0) goto L5e
                java.lang.Class r4 = r5.getClass()
                boolean r4 = r4.isArray()
                if (r4 == 0) goto L5e
                r4 = 1
                java.lang.Object[] r6 = new java.lang.Object[r4]
                r7 = 0
                r6[r7] = r5
                java.lang.String r5 = java.util.Arrays.deepToString(r6)
                int r6 = r5.length()
                int r6 = r6 - r4
                r2.append(r5, r4, r6)
                goto L61
            L5e:
                r2.append(r5)
            L61:
                java.lang.String r4 = ", "
            L63:
                com.google.common.base.e$b$b r3 = r3.f11591c
                goto L1b
            L66:
                r0 = 125(0x7d, float:1.75E-43)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.e.b.toString():java.lang.String");
        }

        public b(String str) {
            C0215b c0215b = new C0215b();
            this.f11585b = c0215b;
            this.f11586c = c0215b;
            this.f11587d = false;
            this.f11588e = false;
            this.f11584a = (String) g.m(str);
        }
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
