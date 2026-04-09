package P7;

import A9.C0575f;
import A9.U;
import D9.J;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import b9.C1992A;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.zipoapps.premiumhelper.e;
import f9.InterfaceC4347e;
import i9.InterfaceC4463a;
import p9.InterfaceC5480a;

/* compiled from: PhConsentManager.kt */
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f10823h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f10824a;

    /* renamed from: b, reason: collision with root package name */
    public ConsentInformation f10825b;

    /* renamed from: c, reason: collision with root package name */
    public ConsentForm f10826c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10828e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10829f;

    /* renamed from: d, reason: collision with root package name */
    public final J f10827d = D9.E.c(Boolean.FALSE);

    /* renamed from: g, reason: collision with root package name */
    public final J f10830g = D9.E.c(null);

    /* compiled from: PhConsentManager.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f10831a;

        /* renamed from: b, reason: collision with root package name */
        public final FormError f10832b;

        public a() {
            this(3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l.b(this.f10831a, aVar.f10831a) && kotlin.jvm.internal.l.b(this.f10832b, aVar.f10832b);
        }

        public final int hashCode() {
            String str = this.f10831a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            FormError formError = this.f10832b;
            return iHashCode + (formError != null ? formError.hashCode() : 0);
        }

        public final String toString() {
            FormError formError = this.f10832b;
            return "ConsentError[ message:{" + this.f10831a + "} ErrorCode: " + (formError != null ? Integer.valueOf(formError.getErrorCode()) : null) + "]";
        }

        public /* synthetic */ a(int i) {
            this(null, (i & 1) != 0 ? null : "No consent form available");
        }

        public a(FormError formError, String str) {
            this.f10831a = str;
            this.f10832b = formError;
        }
    }

    /* compiled from: PhConsentManager.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final c f10833a;

        /* renamed from: b, reason: collision with root package name */
        public final String f10834b;

        public b(c code, String str) {
            kotlin.jvm.internal.l.f(code, "code");
            this.f10833a = code;
            this.f10834b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f10833a == bVar.f10833a && kotlin.jvm.internal.l.b(this.f10834b, bVar.f10834b);
        }

        public final int hashCode() {
            int iHashCode = this.f10833a.hashCode() * 31;
            String str = this.f10834b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "ConsentResult(code=" + this.f10833a + ", errorMessage=" + this.f10834b + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhConsentManager.kt */
    public static final class c {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c RESULT_OK = new c("RESULT_OK", 0);
        public static final c ERROR = new c("ERROR", 1);

        private static final /* synthetic */ c[] $values() {
            return new c[]{RESULT_OK, ERROR};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = com.google.gson.internal.c.l(cVarArr$values);
        }

        private c(String str, int i) {
        }

        public static InterfaceC4463a<c> getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* compiled from: PhConsentManager.kt */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public a f10835a;

        public d() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.l.b(this.f10835a, ((d) obj).f10835a);
        }

        public final int hashCode() {
            a aVar = this.f10835a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public final String toString() {
            return "ConsentStatus(error=" + this.f10835a + ")";
        }

        public d(int i) {
            this.f10835a = null;
        }
    }

    /* compiled from: PhConsentManager.kt */
    @h9.e(c = "com.zipoapps.ads.PhConsentManager$onInitializationFinished$1", f = "PhConsentManager.kt", l = {161}, m = "invokeSuspend")
    public static final class e extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f10836l;

        public e(InterfaceC4347e<? super e> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return x.this.new e(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((e) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f10836l;
            if (i == 0) {
                b9.n.b(obj);
                J j4 = x.this.f10827d;
                Boolean bool = Boolean.TRUE;
                this.f10836l = 1;
                j4.getClass();
                j4.g(null, bool);
                if (C1992A.f18074a == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    /* compiled from: PhConsentManager.kt */
    @h9.e(c = "com.zipoapps.ads.PhConsentManager$submitStatus$1", f = "PhConsentManager.kt", l = {155}, m = "invokeSuspend")
    public static final class f extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f10838l;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ d f10840n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d dVar, InterfaceC4347e<? super f> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f10840n = dVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return x.this.new f(this.f10840n, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((f) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f10838l;
            if (i == 0) {
                b9.n.b(obj);
                J j4 = x.this.f10830g;
                this.f10838l = 1;
                j4.setValue(this.f10840n);
                if (C1992A.f18074a == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    public x(com.zipoapps.premiumhelper.d dVar) {
        this.f10824a = dVar.getSharedPreferences("premium_helper_data", 0);
    }

    public static Boolean b() {
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        com.zipoapps.premiumhelper.e eVarA = e.a.a();
        l8.d<Boolean> PH_CONSENT_REQUEST_ENABLED = i8.d.f38574p;
        kotlin.jvm.internal.l.e(PH_CONSENT_REQUEST_ENABLED, "PH_CONSENT_REQUEST_ENABLED");
        return (Boolean) eVarA.f37020j.h(PH_CONSENT_REQUEST_ENABLED);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(androidx.appcompat.app.AppCompatActivity r11, boolean r12, p9.l r13, h9.c r14) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P7.x.a(androidx.appcompat.app.AppCompatActivity, boolean, p9.l, h9.c):java.lang.Object");
    }

    public final boolean c() {
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        if (e.a.a().i.j()) {
            return true;
        }
        ConsentInformation consentInformation = this.f10825b;
        return (consentInformation != null && consentInformation.getConsentStatus() == 3) || !b().booleanValue();
    }

    public final void d() {
        C0575f.e(A9.F.a(U.f211a), null, null, new e(null), 3);
    }

    public final synchronized void e(AppCompatActivity activity, H8.e eVar, InterfaceC5480a interfaceC5480a) throws Throwable {
        Throwable th;
        try {
            try {
                kotlin.jvm.internal.l.f(activity, "activity");
                if (this.f10829f) {
                    return;
                }
                if (b().booleanValue()) {
                    C0575f.e(A9.F.a(U.f211a), null, null, new B(this, activity, interfaceC5480a, eVar, null), 3);
                    return;
                }
                try {
                    d();
                    interfaceC5480a.invoke();
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final void f(d dVar) {
        C0575f.e(A9.F.a(U.f211a), null, null, new f(dVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(h9.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof P7.C
            if (r0 == 0) goto L13
            r0 = r5
            P7.C r0 = (P7.C) r0
            int r1 = r0.f10679n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10679n = r1
            goto L18
        L13:
            P7.C r0 = new P7.C
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f10677l
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f10679n
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            b9.n.b(r5)     // Catch: A9.O0 -> L27
            goto L43
        L27:
            r5 = move-exception
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            b9.n.b(r5)
            P7.D r5 = new P7.D     // Catch: A9.O0 -> L27
            r2 = 0
            r5.<init>(r4, r2)     // Catch: A9.O0 -> L27
            r0.f10679n = r3     // Catch: A9.O0 -> L27
            java.lang.Object r5 = A9.F.c(r5, r0)     // Catch: A9.O0 -> L27
            if (r5 != r1) goto L43
            return r1
        L43:
            J8.E r5 = (J8.E) r5     // Catch: A9.O0 -> L27
            return r5
        L46:
            va.a$b r0 = va.a.f47104a
            java.lang.String r1 = "x"
            r0.o(r1)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Timeout while waiting for consent form!"
            r0.c(r2, r1)
            J8.E$b r0 = new J8.E$b
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P7.x.g(h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(h9.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof P7.E
            if (r0 == 0) goto L13
            r0 = r5
            P7.E r0 = (P7.E) r0
            int r1 = r0.f10690n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10690n = r1
            goto L18
        L13:
            P7.E r0 = new P7.E
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f10688l
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f10690n
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            b9.n.b(r5)     // Catch: java.lang.Exception -> L27
            goto L43
        L27:
            r5 = move-exception
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            b9.n.b(r5)
            P7.F r5 = new P7.F     // Catch: java.lang.Exception -> L27
            r2 = 0
            r5.<init>(r4, r2)     // Catch: java.lang.Exception -> L27
            r0.f10690n = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = A9.F.c(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L43
            return r1
        L43:
            J8.E r5 = (J8.E) r5     // Catch: java.lang.Exception -> L27
            return r5
        L46:
            va.a$b r0 = va.a.f47104a
            java.lang.String r1 = "PremiumHelper"
            r0.o(r1)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Exception while initializing ConsentManager"
            r0.c(r2, r1)
            J8.E$b r0 = new J8.E$b
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P7.x.h(h9.c):java.lang.Object");
    }
}
