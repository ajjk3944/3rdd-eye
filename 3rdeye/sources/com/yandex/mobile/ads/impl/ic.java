package com.yandex.mobile.ads.impl;

import A9.C0575f;
import A9.C0583j;
import A9.InterfaceC0581i;
import android.content.Context;
import b9.C1992A;
import com.yandex.mobile.ads.impl.hc;
import f9.InterfaceC4347e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class ic {

    /* renamed from: a, reason: collision with root package name */
    private final Object f28635a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f28636b = new CopyOnWriteArrayList();

    @h9.e(c = "com.monetization.ads.core.identifiers.ad.AdvertisingInfoLoader$requestAdvertisingInfo$2", f = "AdvertisingInfoLoader.kt", l = {53}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super gc>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28637b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f28639d;

        /* renamed from: com.yandex.mobile.ads.impl.ic$a$a, reason: collision with other inner class name */
        public static final class C0408a extends kotlin.jvm.internal.m implements p9.l<Throwable, C1992A> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ic f28640b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f28641c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0408a(ic icVar, Context context) {
                super(1);
                this.f28640b = icVar;
                this.f28641c = context;
            }

            @Override // p9.l
            public final C1992A invoke(Throwable th) {
                ic.a(this.f28640b, this.f28641c);
                return C1992A.f18074a;
            }
        }

        public static final class b implements oc {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC0581i<gc> f28642a;

            public b(C0583j c0583j) {
                this.f28642a = c0583j;
            }

            @Override // com.yandex.mobile.ads.impl.oc
            public final void a(gc gcVar) {
                if (this.f28642a.isActive()) {
                    this.f28642a.resumeWith(gcVar);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f28639d = context;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return ic.this.new a(this.f28639d, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super gc> interfaceC4347e) {
            return ic.this.new a(this.f28639d, interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f28637b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
                return obj;
            }
            b9.n.b(obj);
            ic icVar = ic.this;
            Context context = this.f28639d;
            this.f28637b = 1;
            C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(this));
            c0583j.s();
            c0583j.u(new C0408a(icVar, context));
            ic.a(icVar, context, new b(c0583j));
            Object objR = c0583j.r();
            return objR == aVar ? aVar : objR;
        }
    }

    public static final void a(ic icVar, Context context) {
        ArrayList arrayList;
        synchronized (icVar.f28635a) {
            arrayList = new ArrayList(icVar.f28636b);
            icVar.f28636b.clear();
            C1992A c1992a = C1992A.f18074a;
        }
        hc hcVarA = hc.a.a(context);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hcVarA.a((oc) it.next());
        }
    }

    public static final void a(ic icVar, Context context, oc ocVar) {
        synchronized (icVar.f28635a) {
            icVar.f28636b.add(ocVar);
            hc.a.a(context).b(ocVar);
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public final Object a(Context context, InterfaceC4347e<? super gc> interfaceC4347e) {
        return C0575f.h(A9.U.f212b, new a(context, null), interfaceC4347e);
    }
}
