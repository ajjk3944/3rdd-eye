package O;

import C.C;
import android.app.Activity;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1781n;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.yandex.mobile.ads.impl.kw0;
import com.yandex.mobile.ads.impl.rr0;
import com.yandex.mobile.ads.impl.zv0;
import java.util.Collections;
import java.util.Map;
import o0.b;
import w.C5688b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10141c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10144f;

    public /* synthetic */ e(h hVar, C c10, b.a aVar) {
        this.f10140b = 0;
        Map map = Collections.EMPTY_MAP;
        this.f10141c = hVar;
        this.f10142d = c10;
        this.f10143e = map;
        this.f10144f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10140b) {
            case 0:
                C c10 = (C) this.f10142d;
                Map map = Collections.EMPTY_MAP;
                b.a aVar = (b.a) this.f10144f;
                h hVar = (h) this.f10141c;
                hVar.getClass();
                try {
                    hVar.f10150b.e(c10);
                    aVar.b(null);
                    break;
                } catch (RuntimeException e4) {
                    aVar.d(e4);
                    return;
                }
            case 1:
                ((com.applovin.impl.mediation.h) this.f10141c).a((MaxAdapterResponseParameters) this.f10142d, (MaxAdFormat) this.f10143e, (Activity) this.f10144f);
                break;
            case 2:
                ((com.applovin.impl.mediation.h) this.f10141c).b((ViewGroup) this.f10142d, (AbstractC1781n) this.f10143e, (Activity) this.f10144f);
                break;
            case 3:
                ((kw0.a) this.f10141c).c((kw0) this.f10142d, (rr0) this.f10143e, (zv0) this.f10144f);
                break;
            default:
                ((C5688b.C0541b) this.f10141c).f47113a.onCaptureCompleted((CameraCaptureSession) this.f10142d, (CaptureRequest) this.f10143e, (TotalCaptureResult) this.f10144f);
                break;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f10140b = i;
        this.f10141c = obj;
        this.f10142d = obj2;
        this.f10143e = obj3;
        this.f10144f = obj4;
    }
}
