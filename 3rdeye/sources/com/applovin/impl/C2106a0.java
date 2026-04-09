package com.applovin.impl;

import com.applovin.impl.g5;
import com.applovin.impl.i5;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.applovin.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2106a0 implements i5.b, g5.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f18910a;

    /* renamed from: b, reason: collision with root package name */
    private final a f18911b;

    /* renamed from: c, reason: collision with root package name */
    private C2155y f18912c;

    /* renamed from: d, reason: collision with root package name */
    private String f18913d;

    /* renamed from: com.applovin.impl.a0$a */
    public interface a {
        void a(b bVar, String str);

        void a(C2155y c2155y, String str);
    }

    /* renamed from: com.applovin.impl.a0$b */
    public enum b {
        APP_DETAILS_NOT_FOUND,
        INVALID_DEVELOPER_URI,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public C2106a0(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f18910a = kVar;
        this.f18911b = aVar;
    }

    public void a() {
        C2155y c2155y = this.f18912c;
        if (c2155y != null) {
            this.f18911b.a(c2155y, this.f18913d);
        } else {
            this.f18910a.q0().a(new i5(this.f18910a, this));
        }
    }

    @Override // com.applovin.impl.i5.b
    public void a(String str) {
        this.f18910a.q0().a(new g5(this.f18910a, str, this));
    }

    @Override // com.applovin.impl.i5.b
    public void a(b bVar) {
        this.f18911b.a(bVar, (String) null);
    }

    @Override // com.applovin.impl.g5.b
    public void a(String str, String str2) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        for (String str3 : str.split("\n")) {
            String strTrim = str3.split("#", 2)[0].trim();
            if (StringUtils.isValidString(strTrim)) {
                C2157z c2157z = new C2157z(strTrim, i);
                if (c2157z.h()) {
                    String strB = c2157z.b();
                    List arrayList2 = map.containsKey(strB) ? (List) map.get(strB) : new ArrayList();
                    if (arrayList2 != null) {
                        arrayList2.add(c2157z);
                        map.put(strB, arrayList2);
                    }
                } else {
                    arrayList.add(c2157z);
                }
            }
            i++;
        }
        this.f18912c = new C2155y(map, arrayList);
        this.f18913d = str2;
        this.f18910a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f18910a.O().a("AppAdsTxtService", "app-ads.txt fetched: " + this.f18912c);
        }
        this.f18911b.a(this.f18912c, str2);
    }

    @Override // com.applovin.impl.g5.b
    public void a(b bVar, String str) {
        this.f18911b.a(bVar, str);
    }
}
