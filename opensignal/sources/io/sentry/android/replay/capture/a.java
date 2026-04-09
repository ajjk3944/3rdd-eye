package io.sentry.android.replay.capture;

import io.sentry.android.replay.t;
import java.util.Date;
import lq.b0;

/* loaded from: classes.dex */
public final class a extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11852d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11853g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f11854r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f11855x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, c cVar, int i10) {
        super(0);
        this.f11852d = i10;
        this.f11853g = obj;
        this.f11854r = obj2;
        this.f11855x = cVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f11852d) {
            case 0:
                io.sentry.android.replay.j jVar = this.f11855x.f11868h;
                if (jVar != null) {
                    jVar.i("replay.id", String.valueOf(this.f11854r));
                }
                break;
            case 1:
                t tVar = (t) this.f11854r;
                if (tVar != null) {
                    c cVar = this.f11855x;
                    io.sentry.android.replay.j jVar2 = cVar.f11868h;
                    if (jVar2 != null) {
                        jVar2.i("config.height", String.valueOf(tVar.f11986b));
                    }
                    io.sentry.android.replay.j jVar3 = cVar.f11868h;
                    if (jVar3 != null) {
                        jVar3.i("config.width", String.valueOf(tVar.f11985a));
                    }
                    io.sentry.android.replay.j jVar4 = cVar.f11868h;
                    if (jVar4 != null) {
                        jVar4.i("config.frame-rate", String.valueOf(tVar.f11989e));
                    }
                    io.sentry.android.replay.j jVar5 = cVar.f11868h;
                    if (jVar5 != null) {
                        jVar5.i("config.bit-rate", String.valueOf(tVar.f11990f));
                    }
                }
                break;
            case 2:
                Date date = (Date) this.f11854r;
                io.sentry.android.replay.j jVar6 = this.f11855x.f11868h;
                if (jVar6 != null) {
                    jVar6.i("segment.timestamp", date == null ? null : dr.a.A(date));
                }
                break;
            default:
                io.sentry.android.replay.j jVar7 = this.f11855x.f11868h;
                if (jVar7 != null) {
                    jVar7.i("replay.screen-at-start", String.valueOf(this.f11854r));
                }
                break;
        }
        return b0.f15562a;
    }
}
