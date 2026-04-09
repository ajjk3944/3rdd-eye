package com.zipoapps.premiumhelper.toto;

import U9.t;
import U9.x;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import b9.n;
import com.google.gson.Gson;
import f9.InterfaceC4347e;
import h9.c;
import h9.e;
import h9.i;
import ha.a;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import l8.b;
import p9.l;
import sa.C5589a;
import sa.h;
import sa.r;
import sa.u;
import sa.v;
import sa.w;

/* compiled from: TotoServiceRepository.kt */
/* loaded from: classes3.dex */
public final class TotoServiceRepository {
    private final b configuration;
    private final TotoServiceApi totoServiceApi;
    private final TotoServiceConfig totoServiceConfig;

    /* compiled from: TotoServiceRepository.kt */
    @e(c = "com.zipoapps.premiumhelper.toto.TotoServiceRepository", f = "TotoServiceRepository.kt", l = {55}, m = "callApi")
    /* renamed from: com.zipoapps.premiumhelper.toto.TotoServiceRepository$callApi$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC4347e<? super AnonymousClass1> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= RecyclerView.UNDEFINED_DURATION;
            return TotoServiceRepository.this.callApi(null, this);
        }
    }

    /* compiled from: TotoServiceRepository.kt */
    @e(c = "com.zipoapps.premiumhelper.toto.TotoServiceRepository", f = "TotoServiceRepository.kt", l = {63, 68}, m = "callApiWithRetry")
    /* renamed from: com.zipoapps.premiumhelper.toto.TotoServiceRepository$callApiWithRetry$1, reason: invalid class name and case insensitive filesystem */
    public static final class C42501<T> extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C42501(InterfaceC4347e<? super C42501> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= RecyclerView.UNDEFINED_DURATION;
            return TotoServiceRepository.this.callApiWithRetry(0, null, this);
        }
    }

    /* compiled from: TotoServiceRepository.kt */
    @e(c = "com.zipoapps.premiumhelper.toto.TotoServiceRepository$getConfig$2", f = "TotoServiceRepository.kt", l = {96}, m = "invokeSuspend")
    /* renamed from: com.zipoapps.premiumhelper.toto.TotoServiceRepository$getConfig$2, reason: invalid class name */
    public static final class AnonymousClass2 extends i implements l<InterfaceC4347e<? super u<Map<String, ? extends Map<String, ? extends Integer>>>>, Object> {
        final /* synthetic */ String $packageName;
        final /* synthetic */ String $userAgent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, InterfaceC4347e<? super AnonymousClass2> interfaceC4347e) {
            super(1, interfaceC4347e);
            this.$packageName = str;
            this.$userAgent = str2;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(InterfaceC4347e<?> interfaceC4347e) {
            return TotoServiceRepository.this.new AnonymousClass2(this.$packageName, this.$userAgent, interfaceC4347e);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC4347e<? super u<Map<String, Map<String, Integer>>>> interfaceC4347e) {
            return ((AnonymousClass2) create(interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
                return obj;
            }
            n.b(obj);
            TotoServiceApi totoServiceApi = TotoServiceRepository.this.totoServiceApi;
            String str = this.$packageName;
            String str2 = this.$userAgent;
            this.label = 1;
            Object config = totoServiceApi.getConfig(str, str2, this);
            return config == aVar ? aVar : config;
        }

        @Override // p9.l
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC4347e<? super u<Map<String, ? extends Map<String, ? extends Integer>>>> interfaceC4347e) {
            return invoke2((InterfaceC4347e<? super u<Map<String, Map<String, Integer>>>>) interfaceC4347e);
        }
    }

    /* compiled from: TotoServiceRepository.kt */
    @e(c = "com.zipoapps.premiumhelper.toto.TotoServiceRepository", f = "TotoServiceRepository.kt", l = {78}, m = "postConfig")
    /* renamed from: com.zipoapps.premiumhelper.toto.TotoServiceRepository$postConfig$1, reason: invalid class name and case insensitive filesystem */
    public static final class C42511 extends c {
        int label;
        /* synthetic */ Object result;

        public C42511(InterfaceC4347e<? super C42511> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= RecyclerView.UNDEFINED_DURATION;
            return TotoServiceRepository.this.postConfig(null, null, null, null, this);
        }
    }

    /* compiled from: TotoServiceRepository.kt */
    @e(c = "com.zipoapps.premiumhelper.toto.TotoServiceRepository$registerFcmToken$2", f = "TotoServiceRepository.kt", l = {89}, m = "invokeSuspend")
    /* renamed from: com.zipoapps.premiumhelper.toto.TotoServiceRepository$registerFcmToken$2, reason: invalid class name and case insensitive filesystem */
    public static final class C42522 extends i implements l<InterfaceC4347e<? super u<C1992A>>, Object> {
        final /* synthetic */ RegisterTotoRequest $registerRequest;
        final /* synthetic */ String $userAgent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42522(RegisterTotoRequest registerTotoRequest, String str, InterfaceC4347e<? super C42522> interfaceC4347e) {
            super(1, interfaceC4347e);
            this.$registerRequest = registerTotoRequest;
            this.$userAgent = str;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(InterfaceC4347e<?> interfaceC4347e) {
            return TotoServiceRepository.this.new C42522(this.$registerRequest, this.$userAgent, interfaceC4347e);
        }

        @Override // p9.l
        public final Object invoke(InterfaceC4347e<? super u<C1992A>> interfaceC4347e) {
            return ((C42522) create(interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
                return obj;
            }
            n.b(obj);
            TotoServiceApi totoServiceApi = TotoServiceRepository.this.totoServiceApi;
            RegisterTotoRequest registerTotoRequest = this.$registerRequest;
            String str = this.$userAgent;
            this.label = 1;
            Object objRegister = totoServiceApi.register(registerTotoRequest, str, this);
            return objRegister == aVar ? aVar : objRegister;
        }
    }

    public TotoServiceRepository(b configuration, TotoServiceConfig totoServiceConfig) {
        kotlin.jvm.internal.l.f(configuration, "configuration");
        kotlin.jvm.internal.l.f(totoServiceConfig, "totoServiceConfig");
        this.configuration = configuration;
        this.totoServiceConfig = totoServiceConfig;
        this.totoServiceApi = createTotoApi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object callApi(p9.l<? super f9.InterfaceC4347e<? super sa.u<T>>, ? extends java.lang.Object> r6, f9.InterfaceC4347e<? super com.zipoapps.premiumhelper.toto.TotoApiResponse<T>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.zipoapps.premiumhelper.toto.TotoServiceRepository.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.zipoapps.premiumhelper.toto.TotoServiceRepository$callApi$1 r0 = (com.zipoapps.premiumhelper.toto.TotoServiceRepository.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.zipoapps.premiumhelper.toto.TotoServiceRepository$callApi$1 r0 = new com.zipoapps.premiumhelper.toto.TotoServiceRepository$callApi$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            b9.n.b(r7)
            goto L3b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            b9.n.b(r7)
            r0.label = r3
            java.lang.Object r7 = r6.invoke(r0)
            if (r7 != r1) goto L3b
            return r1
        L3b:
            sa.u r7 = (sa.u) r7
            U9.E r6 = r7.f46333a
            int r0 = r6.f12565e
            long r1 = r6.f12572m
            long r3 = r6.f12571l
            long r1 = r1 - r3
            com.zipoapps.premiumhelper.toto.TotoApiResponse r6 = new com.zipoapps.premiumhelper.toto.TotoApiResponse
            com.zipoapps.premiumhelper.toto.TotoApiResponseInfo r3 = new com.zipoapps.premiumhelper.toto.TotoApiResponseInfo
            r3.<init>(r0, r1)
            r6.<init>(r7, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.toto.TotoServiceRepository.callApi(p9.l, f9.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005e -> B:23:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object callApiWithRetry(int r9, p9.l<? super f9.InterfaceC4347e<? super sa.u<T>>, ? extends java.lang.Object> r10, f9.InterfaceC4347e<? super com.zipoapps.premiumhelper.toto.TotoApiResponse<T>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.zipoapps.premiumhelper.toto.TotoServiceRepository.C42501
            if (r0 == 0) goto L13
            r0 = r11
            com.zipoapps.premiumhelper.toto.TotoServiceRepository$callApiWithRetry$1 r0 = (com.zipoapps.premiumhelper.toto.TotoServiceRepository.C42501) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.zipoapps.premiumhelper.toto.TotoServiceRepository$callApiWithRetry$1 r0 = new com.zipoapps.premiumhelper.toto.TotoServiceRepository$callApiWithRetry$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            b9.n.b(r11)
            return r11
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            p9.l r2 = (p9.l) r2
            java.lang.Object r5 = r0.L$0
            com.zipoapps.premiumhelper.toto.TotoServiceRepository r5 = (com.zipoapps.premiumhelper.toto.TotoServiceRepository) r5
            b9.n.b(r11)
            goto L61
        L42:
            b9.n.b(r11)
            r11 = 0
            r5 = r10
            r10 = r9
            r9 = r11
            r11 = r5
            r5 = r8
        L4b:
            if (r9 >= r10) goto L73
            r0.L$0 = r5
            r0.L$1 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.label = r4
            java.lang.Object r2 = r5.callApi(r11, r0)
            if (r2 != r1) goto L5e
            goto L80
        L5e:
            r7 = r2
            r2 = r11
            r11 = r7
        L61:
            com.zipoapps.premiumhelper.toto.TotoApiResponse r11 = (com.zipoapps.premiumhelper.toto.TotoApiResponse) r11
            sa.u r6 = r11.getData()
            U9.E r6 = r6.f46333a
            boolean r6 = r6.d()
            if (r6 == 0) goto L70
            return r11
        L70:
            int r9 = r9 + r4
            r11 = r2
            goto L4b
        L73:
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r9 = r5.callApi(r11, r0)
            if (r9 != r1) goto L81
        L80:
            return r1
        L81:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.toto.TotoServiceRepository.callApiWithRetry(int, p9.l, f9.e):java.lang.Object");
    }

    private final TotoServiceApi createTotoApi() throws IllegalArgumentException {
        ha.a aVar = new ha.a();
        a.EnumC0464a enumC0464a = this.configuration.f43910b.isDebugMode() ? a.EnumC0464a.BODY : a.EnumC0464a.NONE;
        kotlin.jvm.internal.l.f(enumC0464a, "<set-?>");
        aVar.f38279b = enumC0464a;
        x.a aVar2 = new x.a();
        TimeUnit unit = TimeUnit.SECONDS;
        kotlin.jvm.internal.l.f(unit, "unit");
        aVar2.f12792t = V9.b.b(5L);
        kotlin.jvm.internal.l.f(unit, "unit");
        aVar2.f12793u = V9.b.b(5L);
        kotlin.jvm.internal.l.f(unit, "unit");
        aVar2.f12794v = V9.b.b(5L);
        x.a aVarEnableTls12OnPreLollipop = TotoServiceRepositoryKt.enableTls12OnPreLollipop(aVar2);
        aVarEnableTls12OnPreLollipop.getClass();
        aVarEnableTls12OnPreLollipop.f12776c.add(aVar);
        x xVar = new x(aVarEnableTls12OnPreLollipop);
        r rVar = r.f46281c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String endpoint = this.totoServiceConfig.getEndpoint();
        Objects.requireNonNull(endpoint, "baseUrl == null");
        t.a aVar3 = new t.a();
        aVar3.c(null, endpoint);
        t tVarA = aVar3.a();
        ArrayList arrayList3 = tVarA.f12717f;
        if (!"".equals(arrayList3.get(arrayList3.size() - 1))) {
            throw new IllegalArgumentException("baseUrl must end in /: " + tVarA);
        }
        arrayList.add(new ta.a(new Gson()));
        Executor executorA = rVar.a();
        ArrayList arrayList4 = new ArrayList(arrayList2);
        h hVar = new h(executorA);
        arrayList4.addAll(rVar.f46282a ? Arrays.asList(sa.e.f46197a, hVar) : Collections.singletonList(hVar));
        ArrayList arrayList5 = new ArrayList(arrayList.size() + 1 + (rVar.f46282a ? 1 : 0));
        C5589a c5589a = new C5589a();
        c5589a.f46190a = true;
        arrayList5.add(c5589a);
        arrayList5.addAll(arrayList);
        arrayList5.addAll(rVar.f46282a ? Collections.singletonList(sa.n.f46238a) : Collections.EMPTY_LIST);
        w wVar = new w(xVar, tVarA, Collections.unmodifiableList(arrayList5), Collections.unmodifiableList(arrayList4), executorA);
        if (!TotoServiceApi.class.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(TotoServiceApi.class);
        while (!arrayDeque.isEmpty()) {
            Class cls = (Class) arrayDeque.removeFirst();
            if (cls.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls.getName());
                if (cls != TotoServiceApi.class) {
                    sb.append(" which is an interface of ");
                    sb.append(TotoServiceApi.class.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls.getInterfaces());
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(TotoServiceApi.class.getClassLoader(), new Class[]{TotoServiceApi.class}, new v(wVar));
        kotlin.jvm.internal.l.e(objNewProxyInstance, "create(...)");
        return (TotoServiceApi) objNewProxyInstance;
    }

    public final Object getConfig(String str, String str2, InterfaceC4347e<? super TotoApiResponse<Map<String, Map<String, Integer>>>> interfaceC4347e) {
        return callApiWithRetry(1, new AnonymousClass2(str, str2, null), interfaceC4347e);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object postConfig(java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, java.util.Map<java.lang.String, java.lang.String> r14, f9.InterfaceC4347e<? super J8.E<com.zipoapps.premiumhelper.toto.TotoApiResponse<b9.C1992A>>> r15) {
        /*
            r10 = this;
            boolean r2 = r15 instanceof com.zipoapps.premiumhelper.toto.TotoServiceRepository.C42511
            if (r2 == 0) goto L14
            r2 = r15
            com.zipoapps.premiumhelper.toto.TotoServiceRepository$postConfig$1 r2 = (com.zipoapps.premiumhelper.toto.TotoServiceRepository.C42511) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L14
            int r3 = r3 - r4
            r2.label = r3
        L12:
            r7 = r2
            goto L1a
        L14:
            com.zipoapps.premiumhelper.toto.TotoServiceRepository$postConfig$1 r2 = new com.zipoapps.premiumhelper.toto.TotoServiceRepository$postConfig$1
            r2.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r0 = r7.result
            g9.a r8 = g9.a.COROUTINE_SUSPENDED
            int r2 = r7.label
            r9 = 1
            if (r2 == 0) goto L33
            if (r2 != r9) goto L2b
            b9.n.b(r0)     // Catch: java.lang.Exception -> L29
            goto L4a
        L29:
            r0 = move-exception
            goto L52
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L33:
            b9.n.b(r0)
            com.zipoapps.premiumhelper.toto.TotoServiceRepository$postConfig$response$1 r0 = new com.zipoapps.premiumhelper.toto.TotoServiceRepository$postConfig$response$1     // Catch: java.lang.Exception -> L29
            r6 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L29
            r7.label = r9     // Catch: java.lang.Exception -> L29
            java.lang.Object r0 = r10.callApi(r0, r7)     // Catch: java.lang.Exception -> L29
            if (r0 != r8) goto L4a
            return r8
        L4a:
            com.zipoapps.premiumhelper.toto.TotoApiResponse r0 = (com.zipoapps.premiumhelper.toto.TotoApiResponse) r0     // Catch: java.lang.Exception -> L29
            J8.E$c r2 = new J8.E$c     // Catch: java.lang.Exception -> L29
            r2.<init>(r0)     // Catch: java.lang.Exception -> L29
            return r2
        L52:
            J8.E$b r2 = new J8.E$b
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.toto.TotoServiceRepository.postConfig(java.lang.String, java.lang.String, java.util.Map, java.util.Map, f9.e):java.lang.Object");
    }

    public final Object registerFcmToken(String str, RegisterTotoRequest registerTotoRequest, InterfaceC4347e<? super TotoApiResponse<C1992A>> interfaceC4347e) {
        return callApi(new C42522(registerTotoRequest, str, null), interfaceC4347e);
    }
}
