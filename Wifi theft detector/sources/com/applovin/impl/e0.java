package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public class e0 extends c0 {

    /* renamed from: f, reason: collision with root package name */
    private final String f5853f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f5854g;

    /* renamed from: h, reason: collision with root package name */
    private final List f5855h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f5856i;

    /* renamed from: j, reason: collision with root package name */
    private final String f5857j;

    /* renamed from: k, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f5858k;

    /* renamed from: l, reason: collision with root package name */
    private final a f5859l;

    public interface a {
        void a(Uri uri);
    }

    public e0(String str, com.applovin.impl.sdk.ad.b bVar, String str2, com.applovin.impl.sdk.k kVar, a aVar) {
        this(str, bVar, bVar.S(), true, str2, kVar, aVar);
    }

    private void a(Uri uri) {
        a aVar;
        if (this.f5635e.get() || (aVar = this.f5859l) == null) {
            return;
        }
        aVar.a(uri);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        if (this.f5635e.get()) {
            return Boolean.FALSE;
        }
        String strA = this.f5858k.G().a(a(), this.f5853f, this.f5854g.getCachePrefix(), this.f5855h, this.f5856i, this.f5858k.G().a(this.f5853f, this.f5854g), this.f5857j, f2.a((AppLovinAdImpl) this.f5854g));
        if (TextUtils.isEmpty(strA)) {
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f5635e.get()) {
            return Boolean.FALSE;
        }
        File fileA = this.f5858k.G().a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5633c.b(this.f5632b, "Unable to retrieve File for cached filename = " + strA);
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f5635e.get()) {
            return Boolean.FALSE;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5633c.b(this.f5632b, "Unable to extract Uri from file");
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f5635e.get()) {
            return Boolean.FALSE;
        }
        a(uriFromFile);
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f5853f.equals(((e0) obj).f5853f);
    }

    public int hashCode() {
        String str = this.f5853f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public e0(String str, com.applovin.impl.sdk.ad.b bVar, List list, boolean z10, String str2, com.applovin.impl.sdk.k kVar, a aVar) {
        super("AsyncTaskCacheResource", kVar);
        this.f5853f = str;
        this.f5854g = bVar;
        this.f5855h = list;
        this.f5856i = z10;
        this.f5857j = str2;
        this.f5858k = kVar;
        this.f5859l = aVar;
    }
}
