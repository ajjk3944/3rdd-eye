package com.zipoapps.ads.banner;

import A9.C0575f;
import A9.E;
import A9.U;
import F9.C0663f;
import F9.q;
import H6.B;
import I9.g;
import androidx.work.s;
import b9.C1992A;
import b9.n;
import com.zipoapps.premiumhelper.d;
import com.zipoapps.premiumhelper.e;
import f9.InterfaceC4347e;
import h9.c;
import h9.e;
import h9.i;
import i8.C4461a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.l;
import p9.p;
import va.a;

/* compiled from: BannerManager.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0663f f36962a;

    /* renamed from: b, reason: collision with root package name */
    public final d f36963b;

    /* renamed from: c, reason: collision with root package name */
    public final l8.b f36964c;

    /* renamed from: d, reason: collision with root package name */
    public final C4461a f36965d;

    /* renamed from: e, reason: collision with root package name */
    public final R7.d f36966e;

    /* renamed from: f, reason: collision with root package name */
    public final Q7.a f36967f;

    /* renamed from: g, reason: collision with root package name */
    public g f36968g;

    /* renamed from: h, reason: collision with root package name */
    public B f36969h;
    public final Map<b, R7.a> i;

    /* renamed from: j, reason: collision with root package name */
    public long f36970j;

    /* compiled from: BannerManager.kt */
    @e(c = "com.zipoapps.ads.banner.BannerManager$preCacheBanner$1", f = "BannerManager.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: com.zipoapps.ads.banner.a$a, reason: collision with other inner class name */
    public static final class C0428a extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f36971l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f36972m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ a f36973n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0428a(b bVar, a aVar, InterfaceC4347e<? super C0428a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f36972m = bVar;
            this.f36973n = aVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new C0428a(this.f36972m, this.f36973n, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((C0428a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f36971l;
            a aVar2 = this.f36973n;
            b bVar = this.f36972m;
            try {
                if (i == 0) {
                    n.b(obj);
                    va.a.f47104a.g("[BannerManager] PreCache banner with size " + bVar, new Object[0]);
                    this.f36971l = 1;
                    obj = aVar2.a(bVar, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                }
                Map<b, R7.a> map = aVar2.i;
                l.e(map, "access$getBannersCache$p(...)");
                map.put(bVar, (R7.a) obj);
                va.a.f47104a.g("[BannerManager] Banner with size " + bVar + " saved to cache", new Object[0]);
            } catch (Exception e4) {
                va.a.f47104a.l(s.d("[BannerManager] Failed to precache banner. Error - ", e4.getMessage()), new Object[0]);
            }
            return C1992A.f18074a;
        }
    }

    public a(C0663f c0663f, d dVar, l8.b bVar, C4461a c4461a) {
        this.f36962a = c0663f;
        this.f36963b = dVar;
        this.f36964c = bVar;
        this.f36965d = c4461a;
        R7.d dVar2 = new R7.d(c0663f, dVar);
        this.f36966e = dVar2;
        this.f36967f = new Q7.a();
        this.i = Collections.synchronizedMap(new LinkedHashMap());
        this.f36968g = dVar2.a(bVar);
        this.f36969h = Q7.a.a(bVar);
    }

    public final Object a(b bVar, boolean z10, c cVar) {
        a.b bVar2 = va.a.f47104a;
        bVar2.a("[BannerManager] loadBanner: type=" + bVar.f36974a, new Object[0]);
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        if (e.a.a().i.j()) {
            bVar2.a("[BannerManager] User is premium.", new Object[0]);
            throw new RuntimeException("User is Premium");
        }
        Map<b, R7.a> map = this.i;
        R7.a aVar = map.get(bVar);
        if (aVar == null) {
            I9.c cVar2 = U.f211a;
            return C0575f.h(q.f1782a, new R7.b(this, z10, bVar, null), cVar);
        }
        bVar2.g("[BannerManager] Banner was found in cache. Return", new Object[0]);
        map.remove(bVar);
        b(bVar);
        return aVar;
    }

    public final void b(b bVar) {
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        com.zipoapps.premiumhelper.e eVarA = e.a.a();
        l8.d<Boolean> PH_BANNER_CACHE_ENABLED = i8.d.f38573o;
        l.e(PH_BANNER_CACHE_ENABLED, "PH_BANNER_CACHE_ENABLED");
        if (((Boolean) eVarA.f37020j.h(PH_BANNER_CACHE_ENABLED)).booleanValue()) {
            C0575f.e(this.f36962a, null, null, new C0428a(bVar, this, null), 3);
        }
    }
}
