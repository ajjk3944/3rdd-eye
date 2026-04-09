package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class p8 {

    /* renamed from: a, reason: collision with root package name */
    private final zf1 f31630a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f31631b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f31632c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f31633d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31634e;

    /* renamed from: f, reason: collision with root package name */
    private final String f31635f;

    /* renamed from: g, reason: collision with root package name */
    private final String f31636g;

    /* renamed from: h, reason: collision with root package name */
    private final q8 f31637h;

    private p8(zf1 zf1Var, String str, List list) {
        q8 q8Var = q8.f32095d;
        ArrayList arrayList = new ArrayList();
        this.f31632c = arrayList;
        this.f31633d = new HashMap();
        this.f31630a = zf1Var;
        this.f31631b = null;
        this.f31634e = str;
        this.f31637h = q8Var;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ra2 ra2Var = (ra2) it.next();
                this.f31633d.put(UUID.randomUUID().toString(), ra2Var);
            }
        }
        this.f31636g = null;
        this.f31635f = null;
    }

    public static p8 a(zf1 zf1Var, String str, List list) {
        if (list != null) {
            return new p8(zf1Var, str, list);
        }
        throw new IllegalArgumentException("VerificationScriptResources is null");
    }

    public final String b() {
        return this.f31636g;
    }

    public final String c() {
        return this.f31635f;
    }

    public final Map<String, ra2> d() {
        return Collections.unmodifiableMap(this.f31633d);
    }

    public final String e() {
        return this.f31634e;
    }

    public final zf1 f() {
        return this.f31630a;
    }

    public final List<ra2> g() {
        return Collections.unmodifiableList(this.f31632c);
    }

    public final WebView h() {
        return this.f31631b;
    }

    public final q8 a() {
        return this.f31637h;
    }
}
