package com.yandex.mobile.ads.common;

import A9.C0575f;
import A9.F;
import A9.U;
import F9.C0663f;
import android.content.Context;
import b9.j;
import c9.C2100u;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.banner.a;
import com.yandex.mobile.ads.impl.C4198s4;
import com.yandex.mobile.ads.impl.au1;
import com.yandex.mobile.ads.impl.cc;
import com.yandex.mobile.ads.impl.hl2;
import com.yandex.mobile.ads.impl.il2;
import com.yandex.mobile.ads.impl.jv1;
import com.yandex.mobile.ads.impl.k50;
import com.yandex.mobile.ads.impl.ns;
import com.yandex.mobile.ads.impl.rm2;
import com.yandex.mobile.ads.impl.ve1;
import com.yandex.mobile.ads.impl.vy1;
import com.yandex.mobile.ads.impl.wk;
import com.yandex.mobile.ads.impl.x22;
import com.yandex.mobile.ads.impl.xk;
import com.yandex.mobile.ads.impl.ye1;
import com.yandex.mobile.ads.impl.yt1;
import f9.InterfaceC4350h;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class BidderTokenLoader {
    static {
        new BidderTokenLoader();
    }

    private BidderTokenLoader() {
    }

    public static final void loadBidderToken(Context context, BidderTokenRequestConfiguration bidderTokenRequestConfiguration, BidderTokenLoadListener listener) {
        ns nsVar;
        l.f(context, "context");
        l.f(bidderTokenRequestConfiguration, "bidderTokenRequestConfiguration");
        l.f(listener, "listener");
        rm2 rm2Var = new rm2(context);
        hl2 hl2Var = new hl2(listener);
        switch (il2.f28735a[bidderTokenRequestConfiguration.getAdType().ordinal()]) {
            case 1:
                nsVar = null;
                break;
            case 2:
                nsVar = ns.f30988d;
                break;
            case 3:
                nsVar = ns.f30989e;
                break;
            case 4:
                nsVar = ns.f30990f;
                break;
            case 5:
                nsVar = ns.f30991g;
                break;
            case 6:
                nsVar = ns.i;
                break;
            default:
                throw new j();
        }
        BannerAdSize bannerAdSize = bidderTokenRequestConfiguration.getBannerAdSize();
        vy1 vy1VarA = bannerAdSize != null ? a.a(bannerAdSize).a() : null;
        Map<String, String> parameters = bidderTokenRequestConfiguration.getParameters();
        if (parameters == null) {
            parameters = C2100u.f18582b;
        }
        xk xkVar = new xk(nsVar, vy1VarA, parameters);
        C0663f c0663fA = F.a(InterfaceC4350h.a.C0456a.d(C0575f.a(), U.f212b));
        Context applicationContext = context.getApplicationContext();
        l.e(applicationContext, "getApplicationContext(...)");
        C4198s4 c4198s4 = new C4198s4();
        k50 k50VarA = k50.a.a(applicationContext);
        cc ccVar = new cc();
        new au1(context, rm2Var, c0663fA, applicationContext, c4198s4, k50VarA, ccVar, new jv1(applicationContext, rm2Var, c0663fA, c4198s4, k50VarA, ccVar, 524224), x22.a.a(), new yt1(c4198s4), new ye1(c4198s4, rm2Var.c(), new wk(), new ve1(c4198s4))).a(xkVar, hl2Var);
    }
}
