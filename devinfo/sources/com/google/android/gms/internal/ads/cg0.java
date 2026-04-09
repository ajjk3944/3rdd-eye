package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cg0 {

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f10104p = Pattern.compile("\\?");

    /* renamed from: a, reason: collision with root package name */
    public final k10 f10105a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10106b;

    /* renamed from: c, reason: collision with root package name */
    public final za.a f10107c;

    /* renamed from: d, reason: collision with root package name */
    public final hq0 f10108d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f10109e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f10110f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final bs0 f10111h;

    /* renamed from: i, reason: collision with root package name */
    public final od0 f10112i;
    public final ct0 j;

    /* renamed from: k, reason: collision with root package name */
    public final m70 f10113k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f10114l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public String f10115m;

    /* renamed from: n, reason: collision with root package name */
    public List f10116n;

    /* renamed from: o, reason: collision with root package name */
    public Bundle f10117o;

    public cg0(k10 k10Var, Context context, za.a aVar, hq0 hq0Var, ex exVar, String str, bs0 bs0Var, od0 od0Var, hl hlVar, ScheduledExecutorService scheduledExecutorService, ct0 ct0Var, m70 m70Var) {
        this.f10105a = k10Var;
        this.f10106b = context;
        this.f10107c = aVar;
        this.f10108d = hq0Var;
        this.f10109e = exVar;
        this.g = str;
        this.f10111h = bs0Var;
        this.f10112i = od0Var;
        this.f10110f = scheduledExecutorService;
        this.j = ct0Var;
        this.f10113k = m70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.m71 a(java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cg0.a(java.lang.String, java.lang.String):com.google.android.gms.internal.ads.m71");
    }

    public final void b(int i4) {
        Bundle bundle = this.f10112i.f14678e;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.W7)).booleanValue()) {
            d.h.D(ua.j.C.f35267k, bundle, d7.f(i4));
        }
    }

    public final String c(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && AppLovinMediationProvider.UNKNOWN.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.g));
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            za.i.h("Failed to update the ad types for rendering. ".concat(e2.toString()));
            return str;
        }
    }
}
