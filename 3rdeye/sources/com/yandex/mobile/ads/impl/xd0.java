package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import c9.C2097r;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.impl.ew1;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class xd0 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f35249a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewGroup f35250b;

    /* renamed from: c, reason: collision with root package name */
    private final tr f35251c;

    /* renamed from: d, reason: collision with root package name */
    private final C4072a3 f35252d;

    /* renamed from: e, reason: collision with root package name */
    private final lt f35253e;

    /* renamed from: f, reason: collision with root package name */
    private final yq0 f35254f;

    /* renamed from: g, reason: collision with root package name */
    private final C4231x2 f35255g;

    public /* synthetic */ xd0(Context context, a8 a8Var, RelativeLayout relativeLayout, tr trVar, C4070a1 c4070a1, int i, C4188r1 c4188r1, C4072a3 c4072a3) {
        this(context, a8Var, relativeLayout, trVar, c4070a1, c4188r1, c4072a3, new k81(c4188r1, new pd0(ew1.a.a().a(context))), new yq0(context, a8Var, trVar, c4070a1, i, c4188r1, c4072a3), new C4231x2(c4188r1));
    }

    public final sd0 a(Context context, h61 nativeAdPrivate, tr contentCloseListener) {
        ArrayList arrayList;
        w20 w20Var;
        tr trVar;
        es1 es1Var;
        ArrayList arrayList2;
        w20 w20VarPrevious;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        es1 es1Var2 = new es1(context, new u20(nativeAdPrivate, contentCloseListener, this.f35252d.q().c(), new c30(), new i30()), contentCloseListener);
        InterfaceC4209u1 interfaceC4209u1A = this.f35255g.a(this.f35249a, es1Var2);
        List<w20> listC = nativeAdPrivate.c();
        if (listC != null) {
            arrayList = new ArrayList();
            for (Object obj : listC) {
                if (kotlin.jvm.internal.l.b(((w20) obj).e(), c10.f25492c.a())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List<w20> listC2 = nativeAdPrivate.c();
        if (listC2 != null) {
            ListIterator<w20> listIterator = listC2.listIterator(listC2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    w20VarPrevious = null;
                    break;
                }
                w20VarPrevious = listIterator.previous();
                if (kotlin.jvm.internal.l.b(w20VarPrevious.e(), c10.f25493d.a())) {
                    break;
                }
            }
            w20Var = w20VarPrevious;
        } else {
            w20Var = null;
        }
        p61 p61VarA = nativeAdPrivate.a();
        C4199s5 c4199s5A = p61VarA != null ? p61VarA.a() : null;
        if (!kotlin.jvm.internal.l.b(this.f35249a.x(), z00.f36120c.a()) || c4199s5A == null) {
            trVar = contentCloseListener;
            es1Var = es1Var2;
            arrayList2 = arrayList;
        } else {
            if ((nativeAdPrivate instanceof pz1) || w20Var != null) {
                lt ltVar = this.f35253e;
                return new C4220v5(context, nativeAdPrivate, ltVar, es1Var2, arrayList, w20Var, this.f35250b, interfaceC4209u1A, contentCloseListener, this.f35254f, c4199s5A, new ExtendedNativeAdView(context), new C4202t1(nativeAdPrivate, contentCloseListener, ltVar), new rl1(), new up(), new tr1(new b52()));
            }
            trVar = contentCloseListener;
            arrayList2 = arrayList;
            es1Var = es1Var2;
        }
        ArrayList arrayList3 = arrayList2;
        return new wd0(this.f35254f.a(context, this.f35250b, nativeAdPrivate, this.f35253e, new pm1(interfaceC4209u1A), es1Var, new s42(new rl1(), new ky1(this.f35249a), new oy1(this.f35249a), new ny1(), new up()), new py1(), arrayList3 != null ? (w20) C2097r.q0(arrayList3) : null, null), trVar);
    }

    public xd0(Context context, a8 adResponse, RelativeLayout container, tr contentCloseListener, C4070a1 eventController, C4188r1 adActivityListener, C4072a3 adConfiguration, lt adEventListener, yq0 layoutDesignsControllerCreator, C4231x2 adCompleteListenerCreator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(container, "container");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(eventController, "eventController");
        kotlin.jvm.internal.l.f(adActivityListener, "adActivityListener");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adEventListener, "adEventListener");
        kotlin.jvm.internal.l.f(layoutDesignsControllerCreator, "layoutDesignsControllerCreator");
        kotlin.jvm.internal.l.f(adCompleteListenerCreator, "adCompleteListenerCreator");
        this.f35249a = adResponse;
        this.f35250b = container;
        this.f35251c = contentCloseListener;
        this.f35252d = adConfiguration;
        this.f35253e = adEventListener;
        this.f35254f = layoutDesignsControllerCreator;
        this.f35255g = adCompleteListenerCreator;
    }
}
