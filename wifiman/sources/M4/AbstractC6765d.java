package m4;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* renamed from: m4.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6765d {

    /* renamed from: m4.d$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f53124a;

        /* renamed from: b, reason: collision with root package name */
        private final a f53125b;

        /* renamed from: c, reason: collision with root package name */
        private a f53126c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f53127d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f53128e;

        /* renamed from: m4.d$b$a */
        private static class a {

            /* renamed from: a, reason: collision with root package name */
            String f53129a;

            /* renamed from: b, reason: collision with root package name */
            Object f53130b;

            /* renamed from: c, reason: collision with root package name */
            a f53131c;

            private a() {
            }
        }

        private a a() {
            a aVar = new a();
            this.f53126c.f53131c = aVar;
            this.f53126c = aVar;
            return aVar;
        }

        private b b(Object obj) {
            a().f53130b = obj;
            return this;
        }

        private static boolean d(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof AbstractC6768g ? !((AbstractC6768g) obj).d() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b c(Object obj) {
            return b(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r7 = this;
                boolean r0 = r7.f53127d
                boolean r1 = r7.f53128e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 32
                r2.<init>(r3)
                java.lang.String r3 = r7.f53124a
                r2.append(r3)
                r3 = 123(0x7b, float:1.72E-43)
                r2.append(r3)
                m4.d$b$a r3 = r7.f53125b
                m4.d$b$a r3 = r3.f53131c
                java.lang.String r4 = ""
            L1b:
                if (r3 == 0) goto L61
                java.lang.Object r5 = r3.f53130b
                if (r5 != 0) goto L24
                if (r0 != 0) goto L5e
                goto L2c
            L24:
                if (r1 == 0) goto L2c
                boolean r6 = d(r5)
                if (r6 != 0) goto L5e
            L2c:
                r2.append(r4)
                java.lang.String r4 = r3.f53129a
                if (r4 == 0) goto L3b
                r2.append(r4)
                r4 = 61
                r2.append(r4)
            L3b:
                if (r5 == 0) goto L59
                java.lang.Class r4 = r5.getClass()
                boolean r4 = r4.isArray()
                if (r4 == 0) goto L59
                java.lang.Object[] r4 = new java.lang.Object[]{r5}
                java.lang.String r4 = java.util.Arrays.deepToString(r4)
                int r5 = r4.length()
                r6 = 1
                int r5 = r5 - r6
                r2.append(r4, r6, r5)
                goto L5c
            L59:
                r2.append(r5)
            L5c:
                java.lang.String r4 = ", "
            L5e:
                m4.d$b$a r3 = r3.f53131c
                goto L1b
            L61:
                r0 = 125(0x7d, float:1.75E-43)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: m4.AbstractC6765d.b.toString():java.lang.String");
        }

        private b(String str) {
            a aVar = new a();
            this.f53125b = aVar;
            this.f53126c = aVar;
            this.f53127d = false;
            this.f53128e = false;
            this.f53124a = (String) AbstractC6769h.i(str);
        }
    }

    public static b a(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
