package w5;

import A9.C0575f;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import b9.C1992A;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import y5.C5810e;

/* compiled from: FirebaseSessions.kt */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final B4.e f47423a;

    /* renamed from: b, reason: collision with root package name */
    public final C5810e f47424b;

    /* compiled from: FirebaseSessions.kt */
    @h9.e(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {45, 49}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f47425l;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4350h f47427n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ H f47428o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4350h interfaceC4350h, H h10, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f47427n = interfaceC4350h;
            this.f47428o = h10;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return l.this.new a(this.f47427n, this.f47428o, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        
            if (r7.b(r6) == r0) goto L25;
         */
        @Override // h9.AbstractC4424a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                g9.a r0 = g9.a.COROUTINE_SUSPENDED
                int r1 = r6.f47425l
                r2 = 1
                java.lang.String r3 = "FirebaseSessions"
                r4 = 2
                w5.l r5 = w5.l.this
                if (r1 == 0) goto L20
                if (r1 == r2) goto L1c
                if (r1 != r4) goto L14
                b9.n.b(r7)
                goto L66
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                b9.n.b(r7)
                goto L2e
            L20:
                b9.n.b(r7)
                x5.a r7 = x5.C5768a.f47773a
                r6.f47425l = r2
                java.lang.Object r7 = r7.b(r6)
                if (r7 != r0) goto L2e
                goto L65
            L2e:
                java.util.Map r7 = (java.util.Map) r7
                java.util.Collection r7 = r7.values()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                boolean r1 = r7 instanceof java.util.Collection
                if (r1 == 0) goto L45
                r1 = r7
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L45
                goto Lc7
            L45:
                java.util.Iterator r7 = r7.iterator()
            L49:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto Lc7
                java.lang.Object r1 = r7.next()
                x5.c r1 = (x5.c) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L49
                y5.e r7 = r5.f47424b
                r6.f47425l = r4
                java.lang.Object r7 = r7.b(r6)
                if (r7 != r0) goto L66
            L65:
                return r0
            L66:
                y5.e r7 = r5.f47424b
                F3.f r0 = r7.f48162a
                java.lang.Boolean r0 = r0.b()
                if (r0 == 0) goto L75
                boolean r7 = r0.booleanValue()
                goto L83
            L75:
                y5.a r7 = r7.f48163b
                java.lang.Boolean r7 = r7.a()
                if (r7 == 0) goto L82
                boolean r7 = r7.booleanValue()
                goto L83
            L82:
                r7 = r2
            L83:
                if (r7 != 0) goto L8b
                java.lang.String r7 = "Sessions SDK disabled. Not listening to lifecycle events."
                android.util.Log.d(r3, r7)
                goto Lcc
            L8b:
                w5.F r7 = new w5.F
                f9.h r0 = r6.f47427n
                r7.<init>(r0)
                w5.H r1 = r6.f47428o
                android.os.Messenger r3 = new android.os.Messenger
                w5.F$a r4 = new w5.F$a
                r4.<init>(r0)
                r3.<init>(r4)
                w5.F$b r0 = r7.f47366d
                r1.a(r3, r0)
                w5.J r0 = w5.J.f47373b
                r0.getClass()
                w5.J.f47375d = r7
                boolean r0 = w5.J.f47374c
                if (r0 == 0) goto Lb4
                r0 = 0
                w5.J.f47374c = r0
                r7.c(r2)
            Lb4:
                B4.e r7 = r5.f47423a
                androidx.work.s r0 = new androidx.work.s
                r0.<init>()
                r7.a()
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                java.util.concurrent.CopyOnWriteArrayList r7 = r7.f495j
                r7.add(r0)
                goto Lcc
            Lc7:
                java.lang.String r7 = "No Sessions subscribers. Not listening to lifecycle events."
                android.util.Log.d(r3, r7)
            Lcc:
                b9.A r7 = b9.C1992A.f18074a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: w5.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public l(B4.e eVar, C5810e c5810e, InterfaceC4350h interfaceC4350h, H h10) {
        this.f47423a = eVar;
        this.f47424b = c5810e;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        eVar.a();
        Context applicationContext = eVar.f487a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(J.f47373b);
            C0575f.e(A9.F.a(interfaceC4350h), null, null, new a(interfaceC4350h, h10, null), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
