package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class dg extends cg {
    public static void l0(List list, Comparator comparator) {
        i30.m(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
