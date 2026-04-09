package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.b0;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class s5 extends i5 {
    private final b g;

    /* renamed from: h, reason: collision with root package name */
    private final String f5305h;

    /* renamed from: i, reason: collision with root package name */
    private String f5306i;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface b {
        void a(b0.b bVar, String str);

        void a(String str, String str2);
    }

    public s5(com.applovin.impl.sdk.k kVar, String str, b bVar) {
        super("TaskFetchAppAdsContent", kVar);
        this.f5305h = str;
        this.g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.f5305h).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || "m".equals(str)) {
                arrayList.remove(0);
            }
        }
        String strJoin = TextUtils.join(".", arrayList);
        Uri uriBuild = new Uri.Builder().scheme("https").authority(strJoin).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f4287a).c("GET").b(uriBuild.toString()).a(new Uri.Builder().scheme("http").authority(strJoin).appendPath("app-ads.txt").build().toString()).a((Object) "").a(false).a();
        this.f5306i = uriBuild.toString();
        if (com.applovin.impl.sdk.o.a()) {
            a0.g.B(new StringBuilder("Looking up app-ads.txt at "), this.f5306i, this.f4289c, this.f4288b);
        }
        this.f4287a.q0().a(new a(aVarA, this.f4287a));
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, String str2, int i4) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4289c.b(this.f4288b, "No app-ads.txt found");
                }
                s5.this.g.a(b0.b.APPADSTXT_NOT_FOUND, s5.this.f5306i);
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4289c.a(this.f4288b, "Found app-ads.txt");
                }
                s5.this.g.a(str2, s5.this.f5306i);
            }
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i4, String str2, String str3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.b(this.f4288b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i4);
            }
            s5.this.g.a(b0.b.APPADSTXT_NOT_FOUND, s5.this.f5306i);
        }
    }
}
