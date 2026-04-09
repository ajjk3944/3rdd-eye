package com.applovin.impl;

import N7.C1154e9;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.C2106a0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class i5 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final b f19536g;

    public interface b {
        void a(C2106a0.b bVar);

        void a(String str);
    }

    public i5(com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchDeveloperUri", kVar);
        this.f19536g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strValueOf = String.valueOf(this.f21692a.B().D().get("package_name"));
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Looking up developer URI for package name: ".concat(strValueOf));
        }
        this.f21692a.q0().a(new a(com.applovin.impl.sdk.network.a.a(this.f21692a).c("GET").b("https://play.google.com/store/apps/details?id=".concat(strValueOf)).a((Object) "").a(false).a(), this.f21692a));
    }

    public class a extends z5 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, String str2, int i) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21694c.b(this.f21693b, "No developer URI found - response from the Play Store is empty");
                }
                i5.this.f19536g.a(C2106a0.b.APP_DETAILS_NOT_FOUND);
                return;
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").*?(?=\">)").matcher(str2);
            if (!matcher.find()) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21694c.b(this.f21693b, "No developer URI found - unable to find the developer_url meta tag from the Play Store listing");
                }
                i5.this.f19536g.a(C2106a0.b.INVALID_DEVELOPER_URI);
                return;
            }
            String strGroup = matcher.group();
            if (!URLUtil.isValidUrl(strGroup)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21694c.b(this.f21693b, "Developer URI (" + strGroup + ") is not valid");
                }
                i5.this.f19536g.a(C2106a0.b.INVALID_DEVELOPER_URI);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                C1154e9.m("Found developer URI: ", strGroup, this.f21694c, this.f21693b);
            }
            i5.this.f19536g.a(strGroup);
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, int i, String str2, String str3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.b(this.f21693b, "Unable to fetch app details due to: " + str2 + ", and received error code: " + i);
            }
            i5.this.f19536g.a(C2106a0.b.APP_DETAILS_NOT_FOUND);
        }
    }
}
