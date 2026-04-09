package com.ui.uidb;

import Ii.AbstractC3059i;
import Ii.C3048c0;
import Ii.N;
import Mj.x;
import Qj.k;
import Yg.J;
import Yg.v;
import ab.C3783f;
import bb.C4079a;
import bb.InterfaceC4080b;
import com.ui.uidb.UiDB;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import okhttp3.OkHttpClient;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
public final class a implements UiDB {

    /* renamed from: b, reason: collision with root package name */
    private final UiDB.b f42205b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f42206c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4080b f42207d;

    /* renamed from: e, reason: collision with root package name */
    private final C3783f f42208e;

    /* renamed from: f, reason: collision with root package name */
    private final Xa.a f42209f;

    /* renamed from: com.ui.uidb.a$a, reason: collision with other inner class name */
    private static final class C1375a {

        /* renamed from: a, reason: collision with root package name */
        private final Ya.a f42210a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f42211b;

        public C1375a(Ya.a aVar, Object obj) {
            this.f42210a = aVar;
            this.f42211b = obj;
        }

        public final Object a() {
            return this.f42211b;
        }

        public final Ya.a b() {
            return this.f42210a;
        }
    }

    static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f42212a;

        /* renamed from: c, reason: collision with root package name */
        int f42214c;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f42212a = obj;
            this.f42214c |= PduHandle.NONE;
            return a.this.f(null, this);
        }
    }

    static final class c extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f42215a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ya.a f42217c;

        /* renamed from: com.ui.uidb.a$c$a, reason: collision with other inner class name */
        static final class C1376a extends l implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            int f42218a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f42219b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ya.a f42220c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1376a(a aVar, Ya.a aVar2, InterfaceC5380e interfaceC5380e) {
                super(1, interfaceC5380e);
                this.f42219b = aVar;
                this.f42220c = aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
                return new C1376a(this.f42219b, this.f42220c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f42218a;
                if (i10 == 0) {
                    v.b(obj);
                    Xa.a aVar = this.f42219b.f42209f;
                    Ya.a aVar2 = this.f42220c;
                    String strC = aVar2 != null ? aVar2.c() : null;
                    this.f42218a = 1;
                    obj = aVar.a(strC, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return obj;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5380e interfaceC5380e) {
                return ((C1376a) create(interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Ya.a aVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f42217c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return a.this.new c(this.f42217c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f42215a;
            if (i10 == 0) {
                v.b(obj);
                a aVar = a.this;
                C1376a c1376a = new C1376a(aVar, this.f42217c, null);
                this.f42215a = 1;
                obj = aVar.f(c1376a, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            C1375a c1375a = (C1375a) obj;
            return new UiDB.c(new C4079a.C1151a(System.currentTimeMillis(), c1375a.b()), a.this.f42207d.a(a.this.f42205b, (String) c1375a.a()), (String) c1375a.a(), a.this.f42205b);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public a(OkHttpClient okHttpClient, UiDB.b environment, boolean z10, InterfaceC4080b serializer, C3783f productFactory, Xa.a api) {
        AbstractC6492s.i(okHttpClient, "okHttpClient");
        AbstractC6492s.i(environment, "environment");
        AbstractC6492s.i(serializer, "serializer");
        AbstractC6492s.i(productFactory, "productFactory");
        AbstractC6492s.i(api, "api");
        this.f42205b = environment;
        this.f42206c = z10;
        this.f42207d = serializer;
        this.f42208e = productFactory;
        this.f42209f = api;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(mh.InterfaceC6835l r5, dh.InterfaceC5380e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.ui.uidb.a.b
            if (r0 == 0) goto L13
            r0 = r6
            com.ui.uidb.a$b r0 = (com.ui.uidb.a.b) r0
            int r1 = r0.f42214c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42214c = r1
            goto L18
        L13:
            com.ui.uidb.a$b r0 = new com.ui.uidb.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f42212a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f42214c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2e
            Yg.v.b(r6)     // Catch: java.io.IOException -> L29 com.squareup.moshi.JsonEncodingException -> L2b
            goto L43
        L29:
            r5 = move-exception
            goto La5
        L2b:
            r5 = move-exception
            goto Lae
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            Yg.v.b(r6)
            r0.f42214c = r3     // Catch: java.io.IOException -> L29 com.squareup.moshi.JsonEncodingException -> L2b
            java.lang.Object r6 = r5.invoke(r0)     // Catch: java.io.IOException -> L29 com.squareup.moshi.JsonEncodingException -> L2b
            if (r6 != r1) goto L43
            return r1
        L43:
            Mj.w r6 = (Mj.w) r6     // Catch: java.io.IOException -> L29 com.squareup.moshi.JsonEncodingException -> L2b
            int r5 = r6.b()
            r0 = 304(0x130, float:4.26E-43)
            if (r5 == r0) goto L9f
            boolean r5 = r6.f()
            r0 = 2
            r1 = 0
            if (r5 == 0) goto L7d
            java.lang.Object r5 = r6.a()
            if (r5 == 0) goto L74
            okhttp3.Headers r6 = r6.e()
            java.lang.String r0 = "etag"
            java.lang.String r6 = r6.b(r0)
            if (r6 == 0) goto L6e
            Ya.a$a r0 = Ya.a.f24826a
            Ya.a r1 = r0.a(r6)
        L6e:
            com.ui.uidb.a$a r6 = new com.ui.uidb.a$a
            r6.<init>(r1, r5)
            return r6
        L74:
            com.ui.uidb.UiDB$Error$RequestFailed r5 = new com.ui.uidb.UiDB$Error$RequestFailed
            java.lang.String r6 = "Request successful, but no data"
            r5.<init>(r6, r1, r0, r1)
            throw r5
        L7d:
            com.ui.uidb.UiDB$Error$RequestFailed r5 = new com.ui.uidb.UiDB$Error$RequestFailed
            int r6 = r6.b()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Request Failed ["
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = "]"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r5.<init>(r6, r1, r0, r1)
            throw r5
        L9f:
            com.ui.uidb.UiDB$Error$NotChanged r5 = new com.ui.uidb.UiDB$Error$NotChanged
            r5.<init>()
            throw r5
        La5:
            com.ui.uidb.UiDB$Error$IO r6 = new com.ui.uidb.UiDB$Error$IO
            java.lang.String r0 = "UIDB API request fail on IO"
            r6.<init>(r0, r5)
            throw r6
        Lae:
            com.ui.uidb.UiDB$Error$ContentInvalid r6 = new com.ui.uidb.UiDB$Error$ContentInvalid
            java.lang.String r0 = "Response data in invalid format"
            r6.<init>(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.uidb.a.f(mh.l, dh.e):java.lang.Object");
    }

    @Override // com.ui.uidb.UiDB
    public Object a(Ya.a aVar, InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(C3048c0.b(), new c(aVar, null), interfaceC5380e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(OkHttpClient okHttpClient, UiDB.b bVar, boolean z10, InterfaceC4080b interfaceC4080b, C3783f c3783f, Xa.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 32) != 0) {
            aVar = (Xa.a) new x.b().c("https://" + bVar.getHost()).b(k.f()).b(Pj.a.f()).g(okHttpClient).e().b(Xa.a.class);
        }
        this(okHttpClient, bVar, z10, interfaceC4080b, c3783f, aVar);
    }
}
