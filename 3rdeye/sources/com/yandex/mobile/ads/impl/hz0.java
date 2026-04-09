package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class hz0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28418a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28419a;

        static {
            int[] iArr = new int[gz0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f28419a = iArr;
        }
    }

    public hz0(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f28418a = context;
    }

    public final String a(gz0 gz0Var) {
        int i = gz0Var == null ? -1 : a.f28419a[gz0Var.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return this.f28418a.getString(R.string.invalid_mediation_adapter_version);
        }
        throw new b9.j();
    }
}
