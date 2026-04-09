package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ha4 implements ca4 {
    public static final /* synthetic */ int c = 0;
    public final List a;
    public final List b;

    static {
        da4.a(Collections.EMPTY_SET);
    }

    public /* synthetic */ ha4(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public static wt2 a(int i, int i2) {
        return new wt2(i, i2);
    }

    @Override // defpackage.ga4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set d() {
        List list = this.a;
        int size = list.size();
        List list2 = this.b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((ga4) list2.get(i)).d();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object objD = ((ga4) list.get(i2)).d();
            objD.getClass();
            hashSet.add(objD);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
