package D3;

import android.app.Activity;
import android.widget.ImageView;
import com.applovin.impl.C2120g0;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.t2;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.google.android.ump.FormError;
import com.vungle.ads.internal.executor.i;
import com.vungle.ads.internal.load.e;
import com.vungle.ads.internal.util.l;
import com.yandex.mobile.ads.impl.e20;
import com.yandex.mobile.ads.impl.kw0;
import com.yandex.mobile.ads.impl.rr0;
import com.yandex.mobile.ads.impl.zv0;
import io.appmetrica.analytics.impl.G0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.logging.Logger;
import kotlin.jvm.internal.w;
import y3.h;
import y3.j;
import z3.k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1037c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1040f;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1036b = i;
        this.f1037c = obj;
        this.f1038d = obj2;
        this.f1039e = obj3;
        this.f1040f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1036b) {
            case 0:
                j jVar = (j) this.f1038d;
                String str = jVar.f48075a;
                v3.j jVar2 = (v3.j) this.f1039e;
                h hVar = (h) this.f1040f;
                c cVar = (c) this.f1037c;
                cVar.getClass();
                Logger logger = c.f1045f;
                try {
                    k kVar = cVar.f1048c.get(str);
                    if (kVar == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        jVar2.b(new IllegalArgumentException(str2));
                    } else {
                        cVar.f1050e.e(new b(cVar, jVar, kVar.a(hVar), 0));
                        jVar2.b(null);
                    }
                    break;
                } catch (Exception e4) {
                    logger.warning("Error scheduling event " + e4.getMessage());
                    jVar2.b(e4);
                    return;
                }
            case 1:
                ((MediationServiceImpl) this.f1037c).a((t2) this.f1038d, (Long) this.f1039e, (MaxAdListener) this.f1040f);
                break;
            case 2:
                ((MaxFullscreenAdImpl) this.f1037c).a((String) this.f1038d, (String) this.f1039e, (Activity) this.f1040f);
                break;
            case 3:
                ((com.applovin.impl.mediation.h) this.f1037c).a((MaxAdapter.OnCompletionListener) this.f1038d, (MaxAdapterInitializationParameters) this.f1039e, (Activity) this.f1040f);
                break;
            case 4:
                ((com.applovin.impl.privacy.cmp.a) this.f1037c).a((FormError) this.f1038d, (C2120g0) this.f1039e, (a.InterfaceC0315a) this.f1040f);
                break;
            case 5:
                com.vungle.ads.internal.load.e.m78downloadJs$lambda1((e.a) this.f1037c, (l) this.f1038d, (com.vungle.ads.internal.downloader.d) this.f1039e, (i) this.f1040f);
                break;
            case 6:
                e20.a((w) this.f1037c, (e20) this.f1038d, (String) this.f1039e, (ImageView) this.f1040f);
                break;
            case 7:
                ((kw0.a) this.f1037c).b((kw0) this.f1038d, (rr0) this.f1039e, (zv0) this.f1040f);
                break;
            default:
                G0.a((G0) this.f1037c, (String) this.f1038d, (String) this.f1039e, (PluginErrorDetails) this.f1040f);
                break;
        }
    }
}
