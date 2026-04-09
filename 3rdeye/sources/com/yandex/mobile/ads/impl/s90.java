package com.yandex.mobile.ads.impl;

import c9.C2097r;
import c9.C2100u;
import com.yandex.mobile.ads.impl.v90;
import d9.C4285c;
import f9.C4352j;
import f9.InterfaceC4347e;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class s90 {

    /* renamed from: a, reason: collision with root package name */
    private final r90 f32912a;

    /* renamed from: b, reason: collision with root package name */
    private final a90 f32913b;

    public s90(r90 feedItemLoadControllerCreator, a90 feedAdRequestDataProvider) {
        kotlin.jvm.internal.l.f(feedItemLoadControllerCreator, "feedItemLoadControllerCreator");
        kotlin.jvm.internal.l.f(feedAdRequestDataProvider, "feedAdRequestDataProvider");
        this.f32912a = feedItemLoadControllerCreator;
        this.f32913b = feedAdRequestDataProvider;
    }

    public final Object a(h7 adRequestData, List<i90> list, InterfaceC4347e<? super v90> interfaceC4347e) throws Throwable {
        List<w31> listE;
        a8<String> a8VarA;
        C4352j c4352j = new C4352j(com.google.gson.internal.c.r(interfaceC4347e));
        a aVar = new a(c4352j);
        i90 i90Var = (i90) C2097r.w0(list);
        fa0 fa0VarA = (i90Var == null || (a8VarA = i90Var.a()) == null) ? null : a8VarA.A();
        this.f32913b.getClass();
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        int size = list.size() + 1;
        Iterator<T> it = list.iterator();
        int size2 = 0;
        while (it.hasNext()) {
            p61 p61VarA = ((i90) it.next()).c().a();
            size2 += (p61VarA == null || (listE = p61VarA.e()) == null) ? 0 : listE.size();
        }
        C4285c c4285c = new C4285c();
        Map<String, String> mapH = adRequestData.h();
        if (mapH == null) {
            mapH = C2100u.f18582b;
        }
        c4285c.putAll(mapH);
        c4285c.put("feed-page", String.valueOf(size));
        c4285c.put("feed-ads-count", String.valueOf(size2));
        this.f32912a.a(aVar, h7.a(adRequestData, c4285c.c(), null, 4031), fa0VarA).y();
        Object objA = c4352j.a();
        g9.a aVar2 = g9.a.COROUTINE_SUSPENDED;
        return objA;
    }

    public static final class a implements u90 {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC4347e<v90> f32914a;

        public a(C4352j continuation) {
            kotlin.jvm.internal.l.f(continuation, "continuation");
            this.f32914a = continuation;
        }

        @Override // com.yandex.mobile.ads.impl.u90
        public final void a(C4128i3 adRequestError) {
            kotlin.jvm.internal.l.f(adRequestError, "adRequestError");
            this.f32914a.resumeWith(new v90.a(adRequestError));
        }

        @Override // com.yandex.mobile.ads.impl.u90
        public final void a(tr0 loadedFeedItem) {
            kotlin.jvm.internal.l.f(loadedFeedItem, "loadedFeedItem");
            this.f32914a.resumeWith(new v90.b(loadedFeedItem));
        }
    }
}
