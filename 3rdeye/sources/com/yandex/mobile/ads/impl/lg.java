package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lg {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f29992a;

    /* renamed from: b, reason: collision with root package name */
    private final jr0 f29993b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f29994c;

    public lg(Context context, mp1 reporter, jr0 linkJsonParser) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(linkJsonParser, "linkJsonParser");
        this.f29992a = reporter;
        this.f29993b = linkJsonParser;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f29994c = applicationContext;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final ag<?> a(JSONObject jsonAsset, qj base64EncodingParameters) throws k61, JSONException {
        mg nd1Var;
        kotlin.jvm.internal.l.f(jsonAsset, "jsonAsset");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        if (!a91.a(jsonAsset, AppMeasurementSdk.ConditionalUserProperty.NAME, "type", "clickable", "required")) {
            throw new k61("Native Ad json has not required attributes");
        }
        String strA = y81.a(jsonAsset, "jsonAsset", "type", "jsonAttribute", "type");
        if (strA == null || strA.length() == 0 || strA.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        String strOptString = jsonAsset.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (strOptString == null || strOptString.length() == 0 || strOptString.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        JSONObject jSONObjectOptJSONObject = jsonAsset.optJSONObject("link");
        ir0 ir0VarA = jSONObjectOptJSONObject == null ? null : this.f29993b.a(jSONObjectOptJSONObject, base64EncodingParameters);
        Context context = this.f29994c;
        mp1 reporter = this.f29992a;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        if (strOptString.equals("close_button")) {
            nd1Var = new op();
        } else {
            if (!strOptString.equals("feedback")) {
                switch (strA.hashCode()) {
                    case -1034364087:
                        if (strA.equals("number")) {
                            nd1Var = new nd1(new lr1());
                            break;
                        }
                        break;
                    case -891985903:
                        if (strA.equals("string")) {
                            nd1Var = new u22();
                            break;
                        }
                        break;
                    case -410956671:
                        if (strA.equals("container")) {
                            nd1Var = new a50();
                            break;
                        }
                        break;
                    case 100313435:
                        if (strA.equals("image")) {
                            nd1Var = new mj0();
                            break;
                        }
                        break;
                    case 103772132:
                        if (strA.equals("media")) {
                            nd1Var = new tw0(context, reporter, base64EncodingParameters, new cw0(c92.a(base64EncodingParameters.b())), new le2(context, reporter, base64EncodingParameters), new bj0(), new pj0());
                            break;
                        }
                        break;
                }
                fp0.b(new Object[0]);
                throw new k61("Native Ad json has not required attributes");
            }
            nd1Var = new wa0(new mj0());
        }
        return new ag<>(strOptString, strA, nd1Var.a(jsonAsset), ir0VarA, jsonAsset.getBoolean("clickable"), jsonAsset.getBoolean("required"));
    }
}
