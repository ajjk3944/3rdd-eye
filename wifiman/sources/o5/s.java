package o5;

import dh.InterfaceC5380e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final a f55430c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f55431a;

    /* renamed from: b, reason: collision with root package name */
    private final String f55432b;

    public static final class a {

        /* renamed from: o5.s$a$a, reason: collision with other inner class name */
        static final class C2000a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f55433a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f55434b;

            /* renamed from: d, reason: collision with root package name */
            int f55436d;

            C2000a(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f55434b = obj;
                this.f55436d |= PduHandle.NONE;
                return a.this.a(null, this);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v8 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(g5.e r9, dh.InterfaceC5380e r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof o5.s.a.C2000a
                if (r0 == 0) goto L13
                r0 = r10
                o5.s$a$a r0 = (o5.s.a.C2000a) r0
                int r1 = r0.f55436d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f55436d = r1
                goto L18
            L13:
                o5.s$a$a r0 = new o5.s$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f55434b
                java.lang.Object r1 = eh.AbstractC5467b.g()
                int r2 = r0.f55436d
                java.lang.String r3 = ""
                java.lang.String r4 = "InstallationId"
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L4a
                if (r2 == r6) goto L40
                if (r2 != r5) goto L37
                java.lang.Object r9 = r0.f55433a
                java.lang.String r9 = (java.lang.String) r9
                Yg.v.b(r10)     // Catch: java.lang.Exception -> L35
                goto L90
            L35:
                r10 = move-exception
                goto L9a
            L37:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L40:
                java.lang.Object r9 = r0.f55433a
                g5.e r9 = (g5.e) r9
                Yg.v.b(r10)     // Catch: java.lang.Exception -> L48
                goto L63
            L48:
                r10 = move-exception
                goto L73
            L4a:
                Yg.v.b(r10)
                r10 = 0
                com.google.android.gms.tasks.Task r10 = r9.a(r10)     // Catch: java.lang.Exception -> L48
                java.lang.String r2 = "firebaseInstallations.getToken(false)"
                kotlin.jvm.internal.AbstractC6492s.h(r10, r2)     // Catch: java.lang.Exception -> L48
                r0.f55433a = r9     // Catch: java.lang.Exception -> L48
                r0.f55436d = r6     // Catch: java.lang.Exception -> L48
                java.lang.Object r10 = Ui.b.a(r10, r0)     // Catch: java.lang.Exception -> L48
                if (r10 != r1) goto L63
                return r1
            L63:
                com.google.firebase.installations.f r10 = (com.google.firebase.installations.f) r10     // Catch: java.lang.Exception -> L48
                java.lang.String r10 = r10.b()     // Catch: java.lang.Exception -> L48
                java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
                kotlin.jvm.internal.AbstractC6492s.h(r10, r2)     // Catch: java.lang.Exception -> L48
                r7 = r10
                r10 = r9
                r9 = r7
                goto L7b
            L73:
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r4, r2, r10)
                r10 = r9
                r9 = r3
            L7b:
                com.google.android.gms.tasks.Task r10 = r10.getId()     // Catch: java.lang.Exception -> L35
                java.lang.String r2 = "firebaseInstallations.id"
                kotlin.jvm.internal.AbstractC6492s.h(r10, r2)     // Catch: java.lang.Exception -> L35
                r0.f55433a = r9     // Catch: java.lang.Exception -> L35
                r0.f55436d = r5     // Catch: java.lang.Exception -> L35
                java.lang.Object r10 = Ui.b.a(r10, r0)     // Catch: java.lang.Exception -> L35
                if (r10 != r1) goto L90
                return r1
            L90:
                java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
                kotlin.jvm.internal.AbstractC6492s.h(r10, r0)     // Catch: java.lang.Exception -> L35
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L35
                r3 = r10
                goto La0
            L9a:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r4, r0, r10)
            La0:
                o5.s r10 = new o5.s
                r0 = 0
                r10.<init>(r3, r9, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o5.s.a.a(g5.e, dh.e):java.lang.Object");
        }

        private a() {
        }
    }

    public /* synthetic */ s(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String a() {
        return this.f55432b;
    }

    public final String b() {
        return this.f55431a;
    }

    private s(String str, String str2) {
        this.f55431a = str;
        this.f55432b = str2;
    }
}
