package y5;

import A9.C0575f;
import A9.E;
import D9.H;
import D9.InterfaceC0644f;
import a1.C1643a;
import a1.d;
import b9.C1992A;
import b9.n;
import c9.C2078B;
import f9.C4351i;
import f9.InterfaceC4347e;
import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: SettingsCache.kt */
/* renamed from: y5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5812g {

    /* renamed from: c, reason: collision with root package name */
    public static final d.a<Boolean> f48170c = new d.a<>("firebase_sessions_enabled");

    /* renamed from: d, reason: collision with root package name */
    public static final d.a<Double> f48171d = new d.a<>("firebase_sessions_sampling_rate");

    /* renamed from: e, reason: collision with root package name */
    public static final d.a<Integer> f48172e = new d.a<>("firebase_sessions_restart_timeout");

    /* renamed from: f, reason: collision with root package name */
    public static final d.a<Integer> f48173f = new d.a<>("firebase_sessions_cache_duration");

    /* renamed from: g, reason: collision with root package name */
    public static final d.a<Long> f48174g = new d.a<>("firebase_sessions_cache_updated_time");

    /* renamed from: a, reason: collision with root package name */
    public final X0.h<a1.d> f48175a;

    /* renamed from: b, reason: collision with root package name */
    public C5809d f48176b;

    /* compiled from: SettingsCache.kt */
    @h9.e(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: y5.g$a */
    public static final class a extends h9.i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public C5812g f48177l;

        /* renamed from: m, reason: collision with root package name */
        public int f48178m;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return C5812g.this.new a(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            C5812g c5812g;
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f48178m;
            if (i == 0) {
                n.b(obj);
                C5812g c5812g2 = C5812g.this;
                InterfaceC0644f<a1.d> data = c5812g2.f48175a.getData();
                this.f48177l = c5812g2;
                this.f48178m = 1;
                Object objD = H.d(data, this);
                if (objD == aVar) {
                    return aVar;
                }
                c5812g = c5812g2;
                obj = objD;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c5812g = this.f48177l;
                n.b(obj);
            }
            C5812g.a(c5812g, new C1643a(C2078B.u(((a1.d) obj).a()), true));
            return C1992A.f18074a;
        }
    }

    public C5812g(X0.h<a1.d> hVar) throws Throwable {
        this.f48175a = hVar;
        C0575f.g(C4351i.f37871b, new a(null));
    }

    public static final void a(C5812g c5812g, a1.d dVar) {
        c5812g.getClass();
        c5812g.f48176b = new C5809d((Boolean) dVar.b(f48170c), (Double) dVar.b(f48171d), (Integer) dVar.b(f48172e), (Integer) dVar.b(f48173f), (Long) dVar.b(f48174g));
    }

    public final boolean b() {
        Integer num;
        C5809d c5809d = this.f48176b;
        if (c5809d == null) {
            l.l("sessionConfigs");
            throw null;
        }
        if (c5809d != null) {
            Long l5 = c5809d.f48159e;
            return l5 == null || (num = c5809d.f48158d) == null || (System.currentTimeMillis() - l5.longValue()) / ((long) 1000) >= ((long) num.intValue());
        }
        l.l("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(a1.d.a r6, java.lang.Object r7, h9.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof y5.C5813h
            if (r0 == 0) goto L13
            r0 = r8
            y5.h r0 = (y5.C5813h) r0
            int r1 = r0.f48182n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48182n = r1
            goto L18
        L13:
            y5.h r0 = new y5.h
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f48180l
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f48182n
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            b9.n.b(r8)     // Catch: java.io.IOException -> L27
            goto L5d
        L27:
            r6 = move-exception
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            b9.n.b(r8)
            X0.h<a1.d> r8 = r5.f48175a     // Catch: java.io.IOException -> L27
            y5.i r2 = new y5.i     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L27
            r0.f48182n = r3     // Catch: java.io.IOException -> L27
            a1.e r6 = new a1.e     // Catch: java.io.IOException -> L27
            r6.<init>(r2, r4)     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = r8.a(r6, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L5d
            return r1
        L4a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to update cache config value: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            b9.A r6 = b9.C1992A.f18074a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.C5812g.c(a1.d$a, java.lang.Object, h9.c):java.lang.Object");
    }
}
