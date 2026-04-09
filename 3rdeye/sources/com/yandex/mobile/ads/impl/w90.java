package com.yandex.mobile.ads.impl;

import A9.C0575f;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class w90 {

    /* renamed from: a, reason: collision with root package name */
    private final g90 f34865a;

    @h9.e(c = "com.monetization.ads.feed.data.preloader.FeedItemPreloadDataSource$prepareLoadedAd$2", f = "FeedItemPreloadDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super i90>, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ tr0 f34866b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w90 f34867c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tr0 tr0Var, w90 w90Var, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f34866b = tr0Var;
            this.f34867c = w90Var;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f34866b, this.f34867c, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super i90> interfaceC4347e) {
            return new a(this.f34866b, this.f34867c, interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            b9.n.b(obj);
            pz1 pz1VarB = this.f34866b.b();
            List<w20> listC = pz1VarB.c();
            if (listC == null) {
                listC = Collections.EMPTY_LIST;
            }
            kotlin.jvm.internal.l.c(listC);
            w90 w90Var = this.f34867c;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                pk1 pk1VarA = w90Var.f34865a.a((w20) it.next(), pz1VarB);
                if (pk1VarA != null) {
                    arrayList.add(pk1VarA);
                }
            }
            return new i90(this.f34866b.b(), this.f34866b.a(), arrayList);
        }
    }

    public w90(g90 divKitViewPreloader) {
        kotlin.jvm.internal.l.f(divKitViewPreloader, "divKitViewPreloader");
        this.f34865a = divKitViewPreloader;
    }

    public final Object a(tr0 tr0Var, InterfaceC4347e<? super i90> interfaceC4347e) {
        return C0575f.h(A9.U.f211a, new a(tr0Var, this, null), interfaceC4347e);
    }
}
