package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import c9.C2092m;
import c9.C2097r;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class yq0 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f35951a;

    /* renamed from: b, reason: collision with root package name */
    private final tr f35952b;

    /* renamed from: c, reason: collision with root package name */
    private final C4070a1 f35953c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35954d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4105f1 f35955e;

    /* renamed from: f, reason: collision with root package name */
    private final C4072a3 f35956f;

    /* renamed from: g, reason: collision with root package name */
    private final zq0 f35957g;

    /* renamed from: h, reason: collision with root package name */
    private final yv f35958h;

    public /* synthetic */ yq0(Context context, a8 a8Var, tr trVar, C4070a1 c4070a1, int i, C4188r1 c4188r1, C4072a3 c4072a3) {
        this(context, a8Var, trVar, c4070a1, i, c4188r1, c4072a3, new zq0(), new aw(context, c4072a3, new yq1().b(a8Var, c4072a3)).a());
    }

    public final xq0<ExtendedNativeAdView> a(Context context, ViewGroup container, h61 nativeAdPrivate, lt adEventListener, InterfaceC4224w2 adCompleteListener, es1 closeVerificationController, s42 timeProviderContainer, g20 divKitActionHandlerDelegate, w20 w20Var, y5 y5Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(container, "container");
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(adEventListener, "adEventListener");
        kotlin.jvm.internal.l.f(adCompleteListener, "adCompleteListener");
        kotlin.jvm.internal.l.f(closeVerificationController, "closeVerificationController");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        kotlin.jvm.internal.l.f(divKitActionHandlerDelegate, "divKitActionHandlerDelegate");
        C4072a3 adConfiguration = this.f35956f;
        a8<?> adResponse = this.f35951a;
        InterfaceC4105f1 adActivityListener = this.f35955e;
        int i = this.f35954d;
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adActivityListener, "adActivityListener");
        List<yd0> designCreators = (adResponse.n() == ns.f30990f ? new ks1(adConfiguration, adActivityListener, new gs1(adConfiguration, adActivityListener, i)) : new rp0(adConfiguration, adActivityListener, new qp0(adConfiguration, adActivityListener, i), new t41())).a(context, this.f35951a, nativeAdPrivate, this.f35952b, adEventListener, this.f35953c, this.f35958h, adCompleteListener, closeVerificationController, timeProviderContainer, divKitActionHandlerDelegate, w20Var, y5Var);
        zq0 zq0Var = this.f35957g;
        a8<?> adResponse2 = this.f35951a;
        tr contentCloseListener = this.f35952b;
        C4070a1 eventController = this.f35953c;
        zq0Var.getClass();
        kotlin.jvm.internal.l.f(adResponse2, "adResponse");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(eventController, "eventController");
        kotlin.jvm.internal.l.f(designCreators, "designCreators");
        ArrayList arrayList = new ArrayList(C2092m.T(designCreators, 10));
        Iterator<T> it = designCreators.iterator();
        while (it.hasNext()) {
            arrayList.add(((yd0) it.next()).a(context, adResponse2, nativeAdPrivate, contentCloseListener, adEventListener, eventController));
        }
        return new xq0<>(context, container, arrayList, new wq0(arrayList), new uq0(), new tq0());
    }

    public yq0(Context context, a8 adResponse, tr contentCloseListener, C4070a1 eventController, int i, C4188r1 adActivityListener, C4072a3 adConfiguration, zq0 layoutDesignsProvider, yv debugEventsReporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(eventController, "eventController");
        kotlin.jvm.internal.l.f(adActivityListener, "adActivityListener");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(layoutDesignsProvider, "layoutDesignsProvider");
        kotlin.jvm.internal.l.f(debugEventsReporter, "debugEventsReporter");
        this.f35951a = adResponse;
        this.f35952b = contentCloseListener;
        this.f35953c = eventController;
        this.f35954d = i;
        this.f35955e = adActivityListener;
        this.f35956f = adConfiguration;
        this.f35957g = layoutDesignsProvider;
        this.f35958h = debugEventsReporter;
    }

    public final ArrayList a(Context context, ExtendedNativeAdView extendedNativeAdView, h61 nativeAdPrivate, lt adEventListener, InterfaceC4224w2 interfaceC4224w2, es1 es1Var, rl1 progressIncrementer, C4234x5 c4234x5, ArrayList arrayList, w20 w20Var, C4199s5 c4199s5, up upVar) {
        ArrayList arrayList2;
        C4206t5 c4206t5;
        long jA;
        Context context2;
        es1 es1Var2;
        w20 w20Var2;
        C4199s5 adPod = c4199s5;
        Context context3 = context;
        kotlin.jvm.internal.l.f(context3, "context");
        ExtendedNativeAdView container = extendedNativeAdView;
        kotlin.jvm.internal.l.f(container, "container");
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(adEventListener, "adEventListener");
        InterfaceC4224w2 adCompleteListener = interfaceC4224w2;
        kotlin.jvm.internal.l.f(adCompleteListener, "adCompleteListener");
        es1 closeVerificationController = es1Var;
        kotlin.jvm.internal.l.f(closeVerificationController, "closeVerificationController");
        kotlin.jvm.internal.l.f(progressIncrementer, "progressIncrementer");
        C4234x5 divKitActionHandlerDelegate = c4234x5;
        kotlin.jvm.internal.l.f(divKitActionHandlerDelegate, "divKitActionHandlerDelegate");
        kotlin.jvm.internal.l.f(adPod, "adPod");
        up closeTimerProgressIncrementer = upVar;
        kotlin.jvm.internal.l.f(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        int i = 0;
        if (nativeAdPrivate instanceof pz1) {
            pz1 pz1Var = (pz1) nativeAdPrivate;
            List<y5> listB = adPod.b();
            ArrayList arrayListD = pz1Var.d();
            ArrayList arrayList3 = new ArrayList();
            int size = arrayListD.size();
            while (i < size) {
                y5 y5Var = (y5) C2097r.r0(i, listB);
                ArrayList arrayList4 = arrayListD;
                C4206t5 c4206t52 = new C4206t5(listB);
                ArrayList arrayList5 = arrayList3;
                if (y5Var != null) {
                    c4206t5 = c4206t52;
                    jA = y5Var.a();
                } else {
                    c4206t5 = c4206t52;
                    jA = 0;
                }
                C4227w5 c4227w5 = new C4227w5(jA);
                int i10 = size;
                C4206t5 c4206t53 = c4206t5;
                List<y5> list = listB;
                pz1 pz1Var2 = pz1Var;
                int i11 = i;
                s42 s42Var = new s42(progressIncrementer, c4206t53, c4227w5, new C4213u5(adPod, i), closeTimerProgressIncrementer);
                h61 h61Var = (h61) arrayList4.get(i11);
                y22 y22Var = new y22(adEventListener);
                if (arrayList != null) {
                    es1 es1Var3 = closeVerificationController;
                    w20Var2 = (w20) C2097r.r0(i11, arrayList);
                    context2 = context3;
                    es1Var2 = es1Var3;
                } else {
                    context2 = context3;
                    es1Var2 = closeVerificationController;
                    w20Var2 = null;
                }
                arrayList5.add(a(context2, container, h61Var, y22Var, adCompleteListener, es1Var2, s42Var, divKitActionHandlerDelegate, w20Var2, y5Var));
                i = i11 + 1;
                context3 = context;
                container = extendedNativeAdView;
                listB = list;
                adCompleteListener = interfaceC4224w2;
                closeVerificationController = es1Var;
                divKitActionHandlerDelegate = c4234x5;
                closeTimerProgressIncrementer = upVar;
                arrayList3 = arrayList5;
                arrayListD = arrayList4;
                size = i10;
                pz1Var = pz1Var2;
                adPod = c4199s5;
            }
            pz1 pz1Var3 = pz1Var;
            ArrayList arrayList6 = arrayList3;
            y5 y5Var2 = (y5) C2097r.r0(arrayListD.size(), listB);
            s42 s42Var2 = new s42(progressIncrementer, new C4206t5(listB), new C4227w5(y5Var2 != null ? y5Var2.a() : 0L), new qf1(), upVar);
            if (w20Var != null) {
                arrayList2 = arrayList6;
                xq0VarA = a(context, extendedNativeAdView, pz1Var3, adEventListener, interfaceC4224w2, es1Var, s42Var2, c4234x5, w20Var, y5Var2);
            } else {
                arrayList2 = arrayList6;
            }
            xq0<ExtendedNativeAdView> xq0Var = xq0VarA;
            if (xq0Var != null) {
                arrayList2.add(xq0Var);
            }
            return arrayList2;
        }
        List<y5> listB2 = c4199s5.b();
        ArrayList arrayList7 = new ArrayList();
        C4206t5 c4206t54 = new C4206t5(listB2);
        y5 y5Var3 = (y5) C2097r.q0(listB2);
        arrayList7.add(a(context, extendedNativeAdView, nativeAdPrivate, adEventListener, interfaceC4224w2, es1Var, new s42(progressIncrementer, c4206t54, new C4227w5(y5Var3 != null ? y5Var3.a() : 0L), new C4213u5(c4199s5, 0), upVar), c4234x5, arrayList != null ? (w20) C2097r.q0(arrayList) : null, (y5) C2097r.q0(listB2)));
        y5 y5Var4 = (y5) C2097r.r0(1, listB2);
        xq0<ExtendedNativeAdView> xq0VarA = w20Var != null ? a(context, extendedNativeAdView, nativeAdPrivate, adEventListener, interfaceC4224w2, es1Var, new s42(progressIncrementer, new C4206t5(listB2), new C4227w5(y5Var4 != null ? y5Var4.a() : 0L), new qf1()), c4234x5, w20Var, y5Var4) : null;
        if (xq0VarA != null) {
            arrayList7.add(xq0VarA);
        }
        return arrayList7;
    }
}
