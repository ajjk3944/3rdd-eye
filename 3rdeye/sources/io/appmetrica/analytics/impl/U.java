package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final C4907qn f40213a;

    /* renamed from: b, reason: collision with root package name */
    public final List f40214b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40215c;

    public U(C4907qn c4907qn, ArrayList arrayList, String str) {
        this.f40213a = c4907qn;
        this.f40214b = arrayList == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(arrayList);
        this.f40215c = str;
    }
}
