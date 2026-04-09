package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.p9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4867p9 extends Of {

    /* renamed from: a, reason: collision with root package name */
    public final Bi f41415a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f41416b;

    /* renamed from: c, reason: collision with root package name */
    public final L4 f41417c;

    public C4867p9(C4940s5 c4940s5) {
        Bi bi = new Bi(c4940s5);
        this.f41415a = bi;
        this.f41417c = new L4(bi);
        this.f41416b = a();
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        map.put(EnumC4997ub.EVENT_TYPE_ACTIVATION, new C4650h(this.f41415a));
        map.put(EnumC4997ub.EVENT_TYPE_START, new Bl(this.f41415a));
        map.put(EnumC4997ub.EVENT_TYPE_REGULAR, new Rg(this.f41415a));
        Bb bb = new Bb(this.f41415a);
        map.put(EnumC4997ub.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, bb);
        map.put(EnumC4997ub.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, bb);
        map.put(EnumC4997ub.EVENT_TYPE_SEND_REFERRER, bb);
        map.put(EnumC4997ub.EVENT_TYPE_CUSTOM_EVENT, bb);
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_SET_SESSION_EXTRA;
        Bi bi = this.f41415a;
        map.put(enumC4997ub, new C5057wl(bi, bi.f39199t));
        map.put(EnumC4997ub.EVENT_TYPE_APP_OPEN, new Yg(this.f41415a));
        map.put(EnumC4997ub.EVENT_TYPE_PURGE_BUFFER, new C4538cg(this.f41415a));
        map.put(EnumC4997ub.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new K6(this.f41415a));
        map.put(EnumC4997ub.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new Hf(this.f41415a));
        map.put(EnumC4997ub.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Pn(this.f41415a));
        map.put(EnumC4997ub.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new If(this.f41415a));
        map.put(EnumC4997ub.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new On(this.f41415a));
        map.put(EnumC4997ub.EVENT_TYPE_ANR, bb);
        EnumC4997ub enumC4997ub2 = EnumC4997ub.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        Bi bi2 = this.f41415a;
        map.put(enumC4997ub2, new C5057wl(bi2, bi2.f39185e));
        EnumC4997ub enumC4997ub3 = EnumC4997ub.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        Bi bi3 = this.f41415a;
        map.put(enumC4997ub3, new C5057wl(bi3, bi3.f39186f));
        map.put(EnumC4997ub.EVENT_TYPE_SEND_USER_PROFILE, bb);
        EnumC4997ub enumC4997ub4 = EnumC4997ub.EVENT_TYPE_SET_USER_PROFILE_ID;
        Bi bi4 = this.f41415a;
        map.put(enumC4997ub4, new C5057wl(bi4, bi4.f39190k));
        map.put(EnumC4997ub.EVENT_TYPE_SEND_REVENUE_EVENT, bb);
        map.put(EnumC4997ub.EVENT_TYPE_SEND_AD_REVENUE_EVENT, bb);
        map.put(EnumC4997ub.EVENT_TYPE_CLEANUP, bb);
        map.put(EnumC4997ub.EVENT_TYPE_SEND_ECOMMERCE_EVENT, bb);
        map.put(EnumC4997ub.EVENT_TYPE_WEBVIEW_SYNC, bb);
        map.put(EnumC4997ub.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new X9(this.f41415a));
        return map;
    }

    public final Bi b() {
        return this.f41415a;
    }

    public final void a(EnumC4997ub enumC4997ub, Ha ha2) {
        this.f41416b.put(enumC4997ub, ha2);
    }

    @Override // io.appmetrica.analytics.impl.Of
    public final AbstractC4841o9 a(int i) {
        LinkedList linkedList = new LinkedList();
        EnumC4997ub enumC4997ubA = EnumC4997ub.a(i);
        L4 l42 = this.f41417c;
        if (l42 != null) {
            l42.a(enumC4997ubA, linkedList);
        }
        Ha ha2 = (Ha) this.f41416b.get(enumC4997ubA);
        if (ha2 != null) {
            ha2.a(linkedList);
        }
        return new C4815n9(linkedList);
    }

    public final Ha a(EnumC4997ub enumC4997ub) {
        return (Ha) this.f41416b.get(enumC4997ub);
    }
}
