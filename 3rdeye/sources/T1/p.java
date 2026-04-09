package T1;

import android.app.Activity;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.work.impl.WorkDatabase;
import b2.C1834o;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.impl.C2107a1;
import com.applovin.impl.C2123i;
import com.applovin.impl.h2;
import com.applovin.impl.l2;
import com.applovin.impl.sdk.c;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.AppLovinAd;
import com.yandex.mobile.ads.impl.kw0;
import com.yandex.mobile.ads.impl.rr0;
import com.yandex.mobile.ads.impl.zv0;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import w.C5688b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12205c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12208f;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f12204b = i;
        this.f12205c = obj;
        this.f12206d = obj2;
        this.f12207e = obj3;
        this.f12208f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f12204b) {
            case 0:
                List list = (List) this.f12205c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).e(((C1834o) this.f12206d).f17128a);
                }
                q.b((androidx.work.b) this.f12207e, (WorkDatabase) this.f12208f, list);
                break;
            case 1:
                ((C2107a1) this.f12205c).a((com.applovin.impl.adview.a) this.f12206d, (Activity) this.f12207e, (String) this.f12208f);
                break;
            case 2:
                ((h2) this.f12205c).a((ViewGroup) this.f12206d, (Activity) this.f12207e, (AppLovinFullscreenAdViewObserver) this.f12208f);
                break;
            case 3:
                ((C2123i) this.f12205c).a((C2123i.b) this.f12206d, (String) this.f12207e, (String) this.f12208f);
                break;
            case 4:
                l2.b((AppLovinAdViewEventListener) this.f12205c, (AppLovinAd) this.f12206d, (AppLovinAdView) this.f12207e, (AppLovinAdViewDisplayErrorCode) this.f12208f);
                break;
            case 5:
                ((com.applovin.impl.sdk.c) this.f12205c).a((File) this.f12206d, (c.InterfaceC0318c) this.f12207e, (c.a) this.f12208f);
                break;
            case 6:
                ImageView imageView = (ImageView) this.f12207e;
                Uri uri = (Uri) this.f12208f;
                ImageViewUtils.a((String) this.f12205c, (com.applovin.impl.sdk.k) this.f12206d, imageView, uri);
                break;
            case 7:
                ((kw0.a) this.f12205c).a((kw0) this.f12206d, (rr0) this.f12207e, (zv0) this.f12208f);
                break;
            default:
                ((C5688b.C0541b) this.f12205c).f47113a.onCaptureProgressed((CameraCaptureSession) this.f12206d, (CaptureRequest) this.f12207e, (CaptureResult) this.f12208f);
                break;
        }
    }
}
