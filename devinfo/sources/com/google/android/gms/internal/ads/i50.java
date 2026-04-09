package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i50 {

    /* renamed from: a, reason: collision with root package name */
    public static final i41 f12141a = new i41();

    static {
        v41 v41Var = x41.f18307b;
        new i50(u51.f17096e);
        String str = bq0.f9768a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public i50(u51 u51Var) {
        v41 v41Var = x41.f18307b;
        Object[] array = (u51Var == null ? mq0.i(u51Var.listIterator(0)) : u51Var).toArray();
        int length = array.length;
        yo0.m(array, length);
        Arrays.sort(array, f12141a);
        x41.s(array, length);
    }
}
