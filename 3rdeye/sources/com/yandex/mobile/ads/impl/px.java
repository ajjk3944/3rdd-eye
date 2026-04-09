package com.yandex.mobile.ads.impl;

import A9.C0575f;
import b9.C1992A;
import b9.m;
import c9.C2099t;
import com.yandex.mobile.ads.impl.yk0;
import f9.InterfaceC4347e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class px implements ox {

    /* renamed from: a, reason: collision with root package name */
    private final as0 f31933a;

    /* renamed from: b, reason: collision with root package name */
    private final io1 f31934b;

    /* renamed from: c, reason: collision with root package name */
    private final nz0 f31935c;

    /* renamed from: d, reason: collision with root package name */
    private final xk0 f31936d;

    /* renamed from: e, reason: collision with root package name */
    private final zk0 f31937e;

    /* renamed from: f, reason: collision with root package name */
    private final A9.A f31938f;

    @h9.e(c = "com.yandex.mobile.ads.features.debugpanel.data.repo.DebugPanelReportRepositoryImpl$getReport$2", f = "DebugPanelReportRepositoryImpl.kt", l = {26}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super yk0>, Object> {

        /* renamed from: b, reason: collision with root package name */
        ix f31939b;

        /* renamed from: c, reason: collision with root package name */
        jx f31940c;

        /* renamed from: d, reason: collision with root package name */
        int f31941d;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return px.this.new a(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super yk0> interfaceC4347e) {
            return px.this.new a(interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            ix ixVarA;
            jx jxVar;
            Object obj2;
            List<lx> listF;
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f31941d;
            if (i == 0) {
                b9.n.b(obj);
                ixVarA = px.this.f31933a.a();
                jx jxVarD = ixVarA.d();
                if (jxVarD == null) {
                    return yk0.b.f35848a;
                }
                io1 io1Var = px.this.f31934b;
                this.f31939b = ixVarA;
                this.f31940c = jxVarD;
                this.f31941d = 1;
                Object objA = io1Var.a(this);
                if (objA == aVar) {
                    return aVar;
                }
                jxVar = jxVarD;
                obj2 = objA;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jxVar = this.f31940c;
                ixVarA = this.f31939b;
                b9.n.b(obj);
                obj2 = ((b9.m) obj).f18085b;
            }
            if (obj2 instanceof m.a) {
                obj2 = null;
            }
            mx mxVar = (mx) obj2;
            if (mxVar == null || (listF = mxVar.f()) == null) {
                listF = C2099t.f18581b;
            }
            List<ez0> listE = ixVarA.e();
            ArrayList arrayListA = px.this.f31935c.a(listF);
            return px.this.f31937e.a(px.this.f31936d.a(new nx(ixVarA.a(), ixVarA.f(), arrayListA.isEmpty() ? listE : arrayListA, ixVarA.b(), jxVar.b(), jxVar.a())));
        }
    }

    public px(as0 localDataSource, io1 remoteDataSource, nz0 networksMapper, xk0 inspectorReportMapper, zk0 reportStorage, A9.A ioDispatcher) {
        kotlin.jvm.internal.l.f(localDataSource, "localDataSource");
        kotlin.jvm.internal.l.f(remoteDataSource, "remoteDataSource");
        kotlin.jvm.internal.l.f(networksMapper, "networksMapper");
        kotlin.jvm.internal.l.f(inspectorReportMapper, "inspectorReportMapper");
        kotlin.jvm.internal.l.f(reportStorage, "reportStorage");
        kotlin.jvm.internal.l.f(ioDispatcher, "ioDispatcher");
        this.f31933a = localDataSource;
        this.f31934b = remoteDataSource;
        this.f31935c = networksMapper;
        this.f31936d = inspectorReportMapper;
        this.f31937e = reportStorage;
        this.f31938f = ioDispatcher;
    }

    @Override // com.yandex.mobile.ads.impl.ox
    public final Object a(InterfaceC4347e<? super yk0> interfaceC4347e) {
        return C0575f.h(this.f31938f, new a(null), interfaceC4347e);
    }
}
