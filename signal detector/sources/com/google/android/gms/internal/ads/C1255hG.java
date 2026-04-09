package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.hG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1255hG {

    /* renamed from: b, reason: collision with root package name */
    public static final C1313iK f14470b = C1313iK.a(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14471a;

    public final Iterable a(byte[] bArr) {
        List list;
        C1313iK c1313iK = f14470b;
        HashMap map = this.f14471a;
        List list2 = (List) map.get(c1313iK);
        if (bArr.length >= 5) {
            int length = bArr.length;
            list = (List) map.get(new C1313iK(bArr, 5 > length ? length : 5));
        } else {
            list = null;
        }
        return (list2 == null && list == null) ? new ArrayList() : list2 == null ? list : list == null ? list2 : new C1146fG(this, list, list2);
    }
}
