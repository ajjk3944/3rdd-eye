package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.C2106a0;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class g5 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final b f19433g;

    /* renamed from: h, reason: collision with root package name */
    private final String f19434h;
    private String i;

    public interface b {
        void a(C2106a0.b bVar, String str);

        void a(String str, String str2);
    }

    public g5(com.applovin.impl.sdk.k kVar, String str, b bVar) {
        super("TaskFetchAppAdsContent", kVar);
        this.f19434h = str;
        this.f19433g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.f19434h).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || "m".equals(str)) {
                arrayList.remove(0);
            }
        }
        String strJoin = TextUtils.join(".", arrayList);
        Uri uriBuild = new Uri.Builder().scheme("https").authority(strJoin).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f21692a).c("GET").b(uriBuild.toString()).a(new Uri.Builder().scheme("http").authority(strJoin).appendPath("app-ads.txt").build().toString()).a((Object) "").a(false).a();
        this.i = uriBuild.toString();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Looking up app-ads.txt at " + this.i);
        }
        this.f21692a.q0().a(new a(aVarA, this.f21692a));
    }

    public class a extends z5 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, String str2, int i) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21694c.b(this.f21693b, "No app-ads.txt found");
                }
                g5.this.f19433g.a(C2106a0.b.APPADSTXT_NOT_FOUND, g5.this.i);
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21694c.a(this.f21693b, "Found app-ads.txt");
                }
                g5.this.f19433g.a(str2, g5.this.i);
            }
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, int i, String str2, String str3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.b(this.f21693b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i);
            }
            g5.this.f19433g.a(C2106a0.b.APPADSTXT_NOT_FOUND, g5.this.i);
        }
    }
}
