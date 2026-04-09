package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.h9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4660h9 {

    /* renamed from: a, reason: collision with root package name */
    public final C4608f9 f40994a;

    /* renamed from: b, reason: collision with root package name */
    public final C4634g9 f40995b;

    /* renamed from: c, reason: collision with root package name */
    public final IBinaryDataHelper f40996c;

    public C4660h9(Context context, C4759l5 c4759l5) {
        this(new C4634g9(), new C4608f9(), C4916r7.a(context).a(c4759l5));
    }

    public C4660h9(C4634g9 c4634g9, C4608f9 c4608f9, IBinaryDataHelper iBinaryDataHelper) {
        this.f40995b = c4634g9;
        this.f40994a = c4608f9;
        this.f40996c = iBinaryDataHelper;
    }
}
