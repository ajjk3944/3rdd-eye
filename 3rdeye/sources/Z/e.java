package Z;

import C.J;
import C.S;
import W.F;
import android.app.Activity;
import android.content.Context;
import com.applovin.impl.C2107a1;
import com.applovin.impl.x6;
import com.applovin.impl.y1;
import com.applovin.impl.y7;
import com.applovin.impl.z1;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinPostbackListener;
import com.vungle.ads.internal.downloader.a;
import com.vungle.ads.internal.load.e;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.kw0;
import com.yandex.mobile.ads.impl.zv0;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.impl.Z;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;
import org.json.JSONException;
import v.C5670z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13903c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13905e;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i) {
        this.f13902b = i;
        this.f13903c = obj;
        this.f13904d = obj2;
        this.f13905e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f13902b) {
            case 0:
                h hVar = (h) this.f13903c;
                int iOrdinal = hVar.f13916g.ordinal();
                if (iOrdinal == 0) {
                    hVar.f13918j = (H.g) this.f13904d;
                    hVar.f13919k = (F.c) this.f13905e;
                    return;
                } else {
                    if (iOrdinal == 1 || iOrdinal == 2) {
                        throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
                    }
                    return;
                }
            case 1:
                ((C2107a1) this.f13903c).a((com.applovin.impl.sdk.ad.b) this.f13904d, (s.i) this.f13905e);
                return;
            case 2:
                ((com.applovin.impl.adview.a) this.f13903c).a((String) this.f13904d, (String) this.f13905e);
                return;
            case 3:
                ((com.applovin.impl.mediation.h) this.f13903c).d((MaxAdapterResponseParameters) this.f13904d, (Activity) this.f13905e);
                return;
            case 4:
                ((com.applovin.impl.sdk.network.b) this.f13903c).b((com.applovin.impl.sdk.network.d) this.f13904d, (AppLovinPostbackListener) this.f13905e);
                return;
            case 5:
                x6.a((com.applovin.impl.sdk.k) this.f13903c, (String) this.f13904d, (com.applovin.impl.sdk.ad.b) this.f13905e);
                return;
            case 6:
                ((y7) this.f13903c).b((com.applovin.impl.sdk.network.e) this.f13904d, (AppLovinPostbackListener) this.f13905e);
                return;
            case 7:
                ((z1) this.f13903c).b((y1) this.f13904d, (List) this.f13905e);
                return;
            case 8:
                e.b.m79onError$lambda0((a.C0372a) this.f13903c, (com.vungle.ads.internal.downloader.c) this.f13904d, (File) this.f13905e);
                return;
            case 9:
                ((c40.a) this.f13903c).a((c40) this.f13904d, (Exception) this.f13905e);
                return;
            case 10:
                ((kw0.a) this.f13903c).a((kw0) this.f13904d, (zv0) this.f13905e);
                return;
            case 11:
                Z.a((Z) this.f13903c, (Context) this.f13904d, (AppMetricaLibraryAdapterConfig) this.f13905e);
                return;
            default:
                C5670z.g gVar = (C5670z.g) this.f13903c;
                gVar.getClass();
                S.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
                gVar.f46989d.a(TimeUnit.SECONDS.toMillis(3L) + System.currentTimeMillis(), (J.h) ((AtomicReference) this.f13904d).get());
                ((b.a) this.f13905e).b(null);
                return;
        }
    }
}
