package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class e0 extends c0 {

    /* renamed from: f, reason: collision with root package name */
    private final String f3994f;
    private final com.applovin.impl.sdk.ad.b g;

    /* renamed from: h, reason: collision with root package name */
    private final List f3995h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f3996i;
    private final String j;

    /* renamed from: k, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f3997k;

    /* renamed from: l, reason: collision with root package name */
    private final a f3998l;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface a {
        void a(Uri uri);
    }

    public e0(String str, com.applovin.impl.sdk.ad.b bVar, String str2, com.applovin.impl.sdk.k kVar, a aVar) {
        this(str, bVar, bVar.S(), true, str2, kVar, aVar);
    }

    private void a(Uri uri) {
        a aVar;
        if (this.f3801e.get() || (aVar = this.f3998l) == null) {
            return;
        }
        aVar.a(uri);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        if (this.f3801e.get()) {
            return Boolean.FALSE;
        }
        String strA = this.f3997k.G().a(a(), this.f3994f, this.g.getCachePrefix(), this.f3995h, this.f3996i, this.f3997k.G().a(this.f3994f, this.g), this.j, f2.a((AppLovinAdImpl) this.g));
        if (TextUtils.isEmpty(strA)) {
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f3801e.get()) {
            return Boolean.FALSE;
        }
        File fileA = this.f3997k.G().a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f3799c.b(this.f3798b, "Unable to retrieve File for cached filename = " + strA);
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f3801e.get()) {
            return Boolean.FALSE;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f3799c.b(this.f3798b, "Unable to extract Uri from file");
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f3801e.get()) {
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
        return this.f3994f.equals(((e0) obj).f3994f);
    }

    public int hashCode() {
        String str = this.f3994f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public e0(String str, com.applovin.impl.sdk.ad.b bVar, List list, boolean z3, String str2, com.applovin.impl.sdk.k kVar, a aVar) {
        super("AsyncTaskCacheResource", kVar);
        this.f3994f = str;
        this.g = bVar;
        this.f3995h = list;
        this.f3996i = z3;
        this.j = str2;
        this.f3997k = kVar;
        this.f3998l = aVar;
    }
}
