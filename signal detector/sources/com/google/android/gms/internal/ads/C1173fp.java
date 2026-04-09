package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.fp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1173fp {

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f14142p = Pattern.compile("\\?");

    /* renamed from: a, reason: collision with root package name */
    public final C0710Rh f14143a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f14144b;

    /* renamed from: c, reason: collision with root package name */
    public final C2951a f14145c;

    /* renamed from: d, reason: collision with root package name */
    public final C0960bu f14146d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f14147e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f14148f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14149g;

    /* renamed from: h, reason: collision with root package name */
    public final Xu f14150h;
    public final C0750Tn i;

    /* renamed from: j, reason: collision with root package name */
    public final C2202yv f14151j;

    /* renamed from: k, reason: collision with root package name */
    public final C0713Rk f14152k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f14153l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public String f14154m;

    /* renamed from: n, reason: collision with root package name */
    public List f14155n;

    /* renamed from: o, reason: collision with root package name */
    public Bundle f14156o;

    public C1173fp(C0710Rh c0710Rh, Context context, C2951a c2951a, C0960bu c0960bu, C0623Mf c0623Mf, String str, Xu xu, C0750Tn c0750Tn, W9 w9, ScheduledExecutorService scheduledExecutorService, C2202yv c2202yv, C0713Rk c0713Rk) {
        this.f14143a = c0710Rh;
        this.f14144b = context;
        this.f14145c = c2951a;
        this.f14146d = c0960bu;
        this.f14147e = c0623Mf;
        this.f14149g = str;
        this.f14150h = xu;
        this.i = c0750Tn;
        this.f14148f = scheduledExecutorService;
        this.f14151j = c2202yv;
        this.f14152k = c0713Rk;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.YC a(java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1173fp.a(java.lang.String, java.lang.String):com.google.android.gms.internal.ads.YC");
    }

    public final void b(int i) {
        Bundle bundle = this.i.f11461e;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.W7)).booleanValue()) {
            A.f.r(p2.j.f22785C.f22797k, bundle, AbstractC1135f5.d(i));
        }
    }

    public final String c(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f14149g));
            }
            return jSONObject.toString();
        } catch (JSONException e6) {
            u2.k.h("Failed to update the ad types for rendering. ".concat(e6.toString()));
            return str;
        }
    }
}
