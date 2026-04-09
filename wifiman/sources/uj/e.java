package uj;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public interface e extends uj.a {

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final C2237a f63186a = C2237a.f63187a;

        /* renamed from: uj.e$a$a, reason: collision with other inner class name */
        public static final class C2237a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ C2237a f63187a = new C2237a();

            /* renamed from: uj.e$a$a$a, reason: collision with other inner class name */
            public static final class C2238a implements a {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC6835l f63188b;

                C2238a(InterfaceC6835l interfaceC6835l) {
                    this.f63188b = interfaceC6835l;
                }
            }

            private C2237a() {
            }

            public final a a(InterfaceC6835l f10) {
                AbstractC6492s.i(f10, "f");
                return new C2238a(f10);
            }
        }
    }

    public static final class b {
        public static String a(e eVar) {
            return eVar.h();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.String b(uj.e r6) {
            /*
                org.kodein.type.q r0 = r6.d()
                org.kodein.type.q$a r1 = org.kodein.type.q.f56966a
                org.kodein.type.q r2 = r1.b()
                boolean r0 = kotlin.jvm.internal.AbstractC6492s.d(r0, r2)
                java.lang.String r2 = ""
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                org.kodein.type.q r3 = r6.d()
                java.lang.String r3 = r3.i()
                r0.append(r3)
                java.lang.String r3 = " -> "
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                goto L2d
            L2c:
                r0 = r2
            L2d:
                uj.q r3 = r6.c()
                boolean r3 = r3 instanceof uj.m
                if (r3 == 0) goto L37
                r3 = 0
                goto L3b
            L37:
                uj.q r3 = r6.c()
            L3b:
                if (r3 == 0) goto L60
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "scoped("
                r4.append(r5)
                org.kodein.type.q r3 = org.kodein.type.s.c(r3)
                java.lang.String r3 = r3.i()
                r4.append(r3)
                java.lang.String r3 = ")."
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                if (r3 != 0) goto L5e
                goto L60
            L5e:
                r2 = r3
                goto L8c
            L60:
                org.kodein.type.q r3 = r6.b()
                org.kodein.type.q r1 = r1.a()
                boolean r1 = kotlin.jvm.internal.AbstractC6492s.d(r3, r1)
                if (r1 != 0) goto L8c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "contexted<"
                r1.append(r2)
                org.kodein.type.q r2 = r6.b()
                java.lang.String r2 = r2.i()
                r1.append(r2)
                java.lang.String r2 = ">()."
                r1.append(r2)
                java.lang.String r2 = r1.toString()
            L8c:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = r6.h()
                r1.append(r2)
                java.lang.String r2 = " { "
                r1.append(r2)
                r1.append(r0)
                org.kodein.type.q r6 = r6.j()
                java.lang.String r6 = r6.i()
                r1.append(r6)
                java.lang.String r6 = " }"
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uj.e.b.b(uj.e):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.String c(uj.e r6) {
            /*
                org.kodein.type.q r0 = r6.d()
                org.kodein.type.q$a r1 = org.kodein.type.q.f56966a
                org.kodein.type.q r2 = r1.b()
                boolean r0 = kotlin.jvm.internal.AbstractC6492s.d(r0, r2)
                java.lang.String r2 = ""
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                org.kodein.type.q r3 = r6.d()
                java.lang.String r3 = r3.h()
                r0.append(r3)
                java.lang.String r3 = " -> "
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                goto L2d
            L2c:
                r0 = r2
            L2d:
                uj.q r3 = r6.c()
                boolean r3 = r3 instanceof uj.m
                if (r3 == 0) goto L37
                r3 = 0
                goto L3b
            L37:
                uj.q r3 = r6.c()
            L3b:
                if (r3 == 0) goto L60
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "scoped("
                r4.append(r5)
                org.kodein.type.q r3 = org.kodein.type.s.c(r3)
                java.lang.String r3 = r3.h()
                r4.append(r3)
                java.lang.String r3 = ")."
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                if (r3 != 0) goto L5e
                goto L60
            L5e:
                r2 = r3
                goto L8c
            L60:
                org.kodein.type.q r3 = r6.b()
                org.kodein.type.q r1 = r1.a()
                boolean r1 = kotlin.jvm.internal.AbstractC6492s.d(r3, r1)
                if (r1 != 0) goto L8c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "contexted<"
                r1.append(r2)
                org.kodein.type.q r2 = r6.b()
                java.lang.String r2 = r2.h()
                r1.append(r2)
                java.lang.String r2 = ">()."
                r1.append(r2)
                java.lang.String r2 = r1.toString()
            L8c:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = r6.e()
                r1.append(r2)
                java.lang.String r2 = " { "
                r1.append(r2)
                r1.append(r0)
                org.kodein.type.q r6 = r6.j()
                java.lang.String r6 = r6.h()
                r1.append(r6)
                java.lang.String r6 = " }"
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uj.e.b.c(uj.e):java.lang.String");
        }

        public static q d(e eVar) {
            return null;
        }

        public static boolean e(e eVar) {
            return false;
        }
    }

    String a();

    org.kodein.type.q b();

    q c();

    org.kodein.type.q d();

    String e();

    String f();

    boolean g();

    String h();

    org.kodein.type.q j();
}
