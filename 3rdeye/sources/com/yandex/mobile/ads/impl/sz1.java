package com.yandex.mobile.ads.impl;

import H6.C0675l;
import N7.C1418x4;
import android.view.View;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import t6.InterfaceC5609a;

/* loaded from: classes3.dex */
public final class sz1 implements InterfaceC5609a {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f33339a;

    /* renamed from: b, reason: collision with root package name */
    private final d20 f33340b;

    /* renamed from: c, reason: collision with root package name */
    private final r70 f33341c;

    /* renamed from: d, reason: collision with root package name */
    private final s70 f33342d;

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap<N7.U3, uz1> f33343e;

    public /* synthetic */ sz1(mp1 mp1Var) {
        this(mp1Var, new d20(), new r70(), new s70());
    }

    public final void a(N7.U3 divData, pz1 sliderAdPrivate) {
        kotlin.jvm.internal.l.f(divData, "divData");
        kotlin.jvm.internal.l.f(sliderAdPrivate, "sliderAdPrivate");
        this.f33343e.put(divData, new uz1(sliderAdPrivate, this.f33339a, new d20(), new r70(), new i61(), new xg(i61.c(sliderAdPrivate))));
    }

    @Override // t6.InterfaceC5609a
    public void beforeBindView(C0675l divView, A7.d expressionResolver, View view, N7.S2 div) {
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
    }

    @Override // t6.InterfaceC5609a
    public final void bindView(C0675l div2View, A7.d expressionResolver, View view, N7.S2 divBase) {
        kotlin.jvm.internal.l.f(div2View, "div2View");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(divBase, "divBase");
        uz1 uz1Var = this.f33343e.get(div2View.getDivData());
        if (uz1Var != null) {
            uz1Var.a(div2View, view, divBase);
        }
    }

    @Override // t6.InterfaceC5609a
    public final boolean matches(N7.S2 divBase) throws JSONException {
        Integer numValueOf;
        kotlin.jvm.internal.l.f(divBase, "divBase");
        this.f33340b.getClass();
        C1418x4 c1418x4A = d20.a(divBase, "view");
        if (c1418x4A == null) {
            return false;
        }
        this.f33341c.getClass();
        String string = null;
        JSONObject jSONObject = c1418x4A.f9756b;
        if (jSONObject != null) {
            try {
                numValueOf = Integer.valueOf(jSONObject.getInt("position"));
            } catch (JSONException unused) {
            }
        } else {
            numValueOf = null;
        }
        this.f33342d.getClass();
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("view_name");
            } catch (JSONException unused2) {
            }
        }
        return numValueOf != null && "native_ad_view".equals(string);
    }

    @Override // t6.InterfaceC5609a
    public void preprocess(N7.S2 div, A7.d expressionResolver) {
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
    }

    @Override // t6.InterfaceC5609a
    public final void unbindView(C0675l div2View, A7.d expressionResolver, View view, N7.S2 divBase) {
        kotlin.jvm.internal.l.f(div2View, "div2View");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(divBase, "divBase");
        this.f33343e.get(div2View.getDivData());
    }

    public sz1(mp1 reporter, d20 divExtensionProvider, r70 extensionPositionParser, s70 extensionViewNameParser) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(divExtensionProvider, "divExtensionProvider");
        kotlin.jvm.internal.l.f(extensionPositionParser, "extensionPositionParser");
        kotlin.jvm.internal.l.f(extensionViewNameParser, "extensionViewNameParser");
        this.f33339a = reporter;
        this.f33340b = divExtensionProvider;
        this.f33341c = extensionPositionParser;
        this.f33342d = extensionViewNameParser;
        this.f33343e = new ConcurrentHashMap<>();
    }
}
