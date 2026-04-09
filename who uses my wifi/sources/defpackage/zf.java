package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class zf extends zt0 {
    public static int i0(List list) {
        i30.m(list, "<this>");
        return list.size() - 1;
    }

    public static List j0(Object... objArr) {
        if (objArr.length <= 0) {
            return ns.f;
        }
        List listAsList = Arrays.asList(objArr);
        i30.l(listAsList, "asList(...)");
        return listAsList;
    }
}
