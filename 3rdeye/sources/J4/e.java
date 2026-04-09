package J4;

import C.T;
import C.k0;
import J4.j;
import L0.I;
import L0.S;
import N.s;
import N.v;
import O4.B;
import S5.a;
import S5.f;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import androidx.camera.core.impl.C1704n0;
import androidx.lifecycle.C;
import com.applovin.impl.C2141q0;
import com.applovin.impl.C2148u0;
import com.applovin.impl.l2;
import com.applovin.impl.s3;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.skydoves.balloon.radius.RadiusLayout;
import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.g01;
import com.yandex.mobile.ads.impl.if2;
import com.yandex.mobile.ads.impl.oh;
import com.yandex.mobile.ads.impl.oy;
import g0.C4364k;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import sa.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2772b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2773c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2775e;

    public /* synthetic */ e(s3 s3Var, String str, Runnable runnable) {
        this.f2772b = 8;
        this.f2773c = s3Var;
        this.f2775e = str;
        this.f2774d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f2775e;
        Object obj2 = this.f2774d;
        Object obj3 = this.f2773c;
        switch (this.f2772b) {
            case 0:
                ((i) obj3).f2787b.execute(new T(5, (Runnable) obj2, (j.a) obj));
                break;
            case 1:
                ((v) obj3).a((s) obj2, (Map.Entry) obj);
                break;
            case 2:
                if (!((O.h) obj3).f10155g) {
                    ((Runnable) obj).run();
                    break;
                } else {
                    ((Runnable) obj2).run();
                    break;
                }
            case 3:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    ((B) obj3).call().continueWith((Executor) obj2, new D7.c(taskCompletionSource, i));
                    break;
                } catch (Exception e4) {
                    taskCompletionSource.setException(e4);
                    return;
                }
            case 4:
                S5.f this$0 = (S5.f) obj3;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                View anchor = (View) obj2;
                kotlin.jvm.internal.l.f(anchor, "$anchor");
                ImageView imageView = (ImageView) obj;
                f.a aVar = this$0.f11918c;
                if (aVar.f11953m != S5.b.ALIGN_FIXED) {
                    Rect rect = new Rect();
                    anchor.getGlobalVisibleRect(rect);
                    int[] iArr = {0, 0};
                    this$0.f11920e.getContentView().getLocationOnScreen(iArr);
                    S5.a aVar2 = aVar.f11954n;
                    S5.a value = S5.a.TOP;
                    if (aVar2 == value && iArr[1] < rect.bottom) {
                        S5.a value2 = S5.a.BOTTOM;
                        kotlin.jvm.internal.l.f(value2, "value");
                        aVar.f11954n = value2;
                    } else if (aVar2 == S5.a.BOTTOM && iArr[1] > rect.top) {
                        kotlin.jvm.internal.l.f(value, "value");
                        aVar.f11954n = value;
                    }
                    S5.a aVar3 = aVar.f11954n;
                    S5.a value3 = S5.a.START;
                    if (aVar3 == value3 && iArr[0] < rect.right) {
                        S5.a value4 = S5.a.END;
                        kotlin.jvm.internal.l.f(value4, "value");
                        aVar.f11954n = value4;
                    } else if (aVar3 == S5.a.END && iArr[0] > rect.left) {
                        kotlin.jvm.internal.l.f(value3, "value");
                        aVar.f11954n = value3;
                    }
                    this$0.i();
                }
                T5.a aVar4 = this$0.f11919d;
                ImageView imageView2 = aVar4.f12292c;
                a.C0164a c0164a = S5.a.Companion;
                S5.a aVar5 = aVar.f11954n;
                c0164a.getClass();
                kotlin.jvm.internal.l.f(aVar5, "<this>");
                if (aVar.f11937L) {
                    int i = a.C0164a.C0165a.f11914a[aVar5.ordinal()];
                    if (i == 1) {
                        aVar5 = S5.a.END;
                    } else if (i == 2) {
                        aVar5 = S5.a.START;
                    }
                }
                int i10 = f.d.f11969a[aVar5.ordinal()];
                RadiusLayout radiusLayout = aVar4.f12293d;
                if (i10 == 1) {
                    imageView2.setRotation(180.0f);
                    imageView2.setX(this$0.e(anchor));
                    imageView2.setY((radiusLayout.getY() + radiusLayout.getHeight()) - 1);
                    WeakHashMap<View, S> weakHashMap = I.f3792a;
                    I.d.s(imageView2, 0.0f);
                    imageView2.getX();
                    radiusLayout.getHeight();
                    imageView2.setForeground(null);
                } else if (i10 == 2) {
                    imageView2.setRotation(0.0f);
                    imageView2.setX(this$0.e(anchor));
                    imageView2.setY((radiusLayout.getY() - aVar.f11950j) + 1);
                    imageView2.getX();
                    imageView2.setForeground(null);
                } else if (i10 == 3) {
                    imageView2.setRotation(-90.0f);
                    imageView2.setX((radiusLayout.getX() - aVar.f11950j) + 1);
                    imageView2.setY(this$0.f(anchor));
                    imageView2.getY();
                    imageView2.setForeground(null);
                } else if (i10 == 4) {
                    imageView2.setRotation(90.0f);
                    imageView2.setX((radiusLayout.getX() + radiusLayout.getWidth()) - 1);
                    imageView2.setY(this$0.f(anchor));
                    radiusLayout.getWidth();
                    imageView2.getY();
                    imageView2.setForeground(null);
                }
                imageView.setVisibility(aVar.f11949h ? 0 : 8);
                break;
            case 5:
                C c10 = ((C1704n0) obj3).f15099a;
                C1704n0.a aVar6 = (C1704n0.a) obj2;
                if (aVar6 != null) {
                    c10.i(aVar6);
                }
                c10.f((C1704n0.a) obj);
                break;
            case 6:
                l2.d((AppLovinAdRewardListener) obj3, (AppLovinAd) obj2, (Map) obj);
                break;
            case 7:
                ((com.applovin.impl.mediation.h) obj3).b((MaxAdapterResponseParameters) obj2, (Activity) obj);
                break;
            case 8:
                ((s3) obj3).a((String) obj, (Runnable) obj2);
                break;
            case 9:
                ((s3) obj3).a((View) obj2, (List) obj);
                break;
            case 10:
                ((com.applovin.impl.sdk.m) obj3).a((com.applovin.impl.sdk.ad.b) obj2, (Context) obj);
                break;
            case 11:
                ((C2148u0) obj3).a((C2141q0) obj2, (Activity) obj);
                break;
            case 12:
                com.vungle.ads.internal.downloader.b.m40download$lambda0((com.vungle.ads.internal.downloader.b) obj3, (com.vungle.ads.internal.downloader.c) obj2, (com.vungle.ads.internal.downloader.a) obj);
                break;
            case 13:
                com.vungle.ads.internal.util.h.m113displayImage$lambda0((String) obj3, (com.vungle.ads.internal.util.h) obj2, (p9.l) obj);
                break;
            case 14:
                g01.a((g01) obj3, (String) obj2, (Throwable) obj);
                break;
            case 15:
                ((if2.a) obj3).b((dc0) obj2, (oy) obj);
                break;
            case 16:
                ((oh.a) obj3).b((dc0) obj2, (oy) obj);
                break;
            case 17:
                C4364k.a aVar7 = ((C4364k) obj3).f37919f;
                aVar7.a();
                k0 k0Var = (k0) obj2;
                if (!aVar7.f37926h) {
                    aVar7.f37921c = k0Var;
                    aVar7.f37923e = (D3.b) obj;
                    Size size = k0Var.f732b;
                    aVar7.f37920b = size;
                    aVar7.f37925g = false;
                    if (!aVar7.b()) {
                        C.S.a("SurfaceViewImpl", "Wait for new Surface creation.");
                        C4364k.this.f37918e.getHolder().setFixedSize(size.getWidth(), size.getHeight());
                        break;
                    }
                } else {
                    aVar7.f37926h = false;
                    k0Var.d();
                    k0Var.f739j.b(null);
                    break;
                }
                break;
            default:
                ((sa.d) obj2).i(h.a.this, (Throwable) obj);
                break;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i) {
        this.f2772b = i;
        this.f2773c = obj;
        this.f2774d = obj2;
        this.f2775e = obj3;
    }
}
