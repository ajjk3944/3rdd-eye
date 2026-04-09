package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zv3 {
    public static final v34 b = v34.a(new byte[0]);
    public final HashMap a;

    public final Iterable a(byte[] bArr) {
        List list;
        v34 v34Var = b;
        HashMap map = this.a;
        List list2 = (List) map.get(v34Var);
        if (bArr.length >= 5) {
            int length = bArr.length;
            list = (List) map.get(new v34(5 > length ? length : 5, bArr));
        } else {
            list = null;
        }
        return (list2 == null && list == null) ? new ArrayList() : list2 == null ? list : list == null ? list2 : new xv3(this, list, list2);
    }
}
