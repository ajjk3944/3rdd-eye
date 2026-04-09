package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.th, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4978th extends AbstractC4605f6 {

    /* renamed from: b, reason: collision with root package name */
    public final C4940s5 f41694b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4952sh f41695c;

    /* renamed from: d, reason: collision with root package name */
    public final Y3 f41696d;

    public C4978th(C4940s5 c4940s5, InterfaceC4952sh interfaceC4952sh) {
        this(c4940s5, interfaceC4952sh, new Y3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.AbstractC4605f6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C5028vh load(C4579e6 c4579e6) {
        C5028vh c5028vh = (C5028vh) super.load(c4579e6);
        c5028vh.f41869m = ((C4901qh) c4579e6.componentArguments).f41477a;
        c5028vh.f41874r = this.f41694b.f41617t.a();
        c5028vh.f41879w = this.f41694b.f41614q.a();
        C4901qh c4901qh = (C4901qh) c4579e6.componentArguments;
        c5028vh.f41861d = c4901qh.f41478b;
        c5028vh.f41862e = c4901qh.f41479c;
        c5028vh.f41863f = c4901qh.f41480d;
        c5028vh.i = c4901qh.f41481e;
        c5028vh.f41864g = c4901qh.f41482f;
        c5028vh.f41865h = c4901qh.f41483g;
        Boolean boolValueOf = Boolean.valueOf(c4901qh.f41484h);
        InterfaceC4952sh interfaceC4952sh = this.f41695c;
        c5028vh.f41866j = boolValueOf;
        c5028vh.f41867k = interfaceC4952sh;
        C4901qh c4901qh2 = (C4901qh) c4579e6.componentArguments;
        c5028vh.f41878v = c4901qh2.f41485j;
        C4544cm c4544cm = c4579e6.f40791a;
        G4 g42 = c4544cm.f40652n;
        c5028vh.f41870n = g42.f39475a;
        Je je = c4544cm.f40657s;
        if (je != null) {
            c5028vh.f41875s = je.f39690a;
            c5028vh.f41876t = je.f39691b;
        }
        c5028vh.f41871o = g42.f39476b;
        c5028vh.f41873q = c4544cm.f40644e;
        c5028vh.f41872p = c4544cm.f40649k;
        Y3 y32 = this.f41696d;
        Map<String, String> map = c4901qh2.i;
        V3 v3E = Ga.f39501F.e();
        y32.getClass();
        c5028vh.f41877u = Y3.a(map, c4544cm, v3E);
        return c5028vh;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C5028vh(this.f41694b);
    }

    public C4978th(C4940s5 c4940s5, InterfaceC4952sh interfaceC4952sh, Y3 y32) {
        super(c4940s5.getContext(), c4940s5.b().c());
        this.f41694b = c4940s5;
        this.f41695c = interfaceC4952sh;
        this.f41696d = y32;
    }

    public final C5028vh a() {
        return new C5028vh(this.f41694b);
    }
}
