package com.yandex.mobile.ads.feed;

import A9.C0575f;
import A9.F;
import A9.U;
import D9.C;
import D9.E;
import F9.q;
import I9.c;
import android.content.Context;
import com.yandex.mobile.ads.impl.C4072a3;
import com.yandex.mobile.ads.impl.a90;
import com.yandex.mobile.ads.impl.f90;
import com.yandex.mobile.ads.impl.g90;
import com.yandex.mobile.ads.impl.h7;
import com.yandex.mobile.ads.impl.ia0;
import com.yandex.mobile.ads.impl.ns;
import com.yandex.mobile.ads.impl.o90;
import com.yandex.mobile.ads.impl.q10;
import com.yandex.mobile.ads.impl.r90;
import com.yandex.mobile.ads.impl.rm2;
import com.yandex.mobile.ads.impl.s90;
import com.yandex.mobile.ads.impl.t90;
import com.yandex.mobile.ads.impl.w90;
import com.yandex.mobile.ads.impl.xz0;
import com.yandex.mobile.ads.impl.y80;
import com.yandex.mobile.ads.impl.y90;
import com.yandex.mobile.ads.impl.z80;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class FeedAd extends a {

    /* renamed from: a, reason: collision with root package name */
    private final ia0 f24021a;

    /* renamed from: b, reason: collision with root package name */
    private FeedAdLoadListener f24022b;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final Context f24023a;

        /* renamed from: b, reason: collision with root package name */
        private final FeedAdRequestConfiguration f24024b;

        /* renamed from: c, reason: collision with root package name */
        private final FeedAdAppearance f24025c;

        /* renamed from: d, reason: collision with root package name */
        private final z80 f24026d;

        public Builder(Context context, FeedAdRequestConfiguration requestConfiguration, FeedAdAppearance appearance) {
            l.f(context, "context");
            l.f(requestConfiguration, "requestConfiguration");
            l.f(appearance, "appearance");
            this.f24023a = context;
            this.f24024b = requestConfiguration;
            this.f24025c = appearance;
            this.f24026d = new z80();
        }

        public final FeedAd build() {
            h7 h7VarA = this.f24026d.a(this.f24024b, this.f24025c);
            rm2 rm2Var = new rm2(this.f24023a);
            Context applicationContext = this.f24023a.getApplicationContext();
            l.c(applicationContext);
            f90 f90Var = new f90(applicationContext, rm2Var.c());
            g90 g90Var = new g90(f90Var, rm2Var.c(), new q10());
            C4072a3 c4072a3 = new C4072a3(ns.f30993j, rm2Var);
            C cA = E.a((7 & 1) != 0 ? 0 : 1, C9.a.SUSPEND);
            r90 r90Var = new r90(applicationContext, rm2Var, c4072a3);
            s90 s90Var = new s90(r90Var, new a90());
            w90 w90Var = new w90(g90Var);
            xz0 xz0Var = new xz0();
            t90 t90Var = new t90(xz0Var);
            y90 y90Var = new y90(h7VarA, s90Var, w90Var, t90Var);
            o90 o90Var = new o90(cA, y90Var);
            c cVar = U.f211a;
            return new FeedAd(new ia0(applicationContext, rm2Var, h7VarA, f90Var, g90Var, c4072a3, cA, r90Var, s90Var, w90Var, xz0Var, t90Var, y90Var, o90Var, F.a(q.f1782a.plus(C0575f.a()))), null);
        }
    }

    private FeedAd(ia0 ia0Var) {
        this.f24021a = ia0Var;
    }

    @Override // com.yandex.mobile.ads.feed.a
    public final ia0 b() {
        return this.f24021a;
    }

    public final FeedAdLoadListener getLoadListener() {
        return this.f24022b;
    }

    public final void preloadAd() {
        this.f24021a.f();
    }

    public final void setLoadListener(FeedAdLoadListener feedAdLoadListener) {
        this.f24021a.a(new y80(feedAdLoadListener));
        this.f24022b = feedAdLoadListener;
    }

    public /* synthetic */ FeedAd(ia0 ia0Var, g gVar) {
        this(ia0Var);
    }
}
