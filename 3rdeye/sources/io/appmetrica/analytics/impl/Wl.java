package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Wl extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f40358a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40359b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f40360c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f40361d;

    /* renamed from: e, reason: collision with root package name */
    public final List<String> f40362e;

    public Wl(C4552d4 c4552d4) {
        this(c4552d4.a().c(), c4552d4.a().d(), c4552d4.a().a(), c4552d4.a().h(), c4552d4.a().b());
    }

    public final boolean a(Wl wl) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Wl mergeFrom(Wl wl) {
        return new Wl((String) WrapUtils.getOrDefaultNullable(this.f40358a, wl.f40358a), (String) WrapUtils.getOrDefaultNullable(this.f40359b, wl.f40359b), (Map) WrapUtils.getOrDefaultNullable(this.f40360c, wl.f40360c), this.f40361d || wl.f40361d, wl.f40361d ? wl.f40362e : this.f40362e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return false;
    }

    public final String toString() {
        return "Arguments{distributionReferrer='" + this.f40358a + "', installReferrerSource='" + this.f40359b + "', clientClids=" + this.f40360c + ", hasNewCustomHosts=" + this.f40361d + ", newCustomHosts=" + this.f40362e + '}';
    }

    public Wl(String str, String str2, Map<String, String> map, boolean z10, List<String> list) {
        this.f40358a = str;
        this.f40359b = str2;
        this.f40360c = map;
        this.f40361d = z10;
        this.f40362e = list;
    }

    public Wl() {
        this(null, null, null, false, null);
    }
}
