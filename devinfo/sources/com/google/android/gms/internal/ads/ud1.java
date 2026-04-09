package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ud1 {

    /* renamed from: b, reason: collision with root package name */
    public static final vl1 f17182b = vl1.a(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f17183a;

    public final Iterable a(byte[] bArr) {
        List list;
        vl1 vl1Var = f17182b;
        HashMap map = this.f17183a;
        List list2 = (List) map.get(vl1Var);
        if (bArr.length >= 5) {
            int length = bArr.length;
            list = (List) map.get(new vl1(bArr, 5 > length ? length : 5));
        } else {
            list = null;
        }
        return (list2 == null && list == null) ? new ArrayList() : list2 == null ? list : list == null ? list2 : new sd1(this, list, list2);
    }
}
