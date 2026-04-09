package com.applovin.impl;

import com.applovin.impl.s5;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class b0 implements u5.b, s5.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f5543a;

    /* renamed from: b, reason: collision with root package name */
    private final a f5544b;

    /* renamed from: c, reason: collision with root package name */
    private z f5545c;

    /* renamed from: d, reason: collision with root package name */
    private String f5546d;

    public interface a {
        void a(b bVar, String str);

        void a(z zVar, String str);
    }

    public enum b {
        APP_DETAILS_NOT_FOUND,
        INVALID_DEVELOPER_URI,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public b0(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f5543a = kVar;
        this.f5544b = aVar;
    }

    public void a() {
        z zVar = this.f5545c;
        if (zVar != null) {
            this.f5544b.a(zVar, this.f5546d);
        } else {
            this.f5543a.q0().a(new u5(this.f5543a, this));
        }
    }

    public static List a(z zVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            List list2 = (List) zVar.a().get(a0Var.b());
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((a0) it2.next()).a(a0Var)) {
                        break;
                    }
                }
            }
            arrayList.add(a0Var);
        }
        return arrayList;
    }

    @Override // com.applovin.impl.u5.b
    public void a(String str) {
        this.f5543a.q0().a(new s5(this.f5543a, str, this));
    }

    @Override // com.applovin.impl.u5.b
    public void a(b bVar) {
        this.f5544b.a(bVar, (String) null);
    }

    @Override // com.applovin.impl.s5.b
    public void a(String str, String str2) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        for (String str3 : str.split("\n")) {
            String strTrim = str3.split("#", 2)[0].trim();
            if (StringUtils.isValidString(strTrim)) {
                a0 a0Var = new a0(strTrim, i10);
                if (a0Var.h()) {
                    String strB = a0Var.b();
                    List arrayList2 = map.containsKey(strB) ? (List) map.get(strB) : new ArrayList();
                    if (arrayList2 != null) {
                        arrayList2.add(a0Var);
                        map.put(strB, arrayList2);
                    }
                } else {
                    arrayList.add(a0Var);
                }
            }
            i10++;
        }
        this.f5545c = new z(map, arrayList);
        this.f5546d = str2;
        this.f5543a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f5543a.O().a("AppAdsTxtService", "app-ads.txt fetched: " + this.f5545c);
        }
        this.f5544b.a(this.f5545c, str2);
    }

    @Override // com.applovin.impl.s5.b
    public void a(b bVar, String str) {
        this.f5544b.a(bVar, str);
    }
}
