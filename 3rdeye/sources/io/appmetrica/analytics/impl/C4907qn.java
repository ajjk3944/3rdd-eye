package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.qn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4907qn {

    /* renamed from: a, reason: collision with root package name */
    public final String f41496a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41497b;

    /* renamed from: c, reason: collision with root package name */
    public final long f41498c;

    /* renamed from: d, reason: collision with root package name */
    public final String f41499d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f41500e;

    /* renamed from: f, reason: collision with root package name */
    public final List f41501f;

    public C4907qn(String str, int i, long j4, String str2, Integer num, List list) {
        this.f41496a = str;
        this.f41497b = i;
        this.f41498c = j4;
        this.f41499d = str2;
        this.f41500e = num;
        this.f41501f = list == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(list);
    }
}
