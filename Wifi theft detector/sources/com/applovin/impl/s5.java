package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.b0;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class s5 extends i5 {

    /* renamed from: g, reason: collision with root package name */
    private final b f7556g;

    /* renamed from: h, reason: collision with root package name */
    private final String f7557h;

    /* renamed from: i, reason: collision with root package name */
    private String f7558i;

    public interface b {
        void a(b0.b bVar, String str);

        void a(String str, String str2);
    }

    public s5(com.applovin.impl.sdk.k kVar, String str, b bVar) {
        super("TaskFetchAppAdsContent", kVar);
        this.f7557h = str;
        this.f7556g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.f7557h).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || "m".equals(str)) {
                arrayList.remove(0);
            }
        }
        String strJoin = TextUtils.join(".", arrayList);
        Uri uriBuild = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority(strJoin).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f6218a).c("GET").b(uriBuild.toString()).a(new Uri.Builder().scheme("http").authority(strJoin).appendPath("app-ads.txt").build().toString()).a((Object) "").a(false).a();
        this.f7558i = uriBuild.toString();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Looking up app-ads.txt at " + this.f7558i);
        }
        this.f6218a.q0().a(new a(aVarA, this.f6218a));
    }

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, String str2, int i10) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6220c.b(this.f6219b, "No app-ads.txt found");
                }
                s5.this.f7556g.a(b0.b.APPADSTXT_NOT_FOUND, s5.this.f7558i);
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6220c.a(this.f6219b, "Found app-ads.txt");
                }
                s5.this.f7556g.a(str2, s5.this.f7558i);
            }
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, String str3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i10);
            }
            s5.this.f7556g.a(b0.b.APPADSTXT_NOT_FOUND, s5.this.f7558i);
        }
    }
}
