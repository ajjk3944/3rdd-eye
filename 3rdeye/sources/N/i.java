package N;

import C.C;
import android.app.Activity;
import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import com.applovin.impl.EnumC2121h;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.y1;
import com.applovin.impl.z1;
import com.vungle.ads.internal.load.c;
import io.appmetrica.analytics.impl.A0;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import o0.b;
import org.json.JSONObject;
import w.C5688b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4392b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4393c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4396f;

    public /* synthetic */ i(j jVar, C c10, b.a aVar) {
        this.f4392b = 0;
        Map map = Collections.EMPTY_MAP;
        this.f4393c = jVar;
        this.f4394d = c10;
        this.f4395e = map;
        this.f4396f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f4392b) {
            case 0:
                C c10 = (C) this.f4394d;
                Map map = Collections.EMPTY_MAP;
                b.a aVar = (b.a) this.f4396f;
                j jVar = (j) this.f4393c;
                jVar.getClass();
                try {
                    jVar.f4397b.e(c10);
                    aVar.b(null);
                    break;
                } catch (RuntimeException e4) {
                    aVar.d(e4);
                    return;
                }
            case 1:
                ((MaxFullscreenAdImpl) this.f4393c).a((Activity) this.f4394d, (Context) this.f4395e, (EnumC2121h) this.f4396f);
                break;
            case 2:
                ((EventServiceImpl) this.f4393c).b((String) this.f4394d, (Map) this.f4395e, (Map) this.f4396f);
                break;
            case 3:
                ((z1) this.f4393c).a((String) this.f4394d, (y1) this.f4395e, (JSONObject) this.f4396f);
                break;
            case 4:
                c.C0383c.m75onSuccess$lambda1((File) this.f4393c, (c.C0383c) this.f4394d, (com.vungle.ads.internal.downloader.c) this.f4395e, (com.vungle.ads.internal.load.c) this.f4396f);
                break;
            case 5:
                A0.a((A0) this.f4393c, (String) this.f4394d, (String) this.f4395e, (String) this.f4396f);
                break;
            default:
                ((C5688b.C0541b) this.f4393c).f47113a.onCaptureFailed((CameraCaptureSession) this.f4394d, (CaptureRequest) this.f4395e, (CaptureFailure) this.f4396f);
                break;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f4392b = i;
        this.f4393c = obj;
        this.f4394d = obj2;
        this.f4395e = obj3;
        this.f4396f = obj4;
    }
}
